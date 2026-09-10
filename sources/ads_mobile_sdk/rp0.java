package ads_mobile_sdk;

import com.unity3d.ads.adplayer.AndroidWebViewClient;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gq0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(gq0 gq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new rp0(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rp0(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        return Unit.f29295attabal;
    }
}
