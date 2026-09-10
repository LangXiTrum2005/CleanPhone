package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class J00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3250a;
    public final int b;
    public final C4619sw c;
    public final FC d;
    public final String e;

    public J00(C4619sw c4619sw, int i, int i2, C4405qY c4405qY, String str) {
        this.f3250a = i;
        this.b = i2;
        this.c = c4619sw;
        this.d = FC.b(c4405qY);
        this.e = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean a(QN qn) {
        String strJ0 = FW.j0(qn.j.b);
        strJ0.getClass();
        byte b = -1;
        switch (strJ0.hashCode()) {
            case -1922091719:
                if (strJ0.equals("MPEG4-GENERIC")) {
                    b = 0;
                }
                break;
            case 2412:
                if (strJ0.equals("L8")) {
                    b = 1;
                }
                break;
            case 64593:
                if (strJ0.equals("AC3")) {
                    b = 2;
                }
                break;
            case 64934:
                if (strJ0.equals("AMR")) {
                    b = 3;
                }
                break;
            case 74609:
                if (strJ0.equals("L16")) {
                    b = 4;
                }
                break;
            case 85182:
                if (strJ0.equals("VP8")) {
                    b = 5;
                }
                break;
            case 85183:
                if (strJ0.equals("VP9")) {
                    b = 6;
                }
                break;
            case 2194728:
                if (strJ0.equals("H264")) {
                    b = 7;
                }
                break;
            case 2194729:
                if (strJ0.equals("H265")) {
                    b = 8;
                }
                break;
            case 2433087:
                if (strJ0.equals("OPUS")) {
                    b = 9;
                }
                break;
            case 2450119:
                if (strJ0.equals("PCMA")) {
                    b = 10;
                }
                break;
            case 2450139:
                if (strJ0.equals("PCMU")) {
                    b = 11;
                }
                break;
            case 1061166827:
                if (strJ0.equals("MP4A-LATM")) {
                    b = 12;
                }
                break;
            case 1934494802:
                if (strJ0.equals("AMR-WB")) {
                    b = com.umeng.analytics.pro.cw.k;
                }
                break;
            case 1959269366:
                if (strJ0.equals("MP4V-ES")) {
                    b = com.umeng.analytics.pro.cw.l;
                }
                break;
            case 2137188397:
                if (strJ0.equals("H263-1998")) {
                    b = com.umeng.analytics.pro.cw.m;
                }
                break;
            case 2137209252:
                if (strJ0.equals("H263-2000")) {
                    b = com.umeng.analytics.pro.cw.n;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J00.class != obj.getClass()) {
            return false;
        }
        J00 j00 = (J00) obj;
        if (this.f3250a == j00.f3250a && this.b == j00.b && this.c.equals(j00.c)) {
            FC fc = this.d;
            fc.getClass();
            if (FW.D(fc, j00.d) && this.e.equals(j00.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((((EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE + this.f3250a) * 31) + this.b) * 31)) * 31)) * 31);
    }
}
