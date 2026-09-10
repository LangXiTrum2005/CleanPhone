package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uq implements zzaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zza f20858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f20859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f20860e;

    public uq(vq vqVar, boolean z10, zza zzaVar, HashMap map, Map map2) {
        this.f20857b = z10;
        this.f20858c = zzaVar;
        this.f20859d = map;
        this.f20860e = map2;
        Objects.requireNonNull(vqVar);
        this.f20856a = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z10) {
        if (this.f20856a) {
            return;
        }
        zza zzaVar = this.f20858c;
        if (z10 && this.f20857b) {
            ((qc0) zzaVar).C();
        }
        this.f20856a = true;
        String str = (String) this.f20860e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z10);
        HashMap map = this.f20859d;
        map.put(str, boolValueOf);
        ((is) zzaVar).e("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i10) {
    }
}
