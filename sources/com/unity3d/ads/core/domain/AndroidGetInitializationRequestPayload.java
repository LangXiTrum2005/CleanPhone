package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getClientInfo", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "mediationInitBlobMetadataReader", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "installReferrerDataSource", "<init>", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "invoke", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final InstallReferrerDataSource installReferrerDataSource;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE, 31, 39, 40, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE, 66, 81, InterfaceC0435l1.d.b.f29109f}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader, InstallReferrerDataSource installReferrerDataSource) {
        n.f(getClientInfo, "getClientInfo");
        n.f(sessionRepository, "sessionRepository");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(legacyUserConsentRepository, "legacyUserConsentRepository");
        n.f(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        n.f(installReferrerDataSource, "installReferrerDataSource");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0365  */
    /* JADX WARN: Code duplicated, block: B:103:0x0369  */
    /* JADX WARN: Code duplicated, block: B:106:0x036e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0379  */
    /* JADX WARN: Code duplicated, block: B:113:0x038d  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:121:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:124:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:144:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:33:0x0145  */
    /* JADX WARN: Code duplicated, block: B:41:0x017b  */
    /* JADX WARN: Code duplicated, block: B:44:0x018b  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x020c  */
    /* JADX WARN: Code duplicated, block: B:56:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x02cd A[PHI: r0 r1 r3 r4
  0x02cd: PHI (r0v52 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r0v49 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r0v54 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:61:0x02c9, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x02cd: PHI (r1v35 java.lang.Object) = (r1v34 java.lang.Object), (r1v1 java.lang.Object) binds: [B:61:0x02c9, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x02cd: PHI (r3v35 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r3v32 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r3v37 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:61:0x02c9, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x02cd: PHI (r4v14 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r4v11 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r4v16 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:61:0x02c9, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x02da  */
    /* JADX WARN: Code duplicated, block: B:71:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f3 A[PHI: r0 r1 r3 r4
  0x02f3: PHI (r0v55 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r0v52 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r0v57 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:73:0x02ef, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x02f3: PHI (r1v39 java.lang.Object) = (r1v38 java.lang.Object), (r1v1 java.lang.Object) binds: [B:73:0x02ef, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x02f3: PHI (r3v38 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r3v35 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r3v40 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:73:0x02ef, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x02f3: PHI (r4v17 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r4v14 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r4v19 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:73:0x02ef, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0312 A[PHI: r0 r1 r3 r4
  0x0312: PHI (r0v58 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r0v55 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r0v60 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:79:0x030e, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0312: PHI (r1v43 java.lang.Object) = (r1v42 java.lang.Object), (r1v1 java.lang.Object) binds: [B:79:0x030e, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0312: PHI (r3v41 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r3v38 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r3v43 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:79:0x030e, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0312: PHI (r4v20 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r4v17 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r4v22 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:79:0x030e, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x031a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0325  */
    /* JADX WARN: Code duplicated, block: B:89:0x0330  */
    /* JADX WARN: Code duplicated, block: B:92:0x033f  */
    /* JADX WARN: Code duplicated, block: B:96:0x035a A[PHI: r0 r1 r3 r4
  0x035a: PHI (r0v61 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r0v58 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r0v63 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:94:0x0356, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x035a: PHI (r1v55 java.lang.Object) = (r1v52 java.lang.Object), (r1v1 java.lang.Object) binds: [B:94:0x0356, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x035a: PHI (r3v44 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r3v41 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r3v46 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:94:0x0356, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x035a: PHI (r4v23 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r4v20 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r4v26 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:94:0x0356, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x035f  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    public Object invoke(f fVar) {
        AnonymousClass1 anonymousClass1;
        InitializationRequestKt.Dsl dsl_create;
        boolean z10;
        InitializationRequestKt.Dsl dsl;
        Object obj;
        InitializationRequestKt.Dsl dsl2;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload;
        InitializationRequestKt.Dsl dsl3;
        InitializationRequestKt.Dsl dsl4;
        String analyticsUserId;
        InitializationDeviceInfoKt.Dsl dsl_create2;
        InitializationRequestKt.Dsl dsl5;
        InitializationRequestKt.Dsl dsl6;
        InitializationRequestKt.Dsl dsl7;
        InitializationDeviceInfoKt.Dsl dsl8;
        InitializationDeviceInfoKt.Dsl dsl9;
        InitializationRequestKt.Dsl dsl10;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        InitializationRequestKt.Dsl dsl11;
        InitializationRequestKt.Dsl dsl12;
        InitializationDeviceInfoKt.Dsl dsl13;
        InitializationDeviceInfoKt.Dsl dsl14;
        final InitializationRequestKt.Dsl dsl15;
        InitializationRequestKt.Dsl dsl16;
        ByteString byteString;
        String str;
        boolean z11;
        ByteString byteString2;
        ByteString byteString3;
        String legacyFlowUserConsent;
        String unityInstallationId;
        String unityMegaSessionId;
        String str2;
        String str3;
        InitializationConfigurationInternal initializationConfiguration;
        InitializationRequestKt.Dsl dsl17;
        Object obj2;
        String str4;
        ByteString byteStringUtf8;
        Map<String, String> extras;
        String str5;
        ByteString byteStringUtf9;
        String userIdentifier;
        InitializationRequestOuterClass.InstallReferrer installReferrer;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3 = this;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = androidGetInitializationRequestPayload3.new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = androidGetInitializationRequestPayload3.new AnonymousClass1(fVar);
        }
        Object idfi = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        bk.a aVar = bk.a.f5708a;
        switch (i11) {
            case 0:
                t9.e.z(idfi);
                InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.INSTANCE;
                InitializationRequestOuterClass.InitializationRequest.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
                n.e(builderNewBuilder, "newBuilder()");
                dsl_create = companion._create(builderNewBuilder);
                Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                if (storage.readStorage()) {
                    Object obj3 = storage.get("configuration.hasInitialized");
                    Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                dsl_create.setIsFirstInit(!z10);
                GetClientInfo getClientInfo = androidGetInitializationRequestPayload3.getClientInfo;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl_create;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 1;
                Object objInvoke = getClientInfo.invoke(anonymousClass1);
                if (objInvoke != aVar) {
                    dsl = dsl_create;
                    obj = objInvoke;
                    dsl2 = dsl;
                    dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                    DeviceInfoRepository deviceInfoRepository = androidGetInitializationRequestPayload3.deviceInfoRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                    anonymousClass1.L$1 = dsl;
                    anonymousClass1.L$2 = dsl2;
                    anonymousClass1.L$3 = dsl2;
                    anonymousClass1.label = 2;
                    idfi = deviceInfoRepository.getIdfi(anonymousClass1);
                    if (idfi != aVar) {
                        androidGetInitializationRequestPayload = androidGetInitializationRequestPayload3;
                        dsl3 = dsl2;
                        dsl4 = dsl;
                        dsl3.setIdfi((String) idfi);
                        analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                        if (analyticsUserId != null) {
                            dsl2.setAnalyticsUserId(analyticsUserId);
                        }
                        dsl2.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                        InitializationDeviceInfoKt.Dsl.Companion companion2 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder2 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                        n.e(builderNewBuilder2, "newBuilder()");
                        dsl_create2 = companion2._create(builderNewBuilder2);
                        dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                        dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                        dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                        dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                        DeviceInfoRepository deviceInfoRepository2 = androidGetInitializationRequestPayload.deviceInfoRepository;
                        anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                        anonymousClass1.L$1 = dsl4;
                        anonymousClass1.L$2 = dsl2;
                        anonymousClass1.L$3 = dsl_create2;
                        anonymousClass1.L$4 = dsl2;
                        anonymousClass1.L$5 = dsl_create2;
                        anonymousClass1.L$6 = dsl_create2;
                        anonymousClass1.label = 3;
                        idfi = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                        if (idfi != aVar) {
                            dsl5 = dsl2;
                            dsl6 = dsl5;
                            dsl7 = dsl4;
                            dsl8 = dsl_create2;
                            dsl9 = dsl8;
                            dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalDiskSpace());
                            DeviceInfoRepository deviceInfoRepository3 = androidGetInitializationRequestPayload.deviceInfoRepository;
                            anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                            anonymousClass1.L$1 = dsl7;
                            anonymousClass1.L$2 = dsl6;
                            anonymousClass1.L$3 = dsl9;
                            anonymousClass1.L$4 = dsl5;
                            anonymousClass1.L$5 = dsl8;
                            anonymousClass1.L$6 = dsl8;
                            anonymousClass1.label = 4;
                            idfi = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                            if (idfi != aVar) {
                                InitializationDeviceInfoKt.Dsl dsl18 = dsl9;
                                dsl10 = dsl5;
                                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                                dsl11 = dsl7;
                                dsl12 = dsl6;
                                dsl13 = dsl18;
                                dsl14 = dsl8;
                                dsl14.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                                dsl8.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                                String networkOperator = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                                n.e(networkOperator, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                                dsl8.setNetworkOperator(networkOperator);
                                dsl8.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                                dsl8.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                                dsl8.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                                String language = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                                n.e(language, "deviceInfoRepository.dynamicDeviceInfo.language");
                                dsl8.setLanguage(language);
                                dsl8.setLocalList(xj.n.u0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                                dsl8.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                                dsl10.setDeviceInfo(dsl13._build());
                                DeviceInfoRepository deviceInfoRepository4 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                anonymousClass1.L$1 = dsl11;
                                anonymousClass1.L$2 = dsl12;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.L$5 = null;
                                anonymousClass1.L$6 = null;
                                anonymousClass1.label = 5;
                                idfi = deviceInfoRepository4.getAuidByteString(anonymousClass1);
                                if (idfi != aVar) {
                                    dsl15 = dsl12;
                                    dsl16 = dsl11;
                                    byteString = (ByteString) idfi;
                                    if (byteString != null) {
                                        dsl15.setAuid(byteString);
                                    }
                                    DeviceInfoRepository deviceInfoRepository5 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                    anonymousClass1.L$1 = dsl16;
                                    anonymousClass1.L$2 = dsl15;
                                    anonymousClass1.label = 6;
                                    idfi = deviceInfoRepository5.getAuidString(anonymousClass1);
                                    if (idfi != aVar) {
                                        str = (String) idfi;
                                        if (str != null || str.length() == 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!z11) {
                                            dsl15.setAuidString(str);
                                        }
                                        SessionRepository sessionRepository = androidGetInitializationRequestPayload2.sessionRepository;
                                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                        anonymousClass1.L$1 = dsl16;
                                        anonymousClass1.L$2 = dsl15;
                                        anonymousClass1.label = 7;
                                        idfi = sessionRepository.getPrivacy(anonymousClass1);
                                        if (idfi != aVar) {
                                            byteString2 = (ByteString) idfi;
                                            if (!byteString2.isEmpty()) {
                                                dsl15.setPrivacy(byteString2);
                                            }
                                            SessionRepository sessionRepository2 = androidGetInitializationRequestPayload2.sessionRepository;
                                            anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                            anonymousClass1.L$1 = dsl16;
                                            anonymousClass1.L$2 = dsl15;
                                            anonymousClass1.label = 8;
                                            idfi = sessionRepository2.getGatewayCache(anonymousClass1);
                                            if (idfi != aVar) {
                                                byteString3 = (ByteString) idfi;
                                                if (!byteString3.isEmpty()) {
                                                    dsl15.setCache(byteString3);
                                                }
                                                legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                                if (legacyFlowUserConsent != null) {
                                                    dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                                }
                                                unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                                                if (unityInstallationId != null) {
                                                    dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                                }
                                                unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                                                if (unityMegaSessionId != null) {
                                                    dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                                }
                                                DeviceInfoRepository deviceInfoRepository6 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                                anonymousClass1.L$1 = dsl16;
                                                anonymousClass1.L$2 = dsl15;
                                                anonymousClass1.label = 9;
                                                idfi = deviceInfoRepository6.getUnityBuildGuid(anonymousClass1);
                                                if (idfi != aVar) {
                                                    str2 = (String) idfi;
                                                    if (str2 != null || str2.length() == 0) {
                                                        idfi = null;
                                                    }
                                                    str3 = (String) idfi;
                                                    if (str3 != null) {
                                                        dsl15.setUnityBuildGuid(str3);
                                                    }
                                                    initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                                                    if (initializationConfiguration != null && (extras = initializationConfiguration.getExtras()) != null) {
                                                        LinkedHashMap linkedHashMapY = b0.Y(extras);
                                                        str5 = (String) linkedHashMapY.remove(BLOB_EXTRA_KEY);
                                                        if (str5 != null && (byteStringUtf9 = ByteStringsKt.toByteStringUtf8(str5)) != null) {
                                                            new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                                @Override // qk.r
                                                                public Object get() {
                                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                                }

                                                                @Override // qk.j
                                                                public void set(Object obj4) {
                                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                                }
                                                            }.set(byteStringUtf9);
                                                        }
                                                        dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY);
                                                    }
                                                    if (!dsl15.hasUadsInitBlob()) {
                                                        MediationInitBlobMetadataReader mediationInitBlobMetadataReader = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                                                        obj2 = mediationInitBlobMetadataReader.getJsonStorage().get(mediationInitBlobMetadataReader.getKey());
                                                        if (obj2 == null) {
                                                            obj2 = null;
                                                        } else {
                                                            if (!(obj2 instanceof String)) {
                                                                obj2 = null;
                                                            }
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                        }
                                                        str4 = (String) obj2;
                                                        if (str4 != null && (byteStringUtf8 = ByteStringsKt.toByteStringUtf8(str4)) != null) {
                                                            new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                                @Override // qk.r
                                                                public Object get() {
                                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                                }

                                                                @Override // qk.j
                                                                public void set(Object obj4) {
                                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                                }
                                                            }.set(byteStringUtf8);
                                                        }
                                                    }
                                                    if (dsl15.getIsFirstInit()) {
                                                        InstallReferrerDataSource installReferrerDataSource = androidGetInitializationRequestPayload2.installReferrerDataSource;
                                                        anonymousClass1.L$0 = dsl16;
                                                        anonymousClass1.L$1 = dsl15;
                                                        anonymousClass1.L$2 = null;
                                                        anonymousClass1.label = 10;
                                                        idfi = installReferrerDataSource.invoke(anonymousClass1);
                                                        if (idfi != aVar) {
                                                            dsl17 = dsl16;
                                                            installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                                            if (installReferrer != null) {
                                                                dsl15.setInstallReferrer(installReferrer);
                                                            }
                                                            dsl16 = dsl17;
                                                        }
                                                    }
                                                    userIdentifier = UnityAds.getUserIdentifier();
                                                    if (userIdentifier != null) {
                                                        dsl15.setExternalUserIdentifier(userIdentifier);
                                                    }
                                                    return dsl16._build();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                InitializationRequestKt.Dsl dsl19 = (InitializationRequestKt.Dsl) anonymousClass1.L$3;
                dsl2 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                InitializationRequestKt.Dsl dsl20 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload4 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                dsl_create = dsl19;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload4;
                dsl = dsl20;
                obj = idfi;
                dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                DeviceInfoRepository deviceInfoRepository7 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl;
                anonymousClass1.L$2 = dsl2;
                anonymousClass1.L$3 = dsl2;
                anonymousClass1.label = 2;
                idfi = deviceInfoRepository7.getIdfi(anonymousClass1);
                if (idfi != aVar) {
                    androidGetInitializationRequestPayload = androidGetInitializationRequestPayload3;
                    dsl3 = dsl2;
                    dsl4 = dsl;
                    dsl3.setIdfi((String) idfi);
                    analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                    if (analyticsUserId != null) {
                        dsl2.setAnalyticsUserId(analyticsUserId);
                    }
                    dsl2.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                    InitializationDeviceInfoKt.Dsl.Companion companion3 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                    InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder3 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                    n.e(builderNewBuilder3, "newBuilder()");
                    dsl_create2 = companion3._create(builderNewBuilder3);
                    dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                    dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                    dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                    dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                    DeviceInfoRepository deviceInfoRepository8 = androidGetInitializationRequestPayload.deviceInfoRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                    anonymousClass1.L$1 = dsl4;
                    anonymousClass1.L$2 = dsl2;
                    anonymousClass1.L$3 = dsl_create2;
                    anonymousClass1.L$4 = dsl2;
                    anonymousClass1.L$5 = dsl_create2;
                    anonymousClass1.L$6 = dsl_create2;
                    anonymousClass1.label = 3;
                    idfi = deviceInfoRepository8.staticDeviceInfo(anonymousClass1);
                    if (idfi != aVar) {
                        dsl5 = dsl2;
                        dsl6 = dsl5;
                        dsl7 = dsl4;
                        dsl8 = dsl_create2;
                        dsl9 = dsl8;
                        dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalDiskSpace());
                        DeviceInfoRepository deviceInfoRepository9 = androidGetInitializationRequestPayload.deviceInfoRepository;
                        anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                        anonymousClass1.L$1 = dsl7;
                        anonymousClass1.L$2 = dsl6;
                        anonymousClass1.L$3 = dsl9;
                        anonymousClass1.L$4 = dsl5;
                        anonymousClass1.L$5 = dsl8;
                        anonymousClass1.L$6 = dsl8;
                        anonymousClass1.label = 4;
                        idfi = deviceInfoRepository9.staticDeviceInfo(anonymousClass1);
                        if (idfi != aVar) {
                            InitializationDeviceInfoKt.Dsl dsl110 = dsl9;
                            dsl10 = dsl5;
                            androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                            dsl11 = dsl7;
                            dsl12 = dsl6;
                            dsl13 = dsl110;
                            dsl14 = dsl8;
                            dsl14.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                            dsl8.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                            String networkOperator2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                            n.e(networkOperator2, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                            dsl8.setNetworkOperator(networkOperator2);
                            dsl8.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                            dsl8.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                            dsl8.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                            String language2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                            n.e(language2, "deviceInfoRepository.dynamicDeviceInfo.language");
                            dsl8.setLanguage(language2);
                            dsl8.setLocalList(xj.n.u0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                            dsl8.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                            dsl10.setDeviceInfo(dsl13._build());
                            DeviceInfoRepository deviceInfoRepository10 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                            anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                            anonymousClass1.L$1 = dsl11;
                            anonymousClass1.L$2 = dsl12;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.L$6 = null;
                            anonymousClass1.label = 5;
                            idfi = deviceInfoRepository10.getAuidByteString(anonymousClass1);
                            if (idfi != aVar) {
                                dsl15 = dsl12;
                                dsl16 = dsl11;
                                byteString = (ByteString) idfi;
                                if (byteString != null) {
                                    dsl15.setAuid(byteString);
                                }
                                DeviceInfoRepository deviceInfoRepository11 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                anonymousClass1.L$1 = dsl16;
                                anonymousClass1.L$2 = dsl15;
                                anonymousClass1.label = 6;
                                idfi = deviceInfoRepository11.getAuidString(anonymousClass1);
                                if (idfi != aVar) {
                                    str = (String) idfi;
                                    if (str != null) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (!z11) {
                                        dsl15.setAuidString(str);
                                    }
                                    SessionRepository sessionRepository3 = androidGetInitializationRequestPayload2.sessionRepository;
                                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                    anonymousClass1.L$1 = dsl16;
                                    anonymousClass1.L$2 = dsl15;
                                    anonymousClass1.label = 7;
                                    idfi = sessionRepository3.getPrivacy(anonymousClass1);
                                    if (idfi != aVar) {
                                        byteString2 = (ByteString) idfi;
                                        if (!byteString2.isEmpty()) {
                                            dsl15.setPrivacy(byteString2);
                                        }
                                        SessionRepository sessionRepository4 = androidGetInitializationRequestPayload2.sessionRepository;
                                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                        anonymousClass1.L$1 = dsl16;
                                        anonymousClass1.L$2 = dsl15;
                                        anonymousClass1.label = 8;
                                        idfi = sessionRepository4.getGatewayCache(anonymousClass1);
                                        if (idfi != aVar) {
                                            byteString3 = (ByteString) idfi;
                                            if (!byteString3.isEmpty()) {
                                                dsl15.setCache(byteString3);
                                            }
                                            legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                            if (legacyFlowUserConsent != null) {
                                                dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                            }
                                            unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                                            if (unityInstallationId != null) {
                                                dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                            }
                                            unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                                            if (unityMegaSessionId != null) {
                                                dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                            }
                                            DeviceInfoRepository deviceInfoRepository12 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                            anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                            anonymousClass1.L$1 = dsl16;
                                            anonymousClass1.L$2 = dsl15;
                                            anonymousClass1.label = 9;
                                            idfi = deviceInfoRepository12.getUnityBuildGuid(anonymousClass1);
                                            if (idfi != aVar) {
                                                str2 = (String) idfi;
                                                if (str2 != null || str2.length() == 0) {
                                                    idfi = null;
                                                }
                                                str3 = (String) idfi;
                                                if (str3 != null) {
                                                    dsl15.setUnityBuildGuid(str3);
                                                }
                                                initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                                                if (initializationConfiguration != null) {
                                                    LinkedHashMap linkedHashMapY2 = b0.Y(extras);
                                                    str5 = (String) linkedHashMapY2.remove(BLOB_EXTRA_KEY);
                                                    if (str5 != null) {
                                                        new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                            @Override // qk.r
                                                            public Object get() {
                                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                            }

                                                            @Override // qk.j
                                                            public void set(Object obj4) {
                                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                            }
                                                        }.set(byteStringUtf9);
                                                    }
                                                    dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY2);
                                                }
                                                if (!dsl15.hasUadsInitBlob()) {
                                                    MediationInitBlobMetadataReader mediationInitBlobMetadataReader2 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                                                    obj2 = mediationInitBlobMetadataReader2.getJsonStorage().get(mediationInitBlobMetadataReader2.getKey());
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    } else {
                                                        if (!(obj2 instanceof String)) {
                                                            obj2 = null;
                                                        }
                                                        if (obj2 == null) {
                                                            obj2 = null;
                                                        }
                                                    }
                                                    str4 = (String) obj2;
                                                    if (str4 != null) {
                                                        new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                            @Override // qk.r
                                                            public Object get() {
                                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                            }

                                                            @Override // qk.j
                                                            public void set(Object obj4) {
                                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                            }
                                                        }.set(byteStringUtf8);
                                                    }
                                                }
                                                if (dsl15.getIsFirstInit()) {
                                                    InstallReferrerDataSource installReferrerDataSource2 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                                                    anonymousClass1.L$0 = dsl16;
                                                    anonymousClass1.L$1 = dsl15;
                                                    anonymousClass1.L$2 = null;
                                                    anonymousClass1.label = 10;
                                                    idfi = installReferrerDataSource2.invoke(anonymousClass1);
                                                    if (idfi != aVar) {
                                                        dsl17 = dsl16;
                                                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                                        if (installReferrer != null) {
                                                            dsl15.setInstallReferrer(installReferrer);
                                                        }
                                                        dsl16 = dsl17;
                                                    }
                                                }
                                                userIdentifier = UnityAds.getUserIdentifier();
                                                if (userIdentifier != null) {
                                                    dsl15.setExternalUserIdentifier(userIdentifier);
                                                }
                                                return dsl16._build();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                dsl3 = (InitializationRequestKt.Dsl) anonymousClass1.L$3;
                dsl2 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl4 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload5 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                androidGetInitializationRequestPayload = androidGetInitializationRequestPayload5;
                dsl3.setIdfi((String) idfi);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl2.setAnalyticsUserId(analyticsUserId);
                }
                dsl2.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion4 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder4 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                n.e(builderNewBuilder4, "newBuilder()");
                dsl_create2 = companion4._create(builderNewBuilder4);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository13 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl2;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl2;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 3;
                idfi = deviceInfoRepository13.staticDeviceInfo(anonymousClass1);
                if (idfi != aVar) {
                    dsl5 = dsl2;
                    dsl6 = dsl5;
                    dsl7 = dsl4;
                    dsl8 = dsl_create2;
                    dsl9 = dsl8;
                    dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalDiskSpace());
                    DeviceInfoRepository deviceInfoRepository14 = androidGetInitializationRequestPayload.deviceInfoRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                    anonymousClass1.L$1 = dsl7;
                    anonymousClass1.L$2 = dsl6;
                    anonymousClass1.L$3 = dsl9;
                    anonymousClass1.L$4 = dsl5;
                    anonymousClass1.L$5 = dsl8;
                    anonymousClass1.L$6 = dsl8;
                    anonymousClass1.label = 4;
                    idfi = deviceInfoRepository14.staticDeviceInfo(anonymousClass1);
                    if (idfi != aVar) {
                        InitializationDeviceInfoKt.Dsl dsl111 = dsl9;
                        dsl10 = dsl5;
                        androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                        dsl11 = dsl7;
                        dsl12 = dsl6;
                        dsl13 = dsl111;
                        dsl14 = dsl8;
                        dsl14.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                        dsl8.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                        String networkOperator3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                        n.e(networkOperator3, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                        dsl8.setNetworkOperator(networkOperator3);
                        dsl8.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                        dsl8.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                        dsl8.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                        String language3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                        n.e(language3, "deviceInfoRepository.dynamicDeviceInfo.language");
                        dsl8.setLanguage(language3);
                        dsl8.setLocalList(xj.n.u0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                        dsl8.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                        dsl10.setDeviceInfo(dsl13._build());
                        DeviceInfoRepository deviceInfoRepository15 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                        anonymousClass1.L$1 = dsl11;
                        anonymousClass1.L$2 = dsl12;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.label = 5;
                        idfi = deviceInfoRepository15.getAuidByteString(anonymousClass1);
                        if (idfi != aVar) {
                            dsl15 = dsl12;
                            dsl16 = dsl11;
                            byteString = (ByteString) idfi;
                            if (byteString != null) {
                                dsl15.setAuid(byteString);
                            }
                            DeviceInfoRepository deviceInfoRepository16 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                            anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                            anonymousClass1.L$1 = dsl16;
                            anonymousClass1.L$2 = dsl15;
                            anonymousClass1.label = 6;
                            idfi = deviceInfoRepository16.getAuidString(anonymousClass1);
                            if (idfi != aVar) {
                                str = (String) idfi;
                                if (str != null) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                if (!z11) {
                                    dsl15.setAuidString(str);
                                }
                                SessionRepository sessionRepository5 = androidGetInitializationRequestPayload2.sessionRepository;
                                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                anonymousClass1.L$1 = dsl16;
                                anonymousClass1.L$2 = dsl15;
                                anonymousClass1.label = 7;
                                idfi = sessionRepository5.getPrivacy(anonymousClass1);
                                if (idfi != aVar) {
                                    byteString2 = (ByteString) idfi;
                                    if (!byteString2.isEmpty()) {
                                        dsl15.setPrivacy(byteString2);
                                    }
                                    SessionRepository sessionRepository6 = androidGetInitializationRequestPayload2.sessionRepository;
                                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                    anonymousClass1.L$1 = dsl16;
                                    anonymousClass1.L$2 = dsl15;
                                    anonymousClass1.label = 8;
                                    idfi = sessionRepository6.getGatewayCache(anonymousClass1);
                                    if (idfi != aVar) {
                                        byteString3 = (ByteString) idfi;
                                        if (!byteString3.isEmpty()) {
                                            dsl15.setCache(byteString3);
                                        }
                                        legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                        if (legacyFlowUserConsent != null) {
                                            dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                        }
                                        unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                                        if (unityInstallationId != null) {
                                            dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                        }
                                        unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                                        if (unityMegaSessionId != null) {
                                            dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                        }
                                        DeviceInfoRepository deviceInfoRepository17 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                        anonymousClass1.L$1 = dsl16;
                                        anonymousClass1.L$2 = dsl15;
                                        anonymousClass1.label = 9;
                                        idfi = deviceInfoRepository17.getUnityBuildGuid(anonymousClass1);
                                        if (idfi != aVar) {
                                            str2 = (String) idfi;
                                            if (str2 != null || str2.length() == 0) {
                                                idfi = null;
                                            }
                                            str3 = (String) idfi;
                                            if (str3 != null) {
                                                dsl15.setUnityBuildGuid(str3);
                                            }
                                            initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                                            if (initializationConfiguration != null) {
                                                LinkedHashMap linkedHashMapY3 = b0.Y(extras);
                                                str5 = (String) linkedHashMapY3.remove(BLOB_EXTRA_KEY);
                                                if (str5 != null) {
                                                    new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                        @Override // qk.r
                                                        public Object get() {
                                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                        }

                                                        @Override // qk.j
                                                        public void set(Object obj4) {
                                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                        }
                                                    }.set(byteStringUtf9);
                                                }
                                                dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY3);
                                            }
                                            if (!dsl15.hasUadsInitBlob()) {
                                                MediationInitBlobMetadataReader mediationInitBlobMetadataReader3 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                                                obj2 = mediationInitBlobMetadataReader3.getJsonStorage().get(mediationInitBlobMetadataReader3.getKey());
                                                if (obj2 == null) {
                                                    obj2 = null;
                                                } else {
                                                    if (!(obj2 instanceof String)) {
                                                        obj2 = null;
                                                    }
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                }
                                                str4 = (String) obj2;
                                                if (str4 != null) {
                                                    new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                        @Override // qk.r
                                                        public Object get() {
                                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                        }

                                                        @Override // qk.j
                                                        public void set(Object obj4) {
                                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                        }
                                                    }.set(byteStringUtf8);
                                                }
                                            }
                                            if (dsl15.getIsFirstInit()) {
                                                InstallReferrerDataSource installReferrerDataSource3 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                                                anonymousClass1.L$0 = dsl16;
                                                anonymousClass1.L$1 = dsl15;
                                                anonymousClass1.L$2 = null;
                                                anonymousClass1.label = 10;
                                                idfi = installReferrerDataSource3.invoke(anonymousClass1);
                                                if (idfi != aVar) {
                                                    dsl17 = dsl16;
                                                    installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                                    if (installReferrer != null) {
                                                        dsl15.setInstallReferrer(installReferrer);
                                                    }
                                                    dsl16 = dsl17;
                                                }
                                            }
                                            userIdentifier = UnityAds.getUserIdentifier();
                                            if (userIdentifier != null) {
                                                dsl15.setExternalUserIdentifier(userIdentifier);
                                            }
                                            return dsl16._build();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 3:
                dsl_create2 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl8 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                dsl5 = (InitializationRequestKt.Dsl) anonymousClass1.L$4;
                dsl9 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                dsl6 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl7 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository18 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl7;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl9;
                anonymousClass1.L$4 = dsl5;
                anonymousClass1.L$5 = dsl8;
                anonymousClass1.L$6 = dsl8;
                anonymousClass1.label = 4;
                idfi = deviceInfoRepository18.staticDeviceInfo(anonymousClass1);
                if (idfi != aVar) {
                    InitializationDeviceInfoKt.Dsl dsl112 = dsl9;
                    dsl10 = dsl5;
                    androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                    dsl11 = dsl7;
                    dsl12 = dsl6;
                    dsl13 = dsl112;
                    dsl14 = dsl8;
                    dsl14.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                    dsl8.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                    String networkOperator4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                    n.e(networkOperator4, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                    dsl8.setNetworkOperator(networkOperator4);
                    dsl8.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                    dsl8.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                    dsl8.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                    String language4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                    n.e(language4, "deviceInfoRepository.dynamicDeviceInfo.language");
                    dsl8.setLanguage(language4);
                    dsl8.setLocalList(xj.n.u0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                    dsl8.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                    dsl10.setDeviceInfo(dsl13._build());
                    DeviceInfoRepository deviceInfoRepository19 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                    anonymousClass1.L$1 = dsl11;
                    anonymousClass1.L$2 = dsl12;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.L$6 = null;
                    anonymousClass1.label = 5;
                    idfi = deviceInfoRepository19.getAuidByteString(anonymousClass1);
                    if (idfi != aVar) {
                        dsl15 = dsl12;
                        dsl16 = dsl11;
                        byteString = (ByteString) idfi;
                        if (byteString != null) {
                            dsl15.setAuid(byteString);
                        }
                        DeviceInfoRepository deviceInfoRepository110 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                        anonymousClass1.L$1 = dsl16;
                        anonymousClass1.L$2 = dsl15;
                        anonymousClass1.label = 6;
                        idfi = deviceInfoRepository110.getAuidString(anonymousClass1);
                        if (idfi != aVar) {
                            str = (String) idfi;
                            if (str != null) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (!z11) {
                                dsl15.setAuidString(str);
                            }
                            SessionRepository sessionRepository7 = androidGetInitializationRequestPayload2.sessionRepository;
                            anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                            anonymousClass1.L$1 = dsl16;
                            anonymousClass1.L$2 = dsl15;
                            anonymousClass1.label = 7;
                            idfi = sessionRepository7.getPrivacy(anonymousClass1);
                            if (idfi != aVar) {
                                byteString2 = (ByteString) idfi;
                                if (!byteString2.isEmpty()) {
                                    dsl15.setPrivacy(byteString2);
                                }
                                SessionRepository sessionRepository8 = androidGetInitializationRequestPayload2.sessionRepository;
                                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                anonymousClass1.L$1 = dsl16;
                                anonymousClass1.L$2 = dsl15;
                                anonymousClass1.label = 8;
                                idfi = sessionRepository8.getGatewayCache(anonymousClass1);
                                if (idfi != aVar) {
                                    byteString3 = (ByteString) idfi;
                                    if (!byteString3.isEmpty()) {
                                        dsl15.setCache(byteString3);
                                    }
                                    legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                    if (legacyFlowUserConsent != null) {
                                        dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                    }
                                    unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                                    if (unityInstallationId != null) {
                                        dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                    }
                                    unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                                    if (unityMegaSessionId != null) {
                                        dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                    }
                                    DeviceInfoRepository deviceInfoRepository111 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                    anonymousClass1.L$1 = dsl16;
                                    anonymousClass1.L$2 = dsl15;
                                    anonymousClass1.label = 9;
                                    idfi = deviceInfoRepository111.getUnityBuildGuid(anonymousClass1);
                                    if (idfi != aVar) {
                                        str2 = (String) idfi;
                                        if (str2 != null || str2.length() == 0) {
                                            idfi = null;
                                        }
                                        str3 = (String) idfi;
                                        if (str3 != null) {
                                            dsl15.setUnityBuildGuid(str3);
                                        }
                                        initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                                        if (initializationConfiguration != null) {
                                            LinkedHashMap linkedHashMapY4 = b0.Y(extras);
                                            str5 = (String) linkedHashMapY4.remove(BLOB_EXTRA_KEY);
                                            if (str5 != null) {
                                                new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                    @Override // qk.r
                                                    public Object get() {
                                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                    }

                                                    @Override // qk.j
                                                    public void set(Object obj4) {
                                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                    }
                                                }.set(byteStringUtf9);
                                            }
                                            dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY4);
                                        }
                                        if (!dsl15.hasUadsInitBlob()) {
                                            MediationInitBlobMetadataReader mediationInitBlobMetadataReader4 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                                            obj2 = mediationInitBlobMetadataReader4.getJsonStorage().get(mediationInitBlobMetadataReader4.getKey());
                                            if (obj2 == null) {
                                                obj2 = null;
                                            } else {
                                                if (!(obj2 instanceof String)) {
                                                    obj2 = null;
                                                }
                                                if (obj2 == null) {
                                                    obj2 = null;
                                                }
                                            }
                                            str4 = (String) obj2;
                                            if (str4 != null) {
                                                new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                    @Override // qk.r
                                                    public Object get() {
                                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                    }

                                                    @Override // qk.j
                                                    public void set(Object obj4) {
                                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                    }
                                                }.set(byteStringUtf8);
                                            }
                                        }
                                        if (dsl15.getIsFirstInit()) {
                                            InstallReferrerDataSource installReferrerDataSource4 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                                            anonymousClass1.L$0 = dsl16;
                                            anonymousClass1.L$1 = dsl15;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.label = 10;
                                            idfi = installReferrerDataSource4.invoke(anonymousClass1);
                                            if (idfi != aVar) {
                                                dsl17 = dsl16;
                                                installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                                if (installReferrer != null) {
                                                    dsl15.setInstallReferrer(installReferrer);
                                                }
                                                dsl16 = dsl17;
                                            }
                                        }
                                        userIdentifier = UnityAds.getUserIdentifier();
                                        if (userIdentifier != null) {
                                            dsl15.setExternalUserIdentifier(userIdentifier);
                                        }
                                        return dsl16._build();
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 4:
                dsl14 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl8 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                InitializationRequestKt.Dsl dsl21 = (InitializationRequestKt.Dsl) anonymousClass1.L$4;
                InitializationDeviceInfoKt.Dsl dsl22 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                InitializationRequestKt.Dsl dsl23 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                InitializationRequestKt.Dsl dsl24 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload6 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                dsl10 = dsl21;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload6;
                dsl11 = dsl24;
                dsl12 = dsl23;
                dsl13 = dsl22;
                dsl14.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) idfi).getTotalRamMemory());
                dsl8.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator5 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                n.e(networkOperator5, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl8.setNetworkOperator(networkOperator5);
                dsl8.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl8.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl8.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language5 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                n.e(language5, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl8.setLanguage(language5);
                dsl8.setLocalList(xj.n.u0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                dsl8.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl10.setDeviceInfo(dsl13._build());
                DeviceInfoRepository deviceInfoRepository112 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl11;
                anonymousClass1.L$2 = dsl12;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                idfi = deviceInfoRepository112.getAuidByteString(anonymousClass1);
                if (idfi != aVar) {
                    dsl15 = dsl12;
                    dsl16 = dsl11;
                    byteString = (ByteString) idfi;
                    if (byteString != null) {
                        dsl15.setAuid(byteString);
                    }
                    DeviceInfoRepository deviceInfoRepository113 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                    anonymousClass1.L$1 = dsl16;
                    anonymousClass1.L$2 = dsl15;
                    anonymousClass1.label = 6;
                    idfi = deviceInfoRepository113.getAuidString(anonymousClass1);
                    if (idfi != aVar) {
                        str = (String) idfi;
                        if (str != null) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            dsl15.setAuidString(str);
                        }
                        SessionRepository sessionRepository9 = androidGetInitializationRequestPayload2.sessionRepository;
                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                        anonymousClass1.L$1 = dsl16;
                        anonymousClass1.L$2 = dsl15;
                        anonymousClass1.label = 7;
                        idfi = sessionRepository9.getPrivacy(anonymousClass1);
                        if (idfi != aVar) {
                            byteString2 = (ByteString) idfi;
                            if (!byteString2.isEmpty()) {
                                dsl15.setPrivacy(byteString2);
                            }
                            SessionRepository sessionRepository10 = androidGetInitializationRequestPayload2.sessionRepository;
                            anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                            anonymousClass1.L$1 = dsl16;
                            anonymousClass1.L$2 = dsl15;
                            anonymousClass1.label = 8;
                            idfi = sessionRepository10.getGatewayCache(anonymousClass1);
                            if (idfi != aVar) {
                                byteString3 = (ByteString) idfi;
                                if (!byteString3.isEmpty()) {
                                    dsl15.setCache(byteString3);
                                }
                                legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                if (legacyFlowUserConsent != null) {
                                    dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                }
                                unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                                if (unityInstallationId != null) {
                                    dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                }
                                unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                                if (unityMegaSessionId != null) {
                                    dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                }
                                DeviceInfoRepository deviceInfoRepository114 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                                anonymousClass1.L$1 = dsl16;
                                anonymousClass1.L$2 = dsl15;
                                anonymousClass1.label = 9;
                                idfi = deviceInfoRepository114.getUnityBuildGuid(anonymousClass1);
                                if (idfi != aVar) {
                                    str2 = (String) idfi;
                                    if (str2 != null || str2.length() == 0) {
                                        idfi = null;
                                    }
                                    str3 = (String) idfi;
                                    if (str3 != null) {
                                        dsl15.setUnityBuildGuid(str3);
                                    }
                                    initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                                    if (initializationConfiguration != null) {
                                        LinkedHashMap linkedHashMapY5 = b0.Y(extras);
                                        str5 = (String) linkedHashMapY5.remove(BLOB_EXTRA_KEY);
                                        if (str5 != null) {
                                            new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                                @Override // qk.r
                                                public Object get() {
                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                }

                                                @Override // qk.j
                                                public void set(Object obj4) {
                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                }
                                            }.set(byteStringUtf9);
                                        }
                                        dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY5);
                                    }
                                    if (!dsl15.hasUadsInitBlob()) {
                                        MediationInitBlobMetadataReader mediationInitBlobMetadataReader5 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                                        obj2 = mediationInitBlobMetadataReader5.getJsonStorage().get(mediationInitBlobMetadataReader5.getKey());
                                        if (obj2 == null) {
                                            obj2 = null;
                                        } else {
                                            if (!(obj2 instanceof String)) {
                                                obj2 = null;
                                            }
                                            if (obj2 == null) {
                                                obj2 = null;
                                            }
                                        }
                                        str4 = (String) obj2;
                                        if (str4 != null) {
                                            new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                                @Override // qk.r
                                                public Object get() {
                                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                                }

                                                @Override // qk.j
                                                public void set(Object obj4) {
                                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                                }
                                            }.set(byteStringUtf8);
                                        }
                                    }
                                    if (dsl15.getIsFirstInit()) {
                                        InstallReferrerDataSource installReferrerDataSource5 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                                        anonymousClass1.L$0 = dsl16;
                                        anonymousClass1.L$1 = dsl15;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.label = 10;
                                        idfi = installReferrerDataSource5.invoke(anonymousClass1);
                                        if (idfi != aVar) {
                                            dsl17 = dsl16;
                                            installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                            if (installReferrer != null) {
                                                dsl15.setInstallReferrer(installReferrer);
                                            }
                                            dsl16 = dsl17;
                                        }
                                    }
                                    userIdentifier = UnityAds.getUserIdentifier();
                                    if (userIdentifier != null) {
                                        dsl15.setExternalUserIdentifier(userIdentifier);
                                    }
                                    return dsl16._build();
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 5:
                dsl15 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl16 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                byteString = (ByteString) idfi;
                if (byteString != null) {
                    dsl15.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository115 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl16;
                anonymousClass1.L$2 = dsl15;
                anonymousClass1.label = 6;
                idfi = deviceInfoRepository115.getAuidString(anonymousClass1);
                if (idfi != aVar) {
                    str = (String) idfi;
                    if (str != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        dsl15.setAuidString(str);
                    }
                    SessionRepository sessionRepository11 = androidGetInitializationRequestPayload2.sessionRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                    anonymousClass1.L$1 = dsl16;
                    anonymousClass1.L$2 = dsl15;
                    anonymousClass1.label = 7;
                    idfi = sessionRepository11.getPrivacy(anonymousClass1);
                    if (idfi != aVar) {
                        byteString2 = (ByteString) idfi;
                        if (!byteString2.isEmpty()) {
                            dsl15.setPrivacy(byteString2);
                        }
                        SessionRepository sessionRepository12 = androidGetInitializationRequestPayload2.sessionRepository;
                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                        anonymousClass1.L$1 = dsl16;
                        anonymousClass1.L$2 = dsl15;
                        anonymousClass1.label = 8;
                        idfi = sessionRepository12.getGatewayCache(anonymousClass1);
                        if (idfi != aVar) {
                            byteString3 = (ByteString) idfi;
                            if (!byteString3.isEmpty()) {
                                dsl15.setCache(byteString3);
                            }
                            legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                            if (legacyFlowUserConsent != null) {
                                dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                            }
                            unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                            if (unityInstallationId != null) {
                                dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                            }
                            unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                            if (unityMegaSessionId != null) {
                                dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                            }
                            DeviceInfoRepository deviceInfoRepository116 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                            anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                            anonymousClass1.L$1 = dsl16;
                            anonymousClass1.L$2 = dsl15;
                            anonymousClass1.label = 9;
                            idfi = deviceInfoRepository116.getUnityBuildGuid(anonymousClass1);
                            if (idfi != aVar) {
                                str2 = (String) idfi;
                                if (str2 != null || str2.length() == 0) {
                                    idfi = null;
                                }
                                str3 = (String) idfi;
                                if (str3 != null) {
                                    dsl15.setUnityBuildGuid(str3);
                                }
                                initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                                if (initializationConfiguration != null) {
                                    LinkedHashMap linkedHashMapY6 = b0.Y(extras);
                                    str5 = (String) linkedHashMapY6.remove(BLOB_EXTRA_KEY);
                                    if (str5 != null) {
                                        new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                            @Override // qk.r
                                            public Object get() {
                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                            }

                                            @Override // qk.j
                                            public void set(Object obj4) {
                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                            }
                                        }.set(byteStringUtf9);
                                    }
                                    dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY6);
                                }
                                if (!dsl15.hasUadsInitBlob()) {
                                    MediationInitBlobMetadataReader mediationInitBlobMetadataReader6 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                                    obj2 = mediationInitBlobMetadataReader6.getJsonStorage().get(mediationInitBlobMetadataReader6.getKey());
                                    if (obj2 == null) {
                                        obj2 = null;
                                    } else {
                                        if (!(obj2 instanceof String)) {
                                            obj2 = null;
                                        }
                                        if (obj2 == null) {
                                            obj2 = null;
                                        }
                                    }
                                    str4 = (String) obj2;
                                    if (str4 != null) {
                                        new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                            @Override // qk.r
                                            public Object get() {
                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                            }

                                            @Override // qk.j
                                            public void set(Object obj4) {
                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                            }
                                        }.set(byteStringUtf8);
                                    }
                                }
                                if (dsl15.getIsFirstInit()) {
                                    InstallReferrerDataSource installReferrerDataSource6 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                                    anonymousClass1.L$0 = dsl16;
                                    anonymousClass1.L$1 = dsl15;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.label = 10;
                                    idfi = installReferrerDataSource6.invoke(anonymousClass1);
                                    if (idfi != aVar) {
                                        dsl17 = dsl16;
                                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                        if (installReferrer != null) {
                                            dsl15.setInstallReferrer(installReferrer);
                                        }
                                        dsl16 = dsl17;
                                    }
                                }
                                userIdentifier = UnityAds.getUserIdentifier();
                                if (userIdentifier != null) {
                                    dsl15.setExternalUserIdentifier(userIdentifier);
                                }
                                return dsl16._build();
                            }
                        }
                    }
                }
                return aVar;
            case 6:
                dsl15 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl16 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                str = (String) idfi;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dsl15.setAuidString(str);
                }
                SessionRepository sessionRepository13 = androidGetInitializationRequestPayload2.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl16;
                anonymousClass1.L$2 = dsl15;
                anonymousClass1.label = 7;
                idfi = sessionRepository13.getPrivacy(anonymousClass1);
                if (idfi != aVar) {
                    byteString2 = (ByteString) idfi;
                    if (!byteString2.isEmpty()) {
                        dsl15.setPrivacy(byteString2);
                    }
                    SessionRepository sessionRepository14 = androidGetInitializationRequestPayload2.sessionRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                    anonymousClass1.L$1 = dsl16;
                    anonymousClass1.L$2 = dsl15;
                    anonymousClass1.label = 8;
                    idfi = sessionRepository14.getGatewayCache(anonymousClass1);
                    if (idfi != aVar) {
                        byteString3 = (ByteString) idfi;
                        if (!byteString3.isEmpty()) {
                            dsl15.setCache(byteString3);
                        }
                        legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                            dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                        }
                        unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                            dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                        }
                        unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                            dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                        }
                        DeviceInfoRepository deviceInfoRepository117 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                        anonymousClass1.L$1 = dsl16;
                        anonymousClass1.L$2 = dsl15;
                        anonymousClass1.label = 9;
                        idfi = deviceInfoRepository117.getUnityBuildGuid(anonymousClass1);
                        if (idfi != aVar) {
                            str2 = (String) idfi;
                            if (str2 != null || str2.length() == 0) {
                                idfi = null;
                            }
                            str3 = (String) idfi;
                            if (str3 != null) {
                                dsl15.setUnityBuildGuid(str3);
                            }
                            initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                            if (initializationConfiguration != null) {
                                LinkedHashMap linkedHashMapY7 = b0.Y(extras);
                                str5 = (String) linkedHashMapY7.remove(BLOB_EXTRA_KEY);
                                if (str5 != null) {
                                    new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                        @Override // qk.r
                                        public Object get() {
                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                        }

                                        @Override // qk.j
                                        public void set(Object obj4) {
                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                        }
                                    }.set(byteStringUtf9);
                                }
                                dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY7);
                            }
                            if (!dsl15.hasUadsInitBlob()) {
                                MediationInitBlobMetadataReader mediationInitBlobMetadataReader7 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                                obj2 = mediationInitBlobMetadataReader7.getJsonStorage().get(mediationInitBlobMetadataReader7.getKey());
                                if (obj2 == null) {
                                    obj2 = null;
                                } else {
                                    if (!(obj2 instanceof String)) {
                                        obj2 = null;
                                    }
                                    if (obj2 == null) {
                                        obj2 = null;
                                    }
                                }
                                str4 = (String) obj2;
                                if (str4 != null) {
                                    new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                        @Override // qk.r
                                        public Object get() {
                                            return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                        }

                                        @Override // qk.j
                                        public void set(Object obj4) {
                                            ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                        }
                                    }.set(byteStringUtf8);
                                }
                            }
                            if (dsl15.getIsFirstInit()) {
                                InstallReferrerDataSource installReferrerDataSource7 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                                anonymousClass1.L$0 = dsl16;
                                anonymousClass1.L$1 = dsl15;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.label = 10;
                                idfi = installReferrerDataSource7.invoke(anonymousClass1);
                                if (idfi != aVar) {
                                    dsl17 = dsl16;
                                    installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                    if (installReferrer != null) {
                                        dsl15.setInstallReferrer(installReferrer);
                                    }
                                    dsl16 = dsl17;
                                }
                            }
                            userIdentifier = UnityAds.getUserIdentifier();
                            if (userIdentifier != null) {
                                dsl15.setExternalUserIdentifier(userIdentifier);
                            }
                            return dsl16._build();
                        }
                    }
                }
                return aVar;
            case 7:
                dsl15 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl16 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                byteString2 = (ByteString) idfi;
                if (!byteString2.isEmpty()) {
                    dsl15.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository15 = androidGetInitializationRequestPayload2.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl16;
                anonymousClass1.L$2 = dsl15;
                anonymousClass1.label = 8;
                idfi = sessionRepository15.getGatewayCache(anonymousClass1);
                if (idfi != aVar) {
                    byteString3 = (ByteString) idfi;
                    if (!byteString3.isEmpty()) {
                        dsl15.setCache(byteString3);
                    }
                    legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                    if (legacyFlowUserConsent != null) {
                        dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                    }
                    unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                    if (unityInstallationId != null) {
                        dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                    }
                    unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                    if (unityMegaSessionId != null) {
                        dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                    }
                    DeviceInfoRepository deviceInfoRepository118 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                    anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                    anonymousClass1.L$1 = dsl16;
                    anonymousClass1.L$2 = dsl15;
                    anonymousClass1.label = 9;
                    idfi = deviceInfoRepository118.getUnityBuildGuid(anonymousClass1);
                    if (idfi != aVar) {
                        str2 = (String) idfi;
                        if (str2 != null || str2.length() == 0) {
                            idfi = null;
                        }
                        str3 = (String) idfi;
                        if (str3 != null) {
                            dsl15.setUnityBuildGuid(str3);
                        }
                        initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null) {
                            LinkedHashMap linkedHashMapY8 = b0.Y(extras);
                            str5 = (String) linkedHashMapY8.remove(BLOB_EXTRA_KEY);
                            if (str5 != null) {
                                new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                    @Override // qk.r
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // qk.j
                                    public void set(Object obj4) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                    }
                                }.set(byteStringUtf9);
                            }
                            dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY8);
                        }
                        if (!dsl15.hasUadsInitBlob()) {
                            MediationInitBlobMetadataReader mediationInitBlobMetadataReader8 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                            obj2 = mediationInitBlobMetadataReader8.getJsonStorage().get(mediationInitBlobMetadataReader8.getKey());
                            if (obj2 == null) {
                                obj2 = null;
                            } else {
                                if (!(obj2 instanceof String)) {
                                    obj2 = null;
                                }
                                if (obj2 == null) {
                                    obj2 = null;
                                }
                            }
                            str4 = (String) obj2;
                            if (str4 != null) {
                                new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                    @Override // qk.r
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // qk.j
                                    public void set(Object obj4) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                    }
                                }.set(byteStringUtf8);
                            }
                        }
                        if (dsl15.getIsFirstInit()) {
                            InstallReferrerDataSource installReferrerDataSource8 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                            anonymousClass1.L$0 = dsl16;
                            anonymousClass1.L$1 = dsl15;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.label = 10;
                            idfi = installReferrerDataSource8.invoke(anonymousClass1);
                            if (idfi != aVar) {
                                dsl17 = dsl16;
                                installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                                if (installReferrer != null) {
                                    dsl15.setInstallReferrer(installReferrer);
                                }
                                dsl16 = dsl17;
                            }
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                            dsl15.setExternalUserIdentifier(userIdentifier);
                        }
                        return dsl16._build();
                    }
                }
                return aVar;
            case 8:
                dsl15 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl16 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                byteString3 = (ByteString) idfi;
                if (!byteString3.isEmpty()) {
                    dsl15.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload2.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl15.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload2.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl15.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload2.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl15.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository119 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl16;
                anonymousClass1.L$2 = dsl15;
                anonymousClass1.label = 9;
                idfi = deviceInfoRepository119.getUnityBuildGuid(anonymousClass1);
                if (idfi != aVar) {
                    str2 = (String) idfi;
                    if (str2 != null || str2.length() == 0) {
                        idfi = null;
                    }
                    str3 = (String) idfi;
                    if (str3 != null) {
                        dsl15.setUnityBuildGuid(str3);
                    }
                    initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                    if (initializationConfiguration != null) {
                        LinkedHashMap linkedHashMapY9 = b0.Y(extras);
                        str5 = (String) linkedHashMapY9.remove(BLOB_EXTRA_KEY);
                        if (str5 != null) {
                            new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                @Override // qk.r
                                public Object get() {
                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                }

                                @Override // qk.j
                                public void set(Object obj4) {
                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                }
                            }.set(byteStringUtf9);
                        }
                        dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY9);
                    }
                    if (!dsl15.hasUadsInitBlob()) {
                        MediationInitBlobMetadataReader mediationInitBlobMetadataReader9 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                        obj2 = mediationInitBlobMetadataReader9.getJsonStorage().get(mediationInitBlobMetadataReader9.getKey());
                        if (obj2 == null) {
                            obj2 = null;
                        } else {
                            if (!(obj2 instanceof String)) {
                                obj2 = null;
                            }
                            if (obj2 == null) {
                                obj2 = null;
                            }
                        }
                        str4 = (String) obj2;
                        if (str4 != null) {
                            new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                @Override // qk.r
                                public Object get() {
                                    return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                }

                                @Override // qk.j
                                public void set(Object obj4) {
                                    ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                }
                            }.set(byteStringUtf8);
                        }
                    }
                    if (dsl15.getIsFirstInit()) {
                        InstallReferrerDataSource installReferrerDataSource9 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                        anonymousClass1.L$0 = dsl16;
                        anonymousClass1.L$1 = dsl15;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.label = 10;
                        idfi = installReferrerDataSource9.invoke(anonymousClass1);
                        if (idfi != aVar) {
                            dsl17 = dsl16;
                            installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                            if (installReferrer != null) {
                                dsl15.setInstallReferrer(installReferrer);
                            }
                            dsl16 = dsl17;
                        }
                    }
                    userIdentifier = UnityAds.getUserIdentifier();
                    if (userIdentifier != null) {
                        dsl15.setExternalUserIdentifier(userIdentifier);
                    }
                    return dsl16._build();
                }
                return aVar;
            case 9:
                dsl15 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl16 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                t9.e.z(idfi);
                str2 = (String) idfi;
                if (str2 != null || str2.length() == 0) {
                    idfi = null;
                }
                str3 = (String) idfi;
                if (str3 != null) {
                    dsl15.setUnityBuildGuid(str3);
                }
                initializationConfiguration = androidGetInitializationRequestPayload2.sessionRepository.getInitializationConfiguration();
                if (initializationConfiguration != null) {
                    LinkedHashMap linkedHashMapY10 = b0.Y(extras);
                    str5 = (String) linkedHashMapY10.remove(BLOB_EXTRA_KEY);
                    if (str5 != null) {
                        new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                            @Override // qk.r
                            public Object get() {
                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                            }

                            @Override // qk.j
                            public void set(Object obj4) {
                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                            }
                        }.set(byteStringUtf9);
                    }
                    dsl15.putAllExtras(dsl15.getExtrasMap(), linkedHashMapY10);
                }
                if (!dsl15.hasUadsInitBlob()) {
                    MediationInitBlobMetadataReader mediationInitBlobMetadataReader10 = androidGetInitializationRequestPayload2.mediationInitBlobMetadataReader;
                    obj2 = mediationInitBlobMetadataReader10.getJsonStorage().get(mediationInitBlobMetadataReader10.getKey());
                    if (obj2 == null) {
                        obj2 = null;
                    } else {
                        if (!(obj2 instanceof String)) {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            obj2 = null;
                        }
                    }
                    str4 = (String) obj2;
                    if (str4 != null) {
                        new q(dsl15) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                            @Override // qk.r
                            public Object get() {
                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                            }

                            @Override // qk.j
                            public void set(Object obj4) {
                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                            }
                        }.set(byteStringUtf8);
                    }
                }
                if (dsl15.getIsFirstInit()) {
                    InstallReferrerDataSource installReferrerDataSource10 = androidGetInitializationRequestPayload2.installReferrerDataSource;
                    anonymousClass1.L$0 = dsl16;
                    anonymousClass1.L$1 = dsl15;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 10;
                    idfi = installReferrerDataSource10.invoke(anonymousClass1);
                    if (idfi != aVar) {
                        dsl17 = dsl16;
                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                        if (installReferrer != null) {
                            dsl15.setInstallReferrer(installReferrer);
                        }
                        dsl16 = dsl17;
                    }
                    return aVar;
                }
                userIdentifier = UnityAds.getUserIdentifier();
                if (userIdentifier != null) {
                    dsl15.setExternalUserIdentifier(userIdentifier);
                }
                return dsl16._build();
            case 10:
                dsl15 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                dsl17 = (InitializationRequestKt.Dsl) anonymousClass1.L$0;
                t9.e.z(idfi);
                installReferrer = (InitializationRequestOuterClass.InstallReferrer) idfi;
                if (installReferrer != null) {
                    dsl15.setInstallReferrer(installReferrer);
                }
                dsl16 = dsl17;
                userIdentifier = UnityAds.getUserIdentifier();
                if (userIdentifier != null) {
                    dsl15.setExternalUserIdentifier(userIdentifier);
                }
                return dsl16._build();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
