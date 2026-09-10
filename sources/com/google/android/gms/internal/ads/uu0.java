package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f20902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashMap f20904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f20905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f20906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f20907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f20908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f20909i;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i10 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i10).length());
        d5.u.r(sb2, str, ", ", str2, ", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(i10);
        f20901a = sb2.toString();
        f20902b = new byte[0];
        f20903c = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f20905e = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f20906f = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f20907g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f20908h = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f20909i = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, InterfaceC0435l1.d.b.f29113j, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, InterfaceC0435l1.d.b.f29105b, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, InterfaceC0435l1.c.b.f29097c, InterfaceC0435l1.c.b.f29100f, 144, 151, 158, 153, 140, 139, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, InterfaceC0435l1.c.b.f29096b, InterfaceC0435l1.c.b.f29101g, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, 136, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, InterfaceC0435l1.d.b.f29112i, InterfaceC0435l1.d.b.f29108e, 97, InterfaceC0435l1.d.b.f29106c, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, InterfaceC0435l1.c.b.f29102h, 200, 221, 218, 211, 212, InterfaceC0435l1.d.b.f29109f, InterfaceC0435l1.d.b.f29111h, InterfaceC0435l1.d.b.f29107d, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, InterfaceC0435l1.d.b.f29114k, 120, 127, 106, InterfaceC0435l1.d.b.f29110g, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, InterfaceC0435l1.c.b.f29098d, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String a(int i10) {
        return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
    }

    public static int b(int i10, ByteOrder byteOrder) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i10 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i10 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static int c(int i10, ByteOrder byteOrder) {
        if (i10 == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i10 != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    public static boolean d(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4 || i10 == 1895825408 || i10 == 1879048192 || i10 == 1912602624;
    }

    public static int e(int i10) {
        int i11;
        int i12 = 6396;
        if (i10 != 10) {
            if (i10 == 16) {
                i11 = 205215996;
            } else if (i10 != 24) {
                switch (i10) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i10) {
                            case 12:
                                return 743676;
                            case 13:
                                i11 = 30136348;
                                break;
                            case 14:
                                i11 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            } else {
                i11 = 67108860;
            }
            i12 = 0;
        } else {
            i11 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i11 : i12;
    }

    public static int f(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    if (i10 == 1879048192) {
                                        return 8;
                                    }
                                    if (i10 != 1895825408) {
                                        if (i10 == 1912602624) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int g(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    case 27:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int h(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f20907g[(i12 >>> 24) ^ (bArr[i10] & 255)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean i(np0 np0Var, np0 np0Var2, Inflater inflater) {
        boolean z10;
        if (np0Var.B() > 0 && np0Var.I() == 120) {
            if (np0Var.B() == 0) {
                z10 = false;
            } else {
                if (np0Var2.f17880a.length < np0Var.B()) {
                    int iB = np0Var.B();
                    np0Var2.A(iB + iB);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(np0Var.f17880a, np0Var.f17881b, np0Var.B());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr = np0Var2.f17880a;
                        iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                        if (inflater.finished()) {
                            np0Var2.C(iInflate);
                            z10 = true;
                            break;
                        }
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            z10 = false;
                            break;
                        }
                        byte[] bArr2 = np0Var2.f17880a;
                        if (iInflate == bArr2.length) {
                            int length = bArr2.length;
                            np0Var2.A(length + length);
                        }
                    } catch (DataFormatException unused) {
                    } catch (Throwable th2) {
                        inflater.reset();
                        throw th2;
                    }
                }
                inflater.reset();
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int k(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i10 = Integer.parseInt(str2);
            return z10 ? -i10 : i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean l(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (x10.y(str, "moto g(20)") || x10.y(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && x10.y(Build.MODEL, "sm-x200");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    public static long m(long j10, long j11, long j12, RoundingMode roundingMode) {
        double dRint;
        long j13;
        long j14;
        boolean z10;
        long jY = pi1.y(j10, j11);
        if (jY != Long.MAX_VALUE && jY != Long.MIN_VALUE) {
            return pi1.b(jY, j12, roundingMode);
        }
        long jQ = pi1.q(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = pi1.b(j11, jQ, roundingMode2);
        long jB2 = pi1.b(j12, jQ, roundingMode2);
        long jQ2 = pi1.q(Math.abs(j10), Math.abs(jB2));
        long jB3 = pi1.b(j10, jQ2, roundingMode2);
        long jB4 = pi1.b(jB2, jQ2, roundingMode2);
        long jY2 = pi1.y(jB3, jB);
        if (jY2 != Long.MAX_VALUE && jY2 != Long.MIN_VALUE) {
            return pi1.b(jY2, jB4, roundingMode);
        }
        double d10 = (jB / jB4) * jB3;
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i10 = ac1.f11991a;
        if (!rb0.s(d10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zb1.f22576a[roundingMode.ordinal()]) {
            case 1:
                ps1.D(ac1.c(d10));
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf = String.valueOf(roundingMode);
                StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf.length());
                sb2.append("rounded value is out of range for input ");
                sb2.append(d10);
                sb2.append(" and rounding mode ");
                sb2.append(strValueOf);
                throw new ArithmeticException(sb2.toString());
            case 2:
                if (d10 >= 0.0d || ac1.c(d10)) {
                    dRint = d10;
                } else {
                    j13 = (long) d10;
                    j14 = -1;
                    dRint = j13 + j14;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf2 = String.valueOf(roundingMode);
                StringBuilder sb3 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf2.length());
                sb3.append("rounded value is out of range for input ");
                sb3.append(d10);
                sb3.append(" and rounding mode ");
                sb3.append(strValueOf2);
                throw new ArithmeticException(sb3.toString());
            case 3:
                if (d10 <= 0.0d || ac1.c(d10)) {
                    dRint = d10;
                } else {
                    j13 = (long) d10;
                    j14 = 1;
                    dRint = j13 + j14;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf3 = String.valueOf(roundingMode);
                StringBuilder sb4 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf3.length());
                sb4.append("rounded value is out of range for input ");
                sb4.append(d10);
                sb4.append(" and rounding mode ");
                sb4.append(strValueOf3);
                throw new ArithmeticException(sb4.toString());
            case 4:
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf4 = String.valueOf(roundingMode);
                StringBuilder sb5 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf4.length());
                sb5.append("rounded value is out of range for input ");
                sb5.append(d10);
                sb5.append(" and rounding mode ");
                sb5.append(strValueOf4);
                throw new ArithmeticException(sb5.toString());
            case 5:
                if (ac1.c(d10)) {
                    dRint = d10;
                } else {
                    dRint = ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf5 = String.valueOf(roundingMode);
                StringBuilder sb6 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf5.length());
                sb6.append("rounded value is out of range for input ");
                sb6.append(d10);
                sb6.append(" and rounding mode ");
                sb6.append(strValueOf5);
                throw new ArithmeticException(sb6.toString());
            case 6:
                dRint = Math.rint(d10);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf6 = String.valueOf(roundingMode);
                StringBuilder sb7 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf6.length());
                sb7.append("rounded value is out of range for input ");
                sb7.append(d10);
                sb7.append(" and rounding mode ");
                sb7.append(strValueOf6);
                throw new ArithmeticException(sb7.toString());
            case 7:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d10) + d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf7 = String.valueOf(roundingMode);
                StringBuilder sb8 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf7.length());
                sb8.append("rounded value is out of range for input ");
                sb8.append(d10);
                sb8.append(" and rounding mode ");
                sb8.append(strValueOf7);
                throw new ArithmeticException(sb8.toString());
            case 8:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                String strValueOf8 = String.valueOf(roundingMode);
                StringBuilder sb9 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf8.length());
                sb9.append("rounded value is out of range for input ");
                sb9.append(d10);
                sb9.append(" and rounding mode ");
                sb9.append(strValueOf8);
                throw new ArithmeticException(sb9.toString());
            default:
                throw new AssertionError();
        }
    }

    public static Object[] n(int i10, Object[] objArr) {
        ps1.v(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static Handler o() {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String strE = x10.e(str);
        int i10 = 0;
        String str2 = strE.split("-", 2)[0];
        if (f20904d == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f20905e;
            int length2 = strArr.length;
            HashMap map = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < 88; i11 += 2) {
                map.put(strArr[i11], strArr[i11 + 1]);
            }
            f20904d = map;
        }
        String str4 = (String) f20904d.get(str2);
        if (str4 != null) {
            strE = str4.concat(String.valueOf(strE.substring(str2.length())));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strE;
        }
        while (true) {
            String[] strArr2 = f20906f;
            int length3 = strArr2.length;
            if (i10 >= 18) {
                return strE;
            }
            if (strE.startsWith(strArr2[i10])) {
                return String.valueOf(strArr2[i10 + 1]).concat(String.valueOf(strE.substring(strArr2[i10].length())));
            }
            i10 += 2;
        }
    }

    public static int q(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    public static int r(long[] jArr, long j10, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static long s(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long t(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long u(int i10, long j10) {
        return v(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long v(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return pi1.b(j10, pi1.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return pi1.y(j10, pi1.b(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? m(j10, j11, j12, roundingMode) : pi1.y(j11, pi1.b(j10, j12, RoundingMode.UNNECESSARY));
        }
        return pi1.b(j11, pi1.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void w(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jB = pi1.b(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = pi1.b(jArr[i10], jB, roundingMode);
                i10++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jB2 = pi1.b(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = pi1.y(jArr[i10], jB2);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i11] = pi1.b(1000000L, pi1.b(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i11] = m(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i11] = pi1.y(1000000L, pi1.b(j12, j10, RoundingMode.UNNECESSARY));
                }
                j11 = j10;
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    public static long x(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }
}
