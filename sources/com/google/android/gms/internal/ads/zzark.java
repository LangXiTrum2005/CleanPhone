package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzark implements Comparable {
    private final zzarv zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaro zzf;
    private Integer zzg;
    private zzarn zzh;
    private boolean zzi;
    private zzaqt zzj;
    private zzarj zzk;
    private final zzaqy zzl;

    public zzark(int i2, String str, zzaro zzaroVar) {
        Uri uri;
        String host;
        this.zza = zzarv.zza ? new zzarv() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i2;
        this.zzc = str;
        this.zzf = zzaroVar;
        this.zzl = new zzaqy();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzark) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        androidx.media3.extractor.text.ttml.a.C(sb, "[ ] ", str, " ", strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzarv.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzd(String str) {
        zzarn zzarnVar = this.zzh;
        if (zzarnVar != null) {
            zzarnVar.zzc(this);
        }
        if (zzarv.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzari(this, str, id));
                return;
            }
            zzarv zzarvVar = this.zza;
            zzarvVar.zza(str, id);
            zzarvVar.zzb(toString());
        }
    }

    public final void zze(int i2) {
        zzarn zzarnVar = this.zzh;
        if (zzarnVar != null) {
            zzarnVar.zzd(this, i2);
        }
    }

    public final zzark zzf(zzarn zzarnVar) {
        this.zzh = zzarnVar;
        return this;
    }

    public final zzark zzg(int i2) {
        this.zzg = Integer.valueOf(i2);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i2 = this.zzb;
        String str = this.zzc;
        if (i2 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return android.support.v4.media.a.s(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, TokenBuilder.TOKEN_DELIMITER, str);
    }

    public final zzark zzj(zzaqt zzaqtVar) {
        this.zzj = zzaqtVar;
        return this;
    }

    public final zzaqt zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzaqs {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzaqs {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z2;
        synchronized (this.zze) {
            z2 = this.zzi;
        }
        return z2;
    }

    public abstract zzarq zzr(zzarg zzargVar);

    public abstract void zzs(Object obj);

    public final void zzt(zzart zzartVar) {
        zzaro zzaroVar;
        synchronized (this.zze) {
            zzaroVar = this.zzf;
        }
        zzaroVar.zza(zzartVar);
    }

    public final void zzu(zzarj zzarjVar) {
        synchronized (this.zze) {
            this.zzk = zzarjVar;
        }
    }

    public final void zzv(zzarq zzarqVar) {
        zzarj zzarjVar;
        synchronized (this.zze) {
            zzarjVar = this.zzk;
        }
        if (zzarjVar != null) {
            zzarjVar.zza(this, zzarqVar);
        }
    }

    public final void zzw() {
        zzarj zzarjVar;
        synchronized (this.zze) {
            zzarjVar = this.zzk;
        }
        if (zzarjVar != null) {
            zzarjVar.zzb(this);
        }
    }

    public final /* synthetic */ zzarv zzx() {
        return this.zza;
    }

    public final zzaqy zzy() {
        return this.zzl;
    }
}
