package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends q00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh1(byte[] bArr, int i10) {
        super(bArr, 2);
        this.f16445c = i10;
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final jh1 o(int i10, byte[] bArr) {
        switch (this.f16445c) {
            case 0:
                return new ih1(bArr, i10, 0);
            default:
                return new ih1(bArr, i10, 1);
        }
    }
}
