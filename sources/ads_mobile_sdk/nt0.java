package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.blighty;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class nt0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public nt0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = h21Var;
        this.e = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        jk0 flags = (jk0) this.a.get();
        ns concurrencyObjects = (ns) this.b.get();
        blighty userAgentProvider = (blighty) this.c.get();
        Context context = (Context) this.d.get();
        tt0 httpClientProvider = (tt0) this.e.get();
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        return new mt0(flags, concurrencyObjects.c, userAgentProvider, context, httpClientProvider);
    }
}
