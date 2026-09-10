package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3486g10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4397a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    public static final Pattern b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    public static final Pattern c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    public static final Pattern d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    public static final Pattern e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    public static final Pattern f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    public static final String g = new String(new byte[]{10});
    public static final String h = new String(new byte[]{com.umeng.analytics.pro.cw.k, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static C3965lY b(String str) {
        if (str == null) {
            C5086yC c5086yC = AC.b;
            return C3965lY.e;
        }
        FW.n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = Ug0.f3833a;
        String[] strArrSplit = str.split(",\\s?", -1);
        int length = strArrSplit.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Integer numValueOf = Integer.valueOf(a(strArrSplit[i2]));
            int i4 = i3 + 1;
            if (objArrCopyOf.length < i4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i4));
            }
            objArrCopyOf[i3] = numValueOf;
            i2++;
            i3 = i4;
        }
        return AC.h(i3, objArrCopyOf);
    }

    public static A70 c(List list) {
        Matcher matcher = b.matcher((CharSequence) list.get(0));
        FW.h(matcher.matches());
        String strGroup = matcher.group(1);
        strGroup.getClass();
        int i = Integer.parseInt(strGroup);
        int iIndexOf = list.indexOf("");
        FW.h(iIndexOf > 0);
        List listSubList = list.subList(1, iIndexOf);
        C4559sD c4559sD = new C4559sD();
        c4559sD.b(listSubList);
        return new A70(i, new S00(c4559sD), SE.c(h).b(list.subList(iIndexOf + 1, list.size())), 8);
    }

    public static FG d(String str) throws KT {
        long j;
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw KT.b(str, null);
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j = ((long) Integer.parseInt(strGroup2)) * 1000;
            } catch (NumberFormatException e2) {
                throw KT.b(str, e2);
            }
        } else {
            j = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        return new FG(strGroup, j);
    }

    public static Ig0 e(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i = Ug0.f3833a;
        String[] strArrSplit = userInfo.split(":", 2);
        return new Ig0(strArrSplit[0], strArrSplit[1], 1);
    }

    public static BR f(String str) throws KT {
        Matcher matcher = e.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(3);
            strGroup2.getClass();
            String strGroup3 = matcher.group(4);
            int i = AbstractC5192zU.f5327a;
            return new BR(2, strGroup, strGroup2, strGroup3 != null ? strGroup3 : "");
        }
        Matcher matcher2 = f.matcher(str);
        if (matcher2.matches()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            return new BR(1, strGroup4, "", "");
        }
        throw KT.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri g(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        authority.getClass();
        FW.h(authority.contains("@"));
        int i = Ug0.f3833a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    public static C3965lY h(C3574h10 c3574h10) {
        S00 s00 = c3574h10.c;
        FW.h(s00.c("CSeq") != null);
        C4998xC c4998xC = new C4998xC();
        c4998xC.H0(Ug0.n("%s %s %s", j(c3574h10.b), c3574h10.f4442a, "RTSP/1.0"));
        CC ccA = s00.a();
        Yf0 it = ccA.g().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AC acH = ccA.h(str);
            for (int i = 0; i < acH.size(); i++) {
                c4998xC.H0(Ug0.n("%s: %s", str, acH.get(i)));
            }
        }
        c4998xC.H0("");
        c4998xC.H0(c3574h10.d);
        return c4998xC.J0();
    }

    public static C3965lY i(A70 a70) {
        String str;
        FW.h(((S00) a70.c).c("CSeq") != null);
        C4998xC c4998xC = new C4998xC();
        Object[] objArr = new Object[3];
        objArr[0] = "RTSP/1.0";
        objArr[1] = Integer.valueOf(a70.b);
        int i = a70.b;
        if (i == 200) {
            str = "OK";
        } else if (i == 461) {
            str = "Unsupported Transport";
        } else if (i == 500) {
            str = "Internal Server Error";
        } else if (i == 505) {
            str = "RTSP Version Not Supported";
        } else if (i == 301) {
            str = "Move Permanently";
        } else if (i == 302) {
            str = "Move Temporarily";
        } else if (i == 400) {
            str = "Bad Request";
        } else if (i == 401) {
            str = "Unauthorized";
        } else if (i == 404) {
            str = "Not Found";
        } else if (i != 405) {
            switch (i) {
                case 454:
                    str = "Session Not Found";
                    break;
                case 455:
                    str = "Method Not Valid In This State";
                    break;
                case 456:
                    str = "Header Field Not Valid";
                    break;
                case 457:
                    str = "Invalid Range";
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            str = "Method Not Allowed";
        }
        objArr[2] = str;
        c4998xC.H0(Ug0.n("%s %s %s", objArr));
        CC ccA = ((S00) a70.c).a();
        Yf0 it = ccA.g().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            AC acH = ccA.h(str2);
            for (int i2 = 0; i2 < acH.size(); i2++) {
                c4998xC.H0(Ug0.n("%s: %s", str2, acH.get(i2)));
            }
        }
        c4998xC.H0("");
        c4998xC.H0((String) a70.d);
        return c4998xC.J0();
    }

    public static String j(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
