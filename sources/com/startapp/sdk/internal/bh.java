package com.startapp.sdk.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bh extends k6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vf f40838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Context context, vf prefs, z3 configProvider) {
        super(context, 86400000L);
        Intrinsics.f(context, "context");
        Intrinsics.f(prefs, "prefs");
        Intrinsics.f(configProvider, "configProvider");
        this.f40838e = prefs;
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object a(boolean z2) {
        ah ahVar = new ah();
        String string = z2 ? null : this.f40838e.getString("a83b59c2138cbf65", null);
        if (string == null) {
            Context context = this.f41177a;
            context.getPackageName();
            string = vi.b(context);
            uf ufVarEdit = this.f40838e.edit();
            ufVarEdit.a("a83b59c2138cbf65", string);
            ufVarEdit.f41545a.putString("a83b59c2138cbf65", string);
            ufVarEdit.apply();
        }
        ahVar.f40813a = string;
        return ahVar;
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object c() {
        return new ah();
    }
}
