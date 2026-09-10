package decarock;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.PlaybackException;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.ads.AdSize;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class grimness {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Pattern f25078apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final int[] f25079arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int f25080attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final byte[] f25081beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final long[] f25082competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Pattern f25083cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f25084dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static HashMap<String, String> f25085formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final String[] f25086impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Pattern f25087impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final int[] f25088kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f25089marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int[] f25090monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f25091saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final Pattern f25092taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final String[] f25093triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f25094wireman;

    static {
        int i = Build.VERSION.SDK_INT;
        f25080attabal = i;
        String str = Build.DEVICE;
        f25091saneness = str;
        String str2 = Build.MANUFACTURER;
        f25084dern = str2;
        String str3 = Build.MODEL;
        f25094wireman = str3;
        f25089marial = str + ", " + str3 + ", " + str2 + ", " + i;
        f25081beachfront = new byte[0];
        f25082competently = new long[0];
        f25087impromptu = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f25092taiyuan = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f25083cutely = Pattern.compile("%([A-Fa-f0-9]{2})");
        f25078apical = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f25086impassible = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f25093triweekly = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f25088kowloon = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f25079arytenoidectomy = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f25090monoploid = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk$SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk$SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 196, Opcodes.MONITOREXIT, 202, 205, Opcodes.D2F, Opcodes.DCMPL, 158, 153, Opcodes.F2L, Opcodes.F2I, 130, 133, Opcodes.JSR, Opcodes.DRETURN, Opcodes.IF_ACMPNE, Opcodes.IF_ICMPLT, Opcodes.GETFIELD, Opcodes.PUTSTATIC, Opcodes.INVOKEDYNAMIC, 189, Opcodes.IFNONNULL, 192, 201, 206, Sdk$SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk$SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk$SDKError.Reason.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, Sdk$SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, Opcodes.INVOKESPECIAL, Opcodes.ARETURN, Opcodes.INVOKEINTERFACE, Opcodes.ARRAYLENGTH, Opcodes.LOOKUPSWITCH, Opcodes.IRETURN, Opcodes.IF_ACMPEQ, Opcodes.IF_ICMPGE, Opcodes.D2L, 136, 129, 134, Opcodes.I2S, Opcodes.LCMP, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, Opcodes.D2I, 135, 128, Opcodes.FCMPL, Opcodes.I2C, 155, 156, Opcodes.RETURN, Opcodes.INVOKEVIRTUAL, Opcodes.ATHROW, Opcodes.INVOKESTATIC, 173, Opcodes.TABLESWITCH, Opcodes.IF_ICMPGT, Opcodes.IF_ICMPLE, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk$SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, Opcodes.INSTANCEOF, Opcodes.IFNULL, 207, 200, Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk$SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, Sdk$SDKError.Reason.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, Opcodes.FRETURN, Opcodes.RET, 160, Opcodes.GOTO, Opcodes.GETSTATIC, Opcodes.PUTFIELD, Opcodes.NEWARRAY, Opcodes.NEW, Opcodes.FCMPG, Opcodes.I2B, Opcodes.DCMPG, Opcodes.IF_ICMPEQ, 138, Opcodes.F2D, 132, 131, Sdk$SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk$SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk$SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Opcodes.MONITORENTER, Opcodes.MULTIANEWARRAY, 204, 203, 230, Sdk$SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, AdSize.MEDIUM_RECTANGLE_HEIGHT, 253, 244, 243};
    }

    public static boolean achondroplasia(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || X3.i.b.equals(scheme);
    }

    public static int adultoid(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int iSaneness = com.google.common.primitives.competently.saneness(bArr[i]);
            i3 = dovishness(iSaneness & 15, dovishness(iSaneness >> 4, i3));
            i++;
        }
        return i3;
    }

    public static long apical(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static long arytenoidectomy(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static /* synthetic */ Thread attabal(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static <T> T[] attendance(T[] tArr, int i, int i2) {
        attabal.attabal(i >= 0);
        attabal.attabal(i2 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    public static void basify(long[] jArr, long j, long j2, RoundingMode roundingMode) {
        if (j == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long jSaneness = moresque.wireman.saneness(j2, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = moresque.wireman.saneness(jArr[i], jSaneness, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long jSaneness2 = moresque.wireman.saneness(j, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = moresque.wireman.wireman(jArr[i], jSaneness2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = moresque.wireman.saneness(j, moresque.wireman.saneness(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i2] = immediately(j3, j, j2, roundingMode);
                } else {
                    jArr[i2] = moresque.wireman.wireman(j, moresque.wireman.saneness(j3, j2, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static int beachfront(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static long cig(int i) {
        return ((long) i) & 4294967295L;
    }

    public static boolean claque(Context context) {
        return f25080attabal >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String clubfoot(Locale locale) {
        return locale.toLanguageTag();
    }

    public static List<String> coffeecake(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i & 1) != 0) {
            arrayList.add(BuildConfig.FLAVOR);
        }
        if ((i & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static String coi(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i < 10000) {
                    return "?";
                }
                return "custom (" + i + ")";
        }
    }

    public static int competently(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static Handler cord() {
        return cuirassed(null);
    }

    public static boolean cosy(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static Point creditor(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(X3.i.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) attabal.marial((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return starveling(context, display);
    }

    public static Handler cuirassed(Handler.Callback callback) {
        return preprohormone((Looper) attabal.taiyuan(Looper.myLooper()), callback);
    }

    public static long cultivated(long j) {
        return j == C.TIME_UNSET ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    public static int cutely(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static byte[] czestochowa(String str) {
        return str.getBytes(com.google.common.base.dern.f21534dern);
    }

    public static long deadwork(long j, long j2, long j3) {
        return sakeen(j, j2, j3, RoundingMode.FLOOR);
    }

    public static String demilitarize(String str) {
        int length = str.length();
        int iEnd = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i3 = length - (i * 2);
        StringBuilder sb = new StringBuilder(i3);
        Matcher matcher = f25083cutely.matcher(str);
        while (i > 0 && matcher.find()) {
            char c = (char) Integer.parseInt((String) attabal.marial(matcher.group(1)), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c);
            iEnd = matcher.end();
            i--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i3) {
            return null;
        }
        return sb.toString();
    }

    public static int dent(Context context) {
        return monroe(context) ? 1 : 5;
    }

    public static boolean dern(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static ExecutorService dhss(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: decarock.seminary
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return grimness.attabal(str, runnable);
            }
        });
    }

    public static int dovishness(int i, int i2) {
        int i3 = (i ^ ((i2 >> 12) & 255)) & 255;
        return (f25079arytenoidectomy[i3] ^ ((i2 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public static String empress(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            triweekly.wireman("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    public static long fastrack(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    public static void formularize(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int gintrap(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f25088kowloon[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static <T> int graveside(SparseArray<T> sparseArray) {
        if (f25080attabal >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i)) * 31) + Objects.hashCode(sparseArray.valueAt(i));
        }
        return iKeyAt;
    }

    public static androidx.media3.common.cord.saneness grimness(androidx.media3.common.cord cordVar, androidx.media3.common.cord.saneness sanenessVar) {
        boolean zIsPlayingAd = cordVar.isPlayingAd();
        boolean zTriweekly = cordVar.triweekly();
        boolean zImpassible = cordVar.impassible();
        boolean zCompetently = cordVar.competently();
        boolean zMonoploid = cordVar.monoploid();
        boolean zTaiyuan = cordVar.taiyuan();
        boolean zMonoploid2 = cordVar.getCurrentTimeline().monoploid();
        boolean z = false;
        androidx.media3.common.cord.saneness.attabal attabalVarWireman = new androidx.media3.common.cord.saneness.attabal().saneness(sanenessVar).wireman(4, !zIsPlayingAd).wireman(5, zTriweekly && !zIsPlayingAd).wireman(6, zImpassible && !zIsPlayingAd).wireman(7, !zMonoploid2 && (zImpassible || !zMonoploid || zTriweekly) && !zIsPlayingAd).wireman(8, zCompetently && !zIsPlayingAd).wireman(9, !zMonoploid2 && (zCompetently || (zMonoploid && zTaiyuan)) && !zIsPlayingAd).wireman(10, !zIsPlayingAd).wireman(11, zTriweekly && !zIsPlayingAd);
        if (zTriweekly && !zIsPlayingAd) {
            z = true;
        }
        return attabalVarWireman.wireman(12, z).marial();
    }

    public static boolean gusty(Context context) {
        return f25080attabal >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int hardpan(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static String herdbook(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f25093triweekly;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    public static boolean homozygous(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper hydrovane() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static String igbo(int i) {
        return Integer.toString(i, 36);
    }

    public static long immediately(long j, long j2, long j3, RoundingMode roundingMode) {
        long jWireman = moresque.wireman.wireman(j, j2);
        if (jWireman != Long.MAX_VALUE && jWireman != Long.MIN_VALUE) {
            return moresque.wireman.saneness(jWireman, j3, roundingMode);
        }
        long jDern = moresque.wireman.dern(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jSaneness = moresque.wireman.saneness(j2, jDern, roundingMode2);
        long jSaneness2 = moresque.wireman.saneness(j3, jDern, roundingMode2);
        long jDern2 = moresque.wireman.dern(Math.abs(j), Math.abs(jSaneness2));
        long jSaneness3 = moresque.wireman.saneness(j, jDern2, roundingMode2);
        long jSaneness4 = moresque.wireman.saneness(jSaneness2, jDern2, roundingMode2);
        long jWireman2 = moresque.wireman.wireman(jSaneness3, jSaneness);
        if (jWireman2 != Long.MAX_VALUE && jWireman2 != Long.MIN_VALUE) {
            return moresque.wireman.saneness(jWireman2, jSaneness4, roundingMode);
        }
        double d = jSaneness3 * (jSaneness / jSaneness4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return moresque.attabal.dern(d, roundingMode);
    }

    public static int impassible(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static List<String> itchy(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add(X3.i.Z);
        }
        if ((i & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static boolean julian(int i) {
        return i == 10 || i == 13;
    }

    public static String kattegat(byte[] bArr) {
        return new String(bArr, com.google.common.base.dern.f21534dern);
    }

    public static int kowloon(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static boolean lampshade(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int lerp(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static long libyan(long j, int i) {
        return sakeen(j, 1000000L, i, RoundingMode.FLOOR);
    }

    public static String[] licking(String str, String str2) {
        return str.split(str2, 2);
    }

    public static boolean lightstruck(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static void linendraper(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static String[] lotta() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f25080attabal >= 24 ? sayid(configuration) : new String[]{overspeculate(configuration.locale)};
    }

    public static int marial(kowloon kowloonVar, long j, boolean z, boolean z2) {
        int i;
        int iDern = kowloonVar.dern() - 1;
        int i2 = 0;
        while (i2 <= iDern) {
            int i3 = (i2 + iDern) >>> 1;
            if (kowloonVar.saneness(i3) < j) {
                i2 = i3 + 1;
            } else {
                iDern = i3 - 1;
            }
        }
        if (z && (i = iDern + 1) < kowloonVar.dern() && kowloonVar.saneness(i) == j) {
            return i;
        }
        if (z2 && iDern == -1) {
            return 0;
        }
        return iDern;
    }

    public static <T> T[] mastfed(T[] tArr, int i) {
        attabal.attabal(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static int mathsort(String str) {
        String[] strArrOsteal;
        int length;
        int i = 0;
        if (str == null || (length = (strArrOsteal = osteal(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrOsteal[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrOsteal[length - 2]);
        try {
            i = Integer.parseInt((String) attabal.marial(str2));
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    public static int merc(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
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
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static ComponentName microchemistry(Context context, Intent intent) {
        return f25080attabal >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static int milliradian(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i2 * 3;
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static void molet(long[] jArr, long j, long j2) {
        basify(jArr, j, j2, RoundingMode.FLOOR);
    }

    public static <T> boolean molybdenite(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f25080attabal >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean monoploid(SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static boolean monroe(Context context) {
        int i = f25080attabal;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i != 30) {
            return false;
        }
        String str = f25094wireman;
        return com.google.common.base.attabal.attabal(str, "moto g(20)") || com.google.common.base.attabal.attabal(str, "rmx3231");
    }

    public static String[] nosophobia() {
        String[] strArrLotta = lotta();
        for (int i = 0; i < strArrLotta.length; i++) {
            strArrLotta[i] = vesuvio(strArrLotta[i]);
        }
        return strArrLotta;
    }

    public static HashMap<String, String> oilcan() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f25086impassible.length);
        int i = 0;
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
            String[] strArr = f25086impassible;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static String[] osteal(String str, String str2) {
        return str.split(str2, -1);
    }

    public static long outmarry(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static String overspeculate(Locale locale) {
        return f25080attabal >= 21 ? clubfoot(locale) : locale.toString();
    }

    public static boolean palmyra(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static int peridotite(int i) {
        if (i == 2 || i == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static long permissivist(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static boolean picketboat(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return f25080attabal >= 34;
            case "image/heic":
            case "image/heif":
                return f25080attabal >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static AudioFormat polder(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static boolean polloi(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (dern(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int premeiotic(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    public static Handler preprohormone(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static int preterite(Uri uri, String str) {
        if (str == null) {
            return sensatory(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static String privatdozent(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return com.google.common.base.attabal.competently(networkCountryIso);
            }
        }
        return com.google.common.base.attabal.competently(Locale.getDefault().getCountry());
    }

    public static String pruinose(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    public static int restrictive(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int rotuma(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f25090monoploid[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    public static long sakeen(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return moresque.wireman.saneness(j, moresque.wireman.saneness(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return moresque.wireman.wireman(j, moresque.wireman.saneness(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 < j || j3 % j != 0) {
            return (j3 >= j || j % j3 != 0) ? immediately(j, j2, j3, roundingMode) : moresque.wireman.wireman(j2, moresque.wireman.saneness(j, j3, RoundingMode.UNNECESSARY));
        }
        return moresque.wireman.saneness(j2, moresque.wireman.saneness(j3, j, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long saneness(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    public static int saran(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static String[] sayid(Configuration configuration) {
        return osteal(configuration.getLocales().toLanguageTags(), ",");
    }

    public static String sealless(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int seminary(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f25080attabal >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static int sensatory(Uri uri) {
        int iUnderbelly;
        String scheme = uri.getScheme();
        if (scheme != null && com.google.common.base.attabal.attabal("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iUnderbelly = underbelly(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iUnderbelly;
        }
        Matcher matcher = f25078apical.matcher((CharSequence) attabal.marial(uri.getPath()));
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

    public static <T> T[] setterwort(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static String splinterproof(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static Point starveling(Context context, Display display) {
        if (display.getDisplayId() == 0 && unconsolidated(context)) {
            String strEmpress = f25080attabal < 28 ? empress("sys.display-size") : empress("vendor.display-size");
            if (!TextUtils.isEmpty(strEmpress)) {
                try {
                    String[] strArrOsteal = osteal(strEmpress.trim(), "x");
                    if (strArrOsteal.length == 2) {
                        int i = Integer.parseInt(strArrOsteal[0]);
                        int i2 = Integer.parseInt(strArrOsteal[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                triweekly.dern("Util", "Invalid display size: " + strEmpress);
            }
            if ("Sony".equals(f25084dern) && f25094wireman.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f25080attabal >= 23) {
            walach(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static Handler stratoscope() {
        return trm(null);
    }

    public static long sultanate(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static String supplicat(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, com.google.common.base.dern.f21534dern);
    }

    public static long tarboosh(int i, int i2) {
        return cig(i2) | (cig(i) << 32);
    }

    public static <T> void technofreak(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    public static void tectonization(Throwable th) throws Throwable {
        prefect(th);
    }

    public static androidx.media3.common.polloi timberyard(int i, int i2, int i3) {
        return new androidx.media3.common.polloi.saneness().sensatory(MimeTypes.AUDIO_RAW).saran(i2).underbelly(i3).nosophobia(i).polder();
    }

    public static long treadless(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    public static float triweekly(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static Handler trm(Handler.Callback callback) {
        return preprohormone(hydrovane(), callback);
    }

    public static boolean unconsolidated(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int underbelly(String str) {
        String strBeachfront = com.google.common.base.attabal.beachfront(str);
        strBeachfront.getClass();
        switch (strBeachfront) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static String vesuvio(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', SignatureVisitor.SUPER);
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String strBeachfront = com.google.common.base.attabal.beachfront(str);
        String str2 = licking(strBeachfront, "-")[0];
        if (f25085formularize == null) {
            f25085formularize = oilcan();
        }
        String str3 = f25085formularize.get(str2);
        if (str3 != null) {
            strBeachfront = str3 + strBeachfront.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? herdbook(strBeachfront) : strBeachfront;
    }

    public static void walach(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static int wireman(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            while (true) {
                i = iBinarySearch + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static boolean wostteth(stratoscope stratoscopeVar, stratoscope stratoscopeVar2, Inflater inflater) {
        if (stratoscopeVar.attabal() <= 0) {
            return false;
        }
        if (stratoscopeVar2.saneness() < stratoscopeVar.attabal()) {
            stratoscopeVar2.dern(stratoscopeVar.attabal() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(stratoscopeVar.marial(), stratoscopeVar.beachfront(), stratoscopeVar.attabal());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(stratoscopeVar2.marial(), iInflate, stratoscopeVar2.saneness() - iInflate);
                if (inflater.finished()) {
                    stratoscopeVar2.peridotite(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == stratoscopeVar2.saneness()) {
                        stratoscopeVar2.dern(stratoscopeVar2.saneness() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static long yemenite(long j, int i) {
        return sakeen(j, i, 1000000L, RoundingMode.CEILING);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T impromptu(T t) {
        return t;
    }

    public static <T extends Throwable> void prefect(Throwable th) throws Throwable {
        throw th;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] taiyuan(T[] tArr) {
        return tArr;
    }
}
