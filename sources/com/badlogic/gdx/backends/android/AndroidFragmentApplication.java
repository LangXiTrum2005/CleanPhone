package com.badlogic.gdx.backends.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
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
import com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy;
import com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Clipboard;
import com.badlogic.gdx.utils.GdxNativesLoader;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.SnapshotArray;

/* JADX INFO: loaded from: classes.dex */
public class AndroidFragmentApplication extends Fragment implements AndroidApplicationBase {
    protected ApplicationLogger applicationLogger;
    protected AndroidAudio audio;
    protected Callbacks callbacks;
    protected AndroidClipboard clipboard;
    protected AndroidFiles files;
    protected AndroidGraphics graphics;
    public Handler handler;
    protected AndroidInput input;
    protected ApplicationListener listener;
    protected AndroidNet net;
    protected boolean firstResume = true;
    protected final Array<Runnable> runnables = new Array<>();
    protected final Array<Runnable> executedRunnables = new Array<>();
    protected final SnapshotArray<LifecycleListener> lifecycleListeners = new SnapshotArray<>(LifecycleListener.class);
    private final Array<AndroidEventListener> androidEventListeners = new Array<>();
    protected int logLevel = 2;

    public interface Callbacks {
        void exit();
    }

    private boolean isAnyParentFragmentRemoving() {
        for (Fragment parentFragment = getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment.isRemoving()) {
                return true;
            }
        }
        return false;
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
        return new DefaultAndroidFiles(getResources().getAssets(), getActivity(), true);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public AndroidInput createInput(Application application, Context context, Object obj, AndroidApplicationConfiguration androidApplicationConfiguration) {
        return new DefaultAndroidInput(this, getActivity(), this.graphics.view, androidApplicationConfiguration);
    }

    public FrameLayout.LayoutParams createLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public void createWakeLock(boolean z) {
        if (z) {
            getActivity().getWindow().addFlags(128);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2) {
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2) {
    }

    @Override // com.badlogic.gdx.Application
    public void exit() {
        this.handler.post(new Runnable() { // from class: com.badlogic.gdx.backends.android.AndroidFragmentApplication.2
            @Override // java.lang.Runnable
            public void run() {
                AndroidFragmentApplication.this.callbacks.exit();
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
        return getActivity().getWindow();
    }

    @Override // com.badlogic.gdx.Application
    public Audio getAudio() {
        return this.audio;
    }

    @Override // com.badlogic.gdx.Application
    public Clipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.fragment.app.Fragment, com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Context getContext() {
        return getActivity();
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
        return new AndroidPreferences(getActivity().getSharedPreferences(str, 0));
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

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public WindowManager getWindowManager() {
        return (WindowManager) getContext().getSystemService("window");
    }

    public View initializeForView(ApplicationListener applicationListener) {
        return initializeForView(applicationListener, new AndroidApplicationConfiguration());
    }

    @Override // com.badlogic.gdx.Application
    public void log(String str, String str2) {
    }

    @Override // androidx.fragment.app.Fragment
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        if (activity instanceof Callbacks) {
            this.callbacks = (Callbacks) activity;
        } else if (getParentFragment() instanceof Callbacks) {
            this.callbacks = (Callbacks) getParentFragment();
        } else {
            if (!(getTargetFragment() instanceof Callbacks)) {
                throw new RuntimeException("Missing AndroidFragmentApplication.Callbacks. Please implement AndroidFragmentApplication.Callbacks on the parent activity, fragment or target fragment.");
            }
            this.callbacks = (Callbacks) getTargetFragment();
        }
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.input.setKeyboardAvailable(configuration.hardKeyboardHidden == 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.callbacks = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        boolean zIsContinuousRendering = this.graphics.isContinuousRendering();
        boolean z = AndroidGraphics.enforceContinuousRendering;
        AndroidGraphics.enforceContinuousRendering = true;
        this.graphics.setContinuousRendering(true);
        this.graphics.pause();
        this.input.onPause();
        if (isRemoving() || isAnyParentFragmentRemoving() || getActivity().isFinishing()) {
            this.graphics.clearManagedCaches();
            this.graphics.destroy();
        }
        AndroidGraphics.enforceContinuousRendering = z;
        this.graphics.setContinuousRendering(zIsContinuousRendering);
        this.graphics.onPauseGLSurfaceView();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
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
        super.onResume();
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

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void runOnUiThread(Runnable runnable) {
        getActivity().runOnUiThread(runnable);
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
            this.graphics.getView().setSystemUiVisibility(5894);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2, Throwable th) {
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2, Throwable th) {
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public AndroidInput getInput() {
        return this.input;
    }

    @Override // com.badlogic.gdx.Application
    public void log(String str, String str2, Throwable th) {
    }

    public View initializeForView(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration) {
        if (getVersion() >= 19) {
            GdxNativesLoader.load();
            setApplicationLogger(new AndroidApplicationLogger());
            ResolutionStrategy fillResolutionStrategy = androidApplicationConfiguration.resolutionStrategy;
            if (fillResolutionStrategy == null) {
                fillResolutionStrategy = new FillResolutionStrategy();
            }
            this.graphics = new AndroidGraphics(this, androidApplicationConfiguration, fillResolutionStrategy);
            this.input = createInput(this, getActivity(), this.graphics.view, androidApplicationConfiguration);
            this.audio = createAudio(getActivity(), androidApplicationConfiguration);
            this.files = createFiles();
            this.net = new AndroidNet(this, androidApplicationConfiguration);
            this.listener = applicationListener;
            this.handler = new Handler();
            this.clipboard = new AndroidClipboard(getActivity());
            addLifecycleListener(new LifecycleListener() { // from class: com.badlogic.gdx.backends.android.AndroidFragmentApplication.1
                @Override // com.badlogic.gdx.LifecycleListener
                public void dispose() {
                    AndroidFragmentApplication.this.audio.dispose();
                }

                @Override // com.badlogic.gdx.LifecycleListener
                public void pause() {
                    AndroidFragmentApplication.this.audio.pause();
                }

                @Override // com.badlogic.gdx.LifecycleListener
                public void resume() {
                    AndroidFragmentApplication.this.audio.resume();
                }
            });
            Gdx.app = this;
            Gdx.input = getInput();
            Gdx.audio = getAudio();
            Gdx.files = getFiles();
            Gdx.graphics = getGraphics();
            Gdx.net = getNet();
            createWakeLock(androidApplicationConfiguration.useWakelock);
            useImmersiveMode(androidApplicationConfiguration.useImmersiveMode);
            if (androidApplicationConfiguration.useImmersiveMode) {
                new AndroidVisibilityListener().createListener(this);
            }
            if (getResources().getConfiguration().keyboard != 1) {
                this.input.setKeyboardAvailable(true);
            }
            return this.graphics.getView();
        }
        throw new GdxRuntimeException("libGDX requires Android API Level 19 or later.");
    }
}
