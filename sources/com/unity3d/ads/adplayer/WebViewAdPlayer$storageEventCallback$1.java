package com.unity3d.ads.adplayer;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.services.core.device.StorageEventInfo;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/services/core/device/StorageEventInfo;", "it", "Lwj/r;", "invoke", "(Lcom/unity3d/services/core/device/StorageEventInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class WebViewAdPlayer$storageEventCallback$1 extends o implements jk.b {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {91}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ StorageEventInfo $it;
        int label;
        final /* synthetic */ WebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, f fVar) {
            super(2, fVar);
            this.this$0 = webViewAdPlayer;
            this.$it = storageEventInfo;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.this$0, this.$it, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                WebViewBridge webViewBridge = this.this$0.bridge;
                OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                this.label = 1;
                Object objSendEvent = webViewBridge.sendEvent(onStorageEvent, this);
                bk.a aVar = bk.a.f5708a;
                if (objSendEvent == aVar) {
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
    public WebViewAdPlayer$storageEventCallback$1(WebViewAdPlayer webViewAdPlayer) {
        super(1);
        this.this$0 = webViewAdPlayer;
    }

    @Override // jk.b
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StorageEventInfo) obj);
        return r.f53297a;
    }

    public final void invoke(StorageEventInfo it) {
        n.f(it, "it");
        d0.w(this.this$0.getScope(), null, new AnonymousClass1(this.this$0, it, null), 3);
    }
}
