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
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bc {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f728 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<String> f729;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f730;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f731;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, List<? extends gi>> f732;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f733;

    static {
        m765();
        f729 = Arrays.asList(m770("┢╣ꥤ\ueb43鱌쀝㤨Ꝉ脾꒔鶟䏢涮᬴\uf015\u181a젒ｮ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), m770("䂹䃸㿵\udebf巻嚌\u0cd4替\ue4a5㈅ꡣ艕࠵趺엎", 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m770("䗒䖓磨诧鶲ᆑ妌ꚶ\ue1ce甘ﴻ䈜൞쪬邡᧻\ua8cd⻥㐇", -TextUtils.indexOf((CharSequence) "", '0')).intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(m766(3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - KeyEvent.keyCodeFromString(""), 125 - KeyEvent.normalizeMetaState(0), "\ufff3\n\uffe7\b\u0015", true).intern(), m771(new fx()));
        linkedHashMap.put(m766((ViewConfiguration.getScrollBarSize() >> 8) + 7, TextUtils.lastIndexOf("", '0', 0) + 10, (KeyEvent.getMaxKeyCode() >> 16) + 135, "�\u0016\u000b\n\uffdd\f\u000f\uffdd\t", false).intern(), m771(new gb()));
        linkedHashMap.put(m770("ᘉᙈ恡櫘\ueae6ऌ뢒퇽눒涆ᰟ㕃", Color.alpha(0) + 1).intern(), m771(new fz()));
        linkedHashMap.put(m766(3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 9 - Color.alpha(0), KeyEvent.keyCodeFromString("") + Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "\u0002\u0004￡\u0018\u0013\u0004￣\u0000\r", false).intern(), m771(new ge.a(), new ge.c()));
        linkedHashMap.put(m770("邔郖蠅Ꟛ᭽\ue171疄\u2067㒁藷턜쓟\ud812㩥", (KeyEvent.getMaxKeyCode() >> 16) + 1).intern(), m771(new gg()));
        linkedHashMap.put(m770("㩱㨲狊嗛ꩥᮿ螀酀鹱缹⌚痁狪삻", View.combineMeasuredStates(0, 0) + 1).intern(), m771(new gf()));
        linkedHashMap.put(m770("瀁灇搁䖴㏩ൽ韭ࣛ퐗槿㍵\uec49", -MotionEvent.axisFromString("")).intern(), m771(new gh()));
        linkedHashMap.put(m766(4 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.red(0) + 7, View.resolveSize(0, 0) + 128, "\u0015\f\u0004￩\u0007\f￥", true).intern(), m771(new gd()));
        linkedHashMap.put(m770("ﾬ￪\uf022᠐皨饖쩜䶚宙\ufdd7", -MotionEvent.axisFromString("")).intern(), m771(new gm()));
        linkedHashMap.put(m770("ᾡῩ〱\uf32a\ue40b奕Ⅰ\udf2e뮘㷸", 1 - TextUtils.getOffsetAfter("", 0)).intern(), m771(new gk()));
        linkedHashMap.put(m770("뎮돧梋\udde7\uf3bfǸྐ좇ី敳", 1 - TextUtils.getOffsetAfter("", 0)).intern(), m771(new gj()));
        linkedHashMap.put(m770("壱墸Ꜻ蓘͈칉嚌㡺ﳷ\uaaca\uf215\udcf7ၰᕉ龟", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m771(new gl()));
        linkedHashMap.put(m770("\udf0f\udf46薥䠗\uea43\uecca驂텺笨衛㻌㗺鞄㟅", ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern(), m771(new gn()));
        linkedHashMap.put(m770("\ue27f\ue232鯍흤낖\uf2b1Է议", TextUtils.getOffsetBefore("", 0) + 1).intern(), m771(new go()));
        linkedHashMap.put(m770("毭殠귈ヱⲟ쒼\ue2a5ូ쿼ꀾ䘭\uf335⍩", Color.rgb(0, 0, 0) + 16777217).intern(), m771(new gp.b(), new gp.d()));
        linkedHashMap.put(m770("䟞䞓鸋⅝䰌\uf779\uf30b眴\ue3c9鏵", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m771(new gq()));
        linkedHashMap.put(m770("⑩␤ᭋꁾﰄ爯爐윲聯ᚽ횵⎻", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), m771(new gr()));
        linkedHashMap.put(m766((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, 141 - (Process.myPid() >> 22), "\u000f￥�\u000b\b", false).intern(), m771(new gw(), new gw.c()));
        linkedHashMap.put(m766(4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 9 - TextUtils.indexOf("", "", 0), (Process.myPid() >> 22) + Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "￩�\u0010￫\u0000\u0011\u0004\u000f￼", true).intern(), m771(new gs()));
        linkedHashMap.put(m770("েঔꪤ胸朷쏔劣封귇Ꝛ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m771(new gu()));
        linkedHashMap.put(m766(TextUtils.indexOf("", "") + 3, 12 - View.combineMeasuredStates(0, 0), 140 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\b\r￫�\u0005\u0007\u000b�\u000f\uffd9\n�", true).intern(), m771(new gt()));
        linkedHashMap.put(m766(3 - Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, 140 - View.MeasureSpec.getMode(0), "\u0001\u0006\u0010￫\ufff8\u0007", false).intern(), m771(new gv()));
        linkedHashMap.put(m766(View.resolveSize(0, 0) + 7, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, 138 - TextUtils.getOffsetAfter("", 0), "￭\ufffe\u0007￼\ufffe\u0007\r", false).intern(), m771(new gx()));
        linkedHashMap.put(m770("\u0b5b\u0b0e븡ქ룭흒슶菎꽖돱是杕", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m771(new hb(), new hb.b()));
        linkedHashMap.put(m770("ἣή㌾ۓᣗ婖풇⏧묻㻊", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), m771(new gz.c(), new gz.e()));
        linkedHashMap.put(m770("뚆뛟쮵줾ᐾꋉ᭪⼍ኗ왜", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1).intern(), m771(new ha()));
        f732 = Collections.unmodifiableMap(linkedHashMap);
        int i2 = f728 + 123;
        f733 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m765() {
        f731 = -3797466717238892259L;
        f730 = 35;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m767() {
        int i2 = f733;
        List<String> list = f729;
        int i3 = i2 + 93;
        f728 = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<gi> m768() {
        List<gi> listAsList = Arrays.asList(new gc(), new fy(), new fw());
        int i2 = f728 + 111;
        f733 = i2 % 128;
        if (i2 % 2 == 0) {
            return listAsList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static gi m769() {
        ga gaVar = new ga();
        f728 = (f733 + 113) % 128;
        return gaVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<? extends gi> m771(gi... giVarArr) {
        int i2 = f728 + 15;
        f733 = i2 % 128;
        int i3 = i2 % 2;
        List<? extends gi> listAsList = Arrays.asList(giVarArr);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return listAsList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m774() {
        int jumpTapTimeout;
        int i2 = f728 + 67;
        f733 = i2 % 128;
        if (i2 % 2 != 0) {
            ViewConfiguration.getJumpTapTimeout();
            jumpTapTimeout = 0;
        } else {
            jumpTapTimeout = 1 - (ViewConfiguration.getJumpTapTimeout() >> 16);
        }
        String strIntern = m770("뱭밬」葼懘奴嘗嫺ᡸ㷰\uf2bb빧\uf4fc艛鼶\ue586元昑㮎", jumpTapTimeout).intern();
        f733 = (f728 + 99) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m766(int i2, int i3, int i4, String str, boolean z2) {
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
                    cArr2[i6] = (char) (cArr2[i6] - f730);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m770(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f731, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f731));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Map<String, List<gi>> m772() {
        ArrayList arrayList = new ArrayList(f732.keySet());
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = f733 + 25;
            f728 = i2 % 128;
            if (i2 % 2 == 0) {
                f732.get((String) it.next());
                throw null;
            }
            String str = (String) it.next();
            List<? extends gi> list = f732.get(str);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                f733 = (f728 + 1) % 128;
                for (gi giVar : list) {
                    f728 = (f733 + 53) % 128;
                    if (m773(giVar)) {
                        f733 = (f728 + 73) % 128;
                        arrayList2.add(giVar);
                        f728 = (f733 + 23) % 128;
                    }
                }
                map.put(str, arrayList2);
            }
        }
        f728 = (f733 + 9) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m773(gi giVar) {
        f728 = (f733 + 7) % 128;
        try {
            if (!Prode.m220()) {
                Class.forName(giVar.mo2138());
                return true;
            }
            giVar.mo2140();
            f728 = (f733 + 119) % 128;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
