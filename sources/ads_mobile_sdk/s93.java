package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s93 extends SuspendLambda implements Function2 {
    public final /* synthetic */ fa3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s93(fa3 fa3Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = fa3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new s93(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s93(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.j.getClass();
        Intrinsics.checkNotNullParameter("GMA_WEBVIEW_PROFILE", "name");
        http.dern orCreateProfile = http.wireman.attabal().getOrCreateProfile("GMA_WEBVIEW_PROFILE");
        Intrinsics.checkNotNullExpressionValue(orCreateProfile, "getOrCreateProfile(...)");
        return orCreateProfile;
    }
}
