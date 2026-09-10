package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class aw {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f550 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f551 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f552 = {242, 255, 245, 259, 256, 250, 191, 264, 246, 243, 252, 261, 244, 254, 248, 218, 222, 210, 263, 266, 257, 260, 253, 265, 200, 193};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f553 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f554 = 89;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f555 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f556 = 145;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f557;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f558;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f559;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f560 = Arrays.asList(m662(20 - (ViewConfiguration.getTouchSlop() >> 8), true, Color.green(0) + 186, "\u0001\u0004\u0016ￍ\u0003\b\u000e\u0011\u0003\r\u0000ￍ\f\u000e\u0002ￍ\u0016\u0004\b\u0015", Color.green(0) + 15).intern(), m663(null, 127 - ExpandableListView.getPackedPositionGroup(0), null, "\u0087\u008c\u0086\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), "");

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f561 = new ArrayList();

    public aw() {
        List<String> listAsList = Arrays.asList(m663(null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), null, "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0083\u0092\u0086\u008a\u0085\u0091\u0082\u0090\u0087\u008f\u0082\u0086\u0084\u0089\u0083\u0082\u0089\u0084\u0087\u0086\u008a\u0085\u008e\u0082\u0086\u0087\u008e\u0085\u008d").intern(), m662(41 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, KeyEvent.keyCodeFromString("") + 186, "\r\b\u0011\u0004\u0003\r\u0004\u0011ￍ\u0012\u0003\u0000ￍ\b\u0001\u000e\f\r\bￍ\f\u000e\u0002\u0018\u0013\b\u0015\b\u0013\u0002￠\u0003￠\b\u0001\u000e￬\r￨ￍ\u0006", 22 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m663(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0090\u0087\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0086\u0087\u0089\u008f\u0081\u0096\u0089\u0084\u0095\u0087\u0085\u0086").intern(), m662(AndroidCharacter.getMirror('0') - 1, true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 190, "\u000e\r\f\uffff\u000e\b￣\uffc8\u0003\u000f\uffc8\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b\u0003\uffc8\uffff\u0001\ufffb\r\uffff\f\n\uffc8\t\u0003\u0013\u000e\u0003\u0010\u0003\u000e�ￛ\u0006\ufffb\u0003\u000e\u0003", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34).intern());
        this.f558 = listAsList;
        m663(null, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, null, "\u0095\u0093\u0088").intern();
        m663(null, 127 - (Process.myTid() >> 22), null, "\u0083\u0096\u0093\u0088").intern();
        m662(3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 194, "\u0007\ufffa\u0000", 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern();
        m662(TextUtils.lastIndexOf("", '0', 0, 0) + 5, false, 193 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\ufffb\u000b￼\u0001", 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        m662(3 - View.getDefaultSize(0, 0), true, View.getDefaultSize(0, 0) + InterfaceC0435l1.c.b.f29096b, "\u0004\ufff6\b", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1).intern();
        m663(null, 127 - TextUtils.getCapsMode("", 0, 0), null, "\u0098\u008c\u0089").intern();
        m662(3 - ImageFormat.getBitsPerPixel(0), false, 196 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\ufff6\u0005\t\ufffe", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3).intern();
        this.f559 = new JSONObject();
        this.f557 = new JSONObject();
        try {
            Iterator<String> it = listAsList.iterator();
            while (it.hasNext()) {
                this.f557.put(it.next(), m663(null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u0097\u0084").intern());
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m665(aw awVar, String str) {
        int i10 = f551 + 125;
        f550 = i10 % 128;
        int i11 = i10 % 2;
        awVar.m664(str);
        if (i11 != 0) {
            int i12 = 67 / 0;
        }
        f550 = (f551 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final int m666() {
        f550 = (f551 + 9) % 128;
        int iOptInt = this.f559.optInt(m663(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0083\u0084\u008e\u008d").intern(), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        int i10 = f551 + InterfaceC0435l1.d.b.f29109f;
        f550 = i10 % 128;
        if (i10 % 2 == 0) {
            return iOptInt;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final JSONObject m667() {
        JSONObject jSONObjectOptJSONObject = this.f559.optJSONObject(m662(4 - (ViewConfiguration.getTapTimeout() >> 16), false, TextUtils.indexOf((CharSequence) "", '0', 0) + 194, "\f\ufffe\ufffb￼", Gravity.getAbsoluteGravity(0, 0) + 3).intern());
        if (jSONObjectOptJSONObject == null) {
            int i10 = f551;
            int i11 = i10 + 95;
            f550 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            JSONObject jSONObject = this.f557;
            f550 = (i10 + 11) % 128;
            jSONObjectOptJSONObject = jSONObject;
        }
        f550 = (f551 + 95) % 128;
        return jSONObjectOptJSONObject;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final List<String> m668() {
        List<String> listM2863 = kj.m2863(this.f559, m663(null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, "\u0098\u008c\u0089").intern(), new ArrayList());
        f551 = (f550 + 39) % 128;
        return listM2863;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m669() {
        f551 = (f550 + 87) % 128;
        String strOptString = this.f559.optString(m662(View.resolveSize(0, 0) + 4, true, 197 - TextUtils.getCapsMode("", 0, 0), "\b\ufff8\b\ufff8", 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m663(null, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, null, "\u0097\u008c\u0081").intern());
        int i10 = f551 + 37;
        f550 = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m670() {
        List<String> listM2863 = kj.m2863(this.f559, m662(2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, 201 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0004\ufff6\b", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2).intern(), new ArrayList());
        f550 = (f551 + 3) % 128;
        return listM2863;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m671() {
        f550 = (f551 + 39) % 128;
        int iOptInt = this.f559.optInt(m663(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0083\u0096\u0093\u0088").intern(), 7);
        f551 = (f550 + 115) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m673(jh jhVar) {
        m664(jhVar.m2619(m663(null, TextUtils.getOffsetAfter("", 0) + 127, null, "\u008b\u008d\u0081\u008a\u0089\u008d\u0081\u0084\u008c").intern(), m663(null, View.MeasureSpec.getSize(0) + 127, null, "\u009a\u0087\u0099").intern(), new iz() { // from class: com.ironsource.adqualitysdk.sdk.i.aw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iz
            /* JADX INFO: renamed from: ﻐ */
            public final void mo658(String str) {
                aw.m665(aw.this, str);
            }
        }));
        f550 = (f551 + 91) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m674() {
        f551 = (f550 + 1) % 128;
        int iOptInt = this.f559.optInt(m662(TextUtils.indexOf((CharSequence) "", '0') + 5, false, View.combineMeasuredStates(0, 0) + 193, "\ufffb\u000b￼\u0001", View.MeasureSpec.getMode(0) + 3).intern(), 2);
        f551 = (f550 + 9) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m675() {
        JSONObject jSONObject;
        int mode;
        int i10 = f550 + 97;
        f551 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObject = this.f559;
            mode = 56 >>> View.MeasureSpec.getMode(0);
        } else {
            jSONObject = this.f559;
            mode = 127 - View.MeasureSpec.getMode(0);
        }
        return kj.m2863(jSONObject, m663(null, mode, null, "\u0095\u0093\u0088").intern(), this.f560);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m664(String str) {
        int i10 = f551 + 43;
        f550 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 86 / 0;
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f559 = new JSONObject(str);
                    return;
                } catch (JSONException unused) {
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            this.f559 = new JSONObject(str);
            return;
        }
        int i12 = f550 + 13;
        f551 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m672() {
        JSONObject jSONObject;
        String strM662;
        int i10 = f550 + 29;
        f551 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObject = this.f559;
            strM662 = m662(Color.red(1) * 4, false, TextUtils.getTrimmedLength("") + 20200, "\u0007\ufffa\u0000", 5 >> (ViewConfiguration.getKeyRepeatTimeout() + 98));
        } else {
            jSONObject = this.f559;
            strM662 = m662(Color.red(0) + 3, true, TextUtils.getTrimmedLength("") + 194, "\u0007\ufffa\u0000", 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
        }
        return kj.m2863(jSONObject, strM662.intern(), this.f561);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m662(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f554);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m663(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f552;
                int i11 = f556;
                if (f553) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f555) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
