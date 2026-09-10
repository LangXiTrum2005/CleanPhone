package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class PN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3549a;
    public final String b;
    public final int c;
    public final int d;

    public PN(int i, String str, int i2, int i3) {
        this.f3549a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public static PN a(String str) throws KT {
        int i = Ug0.f3833a;
        String[] strArrSplit = str.split(" ", 2);
        FW.h(strArrSplit.length == 2);
        String str2 = strArrSplit[0];
        Pattern pattern = AbstractC3486g10.f4397a;
        try {
            int i2 = Integer.parseInt(str2);
            int i3 = -1;
            String[] strArrSplit2 = strArrSplit[1].trim().split("/", -1);
            FW.h(strArrSplit2.length >= 2);
            String str3 = strArrSplit2[1];
            try {
                int i4 = Integer.parseInt(str3);
                if (strArrSplit2.length == 3) {
                    String str4 = strArrSplit2[2];
                    try {
                        i3 = Integer.parseInt(str4);
                    } catch (NumberFormatException e) {
                        throw KT.b(str4, e);
                    }
                }
                return new PN(i2, strArrSplit2[0], i4, i3);
            } catch (NumberFormatException e2) {
                throw KT.b(str3, e2);
            }
        } catch (NumberFormatException e3) {
            throw KT.b(str2, e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PN.class != obj.getClass()) {
            return false;
        }
        PN pn = (PN) obj;
        return this.f3549a == pn.f3549a && this.b.equals(pn.b) && this.c == pn.c && this.d == pn.d;
    }

    public final int hashCode() {
        return ((DM.d(this.b, (EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE + this.f3549a) * 31, 31) + this.c) * 31) + this.d;
    }
}
