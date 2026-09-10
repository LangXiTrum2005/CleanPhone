package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ca extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1168 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1169 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1170 = {'T', 172, 171, 167, 172, 149, 145, 144, 143, 172, 144, 141, 's', 223, 218, 216, 219, 219, 203, 212, 224, 218, 224, 221, 206, 218, 215, '2', AbstractJsonLexerKt.END_LIST, 'e', 'l', 'f', 'l', 'i', 'Z', 'f', 'c', AbstractJsonLexerKt.END_LIST, 'n', 'l', 'n', 'r', '?', 130, 132, 129, 131, 'r', 'x', 143, 135, 136, 136, 135, 132, 'k', 'Q', 172, 172, 148, 155, 172, 166, 168, 161, 'R', 147, 151, 167, 166, 175, 175, 175, 180, 179, 172, 173, 178, 156, 152, 173, 171, 146, 152, 283, 279, 283, 288, 310, 305, 304, 311, 312, 307, 307, 307, 298, 'v', 229, 227, 227, 230, 237, 232, 212, 210, 204, 208, 224, 223, 232, 232, 232, 237, 236, 229, 230, 235, 213, AbstractJsonLexerKt.UNICODE_ESC, 217, 217, 226, 226, 245, 243, 240, 242, 235, 'J', 160, 162, 143, 150, 159, 157, 157, 160, 167, 162, 142, 140, 134, 134, 152, 152, 159, 134, 261, 259, 259, 262, 269, 264, 244, 251, 264, 257, 249, 255, 262, 256, 262, 259, 244, 256, 253, 135, 263, 273, 287, 277, 273, 273, 279, 270, 262, 281, 279, 276};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1171 = -9112507224635534966L;

    public ca(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1387(Reward reward) {
        f1168 = (f1169 + 87) % 128;
        String str = reward.type;
        f1169 = (f1168 + 123) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1389(Reward reward) {
        f1169 = (f1168 + 95) % 128;
        String strM1387 = m1387(reward);
        f1168 = (f1169 + 125) % 128;
        return strM1387;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1390(false, new int[]{167, 13, 171, 5}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ca.m1389((Reward) list.get(0));
            }
        });
        f1168 = (f1169 + 125) % 128;
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0286  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        f1169 = (f1168 + 63) % 128;
        byte b2 = 9;
        switch (str.hashCode()) {
            case -2103294848:
                if (!str.equals(m1388("\ue44d\ue40c튅썺炌\uea1d叼\udeeaꈊ蕳᧑邯桼", TextUtils.lastIndexOf("", '0', 0) + 1).intern())) {
                    b2 = -1;
                } else {
                    f1169 = (f1168 + 109) % 128;
                }
                break;
            case -1850459313:
                if (!str.equals(m1388("菕莇\ue56f\uf480趎棫껭尔얏늹", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    f1169 = (f1168 + 75) % 128;
                    b2 = 13;
                }
                break;
            case -1766129765:
                if (!str.equals(m1390(true, new int[]{27, 15, 0, 10}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -1282477456:
                if (!str.equals(m1390(true, new int[]{12, 15, 116, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -958537051:
                if (!str.equals(m1390(true, new int[]{56, 9, 66, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -609786639:
                if (!str.equals(m1390(false, new int[]{119, 10, 135, 3}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case -498709917:
                if (!str.equals(m1390(true, new int[]{97, 22, 122, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case -393802555:
                if (!str.equals(m1390(true, new int[]{129, 18, 52, 4}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    f1168 = (f1169 + 79) % 128;
                    b2 = 15;
                }
                break;
            case 65555862:
                if (!str.equals(m1390(true, new int[]{147, 20, 154, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    f1169 = (f1168 + 65) % 128;
                    b2 = 19;
                }
                break;
            case 320151695:
                if (!str.equals(m1390(false, new int[]{83, 14, 197, 3}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 421929408:
                if (!str.equals(m1390(true, new int[]{65, 18, 65, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    f1169 = (f1168 + 95) % 128;
                    b2 = 10;
                }
                break;
            case 448638071:
                if (!str.equals(m1388("؞ٝ淮簑∆疭š䅇䁙㨱䭪༊証\uf055贏따", KeyEvent.getMaxKeyCode() >> 16).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1169 + 103;
                    f1168 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 16 : (byte) 21;
                }
                break;
            case 487251537:
                if (!str.equals(m1390(true, new int[]{42, 14, 25, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 544598087:
                if (!str.equals(m1388("ቕሶ\uec29\ufdcc봶棠鹏屐吐믢퐤ቒ鹤熁ስꡫ쁙ࠅ䣙澙ઘ왮蛭▰䲳鰶㲓\ufbd2뛄娡畕넋魯\u10ca덹眢⍼꺕\ue90bൊ敄", Process.myPid() >> 22).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1125320581:
                if (!str.equals(m1388("ᰥᱬꪞ뭹孡斬研兕婨ﵨ㈼\u1f1e途", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 1146816194:
                if (!str.equals(m1388("ӏ҂콵\ude86齈負밈롟䊕颠\uf611\uf612裉勆ぉ䰹", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1169 + 89;
                    f1168 = i3 % 128;
                    if (i3 % 2 == 0) {
                        b2 = 17;
                    } else {
                        b2 = 12;
                    }
                }
                break;
            case 1413638316:
                if (!str.equals(m1388("\u1cbbᳶؤៗ\udb71ㆾ\uf831Ձ嫡凱눨䬌邪鮝瑡\uf139캵\ue24f⺉㛑", TextUtils.getCapsMode("", 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1955824356:
                if (!str.equals(m1388("ἆ\u1f47뾄깪홓혯\uf514\ue2d8奔\ue853", ViewConfiguration.getTapTimeout() >> 16).intern())) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case 1982630644:
                if (!str.equals(m1388("㗌㖎㑕▾\udae4㞒旅ͩ玥掃", Color.green(0)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1169 + 85;
                    f1168 = i4 % 128;
                    b2 = i4 % 2 == 0 ? (byte) 6 : (byte) 102;
                }
                break;
            case 2040577055:
                if (!str.equals(m1388("奀复椳磀㗴勌ᚴ昳Ἒ㻦岭⡾핓\uf486髾鉄譑赖", ViewConfiguration.getKeyRepeatTimeout() >> 16).intern())) {
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
                return MyTargetConfig.class;
            case 1:
                return MyTargetManager.class;
            case 2:
                return MyTargetVersion.class;
            case 3:
            case 4:
                return MyTargetActivity.class;
            case 5:
                return MyTargetActivity.ActivityEngine.class;
            case 6:
                return BaseAd.class;
            case 7:
                return VideoData.class;
            case 8:
                return ImageData.class;
            case 9:
                return AudioData.class;
            case 10:
                return BaseInterstitialAd.class;
            case 11:
                return InterstitialAd.class;
            case 12:
                return InterstitialAd.InterstitialAdListener.class;
            case 13:
                return Reward.class;
            case 14:
                return RewardedAd.class;
            case 15:
                return RewardedAd.RewardedAdListener.class;
            case 16:
                return CustomParams.class;
            case 17:
                return MyTargetView.class;
            case 18:
                f1168 = (f1169 + 117) % 128;
                return MyTargetView.AdSize.class;
            case 19:
                return MyTargetView.MyTargetViewListener.class;
            default:
                return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1169 = (f1168 + 87) % 128;
        try {
            try {
                String str = (String) MyTargetVersion.class.getDeclaredField(m1388("눾뉨愆烉ࢱ嶛⯷楖\uf45f㛻懃", View.MeasureSpec.makeMeasureSpec(0, 0)).intern()).get(null);
                int i2 = f1168 + 19;
                f1169 = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            } catch (Exception unused) {
                return hr.m2242().m2245().m2314(MyTargetVersion.class, m1390(false, new int[]{0, 12, 76, 11}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000").intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1390(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f1170, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1388(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1171, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1171));
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
}
