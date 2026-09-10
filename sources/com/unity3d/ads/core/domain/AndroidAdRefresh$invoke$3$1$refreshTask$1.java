package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import fn.a1;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$refreshTask$1", f = "AndroidAdRefresh.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE}, m = "invokeSuspend")
public final class AndroidAdRefresh$invoke$3$1$refreshTask$1 extends i implements c {
    final /* synthetic */ AdObject $adObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$refreshTask$1(AndroidAdRefresh androidAdRefresh, AdObject adObject, f fVar) {
        super(2, fVar);
        this.this$0 = androidAdRefresh;
        this.$adObject = adObject;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        AndroidAdRefresh$invoke$3$1$refreshTask$1 androidAdRefresh$invoke$3$1$refreshTask$1 = new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, fVar);
        androidAdRefresh$invoke$3$1$refreshTask$1.L$0 = obj;
        return androidAdRefresh$invoke$3$1$refreshTask$1;
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidAdRefresh$invoke$3$1$refreshTask$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                t9.e.z(obj);
                AndroidAdRefresh androidAdRefresh = this.this$0;
                ByteString opportunityId = this.$adObject.getOpportunityId();
                this.label = 1;
                Object objPerformRefresh = androidAdRefresh.performRefresh(opportunityId, this);
                bk.a aVar = bk.a.f5708a;
                if (objPerformRefresh == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            objC = r.f53297a;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        AndroidAdRefresh androidAdRefresh2 = this.this$0;
        AdObject adObject = this.$adObject;
        if (h.a(objC) != null && androidAdRefresh2.canUpdateRefreshData((AdObjectState) ((a1) adObject.getState()).getValue()) && (webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData()) != null) {
            webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_ERROR);
        }
        return new h(objC);
    }
}
