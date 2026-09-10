package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jx {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2799 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2800 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Field f2802;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field f2806;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Class f2807;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Field f2808;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field f2809;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object f2810;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f2804 = {-1923904062, 1352515179, -760308427, -1709564255, 302879637, 476994724, -2117450483, -641312175, 1768947303, 1127123419, 447320613, 611676961, 1929253129, 339476148, 1424911335, 1654046350, 1448923684, -811017972};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static long f2805 = 2420180939209451931L;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2801 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2803 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<View> m2682() {
        f2800 = (f2799 + 19) % 128;
        int i2 = f2800 + 23;
        f2799 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                throw null;
            }
            if (f2807 == null || f2810 == null) {
                Class<?> cls = Class.forName(m2692(new int[]{555387842, -2013086787, -1425610566, -1386611521, 1237234858, 1950363136, -238519485, -102738963, 92223296, -2126077007, -243354794, 555987868, -1240001916, 1007430018, 291133235, 1930611849}, 'P' - AndroidCharacter.getMirror('0')).intern());
                f2807 = cls;
                f2810 = cls.getMethod(m2692(new int[]{1778691217, -1468407431, -233598046, -795076234, -1468552969, 412712052}, 11 - View.MeasureSpec.getMode(0)).intern(), new Class[0]).invoke(null, new Object[0]);
                f2800 = (f2799 + 17) % 128;
            }
            return m2689(f2807, f2810);
        } catch (Throwable th) {
            String strIntern = m2680(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2692(new int[]{-900831722, -1736110050, 1542342729, 609300590, -484840107, 786431277, 2131312034, 1493420663, 1574923121, -1608806561, -34301074, -1872324279, -368897939, 1818455703, 1237234858, 1950363136, 736630255, 1703946158}, 36 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            sb.append(th.getLocalizedMessage());
            n.m2826(strIntern, sb.toString());
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static View.OnClickListener m2685(View view) {
        try {
            Object objM2679 = m2679(view);
            if (objM2679 == null) {
                return null;
            }
            Class<?> cls = objM2679.getClass();
            synchronized (ju.class) {
                try {
                    if (f2808 == null) {
                        f2808 = m2681(cls, m2692(new int[]{1136170089, 226630617, -367168446, -1546278135, -1448747092, -351468026, 1094552337, -1411966917}, KeyEvent.keyCodeFromString("") + 16).intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnClickListener) f2808.get(objM2679);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2690(MediaPlayer mediaPlayer, hj.a aVar) {
        Field fieldM2681;
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
        int i2 = f2800 + 13;
        f2799 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                fieldM2681 = m2681(MediaPlayer.class, m2692(new int[]{-1467473614, -1703507003, 1558417728, -1040949433, 1105852153, -567080721, -861949381, -1493733318, 1991901057, -832310979, -396467703, -432722303}, 92 % (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1))).intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM2681.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof hj)) {
                    fieldM2681.set(mediaPlayer, new hj(onSeekCompleteListener, aVar));
                }
            } else {
                fieldM2681 = m2681(MediaPlayer.class, m2692(new int[]{-1467473614, -1703507003, 1558417728, -1040949433, 1105852153, -567080721, -861949381, -1493733318, 1991901057, -832310979, -396467703, -432722303}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23).intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM2681.get(mediaPlayer);
                if (!(onSeekCompleteListener instanceof hj)) {
                    fieldM2681.set(mediaPlayer, new hj(onSeekCompleteListener, aVar));
                }
            }
            f2800 = (f2799 + 93) % 128;
        } catch (Exception e2) {
            kb.m2752(m2680(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m2680((Process.getThreadPriority(0) + 20) >> 6, (char) Color.red(0), "\uddb5임搳蝐", "ﻬ蚈Ꝗ\ue482\ue14b磮들刿ԯⶢᄊ蘮삼㫲겒ꦾ聤膪ᓏ嬌ᡶ⸡㏶ꍖᾁ℻\u1c8e⳺뤓涿◈㠮昊妏蟻먿枺⠡", "⦛헀㖽↖").intern(), (Throwable) e2, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View.OnTouchListener m2691(View view) {
        try {
            Object objM2679 = m2679(view);
            if (objM2679 == null) {
                return null;
            }
            Class<?> cls = objM2679.getClass();
            synchronized (ju.class) {
                try {
                    if (f2802 == null) {
                        f2802 = m2681(cls, m2692(new int[]{-1998069456, 1337773769, 1665038695, -1241914322, -1448747092, -351468026, 1094552337, -1411966917}, KeyEvent.getDeadChar(0, 0) + 16).intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnTouchListener) f2802.get(objM2679);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2686(MediaPlayer mediaPlayer, hd.e eVar) {
        f2799 = (f2800 + 45) % 128;
        try {
            Field fieldM2681 = m2681(MediaPlayer.class, m2680((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1690403865, (char) (Color.red(0) + 4883), "᪓솄፤묓", "쩣\udbee洑\uf6f2᪽㚆緧Ḹ\uf0e7縵霚駁띪혥빥", "⦛헀㖽↖").intern());
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) fieldM2681.get(mediaPlayer);
            if (onInfoListener instanceof hd) {
                return;
            }
            fieldM2681.set(mediaPlayer, new hd(onInfoListener, eVar));
            f2799 = (f2800 + 5) % 128;
        } catch (Exception e2) {
            kb.m2752(m2680(KeyEvent.getMaxKeyCode() >> 16, (char) TextUtils.getOffsetAfter("", 0), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m2692(new int[]{-338193475, -472757021, -1727675446, 111624720, 1630474755, 1614818785, -892682005, -678146655, 1953239672, 1934030154, -1803596905, -691560447, -253275399, -624747524, 1991901057, -832310979, -396467703, -432722303}, 35 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), (Throwable) e2, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2692(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2804.clone();
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2683(View view, hc.d dVar) {
        View.OnClickListener onClickListenerM2685 = m2685(view);
        if (!(onClickListenerM2685 instanceof hc)) {
            view.setOnClickListener(new hc(onClickListenerM2685, dVar));
            f2800 = (f2799 + 83) % 128;
        }
        int i2 = f2799 + 95;
        f2800 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<View> m2689(Class cls, Object obj) throws Exception {
        if (f2806 == null) {
            f2799 = (f2800 + 35) % 128;
            Field declaredField = cls.getDeclaredField(m2680(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (5438 - AndroidCharacter.getMirror('0')), "瘄ᗳๅ鬕", "⛍Ꜧ웥냷쵾斑", "⦛헀㖽↖").intern());
            f2806 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f2806.get(obj);
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof View[]) {
                return Arrays.asList((View[]) f2806.get(obj));
            }
            ArrayList arrayList = new ArrayList();
            f2799 = (f2800 + 113) % 128;
            return arrayList;
        }
        return (List) f2806.get(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r1 != null) goto L11;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.media.MediaPlayer m2678(android.widget.VideoView r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.jx.m2678(android.widget.VideoView):android.media.MediaPlayer");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2687(MediaPlayer mediaPlayer, he.a aVar) {
        f2800 = (f2799 + 23) % 128;
        try {
            Field fieldM2681 = m2681(MediaPlayer.class, m2692(new int[]{1136170089, 226630617, 1105852153, -567080721, -1440583948, 934742380, -1698051916, -496321564, 1867588837, 2111740736, 668844379, 1486729200}, Color.blue(0) + 21).intern());
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2681.get(mediaPlayer);
            if (onCompletionListener instanceof he) {
                return;
            }
            fieldM2681.set(mediaPlayer, new he(onCompletionListener, aVar));
            f2799 = (f2800 + 41) % 128;
        } catch (Exception e2) {
            kb.m2752(m2680(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (ViewConfiguration.getLongPressTimeout() >> 16), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m2680(472391825 - TextUtils.getOffsetBefore("", 0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 25909), "酖⠠㔜\uf765", "봄邢᳧池\uefb7↚솧雜㧢\udf82ꒂ\ue32fၸ蕩氀貏꽹볏\uf178놞帻璟﨨橨銘潱㇤\u05cd흜Ὁ밄\ue689괅嘦喆뾴\u038bᠦԌ∺踪", "⦛헀㖽↖").intern(), (Throwable) e2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Object m2679(View view) {
        try {
            synchronized (ju.class) {
                try {
                    if (f2809 == null) {
                        f2809 = m2681(View.class, m2692(new int[]{-2038419368, -677480854, 1867588837, 2111740736, 1983353245, -577017425, 516020469, 1922639966}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12).intern());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f2809.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2688(MediaPlayer mediaPlayer, hf.c cVar) {
        f2800 = (f2799 + 37) % 128;
        try {
            Field fieldM2681 = m2681(MediaPlayer.class, m2680((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 199864813, (char) (42965 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "ᐥᙎ헴膧", "鄰\ud974팈祽쩘緝\uf50b\udf92䪟闏굊ᬶ뺔Ⅷ⺆툔\ud848甸枿", "⦛헀㖽↖").intern());
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2681.get(mediaPlayer);
            if (!(onPreparedListener instanceof hf)) {
                fieldM2681.set(mediaPlayer, new hf(onPreparedListener, cVar));
            }
            f2799 = (f2800 + 41) % 128;
        } catch (Exception e2) {
            kb.m2752(m2680(TextUtils.indexOf("", "", 0, 0), (char) TextUtils.indexOf("", "", 0), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m2692(new int[]{-338193475, -472757021, -1727675446, 111624720, 1630474755, 1614818785, -892682005, -678146655, 1953239672, 1934030154, -310556463, -1551829289, -862212217, 1724229271, 1771150069, -1589732459, 1991901057, -832310979, -396467703, -432722303}, 39 - TextUtils.getOffsetBefore("", 0)).intern(), (Throwable) e2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field m2681(Class cls, String str) {
        Field declaredField;
        int i2 = f2799 + 69;
        f2800 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                declaredField = cls.getDeclaredField(str);
            } else {
                declaredField = cls.getDeclaredField(str);
            }
            declaredField.setAccessible(true);
            int i3 = f2799 + 39;
            f2800 = i3 % 128;
            if (i3 % 2 != 0) {
                return declaredField;
            }
            throw null;
        } catch (Exception e2) {
            kb.m2752(m2680(View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "蕯圝ᩫ\uf5df", "셶ୡ輗ߧ瑿ߟz键肮躁롯\uf36f", "⦛헀㖽↖").intern(), m2680((-2045575255) - Gravity.getAbsoluteGravity(0, 0), (char) ExpandableListView.getPackedPositionType(0L), "ꤥዿ㖆䆪", "⥠\udd9c팔쌚簀톊┫䥅\ude1bܐ\ue033ഥ㑅\udfab펮芅\ud944輜綰\ud9f0꓅˹䆻젠賏", "⦛헀㖽↖").intern(), (Throwable) e2, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2684(View view, hk.d dVar) {
        View.OnTouchListener onTouchListenerM2691 = m2691(view);
        if (!(onTouchListenerM2691 instanceof hk)) {
            view.setOnTouchListener(new hk(onTouchListenerM2691, dVar));
            f2799 = (f2800 + 59) % 128;
        }
        int i2 = f2799 + 45;
        f2800 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2680(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2805) ^ ((long) f2801)) ^ ((long) f2803));
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
