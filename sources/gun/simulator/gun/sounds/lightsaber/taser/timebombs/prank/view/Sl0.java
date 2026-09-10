package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Sl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3734a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(JT jt) {
        jt.getClass();
        String strG = jt.g(AbstractC2333Ce.c);
        return strG != null && strG.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = Ug0.f3833a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    public static void d(JT jt) {
        int i = jt.b;
        if (a(jt)) {
            return;
        }
        jt.E(i);
        throw KT.a("Expected WEBVTT. Got " + jt.g(AbstractC2333Ce.c), null);
    }
}
