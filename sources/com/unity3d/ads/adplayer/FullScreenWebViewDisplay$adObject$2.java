package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.d;
import wj.e;
import wj.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/AdObject;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FullScreenWebViewDisplay$adObject$2 extends o implements jk.a {
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$adObject$2(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        super(0);
        this.this$0 = fullScreenWebViewDisplay;
    }

    private static final AdRepository invoke$lambda$0(d dVar) {
        return (AdRepository) dVar.getValue();
    }

    @Override // jk.a
    public final AdObject invoke() {
        Object objC;
        d dVarT = r9.b.t(e.f53281b, new FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1(this.this$0, ""));
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            AdRepository adRepositoryInvoke$lambda$0 = invoke$lambda$0(dVarT);
            UUID uuidFromString = UUID.fromString(fullScreenWebViewDisplay.opportunityId);
            n.e(uuidFromString, "fromString(opportunityId)");
            objC = adRepositoryInvoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(uuidFromString));
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (objC instanceof g) {
            objC = null;
        }
        return (AdObject) objC;
    }
}
