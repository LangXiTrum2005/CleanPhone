package com.google.android.gms.internal.auth;

import android.content.Context;
import androidx.datastore.preferences.protobuf.a;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    public zzcd(Context context, @Nullable zzdj zzdjVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzdjVar;
    }

    public final boolean equals(Object obj) {
        zzdj zzdjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza()) && ((zzdjVar = this.zzb) != null ? zzdjVar.equals(zzdaVar.zzb()) : zzdaVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdj zzdjVar = this.zzb;
        return iHashCode ^ (zzdjVar == null ? 0 : zzdjVar.hashCode());
    }

    public final String toString() {
        return a.n("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    @Nullable
    public final zzdj zzb() {
        return this.zzb;
    }
}
