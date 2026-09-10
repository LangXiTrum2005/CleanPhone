package ads_mobile_sdk;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ly1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ViewParent a;
    public final /* synthetic */ my1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(ViewParent viewParent, my1 my1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = viewParent;
        this.b = my1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ly1(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ly1(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ((ViewGroup) this.a).removeView(this.b.g());
        Context contextB = this.b.L.b();
        if (contextB == null) {
            contextB = this.b.a;
        }
        return igo.attabal.attabal(this.b.a(contextB));
    }
}
