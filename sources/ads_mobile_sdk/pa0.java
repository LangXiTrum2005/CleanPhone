package ads_mobile_sdk;

import android.content.Context;
import complexometry.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class pa0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public pa0(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var2, h21 h21Var3, coffeecake coffeecakeVar4) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = h21Var2;
        this.f = h21Var3;
        this.g = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Context context = (Context) this.a.get();
        saran backgroundScope = (saran) this.b.get();
        ja0 debugDialogManager = (ja0) this.c.get();
        jk0 flags = (jk0) this.d.get();
        formularize baseRequest = (formularize) this.e.get();
        h1 adConfiguration = (h1) this.f.get();
        l13 traceMetaSet = (l13) this.g.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        return new oa0(context, backgroundScope, debugDialogManager, flags, baseRequest.getAdUnitId(), adConfiguration.z, adConfiguration.A, traceMetaSet);
    }
}
