package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class zo1 implements hemolysin {
    public final hemolysin a;

    public zo1(hemolysin gmsgHandler) {
        Intrinsics.checkNotNullParameter(gmsgHandler, "gmsgHandler");
        this.a = gmsgHandler;
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
        return this.a.d();
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        return this.a.a(gq0Var, map, dernVar);
    }

    @Override // saneness.hemolysin
    public final void a(String adKey) {
        Intrinsics.checkNotNullParameter(adKey, "adKey");
        this.a.a(adKey);
    }
}
