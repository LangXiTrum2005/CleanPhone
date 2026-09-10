package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class c92 extends SuspendLambda implements Function2 {
    public final /* synthetic */ orthocephalic a;
    public final /* synthetic */ LoadAdError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c92(LoadAdError loadAdError, orthocephalic orthocephalicVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = orthocephalicVar;
        this.b = loadAdError;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new c92(this.b, this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        orthocephalic orthocephalicVar = this.a;
        return new c92(this.b, orthocephalicVar, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.a(this.b);
        return Unit.f29295attabal;
    }
}
