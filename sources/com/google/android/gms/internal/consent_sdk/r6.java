package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5 f23181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f23183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23184d;

    public r6(i5 i5Var, String str, Object[] objArr) {
        this.f23181a = i5Var;
        this.f23182b = str;
        this.f23183c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f23184d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f23184d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f23184d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
