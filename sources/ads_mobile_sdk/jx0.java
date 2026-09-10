package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class jx0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public jx0(hb0 hb0Var, coffeecake coffeecakeVar) {
        this.a = hb0Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        wz0 inspectorManager = (wz0) this.a.get();
        hobby httpClient = (hobby) this.b.get();
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        return new uv0(inspectorManager, httpClient);
    }
}
