package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbah extends zzbbh {
    private static final zzbbi zzh = new zzbbi();
    private final zzavl zzi;
    private final Context zzj;
    private final zzaxn zzk;

    public zzbah(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, Context context, zzave zzaveVar, zzavl zzavlVar, zzaxn zzaxnVar) {
        super(zzaztVar, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", zzavsVar, i2, 27);
        this.zzj = context;
        this.zzi = zzavlVar;
        this.zzk = zzaxnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzaxk zzc() throws IllegalAccessException, InvocationTargetException {
        int iZzb;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdr)).booleanValue()) {
            iZzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdx)).intValue();
        } else {
            iZzb = this.zzi.zzb();
        }
        zzaxk zzaxkVar = new zzaxk((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzaxn zzaxnVar = this.zzk;
        if (zzaxnVar == null || zzaxnVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzaxnVar.zza().get(iZzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        zzaxkVar.zza = str;
        return zzaxkVar;
    }

    private final String zzd() {
        try {
            zzazt zzaztVar = this.zza;
            if (zzaztVar.zzm() != null) {
                zzaztVar.zzm().get();
            }
            zzawp zzawpVarZzl = zzaztVar.zzl();
            if (zzawpVarZzl == null || !zzawpVarZzl.zza()) {
                return null;
            }
            return zzawpVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i2;
        zzaxk zzaxkVarZzc;
        zzaxk zzaxkVar;
        zzbbi zzbbiVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzbbiVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzaxk zzaxkVar2 = (zzaxk) atomicReferenceZza.get();
                if (zzaxkVar2 == null || zzazw.zzc(zzaxkVar2.zza) || zzaxkVar2.zza.equals("E") || zzaxkVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzazw.zzc(null)) {
                        zzazw.zzc(null);
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                    if (this.zzk != null) {
                        zzaxkVarZzc = zzc();
                    } else {
                        boolean z2 = false;
                        if (i2 == 3 && !this.zzi.zza()) {
                            z2 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdf);
                        String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzde)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzi() && zzazw.zzc(strZzb)) {
                            strZzb = zzd();
                        }
                        zzaxk zzaxkVar3 = new zzaxk((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        String str = zzaxkVar3.zza;
                        if (zzazw.zzc(str) || str.equals("E")) {
                            int i3 = i2 - 1;
                            if (i3 == 3) {
                                String strZzd = zzd();
                                if (!zzazw.zzc(strZzd)) {
                                    zzaxkVar3.zza = strZzd;
                                }
                            } else if (i3 == 4) {
                                throw null;
                            }
                        }
                        zzaxkVarZzc = zzaxkVar3;
                    }
                    atomicReferenceZza.set(zzaxkVarZzc);
                }
                zzaxkVar = (zzaxk) atomicReferenceZza.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            if (zzaxkVar != null) {
                try {
                    zzavsVar.zzo(zzaxkVar.zza);
                    zzavsVar.zzu(zzaxkVar.zzb);
                    zzavsVar.zzt(zzaxkVar.zzc);
                    zzavsVar.zzD(zzaxkVar.zzd);
                    zzavsVar.zzE(zzaxkVar.zze);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrZzb = zzazw.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdg));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzazw.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdh)))));
            }
            Context context = this.zzj;
            return zzbbk.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
