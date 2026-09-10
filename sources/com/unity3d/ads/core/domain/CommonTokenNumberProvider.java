package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import r9.b;
import wj.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonTokenNumberProvider;", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "invoke", "()I", "number$delegate", "Lwj/d;", "getNumber", "number", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonTokenNumberProvider implements TokenNumberProvider {

    /* JADX INFO: renamed from: number$delegate, reason: from kotlin metadata */
    private final d number;

    public CommonTokenNumberProvider(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.number = b.u(new CommonTokenNumberProvider$number$2(sessionRepository));
    }

    private final int getNumber() {
        return ((Number) this.number.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
