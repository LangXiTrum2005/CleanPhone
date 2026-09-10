package ads_mobile_sdk;

import com.ironsource.C3414a2;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.storiette;

/* JADX INFO: loaded from: classes.dex */
public final class ly0 implements hemolysin {
    public final storiette a;

    public ly0(storiette backButtonStateDelegate) {
        Intrinsics.checkNotNullParameter(backButtonStateDelegate, "backButtonStateDelegate");
        this.a = backButtonStateDelegate;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get(C3414a2.e);
        ((uh) this.a).a.set(!(str != null && Boolean.parseBoolean(str)));
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_BACK_BUTTON;
    }
}
