package fo;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lo.h f41230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f41231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f41232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f41233d;

    static {
        lo.h hVar = lo.h.f45638d;
        f41230a = jj.d.v("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f41231b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f41232c = new String[64];
        String[] strArr = new String[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            kotlin.jvm.internal.n.e(binaryString, "toBinaryString(it)");
            strArr[i10] = an.p.m0(yn.a.h("%8s", binaryString), ' ', '0');
        }
        f41233d = strArr;
        String[] strArr2 = f41232c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = defpackage.e.q(strArr2[i11], "|PADDED", new StringBuilder());
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f41232c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = defpackage.e.q(strArr3[i13], "|PADDED", sb2);
        }
        int length = f41232c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f41232c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f41233d[i16];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static String a(boolean z10, int i10, int i11, int i12, int i13) {
        String strN0;
        String str;
        String[] strArr = f41231b;
        String strH = i12 < strArr.length ? strArr[i12] : yn.a.h("0x%02x", Integer.valueOf(i12));
        if (i13 == 0) {
            strN0 = "";
        } else {
            String[] strArr2 = f41233d;
            if (i12 == 2 || i12 == 3) {
                strN0 = strArr2[i13];
            } else if (i12 == 4 || i12 == 6) {
                strN0 = i13 == 1 ? "ACK" : strArr2[i13];
            } else if (i12 == 7 || i12 == 8) {
                strN0 = strArr2[i13];
            } else {
                String[] strArr3 = f41232c;
                if (i13 < strArr3.length) {
                    str = strArr3[i13];
                    kotlin.jvm.internal.n.c(str);
                } else {
                    str = strArr2[i13];
                }
                if (i12 != 5 || (i13 & 4) == 0) {
                    strN0 = (i12 != 0 || (i13 & 32) == 0) ? str : an.p.n0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strN0 = an.p.n0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return yn.a.h("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strH, strN0);
    }
}
