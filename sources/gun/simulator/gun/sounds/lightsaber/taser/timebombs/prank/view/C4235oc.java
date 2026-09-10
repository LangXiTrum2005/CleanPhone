package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4235oc implements InterfaceC3121br {
    public static final String c = AbstractC2845Vx.Z("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final Set d;
    public static final C4235oc e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4795a;
    public final String b;

    static {
        String strZ = AbstractC2845Vx.Z("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strZ2 = AbstractC2845Vx.Z("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C3736ir("proto"), new C3736ir("json"))));
        e = new C4235oc(strZ, strZ2);
    }

    public C4235oc(String str, String str2) {
        this.f4795a = str;
        this.b = str2;
    }

    public static C4235oc a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C4235oc(str2, str3);
    }
}
