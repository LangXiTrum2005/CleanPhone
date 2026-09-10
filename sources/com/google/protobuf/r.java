package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f24926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24927b;

    public r(int i10) {
        byte[] bArr = new byte[i10];
        this.f24927b = bArr;
        this.f24926a = CodedOutputStream.newInstance(bArr);
    }
}
