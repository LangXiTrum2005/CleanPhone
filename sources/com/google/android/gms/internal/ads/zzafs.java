package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafs {
    public static final zzafs zza = new zzafs(0, 0);
    public final long zzb;
    public final long zzc;

    public zzafs(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafs.class == obj.getClass()) {
            zzafs zzafsVar = (zzafs) obj;
            if (this.zzb == zzafsVar.zzb && this.zzc == zzafsVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        int length = String.valueOf(j).length();
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        androidx.datastore.preferences.protobuf.a.A(sb, "[timeUs=", j, ", position=");
        return android.support.v4.media.a.j(j2, d9.i.f24752e, sb);
    }
}
