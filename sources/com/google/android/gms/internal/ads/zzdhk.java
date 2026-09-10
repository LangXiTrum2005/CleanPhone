package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdhk implements zzher {
    private final zzhfj zza;

    public zzdhk(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZza = ((zzchs) this.zza).zza();
        com.google.android.gms.ads.internal.zzv.zzq();
        return new zzayg(UUID.randomUUID().toString(), versionInfoParcelZza, "native", new JSONObject(), false, true);
    }
}
