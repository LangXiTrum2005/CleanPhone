package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class f1 extends com.startapp.sdk.adsbase.model.a {
    public boolean V0;
    public int W0;

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        veVar.a("fixedSize", Boolean.valueOf(this.V0), false, true);
        veVar.a("bnrt", Integer.valueOf(this.W0), false, true);
    }

    @Override // com.startapp.sdk.adsbase.model.a
    public final void f(Context context) {
        sg sgVar = (sg) com.startapp.sdk.components.a.a(context).f40740l.a();
        AdPreferences.Placement placement = this.j0;
        this.z0 = placement == null ? null : (String) sgVar.f41489a.get(new rg(placement, this.W0));
    }
}
