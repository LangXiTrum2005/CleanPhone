package com.unity3d.services.ads.offerwall;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import fn.m0;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$4", f = "OfferwallAdapterBridge.kt", l = {127}, m = "invokeSuspend")
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$4 extends i implements c {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$4(OfferwallAdapterBridge offerwallAdapterBridge, String str, f fVar) {
        super(2, fVar);
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(this.this$0, this.$placementName, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$4) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            m0 m0Var = this.this$0._offerwallEventFlow;
            OfferwallEvent offerwallEvent = OfferwallEvent.ON_CONTENT_SHOW;
            String str = this.$placementName;
            if (str == null) {
                str = "";
            }
            OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str, null, null, 12, null);
            this.label = 1;
            Object objEmit = m0Var.emit(offerwallEventData, this);
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
