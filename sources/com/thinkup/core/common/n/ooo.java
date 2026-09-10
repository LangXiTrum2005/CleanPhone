package com.thinkup.core.common.n;

import android.app.Activity;
import android.os.Looper;
import com.thinkup.core.common.on.o0mm;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ooo {
    boolean isRefresh;
    protected WeakReference<Activity> mActivityRef;
    private o0mm mUnitGroupInfo;

    public final o0mm getUnitGroupInfo() {
        return this.mUnitGroupInfo;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public final void postOnMainThread(Runnable runnable) {
        o0n.m().m(runnable);
    }

    public final void postOnMainThreadDelayed(Runnable runnable, long j) {
        o0n.m().o(runnable, j);
    }

    public final void refreshActivityContext(Activity activity) {
        this.mActivityRef = new WeakReference<>(activity);
    }

    public final void runOnNetworkRequestThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.thinkup.core.common.ooo.m.m.o().m(runnable);
        } else {
            runnable.run();
        }
    }

    public final void setRefresh(boolean z2) {
        this.isRefresh = z2;
    }

    public final void setUnitGroupInfo(o0mm o0mmVar) {
        this.mUnitGroupInfo = o0mmVar;
    }
}
