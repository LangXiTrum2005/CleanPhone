package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.laky;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class d92 extends SuspendLambda implements Function2 {
    public final /* synthetic */ orthocephalic a;
    public final /* synthetic */ LoadAdError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d92(LoadAdError loadAdError, orthocephalic orthocephalicVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = orthocephalicVar;
        this.b = loadAdError;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new d92(this.b, this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        orthocephalic orthocephalicVar = this.a;
        return new d92(this.b, orthocephalicVar, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        laky lakyVar = ip0.f;
        orthocephalic orthocephalicVar = this.a;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new c92(this.b, orthocephalicVar, null), 3, null);
        return Unit.f29295attabal;
    }
}
