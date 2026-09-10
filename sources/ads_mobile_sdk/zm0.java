package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.loun;
import saneness.phonoscope;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class zm0 implements phonoscope {
    public final iv a;
    public final jk0 b;
    public final loun c;

    public zm0(iv consentManager, jk0 flags, loun traceLogger) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = consentManager;
        this.b = flags;
        this.c = traceLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.phonoscope
    public final Object a(JsonObject jsonObject, wretchedly.dern dernVar) {
        ym0 ym0Var;
        zm0 zm0Var;
        if (dernVar instanceof ym0) {
            ym0Var = (ym0) dernVar;
            int i = ym0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ym0Var.d = i - Integer.MIN_VALUE;
            } else {
                ym0Var = new ym0(this, dernVar);
            }
        } else {
            ym0Var = new ym0(this, dernVar);
        }
        Object objA = ym0Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ym0Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            jk0 jk0Var = this.b;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:topics_signal:enabled", X3.i.W);
            if (!((Boolean) jk0Var.a("gads:topics_signal:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                return Unit.f29295attabal;
            }
            iv ivVar = this.a;
            ym0Var.a = this;
            ym0Var.d = 1;
            ivVar.getClass();
            objA = iv.a(ivVar, true, (wretchedly.dern) ym0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            zm0Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zm0Var = ym0Var.a;
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        if (!(spartacistVar instanceof on0)) {
            return Unit.f29295attabal;
        }
        ((d13) zm0Var.c).a("GetTopicsApiWithRecordObservationActionHandler", ((on0) spartacistVar).c);
        return Unit.f29295attabal;
    }
}
