package com.unity3d.ads.adplayer;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {97, 98}, m = "invokeSuspend")
public final class AndroidEmbeddableWebViewAdPlayer$show$3$1 extends i implements c {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, f fVar) {
        super(2, fVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r5.collect(r0, r4) == r3) goto L15;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            bk.a r3 = bk.a.f5708a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 == r1) goto L14
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L14:
            t9.e.z(r5)
            goto L50
        L18:
            t9.e.z(r5)
            goto L36
        L1c:
            t9.e.z(r5)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            com.unity3d.ads.adplayer.ShowOptions r0 = r4.$showOptions
            com.unity3d.ads.adplayer.AndroidShowOptions r0 = (com.unity3d.ads.adplayer.AndroidShowOptions) r0
            java.util.Map r0 = r0.getUnityAdsShowOptions()
            r4.label = r2
            java.lang.Object r5 = r5.requestShow(r0, r4)
            if (r5 != r3) goto L36
            goto L4f
        L36:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.core.data.datasource.LifecycleDataSource r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getLifecycleDataSource$p(r5)
            fn.y0 r5 = r5.getAppActive()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = r4.this$0
            r0.<init>()
            r4.label = r1
            java.lang.Object r4 = r5.collect(r0, r4)
            if (r4 != r3) goto L50
        L4f:
            return r3
        L50:
            aa.b r4 = new aa.b
            r5 = 19
            r0 = 0
            r4.<init>(r0, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
