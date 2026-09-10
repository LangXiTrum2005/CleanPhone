package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.domain.MediationProviderParser;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidMediationRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "mediationDataSource", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "mediationProviderParser", "<init>", "(Lcom/unity3d/ads/core/data/datasource/MediationDataSource;Lcom/unity3d/ads/core/domain/MediationProviderParser;)V", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "", "getName", "()Ljava/lang/String;", "name", "getVersion", "version", "Lkotlin/Function0;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Ljk/a;", "mediationProvider", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;
    private final MediationProviderParser mediationProviderParser;

    public AndroidMediationRepository(MediationDataSource mediationDataSource, MediationProviderParser mediationProviderParser) {
        n.f(mediationDataSource, "mediationDataSource");
        n.f(mediationProviderParser, "mediationProviderParser");
        this.mediationDataSource = mediationDataSource;
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public jk.a getMediationProvider() {
        return new AndroidMediationRepository$mediationProvider$1(this);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
