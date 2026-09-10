package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import fn.a1;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE, 36, 41}, m = "invokeSuspend")
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends i implements c {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, f fVar) {
            super(2, fVar);
            this.$adObject = adObject;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.$adObject, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            int i10 = this.label;
            r rVar2 = r.f53297a;
            if (i10 == 0) {
                t9.e.z(obj);
                ((a1) this.$adObject.getState()).d0(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                if (adPlayer != null) {
                    this.label = 1;
                    Object objDestroy = adPlayer.destroy(this);
                    bk.a aVar = bk.a.f5708a;
                    if (objDestroy == aVar) {
                        return aVar;
                    }
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    d0.j(this.$adObject.getAdScope());
                }
                return rVar2;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            rVar = rVar2;
            if (rVar == null) {
                d0.j(this.$adObject.getAdScope());
            }
            return rVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, f fVar) {
        super(2, fVar);
        this.$adObject = adObject;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r9 == r5) goto L29;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            wj.r r1 = wj.r.f53297a
            r2 = 3
            r3 = 2
            r4 = 1
            bk.a r5 = bk.a.f5708a
            if (r0 == 0) goto L26
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L16
            t9.e.z(r9)
            goto L89
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1e:
            t9.e.z(r9)
            goto L66
        L22:
            t9.e.z(r9)
            goto L51
        L26:
            t9.e.z(r9)
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            fn.n0 r9 = r9.getTtl()
            fn.a1 r9 = (fn.a1) r9
            java.lang.Object r9 = r9.getValue()
            bn.a r9 = (bn.a) r9
            if (r9 == 0) goto L3c
            long r6 = r9.f5744a
            goto L55
        L3c:
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            fn.n0 r9 = r9.getTtl()
            fn.q r0 = new fn.q
            r6 = 2
            r0.<init>(r9, r6)
            r8.label = r4
            java.lang.Object r9 = fn.g.k(r0, r8)
            if (r9 != r5) goto L51
            goto L88
        L51:
            bn.a r9 = (bn.a) r9
            long r6 = r9.f5744a
        L55:
            r8.label = r3
            long r3 = cn.d0.G(r6)
            java.lang.Object r9 = cn.d0.l(r3, r8)
            if (r9 != r5) goto L62
            goto L63
        L62:
            r9 = r1
        L63:
            if (r9 != r5) goto L66
            goto L88
        L66:
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            fn.n0 r9 = r9.getState()
            fn.a1 r9 = (fn.a1) r9
            java.lang.Object r9 = r9.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r9 == r0) goto L89
            cn.u1 r9 = cn.u1.f6774a
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r0 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r3 = r8.$adObject
            r4 = 0
            r0.<init>(r3, r4)
            r8.label = r2
            java.lang.Object r8 = cn.d0.J(r9, r0, r8)
            if (r8 != r5) goto L89
        L88:
            return r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
