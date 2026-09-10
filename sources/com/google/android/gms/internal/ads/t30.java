package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t30 extends zzdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30 f20139a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzed f20144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20145g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f20147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f20148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f20149k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public mp f20151n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20140b = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20146h = true;

    public t30(b30 b30Var, float f10, boolean z10, boolean z11) {
        this.f20139a = b30Var;
        this.f20147i = f10;
        this.f20141c = z10;
        this.f20142d = z11;
    }

    public final void x1(zzfw zzfwVar) {
        Object obj = this.f20140b;
        boolean z10 = zzfwVar.zzb;
        boolean z11 = zzfwVar.zzc;
        synchronized (obj) {
            this.l = z10;
            this.f20150m = z11;
        }
        boolean z12 = zzfwVar.zza;
        String str = true != z10 ? "0" : "1";
        String str2 = true != z11 ? "0" : "1";
        String str3 = true != z12 ? "0" : "1";
        x.e eVar = new x.e(3);
        eVar.put("muteStart", str3);
        eVar.put("customControlsRequested", str);
        eVar.put("clickToExpandRequested", str2);
        z1("initialState", Collections.unmodifiableMap(eVar));
    }

    public final void y1(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.f20140b) {
            try {
                z11 = true;
                if (f11 == this.f20147i && f12 == this.f20149k) {
                    z11 = false;
                }
                this.f20147i = f11;
                if (!((Boolean) zzba.zzc().a(am.f12427xe)).booleanValue()) {
                    this.f20148j = f10;
                }
                z12 = this.f20146h;
                this.f20146h = z10;
                i11 = this.f20143e;
                this.f20143e = i10;
                float f13 = this.f20149k;
                this.f20149k = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.f20139a.zzE().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            try {
                mp mpVar = this.f20151n;
                if (mpVar != null) {
                    mpVar.m0(mpVar.q(), 2);
                }
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        l00.f16613f.execute(new s30(this, i11, i10, z12, z10));
    }

    public final void z1(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        l00.f16613f.execute(new zd1(17, this, map2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() {
        z1("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() {
        z1(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z10) {
        z1(true != z10 ? CampaignEx.JSON_NATIVE_VIDEO_UNMUTE : CampaignEx.JSON_NATIVE_VIDEO_MUTE, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() {
        boolean z10;
        synchronized (this.f20140b) {
            z10 = this.f20146h;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() {
        int i10;
        synchronized (this.f20140b) {
            i10 = this.f20143e;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        float f10;
        synchronized (this.f20140b) {
            f10 = this.f20147i;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        float f10;
        synchronized (this.f20140b) {
            f10 = this.f20148j;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) {
        synchronized (this.f20140b) {
            this.f20144f = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() {
        float f10;
        synchronized (this.f20140b) {
            f10 = this.f20149k;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() {
        boolean z10;
        synchronized (this.f20140b) {
            try {
                z10 = false;
                if (this.f20141c && this.l) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() {
        zzed zzedVar;
        synchronized (this.f20140b) {
            zzedVar = this.f20144f;
        }
        return zzedVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() {
        boolean z10;
        Object obj = this.f20140b;
        boolean zZzn = zzn();
        synchronized (obj) {
            z10 = false;
            if (!zZzn) {
                try {
                    if (this.f20150m && this.f20142d) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() {
        z1("stop", null);
    }
}
