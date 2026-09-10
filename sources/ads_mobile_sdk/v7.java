package ads_mobile_sdk;

import formularization.beachfront;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.anaphylactin;
import saneness.hawkthorn;

/* JADX INFO: loaded from: classes.dex */
public final class v7 extends ff0 implements anaphylactin, hawkthorn {
    public final formularization.attabal c;
    public m73 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(saran uiScope, Map listeners) {
        super(uiScope, listeners);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.c = beachfront.saneness(false, 1, null);
    }

    @Override // saneness.anaphylactin
    public final Object a(m73 m73Var, wretchedly.dern dernVar) {
        return a(this, m73Var, dernVar);
    }

    @Override // saneness.hawkthorn
    public final Object c(m73 m73Var, wretchedly.dern dernVar) {
        Object objA = a(this, m73Var, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static Object a(v7 v7Var, m73 m73Var, wretchedly.dern dernVar) {
        t7 t7Var;
        formularization.attabal attabalVar;
        m73 m73Var2;
        v7 v7Var2 = v7Var;
        if (dernVar instanceof t7) {
            t7Var = (t7) dernVar;
            int i = t7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                t7Var.f = i - Integer.MIN_VALUE;
            } else {
                t7Var = new t7(v7Var2, dernVar);
            }
        } else {
            t7Var = new t7(v7Var2, dernVar);
        }
        Object obj = t7Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = t7Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = v7Var2.c;
            t7Var.a = v7Var2;
            t7Var.b = m73Var;
            t7Var.c = attabalVar;
            t7Var.f = 1;
            if (attabalVar.attabal(null, t7Var) == objBeachfront) {
                return objBeachfront;
            }
            m73Var2 = m73Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = t7Var.c;
            m73 m73Var3 = t7Var.b;
            v7 v7Var3 = t7Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            v7Var2 = v7Var3;
            m73Var2 = m73Var3;
        }
        try {
            m73 m73Var4 = v7Var2.d;
            if (m73Var4 != null && Intrinsics.wireman(m73Var2, m73Var4)) {
                return Unit.f29295attabal;
            }
            v7Var2.d = m73Var2;
            for (Map.Entry entry : v7Var2.b.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                saran saranVar = v7Var2.a;
                u7 block = new u7("onViewabilityEvent", str, value, null, m73Var2);
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
}
