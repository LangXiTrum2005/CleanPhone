package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p004ironsource.d9;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhf {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzal.zzb("media3.datasource");
    }

    public /* synthetic */ zzhf(Uri uri, long j, int i2, byte[] bArr, Map map, long j2, long j3, String str, int i3, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j2, j3, null, i3, null);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j = this.zze;
        int length2 = String.valueOf(j).length();
        long j2 = this.zzf;
        int length3 = String.valueOf(j2).length();
        int i2 = this.zzg;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i2).length() + 1);
        android.support.v4.media.a.A(sb, "DataSpec[GET ", string, ", ");
        sb.append(j);
        androidx.datastore.preferences.protobuf.a.A(sb, ", ", j2, ", null, ");
        return android.support.v4.media.a.i(i2, d9.i.f24752e, sb);
    }

    public final boolean zza(int i2) {
        return (this.zzg & i2) == i2;
    }

    public final zzhe zzb() {
        return new zzhe(this, null);
    }

    private zzhf(Uri uri, long j, int i2, byte[] bArr, Map map, long j2, long j3, String str, int i3, Object obj) {
        boolean z2 = false;
        boolean z3 = j2 >= 0;
        zzgqa.zza(z3);
        zzgqa.zza(z3);
        if (j3 > 0) {
            z2 = true;
        } else if (j3 == -1) {
            j3 = -1;
            z2 = true;
        }
        zzgqa.zza(z2);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j2;
        this.zzf = j3;
        this.zzg = i3;
    }

    @Deprecated
    public zzhf(Uri uri, long j, long j2, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }
}
