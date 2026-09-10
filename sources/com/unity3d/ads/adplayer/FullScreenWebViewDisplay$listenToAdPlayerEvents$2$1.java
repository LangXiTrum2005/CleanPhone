package com.unity3d.ads.adplayer;

import ak.f;
import androidx.lifecycle.r0;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.j;
import com.ironsource.InterfaceC0435l1;
import fn.m0;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends i implements c {
    final /* synthetic */ j $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {InterfaceC0435l1.d.b.f29108e, 120}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ j $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1", f = "FullScreenWebViewDisplay.kt", l = {108}, m = "invokeSuspend")
        public static final class C02141 extends i implements c {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02141(FullScreenWebViewDisplay fullScreenWebViewDisplay, f fVar) {
                super(2, fVar);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new C02141(this.this$0, fVar);
            }

            @Override // jk.c
            public final Object invoke(a0 a0Var, f fVar) {
                return ((C02141) create(a0Var, fVar)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    t9.e.z(obj);
                    m0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.this$0.opportunityId, "Error loading webView");
                    this.label = 1;
                    Object objEmit = displayMessages.emit(displayError, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objEmit == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, j jVar, f fVar) {
            super(2, fVar);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = jVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0065  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        
            if (r7 == r4) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
        
            if (r7.emit(r2, r6) == r4) goto L31;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 2
                r2 = 1
                r3 = 0
                bk.a r4 = bk.a.f5708a
                if (r0 == 0) goto L26
                if (r0 == r2) goto L1e
                if (r0 != r1) goto L16
                java.lang.Object r0 = r6.L$0
                cn.a0 r0 = (cn.a0) r0
                t9.e.z(r7)
                goto Laa
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1e:
                java.lang.Object r0 = r6.L$0
                cn.a0 r0 = (cn.a0) r0
                t9.e.z(r7)
                goto L5d
            L26:
                t9.e.z(r7)
                java.lang.Object r7 = r6.L$0
                r0 = r7
                cn.a0 r0 = (cn.a0) r0
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.ads.core.data.model.AdObject r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getAdObject(r7)
                if (r7 == 0) goto L3b
                com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData r7 = r7.getWebViewLessLoadingRequiredData()
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L8e
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.ads.core.data.model.AdObject r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getAdObject(r7)
                if (r7 == 0) goto L60
                com.unity3d.ads.adplayer.AdPlayer r7 = r7.getAdPlayer()
                if (r7 == 0) goto L60
                fn.e r7 = r7.getOnLoadEvent()
                if (r7 == 0) goto L60
                r6.L$0 = r0
                r6.label = r2
                java.lang.Object r7 = fn.g.q(r7, r6)
                if (r7 != r4) goto L5d
                goto La9
            L5d:
                com.unity3d.ads.adplayer.model.LoadEvent r7 = (com.unity3d.ads.adplayer.model.LoadEvent) r7
                goto L61
            L60:
                r7 = r3
            L61:
                boolean r7 = r7 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
                if (r7 == 0) goto L8e
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                r2 = 0
                r7.setResult(r2)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.services.core.domain.ISDKDispatchers r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getDispatchers(r7)
                cn.w r7 = r7.getDefault()
                hn.d r7 = cn.d0.b(r7)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1 r2 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r5 = r6.this$0
                r2.<init>(r5, r3)
                r5 = 3
                cn.d0.w(r7, r3, r2, r5)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                r7.finish()
                cn.j r7 = r6.$continuation
                r7.f(r3)
            L8e:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r7 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE
                fn.m0 r7 = r7.getDisplayMessages()
                com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceRequest
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r3 = r6.this$0
                java.lang.String r3 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r3)
                r2.<init>(r3)
                r6.L$0 = r0
                r6.label = r1
                java.lang.Object r7 = r7.emit(r2, r6)
                if (r7 != r4) goto Laa
            La9:
                return r4
            Laa:
                ak.k r7 = r0.getCoroutineContext()
                cn.d0.m(r7)
                cn.j r6 = r6.$continuation
                wj.r r7 = wj.r.f53297a
                r6.resumeWith(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, j jVar, f fVar) {
        super(2, fVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = jVar;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, fVar);
    }

    @Override // jk.c
    public final Object invoke(fn.f fVar, f fVar2) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(fVar, fVar2)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        d0.w(r0.e(this.this$0), this.this$0.getDispatchers().getDefault(), new AnonymousClass1(this.this$0, this.$continuation, null), 2);
        return r.f53297a;
    }
}
