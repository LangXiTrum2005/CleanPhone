package ads_mobile_sdk;

import formularization.beachfront;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.darpa;

/* JADX INFO: loaded from: classes.dex */
public final class wa3 extends ff0 implements darpa {
    public final formularization.attabal c;
    public Boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa3(saran uiScope, Map listeners) {
        super(uiScope, listeners);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.c = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // saneness.darpa
    public final Object b(m73 m73Var, wretchedly.dern dernVar) {
        ta3 ta3Var;
        m73 m73Var2;
        formularization.attabal attabalVar;
        wa3 wa3Var;
        if (dernVar instanceof ta3) {
            ta3Var = (ta3) dernVar;
            int i = ta3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta3Var.f = i - Integer.MIN_VALUE;
            } else {
                ta3Var = new ta3(this, dernVar);
            }
        } else {
            ta3Var = new ta3(this, dernVar);
        }
        Object obj = ta3Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ta3Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.c;
            ta3Var.a = this;
            m73Var2 = m73Var;
            ta3Var.b = m73Var2;
            ta3Var.c = attabalVar2;
            ta3Var.f = 1;
            if (attabalVar2.attabal(null, ta3Var) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
            wa3Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = ta3Var.c;
            m73Var2 = ta3Var.b;
            wa3Var = ta3Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (m73Var2.b && !Intrinsics.wireman(wa3Var.d, igo.attabal.attabal(true))) {
                for (Map.Entry entry : wa3Var.b.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    saran saranVar = wa3Var.a;
                    ua3 block = new ua3("onVisibilityChanged (true)", str, value, null);
                    EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar, "<this>");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(block, "block");
                    cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                }
            } else if (!m73Var2.b && !Intrinsics.wireman(wa3Var.d, igo.attabal.attabal(false))) {
                for (Map.Entry entry2 : wa3Var.b.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Object value2 = entry2.getValue();
                    saran saranVar2 = wa3Var.a;
                    va3 block2 = new va3("onVisibilityChanged (false)", str2, value2, null);
                    EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(block2, "block");
                    cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
                }
            }
            wa3Var.d = igo.attabal.attabal(m73Var2.b);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
