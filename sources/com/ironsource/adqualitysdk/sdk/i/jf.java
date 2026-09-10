package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.B5;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jf {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2667 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2668;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2670 = {-140861380, -101537821, 1701047980, 1529910405, -1678622952, 457852994, -1682158729, 727614069, 1877836739, -958969474, 784242412, -1683665356, -835964726, -1883250494, 1385268854, -612508731, -1454388289, 1186543329};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2669 = 6;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2666 = {'E', 'r', 'o', ' ', 's', 'e', 'n', 'd', 'i', 'g', 't', 'q', 'u', ':', 'U', 'T', 'F', '-', '8', 'C', 'c', 'P', 'O', 'S', 'y', 'p', 'a', 'l', '/', 'j', ';', 'h', B5.U, 'f', '\"', '}'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m2579(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2587(Color.blue(0) + 4, "\u0016\u0017\u0015\u0011", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 106)).intern());
        httpURLConnection.setRequestProperty(m2587(12 - TextUtils.getTrimmedLength(""), "\u0014\u0001\u0007\u000b\u0000\u000b\u000b\u0010\f\u001b\u001d\u0001", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 18)).intern(), m2587(30 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u001b\u001a\u001a\u001c\u000e\u001a\u001c\b\u000e\b\n\u0018\u001c\u0005\u0000\b!\u0000\u0013 \u0019\u0002\u0005\u0000\b\"\u0010\u0006#\u000fT", (byte) (27 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        f2668 = (f2667 + 33) % 128;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static jd m2581(JSONObject jSONObject, String str) {
        f2668 = (f2667 + InterfaceC0435l1.d.b.f29109f) % 128;
        try {
            HttpURLConnection httpURLConnectionM2579 = m2579(str);
            byte[] bArrM2591 = m2591(httpURLConnectionM2579, jSONObject);
            long jM2801 = ke.m2801();
            m2586(httpURLConnectionM2579, bArrM2591);
            String strM2578 = m2578(httpURLConnectionM2579);
            int responseCode = httpURLConnectionM2579.getResponseCode();
            String responseMessage = httpURLConnectionM2579.getResponseMessage();
            if (responseCode >= 400) {
                int i10 = f2667 + 75;
                f2668 = i10 % 128;
                if (i10 % 2 != 0) {
                    httpURLConnectionM2579.disconnect();
                    throw null;
                }
                httpURLConnectionM2579.disconnect();
            }
            return new jd(strM2578, responseCode, responseMessage, ke.m2801() - jM2801);
        } catch (Throwable th2) {
            String strIntern = m2582(new int[]{-1105117575, -117190742, -749102689, -168875190}, Color.green(0) + 8).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2582(new int[]{1344010352, 851014278, -392582271, 1445729723, -494616156, -1722518642, -200229056, 1173463651, -426848904, -1027675916, -2127600604, -1097679383, -1823480511, -948758980}, ImageFormat.getBitsPerPixel(0) + 29).intern());
            sb2.append(th2.getLocalizedMessage());
            m.m2983(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2586(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m2588(dataOutputStream);
        int i10 = f2668 + 79;
        f2667 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2588(Closeable closeable) {
        if (closeable != null) {
            f2668 = (f2667 + 77) % 128;
            try {
                closeable.close();
                f2667 = (f2668 + 7) % 128;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m2591(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        byte[] bytes;
        int i10 = f2667 + 71;
        f2668 = i10 % 128;
        if (i10 % 2 != 0) {
            String strM2585 = m2585(jSONObject);
            bytes = strM2585.getBytes(m2587((ViewConfiguration.getKeyRepeatTimeout() << 93) + 3, "\u000f\u0010\u0011\f\u00ad", (byte) ((ViewConfiguration.getScrollDefaultDelay() >>> 95) * 63)).intern());
            if (!m2589(strM2585)) {
                return bytes;
            }
        } else {
            String strM2586 = m2585(jSONObject);
            bytes = strM2586.getBytes(m2587((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, "\u000f\u0010\u0011\f\u00ad", (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 117)).intern());
            if (!m2589(strM2586)) {
                return bytes;
            }
        }
        httpURLConnection.setRequestProperty(m2587(View.MeasureSpec.getMode(0) + 16, "\u0014\u0001\u0007\u000b\u0000\u000b\u000b\u0010\u0006\f\u001a\b\b\t\u0007\n", (byte) (Color.red(0) + 78)).intern(), m2582(new int[]{-327433133, 1069826920}, 4 - Gravity.getAbsoluteGravity(0, 0)).intern());
        byte[] bArrM2583 = m2583(bytes);
        f2667 = (f2668 + 55) % 128;
        return bArrM2583;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2589(String str) {
        f2668 = (f2667 + 89) % 128;
        if (str.length() > 256) {
            f2668 = (f2667 + 7) % 128;
            return true;
        }
        f2667 = (f2668 + 81) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2587(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2666;
                char c4 = f2669;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2585(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strM2830 = kg.m2830(string);
        StringBuilder sbI = d5.u.i(string.substring(0, string.lastIndexOf(125)));
        sbI.append(m2582(new int[]{-1114967043, 215042430, -1044119761, -1995536038}, KeyEvent.getDeadChar(0, 0) + 7).intern());
        sbI.append(strM2830);
        String strM = f2.m(sbI, m2587((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, "#\u001e", (byte) ((Process.myPid() >> 22) + 53)));
        f2667 = (f2668 + 69) % 128;
        return strM;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2578(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    f2668 = (f2667 + InterfaceC0435l1.d.b.f29110g) % 128;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (stringBuffer.length() > 0) {
                                stringBuffer.append('\r');
                            }
                            stringBuffer.append(line);
                        } else {
                            String string = stringBuffer.toString();
                            m2588(inputStream);
                            m2588(bufferedReader);
                            f2667 = (f2668 + 25) % 128;
                            return string;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        m.m2983(m2582(new int[]{-1105117575, -117190742, -749102689, -168875190}, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 8).intern(), m2587(TextUtils.indexOf((CharSequence) "", '0') + 23, "\u0001\u0002\u0002\u0003\u0002\u0004\u000b\u0003\u0090\u0090\t\u0007\u000f\t\u0002\u0000\u0001\u001c\u0000\b\u0005\u0000", (byte) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 28)).intern(), th);
                        return null;
                    } finally {
                        m2588(inputStream);
                        m2588(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static HttpURLConnection m2590(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2582(new int[]{1822607127, 1877283319}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2).intern());
        int i10 = f2668 + 27;
        f2667 = i10 % 128;
        if (i10 % 2 != 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static jd m2580(String str) {
        HttpURLConnection httpURLConnectionM2590;
        long jM2801;
        String strM2578;
        int responseCode;
        String responseMessage;
        int i10 = f2667 + 117;
        f2668 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                httpURLConnectionM2590 = m2590(str);
                jM2801 = ke.m2801();
                strM2578 = m2578(httpURLConnectionM2590);
                responseCode = httpURLConnectionM2590.getResponseCode();
                responseMessage = httpURLConnectionM2590.getResponseMessage();
                if (responseCode >= 25706) {
                    httpURLConnectionM2590.disconnect();
                    f2667 = (f2668 + 35) % 128;
                }
            } else {
                httpURLConnectionM2590 = m2590(str);
                jM2801 = ke.m2801();
                strM2578 = m2578(httpURLConnectionM2590);
                responseCode = httpURLConnectionM2590.getResponseCode();
                responseMessage = httpURLConnectionM2590.getResponseMessage();
                if (responseCode >= 400) {
                    httpURLConnectionM2590.disconnect();
                    f2667 = (f2668 + 35) % 128;
                }
            }
            String str2 = responseMessage;
            int i11 = responseCode;
            return new jd(strM2578, i11, str2, ke.m2801() - jM2801);
        } catch (Throwable th2) {
            String strIntern = m2582(new int[]{-1105117575, -117190742, -749102689, -168875190}, 8 - Color.red(0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2587(((byte) KeyEvent.getModifierMetaStateMask()) + 28, "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0000\u0007\b\t\u0007\u000f\t\u000b\u0003\t\u0004\u0002\u0000\u0006\u0011\u0000\u0005\u0007\u00104", (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 20)).intern());
            sb2.append(th2.getLocalizedMessage());
            m.m2983(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2584(jd jdVar) {
        int i10 = f2667 + 77;
        int i11 = i10 % 128;
        f2668 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (jdVar == null) {
            int i12 = i11 + 107;
            f2667 = i12 % 128;
            if (i12 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strM2572 = jdVar.m2572();
        int i13 = f2668 + 83;
        f2667 = i13 % 128;
        if (i13 % 2 != 0) {
            return strM2572;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m2583(byte[] bArr) throws Throwable {
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
                    int i10 = f2668 + 3;
                    f2667 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 74 / 0;
                    }
                    return byteArray;
                } catch (Exception e10) {
                    e = e10;
                    gZIPOutputStream = gZIPOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2582(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2670.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
