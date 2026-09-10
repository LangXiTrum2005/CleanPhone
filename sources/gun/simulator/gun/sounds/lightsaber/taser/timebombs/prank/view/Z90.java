package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z90 extends Y90 {
    public static final void h0(String str) {
        throw new NumberFormatException(AbstractC3950lJ.r("Invalid number format: '", str, '\''));
    }

    public static Integer i0(String str) {
        boolean z;
        int i;
        int i2;
        AbstractC2995aW.q(str, "<this>");
        WD.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (AbstractC2995aW.s(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z = false;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static Long j0(String str) {
        boolean z;
        AbstractC2995aW.q(str, "<this>");
        WD.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        int iS = AbstractC2995aW.s(cCharAt, 48);
        long j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (iS < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j = Long.MIN_VALUE;
                i = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i = 1;
                z = false;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 != j2) {
                    return null;
                }
                j4 = j / ((long) 10);
                if (j3 < j4) {
                    return null;
                }
            }
            long j5 = j3 * ((long) 10);
            long j6 = iDigit;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
