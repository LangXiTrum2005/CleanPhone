package ads_mobile_sdk;

import com.google.android.gms.ads.rewarded.RewardItem;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.vinyl;

/* JADX INFO: loaded from: classes.dex */
public final class ay2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hy2 b;
    public final /* synthetic */ RewardItem c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay2(hy2 hy2Var, RewardItem rewardItem, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = hy2Var;
        this.c = rewardItem;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ay2(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ay2(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            vinyl vinylVar = this.b.d;
            zx2 zx2Var = new zx2(this.c);
            this.a = 1;
            if (vinylVar.a(zx2Var, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
