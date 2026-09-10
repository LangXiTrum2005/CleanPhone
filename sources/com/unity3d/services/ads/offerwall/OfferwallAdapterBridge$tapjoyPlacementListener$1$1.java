package com.unity3d.services.ads.offerwall;

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
@e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {77, 83}, m = "invokeSuspend")
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends i implements c {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z10, OfferwallAdapterBridge offerwallAdapterBridge, String str, f fVar) {
        super(2, fVar);
        this.$placementAvailable = z10;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r12.emit(r4, r11) == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r12.emit(r4, r11) == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        return r3;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L13:
            t9.e.z(r12)
            goto L74
        L17:
            t9.e.z(r12)
            boolean r12 = r11.$placementAvailable
            java.lang.String r0 = ""
            bk.a r3 = bk.a.f5708a
            if (r12 == 0) goto L44
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            fn.m0 r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r5 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            java.lang.String r1 = r11.$placementName
            if (r1 != 0) goto L32
            r6 = r0
            goto L33
        L32:
            r6 = r1
        L33:
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.label = r2
            java.lang.Object r11 = r12.emit(r4, r11)
            if (r11 != r3) goto L74
            goto L73
        L44:
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            java.util.HashMap r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$getPlacementsMap$p(r12)
            java.lang.String r2 = r11.$placementName
            if (r2 != 0) goto L4f
            r2 = r0
        L4f:
            r12.remove(r2)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r12 = r11.this$0
            fn.m0 r12 = com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.access$get_offerwallEventFlow$p(r12)
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = new com.unity3d.ads.core.domain.offerwall.OfferwallEventData
            com.unity3d.services.ads.offerwall.OfferwallEvent r5 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_FAILED
            java.lang.String r2 = r11.$placementName
            if (r2 != 0) goto L62
            r6 = r0
            goto L63
        L62:
            r6 = r2
        L63:
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.label = r1
            java.lang.Object r11 = r12.emit(r4, r11)
            if (r11 != r3) goto L74
        L73:
            return r3
        L74:
            wj.r r11 = wj.r.f53297a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
