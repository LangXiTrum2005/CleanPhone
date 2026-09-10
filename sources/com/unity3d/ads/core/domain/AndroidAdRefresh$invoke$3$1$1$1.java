package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.g0;
import cn.q1;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObjectState;", "it", "Lwj/r;", "<anonymous>", "(Lcom/unity3d/ads/core/data/model/AdObjectState;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$1", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
public final class AndroidAdRefresh$invoke$3$1$1$1 extends i implements c {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ g0 $refreshTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$1(g0 g0Var, AdObject adObject, f fVar) {
        super(2, fVar);
        this.$refreshTask = g0Var;
        this.$adObject = adObject;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidAdRefresh$invoke$3$1$1$1(this.$refreshTask, this.$adObject, fVar);
    }

    @Override // jk.c
    public final Object invoke(AdObjectState adObjectState, f fVar) {
        return ((AndroidAdRefresh$invoke$3$1$1$1) create(adObjectState, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        ((q1) this.$refreshTask).a(null);
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.$adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null) {
            webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_DURING_RELOAD);
        }
        return r.f53297a;
    }
}
