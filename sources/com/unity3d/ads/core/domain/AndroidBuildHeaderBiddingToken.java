package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.BannerSize;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0096Bø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidBuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "generateId", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getTimestamps", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "getInitializationData", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "tcfRepository", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "testDataInfo", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "mediationInfoConverter", "<init>", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/domain/GetInitializationData;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/repository/TcfRepository;Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/MediationInfoConverter;)V", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "", "scarSignalsCollected", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;ZLak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final MediationInfoConverter mediationInfoConverter;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", l = {45, 67, 72, 75, 77}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidBuildHeaderBiddingToken.this.invoke(0, null, false, this);
        }
    }

    public AndroidBuildHeaderBiddingToken(GetByteStringId generateId, GetClientInfo getClientInfo, GetSharedDataTimestamps getTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo testDataInfo, OfferwallManager offerwallManager, MediationInfoConverter mediationInfoConverter) {
        n.f(generateId, "generateId");
        n.f(getClientInfo, "getClientInfo");
        n.f(getTimestamps, "getTimestamps");
        n.f(getLimitedSessionToken, "getLimitedSessionToken");
        n.f(getInitializationData, "getInitializationData");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(sessionRepository, "sessionRepository");
        n.f(campaignRepository, "campaignRepository");
        n.f(tcfRepository, "tcfRepository");
        n.f(testDataInfo, "testDataInfo");
        n.f(offerwallManager, "offerwallManager");
        n.f(mediationInfoConverter, "mediationInfoConverter");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = testDataInfo;
        this.offerwallManager = offerwallManager;
        this.mediationInfoConverter = mediationInfoConverter;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x022e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0245  */
    /* JADX WARN: Code duplicated, block: B:67:0x0264  */
    /* JADX WARN: Code duplicated, block: B:69:0x026f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0289  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    public Object invoke(int i10, TokenConfiguration tokenConfiguration, boolean z10, f fVar) {
        AnonymousClass1 anonymousClass1;
        HeaderBiddingTokenKt.Dsl dsl_create;
        TokenConfiguration tokenConfiguration2;
        boolean z11;
        ByteString byteString;
        TokenCounters tokenCounters;
        HeaderBiddingTokenKt.Dsl dsl;
        HeaderBiddingTokenKt.Dsl dsl2;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken;
        HeaderBiddingTokenKt.Dsl dsl3;
        TokenCounters tokenCounters2;
        String gameId;
        HeaderBiddingTokenKt.Dsl dsl4;
        TokenCounters tokenCounters3;
        HeaderBiddingTokenKt.Dsl dsl5;
        HeaderBiddingTokenKt.Dsl dsl6;
        HeaderBiddingTokenKt.Dsl dsl7;
        HeaderBiddingTokenKt.Dsl dsl8;
        TokenCounters tokenCounters4;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken2;
        TestDataOuterClass.TestData testDataInvoke;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken3 = this;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = androidBuildHeaderBiddingToken3.new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = androidBuildHeaderBiddingToken3.new AnonymousClass1(fVar);
        }
        Object objIsConnected = anonymousClass1.result;
        int i12 = anonymousClass1.label;
        bk.a aVar = bk.a.f5708a;
        if (i12 == 0) {
            t9.e.z(objIsConnected);
            TokenCounters tokenCounters5 = androidBuildHeaderBiddingToken3.sessionRepository.getTokenCounters();
            ByteString sessionToken = androidBuildHeaderBiddingToken3.sessionRepository.getSessionToken();
            androidBuildHeaderBiddingToken3.sessionRepository.incrementTokenSequenceNumber();
            HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
            HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
            n.e(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            dsl_create.setTokenId(androidBuildHeaderBiddingToken3.generateId.invoke());
            dsl_create.setTokenNumber(i10);
            GetClientInfo getClientInfo = androidBuildHeaderBiddingToken3.getClientInfo;
            anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
            tokenConfiguration2 = tokenConfiguration;
            anonymousClass1.L$1 = tokenConfiguration2;
            anonymousClass1.L$2 = tokenCounters5;
            anonymousClass1.L$3 = sessionToken;
            anonymousClass1.L$4 = dsl_create;
            anonymousClass1.L$5 = dsl_create;
            anonymousClass1.L$6 = dsl_create;
            z11 = z10;
            anonymousClass1.Z$0 = z11;
            anonymousClass1.label = 1;
            Object objInvoke = getClientInfo.invoke(anonymousClass1);
            if (objInvoke != aVar) {
                byteString = sessionToken;
                objIsConnected = objInvoke;
                tokenCounters = tokenCounters5;
                dsl = dsl_create;
                dsl2 = dsl;
            }
            return aVar;
        }
        if (i12 == 1) {
            boolean z12 = anonymousClass1.Z$0;
            HeaderBiddingTokenKt.Dsl dsl9 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$6;
            HeaderBiddingTokenKt.Dsl dsl10 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$5;
            HeaderBiddingTokenKt.Dsl dsl11 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
            ByteString byteString2 = (ByteString) anonymousClass1.L$3;
            TokenCounters tokenCounters6 = (TokenCounters) anonymousClass1.L$2;
            TokenConfiguration tokenConfiguration3 = (TokenConfiguration) anonymousClass1.L$1;
            AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken4 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
            t9.e.z(objIsConnected);
            z11 = z12;
            androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken4;
            dsl = dsl9;
            dsl_create = dsl10;
            byteString = byteString2;
            dsl2 = dsl11;
            tokenConfiguration2 = tokenConfiguration3;
            tokenCounters = tokenCounters6;
        } else {
            if (i12 == 2) {
                dsl3 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$5;
                dsl_create = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                HeaderBiddingTokenKt.Dsl dsl12 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                byteString = (ByteString) anonymousClass1.L$2;
                tokenCounters2 = (TokenCounters) anonymousClass1.L$1;
                AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken5 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                t9.e.z(objIsConnected);
                dsl2 = dsl12;
                androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken5;
                dsl3.setOfferwallEnabled(((Boolean) objIsConnected).booleanValue());
                if (byteString.isEmpty()) {
                    gameId = androidBuildHeaderBiddingToken.sessionRepository.getGameId();
                    if (gameId != null || gameId.length() <= 0) {
                        GetLimitedSessionToken getLimitedSessionToken = androidBuildHeaderBiddingToken.getLimitedSessionToken;
                        anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                        anonymousClass1.L$1 = tokenCounters2;
                        anonymousClass1.L$2 = dsl2;
                        anonymousClass1.L$3 = dsl_create;
                        anonymousClass1.L$4 = dsl_create;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.label = 4;
                        objIsConnected = getLimitedSessionToken.invoke(anonymousClass1);
                        if (objIsConnected != aVar) {
                            dsl4 = dsl_create;
                            tokenCounters3 = tokenCounters2;
                            dsl5 = dsl2;
                            dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                            dsl7 = dsl_create;
                            dsl8 = dsl5;
                            tokenCounters4 = tokenCounters3;
                            DeviceInfoRepository deviceInfoRepository = androidBuildHeaderBiddingToken.deviceInfoRepository;
                            anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                            anonymousClass1.L$1 = tokenCounters4;
                            anonymousClass1.L$2 = dsl8;
                            anonymousClass1.L$3 = dsl7;
                            anonymousClass1.L$4 = dsl7;
                            anonymousClass1.label = 5;
                            objIsConnected = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
                            if (objIsConnected != aVar) {
                                dsl_create = dsl7;
                                androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                            }
                        }
                    } else {
                        GetInitializationData getInitializationData = androidBuildHeaderBiddingToken.getInitializationData;
                        anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                        anonymousClass1.L$1 = tokenCounters2;
                        anonymousClass1.L$2 = dsl2;
                        anonymousClass1.L$3 = dsl_create;
                        anonymousClass1.L$4 = dsl_create;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.label = 3;
                        objIsConnected = getInitializationData.invoke(anonymousClass1);
                        if (objIsConnected != aVar) {
                            dsl6 = dsl_create;
                            tokenCounters3 = tokenCounters2;
                            dsl5 = dsl2;
                            dsl6.setInitializationData((InitializationDataOuterClass.InitializationData) objIsConnected);
                            dsl7 = dsl_create;
                            dsl8 = dsl5;
                            tokenCounters4 = tokenCounters3;
                            DeviceInfoRepository deviceInfoRepository2 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                            anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                            anonymousClass1.L$1 = tokenCounters4;
                            anonymousClass1.L$2 = dsl8;
                            anonymousClass1.L$3 = dsl7;
                            anonymousClass1.L$4 = dsl7;
                            anonymousClass1.label = 5;
                            objIsConnected = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                            if (objIsConnected != aVar) {
                                dsl_create = dsl7;
                                androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                            }
                        }
                    }
                    return aVar;
                }
                dsl_create.setSessionToken(androidBuildHeaderBiddingToken.sessionRepository.getSessionToken());
                dsl_create.setStaticDeviceInfo(androidBuildHeaderBiddingToken.deviceInfoRepository.cachedStaticDeviceInfo());
                testDataInvoke = androidBuildHeaderBiddingToken.testDataInfo.invoke();
                if (testDataInvoke != null) {
                    dsl_create.setTestData(testDataInvoke);
                }
                TokenCountersKt.Dsl.Companion companion2 = TokenCountersKt.Dsl.INSTANCE;
                HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder2 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                n.e(builderNewBuilder2, "newBuilder()");
                TokenCountersKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
                dsl_create2.setSeq(tokenCounters2.getSeq());
                dsl_create2.setWins(tokenCounters2.getWins());
                dsl_create2.setStarts(tokenCounters2.getStarts());
                dsl_create.setTokenCounters(dsl_create2._build());
                return dsl2._build();
            }
            if (i12 == 3) {
                dsl6 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl_create = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl5 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                tokenCounters3 = (TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                t9.e.z(objIsConnected);
                dsl6.setInitializationData((InitializationDataOuterClass.InitializationData) objIsConnected);
                dsl7 = dsl_create;
                dsl8 = dsl5;
                tokenCounters4 = tokenCounters3;
                DeviceInfoRepository deviceInfoRepository3 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                anonymousClass1.L$1 = tokenCounters4;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.L$4 = dsl7;
                anonymousClass1.label = 5;
                objIsConnected = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                if (objIsConnected != aVar) {
                    dsl_create = dsl7;
                    androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                }
                return aVar;
            }
            if (i12 == 4) {
                dsl4 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl_create = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl5 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                tokenCounters3 = (TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                t9.e.z(objIsConnected);
                dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                dsl7 = dsl_create;
                dsl8 = dsl5;
                tokenCounters4 = tokenCounters3;
                DeviceInfoRepository deviceInfoRepository4 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                anonymousClass1.L$1 = tokenCounters4;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.L$4 = dsl7;
                anonymousClass1.label = 5;
                objIsConnected = deviceInfoRepository4.staticDeviceInfo(anonymousClass1);
                if (objIsConnected != aVar) {
                    dsl_create = dsl7;
                    androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                }
                return aVar;
            }
            if (i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl7 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
            dsl_create = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
            dsl8 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
            tokenCounters4 = (TokenCounters) anonymousClass1.L$1;
            androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
            t9.e.z(objIsConnected);
        }
        dsl7.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
        androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken2;
        dsl2 = dsl8;
        tokenCounters2 = tokenCounters4;
        testDataInvoke = androidBuildHeaderBiddingToken.testDataInfo.invoke();
        if (testDataInvoke != null) {
            dsl_create.setTestData(testDataInvoke);
        }
        TokenCountersKt.Dsl.Companion companion3 = TokenCountersKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder3 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        n.e(builderNewBuilder3, "newBuilder()");
        TokenCountersKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setSeq(tokenCounters2.getSeq());
        dsl_create3.setWins(tokenCounters2.getWins());
        dsl_create3.setStarts(tokenCounters2.getStarts());
        dsl_create.setTokenCounters(dsl_create3._build());
        return dsl2._build();
        dsl.setClientInfo((ClientInfoOuterClass.ClientInfo) objIsConnected);
        dsl_create.setTimestamps(androidBuildHeaderBiddingToken3.getTimestamps.invoke());
        if (tokenConfiguration2 != null) {
            dsl_create.setAdFormat(AdFormatExtensions.toProtoAdFormat(tokenConfiguration2.getAdFormat()));
            dsl_create.putAllExtras(dsl_create.getExtrasMap(), tokenConfiguration2.getExtras());
            MediationInfo mediationInfo = tokenConfiguration2.get_mediationInfo();
            if (mediationInfo != null) {
                dsl_create.setMediationInfo(androidBuildHeaderBiddingToken3.mediationInfoConverter.invoke(mediationInfo));
            }
            String str = tokenConfiguration2.get_placementId();
            if (str != null) {
                dsl_create.setPlacementId(str);
            }
            String str2 = tokenConfiguration2.get_mediationAdUnitId();
            if (str2 != null) {
                dsl_create.setMediationAdUnitId(str2);
            }
            BannerSize bannerSize = tokenConfiguration2.get_bannerSize();
            if (bannerSize != null) {
                BannerSizeKt.Dsl.Companion companion4 = BannerSizeKt.Dsl.INSTANCE;
                AdRequestOuterClass.BannerSize.Builder builderNewBuilder4 = AdRequestOuterClass.BannerSize.newBuilder();
                n.e(builderNewBuilder4, "newBuilder()");
                BannerSizeKt.Dsl dsl_create4 = companion4._create(builderNewBuilder4);
                dsl_create4.setWidth(bannerSize.getWidth());
                dsl_create4.setHeight(bannerSize.getHeight());
                dsl_create.setBannerSize(dsl_create4._build());
            }
        }
        dsl_create.setSessionCounters(androidBuildHeaderBiddingToken3.sessionRepository.getSessionCounters());
        dsl_create.setDynamicDeviceInfo(androidBuildHeaderBiddingToken3.deviceInfoRepository.getDynamicDeviceInfo());
        dsl_create.setPii(androidBuildHeaderBiddingToken3.deviceInfoRepository.getPiiData());
        dsl_create.setCampaignState(androidBuildHeaderBiddingToken3.campaignRepository.getCampaignState());
        String tcfString = androidBuildHeaderBiddingToken3.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl_create.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        dsl_create.setScarSignalsCollected(z11);
        OfferwallManager offerwallManager = androidBuildHeaderBiddingToken3.offerwallManager;
        anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
        anonymousClass1.L$1 = tokenCounters;
        anonymousClass1.L$2 = byteString;
        anonymousClass1.L$3 = dsl2;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.L$6 = null;
        anonymousClass1.label = 2;
        objIsConnected = offerwallManager.isConnected(anonymousClass1);
        if (objIsConnected != aVar) {
            androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken3;
            dsl3 = dsl_create;
            tokenCounters2 = tokenCounters;
            dsl3.setOfferwallEnabled(((Boolean) objIsConnected).booleanValue());
            if (byteString.isEmpty()) {
                gameId = androidBuildHeaderBiddingToken.sessionRepository.getGameId();
                if (gameId != null) {
                    GetLimitedSessionToken getLimitedSessionToken2 = androidBuildHeaderBiddingToken.getLimitedSessionToken;
                    anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                    anonymousClass1.L$1 = tokenCounters2;
                    anonymousClass1.L$2 = dsl2;
                    anonymousClass1.L$3 = dsl_create;
                    anonymousClass1.L$4 = dsl_create;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.label = 4;
                    objIsConnected = getLimitedSessionToken2.invoke(anonymousClass1);
                    if (objIsConnected != aVar) {
                        dsl4 = dsl_create;
                        tokenCounters3 = tokenCounters2;
                        dsl5 = dsl2;
                        dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                        dsl7 = dsl_create;
                        dsl8 = dsl5;
                        tokenCounters4 = tokenCounters3;
                        DeviceInfoRepository deviceInfoRepository5 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                        anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                        anonymousClass1.L$1 = tokenCounters4;
                        anonymousClass1.L$2 = dsl8;
                        anonymousClass1.L$3 = dsl7;
                        anonymousClass1.L$4 = dsl7;
                        anonymousClass1.label = 5;
                        objIsConnected = deviceInfoRepository5.staticDeviceInfo(anonymousClass1);
                        if (objIsConnected != aVar) {
                            dsl_create = dsl7;
                            androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                            dsl7.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
                            androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken2;
                            dsl2 = dsl8;
                            tokenCounters2 = tokenCounters4;
                        }
                    }
                } else {
                    GetLimitedSessionToken getLimitedSessionToken3 = androidBuildHeaderBiddingToken.getLimitedSessionToken;
                    anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                    anonymousClass1.L$1 = tokenCounters2;
                    anonymousClass1.L$2 = dsl2;
                    anonymousClass1.L$3 = dsl_create;
                    anonymousClass1.L$4 = dsl_create;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.label = 4;
                    objIsConnected = getLimitedSessionToken3.invoke(anonymousClass1);
                    if (objIsConnected != aVar) {
                        dsl4 = dsl_create;
                        tokenCounters3 = tokenCounters2;
                        dsl5 = dsl2;
                        dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                        dsl7 = dsl_create;
                        dsl8 = dsl5;
                        tokenCounters4 = tokenCounters3;
                        DeviceInfoRepository deviceInfoRepository6 = androidBuildHeaderBiddingToken.deviceInfoRepository;
                        anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                        anonymousClass1.L$1 = tokenCounters4;
                        anonymousClass1.L$2 = dsl8;
                        anonymousClass1.L$3 = dsl7;
                        anonymousClass1.L$4 = dsl7;
                        anonymousClass1.label = 5;
                        objIsConnected = deviceInfoRepository6.staticDeviceInfo(anonymousClass1);
                        if (objIsConnected != aVar) {
                            dsl_create = dsl7;
                            androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                            dsl7.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
                            androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken2;
                            dsl2 = dsl8;
                            tokenCounters2 = tokenCounters4;
                        }
                    }
                }
            } else {
                dsl_create.setSessionToken(androidBuildHeaderBiddingToken.sessionRepository.getSessionToken());
                dsl_create.setStaticDeviceInfo(androidBuildHeaderBiddingToken.deviceInfoRepository.cachedStaticDeviceInfo());
            }
            testDataInvoke = androidBuildHeaderBiddingToken.testDataInfo.invoke();
            if (testDataInvoke != null) {
                dsl_create.setTestData(testDataInvoke);
            }
            TokenCountersKt.Dsl.Companion companion5 = TokenCountersKt.Dsl.INSTANCE;
            HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder5 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
            n.e(builderNewBuilder5, "newBuilder()");
            TokenCountersKt.Dsl dsl_create5 = companion5._create(builderNewBuilder5);
            dsl_create5.setSeq(tokenCounters2.getSeq());
            dsl_create5.setWins(tokenCounters2.getWins());
            dsl_create5.setStarts(tokenCounters2.getStarts());
            dsl_create.setTokenCounters(dsl_create5._build());
            return dsl2._build();
        }
        return aVar;
    }
}
