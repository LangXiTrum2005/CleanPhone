package s3;

import android.graphics.Rect;
import com.google.android.gms.internal.ads.xd1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f50093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f50096g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f50090a = new int[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f50097h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f50098i = -1;

    public static int a(int i10, int[] iArr) {
        return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
    }

    public static int c(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    public final void b(xd1 xd1Var, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i12 = !z10 ? 1 : 0;
        int i13 = i12 * iWidth;
        while (true) {
            int i14 = 0;
            do {
                int i15 = 1;
                int i16 = 0;
                while (true) {
                    if (i16 >= i15 || i15 > 64) {
                        i10 = i16 & 3;
                        if (i16 >= 4) {
                            i11 = i16 >> 2;
                            break;
                        } else {
                            i11 = iWidth;
                            break;
                        }
                    }
                    if (xd1Var.b() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    } else {
                        i16 = (i16 << 4) | xd1Var.i(4);
                        i15 <<= 2;
                    }
                }
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i17 = i13 + iMin;
                    Arrays.fill(iArr, i13, i17, this.f50090a[i10]);
                    i14 += iMin;
                    i13 = i17;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            xd1Var.c();
        }
    }
}
