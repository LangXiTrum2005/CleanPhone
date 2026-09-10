package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/ads/core/data/model/AdObjectState;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1", f = "AndroidAdRefresh.kt", l = {39}, m = "invokeSuspend")
public final class AndroidAdRefresh$invoke$3$1$showing$1 extends i implements c {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.a implements c {
        public AnonymousClass1(Object obj) {
            super(2, obj, AdObjectState.class, "equals", "equals(Ljava/lang/Object;)Z", 4);
        }

        @Override // jk.c
        public final Object invoke(Object obj, f fVar) {
            return AndroidAdRefresh$invoke$3$1$showing$1.invokeSuspend$equals((AdObjectState) this.receiver, obj, fVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$showing$1(AdObject adObject, f fVar) {
        super(2, fVar);
        this.$adObject = adObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$equals(AdObjectState adObjectState, Object obj, f fVar) {
        return Boolean.valueOf(adObjectState.equals(obj));
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidAdRefresh$invoke$3$1$showing$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return obj;
        }
        t9.e.z(obj);
        n0 state = this.$adObject.getState();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdObjectState.SHOWING);
        this.label = 1;
        Object objL = g.l(state, anonymousClass1, this);
        bk.a aVar = bk.a.f5708a;
        return objL == aVar ? aVar : objL;
    }
}
