package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "webViewConfigurationDataSource", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "tcfRepository", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;Lcom/unity3d/ads/core/data/repository/TcfRepository;)V", "", "placement", "Lcom/google/protobuf/ByteString;", "impressionOpportunity", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "size", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "loadConfiguration", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE, 42, 65}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdRequest.this.invoke(null, null, null, null, this);
        }
    }

    public AndroidGetAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository, WebviewConfigurationDataSource webViewConfigurationDataSource, TcfRepository tcfRepository) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(sessionRepository, "sessionRepository");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(campaignRepository, "campaignRepository");
        n.f(webViewConfigurationDataSource, "webViewConfigurationDataSource");
        n.f(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webViewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x011a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0120  */
    /* JADX WARN: Code duplicated, block: B:33:0x0130  */
    /* JADX WARN: Code duplicated, block: B:35:0x0139  */
    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    public Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, f fVar) {
        AnonymousClass1 anonymousClass1;
        AdRequestKt.Dsl dsl_create;
        String str2;
        ByteString byteString2;
        AdRequestOuterClass.BannerSize bannerSize2;
        LoadConfigurationInternal loadConfigurationInternal2;
        Object objStaticDeviceInfo;
        AndroidGetAdRequest androidGetAdRequest;
        AdRequestKt.Dsl dsl;
        AdRequestKt.Dsl dsl2;
        final AdRequestKt.Dsl dsl3;
        AdRequestOuterClass.BannerSize bannerSize3;
        LoadConfigurationInternal loadConfigurationInternal3;
        AdRequestKt.Dsl dsl4;
        AndroidGetAdRequest androidGetAdRequest2;
        AdRequestKt.Dsl dsl5;
        String tcfString;
        Object objInvoke;
        String mediationAdUnitId;
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
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(obj);
            AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
            AdRequestOuterClass.AdRequest.Builder builderNewBuilder = AdRequestOuterClass.AdRequest.newBuilder();
            n.e(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            str2 = str;
            anonymousClass1.L$1 = str2;
            byteString2 = byteString;
            anonymousClass1.L$2 = byteString2;
            bannerSize2 = bannerSize;
            anonymousClass1.L$3 = bannerSize2;
            loadConfigurationInternal2 = loadConfigurationInternal;
            anonymousClass1.L$4 = loadConfigurationInternal2;
            anonymousClass1.L$5 = dsl_create;
            anonymousClass1.L$6 = dsl_create;
            anonymousClass1.L$7 = dsl_create;
            anonymousClass1.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo != aVar) {
                androidGetAdRequest = this;
                dsl = dsl_create;
                dsl2 = dsl;
            }
            return aVar;
        }
        if (i11 == 1) {
            dsl = (AdRequestKt.Dsl) anonymousClass1.L$7;
            AdRequestKt.Dsl dsl6 = (AdRequestKt.Dsl) anonymousClass1.L$6;
            AdRequestKt.Dsl dsl7 = (AdRequestKt.Dsl) anonymousClass1.L$5;
            LoadConfigurationInternal loadConfigurationInternal4 = (LoadConfigurationInternal) anonymousClass1.L$4;
            bannerSize2 = (AdRequestOuterClass.BannerSize) anonymousClass1.L$3;
            ByteString byteString3 = (ByteString) anonymousClass1.L$2;
            String str3 = (String) anonymousClass1.L$1;
            androidGetAdRequest = (AndroidGetAdRequest) anonymousClass1.L$0;
            t9.e.z(obj);
            objStaticDeviceInfo = obj;
            dsl_create = dsl6;
            dsl2 = dsl7;
            str2 = str3;
            loadConfigurationInternal2 = loadConfigurationInternal4;
            byteString2 = byteString3;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            dsl5 = (AdRequestKt.Dsl) anonymousClass1.L$5;
            dsl3 = (AdRequestKt.Dsl) anonymousClass1.L$4;
            dsl4 = (AdRequestKt.Dsl) anonymousClass1.L$3;
            loadConfigurationInternal3 = (LoadConfigurationInternal) anonymousClass1.L$2;
            bannerSize3 = (AdRequestOuterClass.BannerSize) anonymousClass1.L$1;
            androidGetAdRequest2 = (AndroidGetAdRequest) anonymousClass1.L$0;
            t9.e.z(obj);
        }
        dsl5.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) obj).getVersion());
        dsl3.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
        if (bannerSize3 == null) {
            dsl3.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
        } else {
            dsl3.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
            dsl3.setBannerSize(bannerSize3);
        }
        tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl3.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        if (loadConfigurationInternal3 != null) {
            mediationAdUnitId = loadConfigurationInternal3.getMediationAdUnitId();
            if (mediationAdUnitId != null) {
                new q(dsl3) { // from class: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$request$1$2$2
                    @Override // qk.r
                    public Object get() {
                        return ((AdRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                    }

                    @Override // qk.j
                    public void set(Object obj2) {
                        ((AdRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj2);
                    }
                }.set(mediationAdUnitId);
            }
            dsl3.putAllExtras(dsl3.getExtrasMap(), loadConfigurationInternal3.getExtras());
        }
        AdRequestOuterClass.AdRequest adRequest_build = dsl4._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        n.e(builderNewBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setAdRequest(adRequest_build);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdRequest2.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.L$5 = null;
        anonymousClass1.label = 3;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
        if (objInvoke != aVar) {
            return aVar;
        }
        return objInvoke;
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl_create.setDynamicDeviceInfo(androidGetAdRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl_create.setImpressionOpportunityId(byteString2);
        dsl_create.setPlacementId(str2);
        dsl_create.setRequestImpressionConfiguration(true);
        WebviewConfigurationDataSource webviewConfigurationDataSource = androidGetAdRequest.webViewConfigurationDataSource;
        anonymousClass1.L$0 = androidGetAdRequest;
        anonymousClass1.L$1 = bannerSize2;
        anonymousClass1.L$2 = loadConfigurationInternal2;
        anonymousClass1.L$3 = dsl2;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.L$6 = null;
        anonymousClass1.L$7 = null;
        anonymousClass1.label = 2;
        Object obj2 = webviewConfigurationDataSource.get(anonymousClass1);
        if (obj2 != aVar) {
            dsl3 = dsl_create;
            bannerSize3 = bannerSize2;
            loadConfigurationInternal3 = loadConfigurationInternal2;
            dsl4 = dsl2;
            androidGetAdRequest2 = androidGetAdRequest;
            obj = obj2;
            dsl5 = dsl3;
            dsl5.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) obj).getVersion());
            dsl3.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
            if (bannerSize3 == null) {
                dsl3.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
            } else {
                dsl3.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                dsl3.setBannerSize(bannerSize3);
            }
            tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
            if (tcfString != null) {
                dsl3.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
            }
            if (loadConfigurationInternal3 != null) {
                mediationAdUnitId = loadConfigurationInternal3.getMediationAdUnitId();
                if (mediationAdUnitId != null) {
                    new q(dsl3) { // from class: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$request$1$2$2
                        @Override // qk.r
                        public Object get() {
                            return ((AdRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                        }

                        @Override // qk.j
                        public void set(Object obj3) {
                            ((AdRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj3);
                        }
                    }.set(mediationAdUnitId);
                }
                dsl3.putAllExtras(dsl3.getExtrasMap(), loadConfigurationInternal3.getExtras());
            }
            AdRequestOuterClass.AdRequest adRequest_build2 = dsl4._build();
            UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
            UniversalRequestKt.PayloadKt.Dsl.Companion companion3 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder3 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
            n.e(builderNewBuilder3, "newBuilder()");
            UniversalRequestKt.PayloadKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
            dsl_create3.setAdRequest(adRequest_build2);
            UniversalRequestOuterClass.UniversalRequest.Payload payload_build2 = dsl_create3._build();
            GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetAdRequest2.getUniversalRequestForPayLoad;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.L$5 = null;
            anonymousClass1.label = 3;
            objInvoke = getUniversalRequestForPayLoad2.invoke(payload_build2, anonymousClass1);
            if (objInvoke != aVar) {
                return objInvoke;
            }
        }
        return aVar;
    }
}
