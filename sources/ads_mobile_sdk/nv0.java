package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class nv0 implements portwide {
    public final vg a;

    public nv0(vg appState) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.a = appState;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.IN_MEMORY_SDK_CORE_DATA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        mv0 mv0Var;
        if (dernVar instanceof mv0) {
            mv0Var = (mv0) dernVar;
            int i = mv0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mv0Var.c = i - Integer.MIN_VALUE;
            } else {
                mv0Var = new mv0(this, dernVar);
            }
        } else {
            mv0Var = new mv0(this, dernVar);
        }
        Object objA = mv0Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mv0Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            vg vgVar = this.a;
            mv0Var.c = 1;
            vgVar.getClass();
            objA = vg.a(vgVar, mv0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        return new tn0(new lv0((Map) objA));
    }
}
