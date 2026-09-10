package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ca0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3177ca0 extends AbstractC3089ba0 {
    public static String X0(int i, String str) {
        AbstractC2995aW.q(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String Y0(int i, String str) {
        AbstractC2995aW.q(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
