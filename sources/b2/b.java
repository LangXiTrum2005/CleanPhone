package b2;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5223d;

    public b(String str, int i10, int i11, int i12) {
        this.f5220a = i10;
        this.f5221b = str;
        this.f5222c = i11;
        this.f5223d = i12;
    }

    public static b a(String str) {
        String str2 = l1.y.f44830a;
        String[] strArrSplit = str.split(" ", 2);
        go.k.i(strArrSplit.length == 2);
        String str3 = strArrSplit[0];
        Pattern pattern = j0.f5303a;
        try {
            int i10 = Integer.parseInt(str3);
            int i11 = -1;
            String[] strArrSplit2 = strArrSplit[1].trim().split("/", -1);
            go.k.i(strArrSplit2.length >= 2);
            String str4 = strArrSplit2[1];
            try {
                int i12 = Integer.parseInt(str4);
                if (strArrSplit2.length == 3) {
                    String str5 = strArrSplit2[2];
                    try {
                        i11 = Integer.parseInt(str5);
                    } catch (NumberFormatException e10) {
                        throw i1.e0.b(str5, e10);
                    }
                }
                return new b(strArrSplit2[0], i10, i12, i11);
            } catch (NumberFormatException e11) {
                throw i1.e0.b(str4, e11);
            }
        } catch (NumberFormatException e12) {
            throw i1.e0.b(str3, e12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f5220a == bVar.f5220a && this.f5221b.equals(bVar.f5221b) && this.f5222c == bVar.f5222c && this.f5223d == bVar.f5223d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((d5.u.e((217 + this.f5220a) * 31, 31, this.f5221b) + this.f5222c) * 31) + this.f5223d;
    }
}
