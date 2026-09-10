package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import t9.e;
import wj.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/AdObject;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidFullscreenWebViewAdPlayer$adObject$2 extends o implements jk.a {
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$adObject$2(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        super(0);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // jk.a
    public final AdObject invoke() {
        Object objC;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        try {
            AdRepository adRepository = androidFullscreenWebViewAdPlayer.adRepository;
            UUID uuidFromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
            n.e(uuidFromString, "fromString(opportunityId)");
            objC = adRepository.getAd(ProtobufExtensionsKt.toByteString(uuidFromString));
        } catch (Throwable th2) {
            objC = e.c(th2);
        }
        if (objC instanceof g) {
            objC = null;
        }
        return (AdObject) objC;
    }
}
