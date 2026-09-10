package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaki implements zzafv {
    public static final zzaki zza = new zzaki(true);
    public static final zzaki zzb = new zzaki(false);
    public final boolean zzc;

    private zzaki(boolean z2) {
        this.zzc = z2;
    }

    public final String toString() {
        boolean z2 = !this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
