package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.IOUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzl extends zzbux {
    private final Context zza;
    private final zzgcs zzb;
    private final zzdzt zzc;
    private final zzckx zzd;
    private final ArrayDeque zze;
    private final zzfhk zzf;
    private final zzbvs zzg;

    public zzdzl(Context context, zzgcs zzgcsVar, zzbvs zzbvsVar, zzckx zzckxVar, zzdzt zzdztVar, ArrayDeque arrayDeque, zzdzq zzdzqVar, zzfhk zzfhkVar) {
        zzbcl.zza(context);
        this.zza = context;
        this.zzb = zzgcsVar;
        this.zzg = zzbvsVar;
        this.zzc = zzdztVar;
        this.zzd = zzckxVar;
        this.zze = arrayDeque;
        this.zzf = zzfhkVar;
    }

    @Nullable
    private final synchronized zzdzi zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdzi zzdziVar = (zzdzi) it.next();
            if (zzdziVar.zzc.equals(str)) {
                it.remove();
                return zzdziVar;
            }
        }
        return null;
    }

    private static AI zzm(AI ai, zzfgn zzfgnVar, zzbog zzbogVar, zzfhh zzfhhVar, zzfgw zzfgwVar) {
        zzbnw zzbnwVarZza = zzbogVar.zza("AFMA_getAdDictionary", zzbod.zza, new zzbny() { // from class: com.google.android.gms.internal.ads.zzdzc
            @Override // com.google.android.gms.internal.ads.zzbny
            public final Object zza(JSONObject jSONObject) {
                return new zzbvm(jSONObject);
            }
        });
        zzfhg.zzd(ai, zzfgwVar);
        zzfft zzfftVarZza = zzfgnVar.zzb(zzfgh.BUILD_URL, ai).zzf(zzbnwVarZza).zza();
        zzfhg.zzc(zzfftVarZza, zzfhhVar, zzfgwVar);
        return zzfftVarZza;
    }

    private static AI zzn(final zzbvk zzbvkVar, zzfgn zzfgnVar, final zzeuu zzeuuVar) {
        zzgbo zzgboVar = new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzeuuVar.zzb().zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((Bundle) obj), zzbvkVar.zzm, false);
            }
        };
        return zzfgnVar.zzb(zzfgh.GMS_SIGNALS, zzgch.zzh(zzbvkVar.zza)).zzf(zzgboVar).zze(new zzffr() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzo(zzdzi zzdziVar) {
        zzp();
        this.zze.addLast(zzdziVar);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbes.zzb.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(AI ai, zzbvc zzbvcVar, zzbvk zzbvkVar) {
        zzgch.zzr(zzgch.zzn(ai, new zzgbo(this) { // from class: com.google.android.gms.internal.ads.zzdzd
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) throws IOException {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdj
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } catch (Throwable th) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused) {
                            }
                        } catch (Throwable th3) {
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    }
                });
                return zzgch.zzh(parcelFileDescriptor);
            }
        }, zzbzw.zza), new zzdzh(this, zzbvkVar, zzbvcVar), zzbzw.zzg);
    }

    public final AI zzb(final zzbvk zzbvkVar, int i) {
        if (!((Boolean) zzbes.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Split request is disabled."));
        }
        zzfed zzfedVar = zzbvkVar.zzi;
        if (zzfedVar == null) {
            return zzgch.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfedVar.zzc == 0 || zzfedVar.zzd == 0) {
            return zzgch.zzg(new Exception("Caching is disabled."));
        }
        zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeuu zzeuuVarZzr = this.zzd.zzr(zzbvkVar, i);
        zzfgn zzfgnVarZzc = zzeuuVarZzr.zzc();
        final AI aiZzn = zzn(zzbvkVar, zzfgnVarZzc, zzeuuVarZzr);
        zzfhh zzfhhVarZzd = zzeuuVarZzr.zzd();
        final zzfgw zzfgwVarZza = zzfgv.zza(this.zza, 9);
        final AI aiZzm = zzm(aiZzn, zzfgnVarZzc, zzbogVarZzb, zzfhhVarZzd, zzfgwVarZza);
        return zzfgnVarZzc.zza(zzfgh.GET_URL_AND_CACHE_KEY, aiZzn, aiZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzk(aiZzm, aiZzn, zzbvkVar, zzfgwVarZza);
            }
        }).zza();
    }

    public final AI zzc(final zzbvk zzbvkVar, int i) {
        zzdzi zzdziVarZzl;
        zzfft zzfftVarZza;
        zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeuu zzeuuVarZzr = this.zzd.zzr(zzbvkVar, i);
        zzbnw zzbnwVarZza = zzbogVarZzb.zza("google.afma.response.normalize", zzdzk.zza, zzbod.zzb);
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            zzdziVarZzl = zzl(zzbvkVar.zzh);
            if (zzdziVarZzl == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbvkVar.zzj;
            zzdziVarZzl = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfgw zzfgwVarZza = zzdziVarZzl == null ? zzfgv.zza(this.zza, 9) : zzdziVarZzl.zzd;
        zzfhh zzfhhVarZzd = zzeuuVarZzr.zzd();
        zzfhhVarZzd.zzd(zzbvkVar.zza.getStringArrayList("ad_types"));
        zzdzs zzdzsVar = new zzdzs(zzbvkVar.zzg, zzfhhVarZzd, zzfgwVarZza);
        zzdzp zzdzpVar = new zzdzp(this.zza, zzbvkVar.zzb.afmaVersion, this.zzg, i);
        zzfgn zzfgnVarZzc = zzeuuVarZzr.zzc();
        zzfgw zzfgwVarZza2 = zzfgv.zza(this.zza, 11);
        if (zzdziVarZzl == null) {
            final AI aiZzn = zzn(zzbvkVar, zzfgnVarZzc, zzeuuVarZzr);
            final AI aiZzm = zzm(aiZzn, zzfgnVarZzc, zzbogVarZzb, zzfhhVarZzd, zzfgwVarZza);
            zzfgw zzfgwVarZza3 = zzfgv.zza(this.zza, 10);
            final zzfft zzfftVarZza2 = zzfgnVarZzc.zza(zzfgh.HTTP, aiZzm, aiZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbvk zzbvkVar2;
                    Bundle bundle;
                    zzbvm zzbvmVar = (zzbvm) aiZzm.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (bundle = (zzbvkVar2 = zzbvkVar).zzm) != null) {
                        bundle.putLong(zzdre.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvmVar.zzc());
                        zzbvkVar2.zzm.putLong(zzdre.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvmVar.zzb());
                    }
                    return new zzdzr((JSONObject) aiZzn.get(), zzbvmVar);
                }
            }).zze(zzdzsVar).zze(new zzfhc(zzfgwVarZza3)).zze(zzdzpVar).zza();
            zzfhg.zza(zzfftVarZza2, zzfhhVarZzd, zzfgwVarZza3);
            zzfhg.zzd(zzfftVarZza2, zzfgwVarZza2);
            zzfftVarZza = zzfgnVarZzc.zza(zzfgh.PRE_PROCESS, aiZzn, aiZzm, zzfftVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (bundle = zzbvkVar.zzm) != null) {
                        AbstractC3888ke0.o(bundle, zzdre.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzdzk((zzdzo) zzfftVarZza2.get(), (JSONObject) aiZzn.get(), (zzbvm) aiZzm.get());
                }
            }).zzf(zzbnwVarZza).zza();
        } else {
            zzdzr zzdzrVar = new zzdzr(zzdziVarZzl.zzb, zzdziVarZzl.zza);
            zzfgw zzfgwVarZza4 = zzfgv.zza(this.zza, 10);
            final zzfft zzfftVarZza3 = zzfgnVarZzc.zzb(zzfgh.HTTP, zzgch.zzh(zzdzrVar)).zze(zzdzsVar).zze(new zzfhc(zzfgwVarZza4)).zze(zzdzpVar).zza();
            zzfhg.zza(zzfftVarZza3, zzfhhVarZzd, zzfgwVarZza4);
            final AI aiZzh = zzgch.zzh(zzdziVarZzl);
            zzfhg.zzd(zzfftVarZza3, zzfgwVarZza2);
            zzfftVarZza = zzfgnVarZzc.zza(zzfgh.PRE_PROCESS, zzfftVarZza3, aiZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdzo zzdzoVar = (zzdzo) zzfftVarZza3.get();
                    AI ai = aiZzh;
                    return new zzdzk(zzdzoVar, ((zzdzi) ai.get()).zzb, ((zzdzi) ai.get()).zza);
                }
            }).zzf(zzbnwVarZza).zza();
        }
        zzfhg.zza(zzfftVarZza, zzfhhVarZzd, zzfgwVarZza2);
        return zzfftVarZza;
    }

    public final AI zzd(final zzbvk zzbvkVar, int i) {
        zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbex.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Signal collection disabled."));
        }
        zzeuu zzeuuVarZzr = this.zzd.zzr(zzbvkVar, i);
        final zzetu zzetuVarZza = zzeuuVarZzr.zza();
        zzbnw zzbnwVarZza = zzbogVarZzb.zza("google.afma.request.getSignals", zzbod.zza, zzbod.zzb);
        zzfgw zzfgwVarZza = zzfgv.zza(this.zza, 22);
        zzfft zzfftVarZza = zzeuuVarZzr.zzc().zzb(zzfgh.GET_SIGNALS, zzgch.zzh(zzbvkVar.zza)).zze(new zzfhc(zzfgwVarZza)).zzf(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) throws JSONException {
                return zzetuVarZza.zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((Bundle) obj), zzbvkVar.zzm, false);
            }
        }).zzb(zzfgh.JS_SIGNALS).zzf(zzbnwVarZza).zza();
        zzfhh zzfhhVarZzd = zzeuuVarZzr.zzd();
        zzfhhVarZzd.zzd(zzbvkVar.zza.getStringArrayList("ad_types"));
        zzfhhVarZzd.zzf(zzbvkVar.zza.getBundle("extras"));
        zzfhg.zzb(zzfftVarZza, zzfhhVarZzd, zzfgwVarZza);
        if (((Boolean) zzbel.zzf.zze()).booleanValue()) {
            zzdzt zzdztVar = this.zzc;
            Objects.requireNonNull(zzdztVar);
            zzfftVarZza.addListener(new zzdzb(zzdztVar), this.zzb);
        }
        return zzfftVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zze(zzbvk zzbvkVar, zzbvc zzbvcVar) {
        zzq(zzb(zzbvkVar, Binder.getCallingUid()), zzbvcVar, zzbvkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzf(zzbvk zzbvkVar, zzbvc zzbvcVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (bundle = zzbvkVar.zzm) != null) {
            AbstractC3888ke0.o(bundle, zzdre.SERVICE_CONNECTED.zza());
        }
        zzq(zzd(zzbvkVar, Binder.getCallingUid()), zzbvcVar, zzbvkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzg(zzbvk zzbvkVar, zzbvc zzbvcVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (bundle = zzbvkVar.zzm) != null) {
            AbstractC3888ke0.o(bundle, zzdre.SERVICE_CONNECTED.zza());
        }
        AI aiZzc = zzc(zzbvkVar, Binder.getCallingUid());
        zzq(aiZzc, zzbvcVar, zzbvkVar);
        if (((Boolean) zzbel.zze.zze()).booleanValue()) {
            zzdzt zzdztVar = this.zzc;
            Objects.requireNonNull(zzdztVar);
            aiZzc.addListener(new zzdzb(zzdztVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzh(String str, zzbvc zzbvcVar) {
        zzq(zzj(str), zzbvcVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(zzbuu zzbuuVar, zzbvd zzbvdVar) {
        if (((Boolean) zzbez.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbuuVar.zza;
            zzgch.zzr(zzgch.zzh(null), new zzdzf(this, zzbvdVar, zzbuuVar), zzbzw.zzg);
        } else {
            try {
                zzbvdVar.zzf("", zzbuuVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final AI zzj(String str) {
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            return zzl(str) == null ? zzgch.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgch.zzh(new zzdzg(this));
        }
        return zzgch.zzg(new Exception("Split request is disabled."));
    }

    public final /* synthetic */ InputStream zzk(AI ai, AI ai2, zzbvk zzbvkVar, zzfgw zzfgwVar) throws Exception {
        String strZze = ((zzbvm) ai.get()).zze();
        zzo(new zzdzi((zzbvm) ai.get(), (JSONObject) ai2.get(), zzbvkVar.zzh, strZze, zzfgwVar));
        return new ByteArrayInputStream(strZze.getBytes(StandardCharsets.UTF_8));
    }
}
