package m0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f45727a;

    static {
        new l("", 0, 0);
    }

    public l(String str, int i10, int i11) {
        this.f45727a = new k(str, i10, i11);
    }

    public static l a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        String string;
        if (z10) {
            int i16 = i10 / 2;
            int i17 = i11 / 2;
            StringBuilder sbL = l1.d.l("M0,", i17, " A", i16, ",");
            l1.d.o(sbL, i17, " 0 1,1 ", i10, ",");
            l1.d.o(sbL, i17, " A", i16, ",");
            sbL.append(i17);
            sbL.append(" 0 1,1 0,");
            sbL.append(i17);
            sbL.append(" Z");
            string = sbL.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int iMin = Math.min(i10 / 2, i11 / 2);
            int iMin2 = Math.min(iMin, i12);
            int iMin3 = Math.min(iMin, i13);
            int iMin4 = Math.min(iMin, i14);
            int iMin5 = Math.min(iMin, i15);
            sb2.append(iMin2);
            sb2.append(",0 L ");
            sb2.append(i10 - iMin3);
            sb2.append(",0");
            if (iMin3 > 0) {
                l1.d.p(sb2, " A ", iMin3, ",", iMin3);
                l1.d.p(sb2, " 0 0,1 ", i10, ",", iMin3);
            }
            sb2.append(" L ");
            sb2.append(i10);
            sb2.append(",");
            sb2.append(i11 - iMin4);
            if (iMin4 > 0) {
                l1.d.p(sb2, " A ", iMin4, ",", iMin4);
                sb2.append(" 0 0,1 ");
                sb2.append(i10 - iMin4);
                sb2.append(",");
                sb2.append(i11);
            }
            l1.d.p(sb2, " L ", iMin5, ",", i11);
            if (iMin5 > 0) {
                l1.d.p(sb2, " A ", iMin5, ",", iMin5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i11 - iMin5);
            }
            if (iMin2 > 0) {
                l1.d.p(sb2, " L 0,", iMin2, " A ", iMin2);
                l1.d.p(sb2, ",", iMin2, " 0 0,1 ", iMin2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            string = sb2.toString();
        }
        return new l(string, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return Objects.equals(this.f45727a, ((l) obj).f45727a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45727a);
    }

    public final String toString() {
        return this.f45727a.toString();
    }
}
