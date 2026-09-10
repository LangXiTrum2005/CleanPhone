package com.badlogic.gdx.backends.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.ApplicationLogger;
import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.LifecycleListener;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.backends.android.keyboardheight.AndroidXKeyboardHeightProvider;
import com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider;
import com.badlogic.gdx.backends.android.keyboardheight.StandardKeyboardHeightProvider;
import com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy;
import com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Clipboard;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.SnapshotArray;

/* JADX INFO: loaded from: classes.dex */
public class AndroidApplication extends Activity implements AndroidApplicationBase {
    protected ApplicationLogger applicationLogger;
    protected AndroidAudio audio;
    protected AndroidClipboard clipboard;
    protected AndroidFiles files;
    protected AndroidGraphics graphics;
    public Handler handler;
    protected AndroidInput input;
    private KeyboardHeightProvider keyboardHeightProvider;
    protected ApplicationListener listener;
    protected AndroidNet net;
    protected boolean firstResume = true;
    protected final Array<Runnable> runnables = new Array<>();
    protected final Array<Runnable> executedRunnables = new Array<>();
    protected final SnapshotArray<LifecycleListener> lifecycleListeners = new SnapshotArray<>(LifecycleListener.class);
    private final Array<AndroidEventListener> androidEventListeners = new Array<>();
    protected int logLevel = 2;
    protected boolean useImmersiveMode = false;
    private int wasFocusChanged = -1;
    private boolean isWaitingForAudio = false;
    protected boolean renderUnderCutout = false;

    private void init(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration, boolean z) {
        if (getVersion() < 19) {
            throw new GdxRuntimeException("libGDX requires Android API Level 19 or later.");
        }
        androidApplicationConfiguration.nativeLoader.load();
        setApplicationLogger(new AndroidApplicationLogger());
        ResolutionStrategy fillResolutionStrategy = androidApplicationConfiguration.resolutionStrategy;
        if (fillResolutionStrategy == null) {
            fillResolutionStrategy = new FillResolutionStrategy();
        }
        AndroidGraphics androidGraphics = new AndroidGraphics(this, androidApplicationConfiguration, fillResolutionStrategy);
        this.graphics = androidGraphics;
        this.input = createInput(this, this, androidGraphics.view, androidApplicationConfiguration);
        this.audio = createAudio(this, androidApplicationConfiguration);
        this.files = createFiles();
        this.net = new AndroidNet(this, androidApplicationConfiguration);
        this.listener = applicationListener;
        this.handler = new Handler();
        this.useImmersiveMode = androidApplicationConfiguration.useImmersiveMode;
        this.clipboard = new AndroidClipboard(this);
        this.renderUnderCutout = androidApplicationConfiguration.renderUnderCutout;
        addLifecycleListener(new LifecycleListener() { // from class: com.badlogic.gdx.backends.android.AndroidApplication.1
            @Override // com.badlogic.gdx.LifecycleListener
            public void dispose() {
                AndroidApplication.this.audio.dispose();
            }

            @Override // com.badlogic.gdx.LifecycleListener
            public void pause() {
                AndroidApplication.this.audio.pause();
            }

            @Override // com.badlogic.gdx.LifecycleListener
            public void resume() {
            }
        });
        Gdx.app = this;
        Gdx.input = getInput();
        Gdx.audio = getAudio();
        Gdx.files = getFiles();
        Gdx.graphics = getGraphics();
        Gdx.net = getNet();
        if (!z) {
            try {
                requestWindowFeature(1);
            } catch (Exception e) {
                log("AndroidApplication", "Content already displayed, cannot request FEATURE_NO_TITLE", e);
            }
            getWindow().setFlags(1024, 1024);
            getWindow().clearFlags(2048);
            setContentView(this.graphics.getView(), createLayoutParams());
        }
        createWakeLock(androidApplicationConfiguration.useWakelock);
        useImmersiveMode(this.useImmersiveMode);
        if (this.useImmersiveMode) {
            new AndroidVisibilityListener().createListener(this);
        }
        if (getResources().getConfiguration().keyboard != 1) {
            this.input.setKeyboardAvailable(true);
        }
        setLayoutInDisplayCutoutMode(this.renderUnderCutout);
        if (Build.VERSION.SDK_INT >= 30) {
            this.keyboardHeightProvider = new AndroidXKeyboardHeightProvider(this);
        } else {
            this.keyboardHeightProvider = new StandardKeyboardHeightProvider(this);
        }
    }

    @TargetApi(28)
    private void setLayoutInDisplayCutoutMode(boolean z) {
        if (!z || getVersion() < 28) {
            return;
        }
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
    }

    public void addAndroidEventListener(AndroidEventListener androidEventListener) {
        synchronized (this.androidEventListeners) {
            this.androidEventListeners.add(androidEventListener);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void addLifecycleListener(LifecycleListener lifecycleListener) {
        synchronized (this.lifecycleListeners) {
            this.lifecycleListeners.add(lifecycleListener);
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public AndroidAudio createAudio(Context context, AndroidApplicationConfiguration androidApplicationConfiguration) {
        return !androidApplicationConfiguration.disableAudio ? new DefaultAndroidAudio(context, androidApplicationConfiguration) : new DisabledAndroidAudio();
    }

    public AndroidFiles createFiles() {
        getFilesDir();
        return new DefaultAndroidFiles(getAssets(), this, true);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public AndroidInput createInput(Application application, Context context, Object obj, AndroidApplicationConfiguration androidApplicationConfiguration) {
        return new DefaultAndroidInput(this, this, this.graphics.view, androidApplicationConfiguration);
    }

    public FrameLayout.LayoutParams createLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public void createWakeLock(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2) {
        if (this.logLevel >= 3) {
            getApplicationLogger().debug(str, str2);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2) {
        if (this.logLevel >= 1) {
            getApplicationLogger().error(str, str2);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void exit() {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidApplication.3
            @Override // java.lang.Runnable
            public void run() {
                AndroidApplication.this.finish();
            }
        });
    }

    @Override // com.badlogic.gdx.Application
    public ApplicationListener getApplicationListener() {
        return this.listener;
    }

    @Override // com.badlogic.gdx.Application
    public ApplicationLogger getApplicationLogger() {
        return this.applicationLogger;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Window getApplicationWindow() {
        return getWindow();
    }

    @Override // com.badlogic.gdx.Application
    public Audio getAudio() {
        return this.audio;
    }

    @Override // com.badlogic.gdx.Application
    public Clipboard getClipboard() {
        return this.clipboard;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Context getContext() {
        return this;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Array<Runnable> getExecutedRunnables() {
        return this.executedRunnables;
    }

    @Override // com.badlogic.gdx.Application
    public Files getFiles() {
        return this.files;
    }

    @Override // com.badlogic.gdx.Application
    public Graphics getGraphics() {
        return this.graphics;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Handler getHandler() {
        return this.handler;
    }

    @Override // com.badlogic.gdx.Application
    public long getJavaHeap() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public KeyboardHeightProvider getKeyboardHeightProvider() {
        return this.keyboardHeightProvider;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public SnapshotArray<LifecycleListener> getLifecycleListeners() {
        return this.lifecycleListeners;
    }

    @Override // com.badlogic.gdx.Application
    public int getLogLevel() {
        return this.logLevel;
    }

    @Override // com.badlogic.gdx.Application
    public long getNativeHeap() {
        return Debug.getNativeHeapAllocatedSize();
    }

    @Override // com.badlogic.gdx.Application
    public Net getNet() {
        return this.net;
    }

    @Override // com.badlogic.gdx.Application
    public Preferences getPreferences(String str) {
        return new AndroidPreferences(getSharedPreferences(str, 0));
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Array<Runnable> getRunnables() {
        return this.runnables;
    }

    @Override // com.badlogic.gdx.Application
    public Application.ApplicationType getType() {
        return Application.ApplicationType.Android;
    }

    @Override // com.badlogic.gdx.Application
    public int getVersion() {
        return Build.VERSION.SDK_INT;
    }

    public void initialize(ApplicationListener applicationListener) {
        initialize(applicationListener, new AndroidApplicationConfiguration());
    }

    public View initializeForView(ApplicationListener applicationListener) {
        return initializeForView(applicationListener, new AndroidApplicationConfiguration());
    }

    @Override // com.badlogic.gdx.Application
    public void log(String str, String str2) {
        if (this.logLevel >= 2) {
            getApplicationLogger().log(str, str2);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.androidEventListeners) {
            int i3 = 0;
            while (true) {
                try {
                    Array<AndroidEventListener> array = this.androidEventListeners;
                    if (i3 < array.size) {
                        array.get(i3).onActivityResult(i, i2, intent);
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.input.setKeyboardAvailable(configuration.hardKeyboardHidden == 1);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.keyboardHeightProvider.close();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        boolean zIsContinuousRendering = this.graphics.isContinuousRendering();
        boolean z = AndroidGraphics.enforceContinuousRendering;
        AndroidGraphics.enforceContinuousRendering = true;
        this.graphics.setContinuousRendering(true);
        this.graphics.pause();
        this.input.onPause();
        if (isFinishing()) {
            this.graphics.clearManagedCaches();
            this.graphics.destroy();
        }
        AndroidGraphics.enforceContinuousRendering = z;
        this.graphics.setContinuousRendering(zIsContinuousRendering);
        this.graphics.onPauseGLSurfaceView();
        super.onPause();
        this.keyboardHeightProvider.setKeyboardHeightObserver(null);
    }

    @Override // android.app.Activity
    public void onResume() {
        Gdx.app = this;
        Gdx.input = getInput();
        Gdx.audio = getAudio();
        Gdx.files = getFiles();
        Gdx.graphics = getGraphics();
        Gdx.net = getNet();
        this.input.onResume();
        AndroidGraphics androidGraphics = this.graphics;
        if (androidGraphics != null) {
            androidGraphics.onResumeGLSurfaceView();
        }
        if (this.firstResume) {
            this.firstResume = false;
        } else {
            this.graphics.resume();
        }
        this.isWaitingForAudio = true;
        int i = this.wasFocusChanged;
        if (i == 1 || i == -1) {
            this.audio.resume();
            this.isWaitingForAudio = false;
        }
        super.onResume();
        this.keyboardHeightProvider.setKeyboardHeightObserver((DefaultAndroidInput) Gdx.input);
        ((AndroidGraphics) getGraphics()).getView().post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidApplication.2
            @Override // java.lang.Runnable
            public void run() {
                AndroidApplication.this.keyboardHeightProvider.start();
            }
        });
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        useImmersiveMode(this.useImmersiveMode);
        if (!z) {
            this.wasFocusChanged = 0;
            return;
        }
        this.wasFocusChanged = 1;
        if (this.isWaitingForAudio) {
            this.audio.resume();
            this.isWaitingForAudio = false;
        }
    }

    @Override // com.badlogic.gdx.Application
    public void postRunnable(Runnable runnable) {
        synchronized (this.runnables) {
            this.runnables.add(runnable);
            Gdx.graphics.requestRendering();
        }
    }

    public void removeAndroidEventListener(AndroidEventListener androidEventListener) {
        synchronized (this.androidEventListeners) {
            this.androidEventListeners.removeValue(androidEventListener, true);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void removeLifecycleListener(LifecycleListener lifecycleListener) {
        synchronized (this.lifecycleListeners) {
            this.lifecycleListeners.removeValue(lifecycleListener, true);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void setApplicationLogger(ApplicationLogger applicationLogger) {
        this.applicationLogger = applicationLogger;
    }

    @Override // com.badlogic.gdx.Application
    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void useImmersiveMode(boolean z) {
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2, Throwable th) {
        if (this.logLevel >= 3) {
            getApplicationLogger().debug(str, str2, th);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2, Throwable th) {
        if (this.logLevel >= 1) {
            getApplicationLogger().error(str, str2, th);
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public AndroidInput getInput() {
        return this.input;
    }

    @Override // com.badlogic.gdx.Application
    public void log(String str, String str2, Throwable th) {
        if (this.logLevel >= 2) {
            getApplicationLogger().log(str, str2, th);
        }
    }

    public void initialize(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration) {
        init(applicationListener, androidApplicationConfiguration, false);
    }

    public View initializeForView(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration) {
        init(applicationListener, androidApplicationConfiguration, true);
        return this.graphics.getView();
    }
}
