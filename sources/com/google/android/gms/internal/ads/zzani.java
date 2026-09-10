package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzani {
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.EMPTY_SET;
    private String zzd = "";
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public final void zza(String str) {
        this.zza = str;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public final void zzc(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public final int zze(String str, String str2, Set set, String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + iZzA;
    }

    public final int zzf() {
        int i2 = this.zzk;
        if (i2 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final boolean zzg() {
        return this.zzj == 1;
    }

    public final zzani zzh(boolean z2) {
        this.zzj = 1;
        return this;
    }

    public final zzani zzi(boolean z2) {
        this.zzk = 1;
        return this;
    }

    public final zzani zzj(boolean z2) {
        this.zzl = 1;
        return this;
    }

    public final String zzk() {
        return this.zze;
    }

    public final zzani zzl(String str) {
        this.zze = zzgpj.zza(str);
        return this;
    }

    public final int zzm() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final zzani zzn(int i2) {
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    public final boolean zzo() {
        return this.zzg;
    }

    public final int zzp() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final zzani zzq(int i2) {
        this.zzh = i2;
        this.zzi = true;
        return this;
    }

    public final boolean zzr() {
        return this.zzi;
    }

    public final zzani zzs(float f) {
        this.zzn = f;
        return this;
    }

    public final zzani zzt(int i2) {
        this.zzm = i2;
        return this;
    }

    public final int zzu() {
        return this.zzm;
    }

    public final float zzv() {
        return this.zzn;
    }

    public final zzani zzw(int i2) {
        this.zzo = i2;
        return this;
    }

    public final int zzx() {
        return this.zzo;
    }

    public final zzani zzy(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final boolean zzz() {
        return this.zzp;
    }
}
