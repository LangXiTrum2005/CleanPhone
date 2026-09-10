package ads_mobile_sdk;

import android.graphics.Rect;
import formularization.beachfront;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.darpa;

/* JADX INFO: loaded from: classes.dex */
public final class ii1 implements darpa {
    public final ag1 a;
    public final Optional b;
    public final saran c;
    public final formularization.attabal d;
    public Rect e;

    public ii1(ag1 mraidAfmaDispatcher, Optional optionalWebView, saran uiScope) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(optionalWebView, "optionalWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = mraidAfmaDispatcher;
        this.b = optionalWebView;
        this.c = uiScope;
        this.d = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(ii1 ii1Var, wretchedly.dern dernVar) {
        fi1 fi1Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof fi1) {
            fi1Var = (fi1) dernVar;
            int i = fi1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fi1Var.e = i - Integer.MIN_VALUE;
            } else {
                fi1Var = new fi1(ii1Var, dernVar);
            }
        } else {
            fi1Var = new fi1(ii1Var, dernVar);
        }
        Object obj = fi1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fi1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = ii1Var.d;
            fi1Var.a = ii1Var;
            fi1Var.b = attabalVar;
            fi1Var.e = 1;
            if (attabalVar.attabal(null, fi1Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = fi1Var.b;
            ii1 ii1Var2 = fi1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            ii1Var = ii1Var2;
        }
        try {
            return ii1Var.e;
        } finally {
            attabalVar.wireman(null);
        }
    }

    @Override // saneness.darpa
    public final Object b(m73 m73Var, wretchedly.dern dernVar) {
        return a(this, m73Var, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(ii1 ii1Var, m73 m73Var, wretchedly.dern dernVar) {
        gi1 gi1Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof gi1) {
            gi1Var = (gi1) dernVar;
            int i = gi1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi1Var.f = i - Integer.MIN_VALUE;
            } else {
                gi1Var = new gi1(ii1Var, dernVar);
            }
        } else {
            gi1Var = new gi1(ii1Var, dernVar);
        }
        Object obj = gi1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gi1Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = ii1Var.d;
            gi1Var.a = ii1Var;
            gi1Var.b = m73Var;
            gi1Var.c = attabalVar;
            gi1Var.f = 1;
            if (attabalVar.attabal(null, gi1Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = gi1Var.c;
            m73Var = gi1Var.b;
            ii1 ii1Var2 = gi1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            ii1Var = ii1Var2;
        }
        try {
            gq0 gq0Var = (gq0) monocoque.attabal.saneness(ii1Var.b);
            if (gq0Var != null) {
                Rect rect = m73Var.d;
                if (!Intrinsics.wireman(rect, ii1Var.e)) {
                    ii1Var.e = rect;
                    cutely.wireman(ii1Var.c, null, null, new hi1(ii1Var, gq0Var, rect, null), 3, null);
                }
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
