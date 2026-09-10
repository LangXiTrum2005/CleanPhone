package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements Application.ActivityLifecycleCallbacks {
    public static long LD = 0;
    public static boolean Lxb = false;
    public static long lk;
    private volatile WeakReference<Activity> NXR;
    private final AtomicBoolean ZU = new AtomicBoolean(false);
    private final RunnableC0119Lxb JXs = new RunnableC0119Lxb();
    private final ZU lc = new ZU();
    private final lk ebl = new lk();
    private final LD OY = new LD();
    private int QAg = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.Lxb>> nBu = new CopyOnWriteArrayList<>();
    private HandlerThread JVA = null;
    private Handler sLN = null;
    private final LinkedList<Activity> STP = new LinkedList<>();

    public class JXs implements Runnable {
        private long LD;
        private boolean ZU;
        private long lk;

        public JXs(long j, long j2, boolean z) {
            this.LD = j;
            this.lk = j2;
            this.ZU = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ZU) {
                com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(this.LD / 1000, this.lk / 1000);
            }
            Lxb.this.ZU();
        }
    }

    public static class LD implements Runnable {
        private LD() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().LD();
            com.bytedance.sdk.openadsdk.ZU.Lxb.STP stpWCT = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().wCT();
            if (stpWCT == null || stpWCT.Lxb() || !com.bytedance.sdk.component.utils.IeN.OY(com.bytedance.sdk.openadsdk.core.kqm.Lxb())) {
                return;
            }
            com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.Lxb$Lxb, reason: collision with other inner class name */
    public static class RunnableC0119Lxb implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            hg.lk(new com.bytedance.sdk.component.OY.OY("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.Lxb.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public class ZU implements Runnable {
        public ZU() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.STP.LD().removeMessages(1001);
            if (com.bytedance.sdk.openadsdk.core.kqm.Lxb() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.nBu.Lxb.LD();
        }
    }

    public class lk implements Runnable {
        public lk() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerLD = com.bytedance.sdk.openadsdk.core.STP.LD();
                Message messageObtain = Message.obtain(handlerLD, Lxb.this.JXs);
                messageObtain.what = 1001;
                handlerLD.sendMessageDelayed(messageObtain, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            }
        }
    }

    public Lxb() {
        lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.Lxb();
    }

    private void lk() {
        HandlerThread handlerThread = new HandlerThread("lifecycle", 10);
        this.JVA = handlerThread;
        handlerThread.start();
        this.sLN = new Handler(this.JVA.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        Window window;
        this.STP.addFirst(activity);
        if (!le.LD() || (window = activity.getWindow()) == null) {
            return;
        }
        final View decorView = window.getDecorView();
        decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.Lxb.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view) {
                decorView.removeOnAttachStateChangeListener(this);
                if (le.ZU(activity)) {
                    le.Lxb(true);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view) {
                decorView.removeOnAttachStateChangeListener(this);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.nBu != null && this.nBu.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.Lxb> weakReference : this.nBu) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().Lxb(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.NXR != null && this.NXR.get() == activity) {
            this.NXR = null;
        }
        this.STP.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.QAg - 1;
        this.QAg = i;
        if (i < 0) {
            this.QAg = 0;
        }
        if (ApmHelper.isIsInit()) {
            Lxb(this.ebl);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Lxb(this.lc);
        if (!Lxb) {
            LD = System.currentTimeMillis();
            Lxb = true;
        }
        this.NXR = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.QAg++;
        this.sLN.removeCallbacks(this.OY);
        if (this.ZU.get()) {
            Lxb(this.OY);
        }
        this.ZU.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.QAg <= 0) {
            this.ZU.set(true);
        }
        if (Lxb()) {
            Lxb = false;
            com.bytedance.sdk.openadsdk.core.STP.LD.set(false);
            lk = System.currentTimeMillis();
            Lxb(this.OY);
        }
        Lxb(new JXs(LD, lk, Lxb()));
    }

    private void Lxb(Runnable runnable) {
        if (!this.JVA.isAlive()) {
            lk();
        }
        this.sLN.postDelayed(runnable, 1000L);
    }

    public boolean LD(com.bytedance.sdk.component.adexpress.Lxb lxb) {
        return this.nBu.remove(new WeakReference(lxb));
    }

    public Activity LD() {
        if (this.STP.isEmpty()) {
            return null;
        }
        return this.STP.getFirst();
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.Lxb lxb) {
        this.nBu.add(new WeakReference<>(lxb));
    }

    public boolean Lxb() {
        return this.ZU.get();
    }

    public boolean Lxb(boolean z) {
        Activity activity;
        Window window;
        return (this.NXR == null || (activity = this.NXR.get()) == null || (window = activity.getWindow()) == null) ? z : window.getDecorView().hasWindowFocus();
    }
}
