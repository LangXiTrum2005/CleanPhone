package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j22 extends tx1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15941k;

    @Override // com.google.android.gms.internal.ads.tx1
    public final void g() {
        super.g();
        this.f15940j = 0;
    }

    public final int l() {
        return this.f15940j;
    }

    public final boolean m() {
        return this.f15940j > 0;
    }

    public final boolean n(tx1 tx1Var) {
        ByteBuffer byteBuffer;
        ps1.v(!tx1Var.f(1073741824));
        ps1.v(!tx1Var.f(268435456));
        ps1.v(!tx1Var.f(4));
        if (m()) {
            if (this.f15940j >= this.f15941k) {
                return false;
            }
            ByteBuffer byteBuffer2 = tx1Var.f20523e;
            if (byteBuffer2 != null && (byteBuffer = this.f20523e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f15940j;
        this.f15940j = i10 + 1;
        if (i10 == 0) {
            this.f20524f = tx1Var.f20524f;
            if (tx1Var.f(1)) {
                this.f22444b = 1;
            }
        }
        ByteBuffer byteBuffer3 = tx1Var.f20523e;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.f20523e.put(byteBuffer3);
        }
        this.f15939i = tx1Var.f20524f;
        return true;
    }
}
