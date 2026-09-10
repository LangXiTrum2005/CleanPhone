package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o90 implements ta0, oa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du0 f18204a;

    public o90(du0 du0Var) {
        this.f18204a = du0Var;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        lw lwVar = this.f18204a.f13682d0;
        if (lwVar == null || !lwVar.f17135a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = (String) lwVar.f17137c;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void C(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void a(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void zza(Context context) {
    }
}
