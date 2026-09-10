package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dv {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1816 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1817 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static long f1818;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static final List<String> f1819;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1820;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final Pattern f1821;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1822;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1823;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1824;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1825;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1826;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1827;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1828;

    static {
        m2052();
        f1824 = Pattern.compile(m2048("䀆䝖亓喊嵶撰残獑竔ǺॗႤៅἤ⚄ⷢ㔥㲧쎒쬺틅\ud985\ue149\ue8a6\uef8a", 1877 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
        f1826 = Pattern.compile(m2048("䀆蕳쩢ོ呆餩\ude32⍅桬굒\uf25c㜙籩䄄蘌쯽", Color.blue(0) + 50441).intern());
        f1827 = Pattern.compile(m2049(16 - (Process.myTid() >> 22), false, 158 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "￤￥￼\ufff7\u0019\u0019￤9\u0018\u001b￤\u001a￦\uffe7￤\u001b", 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
        f1825 = Pattern.compile(m2049(14 - ImageFormat.getBitsPerPixel(0), false, 157 - View.resolveSizeAndState(0, 0, 0), "\uffef￬\ufff8\u001c￪\u001b￭\u001a\uffef￬\ufff8\u001c￪\u001d\u001a", 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        f1828 = Pattern.compile(m2048("䀆現➒\udb82辕䏴瞝", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13308).intern());
        f1822 = Pattern.compile(m2049(34 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), true, TextUtils.indexOf((CharSequence) "", '0', 0) + 170, "￠\ufff4-￠\u0014\u000e\u0010\u0012ￗ\r￠\ufff4-￠\u0014\u000e\u0011&&\u0014\u001f\u0016￡\u000f\uffdd\u0010￡\u0012ￗ￬￠￣\r", 18 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
        f1823 = Pattern.compile(m2049(TextUtils.getOffsetBefore("", 0) + 3, false, 149 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "&￮￮", TextUtils.getOffsetBefore("", 0) + 3).intern());
        f1821 = Pattern.compile(m2049(Color.argb(0, 0, 0, 0) + 5, false, 196 - ExpandableListView.getPackedPositionChild(0L), "\u0013\ufff5\ufff3\u0013\ufff3", 1 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
        f1819 = Arrays.asList(m2048("䀱\ue14b", 41334 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m2048("䀽㕫ꪕ†", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 30047).intern(), m2048("䀶䜲上啩", 1823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m2048("䀪轨\ude86ⷒ絾䲟", 53077 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2049((ViewConfiguration.getLongPressTimeout() >> 16) + 5, true, View.MeasureSpec.getSize(0) + InterfaceC0435l1.c.b.f29098d, "\ufff6\u0001\u0006\u0004\u0003", Drawable.resolveOpacity(0, 0) + 4).intern(), m2048("䀬䶁孷", 3500 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m2049((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, false, (Process.myPid() >> 22) + 195, "\r￼\u0001￼\ufffa", AndroidCharacter.getMirror('0') - '-').intern());
        f1817 = (f1816 + 35) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2048(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1818);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<ec> m2050(String str, String str2, String str3) {
        f1816 = (f1817 + 75) % 128;
        List<ec> listM2054 = m2054(str, str2, str3);
        f1817 = (f1816 + 67) % 128;
        return listM2054;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2052() {
        f1820 = 92;
        f1818 = 6546245650451939416L;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2053(Pattern pattern, String str, int i10) {
        int i11 = f1817 + 11;
        f1816 = i11 % 128;
        if (i11 % 2 != 0) {
            Matcher matcher = pattern.matcher(str);
            matcher.region(i10, str.length());
            matcher.find();
            throw null;
        }
        Matcher matcher2 = pattern.matcher(str);
        matcher2.region(i10, str.length());
        if (!matcher2.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher2.start(), matcher2.end());
        f1816 = (f1817 + 57) % 128;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[PHI: r7 r9
  0x00e1: PHI (r7v16 com.ironsource.adqualitysdk.sdk.i.ec$d) = (r7v15 com.ironsource.adqualitysdk.sdk.i.ec$d), (r7v34 com.ironsource.adqualitysdk.sdk.i.ec$d) binds: [B:34:0x0089, B:36:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00e1: PHI (r9v13 java.lang.String) = (r9v12 java.lang.String), (r9v34 java.lang.String) binds: [B:34:0x0089, B:36:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<ec> m2054(String str, String str2, String str3) {
        boolean z10;
        long j10;
        int length;
        float f10;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str3.length()) {
            f1817 = (f1816 + 63) % 128;
            int i11 = i10 + 1;
            if (i11 < str3.length()) {
                f1817 = (f1816 + 75) % 128;
                z10 = true;
            } else {
                z10 = false;
            }
            char cCharAt = z10 ? str3.charAt(i11) : (char) 0;
            char cCharAt2 = str3.charAt(i10);
            if (cCharAt2 != '\n') {
                if (cCharAt2 != '%' && cCharAt2 != '[' && cCharAt2 != ']' && cCharAt2 != '{' && cCharAt2 != '}') {
                    if (cCharAt2 != '!') {
                        j10 = 0;
                        if (cCharAt2 != '\"') {
                            switch (cCharAt2) {
                                case '\'':
                                    String strM2053 = m2053(f1827, str3, i10);
                                    if (strM2053 != null) {
                                        String strM2051 = m2051(strM2053);
                                        if (strM2051.length() == 1) {
                                            arrayList.add(new ec(ec.d.f1909, String.valueOf((int) strM2051.charAt(0))));
                                        } else {
                                            arrayList.add(new ec(ec.d.f1906, strM2051));
                                        }
                                        i10 = com.applovin.impl.ca.i(2, i10, strM2051);
                                        f1817 = (f1816 + 3) % 128;
                                    } else {
                                        String strK = f2.k(m2048("䀔礀㉚\ueb8aꓞ幆", 14653 - (ViewConfiguration.getJumpTapTimeout() >> 16)), str, new StringBuilder());
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(m2048("䀝\ueb67ᚰ䇐\ued1e\u18f9䏦\uef22ᩂ䖞\uf133ᱹ䞣\uf291ḝ䦯\uf4fa\u202c䭜\uf688≼䵨\uf8b2⎓伐者◹儮ﱀ➈匱﹥⧘", 43853 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
                                        sb2.append(i10);
                                        sb2.append(m2049(3 - ((byte) KeyEvent.getModifierMetaStateMask()), false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 161, "$)ￛￛ", TextUtils.indexOf("", "", 0, 0) + 3).intern());
                                        sb2.append(str2);
                                        cn.m1706(strK, sb2.toString());
                                    }
                                    break;
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                                    if (cCharAt != '+') {
                                        ec.d dVar = ec.d.f1908;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str3.charAt(i10));
                                        arrayList.add(new ec(dVar, sb3.toString()));
                                        f1817 = (f1816 + 7) % 128;
                                    } else {
                                        arrayList.add(new ec(ec.d.f1908, m2049(ExpandableListView.getPackedPositionGroup(0L) + 2, false, TextUtils.indexOf("", "", 0, 0) + TsExtractor.TS_STREAM_TYPE_E_AC3, "\u0000\u0000", View.MeasureSpec.makeMeasureSpec(0, 0) + 2).intern()));
                                        i10 += 2;
                                    }
                                    break;
                                case '-':
                                    if (cCharAt == '-') {
                                        arrayList.add(new ec(ec.d.f1908, m2048("䁵䞦", 2003 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()));
                                        i10 += 2;
                                    }
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                    ec.d dVar2 = ec.d.f1908;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str3.charAt(i10));
                                    arrayList.add(new ec(dVar2, sb4.toString()));
                                    break;
                                default:
                                    switch (cCharAt2) {
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                                            break;
                                        case '<':
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                                        case '>':
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i10))) {
                                                ec.d dVar3 = ec.d.f1904;
                                                String strM2054 = m2053(f1822, str3, i10);
                                                if (TextUtils.isEmpty(strM2054)) {
                                                    f1817 = (f1816 + 65) % 128;
                                                    dVar3 = ec.d.f1905;
                                                    strM2054 = m2053(f1824, str3, i10);
                                                    if (TextUtils.isEmpty(strM2054)) {
                                                        f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                    } else {
                                                        int iArgb = Color.argb(0, 0, 0, 0) + 37463;
                                                        f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                        if (strM2054.equals(m2048("䀬퉽撃\uf738", iArgb).intern()) || strM2054.equals(m2048("䀾㭶뚪㇆괁", KeyEvent.normalizeMetaState(0) + 31567).intern())) {
                                                            dVar3 = ec.d.f1903;
                                                        } else if (f1819.contains(strM2054)) {
                                                            dVar3 = ec.d.f1907;
                                                        }
                                                    }
                                                } else {
                                                    f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                }
                                                if (TextUtils.isEmpty(strM2054)) {
                                                    dVar3 = ec.d.f1901;
                                                    strM2054 = m2053(f1825, str3, i10);
                                                }
                                                if (TextUtils.isEmpty(strM2054)) {
                                                    dVar3 = ec.d.f1909;
                                                    strM2054 = m2053(f1828, str3, i10);
                                                }
                                                if (TextUtils.isEmpty(strM2054)) {
                                                    int i12 = f1817 + 37;
                                                    f1816 = i12 % 128;
                                                    if (i12 % 2 != 0) {
                                                        ec.d dVar4 = ec.d.f1907;
                                                        m2053(f1821, str3, i10);
                                                        throw null;
                                                    }
                                                    dVar3 = ec.d.f1908;
                                                    strM2054 = m2053(f1821, str3, i10);
                                                }
                                                if (TextUtils.isEmpty(strM2054)) {
                                                    dVar3 = ec.d.f1908;
                                                    strM2054 = m2053(f1823, str3, i10);
                                                }
                                                if (!TextUtils.isEmpty(strM2054)) {
                                                    arrayList.add(new ec(dVar3, strM2054));
                                                    length = strM2054.length();
                                                    i10 += length;
                                                } else {
                                                    String strK2 = f2.k(m2048("䀔礀㉚\ueb8aꓞ幆", 14652 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), str, new StringBuilder());
                                                    StringBuilder sb5 = new StringBuilder();
                                                    sb5.append(m2049((AudioTrack.getMaxVolume() > f10 ? 1 : (AudioTrack.getMaxVolume() == f10 ? 0 : -1)) + 17, true, 188 - (ViewConfiguration.getTapTimeout() >> 16), "\u000e\ufff5\uffc0\u0012\u0001\b\u0003\uffc0\u0004\u0005\u001a\t\u000e\u0007\u000f\u0003\u0005\u0012", TextUtils.getCapsMode("", 0, 0) + 2).intern());
                                                    sb5.append(str3.charAt(i10));
                                                    sb5.append(m2049(KeyEvent.keyCodeFromString("") + 13, true, (ViewConfiguration.getTouchSlop() >> 8) + 183, "\u0015ￅ\u0019\u0006ￅￅ\u0013\u0014\u000e\u0019\u000e\u0018\u0014", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4).intern());
                                                    sb5.append(i10);
                                                    sb5.append(m2049(4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false, 161 - View.MeasureSpec.getMode(0), "$)ￛￛ", TextUtils.indexOf("", "", 0) + 3).intern());
                                                    sb5.append(str2);
                                                    cn.m1706(strK2, sb5.toString());
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            String strM2055 = m2053(f1826, str3, i10);
                            if (strM2055 == null) {
                                String strK3 = f2.k(m2048("䀔礀㉚\ueb8aꓞ幆", 14653 - View.resolveSizeAndState(0, 0, 0)), str, new StringBuilder());
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(m2048("䀝\ueb67ᚰ䇐\ued1e\u18f9䏦\uef22ᩂ䖞\uf133ᱹ䞣\uf291ḝ䦯\uf4fa\u202c䭜\uf688≼䵨\uf8b2⎓伐者◹儮ﱀ➈匱﹥⧘", Color.red(0) + 43853).intern());
                                sb6.append(i10);
                                sb6.append(m2049(TextUtils.getOffsetAfter("", 0) + 4, false, View.getDefaultSize(0, 0) + 161, "$)ￛￛ", ExpandableListView.getPackedPositionType(0L) + 3).intern());
                                sb6.append(str2);
                                cn.m1706(strK3, sb6.toString());
                            } else {
                                String strM2052 = m2051(strM2055);
                                arrayList.add(new ec(ec.d.f1906, strM2052));
                                length = strM2052.length() + 2;
                                i10 += length;
                            }
                        }
                    } else {
                        j10 = 0;
                    }
                    if (cCharAt == '=') {
                        ec.d dVar5 = ec.d.f1908;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str3.charAt(i10));
                        arrayList.add(new ec(dVar5, f2.m(sb7, m2049(-Process.getGidForName(""), true, 154 - (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1))))));
                        i10 += 2;
                    } else {
                        ec.d dVar6 = ec.d.f1908;
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str3.charAt(i10));
                        arrayList.add(new ec(dVar6, sb8.toString()));
                    }
                }
                ec.d dVar7 = ec.d.f1908;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str3.charAt(i10));
                arrayList.add(new ec(dVar7, sb9.toString()));
            }
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2049(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1820);
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
    private static String m2051(String str) {
        int length;
        int i10 = f1817 + 31;
        f1816 = i10 % 128;
        int i11 = 1;
        if (i10 % 2 != 0) {
            length = str.length() >> 1;
            i11 = 0;
        } else {
            length = str.length() - 1;
        }
        return str.substring(i11, length);
    }
}
