package com.unity3d.ads.adplayer;

import ak.f;
import androidx.core.app.NotificationCompat;
import ck.e;
import ck.i;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.d;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/ShowEvent;", NotificationCompat.CATEGORY_EVENT, "isCompletedManually", ""}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
@e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
public final class WebViewAdPlayer$onShowEvent$3 extends i implements d {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public WebViewAdPlayer$onShowEvent$3(f fVar) {
        super(3, fVar);
    }

    public final Object invoke(ShowEvent showEvent, boolean z10, f fVar) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(fVar);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z10;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        return this.Z$0 ? new ShowEvent.Completed(ShowStatus.COMPLETED, null, null, 6, null) : (ShowEvent) this.L$0;
    }

    @Override // jk.d
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ShowEvent) obj, ((Boolean) obj2).booleanValue(), (f) obj3);
    }
}
