package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class h01 implements coi {
    public final coffeecake a;

    public h01(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        m11 inspectorStorageGmsgHandler = (m11) this.a.get();
        Intrinsics.checkNotNullParameter(inspectorStorageGmsgHandler, "inspectorStorageGmsgHandler");
        return new a01(inspectorStorageGmsgHandler);
    }
}
