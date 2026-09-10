package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class iv {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2490 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2492 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2493 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2495 = 95;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2497 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2494 = {173, 196, 211, 180, 200, 203, 210, 198, 217, 207};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2491 = 7;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2496 = {'E', 'r', 'o', ' ', 's', 'e', 'n', 'd', 'i', 'g', 'p', 't', 'q', AbstractJsonLexerKt.UNICODE_ESC, AbstractJsonLexerKt.COLON, 'U', 'T', 'F', '-', '8', 'C', 'c', 'P', 'O', 'S', 'y', 'a', 'l', IOUtils.DIR_SEPARATOR_UNIX, 'j', ';', 'h', dc.T, 'f', 'G', AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.END_OBJ, 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Q', 'R', 'V', 'W'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static iu m2453(JSONObject jSONObject, String str) {
        f2490 = (f2492 + 61) % 128;
        try {
            HttpURLConnection httpURLConnectionM2458 = m2458(str);
            byte[] bArrM2455 = m2455(httpURLConnectionM2458, jSONObject);
            long jM2665 = ju.m2665();
            m2459(httpURLConnectionM2458, bArrM2455);
            String strM2461 = m2461(httpURLConnectionM2458);
            int responseCode = httpURLConnectionM2458.getResponseCode();
            String responseMessage = httpURLConnectionM2458.getResponseMessage();
            if (responseCode >= 400) {
                httpURLConnectionM2458.disconnect();
            }
            iu iuVar = new iu(strM2461, responseCode, responseMessage, ju.m2665() - jM2665);
            int i2 = f2492 + 7;
            f2490 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
            return iuVar;
        } catch (Throwable th) {
            String strIntern = m2454(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2464((byte) (View.MeasureSpec.getMode(0) + 121), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0006\u0000\r\r\u0001\n\u0002\t\u0003\u000b\u0012\u0004\u0002\f\u0013\f\u0006\u000b\u0012\u0011\u0000", TextUtils.indexOf((CharSequence) "", '0') + 29).intern());
            sb.append(th.getLocalizedMessage());
            n.m2832(strIntern, sb.toString(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m2456(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2464((byte) (119 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u001c\u0006Ë", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3).intern());
        int i2 = f2492 + 97;
        f2490 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2459(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m2462(dataOutputStream);
        f2492 = (f2490 + 7) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2461(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        String string = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        f2490 = (f2492 + 125) % 128;
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append('\r');
                            f2490 = (f2492 + 83) % 128;
                        }
                        stringBuffer.append(line);
                        f2490 = (f2492 + 105) % 128;
                    }
                    string = stringBuffer.toString();
                } catch (Throwable th) {
                    th = th;
                    try {
                        n.m2832(m2454(null, null, 126 - TextUtils.lastIndexOf("", '0'), "\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern(), m2464((byte) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0001\u0002\u0002\u0003\u0002\u0004\f\u0002tt\r\u0001\n\u0002\u0002\u0006\u0003\u000b\u0003\u0000\u0005\u0006", 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), th);
                    } finally {
                        m2462(inputStream);
                        m2462(bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            bufferedReader = null;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2465(iu iuVar) {
        int i2 = f2490 + 3;
        f2492 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 23 / 0;
            if (iuVar == null) {
                return null;
            }
        } else if (iuVar == null) {
            return null;
        }
        String strM2448 = iuVar.m2448();
        f2490 = (f2492 + 11) % 128;
        return strM2448;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2464(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2496;
                char c2 = f2491;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static HttpURLConnection m2458(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2464((byte) (105 - ExpandableListView.getPackedPositionChild(0L)), "\u0017\u0018\u0017\u0011", 4 - KeyEvent.getDeadChar(0, 0)).intern());
        httpURLConnection.setRequestProperty(m2464((byte) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0010\u0006\u0004\r\u0006\u0000\u0012\u0019\u0012\u0017\f\u0003", TextUtils.lastIndexOf("", '0', 0) + 13).intern(), m2464((byte) (99 - TextUtils.indexOf("", "", 0)), "\u0018\f\r\u0018\u0007\u0016\u0019\f\t\u0001\u0000\" \u0001\u0003\u0000\u001f\u0002\u0018\u001c\u0016\u0005\u0005\u0006\u0012'\u0007\f \u0013\u009b", (ViewConfiguration.getFadingEdgeLength() >> 16) + 31).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i2 = f2490 + 123;
        f2492 = i2 % 128;
        if (i2 % 2 == 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static iu m2452(String str) {
        HttpURLConnection httpURLConnectionM2456;
        long jM2665;
        String strM2461;
        int responseCode;
        String responseMessage;
        int i2 = f2490 + 119;
        f2492 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                httpURLConnectionM2456 = m2456(str);
                jM2665 = ju.m2665();
                strM2461 = m2461(httpURLConnectionM2456);
                responseCode = httpURLConnectionM2456.getResponseCode();
                responseMessage = httpURLConnectionM2456.getResponseMessage();
                if (responseCode >= 22809) {
                    f2490 = (f2492 + 21) % 128;
                    httpURLConnectionM2456.disconnect();
                }
            } else {
                httpURLConnectionM2456 = m2456(str);
                jM2665 = ju.m2665();
                strM2461 = m2461(httpURLConnectionM2456);
                responseCode = httpURLConnectionM2456.getResponseCode();
                responseMessage = httpURLConnectionM2456.getResponseMessage();
                if (responseCode >= 400) {
                    f2490 = (f2492 + 21) % 128;
                    httpURLConnectionM2456.disconnect();
                }
            }
            String str2 = responseMessage;
            int i3 = responseCode;
            iu iuVar = new iu(strM2461, i3, str2, ju.m2665() - jM2665);
            f2492 = (f2490 + 97) % 128;
            return iuVar;
        } catch (Throwable th) {
            String strIntern = m2454(null, null, 127 - (ViewConfiguration.getTouchSlop() >> 8), "\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2464((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0006\u0000\r\r\u0001\n\u0002\f\u0002\n\u0004\u0002\u0006\r\u0007\u0006\u0005\u0007\u0012R", MotionEvent.axisFromString("") + 28).intern());
            sb.append(th.getLocalizedMessage());
            n.m2832(strIntern, sb.toString(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2460(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    f2492 = (f2490 + 51) % 128;
                    return byteArray;
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2462(Closeable closeable) {
        int i2 = f2490;
        int i3 = i2 + 51;
        f2492 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                throw null;
            }
            if (closeable != null) {
                int i4 = i2 + 7;
                f2492 = i4 % 128;
                if (i4 % 2 == 0) {
                    closeable.close();
                } else {
                    closeable.close();
                    throw null;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2463(String str) {
        f2492 = (f2490 + 97) % 128;
        if (str.length() <= 256) {
            return false;
        }
        f2490 = (f2492 + 21) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2457(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strM2670 = jv.m2670(string);
        StringBuilder sbW = android.support.v4.media.a.w(string.substring(0, string.lastIndexOf(125)));
        sbW.append(m2464((byte) (37 - View.resolveSizeAndState(0, 0, 0)), "$% \u0003#\u000fG", 7 - TextUtils.indexOf("", "", 0, 0)).intern());
        sbW.append(strM2670);
        String strC = a.C(sbW, m2464((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 25), "%&", ExpandableListView.getPackedPositionChild(0L) + 3));
        f2490 = (f2492 + 27) % 128;
        return strC;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0059 A[PHI: r1
  0x0059: PHI (r1v4 byte[]) = (r1v2 byte[]), (r1v8 byte[]) binds: [B:8:0x0057, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2455(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        byte[] bytes;
        int i2 = f2492 + 25;
        f2490 = i2 % 128;
        if (i2 % 2 == 0) {
            String strM2457 = m2457(jSONObject);
            bytes = strM2457.getBytes(m2464((byte) (Color.argb(1, 0, 0, 0) + 64), "\u0010\u0011\u0012\u0013\u0096", Process.myTid() * 150).intern());
            if (m2463(strM2457)) {
                f2492 = (f2490 + 27) % 128;
                httpURLConnection.setRequestProperty(m2464((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50), "\u0010\u0006\u0004\r\u0006\u0000\u0012\u0019\u0001\u0000\u0017\u0000\b\t\u0002\r", 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2454(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008a\u0085\u0089\u0088").intern());
                bytes = m2460(bytes);
            }
        } else {
            String strM2458 = m2457(jSONObject);
            bytes = strM2458.getBytes(m2464((byte) (Color.argb(0, 0, 0, 0) + 94), "\u0010\u0011\u0012\u0013\u0096", 5 - (Process.myTid() >> 22)).intern());
            if (m2463(strM2458)) {
                f2492 = (f2490 + 27) % 128;
                httpURLConnection.setRequestProperty(m2464((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50), "\u0010\u0006\u0004\r\u0006\u0000\u0012\u0019\u0001\u0000\u0017\u0000\b\t\u0002\r", 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2454(null, null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008a\u0085\u0089\u0088").intern());
                bytes = m2460(bytes);
            }
        }
        f2490 = (f2492 + 105) % 128;
        return bytes;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2454(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f2494;
                int i3 = f2495;
                if (f2493) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2497) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
