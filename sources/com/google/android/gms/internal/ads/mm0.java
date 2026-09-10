package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 implements q81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17475a;

    public /* synthetic */ mm0(Context context) {
        this.f17475a = context;
    }

    public ListenableFuture a(boolean z10) {
        try {
            t9.e.k(this.f17475a);
            return zw1.l(new IllegalStateException());
        } catch (Exception e10) {
            return zw1.l(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.q81
    public Object zza() {
        int i10 = fy1.f14575z;
        new j2();
        new q5(5);
        this.f17475a.getApplicationContext();
        b02 b02Var = new b02(29);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
        return b02Var;
    }
}
