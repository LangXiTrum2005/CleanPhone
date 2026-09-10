package ads_mobile_sdk;

import android.view.View;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xv1 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ kw1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ vk0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv1(kw1 kw1Var, View view, vk0 vk0Var, String str, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = kw1Var;
        this.c = view;
        this.d = vk0Var;
        this.e = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new xv1(this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((xv1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        xw1 xw1Var = this.b.g;
        View view = this.c;
        vk0 vk0Var = this.d;
        String str = this.e;
        this.a = 1;
        xw1Var.getClass();
        Object objA = xw1.a(xw1Var, view, vk0Var, str, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}
