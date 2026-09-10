package i1;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f42529a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f42530b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        n3 n3VarF;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (n3VarF = f(str2)) == null || (iA = n3VarF.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrW = l1.y.W(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrW) {
                if (str2.equals(d(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        n3 n3VarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (n3VarF = f(str2)) == null) {
                    return 0;
                }
                return n3VarF.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        n3 n3VarF;
        String strE = null;
        if (str != null) {
            String strF = q1.F(str.trim());
            if (strF.startsWith("avc1") || strF.startsWith("avc3")) {
                return "video/avc";
            }
            if (strF.startsWith("hev1") || strF.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strF.startsWith("dvav") || strF.startsWith("dva1") || strF.startsWith("dvhe") || strF.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strF.startsWith("av01")) {
                return MimeTypes.VIDEO_AV1;
            }
            if (strF.startsWith("vp9") || strF.startsWith("vp09")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
            }
            if (strF.startsWith("vp8") || strF.startsWith("vp08")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8;
            }
            if (strF.startsWith("mp4a")) {
                if (strF.startsWith("mp4a.") && (n3VarF = f(strF)) != null) {
                    strE = e(n3VarF.f17624a);
                }
                return strE == null ? com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC : strE;
            }
            if (strF.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strF.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strF.startsWith("ac-3") || strF.startsWith("dac3")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
            }
            if (strF.startsWith("ec-3") || strF.startsWith("dec3")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
            }
            if (strF.startsWith("ec+3")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC;
            }
            if (strF.startsWith("ac-4") || strF.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strF.startsWith("dtsc")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
            }
            if (strF.startsWith("dtse")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (strF.startsWith("dtsh") || strF.startsWith("dtsl")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
            }
            if (strF.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strF.startsWith("opus")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
            }
            if (strF.startsWith("vorbis")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
            }
            if (strF.startsWith("flac")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
            }
            if (strF.startsWith("stpp")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML;
            }
            if (strF.startsWith("wvtt")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.TEXT_VTT;
            }
            if (strF.contains("cea708")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708;
            }
            if (strF.contains("eia608") || strF.contains("cea608")) {
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608;
            }
            ArrayList arrayList = f42529a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String e(int i10) {
        if (i10 == 32) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V;
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC;
        }
        if (i10 == 163) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VC1;
        }
        if (i10 == 177) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
        }
        if (i10 == 221) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
        }
        if (i10 == 165) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
        }
        if (i10 == 166) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case InterfaceC0435l1.d.b.f29105b /* 101 */:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MPEG2;
            case InterfaceC0435l1.d.b.f29106c /* 102 */:
            case InterfaceC0435l1.d.b.f29107d /* 103 */:
            case InterfaceC0435l1.d.b.f29108e /* 104 */:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC;
            case InterfaceC0435l1.d.b.f29109f /* 105 */:
            case 107:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            case 106:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static n3 f(String str) {
        Matcher matcher = f42530b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new n3(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, false);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_ID3.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_EMSG.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList arrayList = f42529a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean i(String str) {
        return "audio".equals(g(str));
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TX3G.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4VTT.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_RAWCC.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean m(String str) {
        return "video".equals(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String strF = q1.F(str);
        strF.getClass();
        switch (strF) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
            case "application/x-mpegurl":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_M3U8;
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L1;
            case "audio/mpeg-l2":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L2;
            case "audio/mp3":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            default:
                return strF;
        }
    }
}
