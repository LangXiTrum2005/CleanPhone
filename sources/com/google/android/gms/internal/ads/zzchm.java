package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class zzchm extends zzgt {
    private final Context zza;
    private final zzhb zzb;
    private final zzchk zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbev zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private ListenableFuture zzp;
    private final AtomicLong zzq;

    public zzchm(Context context, zzhb zzhbVar, String str, int i2, zzhz zzhzVar, zzchk zzchkVar) {
        super(false);
        this.zza = context;
        this.zzb = zzhbVar;
        this.zzc = zzchkVar;
        this.zzd = str;
        this.zze = i2;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue();
        zze(zzhzVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfk)).booleanValue() || this.zzm) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfl)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int iZza = inputStream != null ? inputStream.read(bArr, i2, i3) : this.zzb.zza(bArr, i2, i3);
        if (this.zzf && this.zzg == null) {
            return iZza;
        }
        zzh(iZza);
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws Throwable {
        zzbes zzbesVarZzc;
        Long l2;
        boolean z2;
        boolean z3;
        long jElapsedRealtime;
        StringBuilder sb;
        if (this.zzh) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z4 = true;
        this.zzh = true;
        Uri uri = zzhfVar.zza;
        this.zzi = uri;
        boolean z5 = this.zzf;
        if (z5 == 0) {
            zzg(zzhfVar);
        }
        this.zzj = zzbev.zza(uri);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfh)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzhfVar.zze;
                this.zzj.zzi = zzgqr.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzbesVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzj);
            } else {
                zzbesVarZzc = null;
            }
            if (zzbesVarZzc != null && zzbesVarZzc.zza()) {
                this.zzk = zzbesVarZzc.zzd();
                this.zzm = zzbesVarZzc.zzg();
                this.zzn = zzbesVarZzc.zze();
                this.zzo = zzbesVarZzc.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzbesVarZzc.zzb();
                    if (this.zzf) {
                        zzg(zzhfVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzhfVar.zze;
            this.zzj.zzi = zzgqr.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l2 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfj);
            } else {
                l2 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfi);
            }
            long jLongValue = l2.longValue();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future futureZza = zzbfg.zza(this.zza, this.zzj);
            try {
                try {
                    zzbfh zzbfhVar = (zzbfh) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzk = zzbfhVar.zzc();
                        this.zzm = zzbfhVar.zzd();
                        this.zzn = zzbfhVar.zzf();
                        this.zzo = zzbfhVar.zze();
                        if (!zzr()) {
                            this.zzg = zzbfhVar.zzb();
                            if (z5 != 0) {
                                zzg(zzhfVar);
                            }
                            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                            this.zzc.zza(true, jElapsedRealtime3);
                            this.zzl = true;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                            sb2.append("Cache connection took ");
                            sb2.append(jElapsedRealtime3);
                            sb2.append("ms");
                            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                            return -1L;
                        }
                        long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(true, jElapsedRealtime4);
                        this.zzl = true;
                        sb = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime4);
                    } catch (InterruptedException unused) {
                        z3 = true;
                        futureZza.cancel(true);
                        Thread.currentThread().interrupt();
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(z3, jElapsedRealtime);
                        this.zzl = z3;
                        int length = String.valueOf(jElapsedRealtime).length() + 24;
                        sb = new StringBuilder(length);
                        z5 = length;
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z2 = true;
                        futureZza.cancel(true);
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(z2, jElapsedRealtime);
                        this.zzl = z2;
                        int length2 = String.valueOf(jElapsedRealtime).length() + 24;
                        sb = new StringBuilder(length2);
                        z5 = length2;
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                    } catch (Throwable th) {
                        th = th;
                        long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime2;
                        this.zzc.zza(z4, jElapsedRealtime5);
                        this.zzl = z4;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                        sb3.append("Cache connection took ");
                        sb3.append(jElapsedRealtime5);
                        sb3.append("ms");
                        com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                        throw th;
                    }
                } catch (InterruptedException unused3) {
                    z3 = false;
                } catch (ExecutionException | TimeoutException unused4) {
                    z2 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z4 = false;
                }
                sb.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            } catch (Throwable th3) {
                th = th3;
                z4 = z5;
            }
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzhe zzheVarZzb = zzhfVar.zzb();
            zzheVarZzb.zza(Uri.parse(this.zzj.zza));
            zzhfVar = zzheVarZzb.zze();
        }
        return this.zzb.zzb(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z2 = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z2) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzp() {
        if (this.zzj != null) {
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.zzp == null) {
                        this.zzp = zzcdo.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzchl
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzq();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzq() {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().zzd(this.zzj));
    }
}
