package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cm {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private co f1295;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1296;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f1297;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hz.d f1298;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final co m1530() {
        return this.f1295;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hz m1531(hy hyVar) {
        return this.f1298.m2379(hyVar, this.f1297, this.f1296);
    }

    public static class a extends cz implements ck {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f1299 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f1300;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f1301 = {'s', 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42777, 8557, 39637, 5176, 36461, 's', 31182, 62242, 27986, 59081, 24630, 55920, 21454, 52528, 18256, 49371, 14889, 46177, 11741, 42777, 8553, 39633, 5160, 36469, 2004, 33071, 's', 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42775, 8548, 39616, 5160, 17430, 15787, 46919, 10551, 41644, 9299, 40469, 6059, 35157, 815, 33957, 32369, 61440, 27066, 58188, 's', 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42777, 8554, 39644, 5175, 36451, 2002, 33064, 64366, 29917, 60979, 26747, 59298, 40479, 5363, 35459, 280, 34791, 15777, 46111, 10977, 41115, 10001, 56779, 21434, 51730, 16615, 50865, 32002, 62462, 27070, 57359, 26339, 7333, 'c', 31198, 62245, 28021, 59075, 24634, 55873, 21445, 52541, 18272, 49349, 14868, 46177, 11739, 42802, 8554, 39636};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f1302 = 3178654271887669675L;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f1303 = 9036385983134046093L;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private co.b f1304;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cm f1305;

        public a(List<String> list, int i2) {
            cm cmVar = new cm();
            this.f1305 = cmVar;
            cmVar.f1298 = new hz.d();
            this.f1305.f1297 = list;
            this.f1305.f1296 = i2;
            this.f1304 = new co.b();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1532(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f1955) {
                try {
                    char[] cArrM2116 = f.m2116(f1303, cArr, i2);
                    f.f1954 = 4;
                    while (true) {
                        int i3 = f.f1954;
                        if (i3 < cArrM2116.length) {
                            int i4 = i3 - 4;
                            f.f1953 = i4;
                            cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1303));
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private cm m1534() {
            f1299 = (f1300 + 5) % 128;
            this.f1305.f1295 = this.f1304.m1563();
            cm cmVar = this.f1305;
            f1299 = (f1300 + 77) % 128;
            return cmVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
        /* JADX INFO: renamed from: ﾇ */
        public final Object mo792(String str, List<Object> list, ch chVar) {
            byte b2 = 15;
            switch (str.hashCode()) {
                case -1930334554:
                    b2 = !str.equals(m1533((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, 59 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((Process.myTid() >> 22) + 17509)).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case -1826216039:
                    b2 = !str.equals(m1532("閫闟熪賩晞ꎃ룯︭쯚Кǒ媗⦯ꈬ", 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 12;
                    break;
                case -994397843:
                    b2 = !str.equals(m1533(18 - TextUtils.indexOf("", "", 0, 0), 40 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 6;
                    break;
                case -941967812:
                    b2 = !str.equals(m1532("⦵⧆ᙱいƙἪ蘹샍矴揀뵯摤閞엨\udba7쎱㍚␔禛ꇣ儌虘", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1).intern()) ? (byte) -1 : (byte) 3;
                    break;
                case -770599694:
                    b2 = !str.equals(m1533(19 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0), (char) TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 0;
                    break;
                case -235079533:
                    if (!str.equals(m1532("⑹␊髶稉贞啧\uf0b3뙗稬\uef54\uf72fዩ顐䥯釧딗㺇ꢵ㏚흷峝\u0ad8", TextUtils.getTrimmedLength("") + 1).intern())) {
                        b2 = -1;
                    } else {
                        int i2 = f1299 + 35;
                        f1300 = i2 % 128;
                        b2 = i2 % 2 == 0 ? (byte) 10 : (byte) 49;
                    }
                    break;
                case -213689933:
                    b2 = !str.equals(m1532("⓰⒃⚮ﶴㅆ틚緽㬜窫匃炖龨飯\uf50cᙓ㡲㸇ᓕ둧娹居뚁娻萅\uf397졚ﯙ", -ExpandableListView.getPackedPositionChild(0L)).intern()) ? (byte) -1 : (byte) 5;
                    break;
                case 94094958:
                    if (!str.equals(m1532("跩趋♫\u0b3a㆓⑉ᢛ幐펹", TextUtils.indexOf("", "") + 1).intern())) {
                        b2 = -1;
                    } else {
                        f1299 = (f1300 + 109) % 128;
                    }
                    break;
                case 841006591:
                    b2 = !str.equals(m1533((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24, MotionEvent.axisFromString("") + 74, (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 8;
                    break;
                case 902024524:
                    if (!str.equals(m1532("⫭⪄쩜櫄\uddbf䖭\uf6f0뀣璸뿳\ue7e9ᒝ雊\u19cf", View.MeasureSpec.makeMeasureSpec(0, 0) + 1).intern())) {
                        b2 = -1;
                    } else {
                        f1300 = (f1299 + 29) % 128;
                        b2 = 13;
                    }
                    break;
                case 923334616:
                    b2 = !str.equals(m1533(17 - View.resolveSize(0, 0), 120 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern()) ? (byte) -1 : (byte) 14;
                    break;
                case 1080975014:
                    b2 = !str.equals(m1533((ViewConfiguration.getTouchSlop() >> 8) + 22, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 97, (char) (59345 - KeyEvent.getDeadChar(0, 0))).intern()) ? (byte) -1 : (byte) 9;
                    break;
                case 1083215325:
                    b2 = !str.equals(m1532("젗졾ኧ\uf8cdՙ힖ꀙ\ue6cd限朏痤䉸琞섰ጣ\ue5a7틍\u20fc넔蟣", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()) ? (byte) -1 : (byte) 11;
                    break;
                case 1202614773:
                    if (!str.equals(m1533(21 - TextUtils.indexOf("", ""), 19 - Drawable.resolveOpacity(0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern())) {
                        b2 = -1;
                    } else {
                        f1300 = (f1299 + 75) % 128;
                        b2 = 2;
                    }
                    break;
                case 1689765750:
                    if (!str.equals(m1532("돒뎡灖\uf20a枾\udd64옂胨\ued8f\u05f9缀\u2456࿊ꏗ᧠莡ꤡ䈍믫\ue1ce쭣\ue060喲㿺撰麢\uf466鴦蚄㳰阽פּ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern())) {
                        b2 = -1;
                    } else {
                        f1299 = (f1300 + 37) % 128;
                        b2 = 4;
                    }
                    break;
                case 1766229249:
                    if (!str.equals(m1532("쒼쓏縮㩺槆ᔔ坴ᆞ髡\u0b81띰딠碤궯톐\u12d7\ude4f䱵玟炨발\uee16鷢꺪Ꮤ郞㰗ె\uf1e1㊘", 1 - View.resolveSize(0, 0)).intern())) {
                        b2 = -1;
                    } else {
                        f1300 = (f1299 + 33) % 128;
                        b2 = 1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    this.f1305.f1298.m2369(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    return this;
                case 1:
                    this.f1305.f1298.m2375(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    return this;
                case 2:
                    this.f1305.f1298.m2376(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 3:
                    this.f1305.f1298.m2367(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    return this;
                case 4:
                    this.f1305.f1298.m2372(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    return this;
                case 5:
                    this.f1305.f1298.m2378(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 6:
                    this.f1305.f1298.m2377(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    return this;
                case 7:
                    this.f1305.f1298.m2373(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 8:
                    this.f1305.f1298.m2366(((Integer) cz.m1785(list, 0, Integer.class)).intValue());
                    return this;
                case 9:
                    this.f1305.f1298.m2371(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 10:
                    this.f1305.f1298.m2368(((Boolean) cz.m1785(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 11:
                    this.f1304.m1566((Class) cz.m1785(list, 0, Class.class));
                    return this;
                case 12:
                    this.f1304.m1565((Class) cz.m1785(list, 0, Class.class));
                    return this;
                case 13:
                    this.f1304.m1562((Class) cz.m1785(list, 0, Class.class));
                    f1299 = (f1300 + 67) % 128;
                    return this;
                case 14:
                    dt dtVar = (dt) cz.m1785(list, 0, dt.class);
                    this.f1304.m1564(dtVar);
                    this.f1305.f1298.m2370(dtVar);
                    return this;
                case 15:
                    return m1534();
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m1533(int i2, int i3, char c2) {
            String str;
            synchronized (com.p004ironsource.adqualitysdk.sdk.i.a.f68) {
                try {
                    char[] cArr = new char[i2];
                    com.p004ironsource.adqualitysdk.sdk.i.a.f69 = 0;
                    while (true) {
                        int i4 = com.p004ironsource.adqualitysdk.sdk.i.a.f69;
                        if (i4 < i2) {
                            cArr[i4] = (char) ((((long) f1301[i3 + i4]) ^ (((long) i4) * f1302)) ^ ((long) c2));
                            com.p004ironsource.adqualitysdk.sdk.i.a.f69 = i4 + 1;
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
    }
}
