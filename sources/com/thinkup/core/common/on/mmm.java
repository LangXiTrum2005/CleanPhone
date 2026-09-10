package com.thinkup.core.common.on;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mmm {
    public int m0;
    public m mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42198n;
    public TUAdxBidFloorInfo n0;
    public final om no;
    public String o;
    public com.thinkup.core.common.n.n o0;
    private Context o00;
    private TUAdRequest o0m;
    private WeakReference<Activity> o0o;
    public TUAdMultipleLoadedListener om;
    public Map<String, Object> on;
    public com.thinkup.core.common.nm oo;
    public int m = -1;
    public long nm = 0;
    public long nn = 0;
    public boolean mm = false;
    public long mn = SystemClock.elapsedRealtime();

    public mmm() {
        om omVar = new om();
        this.no = omVar;
        omVar.o(System.currentTimeMillis());
    }

    private long m0() {
        return this.nn;
    }

    private int om() {
        return this.f42198n;
    }

    private long on() {
        return this.nm;
    }

    public final TUAdRequest m() {
        return this.o0m;
    }

    public final mmm n() {
        mmm mmmVar = new mmm();
        mmmVar.o00 = this.o00;
        mmmVar.o0o = this.o0o;
        mmmVar.f42198n = this.f42198n;
        mmmVar.o0 = this.o0;
        mmmVar.oo = this.oo;
        mmmVar.on = this.on;
        mmmVar.m0 = this.m0;
        mmmVar.o0m = this.o0m;
        return mmmVar;
    }

    public final void o(Context context) {
        this.o00 = com.thinkup.core.common.n.o0n.m().on();
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        this.o0o = new WeakReference<>(activity);
        com.thinkup.core.common.n.o0n.m().o(activity);
    }

    public final boolean o0() {
        int i2 = this.f42198n;
        return i2 == 13 || i2 == 14;
    }

    public final boolean oo() {
        int i2 = this.f42198n;
        return (i2 == 9 || i2 == 13 || i2 == 14) ? false : true;
    }

    private void m(long j) {
        this.nn = j;
    }

    public final Context o() {
        Activity activity;
        WeakReference<Activity> weakReference = this.o0o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity;
        }
        Activity activityMmo = com.thinkup.core.common.n.o0n.m().mmo();
        return activityMmo != null ? activityMmo : this.o00;
    }

    public final void o(TUAdRequest tUAdRequest) {
        this.o0m = tUAdRequest;
    }

    private void o(long j) {
        this.nm = j;
    }
}
