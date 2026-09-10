package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class t32 implements hemolysin {
    public final h1 a;
    public final hemolysin b;

    public t32(h1 adConfiguration, hemolysin gmsgHandler) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(gmsgHandler, "gmsgHandler");
        this.a = adConfiguration;
        this.b = gmsgHandler;
    }

    @Override // saneness.hemolysin
    public final hemolysin a() {
        return this.b.a();
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return this.b.b();
    }

    @Override // saneness.hemolysin
    public final boolean c() {
        return this.b.c();
    }

    @Override // saneness.hemolysin
    public final String d() {
        wx0 wx0Var = this.a.H;
        if (wx0Var != null) {
            return wx0Var.d;
        }
        return null;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        return this.b.a(gq0Var, map, dernVar);
    }

    @Override // saneness.hemolysin
    public final void a(String adKey) {
        Intrinsics.checkNotNullParameter(adKey, "adKey");
        this.b.a(adKey);
    }
}
