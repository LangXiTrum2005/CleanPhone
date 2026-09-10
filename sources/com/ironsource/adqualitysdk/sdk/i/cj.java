package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cj extends be {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1314 = {' ', 'R', 'R', 'R', 'k', 'n', 'o', 'o', 'n', 'v', ' ', 'V', 'f', 'g', 'p', 'k', 'l', 'q', '[', 'V', '2', 'S', 'X', 'p', '_', '^', 'i', '\"', 'S', 'i', 'p', 'k', 'm', '[', 'T', 128, 271, 293, 300, 295, 297, 279, 272, 281, 284, 303, 301, 143, 292, 297, 264, 269, 304, 300, 293, 292, 291, 260, 258, 285, 294, 267, 243, 268, 290, 297, 292, 294, 287, 282, 290, 297, '9', 'j', 'Q', 'S', 'R', 'S', '2', 'i', 'W', 'R', 'U', ']', 'p', 'l', 'o', 'k', 'j', 'k', 128, 171, 160, 168, 179, 168, 179, 178, 177, 164, 179, 173, 136, 163, '$', 'E', 'I', 'O', '_', 'k', 'l', 'q', 'i', 'l', 'l', 'k', 'a', 'J', 'Z', 178, 170, 171, 171, 170, 167, 142, 143, 164, 165, 166, 173, 161, ':', 'q', 'i', 'g', 'j', 'W', 'R', 'c', '^', '^', 'h', 'i', 'j', 'q', 'e', 't', 232, 238, 220, 212, 222, 227, 237, 240, '8', '\\', 'V', 'e', 'f', 'l', 'Z', 'X', '6', 'l', 'r', 'a', 'X', 'h', 'k', 'l', 'i', 'g', 'm', 'n', 'a', 'a', 'p', 't', 'l', 'h', 'j', 'o', 'o', 'o', 'w', 'j', 'i', 'u', '\\', 184, 190, 182, 174, 187, 192, 192, 184, 188, 190, 174, 174, 190, 198, 192, 189, 188, 191};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1315 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1316 = 93;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1317 = 1;

    public cj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdPayload.AdUnit m1576(AdPayload adPayload) {
        int i10 = f1317 + 107;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        AdPayload.AdUnit adUnitM1589 = m1589(adPayload);
        if (i11 != 0) {
            int i12 = 53 / 0;
        }
        f1317 = (f1315 + 99) % 128;
        return adUnitM1589;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1580(AdPayload.AdUnit adUnit) {
        int i10 = f1315 + 31;
        f1317 = i10 % 128;
        if (i10 % 2 == 0) {
            m1582(adUnit);
            throw null;
        }
        String strM1582 = m1582(adUnit);
        int i11 = f1315 + 51;
        f1317 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1582;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ AdPayload.TemplateSettings m1585(AdPayload.AdUnit adUnit) {
        f1315 = (f1317 + 99) % 128;
        AdPayload.TemplateSettings templateSettingsM1590 = m1590(adUnit);
        f1317 = (f1315 + 9) % 128;
        return templateSettingsM1590;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1591(Placement placement) {
        int i10 = f1315 + 27;
        f1317 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1584(placement);
        }
        m1584(placement);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -1836618638:
                if (str.equals(m1587("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 10, 0, 0}, false).intern())) {
                    return AdActivity.class;
                }
                return null;
            case -1791176561:
                if (!str.equals(m1587("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{27, 8, 2, 0}, false).intern())) {
                    return null;
                }
                f1317 = (f1315 + 5) % 128;
                return BannerAd.class;
            case -1560947009:
                if (str.equals(m1587("\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{47, 25, 187, 0}, false).intern())) {
                    return BannerView.class;
                }
                return null;
            case -1494265129:
                if (str.equals(m1581((ViewConfiguration.getTapTimeout() >> 16) + 41, true, Drawable.resolveOpacity(0, 0) + PsExtractor.AUDIO_STREAM, "\u0004\u000b\u0012\ufff3ￋ\u0006\u0012ￋ\t\ufffe\u000b\u000f\u0002\u0011\u000b\u0006ￋ\u0010\u0001\ufffeￋ\u0002\t\u0004\u000b\u0012\u0013ￋ\n\f\u0000\u0016\u0011\u0006\u0013\u0006\u0011\u0000\uffde\u0002\t", 31 - Color.red(0)).intern())) {
                    return VungleActivity.class;
                }
                return null;
            case -1435839138:
                if (str.equals(m1587("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{78, 12, 0, 4}, false).intern())) {
                    return FullscreenAd.class;
                }
                return null;
            case -1179107681:
                if (str.equals(m1581(MotionEvent.axisFromString("") + 10, false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 193, "\uffdd\u0000\u000f\ufff2\u0011\n\u0003\b\u0001", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4).intern())) {
                    return VungleAds.class;
                }
                return null;
            case -609786639:
                if (str.equals(m1581(10 - (ViewConfiguration.getWindowTouchSlop() >> 8), false, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 190, "\u0003\u0004\u0003￠\u0003\ufff1\u0004\u0016\u0000\u0011", 5 - Color.red(0)).intern())) {
                    return RewardedAd.class;
                }
                return null;
            case -498709917:
                if (!str.equals(m1581(21 - TextUtils.indexOf((CharSequence) "", '0'), false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 196, "ￚ�￥\u0002\f\r\ufffe\u0007\ufffe\u000b￢\u0007\r\ufffe\u000b\f\r\u0002\r\u0002\ufffa\u0005", 10 - TextUtils.getTrimmedLength("")).intern())) {
                    return null;
                }
                int i10 = f1317 + InterfaceC0435l1.d.b.f29112i;
                f1315 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return InterstitialAdListener.class;
            case -498060603:
                if (str.equals(m1581((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 9, true, 195 - (ViewConfiguration.getTouchSlop() >> 8), "�\ufffb\u0006￪\u000e\b\uffff\u0007\uffff", (ViewConfiguration.getFadingEdgeLength() >> 16) + 4).intern())) {
                    return Placement.class;
                }
                return null;
            case -486531311:
                if (str.equals(m1587("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", new int[]{InterfaceC0435l1.d.b.f29108e, 14, 0, 4}, true).intern())) {
                    return MRAIDPresenter.class;
                }
                return null;
            case -393802555:
                if (str.equals(m1581(17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), false, TextUtils.getOffsetBefore("", 0) + 193, "\uffdd\u0000￨\u0005\u000f\u0010\u0001\n\u0001\u000e￮\u0001\u0013�\u000e\u0000\u0001\u0000", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10).intern())) {
                    return RewardedAdListener.class;
                }
                return null;
            case -43797322:
                if (str.equals(m1581(21 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), false, 193 - Color.red(0), "\u0004\u0001�\ufffe\b\u0001￮\u0001\f\b�\uffff\u0001\t\u0001\n\u0010\uffdf�\uffff", 17 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return AdPayload.CacheableReplacement.class;
                }
                return null;
            case 307971376:
                if (str.equals(m1587("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{35, 12, 190, 0}, false).intern())) {
                    return BannerAdSize.class;
                }
                return null;
            case 320151695:
                if (!str.equals(m1587((String) null, new int[]{90, 14, 63, 13}, true).intern())) {
                    return null;
                }
                int i11 = f1315 + 67;
                f1317 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                return InterstitialAd.class;
            case 324239304:
                if (str.equals(m1581(13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, TextUtils.indexOf((CharSequence) "", '0', 0) + PsExtractor.AUDIO_STREAM, "￠\u0010\u0003\f\u0003\u0012\u0011\u0007￪\u0002\uffdf\u0003\u0011\uffff", Gravity.getAbsoluteGravity(0, 0) + 1).intern())) {
                    return BaseAdListener.class;
                }
                return null;
            case 389759008:
                if (str.equals(m1587("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{10, 10, 0, 1}, true).intern())) {
                    return AdInternal.class;
                }
                return null;
            case 484680813:
                if (str.equals(m1581((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, false, (ViewConfiguration.getWindowTouchSlop() >> 8) + PsExtractor.PRIVATE_STREAM_1, "\u0014￡\u0004￡\u0013\u0013\u0005", 1 - Color.argb(0, 0, 0, 0)).intern())) {
                    return AdAsset.class;
                }
                return null;
            case 870529955:
                if (str.equals(m1587("\u0001\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{20, 7, 0, 1}, false).intern())) {
                    return AppNode.class;
                }
                return null;
            case 961844241:
                if (str.equals(m1581(10 - Color.alpha(0), false, 193 - View.combineMeasuredStates(0, 0), "\u0013\uffde�\n\n\u0001\u000e\ufff2\u0005\u0001", TextUtils.indexOf("", "") + 1).intern())) {
                    return BannerView.class;
                }
                return null;
            case 989853769:
                if (str.equals(m1581(37 - TextUtils.getCapsMode("", 0, 0), false, 190 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0002\u0013\b\u0015\b\u0013\u0018\u0002\u000e\fￍ\u0015\u0014\r\u0006\u000b\u0004ￍ\u0000\u0003\u0012ￍ\b\r\u0013\u0004\u0011\r\u0000\u000bￍ\u0014\bￍ￠\u0003￠", KeyEvent.getDeadChar(0, 0) + 7).intern())) {
                    return AdActivity.class;
                }
                return null;
            case 1205766784:
                if (!str.equals(m1587("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{118, 14, 60, 0}, true).intern())) {
                    return null;
                }
                int i12 = f1317 + 51;
                f1315 = i12 % 128;
                if (i12 % 2 != 0) {
                    return null;
                }
                return VungleActivity.class;
            case 1208038126:
                if (!str.equals(m1587("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{132, 15, 0, 0}, true).intern())) {
                    return null;
                }
                f1315 = (f1317 + 13) % 128;
                return VungleWebClient.class;
            case 1442693170:
                if (str.equals(m1581(20 - TextUtils.indexOf("", "", 0), false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 195, "\r\u000e\uffff\b\uffff\f￠\u000f\u0006\u0006\r�\f\uffff\uffff\bￛ\ufffe￦\u0003", KeyEvent.keyCodeFromString("") + 6).intern())) {
                    return FullscreenAdListener.class;
                }
                return null;
            case 1505622627:
                if (str.equals(m1581(View.MeasureSpec.getMode(0) + 16, true, 194 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "�\uffde\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0000\uffdd\u000e\u0001\n\n", 2 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return BannerAdListener.class;
                }
                return null;
            case 1839869899:
                if (!str.equals(m1581(9 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, 190 - View.MeasureSpec.getMode(0), "\u000e\u0000\u0003￠\u0003\uffef\u0000\u0018\u000b", 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    return null;
                }
                f1317 = (f1315 + 85) % 128;
                return AdPayload.class;
            case 1853648591:
                if (str.equals(m1581(Drawable.resolveOpacity(0, 0) + 16, true, Color.alpha(0) + PsExtractor.AUDIO_STREAM, "\u0002\u000f\u0000\u0010\t\t\u0012￣\u0002\u0010\ufffe\uffdf\u0001\uffde\u000b\u0002", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern())) {
                    return BaseFullscreenAd.class;
                }
                return null;
            case 1930966324:
                if (str.equals(m1581(15 - View.resolveSize(0, 0), true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + PsExtractor.AUDIO_STREAM, "\uffdf\u0005\f\uffdd\u0001\b\u0003\n\u0011\ufff2\u0010\n\u0001\u0005\b", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 10).intern())) {
                    return VungleApiClient.class;
                }
                return null;
            case 1982630644:
                if (str.equals(m1587("\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{72, 6, 0, 3}, true).intern())) {
                    return BaseAd.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1577(AdPayload.CacheableReplacement cacheableReplacement) {
        int i10 = f1315 + 33;
        f1317 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1583(cacheableReplacement);
        }
        m1583(cacheableReplacement);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1586(AppNode appNode) {
        int i10 = f1315 + 55;
        f1317 = i10 % 128;
        int i11 = i10 % 2;
        String strM1578 = m1578(appNode);
        if (i11 == 0) {
            int i12 = 53 / 0;
        }
        return strM1578;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdPayload.AdUnit m1589(AdPayload adPayload) {
        f1317 = (f1315 + 99) % 128;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        f1317 = (f1315 + 1) % 128;
        return adUnit;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻛ */
    public final String mo818() {
        f1317 = (f1315 + 119) % 128;
        try {
            String strM2493 = id.m2382().m2383().m2493(BuildConfig.class, m1581(14 - TextUtils.getCapsMode("", 0, 0), true, Color.green(0) + 169, "\u0010\u0012\uffd8\uffde￢\u0018\u0010\uffdf\u0011￢\u0018\u0010\u000f\u0018", 2 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
            f1317 = (f1315 + 79) % 128;
            return strM2493;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1579(Placement placement) {
        f1315 = (f1317 + 71) % 128;
        boolean zM1588 = m1588(placement);
        int i10 = f1317 + 81;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 87 / 0;
        }
        return zM1588;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdPayload.TemplateSettings m1590(AdPayload.AdUnit adUnit) {
        int i10 = f1317 + 79;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            adUnit.getTemplateSettings();
            throw null;
        }
        AdPayload.TemplateSettings templateSettings = adUnit.getTemplateSettings();
        f1317 = (f1315 + 89) % 128;
        return templateSettings;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1587("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{147, 9, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 0}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cj.m1576((AdPayload) list.get(0));
            }
        });
        map.put(m1587("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{156, 8, 0, 3}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cj.m1586((AppNode) list.get(0));
            }
        });
        map.put(m1587("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{164, 26, 6, 0}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cj.m1577((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m1581(11 - KeyEvent.keyCodeFromString(""), false, 193 - Process.getGidForName(""), "\b\u000b￼\u0004\u0002\t\u0002\u0000\u000f\uffde￼", 6 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cj.m1580((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1581((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 14, false, 194 - (Process.myTid() >> 22), "￫\u0007￼\ufffe\u0000\b\u0000\t\u000f￤\uffff\u0002\u0000\u000f", 10 - ImageFormat.getBitsPerPixel(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cj.m1591((Placement) list.get(0));
            }
        });
        map.put(m1587("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{190, 19, 82, 0}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cj.m1585((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1581(15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, 195 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0011\uffff￬\r\u0003\t\uffff\ufffe\u0003\ufff0\ufffe\uffff\ufffe\f\ufffb", 5 - Drawable.resolveOpacity(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(cj.m1579((Placement) list.get(0)));
            }
        });
        int i10 = f1317 + InterfaceC0435l1.d.b.f29105b;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 0 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f1315 = (f1317 + InterfaceC0435l1.d.b.f29109f) % 128;
        try {
            String str = mo818().split(m1581(1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, 138 - TextUtils.indexOf("", ""), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())[0];
            int i10 = f1315 + 41;
            f1317 = i10 % 128;
            if (i10 % 2 != 0) {
                return str;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1578(AppNode appNode) {
        f1315 = (f1317 + 27) % 128;
        String appId = appNode.getAppId();
        f1317 = (f1315 + 7) % 128;
        return appId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m1588(Placement placement) {
        f1315 = (f1317 + InterfaceC0435l1.d.b.f29114k) % 128;
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        int i10 = f1317 + 69;
        f1315 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 14 / 0;
        }
        return zIsRewardedVideo;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1587(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f1314, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1583(AdPayload.CacheableReplacement cacheableReplacement) {
        int i10 = f1317 + 3;
        f1315 = i10 % 128;
        int i11 = i10 % 2;
        String url = cacheableReplacement.getUrl();
        if (i11 != 0) {
            int i12 = 61 / 0;
        }
        f1315 = (f1317 + 11) % 128;
        return url;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1582(AdPayload.AdUnit adUnit) {
        f1317 = (f1315 + 73) % 128;
        String campaign = adUnit.getCampaign();
        f1317 = (f1315 + 57) % 128;
        return campaign;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1584(Placement placement) {
        int i10 = f1315 + 97;
        f1317 = i10 % 128;
        if (i10 % 2 != 0) {
            return placement.getReferenceId();
        }
        placement.getReferenceId();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1581(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f1316);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
