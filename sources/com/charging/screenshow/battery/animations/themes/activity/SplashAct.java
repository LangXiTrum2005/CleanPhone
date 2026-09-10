package com.charging.screenshow.battery.animations.themes.activity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.zg.adlib.util.MagicAdUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/SplashAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "MHandler", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SplashAct extends BaseAct {
    public static final /* synthetic */ int q0 = 0;
    public final MHandler h0 = new MHandler(new WeakReference(this));
    public final AtomicInteger i0 = new AtomicInteger(0);
    public final AtomicBoolean j0 = new AtomicBoolean(false);
    public final AtomicBoolean k0 = new AtomicBoolean(false);
    public final AtomicInteger l0 = new AtomicInteger(0);
    public final AtomicBoolean m0 = new AtomicBoolean(false);
    public final AtomicBoolean n0 = new AtomicBoolean(false);
    public final AtomicBoolean o0 = new AtomicBoolean(false);
    public final AtomicBoolean p0 = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/SplashAct$Companion;", "", "", "MSG_PROGRESS", "I", "MSG_LOAD_INST", "MSG_SHOW_INST", "MSG_CHECK_JUMP", "MSG_JUMP_MAIN", "MAX_COUNT", "", "DELAY", "J", "MAX_INST_RETRY_COUNT", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/SplashAct$MHandler;", "Landroid/os/Handler;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f13038a;

        public MHandler(WeakReference weakReference) {
            super(Looper.getMainLooper());
            this.f13038a = weakReference;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            Intrinsics.f(msg, "msg");
            super.handleMessage(msg);
            final SplashAct splashAct = (SplashAct) this.f13038a.get();
            if (splashAct == null || splashAct.isDestroyed()) {
                return;
            }
            int i2 = msg.what;
            MHandler mHandler = splashAct.h0;
            switch (i2) {
                case 11:
                    if (!splashAct.p0.get() && !splashAct.k0.get()) {
                        if (MagicAdUtil.getInstance(AppExt.a()).canShowAd()) {
                            sendEmptyMessage(14);
                        } else if (splashAct.l0.get() < 3) {
                            AtomicInteger atomicInteger = splashAct.i0;
                            if (atomicInteger.get() >= 16) {
                                sendEmptyMessage(16);
                            } else if (!splashAct.o0.get()) {
                                atomicInteger.incrementAndGet();
                                sendEmptyMessageDelayed(11, 500L);
                            } else {
                                sendEmptyMessage(16);
                            }
                        } else {
                            sendEmptyMessage(16);
                        }
                    }
                    break;
                case 12:
                    if (!MagicAdUtil.getInstance(AppExt.a()).canShowAd()) {
                        splashAct.j0.get();
                        break;
                    }
                    break;
                case 14:
                    if (!MagicAdUtil.getInstance(AppExt.a()).canShowAd()) {
                        mHandler.sendEmptyMessage(16);
                    } else {
                        MagicAdUtil.getInstance(AppExt.a()).showInstAd(splashAct, new MagicAdUtil.MAdActionListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.SplashAct$showInstAd$1
                            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
                            public final void click() {
                                splashAct.n0.set(true);
                            }

                            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
                            public final void close() {
                                SplashAct splashAct2 = splashAct;
                                splashAct2.o0.set(true);
                                if (!splashAct2.n0.get()) {
                                    splashAct2.h0.sendEmptyMessage(16);
                                } else {
                                    Object obj = ReturnAppManager.Z;
                                    ReturnAppManager.e0 = true;
                                }
                            }

                            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
                            public final void show() {
                                splashAct.k0.set(true);
                            }

                            @Override // com.zg.adlib.util.MagicAdUtil.MAdActionListener
                            public final void showError() {
                                splashAct.h0.sendEmptyMessage(16);
                            }
                        });
                    }
                    break;
                case 16:
                    removeMessages(11);
                    removeMessages(16);
                    removeMessages(12);
                    removeMessages(14);
                    AtomicBoolean atomicBoolean = splashAct.m0;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        if (!splashAct.isFinishing()) {
                            mHandler.sendEmptyMessage(17);
                            break;
                        }
                    }
                    break;
                case 17:
                    removeMessages(11);
                    removeMessages(16);
                    removeMessages(12);
                    removeMessages(14);
                    if (!splashAct.isFinishing()) {
                        AppExt.b(new androidx.room.c(splashAct, 3));
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_splash, (ViewGroup) null, false);
        if (viewInflate != null) {
            return (FrameLayout) viewInflate;
        }
        throw new NullPointerException("rootView");
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        return null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        getWindow().addFlags(1024);
        getWindow().getDecorView().setSystemUiVisibility(6);
        this.h0.sendEmptyMessage(11);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.p0.set(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AtomicBoolean atomicBoolean = this.p0;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            boolean z2 = this.o0.get();
            MHandler mHandler = this.h0;
            if (z2) {
                mHandler.sendEmptyMessage(16);
            } else {
                mHandler.sendEmptyMessage(11);
            }
        }
        this.n0.set(false);
    }
}
