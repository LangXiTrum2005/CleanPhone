package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3662i10 {
    public static final C3662i10 c = new C3662i10(0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    public static final Pattern d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4484a;
    public final long b;

    public C3662i10(long j, long j2) {
        this.f4484a = j;
        this.b = j2;
    }

    public static C3662i10 a(String str) throws KT {
        long j;
        Matcher matcher = d.matcher(str);
        boolean zMatches = matcher.matches();
        Pattern pattern = AbstractC3486g10.f4397a;
        if (!zMatches) {
            throw KT.b(str, null);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            throw KT.b(str, null);
        }
        int i = Ug0.f3833a;
        long j2 = strGroup.equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                if (j < j2) {
                    throw KT.b(str, null);
                }
            } catch (NumberFormatException e) {
                throw KT.b(strGroup2, e);
            }
        } else {
            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return new C3662i10(j2, j);
    }
}
