package ads_mobile_sdk;

import android.view.View;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class jw1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ kw1 a;
    public final /* synthetic */ glassmaker b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw1(kw1 kw1Var, glassmaker glassmakerVar, View view, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = kw1Var;
        this.b = glassmakerVar;
        this.c = view;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new jw1(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jw1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        return this.a.e.a(this.b, this.c);
    }
}
