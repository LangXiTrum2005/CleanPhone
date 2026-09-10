package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.Input;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03530p extends AbstractC04695e implements C5A {
    public static byte[] A0G;
    public static String[] A0H = {"AHTh3LA", "dz9dBpIjsUhtDgGieeCPe537sIDjFabE", "w2cOblChiabhIBK2wmaThN4UxbXYE62t", "xoeUGL4eue58TuIto061cWyCqVAw3O1z", "gq8eFqwTQJvrhbPMke", "RYAI5nESuWZ2rhTI63kEoTOBdt3hOueO", "RDHxxAAMbCEIS74NmBfQosd5J71Yw", "p9GjEcAytNVfsoqugLJlSuHeg4U"};

    @MetaExoPlayerCustomization
    public static final Pattern A0I;

    @MetaExoPlayerCustomization("Meta Specific, added in D30556310")
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C1447dj A04;
    public InterfaceC1719iE<String> A05;
    public InputStream A06;
    public HttpURLConnection A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final C1457du A0B;
    public final C1457du A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Meta Specific, added in D4001689 for 'Handling loopback Address'")
    private HttpURLConnection A05(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionA04;
        String strA02;
        if (InetAddress.getByName(url.getHost()).isLoopbackAddress()) {
            Proxy proxy = Proxy.NO_PROXY;
            if (A0H[4].length() == 18) {
                A0H[7] = "05ili6syMLXE64p9WlTtyQYQXmn";
                httpURLConnectionA04 = A06(url, proxy);
            }
            throw new RuntimeException();
        }
        httpURLConnectionA04 = A04(url);
        httpURLConnectionA04.setConnectTimeout(this.A09);
        httpURLConnectionA04.setReadTimeout(this.A0A);
        HashMap map2 = new HashMap();
        if (this.A0B != null) {
            map2.putAll(this.A0B.A00());
        }
        map2.putAll(this.A0C.A00());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA04.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA03 = AbstractC1458dv.A03(j, j2);
        if (strA03 != null) {
            httpURLConnectionA04.setRequestProperty(A02(172, 5, 112), strA03);
        }
        if (this.A0D != null) {
            if (A0H[0].length() != 7) {
                A0H[6] = "nUFvo5Fq7cIKliBrHLEx9u4WbPaUq";
                httpURLConnectionA04.setRequestProperty(A02(317, 0, 22), this.A0D);
            } else {
                A0H[5] = "SIgd87NqbA3VQEmghn03KStHVMo9tfsp";
                httpURLConnectionA04.setRequestProperty(A02(317, 10, 29), this.A0D);
            }
        }
        if (!z) {
            strA02 = A02(503, 8, 96);
        } else if (A0H[5].charAt(11) != 'P') {
            A0H[2] = "Uigxz3QATBDf8AixCgPxzMGxP4fMNuyH";
            strA02 = A02(490, 4, 64);
        } else {
            strA02 = A02(490, 4, 64);
        }
        httpURLConnectionA04.setRequestProperty(A02(5, 15, 103), strA02);
        httpURLConnectionA04.setInstanceFollowRedirects(z2);
        httpURLConnectionA04.setDoOutput(bArr != null);
        httpURLConnectionA04.setRequestMethod(C1447dj.A01(i));
        if (bArr != null) {
            int length = bArr.length;
            if (A0H[7].length() == 27) {
                A0H[6] = "vuHDFK0PP89aN4hQ5ZKf3JaHZS7DL";
                httpURLConnectionA04.setFixedLengthStreamingMode(length);
                httpURLConnectionA04.connect();
                OutputStream outputStream = httpURLConnectionA04.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
            throw new RuntimeException();
        }
        httpURLConnectionA04.connect();
        return httpURLConnectionA04;
    }

    public static void A09() {
        A0G = new byte[]{104, 60, 39, 104, 77, 52, 22, 22, cw.n, 5, 1, 88, 48, 27, 22, 26, 17, 28, 27, 18, 55, 27, 26, 0, 17, 26, 0, 89, 49, 26, 23, 27, cw.n, 29, 26, 19, 49, 29, 28, 6, 23, 28, 6, 95, 62, 23, 28, 21, 6, 26, 8, 36, 37, 63, 46, 37, 63, 102, 25, 42, 37, 44, 46, 97, 64, 67, 68, 80, 73, 81, 109, 81, 81, 85, 97, 68, 81, 68, 118, 74, 80, 87, 70, 64, 61, cw.n, 10, 24, 21, 21, 22, cw.l, 28, 29, 89, 26, 11, 22, 10, 10, 84, 9, 11, 22, cw.k, 22, 26, 22, 21, 89, 11, 28, 29, cw.n, 11, 28, 26, cw.k, 89, 81, 123, 92, 81, 93, 92, 65, 91, 65, 70, 87, 92, 70, 18, 90, 87, 83, 86, 87, 64, 65, 18, 105, 106, 73, 69, 71, 82, 79, 73, 72, 108, 87, 78, 78, 2, 78, 77, 65, 67, 86, 75, 77, 76, 2, 80, 71, 70, 75, 80, 71, 65, 86, 48, 3, 12, 5, 7, 56, 3, 3, 76, 1, cw.k, 2, 21, 76, 30, 9, 8, 5, 30, 9, cw.m, 24, 31, 86, 76, 0, 59, 48, 45, 37, 48, 54, 33, 48, 49, 117, 22, 58, 59, 33, 48, 59, 33, 120, 25, 48, 59, 50, 33, 61, 117, cw.l, 7, 60, 55, 42, 34, 55, 49, 38, 55, 54, 114, 17, 61, 60, 38, 55, 60, 38, 127, 0, 51, 60, 53, 55, 114, 9, cw.m, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 122, 45, 50, 51, 54, 63, 122, 62, 51, 41, 57, 53, 52, 52, 63, 57, 46, 51, 52, 61, 127, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 90, 88, 69, 94, 69, 73, 69, 70, 10, 88, 79, 78, 67, 88, 79, 73, 94, cw.n, 10, 90, 124, 106, 125, 34, 78, 104, 106, 97, 123, 1, 48, 77, 54, 71, 123, 96, 109, 124, 106, 57, 49, 69, 125, 50, 48, 52, 49, 69, 125, 50, 48, 54, 49, 69, 125, 50, 48, 61, 40, 36, 38, 101, 42, 37, 47, 57, 36, 34, 47, 101, 36, 32, 35, 63, 63, 59, 101, 34, 37, 63, 46, 57, 37, 42, 39, 101, 35, 63, 63, 59, 101, 3, 63, 63, 59, 31, 57, 42, 37, 56, 59, 36, 57, 63, 111, 8, 35, 62, 37, 32, 46, 47, 2, 37, 59, 62, 63, 24, 63, 57, 46, 42, 38, 117, 121, 123, 56, 119, 120, 114, 100, 121, 127, 114, 56, 121, 125, 126, 98, 98, 102, 56, 127, 120, 98, 115, 100, 120, 119, 122, 56, 126, 98, 98, 102, 56, 94, 98, 98, 102, 66, 100, 119, 120, 101, 102, 121, 100, 98, 50, 80, 127, 110, 115, 114, 90, 115, 120, 113, 98, 126, 95, 120, 102, 99, 98, 69, 98, 100, 115, 119, 123, 53, 40, 59, 34, 97, 125, 125, 121, 118, 106, 106, 110, 109, 27, 22, 23, 28, 6, 27, 6, 11, 53, 46, 37, 56, 48, 37, 35, 52, 37, 36, 5, 46, 36, cw.m, 38, 9, 46, 48, 53, 52};
    }

    static {
        A09();
        A0I = Pattern.compile(A02(331, 25, 11));
    }

    @Deprecated
    public C03530p() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public C03530p(String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public C03530p(String str, int i, int i2, boolean z, C1457du c1457du) {
        this(str, i, i2, z, c1457du, null, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<java.lang.String> */
    public C03530p(String str, int i, int i2, boolean z, C1457du c1457du, InterfaceC1719iE<String> interfaceC1719iE, boolean z2) {
        super(true);
        this.A00 = -1;
        this.A0D = str;
        this.A09 = i;
        this.A0A = i2;
        this.A0E = z;
        this.A0B = c1457du;
        this.A05 = interfaceC1719iE;
        this.A0C = new C1457du();
        this.A0F = z2;
    }

    private int A00(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A03;
        if (A0H[2].charAt(26) == 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A0H;
        strArr[3] = "J6yI0Ooy9noLCilbQHXUkK5VbFrVOQMs";
        strArr[1] = "E23cNHplIFmbNtbK16bNfBaSwk52GYz5";
        if (j != -1) {
            long bytesRemaining = this.A03 - this.A02;
            if (bytesRemaining == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, bytesRemaining);
        }
        int i3 = ((InputStream) AbstractC1600gE.A0f(this.A06)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.A02 += (long) i3;
        A0F(i3);
        return i3;
    }

    @MetaExoPlayerCustomization
    public static long A01(HttpURLConnection httpURLConnection) {
        long jMax = -1;
        String headerField = httpURLConnection.getHeaderField(A02(36, 14, 96));
        boolean zIsEmpty = TextUtils.isEmpty(headerField);
        String strA02 = A02(327, 1, 78);
        String strA03 = A02(63, 21, 55);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                AbstractC1561fb.A05(strA03, A02(197, 27, 71) + headerField + strA02);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A02(50, 13, 89));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0I.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long j = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (jMax < 0) {
                        return j;
                    }
                    if (jMax != j) {
                        AbstractC1561fb.A07(strA03, A02(120, 22, 32) + headerField + A02(328, 3, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + headerField2 + strA02);
                        jMax = Math.max(jMax, j);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    AbstractC1561fb.A05(strA03, A02(224, 26, 64) + headerField2 + strA02);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    private HttpURLConnection A03(C1447dj c1447dj) throws IOException {
        URL url = new URL(c1447dj.A06.toString());
        int i = c1447dj.A01;
        byte[] bArr = c1447dj.A0A;
        long j = c1447dj.A04;
        long j2 = c1447dj.A03;
        boolean zA06 = c1447dj.A06(1);
        if (!this.A0E && !this.A0F) {
            return A05(url, i, bArr, j, j2, zA06, true, c1447dj.A09);
        }
        int responseCode = 0;
        while (true) {
            int i2 = responseCode + 1;
            if (responseCode > 20) {
                throw new C0962Pl(new NoRouteToHostException(A02(177, 20, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) + i2), c1447dj, 2001, 1);
            }
            URL url2 = url;
            int redirectCount = i;
            HttpURLConnection httpURLConnectionA05 = A05(url, redirectCount, bArr, j, j2, zA06, false, c1447dj.A09);
            int responseCode2 = httpURLConnectionA05.getResponseCode();
            String headerField = httpURLConnectionA05.getHeaderField(A02(Input.Keys.F12, 8, 52));
            if ((i == 1 || i == 3) && (responseCode2 == 300 || responseCode2 == 301 || responseCode2 == 302 || responseCode2 == 303 || responseCode2 == 307 || responseCode2 == 308)) {
                httpURLConnectionA05.disconnect();
                url = A07(url2, headerField, c1447dj);
            } else if (i == 2 && (responseCode2 == 300 || responseCode2 == 301 || responseCode2 == 302 || responseCode2 == 303)) {
                httpURLConnectionA05.disconnect();
                if (!(this.A0F && responseCode2 == 302)) {
                    i = 1;
                    bArr = null;
                }
                url = A07(url2, headerField, c1447dj);
            } else {
                return httpURLConnectionA05;
            }
            responseCode = i2;
        }
    }

    private final HttpURLConnection A04(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @MetaExoPlayerCustomization
    private final HttpURLConnection A06(URL url, Proxy proxy) throws IOException {
        return (HttpURLConnection) url.openConnection(proxy);
    }

    private URL A07(URL url, String str, C1447dj c1447dj) throws C0962Pl {
        if (str == null) {
            throw new C0962Pl(A02(Input.Keys.NUMPAD_6, 22, 48), c1447dj, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!A02(498, 5, 12).equals(protocol) && !A02(494, 4, 27).equals(protocol)) {
                throw new C0962Pl(A02(286, 31, 56) + protocol, c1447dj, 2001, 1);
            }
            if (!this.A0E && !protocol.equals(url.getProtocol())) {
                throw new C0962Pl(A02(84, 36, 107) + url.getProtocol() + A02(0, 4, 90) + protocol + A02(4, 1, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE), c1447dj, 2001, 1);
            }
            return url2;
        } catch (MalformedURLException e) {
            throw new C0962Pl(e, c1447dj, 2001, 1);
        }
    }

    private void A08() {
        if (this.A07 != null) {
            try {
                this.A07.disconnect();
            } catch (Exception e) {
                AbstractC1561fb.A08(A02(63, 21, 55), A02(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 36, 72), e);
            }
            if (A0H[7].length() != 27) {
                throw new RuntimeException();
            }
            A0H[6] = "GyUr1AByEotWO4zvLC3vzlc3xeB6u";
            this.A07 = null;
        }
    }

    private void A0A(long j, C1447dj c1447dj) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) AbstractC1600gE.A0f(this.A06)).read(bArr, 0, (int) Math.min(j, bArr.length));
            if (!Thread.currentThread().isInterrupted()) {
                if (i != -1) {
                    j -= (long) i;
                    A0F(i);
                } else {
                    throw new C0962Pl(c1447dj, 2008, 1);
                }
            } else {
                throw new C0962Pl(new InterruptedIOException(), c1447dj, 2000, 1);
            }
        }
    }

    public static void A0B(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || AbstractC1600gE.A02 < 19 || AbstractC1600gE.A02 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else {
                if (A0H[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0H[7] = "VEux1xEU6LE0nndVxLVDdVqeGR8";
                if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
            }
            String name = inputStream.getClass().getName();
            if (A02(356, 65, 89).equals(name) || A02(TypedValues.CycleType.TYPE_WAVE_SHAPE, 69, 4).equals(name)) {
                Method declaredMethod = ((Class) AbstractC1517es.A01(inputStream.getClass().getSuperclass())).getDeclaredMethod(A02(FrameMetricsAggregator.EVERY_DURATION, 20, 82), new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean A0C(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField(A02(20, 16, 102));
        String contentEncoding = A02(490, 4, 64);
        return contentEncoding.equalsIgnoreCase(headerField);
    }

    public final void A0I(String str, String str2) {
        AbstractC1517es.A01(str);
        AbstractC1517es.A01(str2);
        this.A0C.A01(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04695e, com.facebook.ads.redexgen.core.Q7
    public final Map<String, List<String>> A8j() {
        if (this.A07 == null) {
            return AbstractC1933lm.A04();
        }
        return new C5J(this.A07.getHeaderFields());
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final Uri A9F() {
        if (this.A07 == null) {
            return null;
        }
        return Uri.parse(this.A07.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0149  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    @Override // com.facebook.ads.redexgen.core.Q7
    @MetaExoPlayerCustomization("customizations: (1) loop commented 'Append headers from data spec' (D6487388,D6506073) (2) ischunkedTransfer (D15078204)")
    public final long AFq(final C1447dj c1447dj) throws IOException {
        final byte[] bArrA1F;
        final C1440dc c1440dc;
        this.A04 = c1447dj;
        long j = 0;
        this.A02 = 0L;
        this.A03 = 0L;
        A0G(c1447dj);
        if (c1447dj.A07 != null) {
            for (Map.Entry<String, String> entry : c1447dj.A07.A0Q.entrySet()) {
                A0I(entry.getKey(), entry.getValue());
            }
        }
        try {
            this.A07 = A03(c1447dj);
            HttpURLConnection httpURLConnection = this.A07;
            this.A01 = httpURLConnection.getResponseCode();
            final String responseMessage = httpURLConnection.getResponseMessage();
            int i = this.A01;
            String contentType = A02(50, 13, 89);
            if (i >= 200) {
                int i2 = this.A01;
                if (A0H[5].charAt(11) == 'P') {
                    throw new RuntimeException();
                }
                A0H[6] = "Yx7OLaEVKg7px8lQCrnLwILzzrvbJ";
                if (i2 <= 299) {
                    final String contentType2 = httpURLConnection.getContentType();
                    if (this.A05 == null || this.A05.A42(contentType2)) {
                        if (this.A01 == 200 && c1447dj.A04 != 0) {
                            j = c1447dj.A04;
                        }
                        boolean zA0C = A0C(httpURLConnection);
                        if (A0H[2].charAt(26) != 'c') {
                            A0H[4] = "NoLcfuZUfNOnqVqSCN";
                            if (zA0C) {
                                this.A03 = c1447dj.A03;
                            } else {
                                int i3 = (A01(httpURLConnection) > (-1L) ? 1 : (A01(httpURLConnection) == (-1L) ? 0 : -1));
                                if (c1447dj.A03 != -1) {
                                    this.A03 = c1447dj.A03;
                                } else {
                                    long jA01 = AbstractC1458dv.A01(httpURLConnection.getHeaderField(A02(36, 14, 96)), httpURLConnection.getHeaderField(contentType));
                                    long bytesToSkip = jA01 != -1 ? jA01 - j : -1L;
                                    this.A03 = bytesToSkip;
                                }
                            }
                        } else {
                            String[] strArr = A0H;
                            strArr[3] = "iS9kPkY5auuYWdXhqiLxM0JtSbYBXF14";
                            strArr[1] = "3X4QoizuqrmngOJd41XC0XJLCatoBkAE";
                            if (zA0C) {
                                this.A03 = c1447dj.A03;
                            } else {
                                int i4 = (A01(httpURLConnection) > (-1L) ? 1 : (A01(httpURLConnection) == (-1L) ? 0 : -1));
                                if (c1447dj.A03 != -1) {
                                    this.A03 = c1447dj.A03;
                                } else {
                                    long jA02 = AbstractC1458dv.A01(httpURLConnection.getHeaderField(A02(36, 14, 96)), httpURLConnection.getHeaderField(contentType));
                                    if (jA02 != -1) {
                                    }
                                    this.A03 = bytesToSkip;
                                }
                            }
                        }
                        try {
                            this.A06 = httpURLConnection.getInputStream();
                            if (zA0C) {
                                this.A06 = new GZIPInputStream(this.A06);
                            }
                            this.A08 = true;
                            A0H(c1447dj);
                            try {
                                A0A(j, c1447dj);
                                return this.A03;
                            } catch (IOException e) {
                                A08();
                                if (!(e instanceof C0962Pl)) {
                                    throw new C0962Pl(e, c1447dj, 2000, 1);
                                }
                                throw ((C0962Pl) e);
                            }
                        } catch (IOException e2) {
                            A08();
                            throw new C0962Pl(e2, c1447dj, 2000, 1);
                        }
                    }
                    A08();
                    IOException e3 = new C0962Pl(contentType2, c1447dj) { // from class: com.facebook.ads.redexgen.X.5F
                        public static byte[] A01;
                        public static String[] A02 = {"TH2jfRJyeAeB8nmlEA26DBIiZcblDCUD", "FD1CD9uXQJsGpAkRU3bzLUn4Mk5AK4oN", "MGSMNh85R5O", "jW", "tz66aw9tVCwQwFAtEQHxaPE8zapt6bFR", "Y6d9CXP6oq3TNCs6FoXP", "w0z0M6ofNbcQBGlrV6OcnNNh4F6173fW", "OJQxdTk9eO0Noc5ZCZoI"};
                        public final String A00;

                        public static String A00(int i5, int i6, int i7) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i5, i5 + i6);
                            for (int i8 = 0; i8 < bArrCopyOfRange.length; i8++) {
                                bArrCopyOfRange[i8] = (byte) ((bArrCopyOfRange[i8] ^ i7) ^ 75);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            if (A02[6].charAt(20) == 'O') {
                                throw new RuntimeException();
                            }
                            A02[2] = "jskuf9jvaVMfqvebaigayb1Tk";
                            A01 = new byte[]{63, 24, 0, 23, 26, 31, 18, 86, 21, 25, 24, 2, 19, 24, 2, 86, 2, cw.m, 6, 19, 76, 86};
                        }

                        static {
                            A01();
                        }

                        {
                            super(A00(0, 22, 61) + contentType2, c1447dj, 2003, 1);
                            this.A00 = contentType2;
                        }
                    };
                    throw e3;
                }
            }
            final Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.A01 == 416) {
                if (c1447dj.A04 == AbstractC1458dv.A00(httpURLConnection.getHeaderField(contentType))) {
                    this.A08 = true;
                    A0H(c1447dj);
                    if (c1447dj.A03 != -1) {
                        return c1447dj.A03;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bArrA1F = errorStream != null ? AbstractC1600gE.A1F(errorStream) : AbstractC1600gE.A07;
            } catch (IOException unused) {
                bArrA1F = AbstractC1600gE.A07;
                if (A0H[5].charAt(11) != 'P') {
                    A0H[7] = "Gf7CnjzMvovkc33EJKTNrOMCYHq";
                }
            }
            A08();
            if (this.A01 == 416) {
                c1440dc = new C1440dc(2008);
            } else {
                c1440dc = null;
            }
            final int i5 = this.A01;
            throw new C0962Pl(i5, responseMessage, c1440dc, headerFields, c1447dj, bArrA1F) { // from class: com.facebook.ads.redexgen.X.5B
                public static byte[] A04;
                public final int A00;
                public final String A01;
                public final Map<String, List<String>> A02;
                public final byte[] A03;

                static {
                    A01();
                }

                public static String A00(int i6, int i7, int i8) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i6, i6 + i7);
                    for (int i9 = 0; i9 < bArrCopyOfRange.length; i9++) {
                        bArrCopyOfRange[i9] = (byte) ((bArrCopyOfRange[i9] ^ i8) ^ 92);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A04 = new byte[]{95, 104, 126, 125, 98, 99, 126, 104, 45, 110, 98, 105, 104, 55, 45};
                }

                {
                    super(A00(0, 15, 81) + i5, c1440dc, c1447dj, 2004, 1);
                    this.A00 = i5;
                    this.A01 = responseMessage;
                    this.A02 = headerFields;
                    this.A03 = bArrA1F;
                }
            };
        } catch (IOException e4) {
            A08();
            throw C0962Pl.A03(e4, c1447dj, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final void close() throws C0962Pl {
        try {
            InputStream inputStream = this.A06;
            if (inputStream != null) {
                A0B(this.A07, this.A03 != -1 ? this.A03 - this.A02 : -1L);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new C0962Pl(e, (C1447dj) AbstractC1600gE.A0f(this.A04), 2000, 3);
                }
            }
            this.A06 = null;
            A08();
            if (this.A08) {
                this.A08 = false;
                A0E();
            }
        } catch (Throwable th) {
            this.A06 = null;
            A08();
            if (this.A08) {
                this.A08 = false;
                if (A0H[2].charAt(26) == 'c') {
                    throw new RuntimeException();
                }
                A0H[2] = "KbhwiyEXQ1AE1rdlVyrO0sE4Wca7u4tn";
                A0E();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.O9
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return A00(bArr, i, i2);
        } catch (IOException e) {
            throw C0962Pl.A03(e, (C1447dj) AbstractC1600gE.A0f(this.A04), 2);
        }
    }
}
