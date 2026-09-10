package ads_mobile_sdk;

import formularization.beachfront;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.anaphylactin;

/* JADX INFO: loaded from: classes.dex */
public final class f8 extends ff0 implements anaphylactin {
    public final formularization.attabal c;
    public Boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(saran uiScope, Map listeners) {
        super(uiScope, listeners);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.c = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // saneness.anaphylactin
    public final Object a(m73 m73Var, wretchedly.dern dernVar) {
        c8 c8Var;
        m73 m73Var2;
        formularization.attabal attabalVar;
        f8 f8Var;
        if (dernVar instanceof c8) {
            c8Var = (c8) dernVar;
            int i = c8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8Var.f = i - Integer.MIN_VALUE;
            } else {
                c8Var = new c8(this, dernVar);
            }
        } else {
            c8Var = new c8(this, dernVar);
        }
        Object obj = c8Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c8Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.c;
            c8Var.a = this;
            m73Var2 = m73Var;
            c8Var.b = m73Var2;
            c8Var.c = attabalVar2;
            c8Var.f = 1;
            if (attabalVar2.attabal(null, c8Var) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
            f8Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c8Var.c;
            m73Var2 = c8Var.b;
            f8Var = c8Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (m73Var2.b && !Intrinsics.wireman(f8Var.d, igo.attabal.attabal(true))) {
                for (Map.Entry entry : f8Var.b.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    saran saranVar = f8Var.a;
                    d8 block = new d8("onVisibilityChanged (true)", str, value, null);
                    EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar, "<this>");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(block, "block");
                    cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                }
            } else if (!m73Var2.b && !Intrinsics.wireman(f8Var.d, igo.attabal.attabal(false))) {
                for (Map.Entry entry2 : f8Var.b.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Object value2 = entry2.getValue();
                    saran saranVar2 = f8Var.a;
                    e8 block2 = new e8("onVisibilityChanged (false)", str2, value2, null);
                    EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(block2, "block");
                    cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
                }
            }
            f8Var.d = igo.attabal.attabal(m73Var2.b);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
