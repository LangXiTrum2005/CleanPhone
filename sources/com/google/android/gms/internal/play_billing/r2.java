package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f24461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f24463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24464d;

    public r2(c1 c1Var, String str, Object[] objArr) {
        this.f24461a = c1Var;
        this.f24462b = str;
        this.f24463c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f24464d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f24464d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f24464d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
