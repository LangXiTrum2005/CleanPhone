package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.libya;

/* JADX INFO: loaded from: classes.dex */
public final class uh1 {
    public final ag1 a;
    public final saran b;

    public uh1(ag1 mraidAfmaDispatcher, saran uiScope) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = mraidAfmaDispatcher;
        this.b = uiScope;
    }

    public final Unit a(Map map, gq0 gq0Var) {
        String lowerCase;
        int i;
        Boolean boolLinendraper;
        libya libyaVar = gq0Var.m;
        if (libyaVar == null) {
            cutely.wireman(this.b, null, null, new sh1(this, gq0Var, null), 3, null);
            return Unit.f29295attabal;
        }
        String str = (String) map.get("forceOrientation");
        String str2 = (String) map.get("allowOrientationChange");
        boolean zBooleanValue = (str2 == null || (boolLinendraper = StringsKt.linendraper(str2)) == null) ? true : boolLinendraper.booleanValue();
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.wireman(lowerCase, X3.i.C)) {
            i = 6;
        } else if (Intrinsics.wireman(lowerCase, X3.i.D)) {
            i = 7;
        } else {
            i = zBooleanValue ? -1 : 14;
        }
        cutely.wireman(this.b, null, null, new th1(libyaVar, i, null), 3, null);
        return Unit.f29295attabal;
    }
}
