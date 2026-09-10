package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.services.core.network.model.HttpRequest;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "", "<anonymous>", "(Lcn/a0;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", l = {71, 71}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends i implements c {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, f fVar) {
        super(2, fVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r11 == r3) goto L15;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            bk.a r3 = bk.a.f5708a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            t9.e.z(r11)
            goto L40
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L18:
            t9.e.z(r11)
            goto L2e
        L1c:
            t9.e.z(r11)
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r11 = r10.this$0
            com.unity3d.ads.core.domain.HttpClientProvider r11 = com.unity3d.services.core.domain.task.InitializeStateLoadWeb.access$getHttpClientProvider$p(r11)
            r10.label = r2
            java.lang.Object r11 = r11.invoke(r10)
            if (r11 != r3) goto L2e
            goto L3f
        L2e:
            r4 = r11
            com.unity3d.services.core.network.core.HttpClient r4 = (com.unity3d.services.core.network.core.HttpClient) r4
            com.unity3d.services.core.network.model.HttpRequest r5 = r10.$request
            r10.label = r1
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r10
            java.lang.Object r11 = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default(r4, r5, r6, r7, r8, r9)
            if (r11 != r3) goto L40
        L3f:
            return r3
        L40:
            com.unity3d.services.core.network.model.HttpResponse r11 = (com.unity3d.services.core.network.model.HttpResponse) r11
            java.lang.Object r10 = r11.getBody()
            java.lang.String r10 = r10.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
