package ads_mobile_sdk;

import android.widget.Toolbar;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.homozygous;

/* JADX INFO: loaded from: classes.dex */
public final class j33 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o33 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(o33 o33Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = o33Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new j33(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j33(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            o33 o33Var = this.b;
            Toolbar toolbar = o33Var.x;
            if (toolbar != null) {
                homozygous homozygousVar = o33Var.E;
                vk0 vk0Var = vk0.NOT_VISIBLE;
                this.a = 1;
                if (homozygousVar.a(toolbar, vk0Var, null, this) == objBeachfront) {
                    return objBeachfront;
                }
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
