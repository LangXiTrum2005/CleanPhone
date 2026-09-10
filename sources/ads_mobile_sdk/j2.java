package ads_mobile_sdk;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends un {
    public final iv l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(iv consentManager, jk0 flags, x activityTracker, ri2 rootTraceCreator, amphitheatre clock, saran backgroundScope) {
        super(clock, backgroundScope, rootTraceCreator, flags, activityTracker);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.l = consentManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(j2 j2Var, wretchedly.dern dernVar) {
        h2 h2Var;
        if (dernVar instanceof h2) {
            h2Var = (h2) dernVar;
            int i = h2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h2Var.c = i - Integer.MIN_VALUE;
            } else {
                h2Var = new h2(j2Var, dernVar);
            }
        } else {
            h2Var = new h2(j2Var, dernVar);
        }
        Object objDent = h2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = h2Var.c;
        AdvertisingIdClient.Info info = null;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objDent);
            saran saranVar = j2Var.d;
            i2 block = new i2(j2Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            walach walachVarSaneness = cutely.saneness(saranVar, context, null, new w13(block, null), 2, null);
            h2Var.c = 1;
            objDent = walachVarSaneness.dent(h2Var);
            if (objDent == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objDent);
        }
        spartacist spartacistVar = (spartacist) objDent;
        if (spartacistVar != null) {
            if (spartacistVar instanceof nn0) {
                return (nn0) spartacistVar;
            }
            info = (AdvertisingIdClient.Info) ((tn0) spartacistVar).b;
        }
        return new tn0(new g2(info));
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    @Override // ads_mobile_sdk.un, ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        jk0 jk0Var = this.f;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:ad_id_init_from_signal_source_enabled", X3.i.W);
        return ((Boolean) jk0Var.a("gads:ad_id_init_from_signal_source_enabled", Boolean.FALSE, zk.b)).booleanValue() ? un.c(this, dernVar) : new tn0(Unit.f29295attabal);
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AD_ID_INFO;
    }
}
