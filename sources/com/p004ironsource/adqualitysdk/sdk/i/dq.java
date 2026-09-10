package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.impl.Z;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class dq {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1746 = 1;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static char f1747;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f1748;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static char f1749;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char f1750;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1751;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static short[] f1752;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static byte[] f1753;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1754;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1755;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1756;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f1757;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final Pattern f1758;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final List<String> f1759;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1760;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1761;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1762;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1763;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1764;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1765;

    static {
        m1976();
        f1765 = Pattern.compile(m1975((byte) (23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 89, Color.alpha(0) + 1779841674, 1185008128 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
        f1761 = Pattern.compile(m1973("⼋㵿䮺嘪쓁㖧㘍온ᵶ鵞⼋㵿ꥺ픯ߡ戮", 15 - Process.getGidForName("")).intern());
        f1762 = Pattern.compile(m1973("ۛ霍䮺嘪쓁㖧뀥ऻᵶ鵞ۛ霍ꥺ픯财\u0f6e", (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern());
        f1764 = Pattern.compile(m1975((byte) ((-5) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (39 - TextUtils.getTrimmedLength("")), View.resolveSizeAndState(0, 0, 0) - 99, 1779841697 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1185008128).intern());
        f1763 = Pattern.compile(m1975((byte) (View.resolveSizeAndState(0, 0, 0) + 32), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 15), 65477 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1779841712, 1185008127 - Process.getGidForName("")).intern());
        f1757 = Pattern.compile(m1975((byte) (MotionEvent.axisFromString("") - 62), (short) ((-16) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-81) - Gravity.getAbsoluteGravity(0, 0), 1779841717 - TextUtils.indexOf((CharSequence) "", '0'), 1185008129 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        f1758 = Pattern.compile(m1975((byte) ((-120) - ExpandableListView.getPackedPositionType(0L)), (short) ((-20) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (-111) - (ViewConfiguration.getJumpTapTimeout() >> 16), 1779841750 - View.MeasureSpec.getMode(0), 1185008128 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        f1760 = Pattern.compile(m1973("થᤸ\ue26d㎦平Ĳ", 5 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
        f1759 = Arrays.asList(m1975((byte) (63 - TextUtils.indexOf((CharSequence) "", '0')), (short) (85 - (ViewConfiguration.getJumpTapTimeout() >> 16)), KeyEvent.getDeadChar(0, 0) - 112, (ViewConfiguration.getLongPressTimeout() >> 16) + 1779841752, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1185008139).intern(), m1975((byte) ((-62) - View.MeasureSpec.getSize(0)), (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 70), (ViewConfiguration.getPressedStateDuration() >> 16) - 110, (KeyEvent.getMaxKeyCode() >> 16) + 1779841753, 1185008135 - Color.red(0)).intern(), m1975((byte) ((-75) - KeyEvent.getDeadChar(0, 0)), (short) (104 - View.resolveSize(0, 0)), (-110) - Color.blue(0), 1779841756 - View.resolveSizeAndState(0, 0, 0), 1185008144 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m1975((byte) (40 - TextUtils.indexOf((CharSequence) "", '0')), (short) ((Process.myPid() >> 22) - 64), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 108, View.MeasureSpec.getMode(0) + 1779841759, 1185008148 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m1975((byte) (Gravity.getAbsoluteGravity(0, 0) + 26), (short) (TextUtils.getTrimmedLength("") + 82), ExpandableListView.getPackedPositionType(0L) - 109, 1779841765 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1185008148 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m1973("ຍᧀㄚ糭", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3).intern(), m1973("﨣벷礠꧟㿀\uf640", 4 - TextUtils.lastIndexOf("", '0')).intern());
        int i2 = f1746 + 39;
        f1748 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x011e A[PHI: r8 r10
  0x011e: PHI (r8v32 com.ironsource.adqualitysdk.sdk.i.dy$e) = (r8v31 com.ironsource.adqualitysdk.sdk.i.dy$e), (r8v57 com.ironsource.adqualitysdk.sdk.i.dy$e) binds: [B:34:0x0088, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x011e: PHI (r10v10 java.lang.String) = (r10v9 java.lang.String), (r10v22 java.lang.String) binds: [B:34:0x0088, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0381  */
    /* JADX WARN: Code duplicated, block: B:95:0x03a3  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<dy> m1974(String str, String str2, String str3) {
        char cCharAt;
        char c2;
        int i2;
        float f;
        int i3;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        char c3 = 0;
        int length = 0;
        int i4 = 0;
        while (length < str3.length()) {
            int i5 = length + 1;
            if ((i5 < str3.length() ? (char) 1 : c3) != 0) {
                f1746 = (f1748 + 99) % 128;
                cCharAt = str3.charAt(i5);
            } else {
                cCharAt = c3;
            }
            char cCharAt2 = str3.charAt(length);
            if (cCharAt2 == '\n') {
                i4++;
                length = i5;
            } else if (cCharAt2 == '%' || cCharAt2 == '[' || cCharAt2 == ']' || cCharAt2 == '{' || cCharAt2 == '}') {
                c2 = c3;
                i5 = i5;
                dy.e eVar = dy.e.f1839;
                StringBuilder sb = new StringBuilder();
                sb.append(str3.charAt(length));
                arrayList.add(new dy(eVar, sb.toString(), i4));
                length = i5;
                c3 = c2;
            } else {
                if (cCharAt2 != '!') {
                    i2 = 1779841669;
                    f = 0.0f;
                    if (cCharAt2 != '\"') {
                        switch (cCharAt2) {
                            case '\'':
                                String strM1977 = m1977(m1978(f1762, str3.substring(length)));
                                if (strM1977.length() == 1) {
                                    arrayList.add(new dy(dy.e.f1835, String.valueOf((int) strM1977.charAt(0)), i4));
                                } else {
                                    arrayList.add(new dy(dy.e.f1838, strM1977, i4));
                                }
                                length = Z.d(strM1977, 2, length);
                                c3 = 0;
                                break;
                            case '(':
                            case ')':
                            case '*':
                            case ',':
                            case '.':
                            case '/':
                                i5 = i5;
                                c2 = c3;
                                dy.e eVar2 = dy.e.f1839;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str3.charAt(length));
                                arrayList.add(new dy(eVar2, sb2.toString(), i4));
                                length = i5;
                                c3 = c2;
                                break;
                            case '+':
                                if (cCharAt != '+') {
                                    if (cCharAt == '-') {
                                        c2 = 0;
                                        arrayList.add(new dy(dy.e.f1839, m1973("ྲྀє", 2 - Color.blue(0)).intern(), i4));
                                        length += 2;
                                    } else {
                                        c2 = 0;
                                        dy.e eVar3 = dy.e.f1839;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str3.charAt(length));
                                        arrayList.add(new dy(eVar3, sb3.toString(), i4));
                                        length = i5;
                                    }
                                    c3 = c2;
                                } else {
                                    arrayList.add(new dy(dy.e.f1839, m1975((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35), (short) (125 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 113, TextUtils.indexOf("", "", 0) + i2, 1185008077 - KeyEvent.getDeadChar(0, 0)).intern(), i4));
                                    length += 2;
                                    c3 = 0;
                                }
                                break;
                            case '-':
                                i5 = i5;
                                if (cCharAt == '-') {
                                    c2 = 0;
                                    arrayList.add(new dy(dy.e.f1839, m1973("ྲྀє", 2 - Color.blue(0)).intern(), i4));
                                    length += 2;
                                } else {
                                    c2 = 0;
                                    dy.e eVar4 = dy.e.f1839;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str3.charAt(length));
                                    arrayList.add(new dy(eVar4, sb4.toString(), i4));
                                    length = i5;
                                }
                                c3 = c2;
                                break;
                            default:
                                switch (cCharAt2) {
                                    case ':':
                                    case ';':
                                        i5 = i5;
                                        c2 = c3;
                                        dy.e eVar5 = dy.e.f1839;
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(str3.charAt(length));
                                        arrayList.add(new dy(eVar5, sb5.toString(), i4));
                                        length = i5;
                                        c3 = c2;
                                        break;
                                    case '<':
                                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                    case '>':
                                        break;
                                    default:
                                        if (!Character.isWhitespace(str3.charAt(length))) {
                                            dy.e eVar6 = dy.e.f1831;
                                            String strM1978 = m1978(f1757, str3.substring(length));
                                            if (TextUtils.isEmpty(strM1978)) {
                                                eVar6 = dy.e.f1836;
                                                strM1978 = m1978(f1765, str3.substring(length));
                                                if (TextUtils.isEmpty(strM1978)) {
                                                    c2 = c3;
                                                    i3 = i5;
                                                    z2 = true;
                                                } else {
                                                    f1746 = (f1748 + 103) % 128;
                                                    if (strM1978.equals(m1973("ຍᧀ䒥밉", 4 - (TypedValue.complexToFloat(c3) > 0.0f ? 1 : (TypedValue.complexToFloat(c3) == 0.0f ? 0 : -1))).intern())) {
                                                        c2 = c3;
                                                        i3 = i5;
                                                        z2 = true;
                                                    } else {
                                                        f1746 = (f1748 + 19) % 128;
                                                        z2 = true;
                                                        i3 = i5;
                                                        c2 = c3;
                                                        if (!strM1978.equals(m1975((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31), (short) ((Process.myPid() >> 22) + 88), (-110) - TextUtils.lastIndexOf("", '0', c3, c3), 1779841669 - TextUtils.indexOf((CharSequence) "", '0', (int) c3), Drawable.resolveOpacity(c3, c3) + 1185008136).intern())) {
                                                            if (f1759.contains(strM1978)) {
                                                                f1748 = (f1746 + 55) % 128;
                                                                eVar6 = dy.e.f1837;
                                                            }
                                                        }
                                                    }
                                                    eVar6 = dy.e.f1833;
                                                }
                                            } else {
                                                c2 = c3;
                                                i3 = i5;
                                                z2 = true;
                                            }
                                            if ((!TextUtils.isEmpty(strM1978)) != z2) {
                                                eVar6 = dy.e.f1830;
                                                strM1978 = m1978(f1764, str3.substring(length));
                                            }
                                            if (TextUtils.isEmpty(strM1978)) {
                                                int i6 = f1748 + 81;
                                                f1746 = i6 % 128;
                                                if (i6 % 2 == 0) {
                                                    eVar6 = dy.e.f1835;
                                                    strM1978 = m1978(f1763, str3.substring(length));
                                                    int i7 = 78 / 0;
                                                } else {
                                                    eVar6 = dy.e.f1835;
                                                    strM1978 = m1978(f1763, str3.substring(length));
                                                }
                                            }
                                            if (TextUtils.isEmpty(strM1978)) {
                                                f1746 = (f1748 + 25) % 128;
                                                eVar6 = dy.e.f1839;
                                                strM1978 = m1978(f1760, str3.substring(length));
                                            }
                                            if (TextUtils.isEmpty(strM1978)) {
                                                eVar6 = dy.e.f1839;
                                                strM1978 = m1978(f1758, str3.substring(length));
                                            }
                                            if (!TextUtils.isEmpty(strM1978)) {
                                                arrayList.add(new dy(eVar6, strM1978, i4));
                                                length += strM1978.length();
                                                c3 = c2;
                                            } else {
                                                String strN = a.n(new StringBuilder(), m1973("翰慢\uda55ᚻ壘䣹", TextUtils.indexOf("", "", c2) + 6), str);
                                                StringBuilder sb6 = new StringBuilder();
                                                sb6.append(m1973("癤ᱦퟚ齗谢⾱둸㩧瀔ᩐ蓋\uec6f秭텅Ꜷ伮뱒䰽", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17).intern());
                                                sb6.append(str3.charAt(length));
                                                sb6.append(m1973("흿\ue126ꛠ끣\uef8d辱ᢕ癃흘톰࣒䀦䮯Ｘ", (ViewConfiguration.getTapTimeout() >> 16) + 13).intern());
                                                sb6.append(length);
                                                sb6.append(m1973("뼩붐䖋ꇧ", 4 - Drawable.resolveOpacity(0, 0)).intern());
                                                sb6.append(str2);
                                                cq.m1676(strN, sb6.toString(), null);
                                                length = i3;
                                                c3 = 0;
                                            }
                                        } else {
                                            length = i5;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        i3 = i5;
                        String strM1979 = m1978(f1761, str3.substring(length));
                        if (strM1979 == null) {
                            String strN2 = a.n(new StringBuilder(), m1973("翰慢\uda55ᚻ壘䣹", 6 - KeyEvent.getDeadChar(0, 0)), str);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(m1973("恹괽ﯵ佭뱒䰽㱟뚋෬ᢃἌ\ua6fe徭휳餇펜螖\uf077ㇶ酄흿\ue126ꛠ끣\uef8d辱ᢕ癃흘톰࣒䀦䮯Ｘ", 33 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
                            sb7.append(length);
                            sb7.append(m1973("뼩붐䖋ꇧ", 4 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                            sb7.append(str2);
                            cq.m1676(strN2, sb7.toString(), null);
                            length = i3;
                        } else {
                            String strM19710 = m1977(strM1979);
                            arrayList.add(new dy(dy.e.f1838, strM19710, i4));
                            length += strM19710.length() + 2;
                        }
                        c3 = 0;
                    }
                } else {
                    i2 = 1779841669;
                    f = 0.0f;
                }
                if (cCharAt == '=') {
                    dy.e eVar7 = dy.e.f1839;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str3.charAt(length));
                    float f2 = f;
                    arrayList.add(new dy(eVar7, a.C(sb8, m1975((byte) (Color.alpha(0) + 127), (short) ((-21) - TextUtils.indexOf("", "", 0, 0)), (-113) - Color.blue(0), (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)) + i2, (Process.myTid() >> 22) + 1185008095)), i4));
                } else if (cCharAt != '+') {
                    arrayList.add(new dy(dy.e.f1839, m1975((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35), (short) (125 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 113, TextUtils.indexOf("", "", 0) + i2, 1185008077 - KeyEvent.getDeadChar(0, 0)).intern(), i4));
                } else {
                    if (cCharAt == '-') {
                        c2 = 0;
                        arrayList.add(new dy(dy.e.f1839, m1973("ྲྀє", 2 - Color.blue(0)).intern(), i4));
                        length += 2;
                    } else {
                        c2 = 0;
                        dy.e eVar8 = dy.e.f1839;
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(str3.charAt(length));
                        arrayList.add(new dy(eVar8, sb9.toString(), i4));
                        length = i5;
                    }
                    c3 = c2;
                }
                length += 2;
                c3 = 0;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m1976() {
        f1756 = -1779841669;
        f1755 = 114;
        f1754 = -1185008034;
        f1753 = new byte[]{-90, 122, -49, -45, -125, -39, -24, 43, -5, 26, -23, -64, 57, -6, -49, 89, -38, 16, -24, -24, 43, -36, 57, -6, -49, 89, -38, 16, -23, 14, -72, -48, -33, 7, -81, 2, -93, 14, -72, -48, -33, 7, -33, -3, 19, 59, -20, 4, -20, -47, -29, 68, -40, 4, 35, 3, 28, -2, 30, 10, 58, -35, 76, 39, -4, 61, 22, -100, 29, -41, 79, 79, 10, 27, -4, 61, 22, -100, 29, -41, 76, -100, 84, 104, 118, 11, 11, 77, -38, 74, 21, 20, 104, 102, 26, -59, -99, -113, -58, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        f1749 = (char) 7150;
        f1747 = (char) 7725;
        f1750 = (char) 38058;
        f1751 = (char) 27504;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1977(String str) {
        f1746 = (f1748 + 35) % 128;
        String strF = android.support.v4.media.a.f(1, 1, str);
        int i2 = f1748 + 119;
        f1746 = i2 % 128;
        if (i2 % 2 != 0) {
            return strF;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1975(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f1755;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f1753;
                    i6 = bArr != null ? (byte) (bArr[f1756 + i3] + i5) : (short) (f1752[f1756 + i3] + i5);
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f1756 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f1754);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f1753;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f1752;
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1978(Pattern pattern, String str) {
        f1748 = (f1746 + 95) % 128;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        f1746 = (f1748 + 35) % 128;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1973(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1749)) ^ ((c3 >>> 5) + f1750)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1747) ^ ((c4 + i4) ^ ((c4 << 4) + f1751))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
