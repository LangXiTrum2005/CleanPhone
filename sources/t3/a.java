package t3;

import java.util.regex.Pattern;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f50442c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f50443d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f50444a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f50445b = new StringBuilder();

    public static String a(q qVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = qVar.f44814b;
        int i11 = qVar.f44815c;
        while (i10 < i11 && !z10) {
            char c4 = (char) qVar.f44813a[i10];
            if ((c4 < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c4);
            }
        }
        qVar.N(i10 - qVar.f44814b);
        return sb2.toString();
    }

    public static String b(q qVar, StringBuilder sb2) {
        c(qVar);
        if (qVar.a() == 0) {
            return null;
        }
        String strA = a(qVar, sb2);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) qVar.z());
    }

    public static void c(q qVar) {
        while (true) {
            for (boolean z10 = true; qVar.a() > 0 && z10; z10 = false) {
                int i10 = qVar.f44814b;
                byte[] bArr = qVar.f44813a;
                byte b10 = bArr[i10];
                char c4 = (char) b10;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    qVar.N(1);
                } else {
                    int i11 = qVar.f44815c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            qVar.N(i11 - qVar.f44814b);
                        }
                    }
                }
            }
            return;
        }
    }
}
