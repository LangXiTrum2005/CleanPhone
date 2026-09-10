package ads_mobile_sdk;

import android.widget.Toolbar;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h33 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ Toolbar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h33(gq0 gq0Var, Toolbar toolbar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gq0Var;
        this.b = toolbar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new h33(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h33(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        String url = this.a.getUrl();
        if (url == null) {
            return null;
        }
        this.b.setSubtitle(url);
        return Unit.f29295attabal;
    }
}
