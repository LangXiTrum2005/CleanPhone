package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.h0;
import cn.l;
import cn.o1;
import cn.p1;
import cn.q1;
import cn.w1;
import cn.z;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.repository.AdRepository;
import fn.a1;
import fn.m0;
import fn.s;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import hn.d;
import java.util.List;
import java.util.Set;
import jk.c;
import kn.b;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wj.r;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh;", "Lcom/unity3d/ads/core/domain/AdRefresh;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/CacheAssets;", "cacheAssets", "Lcom/unity3d/ads/core/domain/Refresh;", ToolBar.REFRESH, "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/CacheAssets;Lcom/unity3d/ads/core/domain/Refresh;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lwj/r;", "performRefresh", "(Lcom/google/protobuf/ByteString;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "", "canUpdateRefreshData", "(Lcom/unity3d/ads/core/data/model/AdObjectState;)Z", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "Lcom/unity3d/ads/core/domain/Refresh;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidAdRefresh implements AdRefresh {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final Set<AdObjectState> NON_UPDATABLE_STATES = k.E0(new AdObjectState[]{AdObjectState.SHOWING, AdObjectState.COMPLETED, AdObjectState.EXPIRED});
    private final AdRepository adRepository;
    private final CacheAssets cacheAssets;
    private final Refresh refresh;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh$Companion;", "", "()V", "NON_UPDATABLE_STATES", "", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "getNON_UPDATABLE_STATES", "()Ljava/util/Set;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Set<AdObjectState> getNON_UPDATABLE_STATES() {
            return AndroidAdRefresh.NON_UPDATABLE_STATES;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwj/r;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements c {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ a0 $refreshScope;
        int label;
        final /* synthetic */ AndroidAdRefresh this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1", f = "AndroidAdRefresh.kt", l = {125}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements c {
            final /* synthetic */ AdObject $adObject;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ AndroidAdRefresh this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdObject adObject, AndroidAdRefresh androidAdRefresh, f fVar) {
                super(2, fVar);
                this.$adObject = adObject;
                this.this$0 = androidAdRefresh;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, fVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // jk.c
            public final Object invoke(a0 a0Var, f fVar) {
                return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                Object objS;
                int i10 = this.label;
                if (i10 == 0) {
                    t9.e.z(obj);
                    a0 a0Var = (a0) this.L$0;
                    f fVar = null;
                    h0 h0VarG = d0.g(a0Var, new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, null), 3);
                    h0 h0VarG2 = d0.g(a0Var, new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, null), 3);
                    AdObject adObject = this.$adObject;
                    this.L$0 = h0VarG;
                    this.L$1 = h0VarG2;
                    this.L$2 = adObject;
                    this.label = 1;
                    kn.a aVar = new kn.a(this);
                    l lVar = aVar.f44727g;
                    try {
                        am.e eVarE = h0VarG.E();
                        AndroidAdRefresh$invoke$3$1$1$1 androidAdRefresh$invoke$3$1$1$1 = new AndroidAdRefresh$invoke$3$1$1$1(h0VarG2, adObject, null);
                        q1 q1Var = (q1) eVarE.f3698b;
                        o1 o1Var = o1.f6752b;
                        p1 p1Var = p1.f6754b;
                        aVar.f(new b(aVar, q1Var, androidAdRefresh$invoke$3$1$1$1), false);
                        am.e eVarE2 = h0VarG2.E();
                        aVar.f(new b(aVar, (q1) eVarE2.f3698b, new AndroidAdRefresh$invoke$3$1$1$2(h0VarG, null)), false);
                    } catch (Throwable th2) {
                        lVar.resumeWith(t9.e.c(th2));
                    }
                    lVar.getClass();
                    if (l.f6731g.get(lVar) instanceof w1) {
                        d0.w(d0.b(aVar.f44737a), null, new b4.a(aVar, fVar, 9), 1);
                        objS = lVar.s();
                    } else {
                        objS = lVar.s();
                    }
                    bk.a aVar2 = bk.a.f5708a;
                    if (objS == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a0 a0Var, AdObject adObject, AndroidAdRefresh androidAdRefresh, f fVar) {
            super(2, fVar);
            this.$refreshScope = a0Var;
            this.$adObject = adObject;
            this.this$0 = androidAdRefresh;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass3(this.$refreshScope, this.$adObject, this.this$0, fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            d0.w(this.$refreshScope, null, new AnonymousClass1(this.$adObject, this.this$0, null), 3);
            return r.f53297a;
        }

        @Override // jk.c
        public final Object invoke(String str, f fVar) {
            return ((AnonymousClass3) create(str, fVar)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$performRefresh$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh", f = "AndroidAdRefresh.kt", l = {75, 79, 95}, m = "performRefresh")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends ck.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidAdRefresh.this.performRefresh(null, this);
        }
    }

    public AndroidAdRefresh(AdRepository adRepository, CacheAssets cacheAssets, Refresh refresh) {
        n.f(adRepository, "adRepository");
        n.f(cacheAssets, "cacheAssets");
        n.f(refresh, "refresh");
        this.adRepository = adRepository;
        this.cacheAssets = cacheAssets;
        this.refresh = refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUpdateRefreshData(AdObjectState state) {
        return !NON_UPDATABLE_STATES.contains(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object performRefresh(ByteString byteString, f fVar) {
        AnonymousClass1 anonymousClass1;
        AdObject ad2;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        AdResponseOuterClass.AdResponse adResponse;
        ByteString adDataRefreshToken;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse;
        AndroidAdRefresh androidAdRefresh;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse2;
        AdRefreshState adRefreshState;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        r rVar = r.f53297a;
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(obj);
            ad2 = this.adRepository.getAd(byteString);
            if (ad2 == null) {
                throw new IllegalStateException(("No adObject for opportunityId: " + byteString).toString());
            }
            webViewLessLoadingRequiredData = ad2.getWebViewLessLoadingRequiredData();
            if (webViewLessLoadingRequiredData != null && (adResponse = webViewLessLoadingRequiredData.getAdResponse()) != null && (adDataRefreshToken = adResponse.getAdDataRefreshToken()) != null && !adDataRefreshToken.isEmpty()) {
                int i12 = bn.a.f5743d;
                long jO = d0.c.O(adResponse.getCampaignMetadata().getAdDataRefreshDelayMs(), bn.c.MILLISECONDS);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = byteString;
                anonymousClass1.L$2 = ad2;
                anonymousClass1.L$3 = webViewLessLoadingRequiredData;
                anonymousClass1.L$4 = adDataRefreshToken;
                anonymousClass1.label = 1;
                Object objL = d0.l(d0.G(jO), anonymousClass1);
                if (objL != aVar) {
                    objL = rVar;
                }
                if (objL != aVar) {
                }
                return aVar;
            }
            return rVar;
        }
        if (i11 == 1) {
            ByteString byteString2 = (ByteString) anonymousClass1.L$4;
            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData3 = (AdObject.WebViewLessLoadingRequiredData) anonymousClass1.L$3;
            ad2 = (AdObject) anonymousClass1.L$2;
            ByteString byteString3 = (ByteString) anonymousClass1.L$1;
            AndroidAdRefresh androidAdRefresh2 = (AndroidAdRefresh) anonymousClass1.L$0;
            t9.e.z(obj);
            adDataRefreshToken = byteString2;
            webViewLessLoadingRequiredData = webViewLessLoadingRequiredData3;
            byteString = byteString3;
            this = androidAdRefresh2;
        } else {
            if (i11 == 2) {
                AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData4 = (AdObject.WebViewLessLoadingRequiredData) anonymousClass1.L$2;
                AdObject adObject = (AdObject) anonymousClass1.L$1;
                AndroidAdRefresh androidAdRefresh3 = (AndroidAdRefresh) anonymousClass1.L$0;
                t9.e.z(obj);
                webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData4;
                this = androidAdRefresh3;
                ad2 = adObject;
                adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                if (adDataRefreshResponse.hasError()) {
                    if (adDataRefreshResponse.getError().getErrorCode() == ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL) {
                        adRefreshState = AdRefreshState.REUSE_NO_FILL;
                    } else {
                        adRefreshState = AdRefreshState.REUSE_ERROR;
                    }
                    webViewLessLoadingRequiredData2.setAdRefreshState(adRefreshState);
                    return rVar;
                }
                if (!adDataRefreshResponse.hasCampaignMetadata() && !adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList().isEmpty()) {
                    CacheAssets cacheAssets = this.cacheAssets;
                    List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList();
                    n.e(assetsToCacheList, "response.campaignMetadata.assetsToCacheList");
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = ad2;
                    anonymousClass1.L$2 = webViewLessLoadingRequiredData2;
                    anonymousClass1.L$3 = adDataRefreshResponse;
                    anonymousClass1.label = 3;
                    Object objInvoke = cacheAssets.invoke(ad2, assetsToCacheList, anonymousClass1);
                    if (objInvoke != aVar) {
                        androidAdRefresh = this;
                        adDataRefreshResponse2 = adDataRefreshResponse;
                        obj = objInvoke;
                    }
                    return aVar;
                }
                webViewLessLoadingRequiredData2.setAdRefreshState(AdRefreshState.REUSE_NO_FILL);
                return rVar;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adDataRefreshResponse2 = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) anonymousClass1.L$3;
            webViewLessLoadingRequiredData2 = (AdObject.WebViewLessLoadingRequiredData) anonymousClass1.L$2;
            ad2 = (AdObject) anonymousClass1.L$1;
            androidAdRefresh = (AndroidAdRefresh) anonymousClass1.L$0;
            t9.e.z(obj);
        }
        if (!(((CacheAssetsEvent) obj) instanceof CacheAssetsEvent.Success)) {
            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData5 = ad2.getWebViewLessLoadingRequiredData();
            if (webViewLessLoadingRequiredData5 != null) {
                webViewLessLoadingRequiredData5.setAdRefreshState(AdRefreshState.REUSE_ERROR);
                return rVar;
            }
        } else if (androidAdRefresh.canUpdateRefreshData((AdObjectState) ((a1) ad2.getState()).getValue())) {
            webViewLessLoadingRequiredData2.setAdRefreshState(AdRefreshState.REUSE_RELOADED);
            ByteString trackingToken = adDataRefreshResponse2.getTrackingToken();
            n.e(trackingToken, "response.trackingToken");
            ad2.setTrackingToken(trackingToken);
            AdResponseOuterClass.AdResponse adResponse2 = webViewLessLoadingRequiredData2.getAdResponse();
            AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.INSTANCE;
            AdResponseOuterClass.AdResponse.Builder builder = adResponse2.toBuilder();
            n.e(builder, "this.toBuilder()");
            AdResponseKt.Dsl dsl_create = companion._create(builder);
            ByteString adData = adDataRefreshResponse2.getAdData();
            n.e(adData, "response.adData");
            dsl_create.setAdData(adData);
            ByteString adDataRefreshToken2 = adDataRefreshResponse2.getAdDataRefreshToken();
            n.e(adDataRefreshToken2, "response.adDataRefreshToken");
            dsl_create.setAdDataRefreshToken(adDataRefreshToken2);
            ByteString trackingToken2 = adDataRefreshResponse2.getTrackingToken();
            n.e(trackingToken2, "response.trackingToken");
            dsl_create.setTrackingToken(trackingToken2);
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = adDataRefreshResponse2.getCampaignMetadata();
            n.e(campaignMetadata, "response.campaignMetadata");
            dsl_create.setCampaignMetadata(campaignMetadata);
            webViewLessLoadingRequiredData2.setAdResponse(dsl_create._build());
            return rVar;
        }
        return rVar;
        if (this.canUpdateRefreshData((AdObjectState) ((a1) ad2.getState()).getValue())) {
            Refresh refresh = this.refresh;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = ad2;
            anonymousClass1.L$2 = webViewLessLoadingRequiredData;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.label = 2;
            Object objInvoke2 = refresh.invoke(byteString, adDataRefreshToken, anonymousClass1);
            if (objInvoke2 != aVar) {
                AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData6 = webViewLessLoadingRequiredData;
                obj = objInvoke2;
                webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData6;
                adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                if (adDataRefreshResponse.hasError()) {
                    if (adDataRefreshResponse.getError().getErrorCode() == ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL) {
                        adRefreshState = AdRefreshState.REUSE_NO_FILL;
                    } else {
                        adRefreshState = AdRefreshState.REUSE_ERROR;
                    }
                    webViewLessLoadingRequiredData2.setAdRefreshState(adRefreshState);
                    return rVar;
                }
                if (!adDataRefreshResponse.hasCampaignMetadata()) {
                }
                webViewLessLoadingRequiredData2.setAdRefreshState(AdRefreshState.REUSE_NO_FILL);
            }
            return aVar;
        }
        return rVar;
    }

    @Override // com.unity3d.ads.core.domain.AdRefresh
    public Object invoke(AdObject adObject, f fVar) {
        d dVarB = d0.b(adObject.getAdScope().getCoroutineContext().plus(new z("Ad_Refresh")));
        final m0 broadcastEventChannel = AdPlayer.INSTANCE.getBroadcastEventChannel();
        final String str = "AD_REFRESH";
        fn.g.o(new s(new fn.e() { // from class: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;
                final /* synthetic */ String receiver$inlined;

                /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2", f = "AndroidAdRefresh.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends ck.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(f fVar) {
                        super(fVar);
                    }

                    @Override // ck.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar, String str) {
                    this.$this_unsafeFlow = fVar;
                    this.receiver$inlined = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
                    AnonymousClass1 anonymousClass1;
                    if (fVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        if (this.receiver$inlined.equals(obj)) {
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(obj, anonymousClass1);
                            bk.a aVar = bk.a.f5708a;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar2, f fVar3) {
                Object objCollect = broadcastEventChannel.collect(new AnonymousClass2(fVar2, str), fVar3);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        }, new AnonymousClass3(dVarB, adObject, this, null), 2), dVarB);
        return r.f53297a;
    }
}
