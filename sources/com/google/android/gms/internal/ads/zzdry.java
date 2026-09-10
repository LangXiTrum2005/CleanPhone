package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdry extends zzbkr {
    private final Context zza;
    private final zzdnm zzb;
    private zzdol zzc;
    private zzdnh zzd;

    public zzdry(Context context, zzdnm zzdnmVar, zzdol zzdolVar, zzdnh zzdnhVar) {
        this.zza = context;
        this.zzb = zzdnmVar;
        this.zzc = zzdolVar;
        this.zzd = zzdnhVar;
    }

    public final /* synthetic */ zzdnh zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final zzbjy zzf(String str) {
        return (zzbjy) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final List zzg() {
        try {
            zzdnm zzdnmVar = this.zzb;
            SimpleArrayMap simpleArrayMapZzaa = zzdnmVar.zzaa();
            SimpleArrayMap simpleArrayMapZzad = zzdnmVar.zzad();
            String[] strArr = new String[simpleArrayMapZzaa.Z + simpleArrayMapZzad.Z];
            int i2 = 0;
            for (int i3 = 0; i3 < simpleArrayMapZzaa.Z; i3++) {
                strArr[i2] = (String) simpleArrayMapZzaa.f(i3);
                i2++;
            }
            for (int i4 = 0; i4 < simpleArrayMapZzad.Z; i4++) {
                strArr[i2] = (String) simpleArrayMapZzad.f(i4);
                i2++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzi(String str) {
        zzdnh zzdnhVar = this.zzd;
        if (zzdnhVar != null) {
            zzdnhVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzj() {
        zzdnh zzdnhVar = this.zzd;
        if (zzdnhVar != null) {
            zzdnhVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final com.google.android.gms.ads.internal.client.zzed zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzl() {
        zzdnh zzdnhVar = this.zzd;
        if (zzdnhVar != null) {
            zzdnhVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdol zzdolVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdolVar = this.zzc) == null || !zzdolVar.zzd((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdrx(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final boolean zzo() {
        zzdnh zzdnhVar = this.zzd;
        if (zzdnhVar != null && !zzdnhVar.zzM()) {
            return false;
        }
        zzdnm zzdnmVar = this.zzb;
        return zzdnmVar.zzW() != null && zzdnmVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final boolean zzp() {
        zzdnm zzdnmVar = this.zzb;
        zzejb zzejbVarZzZ = zzdnmVar.zzZ();
        if (zzejbVarZzZ == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzejbVarZzZ.zza());
        if (zzdnmVar.zzW() == null) {
            return true;
        }
        zzdnmVar.zzW().zze("onSdkLoaded", new ArrayMap(0));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdnh zzdnhVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzZ() == null || (zzdnhVar = this.zzd) == null) {
            return;
        }
        zzdnhVar.zzN((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdnh zzdnhVar = this.zzd;
                if (zzdnhVar != null) {
                    zzdnhVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final zzbjv zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdol zzdolVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdolVar = this.zzc) == null || !zzdolVar.zze((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdrx(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
