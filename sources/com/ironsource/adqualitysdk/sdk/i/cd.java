package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cd extends be {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1219 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1220 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1221 = {'2', 'j', '_', '^', 'f', 'm', 'o', 'k', '_', 'Z', 'n', 's', 'l', 'i', 'i', 'k', ']', 'O', '_', 'f', '+', '_', 'f', 'd', 'j', 'X', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'f', 'J', 'N', 154, 146, 147, 147, 146, 143, 'v', '|', 142, 136, 138, 131, 'o', 'n', 'd', 'm', 138, 145, 146, 142, 139, 143, 150, 's', 'p', 139, 143, 't', 'm', 141, 146, 149, 144, 146, 144, 141, 143, 142, 150, 152, 't', 'v', 153, '9', 'k', 'o', 'm', 'f', '^', '_', 'j', 'd', 'f', '_', 'O', 223, 179, 226, 213, 233, 209, 220, 192, 223, 213, 212, 217, 198, 185, 231, 213, 217, 198, 226, 213, 220, 220, 223, 226, 228, 222, '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'a', 'n', 'g', '_', 'd', 'k', 'h', 'l', 'm', 'p', 's', 'q', 'n', 'Y', 'Z', 'k', 'o', 'm', 'f', '^', '_', 'j', 'd', 'f', '_', 'O', 'V', 182, 189, 187, 193, 182, 181, 189, 196, 198, 194, 177, 176, 197, 200, 202, 199, 196, 195, 191, 194, ';', 'n', 'g', '_', ']', 'R', 'R', 'd', 'f', 'd', 'g', 'g', 'W', 'G', 'J', 202, 204, 198, 211, 198, 178, 166, 184, 222, 217, 206, 219, 206, 217, 200, 166, 201, 166, 201, '|', 249, 214, 212, 248, 246, 238, 239, 237, 240, 242, 240, 245, 242, 237, 205, 212, 239, 235, 208, 211, 246, 239, 235, 238, 242, 241, 234, 239, 212, 209, 235, 235, 235, 232, 234, 232, 205, 196, 206, 203, 219, 235, 235, 232, 234, 232, 214, 214, 214, 214, 239, 242, 243, 243, 242, 250, 139, 269, 262, 254, 251, 258, 253, 257, 269, 272, 274, 275, 251, 225, 233, ';', '`', 'U', 'k', 'k', 'Z', '[', 'j', 'm', 'l', 'r', '[', 'Z', 'm', 'f', 'e', 'f', 'S', 'R', ']', '_', 'g', ';', 'n', 'g', '_', '\\', 'c', '^', 'L', 'J', ')', 'J', 'L', '^', 'c', 'Y', '^', 'f', 'm', 'o', 'k', '+', 'K', 'J', '[', 'R', 'J', 'S', 'J', 148, 299, 298, 287, 271, 272, 272, 271, 280, 277, 286, '9', 'o', 'j', 'e', 'j', 'l', 'T', 'B', 'J', '4', 'e', 'Z', 'J', 'G', 'Y', 'd', '6', 'c', 'b', 't', 133, 138, 136, 135, 137, 133, ')', 'J', 'E', '[', 'q', 'l', 'k', 'l', 'c', 'b', 'd', '2', 'R', 'Y', 'k', 'i', 'n', 'g', 'Q', 'A', 'J', '}', 243, 250, 259, 260, 258, 242, 247, 242, 244, 263, 260, 253, ':', 'c', 'i', '{', 'u', 'w', 'p', 'v', '}', 'w', '}', '|', 'z', 'z', '}', 132, 127, 'k', '2', 'l', 'r', 'k', 'i', 'i', 'l', 's', 'n', 'Z', '_', 'k', 'i', 'n', 'g', 'Q', '['};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1222 = 45257;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1223 = 19741;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1224 = 10528;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1225 = 39575;

    public cd(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ SAInterface m1467() {
        f1220 = (f1219 + 115) % 128;
        SAInterface sAInterfaceM1468 = m1468();
        f1220 = (f1219 + 87) % 128;
        return sAInterfaceM1468;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static SAInterface m1468() {
        int i10 = f1219 + 31;
        f1220 = i10 % 128;
        if (i10 % 2 != 0) {
            return SAVideoAd.getListener();
        }
        int i11 = 76 / 0;
        return SAVideoAd.getListener();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1470(SAAd sAAd) {
        f1219 = (f1220 + 51) % 128;
        JSONObject jSONObjectM1469 = m1469(sAAd);
        f1219 = (f1220 + 69) % 128;
        return jSONObjectM1469;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1473(SABannerAd sABannerAd, SAInterface sAInterface) {
        f1220 = (f1219 + 15) % 128;
        m1471(sABannerAd, sAInterface);
        f1220 = (f1219 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1474(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1221, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        int i10 = f1220 + 37;
        f1219 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                SAVersion.getSDKVersionNumber();
                throw null;
            }
            String sDKVersionNumber = SAVersion.getSDKVersionNumber();
            int i11 = f1220 + 119;
            f1219 = i11 % 128;
            if (i11 % 2 == 0) {
                return sDKVersionNumber;
            }
            throw null;
        } catch (Throwable unused) {
            return id.m2382().m2383().m2493(SAVersion.class, m1472("鉄좷ⵔ\u0a61♾臦팃Წ保ᛲ㿸\udc14", 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:157:0x0428 A[RETURN] */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -1959951430:
                if (str.equals(m1472("葰팂Ⴌ蔛\ud8da\uecb6慘\u18f6㖓푞礑洖ꥋ芬肞쎢Ꝉ䘳š뽯\uec8a수鉀◥님줵䗭샌", 28 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    f1219 = (f1220 + 29) % 128;
                    return AdVideoPlayerControllerView.class;
                }
                return null;
            case -1855458488:
                if (str.equals(m1474("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{117, 34, 0, 0}, true).intern())) {
                    return IVideoPlayerControllerView.Listener.class;
                }
                return null;
            case -1788589794:
                if (str.equals(m1474("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{278, 22, 0, 17}, false).intern())) {
                    f1219 = (f1220 + 51) % 128;
                    return AdViewJavaScriptBridge.class;
                }
                return null;
            case -1718372116:
                if (str.equals(m1472("몙⼂樹ି턆\uf47b뮢᪃", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6).intern())) {
                    int i10 = f1219 + 89;
                    f1220 = i10 % 128;
                    if (i10 % 2 != 0) {
                        return SAEvent.class;
                    }
                }
                return null;
            case -1711491530:
                if (str.equals(m1474("\u0001\u0000\u0000\u0000\u0000\u0000\u0001", new int[]{348, 7, 0, 2}, false).intern())) {
                    return SAMedia.class;
                }
                return null;
            case -1305374924:
                if (str.equals(m1474("\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{InterfaceC0435l1.c.b.f29101g, 57, 132, 0}, false).intern())) {
                    int i11 = f1219 + 75;
                    f1220 = i11 % 128;
                    if (i11 % 2 != 0) {
                        return SAManagedAdActivity.class;
                    }
                }
                return null;
            case -1292741795:
                if (str.equals(m1474("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{320, 8, 0, 3}, true).intern())) {
                    return SAVASTAd.class;
                }
                return null;
            case -1246480821:
                if (str.equals(m1472("Ⴌ蔛\ud8da\uecb6慘\u18f6㖓푞礑洖戔졕讜䖏皙㕡ꎁ⯢\ua9ffᦛ", 18 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case -983382056:
                if (str.equals(m1474("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{151, 21, 87, 0}, false).intern())) {
                    return VideoPlayerController.class;
                }
                return null;
            case -926853969:
                if (str.equals(m1474("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{355, 10, 25, 0}, false).intern())) {
                    return SAResponse.class;
                }
                return null;
            case -877887884:
                if (str.equals(m1474(null, new int[]{91, 26, InterfaceC0435l1.d.b.f29113j, 14}, true).intern())) {
                    return IVideoPlayerControllerView.class;
                }
                return null;
            case -844831949:
                if (str.equals(m1474("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{79, 12, 0, 0}, true).intern())) {
                    return IVideoPlayer.class;
                }
                return null;
            case -499959157:
                if (str.equals(m1474("\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{365, 11, 0, 0}, false).intern())) {
                    return SAInterface.class;
                }
                return null;
            case -279114759:
                if (str.equals(m1472("ꩄᅱ셍牬岵酭쪡넍\ud897𤋮萉뇵\uea51⡤\uf396⾺둬గ嶍觓✢ၑߧ靐七\ueb6b駺져\uf517侩ᵞ㛙\ud8da\uecb6慘\u18f6㖓푞礑洖\uf517侩Ⴌ蔛\ud8da\uecb6慘\u18f6㖓푞礑洖戔졕讜䖏皙㕡ꎁ⯢\ua9ffᦛ", KeyEvent.keyCodeFromString("") + 61).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case -258874416:
                if (str.equals(m1472("몙⼂Ⴌ蔛\ud8da\uecb6龂\ue550\ue269읁", (ViewConfiguration.getLongPressTimeout() >> 16) + 9).intern())) {
                    f1219 = (f1220 + 89) % 128;
                    return SAVideoAd.class;
                }
                return null;
            case 2537233:
                if (str.equals(m1472("몙⼂葰팂", 4 - KeyEvent.keyCodeFromString("")).intern())) {
                    return SAAd.class;
                }
                return null;
            case 102107741:
                if (str.equals(m1472("몙⼂ꝓ\uab6d蹲㰄䴫좻䞱គ䞱គ近麰葰팂", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 16).intern())) {
                    return SAInterstitialAd.class;
                }
                return null;
            case 347965699:
                if (str.equals(m1472("\uea27⻞ꟗ꿄㍄⩖Ә⏖嘳门쪡넍\udf09\uf28c㹭옾냎䘗犌陓쪡넍焉烘됚ꁯ턆\uf47b쪡넍", 30 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    f1220 = (f1219 + 99) % 128;
                    return IVideoPlayerController.Listener.class;
                }
                return null;
            case 511814123:
                if (str.equals(m1474("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{300, 9, 0, 0}, true).intern())) {
                    int i12 = f1219 + 33;
                    f1220 = i12 % 128;
                    if (i12 % 2 != 0) {
                        return SAWebView.class;
                    }
                }
                return null;
            case 562364207:
                if (str.equals(m1472("\uea27⻞ꟗ꿄㍄⩖Ә⏖嘳门쪡넍\udf09\uf28c㹭옾냎䘗犌陓쪡넍", TextUtils.getCapsMode("", 0, 0) + 22).intern())) {
                    return IVideoPlayerController.class;
                }
                return null;
            case 690451442:
                if (str.equals(m1472("葰팂Ⴌ蔛東琟홾\udaba椟瓫神펎ﰖ념粲䀫サ攎ꟗ꿄\ue217梯焉烘됚ꁯ턆\uf47b쪡넍", (ViewConfiguration.getScrollBarSize() >> 8) + 30).intern())) {
                    return AdViewJavaScriptBridge.Listener.class;
                }
                return null;
            case 816054202:
                if (str.equals(m1474("\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000", new int[]{263, 15, 159, 0}, true).intern())) {
                    return SACustomWebView.class;
                }
                return null;
            case 846064660:
                if (str.equals(m1474("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{339, 9, 0, 0}, true).intern())) {
                    return SADetails.class;
                }
                return null;
            case 912139882:
                if (str.equals(m1474("\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{328, 11, 197, 3}, false).intern())) {
                    int i13 = f1220 + 81;
                    f1219 = i13 % 128;
                    return i13 % 2 != 0 ? VideoPlayerController.class : SAVASTMedia.class;
                }
                return null;
            case 947295484:
                if (str.equals(m1474("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{20, 15, 0, 13}, false).intern())) {
                    return SAVideoActivity.class;
                }
                return null;
            case 1067523235:
                if (str.equals(m1474(null, new int[]{187, 19, InterfaceC0435l1.d.b.f29105b, 8}, true).intern())) {
                    return SAManagedAdActivity.class;
                }
                return null;
            case 1179812605:
                if (str.equals(m1472("ꩄᅱ셍牬岵酭쪡넍\ud897𤋮萉뇵\uea51⡤\uf396⾺둬గ嶍觓✢ၑߧ靐七\ueb6b駺져\uf517侩몙⼂ꝓ\uab6d蹲㰄䴫좻䞱គ䞱គ近麰葰팂", 46 - Color.argb(0, 0, 0, 0)).intern())) {
                    return SAInterstitialAd.class;
                }
                return null;
            case 1233891357:
                if (str.equals(m1472("몙⼂\uf006㬇퉠楼䞱គ緑闍", (-16777206) - Color.rgb(0, 0, 0)).intern())) {
                    return SACreative.class;
                }
                return null;
            case 1635726011:
                if (str.equals(m1472("몙⼂Ⴌ蔛\ud8da\uecb6憎ⷄ証陌鼸閬", 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    f1220 = (f1219 + 115) % 128;
                    return SAVideoClick.class;
                }
                return null;
            case 1852615901:
                if (str.equals(m1474("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{376, 10, 0, 0}, true).intern())) {
                    return SABannerAd.class;
                }
                return null;
            case 1864912441:
                if (str.equals(m1474("\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{172, 15, 0, 0}, true).intern())) {
                    return SAManagedAdView.class;
                }
                return null;
            case 1888267954:
                if (str.equals(m1474("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{35, 44, 36, 0}, true).intern())) {
                    return SAVideoActivity.class;
                }
                return null;
            case 1968274797:
                if (str.equals(m1472("懏赈萉뇵\uea51⡤Ⳑ쌍\ud8ae瓶", 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    return AwesomeAds.class;
                }
                return null;
            case 1976248583:
                if (str.equals(m1474("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 20, 0, 16}, false).intern())) {
                    return IVideoPlayer.Listener.class;
                }
                return null;
            case 2044807796:
                if (str.equals(m1472("몙⼂\uf006㬇퉠楼䞱គ緑闍˿\ue34b駋漺㺕刦", KeyEvent.keyCodeFromString("") + 16).intern())) {
                    return SACreativeFormat.class;
                }
                return null;
            case 2057982119:
                if (str.equals(m1474("\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{309, 11, 0, 0}, false).intern())) {
                    return SAWebPlayer.class;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1474("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{386, 13, 150, 12}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cd.m1470((SAAd) list.get(0));
            }
        });
        map.put(m1474("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{399, 18, 17, 10}, true).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cd.m1467();
            }
        });
        map.put(m1474("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{417, 17, 0, 2}, true).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                cd.m1473((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        f1219 = (f1220 + 21) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m1469(SAAd sAAd) {
        int i10 = f1219 + 51;
        f1220 = i10 % 128;
        if (i10 % 2 == 0) {
            sAAd.writeToJson();
            throw null;
        }
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        int i11 = f1219 + 41;
        f1220 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 78 / 0;
        }
        return jSONObjectWriteToJson;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1472(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1222)) ^ ((c5 >>> 5) + f1223)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1225) ^ ((c10 + i12) ^ ((c10 << 4) + f1224))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1471(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1219 + 97;
        f1220 = i10 % 128;
        int i11 = i10 % 2;
        sABannerAd.setListener(sAInterface);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1219 + 119;
        f1220 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 18 / 0;
        }
    }
}
