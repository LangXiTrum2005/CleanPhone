package com.facebook.ads.redexgen.core;

import android.util.Log;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2038nV implements C1X {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, 127, 110, 121, 121, 126, 123, 127, 110, 111, 33, 117, 110, 33, 102, 49, 47, 50, 46, 102, 41, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, 46, 52, 37, 46, 52, 109, 44, 37, 46, 39, 52, 40, 122, 96, 5, 20, cw.l, 77, 65, 64, 64, 75, 77, 90, 71, 65, 64, cw.l, 71, 93, cw.l, 79, 76, 93, 75, 64, 90, cw.m, 20, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, 37, 119, 55, 24, 47, 47, 50, 47, 125, 57, 52, 46, 62, 50, 51, 51, 56, 62, 41, 52, 51, 58, 125, 21, 41, 41, 45, 8, 47, 49, 30, 50, 51, 51, 56, 62, 41, 52, 50, 51, 21, 34, 34, 63, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, 63, 112, 54, 34, 63, 61, 112, 27, 44, 44, 49, 44, 126, 49, 46, 59, 48, 55, 48, 57, 126, 61, 49, 48, 48, 59, 61, 42, 55, 49, 48, 126, 56, 49, 44, 126, 35, 20, 20, 9, 20, 70, 20, 3, 7, 2, cw.m, 8, 1, 70, 2, 7, 18, 7, 70, 0, 20, 9, 11, 70, 92, 96, 96, 100, 65, 102, 120, 71, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, 51, 101, 70, 74, 72, 93, 64, 70, 71, 0, 63, 42, 33, 111, 44, 32, 33, 33, 42, 44, 59, 38, 32, 33, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, 31, 92, 80, 81, 75, 90, 81, 75, 31, 86, 81, 89, 80, 31, 89, 77, 80, 82, 31, 106, 93, 89, 92, 81, 86, 95, 24, 75, 87, 77, 74, 91, 93, 24, 33, 26, 26, 85, 24, 20, 27, 12, 85, 7, cw.n, 17, 28, 7, cw.n, 22, 1, 6, 79, 85, 92, 6, 28, 81, 85, 81, 89, 6, 28, 30, 5, 8, 25, cw.m, 65, 99};
    }

    static {
        A04();
        A07 = C2038nV.class.getSimpleName();
    }

    public C2038nV(String str) {
        this(str, C1V.A01(str));
    }

    public C2038nV(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C2038nV(String str, String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) C1W.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        if (i2 == 200) {
            return contentLength;
        }
        return i2 == 206 ? contentLength + i : this.A05;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    private HttpURLConnection A02(int i, int i2) throws IOException, C2040nX {
        HttpURLConnection httpURLConnection;
        boolean z;
        int code = 0;
        String headerField = this.A03;
        do {
            String str = A01(234, 16, 75) + (i > 0 ? A01(19, 13, 66) + i : A01(0, 0, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) + A01(15, 4, 5) + headerField;
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            if (i > 0) {
                httpURLConnection.setRequestProperty(A01(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 5, 3), A01(322, 6, 120) + i + A01(50, 1, 44));
            }
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2);
                if (A09[3].length() != 13) {
                    throw new RuntimeException();
                }
                A09[0] = "1Ss55MOjwkg";
                httpURLConnection.setReadTimeout(i2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            this.A04 = responseCode;
            if (responseCode != 301) {
                String[] strArr = A09;
                String url = strArr[4];
                String str2 = strArr[6];
                int length = url.length();
                int redirectCount = str2.length();
                if (length == redirectCount) {
                    String[] strArr2 = A09;
                    strArr2[1] = "p6lJtanqIpTVtR8wvrkpKJ2zYO";
                    strArr2[5] = "gJMCNOhCywWTIArSLN7pAqKg27";
                    if (responseCode != 302) {
                        if (responseCode == 303) {
                            z = false;
                        }
                    }
                } else if (responseCode != 302) {
                    if (responseCode == 303) {
                        z = false;
                    }
                }
                z = true;
            } else {
                z = true;
            }
            if (z) {
                headerField = httpURLConnection.getHeaderField(A01(226, 8, 45));
                code++;
                httpURLConnection.disconnect();
            }
            if (code > 5) {
                String url2 = A01(293, 20, 113) + code;
                throw new C2040nX(url2);
            }
        } while (z);
        return httpURLConnection;
    }

    private void A03() throws C2040nX {
        String str = A01(255, 23, 59) + this.A03;
        HttpURLConnection httpURLConnectionA02 = null;
        InputStream inputStream = null;
        try {
            httpURLConnectionA02 = A02(0, 10000);
            this.A05 = httpURLConnectionA02.getContentLength();
            this.A06 = httpURLConnectionA02.getContentType();
            inputStream = httpURLConnectionA02.getInputStream();
            Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
        } catch (IOException e) {
            Log.e(A07, A01(129, 25, 84) + this.A03, e);
        } finally {
            C1V.A05(inputStream);
            if (httpURLConnectionA02 != null) {
                httpURLConnectionA02.disconnect();
            }
        }
    }

    private final void A05(int i, int i2) throws C2040nX {
        try {
            this.A02 = A02(i, i2);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (IOException e) {
            throw new C2040nX(A01(Input.Keys.NUMPAD_DIVIDE, 29, 90) + this.A03 + A01(19, 13, 66) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final void AFr(int i) throws C2040nX {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final void close() throws C2040nX {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e) {
                throw new C2040nX(A01(92, 37, 89), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final synchronized int length() throws C2040nX {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.C1X
    public final int read(byte[] bArr) throws C2040nX {
        InputStream inputStream = this.A01;
        String strA01 = A01(Input.Keys.F13, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                throw new NO(A01(278, 15, 60) + this.A03 + A01(0, 15, 15), e);
            } catch (IOException e2) {
                throw new C2040nX(strA01 + this.A03, e2);
            }
        }
        throw new C2040nX(strA01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
