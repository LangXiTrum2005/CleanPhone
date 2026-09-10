package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ON {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3502a;
    public final int b;
    public final String c;
    public final int d;
    public final HashMap e = new HashMap();
    public int f = -1;
    public String g;
    public String h;
    public String i;

    public ON(String str, int i, String str2, int i2) {
        this.f3502a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
    }

    public static String b(int i, int i2, int i3, String str) {
        int i4 = Ug0.f3833a;
        Locale locale = Locale.US;
        return i + " " + str + "/" + i2 + "/" + i3;
    }

    public static String c(int i) {
        FW.h(i < 96);
        if (i == 0) {
            return b(0, 8000, 1, "PCMU");
        }
        if (i == 8) {
            return b(8, 8000, 1, "PCMA");
        }
        if (i == 10) {
            return b(10, 44100, 2, "L16");
        }
        if (i == 11) {
            return b(11, 44100, 1, "L16");
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Unsupported static paylod type ", i));
    }

    public final QN a() {
        PN pnA;
        HashMap map = this.e;
        try {
            if (map.containsKey("rtpmap")) {
                String str = (String) map.get("rtpmap");
                int i = Ug0.f3833a;
                pnA = PN.a(str);
            } else {
                pnA = PN.a(c(this.d));
            }
            return new QN(this, FC.b(map), pnA);
        } catch (KT e) {
            throw new IllegalStateException(e);
        }
    }
}
