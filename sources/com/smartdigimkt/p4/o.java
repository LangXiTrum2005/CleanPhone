package com.smartdigimkt.p4;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f37563A = "audio/eac3";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f37564B = "audio/eac3-joc";
    public static final String C = "audio/true-hd";
    public static final String D = "audio/vnd.dts";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f37565E = "audio/vnd.dts.hd";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f37566F = "audio/vnd.dts.hd;profile=lbr";
    public static final String G = "audio/vorbis";
    public static final String H = "audio/opus";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f37567I = "audio/3gpp";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f37568J = "audio/amr-wb";
    public static final String K = "audio/flac";
    public static final String L = "audio/alac";
    public static final String M = "audio/gsm";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f37569N = "audio/x-unknown";
    public static final String O = "text/vtt";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f37570P = "text/x-ssa";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f37571Q = "application/mp4";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f37572R = "application/webm";
    public static final String S = "application/dash+xml";
    public static final String T = "application/x-mpegURL";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f37573U = "application/vnd.ms-sstr+xml";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f37574V = "application/id3";
    public static final String W = "application/cea-608";
    public static final String X = "application/cea-708";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f37575Y = "application/x-subrip";
    public static final String Z = "application/ttml+xml";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37576a = "video";
    public static final String a0 = "application/x-quicktime-tx3g";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37577b = "audio";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f37578b0 = "application/x-mp4-vtt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37579c = "text";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f37580c0 = "application/x-mp4-cea-608";
    public static final String d = "application";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f37581d0 = "application/x-rawcc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37582e = "video/mp4";
    public static final String e0 = "application/vobsub";
    public static final String f = "video/webm";
    public static final String f0 = "application/pgs";
    public static final String g = "video/3gpp";
    public static final String g0 = "application/x-scte35";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f37583h = "video/avc";
    public static final String h0 = "application/x-camera-motion";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f37584i = "video/hevc";
    public static final String i0 = "application/x-emsg";
    public static final String j = "video/x-vnd.on2.vp8";
    public static final String j0 = "application/dvbsubs";
    public static final String k = "video/x-vnd.on2.vp9";
    public static final String k0 = "application/x-exif";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f37585l = "video/mp4v-es";
    private static final ArrayList<a> l0 = new ArrayList<>();
    public static final String m = "video/mpeg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f37586n = "video/mpeg2";
    public static final String o = "video/wvc1";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f37587p = "video/x-unknown";
    public static final String q = "audio/mp4";
    public static final String r = "audio/mp4a-latm";
    public static final String s = "audio/webm";
    public static final String t = "audio/mpeg";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f37588u = "audio/mpeg-L1";
    public static final String v = "audio/mpeg-L2";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f37589w = "audio/raw";
    public static final String x = "audio/g711-alaw";
    public static final String y = "audio/g711-mlaw";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f37590z = "audio/ac3";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37593c;

        public a(String str, String str2, int i2) {
            this.f37591a = str;
            this.f37592b = str2;
            this.f37593c = i2;
        }
    }

    private o() {
    }

    public static void a(String str, String str2, int i2) {
        a aVar = new a(str, str2, i2);
        int size = l0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList<a> arrayList = l0;
            if (str.equals(arrayList.get(i3).f37591a)) {
                arrayList.remove(i3);
                break;
            }
        }
        l0.add(aVar);
    }

    private static String b(String str) {
        int size = l0.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = l0.get(i2);
            if (str.startsWith(aVar.f37592b)) {
                return aVar.f37591a;
            }
        }
        return null;
    }

    public static int c(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return 6;
            case "audio/vnd.dts":
                return 7;
            case "audio/ac3":
                return 5;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        String strA = null;
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) {
            return "video/avc";
        }
        if (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strTrim.startsWith("vp9") || strTrim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strTrim.startsWith("vp8") || strTrim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strTrim.startsWith("mp4a")) {
            if (strTrim.startsWith("mp4a.")) {
                String strSubstring = strTrim.substring(5);
                if (strSubstring.length() >= 2) {
                    try {
                        strA = a(Integer.parseInt(f0.l(strSubstring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return strA == null ? "audio/mp4a-latm" : strA;
        }
        if (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strTrim.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strTrim.startsWith("opus")) {
            return "audio/opus";
        }
        return strTrim.startsWith("vorbis") ? "audio/vorbis" : b(strTrim);
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) {
            return 4;
        }
        return g(str);
    }

    private static int g(String str) {
        int size = l0.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = l0.get(i2);
            if (str.equals(aVar.f37591a)) {
                return aVar.f37593c;
            }
        }
        return -1;
    }

    public static int h(String str) {
        return f(d(str));
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f0.a(str, ",")) {
            String strD = d(str2);
            if (strD != null && m(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return "application".equals(e(str));
    }

    public static boolean k(String str) {
        return "audio".equals(e(str));
    }

    public static boolean l(String str) {
        return "text".equals(e(str));
    }

    public static boolean m(String str) {
        return "video".equals(e(str));
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f0.a(str, ",")) {
            String strD = d(str2);
            if (strD != null && k(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static String a(int i2) {
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
        if (i2 == 165) {
            return "audio/ac3";
        }
        if (i2 != 166) {
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
                        default:
                            return null;
                    }
            }
        }
        return "audio/eac3";
    }
}
