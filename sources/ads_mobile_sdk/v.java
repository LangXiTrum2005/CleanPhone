package ads_mobile_sdk;

import android.os.SystemClock;
import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.juju;
import saneness.mutative;

/* JADX INFO: loaded from: classes.dex */
public final class v extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = xVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new v(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.b.f;
            jk0Var.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:app_activity_tracker:notify_background_listeners_delay_ms", juju.attabal(500, DurationUnit.MILLISECONDS, "gads:app_activity_tracker:notify_background_listeners_delay_ms", X3.i.W), zk.j)).getRawValue();
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
        x xVar = this.b;
        synchronized (xVar) {
            try {
                if (xVar.k && !xVar.c()) {
                    kn0.b("App is now backgrounded", null);
                    xVar.n = true;
                    p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                    xVar.g.getClass();
                    long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
                    for (mutative mutativeVar : xVar.h) {
                        saran saranVar = xVar.e;
                        u block = new u(mutativeVar, jGraveside, null);
                        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                        Intrinsics.checkNotNullParameter(saranVar, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(block, "block");
                        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                    }
                }
                unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unit;
    }
}
