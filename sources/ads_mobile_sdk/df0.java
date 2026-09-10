package ads_mobile_sdk;

import com.google.common.base.formularize;
import java.lang.reflect.Method;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class df0 extends ys2 {
    public final j5 f;

    public df0(bochum bochumVar, counters countersVar, j5 j5Var, u13 u13Var) {
        super("8gAS/A1rP/maw1j5pWBsTafLfv+Gse49Dkh73OyyM9dJ7/Vivkw2o0O9gRvYvrr+", "Z6o/zW/HLpwnPc2p04aS8BaRhxwKWwAe6PZoATm0bac=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_ENV_VERSION_SIGNALS_TASK));
        this.f = j5Var;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", this.f.D()));
        synchronized (bochumVar) {
            bochumVar.stratoscope((String) objArr[0]);
            bochumVar.preprohormone((String) objArr[1]);
        }
    }
}
