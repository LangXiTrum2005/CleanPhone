package ads_mobile_sdk;

import formularization.beachfront;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.darpa;
import saneness.hawkthorn;

/* JADX INFO: loaded from: classes.dex */
public final class la3 extends ff0 implements darpa, hawkthorn {
    public final formularization.attabal c;
    public m73 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la3(saran uiScope, Map listeners) {
        super(uiScope, listeners);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.c = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static Object a(la3 la3Var, m73 m73Var, wretchedly.dern dernVar) {
        ja3 ja3Var;
        formularization.attabal attabalVar;
        m73 m73Var2;
        la3 la3Var2 = la3Var;
        if (dernVar instanceof ja3) {
            ja3Var = (ja3) dernVar;
            int i = ja3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ja3Var.f = i - Integer.MIN_VALUE;
            } else {
                ja3Var = new ja3(la3Var2, dernVar);
            }
        } else {
            ja3Var = new ja3(la3Var2, dernVar);
        }
        Object obj = ja3Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ja3Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = la3Var2.c;
            ja3Var.a = la3Var2;
            ja3Var.b = m73Var;
            ja3Var.c = attabalVar;
            ja3Var.f = 1;
            if (attabalVar.attabal(null, ja3Var) == objBeachfront) {
                return objBeachfront;
            }
            m73Var2 = m73Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = ja3Var.c;
            m73 m73Var3 = ja3Var.b;
            la3 la3Var3 = ja3Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            la3Var2 = la3Var3;
            m73Var2 = m73Var3;
        }
        try {
            m73 m73Var4 = la3Var2.d;
            if (m73Var4 != null && Intrinsics.wireman(m73Var2, m73Var4)) {
                return Unit.f29295attabal;
            }
            la3Var2.d = m73Var2;
            for (Map.Entry entry : la3Var2.b.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                saran saranVar = la3Var2.a;
                ka3 block = new ka3("onViewabilityEvent", str, value, null, m73Var2);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    @Override // saneness.darpa
    public final Object b(m73 m73Var, wretchedly.dern dernVar) {
        return a(this, m73Var, dernVar);
    }

    @Override // saneness.hawkthorn
    public final Object c(m73 m73Var, wretchedly.dern dernVar) {
        Object objA = a(this, m73Var, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
