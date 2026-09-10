package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4723u50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5064a = Pattern.compile("([a-z])=\\s?(.+)");
    public static final Pattern b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    public static final Pattern c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144 A[PHI: r7
  0x0144: PHI (r7v2 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON) = 
  (r7v1 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
  (r7v1 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
  (r7v1 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
  (r7v1 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
  (r7v1 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
  (r7v1 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
  (r7v1 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
  (r7v7 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ON)
 binds: [B:10:0x0029, B:63:0x00f7, B:97:0x01a0, B:96:0x019d, B:95:0x019a, B:91:0x017f, B:90:0x0179, B:76:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Switch 'out' block B:77:0x0144 for B:63:0x00f7 already processed. Defaulting to fallback option. */
    public static C4635t50 a(String str) throws KT {
        byte b2;
        C4547s50 c4547s50 = new C4547s50();
        String str2 = AbstractC3486g10.h;
        if (!str.contains(str2)) {
            str2 = AbstractC3486g10.g;
        }
        int i = Ug0.f3833a;
        String[] strArrSplit = str.split(str2, -1);
        int length = strArrSplit.length;
        ON on = null;
        int i2 = 0;
        while (true) {
            C4998xC c4998xC = c4547s50.b;
            if (i2 >= length) {
                if (on != null) {
                    try {
                        c4998xC.H0(on.a());
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        throw KT.b(null, e);
                    }
                }
                try {
                    return new C4635t50(c4547s50);
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    throw KT.b(null, e2);
                }
            }
            String str3 = strArrSplit[i2];
            if (!"".equals(str3)) {
                Matcher matcher = f5064a.matcher(str3);
                if (!matcher.matches()) {
                    throw KT.b("Malformed SDP line: " + str3, null);
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                switch (strGroup.hashCode()) {
                    case Input.Keys.BUTTON_B /* 97 */:
                        if (!strGroup.equals("a")) {
                            b2 = -1;
                        } else {
                            b2 = 11;
                        }
                        break;
                    case Input.Keys.BUTTON_C /* 98 */:
                        if (!strGroup.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                            b2 = -1;
                        } else {
                            b2 = 8;
                        }
                        break;
                    case Input.Keys.BUTTON_X /* 99 */:
                        if (!strGroup.equals(com.umeng.analytics.pro.bc.aL)) {
                            b2 = -1;
                        } else {
                            b2 = 7;
                        }
                        break;
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 106:
                    case 108:
                    case 110:
                    case 113:
                    case JSON_ENCODE_ERROR_VALUE:
                    case 120:
                    case 121:
                    default:
                        b2 = -1;
                        break;
                    case 101:
                        if (!strGroup.equals("e")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case 105:
                        if (!strGroup.equals(com.umeng.analytics.pro.bc.aI)) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 107:
                        if (!strGroup.equals(CampaignEx.JSON_KEY_AD_K)) {
                            b2 = -1;
                        } else {
                            b2 = 10;
                        }
                        break;
                    case 109:
                        if (!strGroup.equals("m")) {
                            b2 = -1;
                        } else {
                            b2 = 12;
                        }
                        break;
                    case 111:
                        if (!strGroup.equals("o")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 112:
                        if (!strGroup.equals("p")) {
                            b2 = -1;
                        } else {
                            b2 = 6;
                        }
                        break;
                    case 114:
                        if (!strGroup.equals("r")) {
                            b2 = -1;
                        } else {
                            b2 = com.umeng.analytics.pro.cw.k;
                        }
                        break;
                    case 115:
                        if (!strGroup.equals(com.umeng.analytics.pro.bc.aH)) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 116:
                        if (!strGroup.equals(com.umeng.analytics.pro.bc.aO)) {
                            b2 = -1;
                        } else {
                            b2 = 9;
                        }
                        break;
                    case ASSET_FAILED_STATUS_CODE_VALUE:
                        if (!strGroup.equals(com.umeng.analytics.pro.bc.aN)) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        if (!strGroup.equals(com.umeng.analytics.pro.bc.aK)) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 122:
                        if (!strGroup.equals(com.umeng.analytics.pro.bc.aJ)) {
                            b2 = -1;
                        } else {
                            b2 = com.umeng.analytics.pro.cw.l;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        if (!"0".equals(strGroup2)) {
                            throw KT.b("SDP version " + strGroup2 + " is not supported.", null);
                        }
                        continue;
                        break;
                    case 1:
                        c4547s50.e = strGroup2;
                        continue;
                    case 2:
                        c4547s50.d = strGroup2;
                        continue;
                    case 3:
                        if (on != null) {
                            on.g = strGroup2;
                        } else {
                            c4547s50.j = strGroup2;
                            continue;
                        }
                        break;
                    case 4:
                        c4547s50.g = Uri.parse(strGroup2);
                        continue;
                    case 5:
                        c4547s50.k = strGroup2;
                        continue;
                    case 6:
                        c4547s50.l = strGroup2;
                        continue;
                    case 7:
                        if (on != null) {
                            on.h = strGroup2;
                        } else {
                            c4547s50.h = strGroup2;
                            continue;
                        }
                        break;
                    case 8:
                        String[] strArrSplit2 = strGroup2.split(":\\s?", -1);
                        FW.h(strArrSplit2.length == 2);
                        int i3 = Integer.parseInt(strArrSplit2[1]);
                        if (on != null) {
                            on.f = i3 * 1000;
                        } else {
                            c4547s50.c = i3 * 1000;
                            continue;
                        }
                        break;
                    case 9:
                        c4547s50.f = strGroup2;
                        break;
                    case 10:
                        if (on == null) {
                            c4547s50.i = strGroup2;
                        } else {
                            on.i = strGroup2;
                        }
                        break;
                    case 11:
                        Matcher matcher2 = b.matcher(strGroup2);
                        if (!matcher2.matches()) {
                            throw KT.b("Malformed Attribute line: " + str3, null);
                        }
                        String strGroup3 = matcher2.group(1);
                        strGroup3.getClass();
                        String strGroup4 = matcher2.group(2);
                        int i4 = AbstractC5192zU.f5327a;
                        String str4 = strGroup4 != null ? strGroup4 : "";
                        if (on == null) {
                            c4547s50.f4962a.put(strGroup3, str4);
                        } else {
                            on.e.put(strGroup3, str4);
                        }
                        break;
                        break;
                    case 12:
                        if (on != null) {
                            try {
                                c4998xC.H0(on.a());
                            } catch (IllegalArgumentException | IllegalStateException e3) {
                                throw KT.b(null, e3);
                            }
                        }
                        Matcher matcher3 = c.matcher(strGroup2);
                        if (!matcher3.matches()) {
                            throw KT.b("Malformed SDP media description line: ".concat(strGroup2), null);
                        }
                        String strGroup5 = matcher3.group(1);
                        strGroup5.getClass();
                        String strGroup6 = matcher3.group(2);
                        strGroup6.getClass();
                        String strGroup7 = matcher3.group(3);
                        strGroup7.getClass();
                        String strGroup8 = matcher3.group(4);
                        strGroup8.getClass();
                        try {
                            on = new ON(strGroup5, Integer.parseInt(strGroup6), strGroup7, Integer.parseInt(strGroup8));
                        } catch (NumberFormatException e4) {
                            throw KT.b("Malformed SDP media description line: ".concat(strGroup2), e4);
                        }
                        break;
                        break;
                    default:
                        break;
                }
            }
            i2++;
        }
    }
}
