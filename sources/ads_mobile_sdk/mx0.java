package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class mx0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public mx0(hb0 hb0Var, coffeecake coffeecakeVar) {
        this.a = hb0Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        wz0 inspectorManager = (wz0) this.a.get();
        l83 webViewFactory = (l83) this.b.get();
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        return new xv0(inspectorManager, webViewFactory);
    }
}
