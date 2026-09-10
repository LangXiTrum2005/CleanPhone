package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xp extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wp f21949a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no f21951c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21950b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VideoController f21952d = new VideoController();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21953e = new ArrayList();

    public xp(wp wpVar) {
        mo loVar;
        this.f21949a = wpVar;
        no noVar = null;
        try {
            List listZzf = wpVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        loVar = iInterfaceQueryLocalInterface instanceof mo ? (mo) iInterfaceQueryLocalInterface : new lo(iBinder);
                    } else {
                        loVar = null;
                    }
                    if (loVar != null) {
                        this.f21950b.add(new no(loVar));
                    }
                }
            }
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        try {
            List listZzz = this.f21949a.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    zzdg zzdgVarZzb = obj2 instanceof IBinder ? zzdf.zzb((IBinder) obj2) : null;
                    if (zzdgVarZzb != null) {
                        this.f21953e.add(new zzdh(zzdgVarZzb));
                    }
                }
            }
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
        try {
            mo moVarZzh = this.f21949a.zzh();
            if (moVarZzh != null) {
                noVar = new no(moVarZzh);
            }
        } catch (RemoteException e12) {
            zzo.zzg("", e12);
        }
        this.f21951c = noVar;
        try {
            if (this.f21949a.zzq() != null) {
                new io(this.f21949a.zzq());
            }
        } catch (RemoteException e13) {
            zzo.zzg("", e13);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f21949a.k1(bundle);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f21949a.d1(bundle);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f21949a.X0(bundle);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zza() {
        try {
            return this.f21949a.zze();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzb() {
        return this.f21950b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzc() {
        try {
            return this.f21949a.zzg();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzd() {
        return this.f21951c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.f21949a.zzi();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.f21949a.zzj();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzg() {
        try {
            double dZzk = this.f21949a.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.f21949a.zzl();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.f21949a.zzm();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zzj() {
        VideoController videoController = this.f21952d;
        try {
            wp wpVar = this.f21949a;
            if (wpVar.zzn() != null) {
                videoController.zza(wpVar.zzn());
            }
        } catch (RemoteException e10) {
            zzo.zzg("Exception occurred while getting video controller", e10);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzk() {
        try {
            s9.a aVarZzv = this.f21949a.zzv();
            if (aVarZzv != null) {
                return s9.b.y1(aVarZzv);
            }
            return null;
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }
}
