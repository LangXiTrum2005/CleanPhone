package com.startapp.sdk.internal;

import A.C0880a0;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.Orientation;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k8 extends y7 {
    public final jj f;
    public final lb g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f41180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(Context context, jj videoEnabledAd, AdEventListener adEventListener, lb webViewFactory, lb networkApiExecutor, lb eventTracer, lb webViewCacheLoader, String adm, lb httpClient) {
        super(context, videoEnabledAd, adEventListener, networkApiExecutor, eventTracer, webViewCacheLoader, adm);
        Intrinsics.f(context, "context");
        Intrinsics.f(videoEnabledAd, "videoEnabledAd");
        Intrinsics.f(webViewFactory, "webViewFactory");
        Intrinsics.f(networkApiExecutor, "networkApiExecutor");
        Intrinsics.f(eventTracer, "eventTracer");
        Intrinsics.f(webViewCacheLoader, "webViewCacheLoader");
        Intrinsics.f(adm, "adm");
        Intrinsics.f(httpClient, "httpClient");
        this.f = videoEnabledAd;
        this.g = webViewFactory;
        this.f41180h = httpClient;
    }

    public static final void a(k8 this$0, List errorTrackersUrls, VASTErrorCodes errorCode) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(errorTrackersUrls, "errorTrackersUrls");
        Intrinsics.f(errorCode, "errorCode");
        l8.a(this$0.f40653c, this$0.f.r, errorTrackersUrls, errorCode);
    }

    @Override // com.startapp.sdk.internal.y7, com.startapp.sdk.adsbase.d
    public final Object a(String adm) {
        yi yiVar;
        Intrinsics.f(adm, "adm");
        try {
            VideoConfig videoConfigF = AdsCommonMetaData.k().F();
            Intrinsics.e(videoConfigF, "getVideoConfig(...)");
            MetaData metaDataE = MetaData.E();
            Intrinsics.e(metaDataE, "getInstance(...)");
            aj ajVar = (aj) JsonParser.fromJson(adm, aj.class);
            if (ajVar != null && ajVar.getVastTag() != null) {
                String strD0 = metaDataE.d0();
                if (!ajVar.isRecordHops() || TextUtils.isEmpty(strD0)) {
                    yiVar = null;
                } else {
                    lb lbVar = this.f41180h;
                    Intrinsics.c(strD0);
                    yiVar = new yi(lbVar, strD0, ajVar.getPartnerResponse(), ajVar.getPartnerName(), ajVar.isSkipFailed());
                }
                com.startapp.sdk.ads.video.vast.a aVar = new com.startapp.sdk.ads.video.vast.a(this.f40653c, ((tk) this.g.a()).a());
                aVar.f = videoConfigF.f();
                aVar.f40566c = new C0880a0(this, 26);
                xi xiVarA = aVar.a(ajVar.getVastTag(), yiVar);
                if (xiVarA != null) {
                    Ad ad = this.f40651a;
                    ej ejVar = (ad != null ? ad.getType() : null) != Ad.AdType.REWARDED_VIDEO ? new ej(ajVar.getSkipafter(), ajVar.getSkipmin()) : null;
                    Ad ad2 = this.f40651a;
                    jj jjVar = ad2 instanceof jj ? (jj) ad2 : null;
                    if (jjVar != null) {
                        jjVar.r = new VideoAdDetails(xiVarA, videoConfigF, ejVar);
                        Integer num = xiVarA.q;
                        if (num != null && xiVarA.r != null) {
                            if (num.intValue() > xiVarA.r.intValue()) {
                                if (Orientation.LANDSCAPE == Orientation.PORTRAIT) {
                                    jjVar.f41300e = 1;
                                } else {
                                    jjVar.f41300e = 2;
                                }
                            } else {
                                Orientation orientation = Orientation.PORTRAIT;
                                jjVar.f41300e = 1;
                            }
                        }
                        String ttlSec = ajVar.getTtlSec();
                        if (ttlSec != null) {
                            jjVar.c(ttlSec);
                        }
                    }
                    String admTag = ajVar.getAdmTag();
                    Intrinsics.e(admTag, "getAdmTag(...)");
                    return super.a(admTag);
                }
                throw new RuntimeException("Vast config error");
            }
            return super.a(adm);
        } catch (Throwable th) {
            Ad ad3 = this.f40651a;
            jj jjVar2 = ad3 instanceof jj ? (jj) ad3 : null;
            if (jjVar2 != null) {
                jjVar2.setErrorMessage(th.getMessage());
            }
            return null;
        }
    }
}
