package androidx.media3.common;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.dataflow.qual.Pure;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes.dex */
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ArrayList<attabal> f11264attabal = new ArrayList<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Pattern f11265saneness = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f11266attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f11267saneness;
    }

    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f11268attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f11269saneness;

        public saneness(int i, int i2) {
            this.f11268attabal = i;
            this.f11269saneness = i2;
        }

        public int attabal() {
            int i = this.f11269saneness;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean apical(String str) {
        return "video".equals(marial(str));
    }

    public static boolean attabal(String str, String str2) {
        saneness sanenessVarWireman;
        int iAttabal;
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
                return (str2 == null || (sanenessVarWireman = wireman(str2)) == null || (iAttabal = sanenessVarWireman.attabal()) == 0 || iAttabal == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int beachfront(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (impromptu(str)) {
            return 1;
        }
        if (apical(str)) {
            return 2;
        }
        if (cutely(str)) {
            return 3;
        }
        if (taiyuan(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        return competently(str);
    }

    public static int competently(String str) {
        int size = f11264attabal.size();
        for (int i = 0; i < size; i++) {
            attabal attabalVar = f11264attabal.get(i);
            if (str.equals(attabalVar.f11266attabal)) {
                return attabalVar.f11267saneness;
            }
        }
        return -1;
    }

    @Pure
    public static boolean cutely(String str) {
        return "text".equals(marial(str)) || "application/x-media3-cues".equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static String dern(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case Opcodes.RET /* 169 */:
                    case Opcodes.IRETURN /* 172 */:
                        return MimeTypes.AUDIO_DTS;
                    case Opcodes.TABLESWITCH /* 170 */:
                    case Opcodes.LOOKUPSWITCH /* 171 */:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case Opcodes.FRETURN /* 174 */:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String formularize(String str) {
        if (str == null) {
            return null;
        }
        String strBeachfront = com.google.common.base.attabal.beachfront(str);
        strBeachfront.getClass();
        switch (strBeachfront) {
            case "audio/x-flac":
                return MimeTypes.AUDIO_FLAC;
            case "application/x-mpegurl":
                return MimeTypes.APPLICATION_M3U8;
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return MimeTypes.AUDIO_MPEG_L1;
            case "audio/mpeg-l2":
                return MimeTypes.AUDIO_MPEG_L2;
            case "audio/mp3":
                return MimeTypes.AUDIO_MPEG;
            default:
                return strBeachfront;
        }
    }

    public static boolean impromptu(String str) {
        return "audio".equals(marial(str));
    }

    public static String marial(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int saneness(String str, String str2) {
        saneness sanenessVarWireman;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (sanenessVarWireman = wireman(str2)) == null) {
                    return 0;
                }
                return sanenessVarWireman.attabal();
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

    public static boolean taiyuan(String str) {
        return "image".equals(marial(str)) || "application/x-image-uri".equals(str);
    }

    public static saneness wireman(String str) {
        Matcher matcher = f11265saneness.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) decarock.attabal.marial(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new saneness(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
