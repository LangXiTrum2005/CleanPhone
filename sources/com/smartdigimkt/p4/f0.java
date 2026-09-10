package com.smartdigimkt.p4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.thinkup.core.common.n.mo;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37542c;
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37543e;
    private static final String f = "Util";
    private static final Pattern g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f37544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f37545i;
    private static final int[] j;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37546a;

        public a(String str) {
            this.f37546a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f37546a);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i2 = 26;
        }
        f37540a = i2;
        String str = Build.DEVICE;
        f37541b = str;
        String str2 = Build.MANUFACTURER;
        f37542c = str2;
        String str3 = Build.MODEL;
        d = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        f37543e = androidx.datastore.preferences.protobuf.a.g(i2, ", ", sb);
        g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f37544h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f37545i = Pattern.compile("%([A-Fa-f0-9]{2})");
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    private f0() {
    }

    public static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 1) {
            return 13;
        }
        if (i2 == 2) {
            return 6;
        }
        int i3 = 4;
        if (i2 != 4) {
            i3 = 5;
            if (i2 != 5) {
                return i2 != 8 ? 1 : 3;
            }
        }
        return i3;
    }

    public static long c(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        return (long) (j2 * (j3 / j4));
    }

    public static int d(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int e(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
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

    public static boolean f(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static boolean g(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static boolean h(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static long i(String str) throws com.smartdigimkt.w3.t {
        int i2;
        Matcher matcher = g.matcher(str);
        if (!matcher.matches()) {
            throw new com.smartdigimkt.w3.t(android.support.v4.media.a.C("Invalid date/time format: ", str));
        }
        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = 0;
        } else {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (TokenBuilder.TOKEN_DELIMITER.equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - ((long) (i2 * 60000)) : timeInMillis;
    }

    public static long j(String str) {
        Matcher matcher = f37544h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String m(String str) {
        int length = str.length();
        int iEnd = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = f37545i.matcher(str);
        while (i2 > 0 && matcher.find()) {
            char c2 = (char) Integer.parseInt(matcher.group(1), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    public static long a(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    public static int b(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static long d(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    public static byte[] e(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static int f(String str) {
        String strK = k(str);
        if (strK.endsWith(".mpd")) {
            return 0;
        }
        if (strK.endsWith(".m3u8")) {
            return 2;
        }
        return strK.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    public static ExecutorService g(String str) {
        return Executors.newSingleThreadExecutor(new a(str));
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return k(str);
        }
    }

    private static boolean a(char c2) {
        return c2 == '\"' || c2 == '%' || c2 == '*' || c2 == '/' || c2 == ':' || c2 == '<' || c2 == '\\' || c2 == '|' || c2 == '>' || c2 == '?';
    }

    public static boolean b(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || d9.h.f24719b.equals(scheme);
    }

    public static int d(String str) {
        int length = str.length();
        com.smartdigimkt.p4.a.a(length <= 4);
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt << 8) | str.charAt(i2);
        }
        return iCharAt;
    }

    public static boolean a(Activity activity, Uri... uriArr) {
        return false;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 != -1) {
                byteArrayOutputStream.write(bArr, 0, i2);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static long b(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static String c(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        return android.support.v4.media.a.r(sb, Build.VERSION.RELEASE, ") ExoPlayerLib/2.8.4");
    }

    private static void d(Display display, Point point) {
        point.x = display.getWidth();
        point.y = display.getHeight();
    }

    public static int b(long[] jArr, long j2, boolean z2, boolean z3) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z2 ? iBinarySearch : i2;
        }
        return z3 ? Math.max(0, i3) : i3;
    }

    public static ComponentName a(Context context, Intent intent) {
        if (f37540a >= 26) {
            return context.startForegroundService(intent);
        }
        return context.startService(intent);
    }

    public static <T> int b(List<? extends Comparable<? super T>> list, T t, boolean z2, boolean z3) {
        int i2;
        int i3;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z2 ? iBinarySearch : i2;
        }
        return z3 ? Math.max(0, i3) : i3;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static long b(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
    }

    public static boolean a(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Character.digit(str.charAt(i3 + 1), 16) + (Character.digit(str.charAt(i3), 16) << 4));
        }
        return bArr;
    }

    public static UUID c(String str) {
        String strK = k(str);
        strK.getClass();
        switch (strK) {
            case "playready":
                return com.smartdigimkt.w3.b.l1;
            case "widevine":
                return com.smartdigimkt.w3.b.k1;
            case "clearkey":
                return com.smartdigimkt.w3.b.j1;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static <T> void a(List<T> list, int i2, int i3) {
        list.subList(i2, i3).clear();
    }

    public static <T> T[] a(T[] tArr, int i2) {
        com.smartdigimkt.p4.a.a(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static int b(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return i3 * 3;
        }
        if (i2 != 1073741824) {
            if (i2 == 2) {
                return i3 * 2;
            }
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i3 * 4;
    }

    private static <T extends Throwable> void b(Throwable th) throws Throwable {
        throw th;
    }

    public static void a(com.smartdigimkt.n4.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static File b(Context context, String str) throws IOException {
        return File.createTempFile(str, null, context.getCacheDir());
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void b(Display display, Point point) {
        display.getRealSize(point);
    }

    public static int c(int i2) {
        if (i2 == 0) {
            return 16777216;
        }
        if (i2 == 1) {
            return 3538944;
        }
        if (i2 == 2) {
            return 13107200;
        }
        if (i2 == 3 || i2 == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    private static void c(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void a(Parcel parcel, boolean z2) {
        parcel.writeInt(z2 ? 1 : 0);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static String a(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName("UTF-8"));
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int a(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static long a(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static int a(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int a(int[] iArr, int i2, boolean z2, boolean z3) {
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

    public static int a(long[] jArr, long j2, boolean z2, boolean z3) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z2 ? iBinarySearch : i2;
        }
        return z3 ? Math.min(jArr.length - 1, i3) : i3;
    }

    public static <T> int a(List<? extends Comparable<? super T>> list, T t, boolean z2, boolean z3) {
        int i2;
        int i3;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= size || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z2 ? iBinarySearch : i2;
        }
        return z3 ? Math.min(list.size() - 1, i3) : i3;
    }

    public static long[] a(List<Long> list, long j2, long j3) {
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() / j4;
                i2++;
            }
        } else if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = j2 / j3;
            while (i2 < size) {
                jArr[i2] = (long) (list.get(i2).longValue() * d2);
                i2++;
            }
        } else {
            long j5 = j2 / j3;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() * j5;
                i2++;
            }
        }
        return jArr;
    }

    public static void a(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 < j2 && j2 % j3 == 0) {
            long j5 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
            return;
        }
        double d2 = j2 / j3;
        while (i2 < jArr.length) {
            jArr[i2] = (long) (jArr[i2] * d2);
            i2++;
        }
    }

    public static long a(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e A[RETURN] */
    public static long a(long j2, com.smartdigimkt.w3.c0 c0Var, long j3, long j4) {
        if (com.smartdigimkt.w3.c0.f39230c.equals(c0Var)) {
            return j2;
        }
        long jD = d(j2, c0Var.f39232a, Long.MIN_VALUE);
        long jA = a(j2, c0Var.f39233b, Long.MAX_VALUE);
        boolean z2 = false;
        boolean z3 = jD <= j3 && j3 <= jA;
        if (jD <= j4 && j4 <= jA) {
            z2 = true;
        }
        if (z3 && z2) {
            if (Math.abs(j3 - j2) <= Math.abs(j4 - j2)) {
                return j3;
            }
            return j4;
        }
        if (!z3) {
            if (z2) {
                return j4;
            }
            return jD;
        }
        return j3;
    }

    public static int[] a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        return iArr;
    }

    public static String a(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static String a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrA = a(str.trim(), "(\\s*,\\s*)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrA) {
            if (i2 == o.h(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int a(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            return a(uri);
        }
        return f(mo.ono + str);
    }

    public static int a(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return f(path);
    }

    public static String a(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long j3 = (j2 + 500) / 1000;
        long j4 = j3 % 60;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 / com.smartdigimkt.o1.b.f37307P;
        sb.setLength(0);
        if (j6 > 0) {
            return formatter.format("%d:%02d:%02d", Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)).toString();
        }
        return formatter.format("%02d:%02d", Long.valueOf(j5), Long.valueOf(j4)).toString();
    }

    public static String a(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (a(str.charAt(i4))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i3 * 2) + length);
        while (i3 > 0) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (a(cCharAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(cCharAt));
                i3--;
            } else {
                sb.append(cCharAt);
            }
            i2 = i5;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        return sb.toString();
    }

    public static void a(Throwable th) throws Throwable {
        b(th);
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        file.delete();
    }

    public static File a(Context context, String str) throws IOException {
        File fileB = b(context, str);
        fileB.delete();
        fileB.mkdir();
        return fileB;
    }

    public static int a(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = j[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Point a(Context context) {
        return a(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[Catch: NumberFormatException -> 0x00c2, TryCatch #1 {NumberFormatException -> 0x00c2, blocks: (B:32:0x009c, B:34:0x00aa, B:37:0x00bc), top: B:54:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Point a(Context context, Display display) {
        String str;
        String[] strArrA;
        int i2;
        int i3;
        if (f37540a < 25 && display.getDisplayId() == 0) {
            String str2 = f37542c;
            if ("Sony".equals(str2) && d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (!"NVIDIA".equals(str2) || !d.contains("SHIELD")) {
                if ("philips".equals(k(str2))) {
                    String str3 = d;
                    if (str3.startsWith("QM1") || str3.equals("QV151E") || str3.equals("TPM171E")) {
                        try {
                            Class<?> cls = Class.forName("android.os.SystemProperties");
                            str = (String) cls.getMethod("get", String.class).invoke(cls, "sys.display-size");
                        } catch (Exception e2) {
                            Log.e(f, "Failed to read sys.display-size", e2);
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                strArrA = a(str.trim(), "x");
                                if (strArrA.length == 2) {
                                    i2 = Integer.parseInt(strArrA[0]);
                                    i3 = Integer.parseInt(strArrA[1]);
                                    if (i2 > 0 && i3 > 0) {
                                        return new Point(i2, i3);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            Log.e(f, "Invalid sys.display-size: " + str);
                        }
                    }
                }
            } else {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                str = (String) cls2.getMethod("get", String.class).invoke(cls2, "sys.display-size");
                if (!TextUtils.isEmpty(str)) {
                    strArrA = a(str.trim(), "x");
                    if (strArrA.length == 2) {
                        i2 = Integer.parseInt(strArrA[0]);
                        i3 = Integer.parseInt(strArrA[1]);
                        if (i2 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                    Log.e(f, "Invalid sys.display-size: " + str);
                }
            }
        }
        Point point = new Point();
        int i4 = f37540a;
        if (i4 >= 23) {
            c(display, point);
        } else if (i4 >= 17) {
            b(display, point);
        } else if (i4 >= 16) {
            a(display, point);
        } else {
            d(display, point);
        }
        return point;
    }

    private static void a(Display display, Point point) {
        display.getSize(point);
    }
}
