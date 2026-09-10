package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hp extends hm {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private int f2277;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private List<Class> f2278 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f2279;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Class f2280;

    public hp() {
        super.mo2201();
        this.f2280 = null;
        this.f2277 = 0;
        this.f2279 = true;
        this.f2278.clear();
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Class m2226() {
        return this.f2280;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2227() {
        return this.f2279;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final int m2228() {
        return this.f2277;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m2229() {
        return this.f2278;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2230(Class cls) {
        this.f2280 = cls;
    }

    public static class e extends hm.c implements ck {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2282 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2284;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private hp f2285 = new hp();

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2283 = {'s', 15742, 31298, 46853, 62485, 12791, 28359, 44009, 59575, 9653, 25447, 41031, 56608, 's', 15728, 31327, 46881, 62506, 12782, 28359, 43985, 59580, 9600, 28274, 21375, 5206, 55586, 39438, 24558, 229, 50643, 34475, 19383, 3447, 52809, 45862, 29738, 14639, 64237, 49089, 24751, 'a', 15743, 31314, 46876, 62467, 12771, 28363, 43995, 59569, 9622, 25468, 41050, 56592, 6704, 22323, 38139, 53715, 3751, 19347, 35173, 50809, 37838, 44752, 59901, 9395, 26540, 41548, 64868, 14452, 31518, 46649, 61651, 13301, 20159, 35231, 50320, 1858, 17020, 40200, 55356, 6858, 21974, 62738, 51231, 36662, 16962, 366, 50318, 39818, 24242, 7658, 53479, 38431, 21805, 10327, 61277, 41591, 24981, 9378, 64473, 'a', 15743, 31314, 46853, 62485, 12791, 28359, 44009, 59575, 9658, 25449, 41031, 56619, 6701, 22303, 40499, 41791, 58372, 10613, 27225, 31407, 18339, 146, 52720, 36549};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2281 = -4304465796164666085L;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private e m2232(int i2) {
            f2282 = (f2284 + 61) % 128;
            this.f2285.f2277 = i2;
            f2284 = (f2282 + 61) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private e m2235() {
            int i2 = f2282 + 63;
            f2284 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2285.mo2201();
                return this;
            }
            this.f2285.mo2201();
            int i3 = 96 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m2238(Class cls) {
            f2282 = (f2284 + 55) % 128;
            this.f2285.f2280 = cls;
            f2284 = (f2282 + 99) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m2240(int i2) {
            hp hpVar;
            int i3;
            int i4 = f2284 + 41;
            int i5 = i4 % 128;
            f2282 = i5;
            if (i4 % 2 == 0) {
                hpVar = this.f2285;
                i3 = i2 ^ hpVar.f2252;
            } else {
                hpVar = this.f2285;
                i3 = i2 | hpVar.f2252;
            }
            hpVar.f2252 = i3;
            f2284 = (i5 + 93) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private e m2233(boolean z2) {
            f2282 = (f2284 + 17) % 128;
            this.f2285.f2279 = z2;
            int i2 = f2282 + 79;
            f2284 = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private e m2236(Class cls) {
            int i2 = f2282 + 9;
            f2284 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2285.f2278.add(cls);
                return this;
            }
            this.f2285.f2278.add(cls);
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m2237(int i2) {
            int i3 = f2284;
            f2282 = (i3 + 17) % 128;
            hp hpVar = this.f2285;
            hpVar.f2253 = i2 | hpVar.f2253;
            f2282 = (i3 + 61) % 128;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0046  */
        @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
        /* JADX INFO: renamed from: ﾇ */
        public final Object mo792(String str, List<Object> list, ch chVar) {
            f2282 = (f2284 + 5) % 128;
            byte b2 = 8;
            int iIntValue = -1;
            switch (str.hashCode()) {
                case -1347544616:
                    if (!str.equals(m2231(18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 23 - View.resolveSize(0, 0), (char) (28161 - Color.green(0))).intern())) {
                        b2 = -1;
                    } else {
                        f2282 = (f2284 + 67) % 128;
                        b2 = 2;
                    }
                    break;
                case -923635536:
                    if (!str.equals(m2231(TextUtils.indexOf("", "", 0, 0) + 13, ExpandableListView.getPackedPositionType(0L), (char) (Process.getGidForName("") + 1)).intern())) {
                        b2 = -1;
                    } else {
                        f2282 = (f2284 + 1) % 128;
                        b2 = 0;
                    }
                    break;
                case -216533736:
                    b2 = !str.equals(m2231((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, 13 - TextUtils.indexOf("", ""), (char) KeyEvent.keyCodeFromString("")).intern()) ? (byte) -1 : (byte) 1;
                    break;
                case 94094958:
                    if (!str.equals(m2231((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, TextUtils.getOffsetAfter("", 0) + 121, (char) (31437 - (KeyEvent.getMaxKeyCode() >> 16))).intern())) {
                        b2 = -1;
                    } else {
                        int i2 = f2282 + 53;
                        f2284 = i2 % 128;
                        if (i2 % 2 != 0) {
                            b2 = 119;
                        }
                    }
                    break;
                case 108404047:
                    b2 = !str.equals(m2231(5 - TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0', 0) + 117, (char) (40513 - Drawable.resolveOpacity(0, 0))).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case 387034026:
                    b2 = !str.equals(m2231((ViewConfiguration.getJumpTapTimeout() >> 16) + 18, (ViewConfiguration.getTapTimeout() >> 16) + 83, (char) (Color.alpha(0) + 62817)).intern()) ? (byte) -1 : (byte) 5;
                    break;
                case 391966482:
                    if (!str.equals(m2231(21 - TextUtils.indexOf("", "", 0), Color.green(0) + 41, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        int i3 = f2284 + 13;
                        f2282 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b2 = 3;
                        } else {
                            b2 = 4;
                        }
                    }
                    break;
                case 1067445448:
                    b2 = !str.equals(m2231(14 - Process.getGidForName(""), View.combineMeasuredStates(0, 0) + 101, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 6;
                    break;
                case 1423210564:
                    if (!str.equals(m2231((Process.myPid() >> 22) + 21, 62 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (37806 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return m2238((Class) cz.m1785(list, 0, Class.class));
                case 1:
                    return m2232(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                case 2:
                    return m2233(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                case 3:
                    return m2237(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                case 4:
                    return m2240(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                case 5:
                    boolean zBooleanValue = ((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue();
                    if (list.size() > 1) {
                        f2284 = (f2282 + 5) % 128;
                        iIntValue = ((Integer) cz.m1785(list, 1, Integer.class)).intValue();
                    }
                    return m2234(zBooleanValue, iIntValue);
                case 6:
                    return m2236((Class) cz.m1785(list, 0, Class.class));
                case 7:
                    return m2235();
                case 8:
                    return m2239();
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2231(int i2, int i3, char c2) {
            String str;
            synchronized (a.f68) {
                try {
                    char[] cArr = new char[i2];
                    a.f69 = 0;
                    while (true) {
                        int i4 = a.f69;
                        if (i4 < i2) {
                            cArr[i4] = (char) ((((long) f2283[i3 + i4]) ^ (((long) i4) * f2281)) ^ ((long) c2));
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

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private e m2234(boolean z2, int i2) {
            int i3 = f2282;
            f2284 = (i3 + 103) % 128;
            hp hpVar = this.f2285;
            hpVar.f2251 = z2;
            hpVar.f2254 = i2;
            f2284 = (i3 + 59) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final hp m2239() {
            int i2 = (f2282 + 103) % 128;
            f2284 = i2;
            hp hpVar = this.f2285;
            int i3 = i2 + 101;
            f2282 = i3 % 128;
            if (i3 % 2 != 0) {
                return hpVar;
            }
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.hm
    /* JADX INFO: renamed from: ﻐ */
    public final void mo2201() {
        super.mo2201();
        this.f2280 = null;
        this.f2277 = 0;
        this.f2279 = true;
        this.f2278.clear();
    }
}
