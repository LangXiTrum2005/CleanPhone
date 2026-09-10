package le;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45318g = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f45319h = new a(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 1024, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f45320i = new a(67, 64, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f45321j = new a(19, 16, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f45322k = new a(285, NotificationCompat.FLAG_LOCAL_ONLY, 0);
    public static final a l = new a(301, NotificationCompat.FLAG_LOCAL_ONLY, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f45323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f45324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f45325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45328f;

    public a(int i10, int i11, int i12) {
        this.f45327e = i10;
        this.f45326d = i11;
        this.f45328f = i12;
        this.f45323a = new int[i11];
        this.f45324b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f45323a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f45324b[this.f45323a[i15]] = i15;
        }
        this.f45325c = new b(this, new int[]{0});
    }

    public final int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f45324b;
        return this.f45323a[(iArr[i10] + iArr[i11]) % (this.f45326d - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f45327e));
        sb2.append(',');
        return u.g(sb2, this.f45326d, ')');
    }
}
