package androidx.media3.common;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class MimeTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f5488a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f5489b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class CustomMimeType {
    }

    public static final class Mp4aObjectType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5491b;

        public Mp4aObjectType(int i2, int i3) {
            this.f5490a = i2;
            this.f5491b = i3;
        }

        public final int a() {
            int i2 = this.f5491b;
            if (i2 == 2) {
                return 10;
            }
            if (i2 == 5) {
                return 11;
            }
            if (i2 == 29) {
                return 12;
            }
            if (i2 == 42) {
                return 16;
            }
            if (i2 != 22) {
                return i2 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        Mp4aObjectType mp4aObjectTypeE;
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
                return (str2 == null || (mp4aObjectTypeE = e(str2)) == null || (iA = mp4aObjectTypeE.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        Mp4aObjectType mp4aObjectTypeE;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (mp4aObjectTypeE = e(str2)) == null) {
                    return 0;
                }
                return mp4aObjectTypeE.a();
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

    public static String c(String str) {
        Mp4aObjectType mp4aObjectTypeE;
        String strD = null;
        if (str == null) {
            return null;
        }
        String strB = Ascii.b(str.trim());
        if (strB.startsWith("avc1") || strB.startsWith("avc3")) {
            return "video/avc";
        }
        if (strB.startsWith("hev1") || strB.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strB.startsWith("dvav") || strB.startsWith("dva1") || strB.startsWith("dvhe") || strB.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strB.startsWith("av01")) {
            return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
        }
        if (strB.startsWith("vp9") || strB.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strB.startsWith("vp8") || strB.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strB.startsWith("mp4a")) {
            if (strB.startsWith("mp4a.") && (mp4aObjectTypeE = e(strB)) != null) {
                strD = d(mp4aObjectTypeE.f5490a);
            }
            return strD == null ? "audio/mp4a-latm" : strD;
        }
        if (strB.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strB.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strB.startsWith("ac-3") || strB.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strB.startsWith("ec-3") || strB.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strB.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strB.startsWith("ac-4") || strB.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strB.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strB.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strB.startsWith("dtsh") || strB.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strB.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strB.startsWith("opus")) {
            return "audio/opus";
        }
        if (strB.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strB.startsWith("flac")) {
            return "audio/flac";
        }
        if (strB.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strB.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strB.contains("cea708")) {
            return "application/cea-708";
        }
        if (strB.contains("eia608") || strB.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f5488a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((CustomMimeType) arrayList.get(i2)).getClass();
            if (strB.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String d(int i2) {
        if (i2 == 32) {
            return "video/mp4v-es";
        }
        if (i2 == 33) {
            return "video/avc";
        }
        if (i2 == 35) {
            return "video/hevc";
        }
        if (i2 == 64) {
            return "audio/mp4a-latm";
        }
        if (i2 == 163) {
            return "video/wvc1";
        }
        if (i2 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i2 == 221) {
            return "audio/vorbis";
        }
        if (i2 == 165) {
            return "audio/ac3";
        }
        if (i2 == 166) {
            return "audio/eac3";
        }
        switch (i2) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i2) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static Mp4aObjectType e(String str) {
        Matcher matcher = f5489b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new Mp4aObjectType(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f5488a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((CustomMimeType) arrayList.get(i2)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return d.c.k.equals(f(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean j(String str) {
        return "text".equals(f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean k(String str) {
        return "video".equals(f(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String strB = Ascii.b(str);
        strB.getClass();
        switch (strB) {
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strB;
        }
    }
}
