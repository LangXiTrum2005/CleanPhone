package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10221k extends AQ implements AJ {
    public static byte[] A0G;
    public static String[] A0H = {"oHtrkf711", "OALAWpvM4V43TAH4yIQoOhxEEr6GacAE", "Hh5EFVgHa3Asp8lHlYejA", "RFLx7idHDwwo1808RkkCK", "SJ5smVJpw", "R3kqAJTnVJNs7pGyArjUElZegIjSHDR8", "bae9e6aq2V8bVVKZmWDXAczRXcgESOJG", "FE1YY4rUq5RhzOvKgv0QhVD"};

    @MetaExoPlayerCustomization
    public static final Pattern A0I;

    @MetaExoPlayerCustomization("Meta Specific, added in D30556310")
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C11205i A04;
    public InterfaceC2531kj<String> A05;
    public InputStream A06;
    public HttpURLConnection A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final C11265o A0B;
    public final C11265o A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Meta Specific, added in D4001689 for 'Handling loopback Address'")
    private HttpURLConnection A05(URL url, int i2, byte[] bArr, long j, long j2, boolean z2, boolean z3, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionA06 = InetAddress.getByName(url.getHost()).isLoopbackAddress() ? A06(url, Proxy.NO_PROXY) : A04(url);
        httpURLConnectionA06.setConnectTimeout(this.A09);
        httpURLConnectionA06.setReadTimeout(this.A0A);
        HashMap map2 = new HashMap();
        if (this.A0B != null) {
            map2.putAll(this.A0B.A00());
        }
        map2.putAll(this.A0C.A00());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA06.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA03 = AbstractC11275p.A03(j, j2);
        if (strA03 != null) {
            httpURLConnectionA06.setRequestProperty(A02(172, 5, 115), strA03);
        }
        if (this.A0D != null) {
            httpURLConnectionA06.setRequestProperty(A02(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 10, 51), this.A0D);
        }
        httpURLConnectionA06.setRequestProperty(A02(5, 15, 86), z2 ? A02(490, 4, 104) : A02(503, 8, 3));
        httpURLConnectionA06.setInstanceFollowRedirects(z3);
        httpURLConnectionA06.setDoOutput(bArr != null);
        httpURLConnectionA06.setRequestMethod(C11205i.A01(i2));
        if (bArr != null) {
            httpURLConnectionA06.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA06.connect();
            OutputStream outputStream = httpURLConnectionA06.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA06.connect();
        }
        return httpURLConnectionA06;
    }

    public static void A09() {
        A0G = new byte[]{-93, -9, -14, -93, 126, -89, -55, -55, -53, -42, -38, -109, -85, -44, -55, -43, -54, -49, -44, -51, -90, -46, -47, -41, -56, -47, -41, -112, -88, -47, -58, -46, -57, -52, -47, -54, -65, -21, -22, -16, -31, -22, -16, -87, -56, -31, -22, -29, -16, -28, -113, -69, -70, -64, -79, -70, -64, 121, -98, -83, -70, -77, -79, 126, -97, -96, -101, -81, -90, -82, -126, -82, -82, -86, 126, -101, -82, -101, -115, -87, -81, -84, -99, -97, -67, -30, -20, -38, -27, -27, -24, -16, -34, -35, -103, -36, -21, -24, -20, -20, -90, -23, -21, -24, -19, -24, -36, -24, -27, -103, -21, -34, -35, -30, -21, -34, -36, -19, -103, -95, 121, -98, -109, -97, -98, -93, -103, -93, -92, -107, -98, -92, 80, -104, -107, -111, -108, -107, -94, -93, 80, -117, -122, -87, -99, -101, -82, -93, -87, -88, -53, -14, -23, -23, -99, -23, -20, -32, -34, -15, -26, -20, -21, -99, -17, -30, -31, -26, -17, -30, -32, -15, -43, -28, -15, -22, -24, -56, -29, -29, -108, -31, -43, -30, -19, -108, -26, -39, -40, -35, -26, -39, -41, -24, -25, -82, -108, -97, -72, -81, -62, -70, -81, -83, -66, -81, -82, 106, -115, -71, -72, -66, -81, -72, -66, 119, -106, -81, -72, -79, -66, -78, 106, -91, 122, -109, -118, -99, -107, -118, -120, -103, -118, -119, 69, 104, -108, -109, -103, -118, -109, -103, 82, 119, -122, -109, -116, -118, 69, -128, 113, -118, -127, -108, -116, -127, AbstractJsonLexerKt.TC_INVALID, -112, -127, -128, 60, -127, -114, -114, -117, -114, 60, -109, -124, -123, -120, -127, 60, -128, -123, -113, AbstractJsonLexerKt.TC_INVALID, -117, -118, -118, -127, AbstractJsonLexerKt.TC_INVALID, -112, -123, -118, -125, -100, -75, -70, -68, -73, -73, -74, -71, -69, -84, -85, 103, -73, -71, -74, -69, -74, -86, -74, -77, 103, -71, -84, -85, -80, -71, -84, -86, -69, -127, 103, -104, -74, -88, -75, 112, -124, -86, -88, -79, -73, -47, 111, 50, 109, 116, 120, -113, -118, 123, -119, 54, 62, 114, 122, 65, 63, 67, 62, 114, 122, 65, 63, 69, 62, 114, 122, 65, 63, 58, -126, -114, -116, 77, -128, -115, -125, -111, -114, -120, -125, 77, -114, -118, -121, -109, -109, -113, 77, -120, -115, -109, -124, -111, -115, -128, -117, 77, -121, -109, -109, -113, 77, 103, -109, -109, -113, 115, -111, -128, -115, -110, -113, -114, -111, -109, 67, 98, -121, -108, -115, -118, -124, -125, 104, -115, -113, -108, -109, 114, -109, -111, -124, -128, -116, -73, -61, -63, -126, -75, -62, -72, -58, -61, -67, -72, -126, -61, -65, -68, -56, -56, -60, -126, -67, -62, -56, -71, -58, -62, -75, -64, -126, -68, -56, -56, -60, -126, -100, -56, -56, -60, -88, -58, -75, -62, -57, -60, -61, -58, -56, 120, -102, -67, -52, -71, -72, -96, -71, -62, -69, -56, -68, -99, -62, -60, -55, -56, -89, -56, -58, -71, -75, -63, -33, -14, -31, -24, -29, -17, -17, -21, -57, -45, -45, -49, -46, 124, 119, 120, -127, -121, 124, -121, -116, 2, -5, -14, 5, -3, -14, -16, 1, -14, -15, -46, -5, -15, -36, -13, -42, -5, -3, 2, 1};
    }

    static {
        A09();
        A0I = Pattern.compile(A02(331, 25, 6));
    }

    @Deprecated
    public C10221k() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public C10221k(String str, int i2, int i3) {
        this(str, i2, i3, false, null);
    }

    @Deprecated
    public C10221k(String str, int i2, int i3, boolean z2, C11265o c11265o) {
        this(str, i2, i3, z2, c11265o, null, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<java.lang.String> */
    public C10221k(String str, int i2, int i3, boolean z2, C11265o c11265o, InterfaceC2531kj<String> interfaceC2531kj, boolean z3) {
        super(true);
        this.A00 = -1;
        this.A0D = str;
        this.A09 = i2;
        this.A0A = i3;
        this.A0E = z2;
        this.A0B = c11265o;
        this.A05 = interfaceC2531kj;
        this.A0C = new C11265o();
        this.A0F = z3;
    }

    private int A00(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.A03 != -1) {
            long bytesRemaining = this.A03 - this.A02;
            if (bytesRemaining == 0) {
                return -1;
            }
            i3 = (int) Math.min(i3, bytesRemaining);
        }
        int i4 = ((InputStream) C5C.A0f(this.A06)).read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        this.A02 += (long) i4;
        A0F(i4);
        return i4;
    }

    @MetaExoPlayerCustomization
    public static long A01(HttpURLConnection httpURLConnection) {
        long jMax = -1;
        String headerField = httpURLConnection.getHeaderField(A02(36, 14, 108));
        boolean zIsEmpty = TextUtils.isEmpty(headerField);
        String strA02 = A02(327, 1, 100);
        String strA03 = A02(63, 21, 42);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                AbstractC10924g.A05(strA03, A02(197, 27, 58) + headerField + strA02);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A02(50, 13, 60));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0I.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long j = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (jMax < 0) {
                        return j;
                    }
                    if (jMax != j) {
                        AbstractC10924g.A07(strA03, A02(120, 22, 32) + headerField + A02(328, 3, 2) + headerField2 + strA02);
                        jMax = Math.max(jMax, j);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    AbstractC10924g.A05(strA03, A02(224, 26, 21) + headerField2 + strA02);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    private HttpURLConnection A03(C11205i c11205i) throws IOException {
        URL url = new URL(c11205i.A06.toString());
        int i2 = c11205i.A01;
        byte[] bArr = c11205i.A0A;
        long j = c11205i.A04;
        long j2 = c11205i.A03;
        boolean zA06 = c11205i.A06(1);
        if (!this.A0E && !this.A0F) {
            Map<String, String> map = c11205i.A09;
            String[] strArr = A0H;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A0H[1] = "MDuHDm4cbdnEm3n4Ii2p7N8pDyl3ksX4";
            return A05(url, i2, bArr, j, j2, zA06, true, map);
        }
        int responseCode = 0;
        while (true) {
            int i3 = responseCode + 1;
            if (responseCode > 20) {
                throw new C2786p5(new NoRouteToHostException(A02(177, 20, 100) + i3), c11205i, 2001, 1);
            }
            URL url2 = url;
            HttpURLConnection httpURLConnectionA05 = A05(url, i2, bArr, j, j2, zA06, false, c11205i.A09);
            int responseCode2 = httpURLConnectionA05.getResponseCode();
            String headerField = httpURLConnectionA05.getHeaderField(A02(142, 8, 42));
            if ((i2 == 1 || i2 == 3) && (responseCode2 == 300 || responseCode2 == 301 || responseCode2 == 302 || responseCode2 == 303 || responseCode2 == 307 || responseCode2 == 308)) {
                httpURLConnectionA05.disconnect();
                url = A07(url2, headerField, c11205i);
            } else if (i2 == 2 && (responseCode2 == 300 || responseCode2 == 301 || responseCode2 == 302 || responseCode2 == 303)) {
                httpURLConnectionA05.disconnect();
                if (!(this.A0F && responseCode2 == 302)) {
                    i2 = 1;
                    bArr = null;
                }
                url = A07(url2, headerField, c11205i);
            } else {
                return httpURLConnectionA05;
            }
            responseCode = i3;
        }
    }

    private final HttpURLConnection A04(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @MetaExoPlayerCustomization
    private final HttpURLConnection A06(URL url, Proxy proxy) throws IOException {
        return (HttpURLConnection) url.openConnection(proxy);
    }

    private URL A07(URL url, String str, C11205i c11205i) throws C2786p5 {
        if (str == null) {
            throw new C2786p5(A02(150, 22, 109), c11205i, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!A02(498, 5, 79).equals(protocol) && !A02(494, 4, 107).equals(protocol)) {
                throw new C2786p5(A02(286, 31, 55) + protocol, c11205i, 2001, 1);
            }
            if (!this.A0E && !protocol.equals(url.getProtocol())) {
                throw new C2786p5(A02(84, 36, 105) + url.getProtocol() + A02(0, 4, 115) + protocol + A02(4, 1, 69), c11205i, 2001, 1);
            }
            return url2;
        } catch (MalformedURLException e2) {
            throw new C2786p5(e2, c11205i, 2001, 1);
        }
    }

    private void A08() {
        if (this.A07 != null) {
            try {
                this.A07.disconnect();
            } catch (Exception e2) {
                AbstractC10924g.A08(A02(63, 21, 42), A02(250, 36, 12), e2);
            }
            this.A07 = null;
        }
    }

    private void A0A(long j, C11205i c11205i) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i2 = ((InputStream) C5C.A0f(this.A06)).read(bArr, 0, (int) Math.min(j, bArr.length));
            if (!Thread.currentThread().isInterrupted()) {
                if (i2 != -1) {
                    j -= (long) i2;
                    A0F(i2);
                } else {
                    throw new C2786p5(c11205i, 2008, 1);
                }
            } else {
                throw new C2786p5(new InterruptedIOException(), c11205i, 2000, 1);
            }
        }
    }

    public static void A0B(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection != null) {
            int i2 = C5C.A02;
            if (A0H[5].charAt(19) == 'a') {
                throw new RuntimeException();
            }
            A0H[7] = "Vr7TSbIm52LxE4LVc9eYFTM";
            if (i2 < 19 || C5C.A02 > 20) {
                return;
            }
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (A02(356, 65, 15).equals(name) || A02(421, 69, 68).equals(name)) {
                    Method declaredMethod = ((Class) AbstractC10843y.A01(inputStream.getClass().getSuperclass())).getDeclaredMethod(A02(511, 20, 125), new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A0C(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField(A02(20, 16, 83));
        String contentEncoding = A02(490, 4, 104);
        return contentEncoding.equalsIgnoreCase(headerField);
    }

    public final void A0I(String str, String str2) {
        AbstractC10843y.A01(str);
        AbstractC10843y.A01(str2);
        this.A0C.A01(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.AQ, com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final Map<String, List<String>> A8t() {
        if (this.A07 == null) {
            return AbstractC2752oX.A04();
        }
        return new AN(this.A07.getHeaderFields());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final Uri A9P() {
        if (this.A07 == null) {
            return null;
        }
        return Uri.parse(this.A07.getURL().toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    @MetaExoPlayerCustomization("customizations: (1) loop commented 'Append headers from data spec' (D6487388,D6506073) (2) ischunkedTransfer (D15078204)")
    public final long AGi(C11205i c11205i) throws IOException {
        byte[] bArrA1F;
        C11135b c11135b;
        this.A04 = c11205i;
        long j = 0;
        this.A02 = 0L;
        this.A03 = 0L;
        A0G(c11205i);
        if (c11205i.A07 != null) {
            for (Map.Entry<String, String> entry : c11205i.A07.A0P.entrySet()) {
                A0I(entry.getKey(), entry.getValue());
            }
        }
        try {
            this.A07 = A03(c11205i);
            HttpURLConnection httpURLConnection = this.A07;
            this.A01 = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            int i2 = this.A01;
            String strA02 = A02(50, 13, 60);
            if (i2 < 200 || this.A01 > 299) {
                Map<String, List<String>> headers = httpURLConnection.getHeaderFields();
                if (this.A01 == 416) {
                    if (c11205i.A04 == AbstractC11275p.A00(httpURLConnection.getHeaderField(strA02))) {
                        this.A08 = true;
                        A0H(c11205i);
                        if (c11205i.A03 != -1) {
                            return c11205i.A03;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    bArrA1F = errorStream != null ? C5C.A1F(errorStream) : C5C.A07;
                } catch (IOException unused) {
                    bArrA1F = C5C.A07;
                }
                A08();
                if (this.A01 == 416) {
                    c11135b = new C11135b(2008);
                } else {
                    c11135b = null;
                }
                throw new AK(this.A01, responseMessage, c11135b, headers, c11205i, bArrA1F);
            }
            String contentType = httpURLConnection.getContentType();
            if (this.A05 == null || this.A05.A4C(contentType)) {
                if (this.A01 == 200 && c11205i.A04 != 0) {
                    j = c11205i.A04;
                }
                boolean zA0C = A0C(httpURLConnection);
                if (zA0C) {
                    this.A03 = c11205i.A03;
                } else {
                    int i3 = (A01(httpURLConnection) > (-1L) ? 1 : (A01(httpURLConnection) == (-1L) ? 0 : -1));
                    if (c11205i.A03 != -1) {
                        this.A03 = c11205i.A03;
                    } else {
                        long jA01 = AbstractC11275p.A01(httpURLConnection.getHeaderField(A02(36, 14, 108)), httpURLConnection.getHeaderField(strA02));
                        this.A03 = jA01 != -1 ? jA01 - j : -1L;
                    }
                }
                try {
                    this.A06 = httpURLConnection.getInputStream();
                    if (zA0C) {
                        this.A06 = new GZIPInputStream(this.A06);
                    }
                    this.A08 = true;
                    A0H(c11205i);
                    try {
                        A0A(j, c11205i);
                        return this.A03;
                    } catch (IOException e2) {
                        A08();
                        if (!(e2 instanceof C2786p5)) {
                            throw new C2786p5(e2, c11205i, 2000, 1);
                        }
                        throw ((C2786p5) e2);
                    }
                } catch (IOException e3) {
                    A08();
                    throw new C2786p5(e3, c11205i, 2000, 1);
                }
            }
            A08();
            IOException e4 = new AL(contentType, c11205i);
            throw e4;
        } catch (IOException e5) {
            A08();
            throw C2786p5.A04(e5, c11205i, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final void close() throws C2786p5 {
        try {
            InputStream inputStream = this.A06;
            if (inputStream != null) {
                A0B(this.A07, this.A03 != -1 ? this.A03 - this.A02 : -1L);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new C2786p5(e2, (C11205i) C5C.A0f(this.A04), 2000, 3);
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
                A0E();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10402c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            return A00(bArr, i2, i3);
        } catch (IOException e2) {
            throw C2786p5.A04(e2, (C11205i) C5C.A0f(this.A04), 2);
        }
    }
}
