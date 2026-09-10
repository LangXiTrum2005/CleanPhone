package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4644tA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3971lc f5023a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        int i = 0;
        C3971lc c3971lc = C3971lc.d;
        f5023a = G7.x("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            AbstractC2995aW.p(binaryString, "toBinaryString(it)");
            strArr[i2] = AbstractC3089ba0.G0(Vg0.h("%8s", binaryString), ' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = AbstractC2995aW.v0("|PADDED", strArr2[i3]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        while (i4 < 3) {
            int i5 = iArr2[i4];
            i4++;
            int i6 = iArr[0];
            String[] strArr3 = c;
            int i7 = i6 | i5;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i6]);
            sb.append('|');
            sb.append((Object) strArr3[i5]);
            strArr3[i7] = sb.toString();
            strArr3[i7 | 8] = ((Object) strArr3[i6]) + '|' + ((Object) strArr3[i5]) + "|PADDED";
        }
        int length = c.length;
        while (i < length) {
            int i8 = i + 1;
            String[] strArr4 = c;
            if (strArr4[i] == null) {
                strArr4[i] = d[i];
            }
            i = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    public static String a(int i, int i2, int i3, int i4, boolean z) {
        String strH0;
        String str;
        String[] strArr = b;
        String strH = i3 < strArr.length ? strArr[i3] : Vg0.h("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strH0 = "";
        } else {
            String[] strArr2 = d;
            if (i3 == 2 || i3 == 3) {
                strH0 = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strH0 = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strH0 = strArr2[i4];
            } else {
                String[] strArr3 = c;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    AbstractC2995aW.n(str);
                } else {
                    str = strArr2[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strH0 = (i3 != 0 || (i4 & 32) == 0) ? str : AbstractC3089ba0.H0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strH0 = AbstractC3089ba0.H0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return Vg0.h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strH, strH0);
    }
}
