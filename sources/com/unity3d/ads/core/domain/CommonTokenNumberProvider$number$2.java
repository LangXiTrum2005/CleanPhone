package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonTokenNumberProvider$number$2 extends o implements jk.a {
    final /* synthetic */ SessionRepository $sessionRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTokenNumberProvider$number$2(SessionRepository sessionRepository) {
        super(0);
        this.$sessionRepository = sessionRepository;
    }

    @Override // jk.a
    public final Integer invoke() {
        return Integer.valueOf(this.$sessionRepository.getHeaderBiddingTokenCounter());
    }
}
