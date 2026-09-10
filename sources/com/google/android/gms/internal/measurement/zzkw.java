package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class zzkw {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlr zzd;
    public int zze;

    public zzkw() {
        int i2 = zzlr.zzb;
        int i3 = zznu.zza;
        this.zzd = zzlr.zza;
    }

    public static /* synthetic */ String zza(int i2, int i3, byte b2, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + b2 + String.valueOf(i2).length());
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public zzkw(zzlr zzlrVar) {
        zzlrVar.getClass();
        this.zzd = zzlrVar;
    }
}
