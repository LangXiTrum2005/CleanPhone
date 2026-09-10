package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 extends mb1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zt1 f22372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mb1 f22373c;

    public yt1(au1 au1Var) {
        super(1);
        this.f22372b = new zt1(au1Var);
        this.f22373c = b();
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final byte a() {
        mb1 mb1Var = this.f22373c;
        if (mb1Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = mb1Var.a();
        if (!this.f22373c.hasNext()) {
            this.f22373c = b();
        }
        return bA;
    }

    public final xr1 b() {
        zt1 zt1Var = this.f22372b;
        if (zt1Var.hasNext()) {
            return new xr1(zt1Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22373c != null;
    }
}
