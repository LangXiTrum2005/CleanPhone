package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ae extends jr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f116 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f118 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f120;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f121;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f122;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f123;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f124;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f117 = {'0', 'j', 'q', 'p', 'Y', 'W', 'g', 'f', 'r', 'v', 'n', 'f', 'k', '\\', AbstractJsonLexerKt.END_LIST, 'm', 'i', 'q', AbstractJsonLexerKt.END_LIST, 'V', 'i', 'i', 'k', 'h', 208, 208, 127, 254, 247, 'w', 239, 234, 225, 'R', 168, 175, 171, '7', 'G', 'B', 'm', 'm', 'i', 'q', 'l', 'k', 'r', 'p', 'p', 'I', '@', 'b', 'd', 'f', 'k', 'j', 'C', 'F', 'f', 'j', 's', 'q', 'r', 'l', 'e', 'D', 'J'};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f119 = {-1775547570, 1813934593, 1637258599, -904922357, 84575895, -302187843, 281493292, -1462392017, 401982253, 1694198887, 172949857, -1996040061, -658238262, -685119123, 235142022, 1371329026, 203992488, 14372833};

    public interface b {
        void onEventGenerated(JSONObject jSONObject);
    }

    public ae(Context context, ao aoVar, int i2, String str, long j) {
        super(context, aoVar, j);
        this.f121 = i2;
        this.f120 = 0;
        this.f122 = 1;
        this.f124 = str;
        HandlerThread handlerThread = new HandlerThread(m280(false, new int[]{0, 23, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern());
        handlerThread.start();
        this.f123 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ int m278(ae aeVar) {
        int i2;
        int i3;
        int i4 = f116;
        int i5 = i4 + 27;
        f118 = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = aeVar.f120;
            i3 = i2 % 0;
        } else {
            i2 = aeVar.f120;
            i3 = i2 + 1;
        }
        aeVar.f120 = i3;
        int i6 = i4 + 103;
        f118 = i6 % 128;
        if (i6 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int m279() {
        int i2 = this.f120;
        if (i2 != 0) {
            return i2;
        }
        f118 = (f116 + 27) % 128;
        return 1;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ int m281(ae aeVar) {
        int i2 = (f116 + 77) % 128;
        f118 = i2;
        int i3 = aeVar.f122;
        f116 = (i2 + 69) % 128;
        return i3;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ int m283(ae aeVar) {
        int i2 = f118 + 7;
        f116 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = aeVar.f122;
            aeVar.f122 = i3;
            return i3;
        }
        int i4 = aeVar.f122;
        aeVar.f122 = i4 + 1;
        return i4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m284(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f119.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m287(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z2, final b bVar) throws Throwable {
        try {
            try {
                this.f123.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.2

                    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
                    private static short[] f125 = null;

                    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                    private static int f126 = 1;

                    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                    private static int f127 = 0;

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static int f128 = 119;

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f129 = 1481966248;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f130 = -272795983;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static byte[] f131 = {66, 81, -83, 65, 84, -84, 64, 78, -78, 84, -81, -68, 111, -101, 100, -113, 104, 98, -97, -99, 98, 98, -113, -98, -114, -122, 120, -118, 122, -124, -117, 110, 125, 0, 0, 0, 0, 0, 0};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m288(byte b2, short s, int i2, int i3, int i4) {
                        String string;
                        synchronized (k.f2833) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                int i5 = f128;
                                int i6 = i2 + i5;
                                int i7 = i6 == -1 ? 1 : 0;
                                if (i7 != 0) {
                                    byte[] bArr = f131;
                                    i6 = bArr != null ? (byte) (bArr[f130 + i3] + i5) : (short) (f125[f130 + i3] + i5);
                                }
                                if (i6 > 0) {
                                    k.f2836 = ((i3 + i6) - 2) + f130 + i7;
                                    k.f2834 = b2;
                                    char c2 = (char) (i4 + f129);
                                    k.f2837 = c2;
                                    sb.append(c2);
                                    k.f2835 = k.f2837;
                                    k.f2838 = 1;
                                    while (k.f2838 < i6) {
                                        byte[] bArr2 = f131;
                                        if (bArr2 != null) {
                                            int i8 = k.f2836;
                                            k.f2836 = i8 - 1;
                                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                                        } else {
                                            short[] sArr = f125;
                                            int i9 = k.f2836;
                                            k.f2836 = i9 - 1;
                                            k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                                        }
                                        sb.append(k.f2837);
                                        k.f2835 = k.f2837;
                                        k.f2838++;
                                    }
                                }
                                string = sb.toString();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return string;
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() throws Exception {
                        f127 = (f126 + 5) % 128;
                        if (str.equals(m288((byte) (64 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) - 106, TextUtils.lastIndexOf("", '0') + 272795984, (-1481966133) - MotionEvent.axisFromString("")).intern())) {
                            ae.m278(ae.this);
                        }
                        int iM281 = ae.m281(ae.this);
                        ae.m283(ae.this);
                        JSONObject jSONObjectM2767 = kc.m2767(jSONObject);
                        jSONObjectM2767.put(m288((byte) (ImageFormat.getBitsPerPixel(0) - 104), (short) View.resolveSizeAndState(0, 0, 0), (-115) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 272795995 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) - 1481966138).intern(), str);
                        jSONObjectM2767.put(m288((byte) ((KeyEvent.getMaxKeyCode() >> 16) - 122), (short) ((-1) - MotionEvent.axisFromString("")), View.resolveSize(0, 0) - 117, 272795998 - Color.blue(0), TextUtils.indexOf("", "", 0, 0) - 1481966147).intern(), iM281);
                        String strIntern = m288((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 96), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 111, 272795998 - ExpandableListView.getPackedPositionChild(0L), (-1498743348) - Color.rgb(0, 0, 0)).intern();
                        JSONObject jSONObject3 = jSONObject2;
                        if (jSONObject3 != null) {
                            f126 = (f127 + 89) % 128;
                            strIntern = jSONObject3.optString(ik.f2471);
                            String str2 = ik.f2426;
                            jSONObjectM2767.put(str2, jSONObject2.optString(str2, null));
                        }
                        if (TextUtils.isEmpty(strIntern)) {
                            strIntern = m288((byte) (TextUtils.getOffsetAfter("", 0) + 121), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0) - 115, 272796007 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) - 1481966137).intern();
                        }
                        jSONObjectM2767.put(ik.f2472, strIntern);
                        if (!jSONObjectM2767.has(ik.f2473)) {
                            jSONObjectM2767.put(ik.f2473, strIntern);
                            f126 = (f127 + 93) % 128;
                        }
                        final JSONObject jSONObjectMo285 = ae.this.mo285(jSONObjectM2767, z2, true, str.equals(m288((byte) ((-127) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (short) ((Process.getThreadPriority(0) + 20) >> 6), (-112) - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 272796009, (-1481966132) - KeyEvent.getDeadChar(0, 0)).intern()));
                        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.2.2
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                bVar.onEventGenerated(jSONObjectMo285);
                            }
                        });
                    }
                });
                f118 = (f116 + 89) % 128;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m282(JSONObject jSONObject) {
        f116 = (f118 + 79) % 128;
        ig igVarM2589 = jg.m2576().m2589();
        try {
            jSONObject.put(m284(new int[]{1881426697, -1246825777, 1152286980, -2120030735, 1584954684, 1092498528}, 9 - KeyEvent.keyCodeFromString("")).intern(), kc.m2766(igVarM2589.m2413(), igVarM2589.m2410(), igVarM2589.m2412(), igVarM2589.m2411()));
            f118 = (f116 + 79) % 128;
        } catch (JSONException e2) {
            n.m2832(m280(false, new int[]{0, 23, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern(), m280(false, new int[]{37, 30, 0, 7}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern(), e2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m286(final JSONArray jSONArray, final boolean z2, final b bVar) {
        this.f123.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.5

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f140 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static boolean f141 = true;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f142 = 248;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static boolean f143 = true;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f144;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f145 = {349, 366, 358, 364, 363, 313, 345, 356, 369, 353, 347, 317, 319, 362, 359, 280, 351, 325};

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() throws Exception {
                f144 = (f140 + 33) % 128;
                final JSONObject jSONObjectMo285 = ae.this.mo285(null, z2, false, false);
                try {
                    jSONObjectMo285.put(m289(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0085\u0084\u0083\u0081\u0082\u0081").intern(), jSONArray);
                } catch (JSONException e2) {
                    n.m2832(m289(null, null, 127 - KeyEvent.keyCodeFromString(""), "\u008e\u008f\u0084\u0087\u008e\u0081\u0083\u0081\u008d\u0084\u0083\u0081\u0082\u008c\u0085\u008b\u008a\u0084\u0089\u0088\u0087\u0083\u0086").intern(), m289(null, null, Color.argb(0, 0, 0, 0) + 127, "\u0087\u0084\u0081\u0092\u0084\u0083\u0081\u0082\u0081\u0090\u0091\u0083\u008a\u0084\u0087\u0081\u008e\u008b\u0090\u008e\u008f\u008e\u008e\u008c").intern(), e2);
                }
                s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.5.1
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        bVar.onEventGenerated(jSONObjectMo285);
                    }
                });
                f140 = (f144 + 119) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m289(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f145;
                        int i3 = f142;
                        if (f143) {
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
                        if (f141) {
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
        });
        int i2 = f118 + 101;
        f116 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jr
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject mo285(JSONObject jSONObject, boolean z2, boolean z3, boolean z4) throws JSONException {
        long jM2666;
        long jM2665;
        long j;
        synchronized (this) {
            jM2666 = ju.m2666();
            jM2665 = ju.m2665();
        }
        JSONObject jSONObjectMo285 = super.mo285(jSONObject, z2, z3, z4);
        try {
            long jOptLong = jSONObjectMo285.optLong(ik.f2465);
            jSONObjectMo285.remove(ik.f2465);
            if (jOptLong == 0) {
                j = 0;
            } else {
                long j2 = jM2665 - (jM2666 - jOptLong);
                j = 0;
                try {
                    jSONObjectMo285.put(m280(true, new int[]{23, 3, 93, 0}, "\u0000\u0001\u0001").intern(), jM2666);
                    jSONObjectMo285.put(m284(new int[]{-688261995, -2133399678}, 3 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), jM2665);
                    jM2666 = jOptLong;
                    jM2665 = j2;
                } catch (JSONException e2) {
                    e = e2;
                    n.m2832(m280(false, new int[]{0, 23, 0, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern(), m284(new int[]{-1048044710, -315042332, 1867122777, -1528357297, -2052038045, -991913034, -1752676282, -1434972918, -1506674057, -588642044, -1623435471, 1955719307}, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 24).intern(), e);
                }
            }
            jSONObjectMo285.put(m280(true, new int[]{26, 3, 139, 3}, "\u0000\u0001\u0000").intern(), jM2666);
            jSONObjectMo285.put(m284(new int[]{-453316355, -1513630756}, TextUtils.lastIndexOf("", '0', 0) + 3).intern(), jM2665);
            jSONObjectMo285.put(m280(false, new int[]{29, 4, 123, 0}, "\u0000\u0000\u0000\u0001").intern(), this.f124);
            jSONObjectMo285.put(m284(new int[]{780141435, -1976720724}, 2 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), this.f121);
            jSONObjectMo285.put(m284(new int[]{1092876006, 914032371}, 3 - TextUtils.indexOf("", "", 0)).intern(), m279());
            if (as.m467().mo469()) {
                jSONObjectMo285.put(m280(true, new int[]{33, 4, 64, 0}, "\u0000\u0000\u0001\u0000").intern(), true);
            }
            ap apVarMo479 = as.m467().mo479();
            if (apVarMo479 != null) {
                String strM452 = apVarMo479.m452();
                if (!TextUtils.isEmpty(strM452)) {
                    jSONObjectMo285.put(m284(new int[]{-416082115, -1912498526}, 2 - TextUtils.lastIndexOf("", '0', 0)).intern(), strM452);
                }
            }
            if (z3) {
                m282(jSONObjectMo285);
                return jSONObjectMo285;
            }
        } catch (JSONException e3) {
            e = e3;
            j = 0;
        }
        return jSONObjectMo285;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m280(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f117, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
