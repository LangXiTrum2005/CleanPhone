package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class a32 implements hemolysin {
    public final hemolysin a;
    public String b;

    public a32(h1 adConfiguration, hemolysin gmsgHandler) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(gmsgHandler, "gmsgHandler");
        this.a = gmsgHandler;
        wx0 wx0Var = adConfiguration.H;
        this.b = wx0Var != null ? wx0Var.d : null;
    }

    @Override // saneness.hemolysin
    public final hemolysin a() {
        return this.a.a();
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return this.a.b();
    }

    @Override // saneness.hemolysin
    public final boolean c() {
        return this.a.c();
    }

    @Override // saneness.hemolysin
    public final String d() {
        return this.b;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        return this.a.a(gq0Var, map, dernVar);
    }

    @Override // saneness.hemolysin
    public final void a(String adKey) {
        Intrinsics.checkNotNullParameter(adKey, "adKey");
        this.b = adKey;
    }
}
