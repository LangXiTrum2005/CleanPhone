package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.smartdigimkt.x.d;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfj {
    public static final String zza;
    public static final byte[] zzb;
    private static final Pattern zzc;
    private static HashMap zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i2 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i2).length());
        androidx.media3.extractor.text.ttml.a.C(sb, str, ", ", str2, ", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        zza = sb.toString();
        zzb = new byte[0];
        zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new String[]{"alb", NativeAdvancedJsUtils.o, "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", com.smartdigimkt.d2.a.S, "cze", "cs", b.p0, "nl", "ger", "de", "gre", "el", "fre", com.smartdigimkt.d2.a.W, "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", com.smartdigimkt.q0.b.Z0, "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", com.smartdigimkt.q0.b.W0, "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, BaseATView.g.f38289J, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 131, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static boolean zzA(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static int zzB(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 != 10) {
            if (i2 == 16) {
                i3 = 205215996;
            } else if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i2) {
                            case 12:
                                return 743676;
                            case 13:
                                i3 = 30136348;
                                break;
                            case 14:
                                i3 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            } else {
                i3 = 67108860;
            }
            i4 = 0;
        } else {
            i3 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    public static int zzC(int i2) {
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i2) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static int zzD(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalArgumentException();
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

    public static int zzE(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
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
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    public static int zzF(Uri uri) {
        byte b2;
        int i2;
        String scheme = uri.getScheme();
        if (scheme != null && (zzgpj.zze("rtsp", scheme) || zzgpj.zze("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (zzgpj.zza(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    b2 = 2;
                    break;
                case "mpd":
                    b2 = 0;
                    break;
                case "isml":
                    b2 = 3;
                    break;
                case "m3u8":
                    b2 = 1;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                i2 = 0;
            } else if (b2 != 1) {
                i2 = (b2 == 2 || b2 == 3) ? 1 : 4;
            } else {
                i2 = 2;
            }
            if (i2 != 4) {
                return i2;
            }
        }
        Pattern pattern = zzc;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int zzG(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = zzg[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int zzH(byte[] bArr, int i2, int i3, int i4) {
        int iZzT = 65535;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = bArr[i5];
            iZzT = zzT(b2 & 15, zzT((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4, iZzT));
        }
        return iZzT;
    }

    public static int zzI(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i2 < i3) {
            i5 = zzi[i5 ^ (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
            i2++;
        }
        return i5;
    }

    public static int zzJ(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static boolean zzK(zzer zzerVar, zzer zzerVar2, Inflater inflater) {
        boolean z2 = false;
        if (zzerVar.zzd() == 0) {
            return false;
        }
        if (zzerVar2.zzj() < zzerVar.zzd()) {
            int iZzd = zzerVar.zzd();
            zzerVar2.zzc(iZzd + iZzd);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzerVar.zzi(), zzerVar.zzg(), zzerVar.zzd());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(zzerVar2.zzi(), iInflate, zzerVar2.zzj() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == zzerVar2.zzj()) {
                        int iZzj = zzerVar2.zzj();
                        zzerVar2.zzc(iZzj + iZzj);
                    }
                } else {
                    zzerVar2.zzf(iInflate);
                    z2 = true;
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z2;
    }

    public static boolean zzL(zzer zzerVar, zzer zzerVar2, Inflater inflater) {
        return zzerVar.zzd() > 0 && zzerVar.zzn() == 120 && zzK(zzerVar, zzerVar2, inflater);
    }

    public static boolean zzM(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzN(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point zzO(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(d9.h.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzM(context)) {
            String strZzU = Build.VERSION.SDK_INT < 28 ? zzU("sys.display-size") : zzU("vendor.display-size");
            if (!TextUtils.isEmpty(strZzU)) {
                try {
                    String[] strArrSplit = strZzU.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzee.zze("Util", "Invalid display size: ".concat(String.valueOf(strZzU)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String zzP(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return d.c.k;
            case 5:
                return TtmlNode.TAG_METADATA;
            default:
                return "camera motion";
        }
    }

    public static int zzQ(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z2 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i2 = Integer.parseInt(str2);
            return z2 ? -i2 : i2;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean zzR(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (zzgpj.zze(str, "moto g(20)") || zzgpj.zze(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && zzgpj.zze(Build.MODEL, "sm-x200");
    }

    private static long zzS(long j, long j2, long j3, RoundingMode roundingMode) {
        long jZzc = zzgws.zzc(j, j2);
        if (jZzc != Long.MAX_VALUE && jZzc != Long.MIN_VALUE) {
            return zzgws.zza(jZzc, j3, roundingMode);
        }
        long jZzb = zzgws.zzb(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZza = zzgws.zza(j2, jZzb, roundingMode2);
        long jZza2 = zzgws.zza(j3, jZzb, roundingMode2);
        long jZzb2 = zzgws.zzb(Math.abs(j), Math.abs(jZza2));
        long jZza3 = zzgws.zza(j, jZzb2, roundingMode2);
        long jZza4 = zzgws.zza(jZza2, jZzb2, roundingMode2);
        long jZzc2 = zzgws.zzc(jZza3, jZza);
        if (jZzc2 != Long.MAX_VALUE && jZzc2 != Long.MIN_VALUE) {
            return zzgws.zza(jZzc2, jZza4, roundingMode);
        }
        double d = (jZza / jZza4) * jZza3;
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgwn.zza(d, roundingMode);
    }

    private static int zzT(int i2, int i3) {
        return (char) (zzh[(i2 ^ (i3 >> 12)) & 255] ^ ((char) (i3 << 4)));
    }

    private static String zzU(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            zzee.zzf("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    private static HashMap zzV() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap map = new HashMap(length + 88);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i2 >= 88) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static boolean zza(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static Object[] zzb(Object[] objArr, int i2) {
        zzgqa.zza(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static Handler zzc(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    public static boolean zzd(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper zze() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ExecutorService zzf(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfi
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = zzfj.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService zzg(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzfh
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = zzfj.zza;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzgpj.zza(str);
        int i2 = 0;
        String str2 = strZza.split(TokenBuilder.TOKEN_DELIMITER, 2)[0];
        if (zzd == null) {
            zzd = zzV();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || i.f37957c.equals(str2) || com.smartdigimkt.d2.a.S.equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i2 >= 18) {
                    break;
                }
                if (strZza.startsWith(strArr[i2])) {
                    return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(strZza.substring(strArr[i2].length())));
                }
                i2 += 2;
            }
        }
        return strZza;
    }

    public static String zzi(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzj(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static boolean zzk(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static int zzl(int[] iArr, int i2, boolean z2, boolean z3) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z2 ? iBinarySearch : i3;
        }
        return z3 ? Math.max(0, i4) : i4;
    }

    public static int zzm(long[] jArr, long j, boolean z2, boolean z3) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z3 ? Math.max(0, i2) : i2;
    }

    public static int zzn(zzef zzefVar, long j, boolean z2, boolean z3) {
        int iZzd = zzefVar.zzd() - 1;
        int i2 = 0;
        while (i2 <= iZzd) {
            int i3 = (i2 + iZzd) >>> 1;
            if (zzefVar.zzc(i3) < j) {
                i2 = i3 + 1;
            } else {
                iZzd = i3 - 1;
            }
        }
        int i4 = iZzd + 1;
        if (i4 < zzefVar.zzd() && zzefVar.zzc(i4) == j) {
            return i4;
        }
        if (iZzd == -1) {
            return 0;
        }
        return iZzd;
    }

    public static int zzo(long[] jArr, long j, boolean z2, boolean z3) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j) {
                break;
            }
            iBinarySearch = i2;
        }
        return !z2 ? i2 : iBinarySearch;
    }

    public static long zzp(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long zzq(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzr(long j, int i2) {
        return zzt(j, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long zzs(long j, int i2) {
        return zzt(j, i2, 1000000L, RoundingMode.UP);
    }

    public static long zzt(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return zzgws.zza(j, zzgws.zza(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return zzgws.zzc(j, zzgws.zza(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 < j || j3 % j != 0) {
            return (j3 >= j || j % j3 != 0) ? zzS(j, j2, j3, roundingMode) : zzgws.zzc(j2, zzgws.zza(j, j3, RoundingMode.UNNECESSARY));
        }
        return zzgws.zza(j2, zzgws.zza(j3, j, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void zzu(long[] jArr, long j, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jZza = zzgws.zza(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = zzgws.zza(jArr[i2], jZza, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jZza2 = zzgws.zza(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = zzgws.zzc(jArr[i2], jZza2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = zzgws.zza(1000000L, zzgws.zza(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = zzS(j4, 1000000L, j3, roundingMode);
                } else {
                    jArr[i3] = zzgws.zzc(1000000L, zzgws.zza(j4, j2, RoundingMode.UNNECESSARY));
                }
                j3 = j2;
            } else {
                j3 = j2;
            }
            i3++;
            j2 = j3;
        }
    }

    public static long zzv(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static long zzw(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    public static String zzx(int i2) {
        return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
    }

    public static zzv zzy(int i2, int i3, int i4) {
        zzt zztVar = new zzt();
        zztVar.zzm("audio/raw");
        zztVar.zzE(i3);
        zztVar.zzF(i4);
        zztVar.zzG(i2);
        return zztVar.zzM();
    }

    public static int zzz(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }
}
