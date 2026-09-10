package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class kx0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public kx0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        vo chromeVariationsProvider = (vo) this.a.get();
        hobby httpClient = (hobby) this.b.get();
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        return new vv0(httpClient, chromeVariationsProvider);
    }
}
