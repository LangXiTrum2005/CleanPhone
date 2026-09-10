package com.thinkup.core.common.no.m.o;

import android.support.v4.media.a;
import android.support.v4.media.session.PlaybackStateCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.no.m.m0o;
import com.thinkup.core.common.no.m.om0;
import com.thinkup.core.common.no.m.onn;
import com.thinkup.core.common.no.m.oom;
import com.thinkup.core.common.no.m.ooo;
import com.thinkup.core.common.no.n.nn;
import com.thinkup.core.common.no.n.om;
import com.thinkup.core.common.no.n.oo;
import com.thinkup.core.common.no.n.oon;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private static final Method mn;
    private static final Pattern n0;
    public static final byte[] o;
    public static final m0o o0;
    public static final onn oo;
    public static final String[] m = new String[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ooo f42026n = ooo.o(new String[0]);
    private static final nn m0 = nn.o(om.n("efbbbf"), om.n("feff"), om.n("fffe"), om.n("0000ffff"), om.n("ffff0000"));
    private static final Charset mo = Charset.forName("UTF-32BE");
    private static final Charset mm = Charset.forName("UTF-32LE");
    public static final TimeZone om = DesugarTimeZone.getTimeZone("GMT");
    public static final Comparator<String> on = new Comparator<String>() { // from class: com.thinkup.core.common.no.m.o.n.1
        private static int o(String str, String str2) {
            return str.compareTo(str2);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    };

    static {
        byte[] bArr = new byte[0];
        o = bArr;
        Method declaredMethod = null;
        o0 = m0o.o((om0) null, bArr);
        oo = onn.o((om0) null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        mn = declaredMethod;
        n0 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    private n() {
    }

    public static boolean m(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String n(String str, int i2, int i3) {
        int iO = o(str, i2, i3);
        return str.substring(iO, m(str, iO, i3));
    }

    public static int o(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    private static boolean o0(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void o(Throwable th, Throwable th2) {
        Method method = mn;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static boolean n(String str) {
        return n0.matcher(str).matches();
    }

    public static void o(long j, long j2) {
        if (j2 < 0 || 0 > j || j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9 A[LOOP:1: B:58:0x00ad->B:61:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x00bf A[EDGE_INSN: B:88:0x00bf->B:62:0x00bf BREAK  A[LOOP:1: B:58:0x00ad->B:61:0x00b9], SYNTHETIC] */
    private static InetAddress o0(String str, int i2, int i3) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        int i4;
        int i5;
        int iO;
        byte[] bArr = new byte[16];
        int i6 = i2;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (true) {
            InetAddress inetAddress3 = null;
            if (i6 >= i3) {
                inetAddress = null;
                break;
            }
            if (i7 == 16) {
                return null;
            }
            int i10 = i6 + 2;
            if (i10 <= i3 && str.regionMatches(i6, "::", 0, 2)) {
                if (i8 != -1) {
                    return null;
                }
                i7 += 2;
                i8 = i7;
                inetAddress = null;
                if (i10 == i3) {
                    break;
                }
                i9 = i10;
                i4 = 0;
                i6 = i9;
                while (i6 < i3) {
                    iO = o(str.charAt(i6));
                    if (iO != -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iO;
                    i6++;
                }
                i5 = i6 - i9;
                if (i5 != 0) {
                }
                return inetAddress;
            }
            if (i7 == 0) {
                inetAddress = null;
                i9 = i6;
            } else {
                if (!str.regionMatches(i6, ":", 0, 1)) {
                    if (!str.regionMatches(i6, mo.ono, 0, 1)) {
                        return null;
                    }
                    int i11 = i7 - 2;
                    int i12 = i11;
                    while (i9 < i3) {
                        if (i12 != 16) {
                            if (i12 != i11) {
                                if (str.charAt(i9) == '.') {
                                    i9++;
                                }
                            }
                            int i13 = 0;
                            int i14 = i9;
                            while (true) {
                                if (i14 >= i3) {
                                    inetAddress2 = inetAddress3;
                                    break;
                                }
                                char cCharAt = str.charAt(i14);
                                inetAddress2 = inetAddress3;
                                if (cCharAt < '0' || cCharAt > '9') {
                                    break;
                                }
                                if ((i13 == 0 && i9 != i14) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                                    return inetAddress2;
                                }
                                i14++;
                                inetAddress3 = inetAddress2;
                            }
                            if (i14 - i9 == 0) {
                                return inetAddress2;
                            }
                            bArr[i12] = (byte) i13;
                            inetAddress3 = inetAddress2;
                            i12++;
                            i9 = i14;
                        }
                        return inetAddress3;
                    }
                    inetAddress = inetAddress3;
                    if (i12 == i7 + 2) {
                        i7 += 2;
                        break;
                    }
                    return inetAddress;
                }
                i9 = i6 + 1;
                inetAddress = null;
            }
            i4 = 0;
            i6 = i9;
            while (i6 < i3) {
                iO = o(str.charAt(i6));
                if (iO != -1) {
                    break;
                }
                i4 = (i4 << 4) + iO;
                i6++;
            }
            i5 = i6 - i9;
            if (i5 != 0 || i5 > 4) {
                return inetAddress;
            }
            int i15 = i7 + 1;
            bArr[i7] = (byte) (255 & (i4 >>> 8));
            i7 += 2;
            bArr[i15] = (byte) (i4 & 255);
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return inetAddress;
            }
            int i16 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int m(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static int m(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static void o(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!o(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static ooo m(List<com.thinkup.core.common.no.m.o.oo.n> list) {
        ooo.o oVar = new ooo.o();
        for (com.thinkup.core.common.no.m.o.oo.n nVar : list) {
            o.o.o(oVar, nVar.n0.o(), nVar.no.o());
        }
        return oVar.o();
    }

    private static void o(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean o(oon oonVar, TimeUnit timeUnit) {
        try {
            return o(oonVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean o(oon oonVar, int i2, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jE_ = oonVar.o().d_() ? oonVar.o().e_() - jNanoTime : Long.MAX_VALUE;
        oonVar.o().o(Math.min(jE_, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
            while (oonVar.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                nVar.omm();
            }
            if (jE_ == Long.MAX_VALUE) {
                oonVar.o().om();
                return true;
            }
            oonVar.o().o(jNanoTime + jE_);
            return true;
        } catch (InterruptedIOException unused) {
            if (jE_ == Long.MAX_VALUE) {
                oonVar.o().om();
                return false;
            }
            oonVar.o().o(jNanoTime + jE_);
            return false;
        } catch (Throwable th) {
            if (jE_ == Long.MAX_VALUE) {
                oonVar.o().om();
            } else {
                oonVar.o().o(jNanoTime + jE_);
            }
            throw th;
        }
    }

    public static <T> List<T> o(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> o(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    public static <T> List<T> o(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory o(final String str, final boolean z2) {
        return new ThreadFactory() { // from class: com.thinkup.core.common.no.m.o.n.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z2);
                return thread;
            }
        };
    }

    public static String[] o(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String o(oom oomVar, boolean z2) {
        String strOm;
        if (oomVar.om().contains(":")) {
            strOm = d9.i.d + oomVar.om() + d9.i.f24752e;
        } else {
            strOm = oomVar.om();
        }
        if (!z2 && oomVar.on() == oom.o(oomVar.m())) {
            return strOm;
        }
        StringBuilder sbX = a.x(strOm, ":");
        sbX.append(oomVar.on());
        return sbX.toString();
    }

    public static boolean o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int o(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] o(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    public static int o(String str, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int o(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int o(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String o(String str) {
        InetAddress inetAddressO0;
        if (str.contains(":")) {
            int i2 = 0;
            if (str.startsWith(d9.i.d) && str.endsWith(d9.i.f24752e)) {
                inetAddressO0 = o0(str, 1, str.length() - 1);
            } else {
                inetAddressO0 = o0(str, 0, str.length());
            }
            if (inetAddressO0 == null) {
                return null;
            }
            byte[] address = inetAddressO0.getAddress();
            if (address.length == 16) {
                int i3 = -1;
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i3 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
                while (i2 < address.length) {
                    if (i2 == i3) {
                        nVar.n0(58);
                        i2 += i5;
                        if (i2 == 16) {
                            nVar.n0(58);
                        }
                    } else {
                        if (i2 > 0) {
                            nVar.n0(58);
                        }
                        nVar.nm(((address[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (address[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                        i2 += 2;
                    }
                }
                return nVar.ooo();
            }
            if (address.length == 4) {
                return inetAddressO0.getHostAddress();
            }
            throw new AssertionError(a.n("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty() || o0(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset o(oo ooVar, Charset charset) {
        int iO = ooVar.o(m0);
        if (iO == -1) {
            return charset;
        }
        if (iO == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iO == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iO == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iO == 3) {
            return mo;
        }
        if (iO == 4) {
            return mm;
        }
        throw new AssertionError();
    }

    public static int o(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(a.m(str, " < 0"));
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(a.m(str, " too large."));
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(a.m(str, " too small."));
        }
        throw new NullPointerException("unit == null");
    }

    private static boolean o(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == 16) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char cCharAt = str.charAt(i6);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    private static String o(byte[] bArr) {
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
        while (i3 < bArr.length) {
            if (i3 == i2) {
                nVar.n0(58);
                i3 += i5;
                if (i3 == 16) {
                    nVar.n0(58);
                }
            } else {
                if (i3 > 0) {
                    nVar.n0(58);
                }
                nVar.nm(((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i3 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                i3 += 2;
            }
        }
        return nVar.ooo();
    }

    public static X509TrustManager o() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public static List<com.thinkup.core.common.no.m.o.oo.n> o(ooo oooVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < oooVar.o(); i2++) {
            arrayList.add(new com.thinkup.core.common.no.m.o.oo.n(oooVar.o(i2), oooVar.m(i2)));
        }
        return arrayList;
    }

    public static String o(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
        }
    }

    public static boolean o(oom oomVar, oom oomVar2) {
        return oomVar.om().equals(oomVar2.om()) && oomVar.on() == oomVar2.on() && oomVar.m().equals(oomVar2.m());
    }
}
