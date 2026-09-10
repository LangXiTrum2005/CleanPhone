package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gerenuk;
import saneness.pediatric;

/* JADX INFO: loaded from: classes.dex */
public abstract class pa1 {
    public final Map a;

    public pa1(Map modifiers) {
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        this.a = modifiers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gerenuk gerenukVar, wretchedly.dern dernVar) {
        oa1 oa1Var;
        Object obj;
        Iterator it;
        if (dernVar instanceof oa1) {
            oa1Var = (oa1) dernVar;
            int i = oa1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oa1Var.e = i - Integer.MIN_VALUE;
            } else {
                oa1Var = new oa1(this, dernVar);
            }
        } else {
            oa1Var = new oa1(this, dernVar);
        }
        Object obj2 = oa1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = oa1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            obj = gerenukVar;
            it = this.a.entrySet().iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = oa1Var.b;
            obj = oa1Var.a;
            p002kotlin.dern.saneness(obj2);
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            pediatric pediatricVar = (pediatric) entry.getValue();
            triweekly triweeklyVar = kn0.a;
            kn0.b("Configuring JsContext with modifier [" + str + X3.j.e, null);
            oa1Var.a = obj;
            oa1Var.b = it;
            oa1Var.e = 1;
            if (pediatricVar.a(obj, oa1Var) == objBeachfront) {
                return objBeachfront;
            }
        }
        return Unit.f29295attabal;
    }
}
