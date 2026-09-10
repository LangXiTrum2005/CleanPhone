package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.banner.AdView;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.terni;

/* JADX INFO: loaded from: classes.dex */
public final class n7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ complexometry.wireman b;
    public final /* synthetic */ liquory.saneness c;
    public final /* synthetic */ AdView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(complexometry.wireman wiremanVar, liquory.saneness sanenessVar, AdView adView, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = wiremanVar;
        this.c = sanenessVar;
        this.d = adView;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new n7(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n7) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            terni.f37333attabal.getClass();
            CoroutineContext coroutineContext = (CoroutineContext) ((i60) ((terni) en0.c.getValue())).u.get();
            com.google.android.libraries.ads.mobile.sdk.banner.a aVar = new com.google.android.libraries.ads.mobile.sdk.banner.a(this.d, this.c, null);
            this.a = 1;
            if (impromptu.competently(coroutineContext, aVar, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        this.b.onAdLoaded(this.c);
        return Unit.f29295attabal;
    }
}
