package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.libya;

/* JADX INFO: loaded from: classes.dex */
public final class f30 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f30(gq0 gq0Var, boolean z, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gq0Var;
        this.b = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new f30(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f30(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        libya libyaVar = this.a.m;
        if (libyaVar != null) {
            bm0 bm0Var = (bm0) libyaVar;
            if ((!this.b || bm0Var.h()) && !bm0Var.f()) {
                vq vqVar = bm0Var.r;
                if (vqVar != null) {
                    vqVar.setVisibility(0);
                }
                bm0Var.s = false;
            } else {
                vq vqVar2 = bm0Var.r;
                if (vqVar2 != null) {
                    vqVar2.setVisibility(8);
                }
                bm0Var.s = true;
            }
        }
        return Unit.f29295attabal;
    }
}
