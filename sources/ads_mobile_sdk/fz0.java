package ads_mobile_sdk;

import ads_mobile_sdk.fz0;
import com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError;
import complexometry.monoploid;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new fz0(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new fz0(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            wz0 wz0Var = this.b;
            sy0 sy0Var = sy0.GESTURE;
            monoploid monoploidVar = new monoploid() { // from class: saneness.dumb
                @Override // complexometry.monoploid
                public final void attabal(AdInspectorError adInspectorError) {
                    fz0.a(adInspectorError);
                }
            };
            this.a = 1;
            wz0Var.getClass();
            if (wz0.a(wz0Var, sy0Var, monoploidVar, this) == objBeachfront) {
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

    public static final void a(AdInspectorError adInspectorError) {
    }
}
