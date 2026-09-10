package fo;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f41331b = new int[10];

    public final int a() {
        return (this.f41330a & 128) != 0 ? this.f41331b[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final void b(z other) {
        kotlin.jvm.internal.n.f(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & other.f41330a) != 0) {
                c(i10, other.f41331b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f41331b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f41330a = (1 << i10) | this.f41330a;
            iArr[i10] = i11;
        }
    }
}
