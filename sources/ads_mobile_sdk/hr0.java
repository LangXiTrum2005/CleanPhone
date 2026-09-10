package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gerenuk;
import saneness.hemolysin;
import saneness.pediatric;

/* JADX INFO: loaded from: classes.dex */
public final class hr0 implements pediatric {
    public final Map a;

    public hr0(Map handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.a = handlers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gerenuk gerenukVar, wretchedly.dern dernVar) {
        gr0 gr0Var;
        gerenuk gerenukVar2;
        Iterator it;
        if (dernVar instanceof gr0) {
            gr0Var = (gr0) dernVar;
            int i = gr0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gr0Var.e = i - Integer.MIN_VALUE;
            } else {
                gr0Var = new gr0(this, dernVar);
            }
        } else {
            gr0Var = new gr0(this, dernVar);
        }
        Object obj = gr0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gr0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            gerenukVar2 = gerenukVar;
            it = this.a.entrySet().iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = gr0Var.b;
            gerenukVar2 = gr0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            hemolysin hemolysinVar = (hemolysin) entry.getValue();
            triweekly triweeklyVar = kn0.a;
            kn0.b("Installing gmsg handler for [" + str + "] adKey: [" + hemolysinVar.d() + X3.j.e, null);
            gr0Var.a = gerenukVar2;
            gr0Var.b = it;
            gr0Var.e = 1;
            if (gerenukVar2.a(str, hemolysinVar, gr0Var) == objBeachfront) {
                return objBeachfront;
            }
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.pediatric
    public final /* bridge */ /* synthetic */ Object a(Object obj, oa1 oa1Var) {
        return a((gerenuk) obj, (wretchedly.dern) oa1Var);
    }
}
