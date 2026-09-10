package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rv extends NativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wp f19684a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qv f19686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ov f19687d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19685b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f19688e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f19689f = new AtomicLong();

    public rv(wp wpVar) {
        qv qvVar;
        this.f19684a = wpVar;
        ov ovVar = null;
        try {
            List listZzf = wpVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    mo moVarX1 = obj instanceof IBinder ? yn.x1((IBinder) obj) : null;
                    if (moVarX1 != null) {
                        this.f19685b.add(new qv(moVarX1));
                    }
                }
            }
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        try {
            List listZzz = this.f19684a.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    zzdg zzdgVarZzb = obj2 instanceof IBinder ? zzdf.zzb((IBinder) obj2) : null;
                    if (zzdgVarZzb != null) {
                        this.f19688e.add(new zzdh(zzdgVarZzb));
                    }
                }
            }
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
        try {
            mo moVarZzh = this.f19684a.zzh();
            qvVar = moVarZzh != null ? new qv(moVarZzh) : null;
        } catch (RemoteException e12) {
            zzo.zzg("", e12);
        }
        this.f19686c = qvVar;
        try {
            if (this.f19684a.zzq() != null) {
                ovVar = new ov(this.f19684a.zzq());
            }
        } catch (RemoteException e13) {
            zzo.zzg("", e13);
        }
        this.f19687d = ovVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ s9.a a() {
        try {
            return this.f19684a.zzu();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f19684a.c();
        } catch (RemoteException e10) {
            zzo.zzg("Failed to cancelUnconfirmedClick", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.f19684a.zzp();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f19684a.zzD();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f19687d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.f19684a.zzj();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.f19684a.zzg();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.f19684a.zzi();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundleZzw = this.f19684a.zzw();
            if (bundleZzw != null) {
                return bundleZzw;
            }
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.f19684a.zze();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.f19686c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.f19685b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            wp wpVar = this.f19684a;
            if (wpVar.zzF() != null) {
                return new zzfb(wpVar.zzF(), null);
            }
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.f19688e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final long getPlacementId() {
        long j10;
        AtomicLong atomicLong = this.f19689f;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jD = this.f19684a.d();
                    AtomicLong atomicLong2 = this.f19689f;
                    atomicLong2.set(jD);
                    j10 = atomicLong2.get();
                } catch (RemoteException e10) {
                    zzo.zzg("Failed to getPlacementId", e10);
                    return 0L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.f19684a.zzm();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        zzdx zzdxVarZzH;
        try {
            zzdxVarZzH = this.f19684a.zzH();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            zzdxVarZzH = null;
        }
        return ResponseInfo.zzb(zzdxVarZzH);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double dZzk = this.f19684a.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.f19684a.zzl();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f19684a.h();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f19684a.zzA();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        wp wpVar = this.f19684a;
        try {
            try {
                if (wpVar.zzA()) {
                    if (muteThisAdReason == null) {
                        wpVar.Z(null);
                        return;
                    } else if (muteThisAdReason instanceof zzdh) {
                        wpVar.Z(((zzdh) muteThisAdReason).zza());
                        return;
                    } else {
                        zzo.zzf("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e10) {
                zzo.zzg("", e10);
            }
            zzo.zzf("Ad is not custom mute enabled");
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f19684a.k1(bundle);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f19684a.zzE();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f19684a.U(bundle);
        } catch (RemoteException e10) {
            zzo.zzg("Failed to record native event", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f19684a.d1(bundle);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f19684a.X0(bundle);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f19684a.F0(new zzdd(muteThisAdListener));
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f19684a.X(new zzfo(onPaidEventListener));
        } catch (RemoteException e10) {
            zzo.zzg("Failed to setOnPaidEventListener", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setPlacementId(long j10) {
        try {
            this.f19684a.H0(j10);
            this.f19689f.set(j10);
        } catch (RemoteException e10) {
            zzo.zzg("Failed to setPlacementId", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f19684a.n1(new xv(unconfirmedClickListener));
        } catch (RemoteException e10) {
            zzo.zzg("Failed to setUnconfirmedClickListener", e10);
        }
    }
}
