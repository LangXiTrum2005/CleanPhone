package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class di extends cz implements ck {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1650 = 1;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static boolean f1651 = true;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f1652 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1655 = 129;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f1656 = true;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String f1657;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private String f1658;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1659;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1660;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1661;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1662;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1663;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1664;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1665;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1666;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1667;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1668;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1654 = {244, 230, 245, 194, 229, 202, 232, 196, 226, 238, 241, 234, 239, 213, 250, 243, 247, 200, 240, 246, 197, 195, 209, 228};

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int[] f1653 = {397840558, -848912179, -1161627843, -1440092716, 101894395, 1037589517, 946665512, -1717674113, -1294099560, 1802945914, 1337466841, 1785425051, -235973602, -422241588, 512745907, 959406423, -651906807, -29446400};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m1886() {
        String str;
        int i2 = f1650;
        int i3 = i2 + 73;
        f1652 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.f1657;
            int i4 = 56 / 0;
        } else {
            str = this.f1657;
        }
        f1652 = (i2 + 63) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1888(String str) {
        int i2 = f1650 + 31;
        f1652 = i2 % 128;
        int i3 = i2 % 2;
        this.f1658 = str;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m1890(String str) {
        int i2 = (f1652 + 21) % 128;
        f1650 = i2;
        this.f1657 = str;
        f1652 = (i2 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1892(String str) {
        int i2 = f1650 + 61;
        f1652 = i2 % 128;
        int i3 = i2 % 2;
        this.f1663 = str;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1893() {
        int i2 = f1652;
        String str = this.f1663;
        f1650 = (i2 + 89) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1896(String str) {
        int i2 = (f1650 + 109) % 128;
        f1652 = i2;
        this.f1661 = str;
        int i3 = i2 + 101;
        f1650 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1898(String str) {
        int i2 = (f1652 + 71) % 128;
        f1650 = i2;
        this.f1659 = str;
        f1652 = (i2 + 57) % 128;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1899() {
        int i2 = (f1652 + 85) % 128;
        f1650 = i2;
        String str = this.f1659;
        int i3 = i2 + 75;
        f1652 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1903(String str) {
        int i2 = f1650;
        this.f1664 = str;
        int i3 = i2 + 61;
        f1652 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1905(String str) {
        int i2 = f1650 + 9;
        int i3 = i2 % 128;
        f1652 = i3;
        int i4 = i2 % 2;
        this.f1666 = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 21;
        f1650 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1907(String str) {
        int i2 = f1650;
        this.f1667 = str;
        int i3 = i2 + 85;
        f1652 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1910(String str) {
        int i2 = (f1650 + 41) % 128;
        f1652 = i2;
        this.f1665 = str;
        int i3 = i2 + 1;
        f1650 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m1911() {
        int i2 = (f1650 + 67) % 128;
        f1652 = i2;
        String str = this.f1667;
        f1650 = (i2 + 55) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private Object m1887() {
        int i2 = (f1652 + 49) % 128;
        f1650 = i2;
        String str = this.f1658;
        int i3 = i2 + 37;
        f1652 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private JSONObject m1889() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ik.f2441, this.f1665);
            jSONObject.putOpt(ik.f2443, this.f1667);
            jSONObject.putOpt(ik.f2448, this.f1668);
            jSONObject.putOpt(ik.f2446, this.f1666);
            jSONObject.putOpt(ik.f2444, this.f1659);
            jSONObject.putOpt(ik.f2440, this.f1663);
            jSONObject.putOpt(ik.f2442, this.f1660);
            jSONObject.putOpt(ik.f2439, this.f1661);
            jSONObject.putOpt(ik.f2437, this.f1662);
            f1652 = (f1650 + 37) % 128;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1891() {
        int i2 = (f1652 + 99) % 128;
        f1650 = i2;
        String str = this.f1660;
        f1652 = (i2 + 73) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1894(String str) {
        int i2 = f1652 + 45;
        f1650 = i2 % 128;
        int i3 = i2 % 2;
        this.f1660 = str;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1895() {
        int i2 = f1652 + 15;
        f1650 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1662;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1897() {
        int i2 = f1652;
        int i3 = i2 + 3;
        f1650 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f1661;
        f1650 = (i2 + 85) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1900(String str) {
        int i2 = (f1650 + 11) % 128;
        f1652 = i2;
        this.f1662 = str;
        int i3 = i2 + 115;
        f1650 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Object m1901() {
        int i2 = f1650;
        String str = this.f1664;
        f1652 = (i2 + 115) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1904() {
        int i2 = f1652;
        String str = this.f1666;
        int i3 = i2 + 11;
        f1650 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1906() {
        int i2 = f1652;
        String str = this.f1668;
        f1650 = (i2 + 21) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1908() {
        int i2 = f1650 + 11;
        f1652 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1665;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1912(String str) {
        int i2 = f1650 + 93;
        f1652 = i2 % 128;
        int i3 = i2 % 2;
        this.f1668 = str;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1902(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1654;
                int i3 = f1655;
                if (f1651) {
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
                if (f1656) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:94:0x0385  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        byte b2;
        switch (str.hashCode()) {
            case -2118395364:
                if (!str.equals(m1909(new int[]{-873420173, 400624176, -947134727, -226909319, -1959547893, 373659894, 1180682315, 1222322753}, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -2061646392:
                if (!str.equals(m1909(new int[]{461325782, 506929187, 1805599014, -262086264, -1166170850, 1809721263}, 12 - Color.argb(0, 0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case -1670022962:
                if (!str.equals(m1902(null, null, 127 - KeyEvent.keyCodeFromString(""), "\u0082\u0098\u008c\u0090\u0097\u0085\u008c\u0096\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1650 + 35;
                    f1652 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b2 = 20;
                    } else {
                        b2 = 19;
                    }
                }
                break;
            case -1616003519:
                if (str.equals(m1902(null, null, View.combineMeasuredStates(0, 0) + 127, "\u0085\u0086\u008d\u0087\u008c\u0089\u008b\u008a\u0089\u0088\u0083\u0082\u0087").intern())) {
                    int i3 = f1650 + 23;
                    f1652 = i3 % 128;
                    int i4 = i3 % 2;
                    b2 = 3;
                } else {
                    b2 = -1;
                }
                break;
            case -1585083924:
                if (!str.equals(m1909(new int[]{-1050643501, -385484475, -2136998993, 361159327, -1591683144, -81113869, 395546882, 1097352602}, (ViewConfiguration.getLongPressTimeout() >> 16) + 15).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -1581443134:
                if (!str.equals(m1909(new int[]{1274375636, 1190635014, 394805557, -16095904, 1425663865, 946071185}, 11 - Drawable.resolveOpacity(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    f1650 = (f1652 + 33) % 128;
                    b2 = 21;
                }
                break;
            case -1448564938:
                if (str.equals(m1909(new int[]{1872960804, -759305950, 878784034, -691517192, 1698479678, -1133337273, 1289711346, 1552930602}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16).intern())) {
                    b2 = 19;
                } else {
                    b2 = -1;
                }
                break;
            case -1295434132:
                if (!str.equals(m1909(new int[]{2102241913, -2098393844, -18700257, -464139778, 765647368, 601575536, -2080983503, 1362187061}, (ViewConfiguration.getEdgeSlop() >> 16) + 14).intern())) {
                    b2 = -1;
                } else {
                    b2 = 22;
                }
                break;
            case -1207642840:
                if (!str.equals(m1909(new int[]{-74643124, 1730628631, -947134727, -226909319, -1959547893, 373659894, 1180682315, 1222322753}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15).intern())) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -1027873480:
                if (!str.equals(m1909(new int[]{438085180, -545761096, -955011074, 1460087801, -150504466, 1948066976}, Gravity.getAbsoluteGravity(0, 0) + 10).intern())) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -869156349:
                if (!str.equals(m1909(new int[]{390379083, 1592261478, -609342129, 1853932341}, 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 24;
                }
                break;
            case -841872307:
                if (!str.equals(m1909(new int[]{-1050643501, -385484475, -2136998993, 361159327, 1504505939, -174965713, 1947922323, -2107505497}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -587837303:
                if (!str.equals(m1909(new int[]{-1149480501, 300852659, 1991009349, -1309995733, -101391890, 888095249, 1963238311, 1350342555}, 16 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case -75693804:
                if (!str.equals(m1902(null, null, 127 - View.combineMeasuredStates(0, 0), "\u0085\u0086\u0085\u0084\u0083\u0082\u0087").intern())) {
                    b2 = -1;
                } else {
                    f1650 = (f1652 + 93) % 128;
                    b2 = 1;
                }
                break;
            case 476302072:
                if (!str.equals(m1902(null, null, 127 - Drawable.resolveOpacity(0, 0), "\u008f\u0098\u008d\u0082\u0090\u0090\u0094\u0088\u0085\u008c\u0096\u0083\u0082\u0087").intern())) {
                    b2 = -1;
                } else {
                    b2 = 23;
                }
                break;
            case 684328276:
                if (str.equals(m1909(new int[]{-193855116, 1326022977, 1805599014, -262086264, -1166170850, 1809721263}, 12 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    b2 = 13;
                } else {
                    b2 = -1;
                }
                break;
            case 1014959530:
                if (!str.equals(m1902(null, null, 127 - (KeyEvent.getMaxKeyCode() >> 16), "\u0085\u0086\u008d\u0087\u008c\u0089\u008b\u008a\u0089\u0088\u008b\u0081\u0095\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1652 + 61;
                    f1650 = i5 % 128;
                    if (i5 % 2 != 0) {
                        b2 = 18;
                    } else {
                        b2 = 10;
                    }
                }
                break;
            case 1076166944:
                if (!str.equals(m1902(null, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0085\u0086\u0082\u0091\u008c\u0083\u0089\u0082\u0090\u0088\u0083\u0082\u0087").intern())) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 1243605525:
                if (!str.equals(m1902(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, "\u0085\u0086\u0082\u0091\u008c\u0083\u0089\u0082\u0090\u0088\u008b\u0081\u0095\u0083\u0082\u0087").intern())) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case 1330288580:
                if (!str.equals(m1902(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, "\u0085\u0086\u008b\u0094\u0093\u0090\u0092\u0083\u0082\u0087").intern())) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 1390601082:
                if (!str.equals(m1909(new int[]{-1149480501, 300852659, -1039335724, -1486571671}, 7 - Process.getGidForName("")).intern())) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case 1799130848:
                if (!str.equals(m1902(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, "\u0082\u008b\u008f\u008e\u008d\u0087\u008c\u0089\u008b\u008a\u0089\u0088\u0083\u0082\u0087").intern())) {
                    b2 = -1;
                } else {
                    f1652 = (f1650 + 9) % 128;
                    b2 = 5;
                }
                break;
            case 1850298156:
                if (!str.equals(m1902(null, null, 126 - TextUtils.lastIndexOf("", '0'), "\u0085\u0086\u0082\u0091\u008c\u0083\u0089\u0082\u0090\u0088\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    int i6 = f1652 + 5;
                    f1650 = i6 % 128;
                    b2 = i6 % 2 != 0 ? (byte) 8 : (byte) 43;
                }
                break;
            case 1951713542:
                if (!str.equals(m1909(new int[]{1872960804, -759305950, -1039335724, -1486571671}, 8 - View.getDefaultSize(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 1984415776:
                if (!str.equals(m1902(null, null, 126 - ExpandableListView.getPackedPositionChild(0L), "\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                m1910((String) cz.m1785(list, 0, String.class));
                return null;
            case 1:
                return m1908();
            case 2:
                m1912((String) cz.m1785(list, 0, String.class));
                return null;
            case 3:
                return m1906();
            case 4:
                m1903((String) cz.m1785(list, 0, String.class));
                return null;
            case 5:
                return m1901();
            case 6:
                m1907((String) cz.m1785(list, 0, String.class));
                return null;
            case 7:
                return m1911();
            case 8:
                m1905((String) cz.m1785(list, 0, String.class));
                return null;
            case 9:
                return m1904();
            case 10:
                m1898((String) cz.m1785(list, 0, String.class));
                return null;
            case 11:
                return m1899();
            case 12:
                m1892((String) cz.m1785(list, 0, String.class));
                return null;
            case 13:
                return m1893();
            case 14:
                m1894((String) cz.m1785(list, 0, String.class));
                return null;
            case 15:
                return m1891();
            case 16:
                m1896((String) cz.m1785(list, 0, String.class));
                return null;
            case 17:
                return m1897();
            case 18:
                m1900((String) cz.m1785(list, 0, String.class));
                f1652 = (f1650 + 65) % 128;
                return null;
            case 19:
                return m1895();
            case 20:
                m1888((String) cz.m1785(list, 0, String.class));
                return null;
            case 21:
                return m1887();
            case 22:
                m1890((String) cz.m1785(list, 0, String.class));
                return null;
            case 23:
                return m1886();
            case 24:
                return m1889();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1909(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1653.clone();
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
}
