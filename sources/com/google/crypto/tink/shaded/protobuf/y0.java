package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f24656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24657d;

    public y0(a aVar, String str, Object[] objArr) {
        this.f24654a = aVar;
        this.f24655b = str;
        this.f24656c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f24657d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f24657d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f24657d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
