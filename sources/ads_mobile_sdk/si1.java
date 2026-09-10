package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.idolatry;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class si1 implements idolatry {
    public final /* synthetic */ idolatry a;
    public final /* synthetic */ ti1 b;

    public si1(idolatry idolatryVar, ti1 ti1Var) {
        this.a = idolatryVar;
        this.b = ti1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.idolatry
    public final Object a(String str, int i, wretchedly.dern dernVar) {
        ri1 ri1Var;
        si1 si1Var;
        if (dernVar instanceof ri1) {
            ri1Var = (ri1) dernVar;
            int i2 = ri1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ri1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                ri1Var = new ri1(this, dernVar);
            }
        } else {
            ri1Var = new ri1(this, dernVar);
        }
        Object objA = ri1Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = ri1Var.d;
        if (i3 == 0) {
            p002kotlin.dern.saneness(objA);
            idolatry idolatryVar = this.a;
            ri1Var.a = this;
            ri1Var.d = 1;
            objA = idolatryVar.a(str, i, ri1Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            si1Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            si1Var = ri1Var.a;
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar instanceof nn0) {
            return (nn0) spartacistVar;
        }
        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        return new tn0(new qi1((kotlinx.coroutines.flow.dern) ((tn0) spartacistVar).b, si1Var.b));
    }

    @Override // saneness.idolatry
    public final boolean b() {
        return this.a.b();
    }
}
