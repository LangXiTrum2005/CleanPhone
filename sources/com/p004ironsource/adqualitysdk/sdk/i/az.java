package com.p004ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class az {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f649 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f650 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f651 = null;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f652 = 75;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f653 = 1499730711;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f654 = 12;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f655 = {17, 31, -20, -1, 3, -17, -6, 5, -1, -20, 24, 31, 31, -27, -23, 20, -12, 12, -10, -27, 57, 52, 56, -46, 55, -41, 45, -41, -60, -46, -40, 45, 44, -42, 44, 57, -58, 60, 47, 85, 70, -96, 87, 84, -85, -92, -85, -81, 65, -69, -88, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f656 = 1515977941;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<in> f657 = new HashSet();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Set<String> f658 = new HashSet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ai f659;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f660;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ISAdQualityAdListener f661;

    public az(Handler handler, ai aiVar) {
        this.f659 = aiVar;
        this.f660 = handler;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m724(az azVar, String str, JSONObject jSONObject) {
        f649 = (f650 + 13) % 128;
        azVar.m726(str, jSONObject);
        f649 = (f650 + 87) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ ai m725(az azVar) {
        int i2 = f649 + 49;
        f650 = i2 % 128;
        int i3 = i2 % 2;
        ai aiVar = azVar.f659;
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return aiVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final void m727(JSONObject jSONObject) {
        f650 = (f649 + 17) % 128;
        m737(m722((byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 86), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) - 62, View.MeasureSpec.getSize(0) - 1499730672, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1515977844).intern(), jSONObject);
        int i2 = f650 + 45;
        f649 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m728(JSONObject jSONObject) {
        f649 = (f650 + 95) % 128;
        m737(m722((byte) ((-58) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-65) - View.MeasureSpec.getSize(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1499730692, (-1515977844) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), jSONObject);
        int i2 = f650 + 115;
        f649 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final void m729(JSONObject jSONObject) {
        f650 = (f649 + 5) % 128;
        m737(m722((byte) (45 - (Process.myPid() >> 22)), (short) (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 63, (-1499730682) - ExpandableListView.getPackedPositionGroup(0L), (-1515977844) - ExpandableListView.getPackedPositionGroup(0L)).intern(), jSONObject);
        int i2 = f649 + 11;
        f650 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final void m730(JSONObject jSONObject) {
        int i2 = f650 + 65;
        f649 = i2 % 128;
        m737((i2 % 2 != 0 ? m723(0 - View.MeasureSpec.makeMeasureSpec(1, 0), 80 << (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)), 68 << (ViewConfiguration.getTouchSlop() >>> 127), "\ufff8￼\u000b\ufff8\u000b\n\ufff6\ufffb￼\r\ufff8\n\ufff6\u000b\ufffa", false) : m723(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, (ViewConfiguration.getTouchSlop() >> 8) + 117, "\ufff8￼\u000b\ufff8\u000b\n\ufff6\ufffb￼\r\ufff8\n\ufff6\u000b\ufffa", true)).intern(), jSONObject);
        int i3 = f650 + 17;
        f649 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m731(JSONObject jSONObject) {
        f649 = (f650 + 99) % 128;
        m737(m722((byte) ((-17) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-64) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1499730711, Gravity.getAbsoluteGravity(0, 0) - 1515977844).intern(), jSONObject);
        f649 = (f650 + 3) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m732(JSONObject jSONObject) {
        f650 = (f649 + 73) % 128;
        int iOptInt = jSONObject.optInt(ik.f2470);
        ISAdQualityAdListener iSAdQualityAdListener = this.f661;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adDisplayed(jSONObject.optString(ik.f2471), ISAdQualityAdType.fromInt(iOptInt));
            f650 = (f649 + 63) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m734(JSONObject jSONObject) {
        f649 = (f650 + 79) % 128;
        m737(m723(2 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionType(0L) + 11, TextUtils.getCapsMode("", 0, 0) + 115, "\ufffe�\ufffa￼\r\ufff8￼\u000b\ufffe\ufffa\r", false).intern(), jSONObject);
        int i2 = f650 + 23;
        f649 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m721(String str, JSONObject jSONObject) {
        Iterator it = new HashSet(this.f657).iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectMo636 = ((in) it.next()).mo636(str, jSONObject);
            if (jSONObjectMo636 != null) {
                kc.m2759(jSONObject, jSONObjectMo636);
            }
            f649 = (f650 + 125) % 128;
        }
        int i2 = f650 + 107;
        f649 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m733(in inVar) {
        int i2 = f650 + 41;
        f649 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f657.add(inVar);
        } else {
            this.f657.add(inVar);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m735(ISAdQualityAdListener iSAdQualityAdListener) {
        int i2 = f650;
        this.f661 = iSAdQualityAdListener;
        f649 = (i2 + 61) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m740(JSONObject jSONObject) {
        f650 = (f649 + 55) % 128;
        m737(m722((byte) ((-25) - View.MeasureSpec.getMode(0)), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 64, TextUtils.indexOf((CharSequence) "", '0') - 1499730700, (-1515977844) - View.MeasureSpec.getMode(0)).intern(), jSONObject);
        int i2 = f649 + 123;
        f650 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m723(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f654);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m726(final String str, JSONObject jSONObject) {
        m721(str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str2 = ik.f2471;
            jSONObject2.put(str2, jSONObject.remove(str2));
            String str3 = ik.f2426;
            jSONObject2.put(str3, jSONObject.remove(str3));
            f649 = (f650 + 63) % 128;
        } catch (JSONException unused) {
        }
        this.f659.m370(str, jSONObject, jSONObject2, new it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f662 = 59;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f663 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f664;

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                int i2 = f663 + 59;
                f664 = i2 % 128;
                if (i2 % 2 == 0 ? str.equals(m741(TextUtils.indexOf((CharSequence) "", '0') + 5, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, TextUtils.indexOf((CharSequence) "", '0', 0) + 162, "\t\r\uffff\ufffe\ufffb\ufffe\ufff9�\u0006", false).intern()) : str.equals(m741(2 % TextUtils.indexOf((CharSequence) "", 'A'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) * 124, 31471 >> TextUtils.indexOf((CharSequence) "", (char) 20, 0), "\t\r\uffff\ufffe\ufffb\ufffe\ufff9�\u0006", false).intern())) {
                    s.m2924(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.2.3
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            az.m725(az.this).m367();
                        }
                    });
                    f663 = (f664 + 113) % 128;
                }
                int i3 = f664 + 51;
                f663 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m741(int i2, int i3, int i4, String str4, boolean z2) {
                String str5;
                Object charArray = str4;
                if (str4 != null) {
                    charArray = str4.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (b.f672) {
                    try {
                        char[] cArr2 = new char[i3];
                        b.f673 = 0;
                        while (true) {
                            int i5 = b.f673;
                            if (i5 >= i3) {
                                break;
                            }
                            b.f671 = cArr[i5];
                            cArr2[b.f673] = (char) (b.f671 + i4);
                            int i6 = b.f673;
                            cArr2[i6] = (char) (cArr2[i6] - f662);
                            b.f673 = i6 + 1;
                        }
                        if (i2 > 0) {
                            b.f674 = i2;
                            char[] cArr3 = new char[i3];
                            System.arraycopy(cArr2, 0, cArr3, 0, i3);
                            int i7 = b.f674;
                            System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                            int i8 = b.f674;
                            System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                        }
                        if (z2) {
                            char[] cArr4 = new char[i3];
                            b.f673 = 0;
                            while (true) {
                                int i9 = b.f673;
                                if (i9 >= i3) {
                                    break;
                                }
                                cArr4[i9] = cArr2[(i3 - i9) - 1];
                                b.f673 = i9 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str5 = new String(cArr2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str5;
            }
        });
        int i2 = f649 + 19;
        f650 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m738(JSONObject jSONObject) {
        int i2 = f649 + 83;
        f650 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
            if (this.f661 != null) {
                this.f661.adClosed(jSONObject.optString(ik.f2471), ISAdQualityAdType.fromInt(jSONObject.optInt(ik.f2470)));
            }
        } else if (this.f661 != null) {
            this.f661.adClosed(jSONObject.optString(ik.f2471), ISAdQualityAdType.fromInt(jSONObject.optInt(ik.f2470)));
        }
        int i4 = f650 + 93;
        f649 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static double m720() {
        f650 = (f649 + 17) % 128;
        if (as.m467().mo483()) {
            return 100.0d;
        }
        int i2 = f649 + 41;
        f650 = i2 % 128;
        if (i2 % 2 != 0) {
            return as.m467().mo485();
        }
        as.m467().mo485();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m737(final String str, final JSONObject jSONObject) {
        this.f660.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.az.5
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                az.m724(az.this, str, jSONObject);
            }
        });
        f650 = (f649 + 109) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m739(String str, String str2, String str3, String str4) {
        f650 = (f649 + 21) % 128;
        m736(str, str2, str3, str4, null, false);
        f650 = (f649 + 79) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m736(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z2) {
        synchronized (this.f658) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(m722((byte) (49 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-74) - TextUtils.getTrimmedLength(""), (-1499730661) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1515977884).intern());
                sb.append(str2);
                String string = sb.toString();
                if (!this.f658.contains(string) || z2 || as.m467().mo490()) {
                    this.f658.add(string);
                    if (Math.random() * 100.0d < m720()) {
                        JSONObject jSONObjectM353 = ai.m353(str, str2, str3, str4, jSONObject);
                        m721(m723(1 - (ViewConfiguration.getWindowTouchSlop() >> 8), 8 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 120, "\u0007\u0005\u0002\u0005\u0005\ufff8\ufff2\u0003", true).intern(), jSONObjectM353);
                        this.f659.m374(m723(1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 121, "\u0007\u0005\u0002\u0005\u0005\ufff8\ufff2\u0003", true).intern(), jSONObjectM353);
                        return;
                    }
                    n.m2826(m723(2 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, TextUtils.getTrimmedLength("") + 114, "\u0010\uffdf\f\uffff\ufffe\b\uffff￭\u000e\b\uffff", true).intern(), m723((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, (Process.myPid() >> 22) + 49, 107 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0015\uffc1ￎ\uffc1\u0005\n\u0005\u000f\uffc8\u0015\uffc1\u0011\u0002\u0014\u0014\uffc1\u0015\t\u0013\u0006\u0014\t\u0010\r\u0005￥\n\u0014\u0004\u0002\u0013\u0005\n\u000f\b\uffc1\u0015\u0011\u0000\u0006\u0013\u0013\u0010\u0013\uffc1\u0006\u0017\u0006\u000f", false).intern());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m722(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f652;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f655;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f653 + i3] + i5);
                    } else {
                        i6 = (short) (f651[f653 + i3] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f653 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f656);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f655;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f651;
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
}
