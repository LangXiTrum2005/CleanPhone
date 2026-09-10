package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.inmobi.media.core.config.models.CrashConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements Application.ActivityLifecycleCallbacks {
    public static long ik = 0;
    public static long lr = 0;
    public static boolean ri = false;
    private volatile WeakReference<Activity> bgr;
    private final ka jbs;
    private final ka mj;
    private final AtomicBoolean ka = new AtomicBoolean(false);
    private final RunnableC0279ri fi = new RunnableC0279ri();
    private final di di = new di();
    private final fi xha = new fi();
    private int qt = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.ri>> sf = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private HandlerThread f18174co = null;
    private Handler aw = null;
    private final LinkedList<Activity> vr = new LinkedList<>();

    public class di implements Runnable {
        public di() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.vr.lr().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.nr.ri();
        }
    }

    public class fi implements Runnable {
        public fi() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerLr = com.bytedance.sdk.openadsdk.core.vr.lr();
                Message messageObtain = Message.obtain(handlerLr, ri.this.fi);
                messageObtain.what = 1001;
                handlerLr.sendMessageDelayed(messageObtain, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            }
        }
    }

    public static class ik extends ka {
        private ik() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.ri.ka, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.fi.ri();
        }
    }

    public static class ka implements Runnable {
        private ka() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.ka.ri.qt qtVarPu = com.bytedance.sdk.openadsdk.core.settings.sf.lr().pu();
            if (qtVarPu == null || qtVarPu.ri() || !com.bytedance.sdk.component.utils.nr.mj(com.bytedance.sdk.openadsdk.core.nr.ri())) {
                return;
            }
            com.bytedance.sdk.openadsdk.ka.ri.lr.ri(com.bytedance.sdk.openadsdk.core.aw.ri(com.bytedance.sdk.openadsdk.core.nr.ri()));
        }
    }

    public static class lr extends ka {
        private lr() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.ri.ka, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.di.lr.ri().lr();
            com.bytedance.sdk.openadsdk.utils.fi.lr();
            com.bytedance.sdk.openadsdk.component.xha.ri.ri(3);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$ri, reason: collision with other inner class name */
    public static class RunnableC0279ri implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public class xha implements Runnable {
        private long ik;
        private boolean ka;
        private long lr;

        public xha(long j, long j2, boolean z) {
            this.lr = j;
            this.ik = j2;
            this.ka = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ka) {
                com.bytedance.sdk.openadsdk.slm.ka.ri().ri(this.lr / 1000, this.ik / 1000);
            }
        }
    }

    public ri() {
        this.mj = new lr();
        this.jbs = new ik();
        ik();
    }

    private void ik() {
        this.f18174co = com.bytedance.sdk.component.utils.mj.ri("lifecycle", 10);
        this.aw = new Handler(this.f18174co.getLooper());
    }

    public boolean lr(com.bytedance.sdk.component.adexpress.ri riVar) {
        return this.sf.remove(new WeakReference(riVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.vr.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.sf != null && this.sf.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.ri> weakReference : this.sf) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().ri(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.bgr != null && this.bgr.get() == activity) {
            this.bgr = null;
        }
        this.vr.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.qt - 1;
        this.qt = i;
        if (i < 0) {
            this.qt = 0;
        }
        if (ApmHelper.isIsInit()) {
            ri(this.xha);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ri(this.di);
        if (!ri) {
            lr = System.currentTimeMillis();
            ri = true;
        }
        this.bgr = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (qd.lr() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ri.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (qd.ka(activity)) {
                                qd.ri(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                } else if (qd.ka(activity)) {
                    qd.ri(true);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ri("TTAD.ActivityLifecycle", th);
        }
        this.qt++;
        if (this.ka.get()) {
            this.aw.removeCallbacks(this.jbs);
            this.aw.removeCallbacks(this.mj);
            ri(this.jbs);
        }
        this.ka.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.qt <= 0) {
            this.ka.set(true);
        }
        if (ri()) {
            ri = false;
            com.bytedance.sdk.openadsdk.core.vr.lr.set(false);
            ik = System.currentTimeMillis();
            this.aw.removeCallbacks(this.jbs);
            this.aw.removeCallbacks(this.mj);
            ri(this.mj);
        }
        ri(new xha(lr, ik, ri()));
    }

    private void ri(Runnable runnable) {
        if (!this.f18174co.isAlive()) {
            ik();
        }
        this.aw.postDelayed(runnable, 1000L);
    }

    public Activity lr() {
        if (this.vr.isEmpty()) {
            return null;
        }
        return this.vr.getFirst();
    }

    public void ri(com.bytedance.sdk.component.adexpress.ri riVar) {
        this.sf.add(new WeakReference<>(riVar));
    }

    public boolean ri() {
        return this.ka.get();
    }

    public boolean ri(boolean z) {
        Window window;
        if (this.bgr == null) {
            return z;
        }
        try {
            Activity activity = this.bgr.get();
            if (activity != null && (window = activity.getWindow()) != null) {
                return window.getDecorView().hasWindowFocus();
            }
            return z;
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
