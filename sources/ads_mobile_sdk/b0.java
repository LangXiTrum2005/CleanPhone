package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.time.DurationUnit;
import saneness.juju;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, int i, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = c0Var;
        this.c = i;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new b0(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b0(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.b.b;
            jk0Var.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:ad_activity_delegate_map_retain_duration", juju.attabal(60, DurationUnit.SECONDS, "gads:ad_activity_delegate_map_retain_duration", X3.i.W), zk.l)).getRawValue();
            this.a = 1;
            if (splinterproof.saneness(rawValue, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        this.b.d.remove(igo.attabal.wireman(this.c));
        return Unit.f29295attabal;
    }
}
