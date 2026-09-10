package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class cm {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ig.d f1455;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1456;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f1457;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private cq f1458;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final cq m1701() {
        return this.f1458;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ig m1702(ii iiVar) {
        return this.f1455.m2443(iiVar, this.f1457, this.f1456);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d extends cw implements ch {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1459 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1460 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f1461 = 4332122569198919397L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f1462 = {'s', 'e', 't', 'S', 'a', 'r', 'c', 'h', 'u', 'p', 'C', 'l', 'M', 'i', 'n', 'D', 'F', 'o', 'I', 'A', 'O', 'b', 'j', 'g', 'm', 'y', 'E', 'q', 'd', '\'', 'v', 'w', 'x', 'z', '{', '|'};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f1463 = 6;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private cq.e f1464;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cm f1465;

        public d(List<String> list, int i10) {
            cm cmVar = new cm();
            this.f1465 = cmVar;
            cmVar.f1455 = new ig.d();
            this.f1465.f1457 = list;
            this.f1465.f1456 = i10;
            this.f1464 = new cq.e();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1703(String str, int i10) {
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
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1461);
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

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cm m1704() {
            int i10 = f1459 + 27;
            f1460 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f1465.f1458 = this.f1464.m1749();
                return this.f1465;
            }
            this.f1465.f1458 = this.f1464.m1749();
            int i11 = 20 / 0;
            return this.f1465;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:6:0x002f  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ch
        /* JADX INFO: renamed from: ﾒ */
        public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
            int i10 = f1460 + 69;
            f1459 = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    str.hashCode();
                    throw null;
                }
                try {
                    byte b10 = 7;
                    switch (str.hashCode()) {
                        case -1930334554:
                            if (!str.equals(m1703("\ude96ᵣ套锟턌෫䧅薳솕㱗硕둩\uf020Ⱂ棼", (ViewConfiguration.getFadingEdgeLength() >> 16) + 50147).intern())) {
                                b10 = -1;
                            }
                            break;
                        case -1826216039:
                            if (!str.equals(m1705(10 - TextUtils.indexOf("", ""), "\u0001\u001a\u0007\u0003\u001b\u001c\n\u0002\u0006\u0005", (byte) (48 - Color.red(0))).intern())) {
                                b10 = -1;
                            } else {
                                int i11 = f1460 + 51;
                                f1459 = i11 % 128;
                                b10 = i11 % 2 != 0 ? (byte) 14 : (byte) 105;
                            }
                            break;
                        case -994397843:
                            if (!str.equals(m1703("\ude96ᑥ䭛븇\uf518⣲\u1fff勃覽ﲜ㉿楴尶錶옮㷯烅ꞣ", 51940 - ImageFormat.getBitsPerPixel(0)).intern())) {
                                b10 = -1;
                            } else {
                                int i12 = f1459 + 77;
                                f1460 = i12 % 128;
                                b10 = i12 % 2 == 0 ? (byte) 6 : (byte) 118;
                            }
                            break;
                        case -941967812:
                            if (!str.equals(m1703("\ude96갳㯷蚯ᑜ\ue3ea溲ﱲ䬾훂ꑺ㌧뻲\u0dbe魆曵\uf5bc䍲", View.MeasureSpec.getMode(0) + 29363).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        case -770599694:
                            if (!str.equals(m1703("\ude96橣띗쀁ഀ囤\ue3f3ⲵ禍蕪칓᭢ꐮ\uf110㫌䟀邰\udd95楸", (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 46307).intern())) {
                                b10 = -1;
                            }
                            break;
                        case -235079533:
                            if (!str.equals(m1705(18 - (ViewConfiguration.getTouchSlop() >> 8), "\u0001\u0002\u0004\b\u0000\n\r\u0007\u0017\u0007\b\u0017\u0016\u0017\u0000\u0007\u0003\u0001", (byte) (75 - TextUtils.indexOf("", "", 0))).intern())) {
                                b10 = -1;
                            } else {
                                f1460 = (f1459 + 7) % 128;
                                b10 = 12;
                            }
                            break;
                        case -213689933:
                            if (!str.equals(m1703("\ude96\u2073⍷≺╆\u2436✻☯⤊⠹⯾⫵ⷪⳠ⿊⺾ㆰゴ㎖㊂㑺㝯㙴", TextUtils.indexOf("", "", 0, 0) + 65267).intern())) {
                                b10 = -1;
                            } else {
                                f1459 = (f1460 + InterfaceC0435l1.d.b.f29112i) % 128;
                                b10 = 5;
                            }
                            break;
                        case 46561673:
                            if (!str.equals(m1703("\ude96\uf7a1賓ꗕ稄ጡ⡑셡鞅겅䗁\u1acf㌛젺\ue14a뙳䲆", Color.argb(0, 0, 0, 0) + 10529).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 11;
                            }
                            break;
                        case 94094958:
                            if (!str.equals(m1705(5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0014\t\u0011\u0007\u0087", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 36)).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 17;
                            }
                            break;
                        case 841006591:
                            if (!str.equals(m1705(25 - View.combineMeasuredStates(0, 0), "\u0001\u0002\u0000\u000e\u000e\u000f\r\u0003\b\u0003\n\r\u0017\u000b\u000b\u0010àà\u0000\u0007\u0001\u000e\f\u000fç", (byte) (Drawable.resolveOpacity(0, 0) + 116)).intern())) {
                                b10 = -1;
                            } else {
                                f1460 = (f1459 + 119) % 128;
                                b10 = 8;
                            }
                            break;
                        case 902024524:
                            if (!str.equals(m1703("\ude8cᄾ䇼놎\ue050퀂¸獳ꌂ鏞", View.MeasureSpec.getSize(0) + 53173).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 15;
                            }
                            break;
                        case 923334616:
                            if (!str.equals(m1703("\ude86\ue179ꅄ愪℮\ue105ꇐ懒⇈\ue1b7ꆔ憫\u206c\ue044ꀳ怭‑", 16360 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 16;
                            }
                            break;
                        case 1080975014:
                            if (!str.equals(m1705(22 - ExpandableListView.getPackedPositionGroup(0L), "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\u0006\u0013\u0010\b\u0017\u0011\u0007\u0005\b\u0000\u000e\f\f\u0002", (byte) (12 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern())) {
                                b10 = -1;
                            } else {
                                int i13 = f1459 + 89;
                                f1460 = i13 % 128;
                                b10 = i13 % 2 == 0 ? (byte) 9 : (byte) 39;
                            }
                            break;
                        case 1083215325:
                            if (!str.equals(m1705((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, "\f\u0001\u0012\u0001\u0001\f\u0014\u0011\u0003\u0016\u0007\u0005\u0011\u0004\f\u001d", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10)).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 13;
                            }
                            break;
                        case 1202614773:
                            if (!str.equals(m1705(TextUtils.lastIndexOf("", '0', 0) + 22, "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\t\u0001\t\n\u0002\u0000\u000b\u0006\u0005\u0001\u0001\u0002É", (byte) (134 - AndroidCharacter.getMirror('0'))).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1689765750:
                            if (!str.equals(m1703("\ude96삥\ue2db蓇ꘘ䠲橿ඃ⾽퇜\uf3ff锴뜶奶碴᪫㳔\udefb쀭\ue23f葧꞉䦹毓ෳ⼛텂\uf371", 7717 - Color.alpha(0)).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1766229249:
                            if (!str.equals(m1703("\ude96㩵\u177b灷䵘Ꙃ茟鰳綠툌⼟ࠤ时绦寐듋釅\ueac5잭₉㶭\u169d玘䲕\ua878蕻", 58613 - TextUtils.getOffsetBefore("", 0)).intern())) {
                                b10 = -1;
                            } else {
                                int i14 = f1459 + 25;
                                f1460 = i14 % 128;
                                b10 = i14 % 2 == 0 ? (byte) 1 : (byte) 0;
                            }
                            break;
                        case 1833576080:
                            if (!str.equals(m1703("\ude96偧썟爝\ue510ᐈ蟋㛑ꦭ\ud88e䮋﵎汞鼬ฆ脞ョꏓ튢䖳", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36582).intern())) {
                                b10 = -1;
                            } else {
                                b10 = 10;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            this.f1465.f1455.m2435(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                            return this;
                        case 1:
                            this.f1465.f1455.m2431(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                            return this;
                        case 2:
                            this.f1465.f1455.m2432(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                            return this;
                        case 3:
                            this.f1465.f1455.m2439(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                            return this;
                        case 4:
                            this.f1465.f1455.m2437(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                            return this;
                        case 5:
                            this.f1465.f1455.m2434(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                            return this;
                        case 6:
                            this.f1465.f1455.m2433(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                            return this;
                        case 7:
                            this.f1465.f1455.m2441(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                            int i15 = f1460 + 61;
                            f1459 = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i16 = 87 / 0;
                            }
                            return this;
                        case 8:
                            this.f1465.f1455.m2430(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                            return this;
                        case 9:
                            this.f1465.f1455.m2438(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                            return this;
                        case 10:
                            this.f1465.f1455.m2428(((Integer) cw.m1805(list, 0, Integer.class)).intValue());
                            return this;
                        case 11:
                            this.f1465.f1455.m2436(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                            return this;
                        case 12:
                            this.f1465.f1455.m2429(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                            return this;
                        case 13:
                            this.f1464.m1750((Class) cw.m1805(list, 0, Class.class));
                            return this;
                        case 14:
                            this.f1464.m1751((Class) cw.m1805(list, 0, Class.class));
                            return this;
                        case 15:
                            this.f1464.m1748((Class) cw.m1805(list, 0, Class.class));
                            return this;
                        case 16:
                            dz dzVar = (dz) cw.m1805(list, 0, dz.class);
                            this.f1464.m1747(dzVar);
                            this.f1465.f1455.m2440(dzVar);
                            return this;
                        case 17:
                            return m1704();
                        default:
                            new ds(clVar, eeVar, m1703("\udeb7퐽쯲ﺽ\uf465\ueb31默閫譬븲뗤ꢒ幽唙䣕羟畛栁Ίኋࡎ㼊", 2749 - View.MeasureSpec.getSize(0)).intern(), str).m2034(clVar.m1643());
                            return null;
                    }
                } catch (Exception e10) {
                    e = e10;
                    String strM1643 = clVar.m1643();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1703("\udea0榢냽ﬕɃ䫌閬\udcfe朤깔\uf692Ƃ䣼錬\uda66抝귀\uf414㼶䙤躦\ud99c怹ꭃ\uf270㪧䗳谗흺ᾁꚲ\uf1fc㠦䍘讫튿᷷ꐥ\uef55㞟给觱퀸᭬ꏙ\ueada㔂簪蝼쾶ᛚꅊ\ue84c㍹箿苮촒ᑌ峇\ue7f5", 46900 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                    sb2.append(str);
                    sb2.append(m1705(1 - View.resolveSize(0, 0), "\u009e", (byte) (119 - Gravity.getAbsoluteGravity(0, 0))).intern());
                    cn.m1708(strM1643, sb2.toString(), e);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m1705(int i10, String str, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (j.f2647) {
                try {
                    char[] cArr2 = f1462;
                    char c4 = f1463;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        j.f2654 = 0;
                        while (true) {
                            int i11 = j.f2654;
                            if (i11 >= i10) {
                                break;
                            }
                            j.f2653 = cArr[i11];
                            j.f2650 = cArr[j.f2654 + 1];
                            if (j.f2653 == j.f2650) {
                                cArr3[j.f2654] = (char) (j.f2653 - b10);
                                cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                            } else {
                                j.f2652 = j.f2653 / c4;
                                j.f2649 = j.f2653 % c4;
                                j.f2651 = j.f2650 / c4;
                                j.f2648 = j.f2650 % c4;
                                if (j.f2649 == j.f2648) {
                                    j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                    j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                    int i12 = (j.f2652 * c4) + j.f2649;
                                    int i13 = (j.f2651 * c4) + j.f2648;
                                    int i14 = j.f2654;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (j.f2652 == j.f2651) {
                                    j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                    j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                    int i15 = (j.f2652 * c4) + j.f2649;
                                    int i16 = (j.f2651 * c4) + j.f2648;
                                    int i17 = j.f2654;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (j.f2652 * c4) + j.f2648;
                                    int i19 = (j.f2651 * c4) + j.f2649;
                                    int i20 = j.f2654;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            j.f2654 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }
}
