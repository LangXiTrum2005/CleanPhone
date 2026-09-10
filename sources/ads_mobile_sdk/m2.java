package ads_mobile_sdk;

import com.ironsource.X3;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.godward;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends godward {
    public final j2 c;
    public final jk0 d;

    public m2(j2 adIdInfoSignalSource, jk0 flags) {
        Intrinsics.checkNotNullParameter(adIdInfoSignalSource, "adIdInfoSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.c = adIdInfoSignalSource;
        this.d = flags;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        l2 l2Var;
        if (dernVar instanceof l2) {
            l2Var = (l2) dernVar;
            int i = l2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l2Var.c = i - Integer.MIN_VALUE;
            } else {
                l2Var = new l2(this, dernVar);
            }
        } else {
            l2Var = new l2(this, dernVar);
        }
        Object objA = l2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = l2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            jk0 jk0Var = this.d;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:ad_id_init_enabled", X3.i.W);
            Boolean bool = Boolean.TRUE;
            jk jkVar = zk.b;
            if (((Boolean) jk0Var.a("gads:ad_id_init_enabled", bool, jkVar)).booleanValue()) {
                jk0 jk0Var2 = this.d;
                jk0Var2.getClass();
                Intrinsics.checkNotNullParameter("gads:ad_id_init_from_signal_source_enabled", X3.i.W);
                if (!((Boolean) jk0Var2.a("gads:ad_id_init_from_signal_source_enabled", Boolean.FALSE, jkVar)).booleanValue()) {
                    j2 j2Var = this.c;
                    l2Var.c = 1;
                    j2Var.getClass();
                    objA = un.a(j2Var, l2Var);
                    if (objA == objBeachfront) {
                        return objBeachfront;
                    }
                }
            }
            return new tn0(Unit.f29295attabal);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(objA);
        return new tn0(Unit.f29295attabal);
    }
}
