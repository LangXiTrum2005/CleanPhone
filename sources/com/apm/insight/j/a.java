package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f10147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f10148b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10149c;

    public a(Handler handler, long j) {
        this.f10147a = handler;
        this.f10149c = j;
    }

    public final void a() {
        this.f10147a.post(this);
    }

    public final long b() {
        return this.f10149c;
    }

    public final void a(long j) {
        if (j > 0) {
            this.f10147a.postDelayed(this, j);
        } else {
            this.f10147a.post(this);
        }
    }
}
