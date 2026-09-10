package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ie extends hy {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private List<Class> f2455;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f2456;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<Class> f2457 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private int f2458;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Class f2459;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f2460;

    public ie() {
        mo2323();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final int m2391() {
        return this.f2458;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m2392() {
        return this.f2456;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Class m2393() {
        return this.f2459;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m2394() {
        return this.f2460;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final List<Class> m2395() {
        return this.f2457;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m2396() {
        return this.f2455;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hy
    /* JADX INFO: renamed from: ﾇ */
    public final void mo2323() {
        super.mo2323();
        this.f2459 = null;
        this.f2460 = 0;
        this.f2456 = true;
        this.f2457.clear();
        this.f2455 = null;
        this.f2458 = -1;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b extends hy.e implements ch {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2461 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int[] f2462 = {-1532905385, 1546617307, -692346687, -1939764016, -790908291, -1028789114, 1161895575, 909109975, -711138579, 1399174031, -1252861551, 965207937, -1400968576, 1186291046, 2069002847, -205284554, 1265233165, -387780918};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2463 = -5967968094001886661L;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2464;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ie f2465 = new ie();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private b m2397(int i10) {
            ie ieVar;
            int i11;
            int i12 = f2461;
            int i13 = i12 + 27;
            f2464 = i13 % 128;
            if (i13 % 2 != 0) {
                ieVar = this.f2465;
                i11 = i10 & ieVar.f2416;
            } else {
                ieVar = this.f2465;
                i11 = i10 | ieVar.f2416;
            }
            ieVar.f2416 = i11;
            f2464 = (i12 + 13) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m2399(Class cls) {
            f2464 = (f2461 + 59) % 128;
            this.f2465.f2457.add(cls);
            f2461 = (f2464 + 53) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private b m2400(int i10) {
            int i11 = (f2461 + 61) % 128;
            f2464 = i11;
            ie ieVar = this.f2465;
            ieVar.f2417 = i10 | ieVar.f2417;
            int i12 = i11 + 59;
            f2461 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 23 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m2403(int i10) {
            int i11 = f2461 + 61;
            f2464 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f2465.f2460 = i10;
                return this;
            }
            this.f2465.f2460 = i10;
            int i12 = 87 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m2408(Class cls) {
            f2464 = (f2461 + 77) % 128;
            this.f2465.f2459 = cls;
            f2461 = (f2464 + 29) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m2398() {
            int i10 = f2464 + 1;
            f2461 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2465.mo2323();
                f2461 = (f2464 + 61) % 128;
                return this;
            }
            this.f2465.mo2323();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ie m2401() {
            int i10 = f2464;
            ie ieVar = this.f2465;
            f2461 = (i10 + 3) % 128;
            return ieVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m2407(int i10) {
            f2461 = (f2464 + 1) % 128;
            this.f2465.f2458 = i10;
            f2464 = (f2461 + 17) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2402(int[] iArr, int i10) {
            String str;
            synchronized (a.f61) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2462.clone();
                    a.f58 = 0;
                    while (true) {
                        int i11 = a.f58;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c4 = (char) (i12 >> 16);
                            cArr[0] = c4;
                            char c5 = (char) i12;
                            cArr[1] = c5;
                            char c10 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c10;
                            char c11 = (char) iArr[i11 + 1];
                            cArr[3] = c11;
                            a.f59 = (c4 << 16) + c5;
                            a.f60 = (c10 << 16) + c11;
                            a.m199(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = a.f59 ^ iArr2[i13];
                                a.f59 = i14;
                                int iM200 = a.m200(i14) ^ a.f60;
                                int i15 = a.f59;
                                a.f59 = iM200;
                                a.f60 = i15;
                            }
                            int i16 = a.f59;
                            int i17 = a.f60;
                            a.f59 = i17;
                            a.f60 = i16;
                            int i18 = i16 ^ iArr2[16];
                            a.f60 = i18;
                            int i19 = i17 ^ iArr2[17];
                            a.f59 = i19;
                            cArr[0] = (char) (i19 >>> 16);
                            cArr[1] = (char) i19;
                            cArr[2] = (char) (i18 >>> 16);
                            cArr[3] = (char) i18;
                            a.m199(iArr2);
                            int i20 = a.f58;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            a.f58 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m2405(boolean z10) {
            f2461 = (f2464 + 83) % 128;
            this.f2465.f2456 = z10;
            int i10 = f2464 + 37;
            f2461 = i10 % 128;
            if (i10 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x017e  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ch
        /* JADX INFO: renamed from: ﾒ */
        public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
            try {
                byte b10 = 10;
                switch (str.hashCode()) {
                    case -2020212392:
                        if (!str.equals(m2402(new int[]{708941887, -260489668, -2002385857, -21471675, 887120846, 591806740, -345208317, 2088207065, -163274753, -1271374690, 341831332, 932391522}, 21 - View.MeasureSpec.getSize(0)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case -600792781:
                        if (!str.equals(m2402(new int[]{-494406492, 873953954, 1836256373, -1492633794, -960682354, -1020964080}, Process.getGidForName("") + 12).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 94094958:
                        if (!str.equals(m2409("ਖ਼縥\ue284圖\udbf3", (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 29802).intern())) {
                            b10 = -1;
                        }
                        break;
                    case 108404047:
                        if (!str.equals(m2409("\u0a49瘭\uf2ae缇ﮃ", View.combineMeasuredStates(0, 0) + 31859).intern())) {
                            b10 = -1;
                        } else {
                            int i10 = f2464 + 29;
                            f2461 = i10 % 128;
                            b10 = i10 % 2 != 0 ? (byte) 9 : (byte) 91;
                        }
                        break;
                    case 132643084:
                        if (!str.equals(m2409("ੈ겯䞭ﺦ醊䣣\ue3ff髉㷁퐍輷☰\ud916灴\u2b74쉉敎ᱎ뚬榪\u009c", 42737 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                            b10 = -1;
                        } else {
                            f2464 = (f2461 + 67) % 128;
                        }
                        break;
                    case 200590504:
                        if (!str.equals(m2402(new int[]{1786082674, 1592957163, 1610148499, 291920251, -2031405219, 1380109242, 1342257575, 2082539765, -1120219994, -362121914, -1350743815, 1301895142}, 24 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                            b10 = -1;
                        } else {
                            int i11 = f2461 + InterfaceC0435l1.d.b.f29112i;
                            f2464 = i11 % 128;
                            b10 = i11 % 2 == 0 ? (byte) 4 : (byte) 2;
                        }
                        break;
                    case 387034026:
                        if (!str.equals(m2409("ੈ㵟摘꽊활ᥖ䁴譒뉠\ue547ⱁ坕鹅셕࡙㍕穘굙", Color.blue(0) + 14081).intern())) {
                            b10 = -1;
                        } else {
                            f2461 = (f2464 + 9) % 128;
                            b10 = 7;
                        }
                        break;
                    case 391966482:
                        if (!str.equals(m2402(new int[]{842156393, 963972742, -297653134, -763458592, 156323884, 215228252, 1124327293, -1991985520, 1328279385, 2117546069, 341831332, 932391522}, View.MeasureSpec.makeMeasureSpec(0, 0) + 21).intern())) {
                            b10 = -1;
                        } else {
                            f2464 = (f2461 + 55) % 128;
                            b10 = 5;
                        }
                        break;
                    case 393987200:
                        if (!str.equals(m2402(new int[]{-115270433, 271491749, -2002385857, -21471675, 887120846, 591806740, -1794947617, 1532334244, -531404076, 1829834931}, ExpandableListView.getPackedPositionGroup(0L) + 19).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 1423210564:
                        if (!str.equals(m2409("ਗ਼\uf2b0ﮁ\ue0bb\ue9e8훴\udfc8쓔촪쨹댟렍ꅛ깷靬鱂蒨趈誀珢磲", 63728 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 6;
                        }
                        break;
                    case 1773646829:
                        if (!str.equals(m2409("ੈ\ued41쑱뼶阦角惠宏㊦⩘൨\ue41c\udf3c뛼꧰肚箮升", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 59166).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        return m2408((Class) cw.m1805(list, 0, Class.class));
                    case 1:
                        return m2404((List<Class>) cw.m1805(list, 0, List.class));
                    case 2:
                        return m2407(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                    case 3:
                        return m2403(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                    case 4:
                        return m2405(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                    case 5:
                        return m2397(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                    case 6:
                        return m2400(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                    case 7:
                        return m2406(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue(), list.size() > 1 ? ((Integer) cw.m1805(list, 1, Integer.class)).intValue() : -1);
                    case 8:
                        return m2399((Class) cw.m1805(list, 0, Class.class));
                    case 9:
                        return m2398();
                    case 10:
                        return m2401();
                    default:
                        new ds(clVar, eeVar, m2409("੶\ue51b퓅잜띀ꘆ釡肽灵挿勧䶥㵳ⳓᾒཞ", (KeyEvent.getMaxKeyCode() >> 16) + 61253).intern(), str).m2034(clVar.m1643());
                        return null;
                }
            } catch (Exception e10) {
                String strM1643 = clVar.m1643();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2409("\u0a7e\uaad0䭻\ueb9f蠭⣦짚湼ບ꼶侤\uec88赲ⶆ숀抯Ϟꁦ䂐\ue10e膨⚖읐柡З꒢䗞塚髃㬋\udbb3磕\u1975맫帝ﺹ鿐㱈\udcad級ᶲ닎午\uf3fe递ヾ턨癉\u16ff뜚垶\uf424锏㖱", 41113 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                sb2.append(str);
                sb2.append(m2409("ਜ", ((byte) KeyEvent.getModifierMetaStateMask()) + 43592).intern());
                cn.m1708(strM1643, sb2.toString(), e10);
                return null;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m2406(boolean z10, int i10) {
            int i11 = f2461;
            int i12 = i11 + 65;
            f2464 = i12 % 128;
            if (i12 % 2 != 0) {
                ie ieVar = this.f2465;
                ieVar.f2419 = z10;
                ieVar.f2418 = i10;
                int i13 = 54 / 0;
            } else {
                ie ieVar2 = this.f2465;
                ieVar2.f2419 = z10;
                ieVar2.f2418 = i10;
            }
            int i14 = i11 + 25;
            f2464 = i14 % 128;
            if (i14 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m2404(List<Class> list) {
            int i10 = f2461 + InterfaceC0435l1.d.b.f29112i;
            f2464 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2465.f2455 = list;
                f2461 = (f2464 + 73) % 128;
                return this;
            }
            this.f2465.f2455 = list;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2409(String str, int i10) {
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
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2463);
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
    }
}
