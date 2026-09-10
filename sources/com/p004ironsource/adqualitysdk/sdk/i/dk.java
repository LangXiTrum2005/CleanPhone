package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class dk extends cz implements ck {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1692 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1693 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1700;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1702;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1703;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1695 = {'f', 53865, 42068, 30264, 18435, 6895, 60634, 48801, 36997, 25234, '.', 17597, 38563, 57494, 13005, 3269, 24120, 43036, 64123, 54361, 9810, 29101, 17308, 40388, 61399, 14655, 2843, 's', 53881, 42060, 30233, 18453, 6888, 60609, 48805, 37012, 25241, 13692, 1914, 55605, 43800, 32255, 20427, 8626, 62391, 50614, 39029, 27229, 15401, 28972, 41778, 54535, 1874, 14686, 27555, 40330, 53230, 57823, 5074, 17463, 30257, 43134, 55891, 3252, 16000, 20729, 33532, 46333, 59710, 6934, 19810, 37087, 17109, 13536, 59065, 55480, 35442, 31841, 11806, ')', 62014, 42433, 38909, 30172, 42946, 53751, 942, 15791, 28517, 39286, 51977, 58686, 5929, 16598, 29418, 21727, 34517, 61664, 8872, 7344, 20033, 47207, 59917, 50209, 13877, 25050, 21484, 36277, 65444, 'g', 53881, 42060, 30212, 18460, 6893, 60619, 48801, 37005, 25241, 13686, 1856, 55577, 43784, 's', 53881, 42060, 30237, 18435, 6863, 60637, 48823, 37012, 25235, 13685, 'g', 53881, 42060, 30237, 18435, 6863, 60637, 48823, 37012, 25235, 13685, 'g', 53881, 42060, 30230, 18434, 6883, 60617, 48800, 36995, 25245, 13675, 1856, 55573, 43802, 32237, 20426, 8628, 62354, 50585, 39033, 27221, 't', 53875, 42098, 30247, 18463, 6882};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1697 = -4450221366886739428L;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1698 = -920228695133017383L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1696 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1694 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1701 = "";

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private double f1704 = -1.0d;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f1699 = false;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean m1927() {
        int i2 = f1692 + 77;
        int i3 = i2 % 128;
        f1693 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f1700;
        int i4 = i3 + 21;
        f1692 = i4 % 128;
        if (i4 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1928() {
        String strIntern;
        f1692 = (f1693 + 33) % 128;
        if (m1927()) {
            f1692 = (f1693 + 65) % 128;
            strIntern = m1937(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ViewConfiguration.getLongPressTimeout() >> 16, (char) (Process.myPid() >> 22)).intern();
        } else {
            strIntern = m1936((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 13623), "ぽ㢽㜂팵", "ƫ婣\uf501ꈭꉓ礈", "\uaad9驹냠\uf33a").intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m1936(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) TextUtils.getOffsetAfter("", 0), "쁡ᣳ嘵ி", "坍ᡧ鸆\uda2e뼶昵㠘䗯Țם", "\uaad9驹냠\uf33a").intern());
        sb.append(this.f1701);
        return a.n(sb, m1937((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, (char) TextUtils.indexOf("", "")), strIntern);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1929() {
        int i2 = f1693;
        String str = this.f1703;
        int i3 = i2 + 77;
        f1692 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1930() {
        int i2 = (f1693 + 63) % 128;
        f1692 = i2;
        String str = this.f1702;
        int i3 = i2 + 59;
        f1693 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1933(String str) {
        int i2 = f1693 + 97;
        int i3 = i2 % 128;
        f1692 = i3;
        int i4 = i2 % 2;
        this.f1701 = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 103;
        f1693 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Double m1935() {
        f1693 = (f1692 + 95) % 128;
        Double dValueOf = Double.valueOf(this.f1704);
        f1692 = (f1693 + 121) % 128;
        return dValueOf;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1940(Double d) {
        f1692 = (f1693 + 79) % 128;
        this.f1704 = d.doubleValue();
        int i2 = f1692 + 3;
        f1693 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1941(String str) {
        int i2 = f1693 + 101;
        f1692 = i2 % 128;
        int i3 = i2 % 2;
        this.f1702 = str;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1931() {
        int i2 = (f1693 + 101) % 128;
        f1692 = i2;
        String str = this.f1701;
        f1693 = (i2 + 115) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1937(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1695[i3 + i4]) ^ (((long) i4) * f1697)) ^ ((long) c2));
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
    public final void m1938(String str) {
        int i2 = f1692 + 3;
        f1693 = i2 % 128;
        int i3 = i2 % 2;
        this.f1703 = str;
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m1939() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ik.f2472, this.f1702);
            double d = this.f1704;
            if (d > -1.0d) {
                int i2 = f1692 + 53;
                f1693 = i2 % 128;
                if (i2 % 2 == 0) {
                    jSONObject2.put(ik.f2419, d);
                    throw null;
                }
                jSONObject2.put(ik.f2419, d);
            }
            jSONObject2.put(ik.f2422, this.f1703);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                if (this.f1699) {
                    int i3 = f1692 + 51;
                    f1693 = i3 % 128;
                    if (i3 % 2 == 0) {
                        jSONObject2.put(ik.f2423, false);
                    } else {
                        jSONObject2.put(ik.f2423, true);
                    }
                }
                jSONObject.put(ik.f2421, jSONObject2);
            }
            f1693 = (f1692 + 53) % 128;
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m1942(boolean z2) {
        int i2 = f1692;
        this.f1699 = z2;
        f1693 = (i2 + 27) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1932(boolean z2) {
        int i2 = f1693;
        this.f1700 = z2;
        int i3 = i2 + 83;
        f1692 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m1934() {
        int i2 = f1692 + 79;
        int i3 = i2 % 128;
        f1693 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f1699;
        int i4 = i3 + 71;
        f1692 = i4 % 128;
        if (i4 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        int i2;
        int i3 = f1693 + 29;
        f1692 = i3 % 128;
        if (i3 % 2 == 0) {
            switch (str.hashCode()) {
                case -2010356102:
                    if (str.equals(m1937(TextUtils.indexOf((CharSequence) "", '0') + 22, 144 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ExpandableListView.getPackedPositionType(0L)).intern())) {
                        i2 = 12;
                    } else {
                        i2 = -1;
                    }
                    break;
                case -1679773410:
                    if (!str.equals(m1937(14 - TextUtils.indexOf("", "", 0, 0), 96 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 21676)).intern())) {
                        i2 = -1;
                    } else {
                        f1692 = (f1693 + 119) % 128;
                        i2 = 8;
                    }
                    break;
                case -1457409854:
                    if (!str.equals(m1937(16 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0') + 12, (char) (Drawable.resolveOpacity(0, 0) + 17626)).intern())) {
                        i2 = -1;
                    } else {
                        int i4 = f1692 + 39;
                        f1693 = i4 % 128;
                        i2 = (i4 % 2 == 0 ? 1 : 0) ^ 1;
                    }
                    break;
                case -1033133001:
                    if (!str.equals(m1937((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, 71 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 37036)).intern())) {
                        i2 = -1;
                    } else {
                        f1693 = (f1692 + 107) % 128;
                        i2 = 4;
                    }
                    break;
                case -869156349:
                    if (!str.equals(m1937(7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 167, (char) Color.blue(0)).intern())) {
                        i2 = -1;
                    } else {
                        i2 = 13;
                    }
                    break;
                case -303276684:
                    if (!str.equals(m1937(View.combineMeasuredStates(0, 0) + 22, 49 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (Color.green(0) + 29003)).intern())) {
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                    break;
                case 91962794:
                    if (!str.equals(m1937(View.getDefaultSize(0, 0) + 14, TextUtils.lastIndexOf("", '0', 0, 0) + 110, (char) View.resolveSizeAndState(0, 0, 0)).intern())) {
                        i2 = -1;
                    } else {
                        f1693 = (f1692 + 101) % 128;
                        i2 = 9;
                    }
                    break;
                case 701278346:
                    if (!str.equals(m1936(2127396303 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (46433 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "쾓쵽慾﮵", "쉦\ueb6b짜要弦퍻玡᱖핦ꣃ\uf568鹜캼ሟ\ue9d0獚䱵", "\uaad9驹냠\uf33a").intern())) {
                        i2 = -1;
                    } else {
                        i2 = 6;
                    }
                    break;
                case 1006114614:
                    if (!str.equals(m1936(View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.getOffsetAfter("", 0) + 48987), "分ᗨ寎县", "\ue19d䟒Ჴ唤\uee54씣ꦬꎕ䛃ꈆ売浒編㜁猳\ue707", "\uaad9驹냠\uf33a").intern())) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    break;
                case 1009851624:
                    if (!str.equals(m1937(21 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        i2 = -1;
                    } else {
                        f1692 = (f1693 + 11) % 128;
                        i2 = 2;
                    }
                    break;
                case 1314266045:
                    if (!str.equals(m1937(11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0') + 124, (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern())) {
                        i2 = -1;
                    } else {
                        i2 = 10;
                    }
                    break;
                case 1402845873:
                    if (!str.equals(m1937(11 - View.MeasureSpec.getMode(0), KeyEvent.keyCodeFromString("") + 134, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                        i2 = -1;
                    } else {
                        i2 = 11;
                    }
                    break;
                case 1641431166:
                    if (!str.equals(m1936(TextUtils.indexOf((CharSequence) "", '0') - 1406217278, (char) ((-16735361) - Color.rgb(0, 0, 0)), "셯⻓羬蚣", "Ⓢ῝⮷⇣߲\ufae0䤙ᅻ龵摴紌颏\uf712츧\u1ff0\ue4e2蹁", "\uaad9驹냠\uf33a").intern())) {
                        i2 = -1;
                    } else {
                        int i5 = f1693 + 109;
                        f1692 = i5 % 128;
                        i2 = i5 % 2 == 0 ? 7 : 105;
                    }
                    break;
                case 1712841667:
                    if (!str.equals(m1937(TextUtils.indexOf((CharSequence) "", '0', 0) + 13, 83 - Gravity.getAbsoluteGravity(0, 0), (char) (30138 - MotionEvent.axisFromString(""))).intern())) {
                        i2 = -1;
                    } else {
                        i2 = 5;
                    }
                    break;
                default:
                    i2 = -1;
                    break;
            }
            switch (i2) {
                case 0:
                    m1941((String) cz.m1785(list, 0, String.class));
                    return null;
                case 1:
                    return m1930();
                case 2:
                    m1933((String) cz.m1785(list, 0, String.class));
                    f1692 = (f1693 + 73) % 128;
                    return null;
                case 3:
                    return m1931();
                case 4:
                    m1940((Double) cz.m1785(list, 0, Double.class));
                    return null;
                case 5:
                    return m1935();
                case 6:
                    m1932(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    return null;
                case 7:
                    return Boolean.valueOf(m1927());
                case 8:
                    m1938((String) cz.m1785(list, 0, String.class));
                    return null;
                case 9:
                    return m1929();
                case 10:
                    m1942(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    return Boolean.valueOf(m1934());
                case 11:
                    return Boolean.valueOf(m1934());
                case 12:
                    return m1928();
                case 13:
                    return m1939();
                default:
                    return null;
            }
        }
        str.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1936(int i2, char c2, String str, String str2, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2569) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c2 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                j.f2567 = 0;
                while (true) {
                    int i3 = j.f2567;
                    if (i3 < length) {
                        int i4 = (i3 + 2) % 4;
                        int i5 = (i3 + 3) % 4;
                        int i6 = cArr4[i3 % 4] * 32718;
                        char c3 = cArr5[i4];
                        char c4 = (char) ((i6 + c3) % 65535);
                        j.f2568 = c4;
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                        cArr4[i5] = c4;
                        int i7 = j.f2567;
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1698) ^ ((long) f1696)) ^ ((long) f1694));
                        j.f2567 = i7 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }
}
