package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h60 implements y50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzj f15184b = zzt.zzh().g();

    public h60(Context context) {
        this.f15183a = context;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(HashMap map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z10 = Boolean.parseBoolean(str);
        this.f15184b.zzw(z10);
        if (z10) {
            zzac.zza(this.f15183a);
        }
    }
}
