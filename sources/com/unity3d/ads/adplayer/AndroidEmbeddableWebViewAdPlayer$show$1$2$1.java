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
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {83}, m = "invokeSuspend")
public final class AndroidEmbeddableWebViewAdPlayer$show$1$2$1 extends i implements c {
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, f fVar) {
        super(2, fVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this.this$0, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$2$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
            this.label = 1;
            Object objDestroy = androidEmbeddableWebViewAdPlayer.destroy(this);
            bk.a aVar = bk.a.f5708a;
            if (objDestroy == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return r.f53297a;
    }
}
