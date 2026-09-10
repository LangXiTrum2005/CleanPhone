package i1;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f42492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y[] f42493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f42494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f42495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f42496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b[] f42497h;

    static {
        d5.u.m(0, 1, 2, 3, 4);
        d5.u.m(5, 6, 7, 8, 9);
        l1.y.G(10);
        l1.y.G(11);
    }

    public a(int i10, int i11, int[] iArr, y[] yVarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        Uri uri;
        int i12 = 0;
        go.k.i(iArr.length == yVarArr.length);
        go.k.i(iArr.length == bVarArr.length);
        this.f42490a = i10;
        this.f42491b = i11;
        this.f42494e = iArr;
        this.f42493d = yVarArr;
        this.f42495f = jArr;
        this.f42492c = new Uri[yVarArr.length];
        while (true) {
            Uri[] uriArr = this.f42492c;
            if (i12 >= uriArr.length) {
                this.f42496g = strArr;
                this.f42497h = bVarArr;
                return;
            }
            y yVar = yVarArr[i12];
            if (yVar == null) {
                uri = null;
            } else {
                v vVar = yVar.f42714b;
                vVar.getClass();
                uri = vVar.f42704a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f42494e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f42490a == aVar.f42490a && this.f42491b == aVar.f42491b && Arrays.equals(this.f42493d, aVar.f42493d) && Arrays.equals(this.f42494e, aVar.f42494e) && Arrays.equals(this.f42495f, aVar.f42495f) && Arrays.equals(this.f42496g, aVar.f42496g) && Arrays.equals(this.f42497h, aVar.f42497h);
    }

    public final int hashCode() {
        int i10 = ((this.f42490a * 31) + this.f42491b) * 31;
        int i11 = (int) 0;
        return (Arrays.hashCode(this.f42497h) + ((((((Arrays.hashCode(this.f42495f) + ((Arrays.hashCode(this.f42494e) + ((Arrays.hashCode(this.f42493d) + ((i10 + i11) * 31)) * 31)) * 31)) * 31) + i11) * 961) + Arrays.hashCode(this.f42496g)) * 31)) * 31;
    }
}
