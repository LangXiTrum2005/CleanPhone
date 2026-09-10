package com.unity3d.ads.adplayer;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import fn.r0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {75, 79}, m = "invokeSuspend")
public final class AndroidEmbeddableWebViewAdPlayer$show$1$1 extends i implements c {
    final /* synthetic */ r0 $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {73}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, f fVar) {
            super(2, fVar);
            this.this$0 = androidEmbeddableWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.this$0, this.$showOptions, fVar);
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((AnonymousClass1) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
                this.label = 1;
                Object objRequestShow = webViewAdPlayer.requestShow(unityAdsShowOptions, this);
                bk.a aVar = bk.a.f5708a;
                if (objRequestShow == aVar) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ScarEvent;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // jk.c
        public final Object invoke(ScarEvent scarEvent, f fVar) {
            return ((AnonymousClass2) create(scarEvent, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return Boolean.valueOf(n.a((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class AnonymousClass4 implements fn.f, h {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        @Override // fn.f
        public final Object emit(BannerBridge.BannerEvent bannerEvent, f fVar) {
            Object objSendScarBannerEvent = this.$tmp0.sendScarBannerEvent(bannerEvent, fVar);
            return objSendScarBannerEvent == bk.a.f5708a ? objSendScarBannerEvent : r.f53297a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fn.f) && (obj instanceof h)) {
                return n.a(getFunctionDelegate(), ((h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.h
        public final wj.a getFunctionDelegate() {
            return new k(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, r0 r0Var, ShowOptions showOptions, f fVar) {
        super(2, fVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$scarEvents = r0Var;
        this.$showOptions = showOptions;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$1(this.this$0, this.$scarEvents, this.$showOptions, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r0.collect(r2, r7) == r3) goto L15;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 2
            r2 = 1
            bk.a r3 = bk.a.f5708a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            t9.e.z(r8)
            goto L5d
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L18:
            t9.e.z(r8)
            goto L42
        L1c:
            t9.e.z(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            fn.e r8 = r8.getOnScarEvent()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r4 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
            r6 = 0
            r0.<init>(r4, r5, r6)
            fn.k r4 = new fn.k
            r4.<init>(r0, r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2 r8 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2
            r8.<init>(r6)
            r7.label = r2
            java.lang.Object r8 = fn.g.l(r4, r8, r7)
            if (r8 != r3) goto L42
            goto L5c
        L42:
            fn.r0 r8 = r7.$scarEvents
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1
            r0.<init>()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4 r2 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4
            r2.<init>(r8)
            r7.label = r1
            java.lang.Object r7 = r0.collect(r2, r7)
            if (r7 != r3) goto L5d
        L5c:
            return r3
        L5d:
            wj.r r7 = wj.r.f53297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
