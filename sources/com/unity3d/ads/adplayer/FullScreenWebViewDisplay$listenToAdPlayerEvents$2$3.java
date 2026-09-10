package com.unity3d.ads.adplayer;

import ak.f;
import androidx.lifecycle.r0;
import ck.e;
import ck.i;
import cn.d0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.Map;
import jk.c;
import kotlin.Metadata;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage;", "it", "Lwj/r;", "<anonymous>", "(Lcom/unity3d/ads/adplayer/DisplayMessage;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends i implements c {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, f fVar) {
        super(2, fVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, fVar);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // jk.c
    public final Object invoke(DisplayMessage displayMessage, f fVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        r rVar = r.f53297a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        DisplayMessage displayMessage = (DisplayMessage) this.L$0;
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                fullScreenWebViewDisplay.finish();
            } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                fullScreenWebViewDisplay.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
            } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
                fullScreenWebViewDisplay.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
            } else if (displayMessage instanceof DisplayMessage.OpenUrl) {
                fullScreenWebViewDisplay.openUrl(displayMessage.getOpportunityId(), ((DisplayMessage.OpenUrl) displayMessage).getIntent(), ((DisplayMessage.OpenUrl) displayMessage).getUseActivityForResult());
            } else if (displayMessage instanceof DisplayMessage.DisplayStarted) {
                AdObject adObject = fullScreenWebViewDisplay.getAdObject();
                if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(fullScreenWebViewDisplay.getSendDiagnosticEvent(), "native_webview_less_ad_display_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
                }
            }
            objC = rVar;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
        Throwable thA = h.a(objC);
        if (thA != null) {
            d0.w(r0.e(fullScreenWebViewDisplay2), fullScreenWebViewDisplay2.getDispatchers().getDefault(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(fullScreenWebViewDisplay2, thA, null), 2);
        }
        return rVar;
    }
}
