package com.unity3d.ads.core.domain;

import ak.f;
import an.h;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetClientInfo;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "omidManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "scarManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "fIdExistenceDataSource", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "adQualityVersionDataSource", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;Lcom/unity3d/ads/core/data/manager/OmidManager;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;)V", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "invoke", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetClientInfo implements GetClientInfo {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final FIdExistenceDataSource fIdExistenceDataSource;
    private final MediationRepository mediationRepository;
    private final OfferwallManager offerwallManager;
    private final OmidManager omidManager;
    private final ScarManager scarManager;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidGetClientInfo", f = "AndroidGetClientInfo.kt", l = {44, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetClientInfo.this.invoke(this);
        }
    }

    public AndroidGetClientInfo(SessionRepository sessionRepository, MediationRepository mediationRepository, OmidManager omidManager, ScarManager scarManager, OfferwallManager offerwallManager, FIdExistenceDataSource fIdExistenceDataSource, AdQualityVersionDataSource adQualityVersionDataSource) {
        n.f(sessionRepository, "sessionRepository");
        n.f(mediationRepository, "mediationRepository");
        n.f(omidManager, "omidManager");
        n.f(scarManager, "scarManager");
        n.f(offerwallManager, "offerwallManager");
        n.f(fIdExistenceDataSource, "fIdExistenceDataSource");
        n.f(adQualityVersionDataSource, "adQualityVersionDataSource");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    public Object invoke(f fVar) {
        AnonymousClass1 anonymousClass1;
        AndroidGetClientInfo androidGetClientInfo;
        ClientInfoKt.Dsl dsl;
        ClientInfoKt.Dsl dsl2;
        AndroidGetClientInfo androidGetClientInfo2;
        String str;
        String str2;
        String strInvoke;
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
        Object version = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        bk.a aVar = bk.a.f5708a;
        if (i11 != 0) {
            if (i11 == 1) {
                dsl = (ClientInfoKt.Dsl) anonymousClass1.L$2;
                dsl2 = (ClientInfoKt.Dsl) anonymousClass1.L$1;
                androidGetClientInfo = (AndroidGetClientInfo) anonymousClass1.L$0;
                t9.e.z(version);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl = (ClientInfoKt.Dsl) anonymousClass1.L$2;
                dsl2 = (ClientInfoKt.Dsl) anonymousClass1.L$1;
                androidGetClientInfo2 = (AndroidGetClientInfo) anonymousClass1.L$0;
                t9.e.z(version);
            }
            str = (String) version;
            if (str != null) {
                dsl.setOfferwallVersion(str);
            }
            dsl.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
            dsl.setOmidPartnerVersion("1");
            if (MadeWithUnityDetector.isMadeWithUnity()) {
                str2 = "Unity";
            } else {
                str2 = "";
            }
            dsl.setSdkDevelopmentPlatform(str2);
            dsl.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
            strInvoke = androidGetClientInfo2.adQualityVersionDataSource.invoke();
            if (strInvoke != null) {
                dsl.setAdQualitySdkVersion(strInvoke);
            }
            return dsl2._build();
        }
        t9.e.z(version);
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.INSTANCE;
        ClientInfoOuterClass.ClientInfo.Builder builderNewBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        ClientInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSdkVersion(41801);
        dsl_create.setSdkVersionName("4.18.1");
        String gameId = this.sessionRepository.getGameId();
        if (gameId != null) {
            dsl_create.setGameId(gameId);
        }
        dsl_create.setTest(this.sessionRepository.isTestModeEnabled());
        dsl_create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl_create.setMediationProvider((ClientInfoOuterClass.MediationProvider) this.mediationRepository.getMediationProvider().invoke());
        String name = this.mediationRepository.getName();
        if (name != null && dsl_create.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM && !h.y0(name)) {
            dsl_create.setCustomMediationName(name);
        }
        String version2 = this.mediationRepository.getVersion();
        if (version2 != null) {
            dsl_create.setMediationVersion(version2);
        }
        ScarManager scarManager = this.scarManager;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.label = 1;
        Object version3 = scarManager.getVersion(anonymousClass1);
        if (version3 != aVar) {
            androidGetClientInfo = this;
            dsl = dsl_create;
            version = version3;
            dsl2 = dsl;
        }
        return aVar;
        String str3 = (String) version;
        if (str3 != null) {
            dsl.setScarVersionName(str3);
        }
        OfferwallManager offerwallManager = androidGetClientInfo.offerwallManager;
        anonymousClass1.L$0 = androidGetClientInfo;
        anonymousClass1.L$1 = dsl2;
        anonymousClass1.L$2 = dsl;
        anonymousClass1.label = 2;
        version = offerwallManager.getVersion(anonymousClass1);
        if (version != aVar) {
            androidGetClientInfo2 = androidGetClientInfo;
            str = (String) version;
            if (str != null) {
                dsl.setOfferwallVersion(str);
            }
            dsl.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
            dsl.setOmidPartnerVersion("1");
            if (MadeWithUnityDetector.isMadeWithUnity()) {
                str2 = "Unity";
            } else {
                str2 = "";
            }
            dsl.setSdkDevelopmentPlatform(str2);
            dsl.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
            strInvoke = androidGetClientInfo2.adQualityVersionDataSource.invoke();
            if (strInvoke != null) {
                dsl.setAdQualitySdkVersion(strInvoke);
            }
            return dsl2._build();
        }
        return aVar;
    }
}
