package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzefw extends zzbym {
    private final Context zza;
    private final zzgyw zzb;
    private final zzege zzc;
    private final zzcpn zzd;
    private final ArrayDeque zze;
    private final zzfnr zzf;
    private final zzbzi zzg;

    public zzefw(Context context, zzgyw zzgywVar, zzbzi zzbziVar, zzcpn zzcpnVar, zzege zzegeVar, ArrayDeque arrayDeque, zzegb zzegbVar, zzfnr zzfnrVar) {
        zzbgk.zza(context);
        this.zza = context;
        this.zzb = zzgywVar;
        this.zzg = zzbziVar;
        this.zzc = zzegeVar;
        this.zzd = zzcpnVar;
        this.zze = arrayDeque;
        this.zzf = zzfnrVar;
    }

    private static ListenableFuture zzm(final zzbza zzbzaVar, zzfmu zzfmuVar, final zzfaz zzfazVar) {
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzefk
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfazVar.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzaVar.zzm, false);
            }
        };
        return zzfmuVar.zza(zzfmo.GMS_SIGNALS, zzgym.zza(zzbzaVar.zza)).zzc(zzgxuVar).zzb(zzefl.zza).zzi();
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, zzfmu zzfmuVar, zzbsf zzbsfVar, zzfno zzfnoVar, zzfne zzfneVar) {
        zzbrv zzbrvVarZza = zzbsfVar.zza("AFMA_getAdDictionary", zzbsc.zza, zzefq.zza);
        zzfnn.zzb(listenableFuture, zzfneVar);
        zzfmb zzfmbVarZzi = zzfmuVar.zza(zzfmo.BUILD_URL, listenableFuture).zzc(zzbrvVarZza).zzi();
        zzfnn.zzf(zzfmbVarZzi, zzfnoVar, zzfneVar);
        return zzfmbVarZzi;
    }

    private final void zzo(ListenableFuture listenableFuture, zzbyr zzbyrVar, zzbza zzbzaVar) {
        zzgym.zzr(zzgym.zzj(listenableFuture, new zzgxu(this) { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgym.zza(zzfjl.zza((InputStream) obj));
            }
        }, zzcdo.zza), new zzefh(this, zzbzaVar, zzbyrVar), zzcdo.zzg);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbir.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzefr zzefrVar) {
        zzp();
        this.zze.addLast(zzefrVar);
    }

    private final synchronized zzefr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzefr zzefrVar = (zzefr) it.next();
            if (zzefrVar.zzc.equals(str)) {
                it.remove();
                return zzefrVar;
            }
        }
        return null;
    }

    public final ListenableFuture zzb(final zzbza zzbzaVar, int i2) {
        zzefr zzefrVarZzr;
        zzfmb zzfmbVarZzi;
        zzbrw zzbrwVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsf zzbsfVarZza = zzbrwVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfaz zzfazVarZzy = this.zzd.zzy(zzbzaVar, i2);
        zzbrv zzbrvVarZza = zzbsfVarZza.zza("google.afma.response.normalize", zzeft.zzd, zzbsc.zzb);
        if (((Boolean) zzbir.zza.zze()).booleanValue()) {
            zzefrVarZzr = zzr(zzbzaVar.zzh);
            if (zzefrVarZzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzaVar.zzj;
            zzefrVarZzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzefr zzefrVar = zzefrVarZzr;
        zzfne zzfneVarZzn = zzefrVar == null ? zzfne.zzn(context, 9) : zzefrVar.zzd;
        zzfno zzfnoVarZzf = zzfazVarZzy.zzf();
        zzfnoVarZzf.zzb(zzbzaVar.zza.getStringArrayList("ad_types"));
        zzegd zzegdVar = new zzegd(zzbzaVar.zzg, zzfnoVarZzf, zzfneVarZzn);
        zzega zzegaVar = new zzega(context, zzbzaVar.zzb.afmaVersion, this.zzg, i2, null);
        zzfmu zzfmuVarZze = zzfazVarZzy.zze();
        zzfne zzfneVarZzn2 = zzfne.zzn(context, 11);
        if (zzefrVar == null) {
            final ListenableFuture listenableFutureZzm = zzm(zzbzaVar, zzfmuVarZze, zzfazVarZzy);
            final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfmuVarZze, zzbsfVarZza, zzfnoVarZzf, zzfneVarZzn);
            zzfne zzfneVarZzn3 = zzfne.zzn(context, 10);
            final zzfmb zzfmbVarZzi2 = zzfmuVarZze.zzb(zzfmo.HTTP, listenableFutureZzn, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzefp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbzc zzbzcVar = (zzbzc) listenableFutureZzn.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && (bundle = zzbzaVar.zzm) != null) {
                        bundle.putLong(zzdwm.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbzcVar.zzj());
                        bundle.putLong(zzdwm.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbzcVar.zzk());
                    }
                    return new zzegc((JSONObject) listenableFutureZzm.get(), zzbzcVar);
                }
            }).zzb(zzegdVar).zzb(zzfnn.zzc(zzfneVarZzn3)).zzb(zzegaVar).zzi();
            zzfnn.zzd(zzfmbVarZzi2, zzfnoVarZzf, zzfneVarZzn3);
            zzfnn.zzb(zzfmbVarZzi2, zzfneVarZzn2);
            zzfmbVarZzi = zzfmuVarZze.zzb(zzfmo.PRE_PROCESS, listenableFutureZzm, listenableFutureZzn, zzfmbVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzefi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && (bundle = zzbzaVar.zzm) != null) {
                        Z.t(bundle, zzdwm.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzeft((zzefz) zzfmbVarZzi2.get(), (JSONObject) listenableFutureZzm.get(), (zzbzc) listenableFutureZzn.get());
                }
            }).zzc(zzbrvVarZza).zzi();
        } else {
            zzegc zzegcVar = new zzegc(zzefrVar.zzb, zzefrVar.zza);
            zzfne zzfneVarZzn4 = zzfne.zzn(context, 10);
            final zzfmb zzfmbVarZzi3 = zzfmuVarZze.zza(zzfmo.HTTP, zzgym.zza(zzegcVar)).zzb(zzegdVar).zzb(zzfnn.zzc(zzfneVarZzn4)).zzb(zzegaVar).zzi();
            zzfnn.zzd(zzfmbVarZzi3, zzfnoVarZzf, zzfneVarZzn4);
            final ListenableFuture listenableFutureZza = zzgym.zza(zzefrVar);
            zzfnn.zzb(zzfmbVarZzi3, zzfneVarZzn2);
            zzfmbVarZzi = zzfmuVarZze.zzb(zzfmo.PRE_PROCESS, zzfmbVarZzi3, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzefj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzefz zzefzVar = (zzefz) zzfmbVarZzi3.get();
                    ListenableFuture listenableFuture = listenableFutureZza;
                    return new zzeft(zzefzVar, ((zzefr) listenableFuture.get()).zzb, ((zzefr) listenableFuture.get()).zza);
                }
            }).zzc(zzbrvVarZza).zzi();
        }
        zzfnn.zzd(zzfmbVarZzi, zzfnoVarZzf, zzfneVarZzn2);
        return zzfmbVarZzi;
    }

    public final ListenableFuture zzc(final zzbza zzbzaVar, int i2) {
        if (!((Boolean) zzbir.zza.zze()).booleanValue()) {
            return zzgym.zzc(new Exception("Split request is disabled."));
        }
        zzfkg zzfkgVar = zzbzaVar.zzi;
        if (zzfkgVar == null) {
            return zzgym.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfkgVar.zzc == 0 || zzfkgVar.zzd == 0) {
            return zzgym.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbsf zzbsfVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfaz zzfazVarZzy = this.zzd.zzy(zzbzaVar, i2);
        zzfmu zzfmuVarZze = zzfazVarZzy.zze();
        final ListenableFuture listenableFutureZzm = zzm(zzbzaVar, zzfmuVarZze, zzfazVarZzy);
        zzfno zzfnoVarZzf = zzfazVarZzy.zzf();
        final zzfne zzfneVarZzn = zzfne.zzn(context, 9);
        final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfmuVarZze, zzbsfVarZza, zzfnoVarZzf, zzfneVarZzn);
        return zzfmuVarZze.zzb(zzfmo.GET_URL_AND_CACHE_KEY, listenableFutureZzm, listenableFutureZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(listenableFutureZzn, listenableFutureZzm, zzbzaVar, zzfneVarZzn);
            }
        }).zzi();
    }

    public final ListenableFuture zzd(String str) {
        if (((Boolean) zzbir.zza.zze()).booleanValue()) {
            return zzr(str) == null ? zzgym.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgym.zza(new zzefg(this));
        }
        return zzgym.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zze(zzbza zzbzaVar, zzbyr zzbyrVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && (bundle = zzbzaVar.zzm) != null) {
            Z.t(bundle, zzdwm.SERVICE_CONNECTED.zza());
        }
        ListenableFuture listenableFutureZzb = zzb(zzbzaVar, Binder.getCallingUid());
        zzo(listenableFutureZzb, zzbyrVar, zzbzaVar);
        if (((Boolean) zzbik.zzi.zze()).booleanValue()) {
            final zzege zzegeVar = this.zzc;
            Objects.requireNonNull(zzegeVar);
            listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzegeVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzf(zzbza zzbzaVar, zzbyr zzbyrVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcI)).booleanValue() && (bundle = zzbzaVar.zzm) != null) {
            Z.t(bundle, zzdwm.SERVICE_CONNECTED.zza());
        }
        zzo(zzk(zzbzaVar, Binder.getCallingUid()), zzbyrVar, zzbzaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzg(zzbza zzbzaVar, zzbyr zzbyrVar) {
        zzo(zzc(zzbzaVar, Binder.getCallingUid()), zzbyrVar, zzbzaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzh(String str, zzbyr zzbyrVar) {
        zzo(zzd(str), zzbyrVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpu)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpv);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzd = zzgqp.zza(zzgpo.zzc(AbstractJsonLexerKt.COMMA)).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzd) {
                Context context = this.zza;
                zzega zzegaVar = new zzega(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zzefz zzefzVarZzb = zzegaVar.zza(new zzefy(str3, 30000, map, new byte[0], "", false));
                    if (zzefzVarZzb.zza != 200) {
                        int i2 = zzefzVarZzb.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i2);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e2) {
                    throw new RemoteException(e2.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzj(zzbyj zzbyjVar, zzbys zzbysVar) {
        if (((Boolean) zzbiz.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbyjVar.zza;
            zzgym.zzr(zzgym.zza(null), new zzeff(this, zzbysVar, zzbyjVar), zzcdo.zzg);
        } else {
            try {
                zzbysVar.zze("", zzbyjVar);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
            }
        }
    }

    public final ListenableFuture zzk(final zzbza zzbzaVar, int i2) {
        zzbrw zzbrwVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsf zzbsfVarZza = zzbrwVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbix.zza.zze()).booleanValue()) {
            return zzgym.zzc(new Exception("Signal collection disabled."));
        }
        zzfaz zzfazVarZzy = this.zzd.zzy(zzbzaVar, i2);
        final zzfaa zzfaaVarZzd = zzfazVarZzy.zzd();
        zzbrv zzbrvVarZza = zzbsfVarZza.zza("google.afma.request.getSignals", zzbsc.zza, zzbsc.zzb);
        zzfne zzfneVarZzn = zzfne.zzn(context, 22);
        zzfmu zzfmuVarZze = zzfazVarZzy.zze();
        zzfmo zzfmoVar = zzfmo.GET_SIGNALS;
        Bundle bundle = zzbzaVar.zza;
        zzfmb zzfmbVarZzi = zzfmuVarZze.zza(zzfmoVar, zzgym.zza(bundle)).zzb(zzfnn.zzc(zzfneVarZzn)).zzc(new zzgxu() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                return zzfaaVarZzd.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzaVar.zzm, false);
            }
        }).zzj(zzfmo.JS_SIGNALS).zzc(zzbrvVarZza).zzi();
        zzfno zzfnoVarZzf = zzfazVarZzy.zzf();
        zzfnoVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfnoVarZzf.zzd(bundle.getBundle("extras"));
        zzfnn.zze(zzfmbVarZzi, zzfnoVarZzf, zzfneVarZzn);
        if (((Boolean) zzbik.zzj.zze()).booleanValue()) {
            final zzege zzegeVar = this.zzc;
            Objects.requireNonNull(zzegeVar);
            zzfmbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzegeVar.zza();
                }
            }, this.zzb);
        }
        return zzfmbVarZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzl(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbza zzbzaVar, zzfne zzfneVar) {
        String strZzi = ((zzbzc) listenableFuture.get()).zzi();
        zzq(new zzefr((zzbzc) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbzaVar.zzh, strZzi, zzfneVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
