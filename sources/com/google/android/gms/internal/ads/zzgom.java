package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.smartdigimkt.f3.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzgom {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgpe zzc = new zzgpe("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzgpd zza;
    private final String zze;

    public zzgom(Context context) {
        if (zzgpg.zza(context)) {
            this.zza = new zzgpd(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgnx.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzgqr.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgol zzgolVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgolVar.zza(str.trim());
    }

    private static boolean zzj(zzgor zzgorVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgop zzgopVarZzd = zzgoq.zzd();
        zzgopVarZzd.zzc(0);
        zzgopVarZzd.zza(8160);
        zzgorVar.zza(zzgopVarZzd.zzd());
        return false;
    }

    public final void zza(final zzgoo zzgooVar, final zzgor zzgorVar) {
        zzgpd zzgpdVar = this.zza;
        if (zzgpdVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgorVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgooVar.zzb()))) {
            zzgpdVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgoj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzgooVar, zzgorVar);
                }
            });
        }
    }

    public final void zzb(final zzgnt zzgntVar, final zzgor zzgorVar) {
        zzgpd zzgpdVar = this.zza;
        if (zzgpdVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgorVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgntVar.zza(), zzgntVar.zzb()))) {
            zzgpdVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgny
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzgntVar, zzgorVar);
                }
            });
        }
    }

    public final void zzc(final zzgot zzgotVar, final zzgor zzgorVar, final int i2) {
        zzgpd zzgpdVar = this.zza;
        if (zzgpdVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgorVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgotVar.zza(), zzgotVar.zzb()))) {
            zzgpdVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgoa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzgotVar, i2, zzgorVar);
                }
            });
        }
    }

    public final void zzd() {
        zzgpd zzgpdVar = this.zza;
        if (zzgpdVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzgpdVar.zzb();
    }

    public final /* synthetic */ void zze(zzgoo zzgooVar, zzgor zzgorVar) {
        try {
            zzgpd zzgpdVar = this.zza;
            if (zzgpdVar == null) {
                throw null;
            }
            zzgnh zzgnhVar = (zzgnh) zzgpdVar.zzc();
            if (zzgnhVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgooVar.zza());
            zzi(zzgooVar.zzj(), new zzgol() { // from class: com.google.android.gms.internal.ads.zzgob
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgom.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgooVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgooVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgooVar.zzh());
            zzi(null, new zzgol() { // from class: com.google.android.gms.internal.ads.zzgoc
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgom.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new zzgol() { // from class: com.google.android.gms.internal.ads.zzgod
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgom.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgooVar.zzb(), new zzgol() { // from class: com.google.android.gms.internal.ads.zzgoe
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgom.zzb;
                    bundle.putString(b.f35043u, str2);
                }
            });
            zzi(null, new zzgol() { // from class: com.google.android.gms.internal.ads.zzgof
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgom.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgnhVar.zze(str, bundle, new zzgok(this, zzgorVar));
        } catch (RemoteException e2) {
            zzc.zzd(e2, "show overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzf(zzgnt zzgntVar, zzgor zzgorVar) {
        try {
            zzgpd zzgpdVar = this.zza;
            if (zzgpdVar == null) {
                throw null;
            }
            zzgnh zzgnhVar = (zzgnh) zzgpdVar.zzc();
            if (zzgnhVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgntVar.zza(), new zzgol() { // from class: com.google.android.gms.internal.ads.zzgog
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgom.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgntVar.zzb(), new zzgol() { // from class: com.google.android.gms.internal.ads.zzgoh
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgom.zzb;
                    bundle.putString(b.f35043u, str2);
                }
            });
            zzgnhVar.zzf(bundle, new zzgok(this, zzgorVar));
        } catch (RemoteException e2) {
            zzc.zzd(e2, "dismiss overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzg(zzgot zzgotVar, int i2, zzgor zzgorVar) {
        try {
            zzgpd zzgpdVar = this.zza;
            if (zzgpdVar == null) {
                throw null;
            }
            zzgnh zzgnhVar = (zzgnh) zzgpdVar.zzc();
            if (zzgnhVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i2);
            zzi(zzgotVar.zza(), new zzgol() { // from class: com.google.android.gms.internal.ads.zzgoi
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i3 = zzgom.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgotVar.zzb(), new zzgol() { // from class: com.google.android.gms.internal.ads.zzgnz
                @Override // com.google.android.gms.internal.ads.zzgol
                public final /* synthetic */ void zza(String str2) {
                    int i3 = zzgom.zzb;
                    bundle.putString(b.f35043u, str2);
                }
            });
            zzgnhVar.zzg(bundle, new zzgok(this, zzgorVar));
        } catch (RemoteException e2) {
            zzc.zzd(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), this.zze);
        }
    }
}
