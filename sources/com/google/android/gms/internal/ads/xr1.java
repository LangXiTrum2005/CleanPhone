package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xr1 extends mb1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cs1 f21989d;

    public xr1(cs1 cs1Var) {
        super(1);
        this.f21989d = cs1Var;
        this.f21987b = 0;
        this.f21988c = cs1Var.q();
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final byte a() {
        int i10 = this.f21987b;
        if (i10 >= this.f21988c) {
            throw new NoSuchElementException();
        }
        this.f21987b = i10 + 1;
        return this.f21989d.p(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21987b < this.f21988c;
    }
}
