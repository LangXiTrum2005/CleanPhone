package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "invoke", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken", f = "AndroidGetLimitedSessionToken.kt", l = {19, 20, 21, 22}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetLimitedSessionToken.this.invoke(this);
        }
    }

    public AndroidGetLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(sessionRepository, "sessionRepository");
        n.f(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0108  */
    /* JADX WARN: Code duplicated, block: B:35:0x012d  */
    /* JADX WARN: Code duplicated, block: B:38:0x014a  */
    /* JADX WARN: Code duplicated, block: B:46:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    public Object invoke(f fVar) {
        AnonymousClass1 anonymousClass1;
        LimitedSessionTokenKt.Dsl dsl_create;
        Object objStaticDeviceInfo;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken;
        LimitedSessionTokenKt.Dsl dsl;
        LimitedSessionTokenKt.Dsl dsl2;
        Object obj;
        LimitedSessionTokenKt.Dsl dsl3;
        LimitedSessionTokenKt.Dsl dsl4;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken2;
        Object objStaticDeviceInfo2;
        Object obj2;
        LimitedSessionTokenKt.Dsl dsl5;
        LimitedSessionTokenKt.Dsl dsl6;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken3;
        Object idfi;
        LimitedSessionTokenKt.Dsl dsl7;
        LimitedSessionTokenKt.Dsl dsl8;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken4;
        LimitedSessionTokenKt.Dsl dsl9;
        String gameId;
        String name;
        String version;
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
        Object obj3 = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(obj3);
            LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
            n.e(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            dsl_create.setSessionId(this.sessionRepository.getSessionId());
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = dsl_create;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo != aVar) {
                androidGetLimitedSessionToken = this;
                dsl = dsl_create;
                dsl2 = dsl;
            }
            return aVar;
        }
        if (i11 == 1) {
            dsl = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
            LimitedSessionTokenKt.Dsl dsl10 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
            dsl2 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
            androidGetLimitedSessionToken = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
            t9.e.z(obj3);
            objStaticDeviceInfo = obj3;
            dsl_create = dsl10;
        } else {
            if (i11 == 2) {
                dsl3 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                LimitedSessionTokenKt.Dsl dsl11 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl4 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken2 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                t9.e.z(obj3);
                obj = obj3;
                dsl_create = dsl11;
                String deviceModel = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
                n.e(deviceModel, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
                dsl3.setDeviceModel(deviceModel);
                DeviceInfoRepository deviceInfoRepository2 = androidGetLimitedSessionToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 3;
                objStaticDeviceInfo2 = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                if (objStaticDeviceInfo2 != aVar) {
                    obj2 = objStaticDeviceInfo2;
                    dsl5 = dsl_create;
                    dsl6 = dsl4;
                    androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                    String osVersion = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2).getOsVersion();
                    n.e(osVersion, "deviceInfoRepository.staticDeviceInfo().osVersion");
                    dsl5.setOsVersion(osVersion);
                    DeviceInfoRepository deviceInfoRepository3 = androidGetLimitedSessionToken3.deviceInfoRepository;
                    anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                    anonymousClass1.L$1 = dsl6;
                    anonymousClass1.L$2 = dsl_create;
                    anonymousClass1.L$3 = dsl_create;
                    anonymousClass1.label = 4;
                    idfi = deviceInfoRepository3.getIdfi(anonymousClass1);
                    if (idfi != aVar) {
                        dsl7 = dsl_create;
                        dsl8 = dsl6;
                        androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
                        obj3 = idfi;
                        dsl9 = dsl7;
                    }
                }
                return aVar;
            }
            if (i11 == 3) {
                dsl5 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                LimitedSessionTokenKt.Dsl dsl12 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl6 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken3 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                t9.e.z(obj3);
                obj2 = obj3;
                dsl_create = dsl12;
                String osVersion2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2).getOsVersion();
                n.e(osVersion2, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl5.setOsVersion(osVersion2);
                DeviceInfoRepository deviceInfoRepository4 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl6;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 4;
                idfi = deviceInfoRepository4.getIdfi(anonymousClass1);
                if (idfi != aVar) {
                    dsl7 = dsl_create;
                    dsl8 = dsl6;
                    androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
                    obj3 = idfi;
                    dsl9 = dsl7;
                }
                return aVar;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl9 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
            dsl7 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
            dsl8 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
            androidGetLimitedSessionToken4 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
            t9.e.z(obj3);
        }
        dsl9.setIdfi((String) obj3);
        dsl7.setSdkVersion(41801);
        dsl7.setSdkVersionName("4.18.1");
        gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
        if (gameId != null) {
            dsl7.setGameId(gameId);
        }
        dsl7.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl7.setMediationProvider((ClientInfoOuterClass.MediationProvider) androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
        name = androidGetLimitedSessionToken4.mediationRepository.getName();
        if (name != null && dsl7.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            dsl7.setCustomMediationName(name);
        }
        version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
        if (version != null) {
            dsl7.setMediationVersion(version);
        }
        return dsl8._build();
        String deviceMake = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceMake();
        n.e(deviceMake, "deviceInfoRepository.staticDeviceInfo().deviceMake");
        dsl.setDeviceMake(deviceMake);
        DeviceInfoRepository deviceInfoRepository5 = androidGetLimitedSessionToken.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken;
        anonymousClass1.L$1 = dsl2;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 2;
        Object objStaticDeviceInfo3 = deviceInfoRepository5.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo3 != aVar) {
            obj = objStaticDeviceInfo3;
            dsl3 = dsl_create;
            dsl4 = dsl2;
            androidGetLimitedSessionToken2 = androidGetLimitedSessionToken;
            String deviceModel2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
            n.e(deviceModel2, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
            dsl3.setDeviceModel(deviceModel2);
            DeviceInfoRepository deviceInfoRepository6 = androidGetLimitedSessionToken2.deviceInfoRepository;
            anonymousClass1.L$0 = androidGetLimitedSessionToken2;
            anonymousClass1.L$1 = dsl4;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.label = 3;
            objStaticDeviceInfo2 = deviceInfoRepository6.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo2 != aVar) {
                obj2 = objStaticDeviceInfo2;
                dsl5 = dsl_create;
                dsl6 = dsl4;
                androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                String osVersion3 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2).getOsVersion();
                n.e(osVersion3, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl5.setOsVersion(osVersion3);
                DeviceInfoRepository deviceInfoRepository7 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl6;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 4;
                idfi = deviceInfoRepository7.getIdfi(anonymousClass1);
                if (idfi != aVar) {
                    dsl7 = dsl_create;
                    dsl8 = dsl6;
                    androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
                    obj3 = idfi;
                    dsl9 = dsl7;
                    dsl9.setIdfi((String) obj3);
                    dsl7.setSdkVersion(41801);
                    dsl7.setSdkVersionName("4.18.1");
                    gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
                    if (gameId != null) {
                        dsl7.setGameId(gameId);
                    }
                    dsl7.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                    dsl7.setMediationProvider((ClientInfoOuterClass.MediationProvider) androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
                    name = androidGetLimitedSessionToken4.mediationRepository.getName();
                    if (name != null) {
                        dsl7.setCustomMediationName(name);
                    }
                    version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
                    if (version != null) {
                        dsl7.setMediationVersion(version);
                    }
                    return dsl8._build();
                }
            }
        }
        return aVar;
    }
}
