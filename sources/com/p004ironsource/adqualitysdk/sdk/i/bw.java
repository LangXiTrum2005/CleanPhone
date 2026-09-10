package com.p004ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bw extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1063 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1064;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1065 = {'H', 154, 168, 175, 155, 149, 174, ' ', 'R', 'U', AbstractJsonLexerKt.END_LIST, 'p', 'l', 'o', 'k', 'j', 'k', 'e', 'i', 'W', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '1', 'R', 'W', 'i', 'e', 'k', 'j', 'k', 'o', 'l', 'p', AbstractJsonLexerKt.END_LIST, 'U', 'R', '7', 'I', 'f', 'l', 'p', 'k', 'i', 'g', 'G', 'L', 'g', 'k', 'P', 'N', 'l', 'e', 'g', 'M', 'O', 'm', 'q', 'v', 'n', 'o', 'o', 'n', 157, 311, 303, 304, 304, 303, 300, 275, 275, 275, 275, 293, 301, 299, 274, 280, 301, 305, 287, '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'R', 'R', 'R', 'd', 'l', 'j', 'Q', 'W', 'l', 'p', '^', ';', 'I', 'f', 'l', 'p', 'k', 'i', 'g', 'G', 'L', 'g', 'k', 'P', 'N', 'l', 'e', 'g', 'M', 'O', 'm', '2', 'd', 'h', 'g', 'j', 's', 'p', AbstractJsonLexerKt.BEGIN_LIST, '^', 'k', 'R', 'X', 'l', 'e', 'W', '2', 'k', '_', 'W', 'e', 'l', 'X', 'R', 'k', '_', 'Z', 'n', 's', 'l', 'i', '4', 'n', 's', 'l', 'i', 'i', 'k', AbstractJsonLexerKt.END_LIST, AbstractJsonLexerKt.BEGIN_LIST, 'q', 'l', 'k', 'l', 'c', 'b', 'd', 'Y', 'W', 'e', 'l', 'X', 'R', 'k', '_', '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', '_', 'k', 'R', 'X', 'l', 'e', 'W', '`', 'l', 'l'};

    public bw(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1221(MaioAdsListenerInterface maioAdsListenerInterface) {
        f1064 = (f1063 + 81) % 128;
        m1222(maioAdsListenerInterface);
        int i2 = f1064 + 97;
        f1063 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 7;
        switch (str.hashCode()) {
            case -1799290762:
                if (!str.equals(m1220(false, new int[]{0, 7, 67, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1455130644:
                if (str.equals(m1220(true, new int[]{27, 40, 0, 34}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern())) {
                    f1063 = (f1064 + 27) % 128;
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                break;
            case -1303622385:
                if (!str.equals(m1220(false, new int[]{ModuleDescriptor.MODULE_VERSION, 24, 0, 16}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1064 + 9;
                    f1063 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b2 = 72;
                    }
                }
                break;
            case -1069735125:
                if (!str.equals(m1220(true, new int[]{125, 15, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -278703286:
                if (!str.equals(m1220(false, new int[]{140, 15, 0, 2}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    f1063 = (f1064 + 7) % 128;
                    b2 = 6;
                }
                break;
            case 357386522:
                if (!str.equals(m1220(true, new int[]{67, 19, 193, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    f1063 = (f1064 + 61) % 128;
                    b2 = 3;
                }
                break;
            case 1819361677:
                if (!str.equals(m1220(false, new int[]{7, 20, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1914325723:
                if (!str.equals(m1220(true, new int[]{86, 39, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000").intern())) {
                    b2 = -1;
                } else {
                    f1063 = (f1064 + 121) % 128;
                    b2 = 4;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return MaioAds.class;
            case 1:
            case 2:
                return AdFullscreenActivity.class;
            case 3:
            case 4:
                return HtmlBasedAdActivity.class;
            case 5:
                return MaioAdsInstance.class;
            case 6:
                return MaioAdsListener.class;
            case 7:
                return MaioAdsListenerInterface.class;
            default:
                return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1064 = (f1063 + 5) % 128;
        String sdkVersion = MaioAds.getSdkVersion();
        int i2 = f1064 + 35;
        f1063 = i2 % 128;
        if (i2 % 2 != 0) {
            return sdkVersion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1222(MaioAdsListenerInterface maioAdsListenerInterface) {
        f1064 = (f1063 + 15) % 128;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        int i2 = f1063 + 21;
        f1064 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1220(true, new int[]{179, 18, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bw.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bw.m1221((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        f1064 = (f1063 + 59) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1220(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1065, i2, cArr, 0, i3);
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
}
