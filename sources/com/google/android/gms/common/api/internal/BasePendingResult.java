package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.e20;
import j9.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends j9.o> extends com.google.android.gms.internal.auth.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final co.c f11658n = new co.c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f11660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f11661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f11662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j9.o f11663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Status f11664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f11665k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11666m;

    @KeepName
    private j0 resultGuardian;

    public BasePendingResult(j9.l lVar) {
        super(9);
        this.f11659e = new Object();
        this.f11660f = new CountDownLatch(1);
        this.f11661g = new ArrayList();
        this.f11662h = new AtomicReference();
        this.f11666m = false;
        new d(lVar != null ? ((v) lVar).f11773b.f43746g : Looper.getMainLooper(), 1);
        new WeakReference(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(j9.o oVar) {
        if (oVar instanceof e20) {
            try {
                ((e20) oVar).g();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(oVar)), e10);
            }
        }
    }

    public final void F(j9.m mVar) {
        synchronized (this.f11659e) {
            try {
                if (I()) {
                    mVar.a(this.f11664j);
                } else {
                    this.f11661g.add(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract j9.o G(Status status);

    public final void H(Status status) {
        synchronized (this.f11659e) {
            try {
                if (!I()) {
                    J(G(status));
                    this.l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean I() {
        return this.f11660f.getCount() == 0;
    }

    public final void J(j9.o oVar) {
        synchronized (this.f11659e) {
            try {
                if (this.l) {
                    L(oVar);
                    return;
                }
                I();
                k9.c0.j("Results have already been set", !I());
                k9.c0.j("Result has already been consumed", !this.f11665k);
                K(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void K(j9.o oVar) {
        this.f11663i = oVar;
        this.f11664j = oVar.getStatus();
        this.f11660f.countDown();
        if (this.f11663i instanceof e20) {
            this.resultGuardian = new j0(this);
        }
        ArrayList arrayList = this.f11661g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((j9.m) arrayList.get(i10)).a(this.f11664j);
        }
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.auth.o
    public final j9.o a() {
        j9.o oVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        k9.c0.j("Result has already been consumed.", !this.f11665k);
        try {
            if (!this.f11660f.await(0L, timeUnit)) {
                H(Status.f11652h);
            }
        } catch (InterruptedException unused) {
            H(Status.f11650f);
        }
        k9.c0.j("Result is not ready.", I());
        synchronized (this.f11659e) {
            k9.c0.j("Result has already been consumed.", !this.f11665k);
            k9.c0.j("Result is not ready.", I());
            oVar = this.f11663i;
            this.f11663i = null;
            this.f11665k = true;
        }
        if (this.f11662h.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        k9.c0.h(oVar);
        return oVar;
    }
}
