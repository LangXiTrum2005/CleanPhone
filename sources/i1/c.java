package i1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f42523c = new c(new a[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f42524d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f42526b;

    static {
        a aVar = new a(-1, -1, new int[0], new y[0], new long[0], new String[0], new b[0]);
        int[] iArr = aVar.f42494e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f42495f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, C.TIME_UNSET);
        y[] yVarArr = (y[]) Arrays.copyOf(aVar.f42493d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f42496g, 0);
        b[] bVarArr = aVar.f42497h;
        f42524d = new a(0, aVar.f42491b, iArrCopyOf, yVarArr, jArrCopyOf, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        l1.y.G(1);
        l1.y.G(2);
        l1.y.G(3);
        l1.y.G(4);
    }

    public c(a[] aVarArr) {
        this.f42525a = aVarArr.length;
        this.f42526b = aVarArr;
    }

    public final a a(int i10) {
        return i10 < 0 ? f42524d : this.f42526b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f42525a == cVar.f42525a && Arrays.equals(this.f42526b, cVar.f42526b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42526b) + (((((this.f42525a * 961) + ((int) 0)) * 31) + ((int) C.TIME_UNSET)) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f42526b;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            aVarArr[i10].getClass();
            for (int i11 = 0; i11 < aVarArr[i10].f42494e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f42494e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i10].f42495f[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f42494e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
