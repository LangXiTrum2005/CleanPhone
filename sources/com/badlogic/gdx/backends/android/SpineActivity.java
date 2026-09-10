package com.badlogic.gdx.backends.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.ApplicationLogger;
import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.LifecycleListener;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.backends.android.keyboardheight.AndroidXKeyboardHeightProvider;
import com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider;
import com.badlogic.gdx.backends.android.keyboardheight.StandardKeyboardHeightProvider;
import com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy;
import com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20;
import com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Clipboard;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.SnapshotArray;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ExecutorC4433qn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC2928Zc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public abstract class SpineActivity<VB extends ViewBinding> extends BaseSyncActivity<VB> implements AndroidApplicationBase {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SpineActivity";
    private ApplicationLogger applicationLogger;
    private AndroidAudio audio;
    private AndroidClipboard clipboard;
    private AndroidApplicationConfiguration config;
    private AndroidFiles files;
    private SpineGraphics graphics;
    private Handler handler;
    private AndroidInput input;
    private boolean isWaitingForAudio;
    private KeyboardHeightProvider keyboardHeightProvider;
    private ApplicationListener listener;
    private AndroidNet net;
    private boolean renderUnderCutout;
    private boolean useImmersiveMode;
    private final Array<Runnable> runnables = new Array<>();
    private final Array<Runnable> executedRunnables = new Array<>();
    private final SnapshotArray<LifecycleListener> lifecycleListeners = new SnapshotArray<>(LifecycleListener.class);
    private final Array<AndroidEventListener> androidEventListeners = new Array<>();
    private boolean firstResume = true;
    private int logLevel = 2;
    private int wasFocusChanged = -1;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.SpineActivity$init$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineActivity", f = "SpineActivity.kt", l = {Input.Keys.NUMPAD_1, Input.Keys.NUMPAD_4}, m = "init")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SpineActivity<VB> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpineActivity<VB> spineActivity, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = spineActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.init(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.SpineActivity$init$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineActivity$init$2", f = "SpineActivity.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ AndroidApplicationConfiguration $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AndroidApplicationConfiguration androidApplicationConfiguration, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$config = androidApplicationConfiguration;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(this.$config, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            this.$config.nativeLoader.load();
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.SpineActivity$initializeForView$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineActivity", f = "SpineActivity.kt", l = {132}, m = "initializeForView")
    public static final class C03342 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SpineActivity<VB> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03342(SpineActivity<VB> spineActivity, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = spineActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initializeForView(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.SpineActivity$updateConfig$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineActivity", f = "SpineActivity.kt", l = {Input.Keys.F24, 197}, m = "updateConfig")
    public static final class C03351 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SpineActivity<VB> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03351(SpineActivity<VB> spineActivity, InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
            this.this$0 = spineActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateConfig(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.SpineActivity$updateConfig$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineActivity$updateConfig$2", f = "SpineActivity.kt", l = {}, m = "invokeSuspend")
    public static final class C03362 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ AndroidApplicationConfiguration $config;
        int label;
        final /* synthetic */ SpineActivity<VB> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03362(SpineActivity<VB> spineActivity, AndroidApplicationConfiguration androidApplicationConfiguration, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.this$0 = spineActivity;
            this.$config = androidApplicationConfiguration;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C03362(this.this$0, this.$config, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C03362) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            SpineActivity<VB> spineActivity = this.this$0;
            return spineActivity.createAudio(spineActivity, this.$config);
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.backends.android.SpineActivity$updateConfig$3, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineActivity$updateConfig$3", f = "SpineActivity.kt", l = {}, m = "invokeSuspend")
    public static final class C03373 extends Ea0 implements InterfaceC3567gx {
        int label;
        final /* synthetic */ SpineActivity<VB> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03373(SpineActivity<VB> spineActivity, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.this$0 = spineActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C03373(this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C03373) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return this.this$0.createFiles();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exit$lambda$2(SpineActivity spineActivity) {
        AbstractC2995aW.q(spineActivity, "this$0");
        spineActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object init(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        boolean z2;
        AndroidApplicationConfiguration androidApplicationConfiguration2;
        SpineActivity<VB> spineActivity;
        AndroidApplicationConfiguration androidApplicationConfiguration3;
        KeyboardHeightProvider standardKeyboardHeightProvider;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, interfaceC2857Wj);
        }
        Object obj = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z3 = anonymousClass1.Z$0;
                AndroidApplicationConfiguration androidApplicationConfiguration4 = (AndroidApplicationConfiguration) anonymousClass1.L$2;
                applicationListener = (ApplicationListener) anonymousClass1.L$1;
                SpineActivity<VB> spineActivity2 = (SpineActivity) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
                z2 = z3;
                androidApplicationConfiguration2 = androidApplicationConfiguration4;
                spineActivity = spineActivity2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidApplicationConfiguration3 = (AndroidApplicationConfiguration) anonymousClass1.L$1;
                spineActivity = (SpineActivity) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            }
            spineActivity.addLifecycleListener(new LifecycleListener(spineActivity) { // from class: com.badlogic.gdx.backends.android.SpineActivity.init.3
                final /* synthetic */ SpineActivity<VB> this$0;

                {
                    this.this$0 = spineActivity;
                }

                @Override // com.badlogic.gdx.LifecycleListener
                public void dispose() {
                    AndroidAudio androidAudio = ((SpineActivity) this.this$0).audio;
                    if (androidAudio != null) {
                        androidAudio.dispose();
                    }
                }

                @Override // com.badlogic.gdx.LifecycleListener
                public void pause() {
                    AndroidAudio androidAudio = ((SpineActivity) this.this$0).audio;
                    if (androidAudio != null) {
                        androidAudio.pause();
                    }
                }

                @Override // com.badlogic.gdx.LifecycleListener
                public void resume() {
                }
            });
            spineActivity.createWakeLock(androidApplicationConfiguration3.useWakelock);
            spineActivity.useImmersiveMode(spineActivity.useImmersiveMode);
            if (spineActivity.useImmersiveMode) {
                new AndroidVisibilityListener().createListener(spineActivity);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                standardKeyboardHeightProvider = new AndroidXKeyboardHeightProvider(spineActivity);
            } else {
                standardKeyboardHeightProvider = new StandardKeyboardHeightProvider(spineActivity);
            }
            spineActivity.keyboardHeightProvider = standardKeyboardHeightProvider;
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        if (getVersion() < 19) {
            throw new GdxRuntimeException("libGDX requires Android API Level 19 or later.");
        }
        this.config = androidApplicationConfiguration;
        ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(androidApplicationConfiguration, null);
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = applicationListener;
        anonymousClass1.L$2 = androidApplicationConfiguration;
        anonymousClass1.Z$0 = z;
        anonymousClass1.label = 1;
        if (WD.X(anonymousClass2, executorC4433qn, anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        z2 = z;
        androidApplicationConfiguration2 = androidApplicationConfiguration;
        spineActivity = this;
        spineActivity.setApplicationLogger(new AndroidApplicationLogger());
        anonymousClass1.L$0 = spineActivity;
        anonymousClass1.L$1 = androidApplicationConfiguration2;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        if (spineActivity.updateConfig(applicationListener, androidApplicationConfiguration2, z2, anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        androidApplicationConfiguration3 = androidApplicationConfiguration2;
        spineActivity.addLifecycleListener(new LifecycleListener(spineActivity) { // from class: com.badlogic.gdx.backends.android.SpineActivity.init.3
            final /* synthetic */ SpineActivity<VB> this$0;

            {
                this.this$0 = spineActivity;
            }

            @Override // com.badlogic.gdx.LifecycleListener
            public void dispose() {
                AndroidAudio androidAudio = ((SpineActivity) this.this$0).audio;
                if (androidAudio != null) {
                    androidAudio.dispose();
                }
            }

            @Override // com.badlogic.gdx.LifecycleListener
            public void pause() {
                AndroidAudio androidAudio = ((SpineActivity) this.this$0).audio;
                if (androidAudio != null) {
                    androidAudio.pause();
                }
            }

            @Override // com.badlogic.gdx.LifecycleListener
            public void resume() {
            }
        });
        spineActivity.createWakeLock(androidApplicationConfiguration3.useWakelock);
        spineActivity.useImmersiveMode(spineActivity.useImmersiveMode);
        if (spineActivity.useImmersiveMode) {
            new AndroidVisibilityListener().createListener(spineActivity);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            standardKeyboardHeightProvider = new AndroidXKeyboardHeightProvider(spineActivity);
        } else {
            standardKeyboardHeightProvider = new StandardKeyboardHeightProvider(spineActivity);
        }
        spineActivity.keyboardHeightProvider = standardKeyboardHeightProvider;
        return C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0() {
    }

    @TargetApi(28)
    private final void setLayoutInDisplayCutoutMode(boolean z) {
        if (!z || getVersion() < 28) {
            return;
        }
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
    }

    public static /* synthetic */ Object updateConfig$default(SpineActivity spineActivity, ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration, boolean z, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateConfig");
        }
        if ((i & 1) != 0) {
            applicationListener = spineActivity.listener;
        }
        if ((i & 2) != 0) {
            androidApplicationConfiguration = spineActivity.config;
            AbstractC2995aW.n(androidApplicationConfiguration);
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return spineActivity.updateConfig(applicationListener, androidApplicationConfiguration, z, interfaceC2857Wj);
    }

    public final void addAndroidEventListener(AndroidEventListener androidEventListener) {
        AbstractC2995aW.q(androidEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.androidEventListeners) {
            this.androidEventListeners.add(androidEventListener);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void addLifecycleListener(LifecycleListener lifecycleListener) {
        AbstractC2995aW.q(lifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.lifecycleListeners) {
            this.lifecycleListeners.add(lifecycleListener);
        }
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public AndroidAudio createAudio(Context context, AndroidApplicationConfiguration androidApplicationConfiguration) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(androidApplicationConfiguration, "config");
        return !androidApplicationConfiguration.disableAudio ? new DefaultAndroidAudio(context, androidApplicationConfiguration) : new DisabledAndroidAudio();
    }

    public final AndroidFiles createFiles() {
        getFilesDir();
        return new DefaultAndroidFiles(getAssets(), this, true);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public AndroidInput createInput(Application application, Context context, Object obj, AndroidApplicationConfiguration androidApplicationConfiguration) {
        AbstractC2995aW.q(application, "activity");
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(obj, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(androidApplicationConfiguration, "config");
        SpineGraphics spineGraphics = this.graphics;
        AbstractC2995aW.n(spineGraphics);
        return new DefaultAndroidInput(this, this, spineGraphics.view, androidApplicationConfiguration);
    }

    public final FrameLayout.LayoutParams createLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public final void createWakeLock(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        try {
            if (this.logLevel >= 3) {
                getApplicationLogger().debug(str, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        try {
            if (this.logLevel >= 1) {
                getApplicationLogger().error(str, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.badlogic.gdx.Application
    public void exit() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new RunnableC2928Zc(this, 4));
        }
    }

    @Override // com.badlogic.gdx.Application
    public ApplicationListener getApplicationListener() {
        return this.listener;
    }

    @Override // com.badlogic.gdx.Application
    public ApplicationLogger getApplicationLogger() {
        ApplicationLogger applicationLogger = this.applicationLogger;
        AbstractC2995aW.n(applicationLogger);
        return applicationLogger;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Window getApplicationWindow() {
        Window window = getWindow();
        AbstractC2995aW.p(window, "getWindow(...)");
        return window;
    }

    @Override // com.badlogic.gdx.Application
    public Audio getAudio() {
        return this.audio;
    }

    @Override // com.badlogic.gdx.Application
    public Clipboard getClipboard() {
        AndroidClipboard androidClipboard = this.clipboard;
        AbstractC2995aW.n(androidClipboard);
        return androidClipboard;
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

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public Handler getHandler() {
        Handler handler = this.handler;
        AbstractC2995aW.n(handler);
        return handler;
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
        AbstractC2995aW.q(str, "name");
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

    public final Object initialize(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration, InterfaceC2857Wj interfaceC2857Wj) {
        Object objInit = init(applicationListener, androidApplicationConfiguration, false, interfaceC2857Wj);
        return objInit == EnumC4602sk.f4993a ? objInit : C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object initializeForView(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration, InterfaceC2857Wj interfaceC2857Wj) {
        C03342 c03342;
        SpineActivity<VB> spineActivity;
        if (interfaceC2857Wj instanceof C03342) {
            c03342 = (C03342) interfaceC2857Wj;
            int i = c03342.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03342.label = i - Integer.MIN_VALUE;
            } else {
                c03342 = new C03342(this, interfaceC2857Wj);
            }
        } else {
            c03342 = new C03342(this, interfaceC2857Wj);
        }
        Object obj = c03342.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c03342.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            c03342.L$0 = this;
            c03342.label = 1;
            if (init(applicationListener, androidApplicationConfiguration, true, c03342) == enumC4602sk) {
                return enumC4602sk;
            }
            spineActivity = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spineActivity = (SpineActivity) c03342.L$0;
            AbstractC3375el.b0(obj);
        }
        SpineGraphics spineGraphics = spineActivity.graphics;
        AbstractC2995aW.n(spineGraphics);
        View view = spineGraphics.getView();
        AbstractC2995aW.p(view, "getView(...)");
        return view;
    }

    @Override // com.badlogic.gdx.Application
    public void log(String str, String str2) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        try {
            if (this.logLevel >= 2) {
                getApplicationLogger().log(str, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.androidEventListeners) {
            int i3 = this.androidEventListeners.size;
            for (int i4 = 0; i4 < i3; i4++) {
                this.androidEventListeners.get(i4).onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC2995aW.q(configuration, "config");
        super.onConfigurationChanged(configuration);
        boolean z = configuration.hardKeyboardHidden == 1;
        AndroidInput androidInput = this.input;
        if (androidInput != null) {
            androidInput.setKeyboardAvailable(z);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        KeyboardHeightProvider keyboardHeightProvider = this.keyboardHeightProvider;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.close();
        }
        SpineGraphics spineGraphics = this.graphics;
        if (spineGraphics != null) {
            spineGraphics.clearManagedCaches();
        }
        SpineGraphics spineGraphics2 = this.graphics;
        if (spineGraphics2 != null) {
            spineGraphics2.destroy();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        try {
            SpineGraphics spineGraphics = this.graphics;
            boolean zIsContinuousRendering = spineGraphics != null ? spineGraphics.isContinuousRendering() : false;
            boolean z = SpineGraphics.enforceContinuousRendering;
            SpineGraphics.enforceContinuousRendering = true;
            SpineGraphics spineGraphics2 = this.graphics;
            if (spineGraphics2 != null) {
                spineGraphics2.setContinuousRendering(true);
            }
            SpineGraphics spineGraphics3 = this.graphics;
            if (spineGraphics3 != null) {
                spineGraphics3.pause();
            }
            AndroidInput androidInput = this.input;
            if (androidInput != null) {
                androidInput.onPause();
            }
            if (isFinishing()) {
                SpineGraphics spineGraphics4 = this.graphics;
                if (spineGraphics4 != null) {
                    spineGraphics4.clearManagedCaches();
                }
                SpineGraphics spineGraphics5 = this.graphics;
                if (spineGraphics5 != null) {
                    spineGraphics5.destroy();
                }
            }
            SpineGraphics.enforceContinuousRendering = z;
            SpineGraphics spineGraphics6 = this.graphics;
            if (spineGraphics6 != null) {
                spineGraphics6.setContinuousRendering(zIsContinuousRendering);
            }
            SpineGraphics spineGraphics7 = this.graphics;
            if (spineGraphics7 != null) {
                spineGraphics7.onPauseGLSurfaceView();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.keyboardHeightProvider;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.setKeyboardHeightObserver(null);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        SpineGraphics graphics;
        View view;
        KeyboardHeightProvider keyboardHeightProvider;
        Gdx.app = this;
        Gdx.input = getInput();
        Gdx.audio = getAudio();
        Gdx.files = getFiles();
        Gdx.graphics = getGraphics();
        Gdx.net = getNet();
        AndroidInput androidInput = this.input;
        if (androidInput != null) {
            androidInput.onResume();
        }
        SpineGraphics spineGraphics = this.graphics;
        if (spineGraphics != null) {
            spineGraphics.onResumeGLSurfaceView();
        }
        int i = 0;
        if (this.firstResume) {
            this.firstResume = false;
        } else {
            SpineGraphics spineGraphics2 = this.graphics;
            if (spineGraphics2 != null) {
                spineGraphics2.resume();
            }
        }
        this.isWaitingForAudio = true;
        int i2 = this.wasFocusChanged;
        if (i2 == 1 || i2 == -1) {
            AndroidAudio androidAudio = this.audio;
            if (androidAudio != null) {
                androidAudio.resume();
            }
            this.isWaitingForAudio = false;
        }
        super.onResume();
        Input input = Gdx.input;
        if ((input instanceof DefaultAndroidInput) && (keyboardHeightProvider = this.keyboardHeightProvider) != null) {
            AbstractC2995aW.o(input, "null cannot be cast to non-null type com.badlogic.gdx.backends.android.DefaultAndroidInput");
            keyboardHeightProvider.setKeyboardHeightObserver((DefaultAndroidInput) input);
        }
        if (getGraphics() == null || (graphics = getGraphics()) == null || (view = graphics.getView()) == null) {
            return;
        }
        view.post(new B80(i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        useImmersiveMode(this.useImmersiveMode);
        if (!z) {
            this.wasFocusChanged = 0;
            return;
        }
        this.wasFocusChanged = 1;
        if (this.isWaitingForAudio) {
            AndroidAudio androidAudio = this.audio;
            if (androidAudio != null) {
                androidAudio.resume();
            }
            this.isWaitingForAudio = false;
        }
    }

    @Override // com.badlogic.gdx.Application
    public void postRunnable(Runnable runnable) {
        AbstractC2995aW.q(runnable, "runnable");
        synchronized (this.runnables) {
            this.runnables.add(runnable);
            Graphics graphics = Gdx.graphics;
            if (graphics != null) {
                graphics.requestRendering();
            }
        }
    }

    public final void removeAndroidEventListener(AndroidEventListener androidEventListener) {
        AbstractC2995aW.q(androidEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.androidEventListeners) {
            this.androidEventListeners.removeValue(androidEventListener, true);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void removeLifecycleListener(LifecycleListener lifecycleListener) {
        AbstractC2995aW.q(lifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.lifecycleListeners) {
            this.lifecycleListeners.removeValue(lifecycleListener, true);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void setApplicationLogger(ApplicationLogger applicationLogger) {
        AbstractC2995aW.q(applicationLogger, "applicationLogger");
        this.applicationLogger = applicationLogger;
    }

    @Override // com.badlogic.gdx.Application
    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public final Object updateConfig(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration, InterfaceC2857Wj interfaceC2857Wj) {
        return updateConfig$default(this, applicationListener, androidApplicationConfiguration, false, interfaceC2857Wj, 4, null);
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase
    public void useImmersiveMode(boolean z) {
        if (z) {
            View decorView = getWindow().getDecorView();
            AbstractC2995aW.p(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(5894);
        }
    }

    @Override // com.badlogic.gdx.Application
    public SpineGraphics getGraphics() {
        return this.graphics;
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplicationBase, com.badlogic.gdx.Application
    public AndroidInput getInput() {
        return this.input;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateConfig(ApplicationListener applicationListener, AndroidApplicationConfiguration androidApplicationConfiguration, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        C03351 c03351;
        ApplicationListener applicationListener2;
        Object obj;
        SpineActivity<VB> spineActivity;
        boolean z2;
        AndroidApplicationConfiguration androidApplicationConfiguration2;
        SpineActivity<VB> spineActivity2;
        SpineActivity<VB> spineActivity3;
        ApplicationListener applicationListener3;
        boolean z3;
        AndroidInput androidInput;
        if (interfaceC2857Wj instanceof C03351) {
            c03351 = (C03351) interfaceC2857Wj;
            int i = c03351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03351.label = i - Integer.MIN_VALUE;
            } else {
                c03351 = new C03351(this, interfaceC2857Wj);
            }
        } else {
            c03351 = new C03351(this, interfaceC2857Wj);
        }
        Object obj2 = c03351.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c03351.label;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = c03351.Z$0;
                spineActivity = (SpineActivity) c03351.L$3;
                AndroidApplicationConfiguration androidApplicationConfiguration3 = (AndroidApplicationConfiguration) c03351.L$2;
                applicationListener2 = (ApplicationListener) c03351.L$1;
                SpineActivity<VB> spineActivity4 = (SpineActivity) c03351.L$0;
                AbstractC3375el.b0(obj2);
                androidApplicationConfiguration2 = androidApplicationConfiguration3;
                spineActivity2 = spineActivity4;
                obj = obj2;
                z2 = z4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = c03351.Z$0;
                spineActivity2 = (SpineActivity) c03351.L$3;
                androidApplicationConfiguration2 = (AndroidApplicationConfiguration) c03351.L$2;
                applicationListener3 = (ApplicationListener) c03351.L$1;
                spineActivity3 = (SpineActivity) c03351.L$0;
                AbstractC3375el.b0(obj2);
            }
            spineActivity2.files = (AndroidFiles) obj2;
            spineActivity3.net = new AndroidNet(spineActivity3, androidApplicationConfiguration2);
            spineActivity3.listener = applicationListener3;
            spineActivity3.handler = new Handler();
            spineActivity3.useImmersiveMode = androidApplicationConfiguration2.useImmersiveMode;
            spineActivity3.clipboard = new AndroidClipboard(spineActivity3);
            spineActivity3.renderUnderCutout = androidApplicationConfiguration2.renderUnderCutout;
            Gdx.app = spineActivity3;
            Gdx.input = spineActivity3.getInput();
            Gdx.audio = spineActivity3.getAudio();
            Gdx.files = spineActivity3.getFiles();
            Gdx.graphics = spineActivity3.getGraphics();
            Gdx.net = spineActivity3.getNet();
            spineActivity3.getTAG();
            if (!z3) {
                try {
                    spineActivity3.requestWindowFeature(1);
                } catch (Exception e) {
                    spineActivity3.log("AndroidApplication", "Content already displayed, cannot request FEATURE_NO_TITLE", e);
                }
                spineActivity3.getWindow().setFlags(1024, 1024);
                spineActivity3.getWindow().clearFlags(2048);
                SpineGraphics spineGraphics = spineActivity3.graphics;
                AbstractC2995aW.n(spineGraphics);
                spineActivity3.setContentView(spineGraphics.getView(), spineActivity3.createLayoutParams());
            }
            if (spineActivity3.getResources().getConfiguration().keyboard != 1 && (androidInput = spineActivity3.input) != null) {
                androidInput.setKeyboardAvailable(true);
            }
            spineActivity3.setLayoutInDisplayCutoutMode(spineActivity3.renderUnderCutout);
            SpineGraphics spineGraphics2 = spineActivity3.graphics;
            AbstractC2995aW.n(spineGraphics2);
            View view = spineGraphics2.getView();
            AbstractC2995aW.p(view, "getView(...)");
            return view;
        }
        AbstractC3375el.b0(obj2);
        SpineGraphics spineGraphics3 = this.graphics;
        if (spineGraphics3 != null) {
            spineGraphics3.destroy();
        }
        ResolutionStrategy fillResolutionStrategy = androidApplicationConfiguration.resolutionStrategy;
        if (fillResolutionStrategy == null) {
            fillResolutionStrategy = new FillResolutionStrategy();
        }
        SpineGraphics spineGraphics4 = new SpineGraphics(this, androidApplicationConfiguration, fillResolutionStrategy);
        this.graphics = spineGraphics4;
        GLSurfaceView20 gLSurfaceView20 = spineGraphics4.view;
        AbstractC2995aW.p(gLSurfaceView20, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.input = createInput(this, this, gLSurfaceView20, androidApplicationConfiguration);
        ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
        C03362 c03362 = new C03362(this, androidApplicationConfiguration, null);
        c03351.L$0 = this;
        c03351.L$1 = applicationListener;
        c03351.L$2 = androidApplicationConfiguration;
        c03351.L$3 = this;
        c03351.Z$0 = z;
        c03351.label = 1;
        Object objX = WD.X(c03362, executorC4433qn, c03351);
        if (objX == enumC4602sk) {
            return enumC4602sk;
        }
        applicationListener2 = applicationListener;
        obj = objX;
        spineActivity = this;
        z2 = z;
        androidApplicationConfiguration2 = androidApplicationConfiguration;
        spineActivity2 = spineActivity;
        spineActivity.audio = (AndroidAudio) obj;
        ExecutorC4433qn executorC4433qn2 = AbstractC4437qp.b;
        C03373 c03373 = new C03373(spineActivity2, null);
        c03351.L$0 = spineActivity2;
        c03351.L$1 = applicationListener2;
        c03351.L$2 = androidApplicationConfiguration2;
        c03351.L$3 = spineActivity2;
        c03351.Z$0 = z2;
        c03351.label = 2;
        Object objX2 = WD.X(c03373, executorC4433qn2, c03351);
        if (objX2 == enumC4602sk) {
            return enumC4602sk;
        }
        spineActivity3 = spineActivity2;
        applicationListener3 = applicationListener2;
        boolean z5 = z2;
        obj2 = objX2;
        z3 = z5;
        spineActivity2.files = (AndroidFiles) obj2;
        spineActivity3.net = new AndroidNet(spineActivity3, androidApplicationConfiguration2);
        spineActivity3.listener = applicationListener3;
        spineActivity3.handler = new Handler();
        spineActivity3.useImmersiveMode = androidApplicationConfiguration2.useImmersiveMode;
        spineActivity3.clipboard = new AndroidClipboard(spineActivity3);
        spineActivity3.renderUnderCutout = androidApplicationConfiguration2.renderUnderCutout;
        Gdx.app = spineActivity3;
        Gdx.input = spineActivity3.getInput();
        Gdx.audio = spineActivity3.getAudio();
        Gdx.files = spineActivity3.getFiles();
        Gdx.graphics = spineActivity3.getGraphics();
        Gdx.net = spineActivity3.getNet();
        spineActivity3.getTAG();
        if (!z3) {
            spineActivity3.requestWindowFeature(1);
            spineActivity3.getWindow().setFlags(1024, 1024);
            spineActivity3.getWindow().clearFlags(2048);
            SpineGraphics spineGraphics5 = spineActivity3.graphics;
            AbstractC2995aW.n(spineGraphics5);
            spineActivity3.setContentView(spineGraphics5.getView(), spineActivity3.createLayoutParams());
        }
        if (spineActivity3.getResources().getConfiguration().keyboard != 1) {
            androidInput.setKeyboardAvailable(true);
        }
        spineActivity3.setLayoutInDisplayCutoutMode(spineActivity3.renderUnderCutout);
        SpineGraphics spineGraphics6 = spineActivity3.graphics;
        AbstractC2995aW.n(spineGraphics6);
        View view2 = spineGraphics6.getView();
        AbstractC2995aW.p(view2, "getView(...)");
        return view2;
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2, Throwable th) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(th, "exception");
        try {
            if (this.logLevel >= 3) {
                getApplicationLogger().debug(str, str2, th);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2, Throwable th) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(th, "exception");
        try {
            if (this.logLevel >= 1) {
                getApplicationLogger().error(str, str2, th);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final Object initialize(ApplicationListener applicationListener, InterfaceC2857Wj interfaceC2857Wj) {
        Object objInitialize = initialize(applicationListener, new AndroidApplicationConfiguration(), interfaceC2857Wj);
        return objInitialize == EnumC4602sk.f4993a ? objInitialize : C5033xf0.f5238a;
    }

    @Override // com.badlogic.gdx.Application
    public void log(String str, String str2, Throwable th) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(th, "exception");
        try {
            if (this.logLevel >= 2) {
                getApplicationLogger().log(str, str2, th);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final Object initializeForView(ApplicationListener applicationListener, InterfaceC2857Wj interfaceC2857Wj) {
        return initializeForView(applicationListener, new AndroidApplicationConfiguration(), interfaceC2857Wj);
    }

    public final Object updateConfig(ApplicationListener applicationListener, InterfaceC2857Wj interfaceC2857Wj) {
        return updateConfig$default(this, applicationListener, null, false, interfaceC2857Wj, 6, null);
    }

    public final Object updateConfig(InterfaceC2857Wj interfaceC2857Wj) {
        return updateConfig$default(this, null, null, false, interfaceC2857Wj, 7, null);
    }
}
