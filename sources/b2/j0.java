package b2;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oa.e2;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5303a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f5304b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f5305c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f5306d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f5307e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f5308f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5309g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f5310h = new String(new byte[]{13, 10});

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
                return 0;
        }
    }

    public static n1 b(String str) {
        if (str == null) {
            oa.f0 f0Var = oa.j0.f47265b;
            return n1.f47281e;
        }
        oa.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String str2 = l1.y.f44830a;
        int i10 = 0;
        for (String str3 : str.split(",\\s?", -1)) {
            int iA = a(str3);
            if (iA != 0) {
                Integer numValueOf = Integer.valueOf(iA);
                int i11 = i10 + 1;
                int iF = oa.b0.f(objArrCopyOf.length, i11);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i10] = numValueOf;
                i10 = i11;
            }
        }
        return oa.j0.t(i10, objArrCopyOf);
    }

    public static i0 c(String str) {
        long j10;
        Matcher matcher = f5306d.matcher(str);
        if (!matcher.matches()) {
            throw i1.e0.b(str, null);
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = ((long) Integer.parseInt(strGroup2)) * 1000;
            } catch (NumberFormatException e10) {
                throw i1.e0.b(str, e10);
            }
        } else {
            j10 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        return new i0(strGroup, j10);
    }

    public static h0 d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String str = l1.y.f44830a;
        String[] strArrSplit = userInfo.split(":", 2);
        return new h0(strArrSplit[0], strArrSplit[1]);
    }

    public static h9.k e(String str) {
        Matcher matcher = f5307e.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(3);
            strGroup2.getClass();
            String strGroup3 = matcher.group(4);
            return new h9.k(2, strGroup, strGroup2, strGroup3 != null ? strGroup3 : "");
        }
        Matcher matcher2 = f5308f.matcher(str);
        if (matcher2.matches()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            return new h9.k(1, strGroup4, "", "");
        }
        throw i1.e0.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static n1 f(k0 k0Var) {
        go.k.i(k0Var.f5315c.b("CSeq") != null);
        oa.e0 e0Var = new oa.e0(4);
        Object[] objArr = {g(k0Var.f5314b), k0Var.f5313a, "RTSP/1.0"};
        String str = l1.y.f44830a;
        e0Var.b(String.format(Locale.US, "%s %s %s", objArr));
        oa.l0 l0Var = k0Var.f5315c.f5392a;
        e2 it = l0Var.f47296d.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            oa.j0 j0VarK = l0Var.k(str2);
            for (int i10 = 0; i10 < j0VarK.size(); i10++) {
                e0Var.b(String.format(Locale.US, "%s: %s", str2, j0VarK.get(i10)));
            }
        }
        e0Var.b("");
        e0Var.b(k0Var.f5316d);
        return e0Var.g();
    }

    public static String g(int i10) {
        switch (i10) {
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
