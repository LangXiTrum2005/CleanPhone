package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f4061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4062d;

    public c1(b0 b0Var, String str, Object[] objArr) {
        this.f4059a = b0Var;
        this.f4060b = str;
        this.f4061c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f4062d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f4062d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f4062d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
