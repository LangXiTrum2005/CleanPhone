package com.p004ironsource;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J\u0012\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\bJ\u0012\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\bJ\u0012\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b¨\u0006 "}, d2 = {"Lcom/ironsource/wb;", "", "Lcom/ironsource/xg;", "errorCode", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "networkError", "a", "error", "", "description", "b", "c", "d", "e", f.j, h.f36614b, i.f37957c, "j", g.f40227p, "k", "m", "l", "o", "p", dc.q, "q", "r", "s", "t", PglCryptUtils.KEY_MESSAGE, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb f27568a = new wb();

    private wb() {
    }

    public final IronSourceError a() {
        return a(this, xg.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public final IronSourceError b() {
        return a(this, xg.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, xg.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, xg.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError e() {
        return a(this, xg.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, xg.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, xg.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, xg.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, xg.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, xg.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, xg.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, xg.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, xg.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, xg.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, xg.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, xg.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, xg.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, xg.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, xg.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, xg.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    public final IronSourceError a(IronSourceError networkError) {
        Intrinsics.f(networkError, "networkError");
        return a(xg.ISErrorInitNetworkFailed, networkError);
    }

    public final IronSourceError b(IronSourceError error) {
        Intrinsics.f(error, "error");
        return a(xg.ISErrorLoadNetworkFailed, error);
    }

    public final IronSourceError c(IronSourceError networkError) {
        Intrinsics.f(networkError, "networkError");
        return a(xg.ISErrorShowNetworkFailed, networkError);
    }

    public final IronSourceError d(String message) {
        return a(xg.ISErrorRewardedLoadNoConfig, message);
    }

    public static /* synthetic */ IronSourceError a(wb wbVar, xg xgVar, IronSourceError ironSourceError, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ironSourceError = null;
        }
        return wbVar.a(xgVar, ironSourceError);
    }

    public static /* synthetic */ IronSourceError b(wb wbVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        return wbVar.b(str);
    }

    public static /* synthetic */ IronSourceError c(wb wbVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        return wbVar.d(str);
    }

    public static /* synthetic */ IronSourceError a(wb wbVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        return wbVar.a(str);
    }

    public final IronSourceError b(String message) {
        return a(xg.ISErrorInterstitialLoadNoConfig, message);
    }

    public final IronSourceError c(String description) {
        Intrinsics.f(description, "description");
        return a(xg.ISErrorLoadNetworkFailed, description);
    }

    private final IronSourceError a(xg errorCode, IronSourceError networkError) {
        String str;
        if (networkError != null) {
            str = errorCode.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String() + " Underlying network error: '" + networkError.getErrorCode() + AbstractJsonLexerKt.COLON + networkError.getErrorMessage() + '\'';
        } else {
            str = errorCode.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
        }
        return new IronSourceError(errorCode.getErrorCode(), str);
    }

    private final IronSourceError a(xg error, String description) {
        if (description == null || description.length() == 0) {
            description = error.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
        }
        return new IronSourceError(error.getErrorCode(), description);
    }

    public final IronSourceError a(String message) {
        return a(xg.ISErrorBannerLoadNoConfig, message);
    }
}
