package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class lx0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public lx0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        k63 userAgentProviderImpl = (k63) this.a.get();
        saran backgroundScope = (saran) this.b.get();
        saran webViewInitializationScope = (saran) this.c.get();
        ri2 rootTraceCreator = (ri2) this.d.get();
        jk0 flags = (jk0) this.e.get();
        Intrinsics.checkNotNullParameter(userAgentProviderImpl, "userAgentProviderImpl");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(webViewInitializationScope, "webViewInitializationScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new wv0(userAgentProviderImpl, backgroundScope, webViewInitializationScope, rootTraceCreator, flags);
    }
}
