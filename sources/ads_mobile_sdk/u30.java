package ads_mobile_sdk;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import saneness.evenfall;

/* JADX INFO: loaded from: classes.dex */
public final class u30 extends arytenoidectomy.dern {
    public final /* synthetic */ v30 a;

    public u30(v30 v30Var) {
        this.a = v30Var;
    }

    @Override // arytenoidectomy.dern
    public final void onNavigationEvent(int i, Bundle bundle) {
        ri2 ri2Var = this.a.c;
        no0 no0Var = no0.CUI_NAME_CUSTOM_TABS_NAVIGATION_EVENT;
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                j13.a().e().A = Integer.valueOf(i);
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(v62VarA, null);
                return;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
                    if (th instanceof TimeoutCancellationException) {
                        throw new cp0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new bn0(th);
                    }
                    if (!(th instanceof yn0)) {
                        throw new gn0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            j13.a().e().A = Integer.valueOf(i);
            Unit unit2 = Unit.f29295attabal;
            interaction.saneness.attabal(w03VarA, null);
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (th4 instanceof evenfall) {
                    throw th4;
                }
                w03VarA.a(th4);
                if (th4 instanceof TimeoutCancellationException) {
                    throw new cp0(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new bn0(th4);
                }
                if (!(th4 instanceof yn0)) {
                    throw new gn0(th4);
                }
                throw th4;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }
}
