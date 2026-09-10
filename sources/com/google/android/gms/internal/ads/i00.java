package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe1 f15456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yh0 f15457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f15458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15459d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15460e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15461f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15462g = -1;

    public final void a(fe1 fe1Var, yh0 yh0Var, Context context) {
        if (this.f15459d.getAndSet(true)) {
            return;
        }
        this.f15456a = fe1Var;
        this.f15457b = yh0Var;
        this.f15461f = ((Long) zzba.zzc().a(am.f12444yf)).longValue();
        this.f15462g = ((Long) zzba.zzc().a(am.f12461zf)).longValue();
        this.f15458c = context;
    }
}
