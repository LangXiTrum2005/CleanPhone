package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class dg extends cz implements ck {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1623 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1624 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1632;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1633;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hi f1634;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1636;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1628 = {'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2249, 37732, 'g', 35557, 5492, 40902, 10857, 46318, 16225, 51692, 21589, 57074, 26988, 'a', 35556, 5476, 40915, 10863, 46325, 16242, 51683, 21605, 57045, 26994, 62444, 'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2249, 37732, 7635, 43119, 13045, 48498, 18403, 53861, 43865, 8655, 48734, 13548, 33091, 8132, 37963, 25286, 65407, 30168, 49734, 22777, 54597, 41951, 14424, 46793, 847, 's', 35557, 5492, 40915, 10863, 46325, 16242, 51683, 21605, 57045, 26994, 62444, 32339, 2287, 37749, 7666, 43107, 13029, 'g', 35557, 5492, 40897, 10852, 46326, 16229, 51698, 21620, 57065, 26995, 62437, 32370, 2259, 37743, 7669, 43122, 13027, 48485, 18378, 53875, 23791, 59246, 61044, 25839, 64330, 29171, 50287, 23278};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1629 = -3052281562068317568L;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f1625 = true;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1626 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1630 = 27;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1627 = {142, 128, 143, '\\', 127, 145, 141, 132, 'd', 130, 'o', 148, 139, '_', 'p', 135, 'a', 137, '|', 'n', 138, 144, '~', 131, 129};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final JSONObject f1635 = new JSONObject();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final List<String> f1631 = new ArrayList();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m1823() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f1633;
            if (str != null) {
                f1623 = (f1624 + 29) % 128;
                if (this.f1634 != null) {
                    jSONObject.putOpt(ik.f2460, str);
                    jSONObject.putOpt(ik.f2461, Integer.valueOf(this.f1634.m2195()));
                    f1623 = (f1624 + 79) % 128;
                }
            }
            jSONObject.putOpt(ik.f2455, this.f1632);
            jSONObject.putOpt(ik.f2458, this.f1636);
            if (this.f1631.size() > 0) {
                jSONObject.putOpt(ik.f2452, new JSONArray((Collection) this.f1631));
            }
            if (this.f1635.length() > 0) {
                jSONObject.putOpt(ik.f2459, this.f1635.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private Object m1824() {
        boolean z2 = true;
        if (TextUtils.isEmpty(this.f1633)) {
            f1623 = (f1624 + 57) % 128;
            if (!(!TextUtils.isEmpty(this.f1632)) && TextUtils.isEmpty(this.f1636)) {
                int i2 = f1623 + 31;
                f1624 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.f1631.size();
                    throw null;
                }
                if (this.f1631.size() <= 0) {
                    f1623 = (f1624 + 37) % 128;
                    z2 = false;
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private JSONObject m1825() {
        int i2 = (f1624 + 109) % 128;
        f1623 = i2;
        JSONObject jSONObject = this.f1635;
        f1624 = (i2 + 37) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Object m1826() {
        f1623 = (f1624 + 1) % 128;
        String strOptString = this.f1635.optString(ik.f2458);
        int i2 = f1624 + 51;
        f1623 = i2 % 128;
        if (i2 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1827() {
        f1623 = (f1624 + 17) % 128;
        String strOptString = this.f1635.optString(ik.f2460);
        int i2 = f1623 + 45;
        f1624 = i2 % 128;
        if (i2 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1829() {
        f1624 = (f1623 + 11) % 128;
        String strOptString = this.f1635.optString(ik.f2452);
        int i2 = f1623 + 33;
        f1624 = i2 % 128;
        if (i2 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1831() {
        int i2 = f1624 + 11;
        f1623 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1635.optString(ik.f2455);
        }
        this.f1635.optString(ik.f2455);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1833() {
        int i2 = (f1624 + 113) % 128;
        f1623 = i2;
        String str = this.f1633;
        f1624 = (i2 + 15) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1838(String str) {
        int i2 = f1623;
        this.f1633 = str;
        int i3 = i2 + 113;
        f1624 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1839() {
        int i2 = (f1624 + 71) % 128;
        f1623 = i2;
        String str = this.f1636;
        int i3 = i2 + 7;
        f1624 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hi m1841() {
        int i2 = f1623;
        hi hiVar = this.f1634;
        int i3 = i2 + 103;
        f1624 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
        return hiVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1845(hi hiVar) {
        int i2 = f1624 + 85;
        f1623 = i2 % 128;
        int i3 = i2 % 2;
        this.f1634 = hiVar;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1828(String str) {
        f1623 = (f1624 + 57) % 128;
        try {
            this.f1635.put(ik.f2455, str);
            f1623 = (f1624 + 53) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1830(String str) {
        f1623 = (f1624 + 17) % 128;
        try {
            this.f1635.put(ik.f2452, str);
            f1623 = (f1624 + 73) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1832(String str) {
        f1624 = (f1623 + 103) % 128;
        try {
            this.f1635.put(ik.f2458, str);
            f1624 = (f1623 + 45) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1836(List<String> list) {
        Iterator<String> it = list.iterator();
        int i2 = f1624 + 47;
        while (true) {
            f1623 = i2 % 128;
            if (!it.hasNext()) {
                return;
            }
            int i3 = f1624 + 77;
            f1623 = i3 % 128;
            if (i3 % 2 != 0) {
                m1840(it.next());
                throw null;
            }
            m1840(it.next());
            i2 = f1624 + 115;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1837() {
        int i2 = f1623 + 33;
        f1624 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1632;
        }
        int i3 = 79 / 0;
        return this.f1632;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1840(String str) {
        int i2 = f1624 + 113;
        f1623 = i2 % 128;
        if (i2 % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str) || this.f1631.contains(str)) {
            return;
        }
        this.f1631.add(str);
        f1623 = (f1624 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1842(String str) {
        int i2 = f1624 + 5;
        int i3 = i2 % 128;
        f1623 = i3;
        int i4 = i2 % 2;
        this.f1632 = str;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        f1624 = (i3 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1846(String str) {
        int i2 = f1624 + 123;
        f1623 = i2 % 128;
        int i3 = i2 % 2;
        this.f1636 = str;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m1844() {
        int i2 = (f1623 + 1) % 128;
        f1624 = i2;
        List<String> list = this.f1631;
        int i3 = i2 + 49;
        f1623 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
        return list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x009a A[PHI: r4
  0x009a: PHI (r4v27 byte) = (r4v23 byte), (r4v28 byte) binds: [B:27:0x010f, B:14:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e0  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        byte b2;
        byte b3;
        int i2;
        switch (str.hashCode()) {
            case -2118395364:
                b2 = !str.equals(m1843(TextUtils.indexOf((CharSequence) "", '0') + 16, TextUtils.indexOf("", ""), (char) TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1836320845:
                b2 = !str.equals(m1843(12 - KeyEvent.keyCodeFromString(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1700761801:
                if (!str.equals(m1834(null, null, 127 - Color.alpha(0), "\u0090\u0087\u008f\u0083\u0081\u0082\u008e\u0083\u0082\u008a").intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1623 + 71;
                    f1624 = i3 % 128;
                    if (i3 % 2 != 0) {
                        b2 = 4;
                    } else {
                        b2 = 3;
                    }
                }
                break;
            case -1409157227:
                b2 = !str.equals(m1834(null, null, Color.argb(0, 0, 0, 0) + 127, "\u0081\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u008a").intern()) ? (byte) -1 : (byte) 8;
                break;
            case -1296571754:
                if (!str.equals(m1843(TextUtils.indexOf("", "", 0) + 17, Color.green(0) + 59, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43818)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1623 + 43;
                    f1624 = i4 % 128;
                    if (i4 % 2 != 0) {
                        b2 = 16;
                    } else {
                        b2 = 5;
                    }
                }
                break;
            case -1247838300:
                b2 = !str.equals(m1843(View.resolveSize(0, 0) + 23, (ViewConfiguration.getWindowTouchSlop() >> 8) + 94, (char) TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1207642840:
                b2 = !str.equals(m1834(null, null, TextUtils.lastIndexOf("", '0') + 128, "\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 1;
                break;
            case -1091371232:
                b2 = !str.equals(m1834(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, "\u0081\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u0085\u0093").intern()) ? (byte) -1 : (byte) 10;
                break;
            case -869156349:
                b2 = !str.equals(m1843(6 - TextUtils.getTrimmedLength(""), 117 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Color.red(0) + 60928)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case -772930430:
                if (!str.equals(m1834(null, null, KeyEvent.keyCodeFromString("") + 127, "\u0082\u008d\u008c\u008b\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -407028174:
                if (!str.equals(m1834(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0083\u0081\u0082\u008e\u0083\u0082\u008a").intern())) {
                    b2 = -1;
                } else {
                    f1623 = (f1624 + 95) % 128;
                    b2 = 13;
                }
                break;
            case -356418934:
                b2 = !str.equals(m1834(null, null, Process.getGidForName("") + 128, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0090\u0093\u0092\u0088\u0091\u0083\u0082\u008a").intern()) ? (byte) -1 : (byte) 15;
                break;
            case -140869031:
                if (!str.equals(m1834(null, null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u008a").intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1624 + 67;
                    f1623 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 17 : (byte) 50;
                }
                break;
            case 205499235:
                b2 = !str.equals(m1834(null, null, 127 - View.MeasureSpec.getMode(0), "\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 12;
                break;
            case 236043435:
                if (!str.equals(m1834(null, null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, "\u0090\u0087\u008f\u0083\u0081\u0082\u008e\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 770797430:
                b2 = !str.equals(m1834(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, "\u0082\u008d\u008c\u008b\u0085\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u008a").intern()) ? (byte) -1 : (byte) 2;
                break;
            case 779164621:
                b3 = 18;
                if (!str.equals(m1843((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 76 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.combineMeasuredStates(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = b3;
                }
                break;
            case 1308044955:
                b2 = !str.equals(m1834(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0090\u0087\u008f\u0090\u0093\u0092\u0088\u0091\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1396624783:
                if (!str.equals(m1843((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, KeyEvent.keyCodeFromString("") + 15, (char) TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f1624 + 51;
                    f1623 = i6 % 128;
                    b2 = i6 % 2 == 0 ? (byte) 6 : (byte) 87;
                }
                break;
            case 1924460979:
                b3 = 126;
                if (!str.equals(m1834(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0095\u0099\u0092\u0089\u0087\u0082\u0081\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0081\u0093\u0098").intern())) {
                    b2 = -1;
                } else {
                    int i7 = f1624 + 53;
                    f1623 = i7 % 128;
                    if (i7 % 2 == 0) {
                        b2 = 20;
                    } else {
                        b2 = b3;
                    }
                }
                break;
            case 1964255575:
                if (!str.equals(m1843(22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 38 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f1623 = (f1624 + 103) % 128;
                    b2 = 11;
                }
                break;
            case 2056496294:
                b2 = !str.equals(m1834(null, null, 127 - View.getDefaultSize(0, 0), "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0083\u0081\u0082\u008e\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 14;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return m1833();
            case 1:
                m1838((String) cz.m1785(list, 0, String.class));
                return null;
            case 2:
                if (m1841() == null) {
                    return null;
                }
                int i8 = f1623 + 47;
                f1624 = i8 % 128;
                if (i8 % 2 != 0) {
                    return Integer.valueOf(m1841().m2195());
                }
                int i9 = 13 / 0;
                return Integer.valueOf(m1841().m2195());
            case 3:
                m1845(hi.m2192(((Integer) cz.m1785(list, 0, Integer.class)).intValue()));
                return null;
            case 4:
                return m1837();
            case 5:
                m1842((String) cz.m1785(list, 0, String.class));
                return null;
            case 6:
                return m1839();
            case 7:
                m1846((String) cz.m1785(list, 0, String.class));
                i2 = f1623 + 123;
                f1624 = i2 % 128;
                return null;
            case 8:
                return m1844();
            case 9:
                m1840((String) cz.m1785(list, 0, String.class));
                return null;
            case 10:
                m1836((List<String>) cz.m1785(list, 0, List.class));
                return null;
            case 11:
                return m1827();
            case 12:
                m1835((String) cz.m1785(list, 0, String.class));
                return null;
            case 13:
                return m1831();
            case 14:
                m1828((String) cz.m1785(list, 0, String.class));
                i2 = f1623 + 57;
                f1624 = i2 % 128;
                return null;
            case 15:
                return m1826();
            case 16:
                m1832((String) cz.m1785(list, 0, String.class));
                return null;
            case 17:
                return m1829();
            case 18:
                m1830((String) cz.m1785(list, 0, String.class));
                return null;
            case 19:
                return m1825();
            case 20:
                return m1824();
            case 21:
                return m1823();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1843(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1628[i3 + i4]) ^ (((long) i4) * f1629)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1835(String str) {
        int i2 = f1623 + 55;
        f1624 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1635.put(ik.f2460, str);
                int i3 = 77 / 0;
            } else {
                this.f1635.put(ik.f2460, str);
            }
            int i4 = f1623 + 91;
            f1624 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1834(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1627;
                int i3 = f1630;
                if (f1626) {
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
                if (f1625) {
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
