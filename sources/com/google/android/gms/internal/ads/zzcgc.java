package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcgc extends zzceq implements TextureView.SurfaceTextureListener, zzcfa {
    private final zzcfk zzc;
    private final zzcfl zzd;
    private final zzcfj zze;
    private final zzdxe zzf;
    private zzcep zzg;
    private Surface zzh;
    private zzcfb zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcfi zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcgc(Context context, zzcfl zzcflVar, zzcfk zzcfkVar, boolean z2, boolean z3, zzcfj zzcfjVar, zzdxe zzdxeVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcfkVar;
        this.zzd = zzcflVar;
        this.zzo = z2;
        this.zze = zzcfjVar;
        zzcflVar.zza(this);
        this.zzf = zzdxeVar;
    }

    private final boolean zzT() {
        zzcfb zzcfbVar = this.zzi;
        return (zzcfbVar == null || !zzcfbVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z2, Integer num) {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null && !z2) {
            zzcfbVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z2) {
            if (!zzT()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcfbVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcgx zzcgxVarZzr = this.zzc.zzr(this.zzj);
            if (zzcgxVarZzr instanceof zzchg) {
                zzcfb zzcfbVarZza = ((zzchg) zzcgxVarZzr).zza();
                this.zzi = zzcfbVarZza;
                zzcfbVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcgxVarZzr instanceof zzchd)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzchd zzchdVar = (zzchd) zzcgxVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzchdVar.zzu();
                boolean zZzt = zzchdVar.zzt();
                String strZzs = zzchdVar.zzs();
                if (strZzs == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcfb zzcfbVarZzE = zzE(num);
                    this.zzi = zzcfbVarZzE;
                    zzcfbVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i6 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i6 >= strArr.length) {
                    break;
                }
                uriArr[i6] = Uri.parse(strArr[i6]);
                i6++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcfb zzcfbVar = this.zzi;
            if (zzcfbVar != null) {
                zzcfbVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z2) {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcfbVar.zzu(surface, z2);
        } catch (IOException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e2);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        androidx.media3.extractor.text.ttml.a.C(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i2, int i3) {
        float f = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzdxe zzdxeVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoF)).booleanValue() && (zzdxeVar = this.zzf) != null) {
                zzdxd zzdxdVarZza = zzdxeVar.zza();
                zzdxdVarZza.zzc("action", "svp_aepv");
                zzdxdVarZza.zzd();
            }
            zzcfi zzcfiVar = new zzcfi(getContext());
            this.zzn = zzcfiVar;
            zzcfiVar.zzb(surfaceTexture, i2, i3);
            zzcfi zzcfiVar2 = this.zzn;
            zzcfiVar2.start();
            SurfaceTexture surfaceTextureZze = zzcfiVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i2, i3);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzc(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i2, i3);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i2);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzA(int i2) {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.zzy(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzB(int i2) {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.zzz(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzC(int i2) {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.zzA(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    public final zzcfb zzE(Integer num) {
        zzcfj zzcfjVar = this.zze;
        zzcfk zzcfkVar = this.zzc;
        zzchz zzchzVar = new zzchz(zzcfkVar.getContext(), zzcfjVar, zzcfkVar, num);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzchzVar;
    }

    public final String zzF() {
        zzcfk zzcfkVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcfkVar.getContext(), zzcfkVar.zzs().afmaVersion);
    }

    public final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcfbVar.zzv(fZzc, false);
        } catch (IOException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e2);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzb();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zze();
        }
    }

    public final /* synthetic */ void zzJ(String str) {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzK() {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzc();
        }
    }

    public final /* synthetic */ void zzL() {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzd();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zza();
        }
    }

    public final /* synthetic */ void zzN(int i2, int i3) {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzj(i2, i3);
        }
    }

    public final /* synthetic */ void zzO() {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzh();
        }
    }

    public final /* synthetic */ void zzP(int i2) {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.onWindowVisibilityChanged(i2);
        }
    }

    public final /* synthetic */ void zzQ(boolean z2, long j) {
        this.zzc.zzu(z2, j);
    }

    public final /* synthetic */ void zzR(String str) {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzS() {
        zzcep zzcepVar = this.zzg;
        if (zzcepVar != null) {
            zzcepVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzb(zzcep zzcepVar) {
        this.zzg = zzcepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcfl zzcflVar = this.zzd;
        zzcflVar.zzf();
        this.zzb.zze();
        zzcflVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzi(int i2) {
        if (zzU()) {
            this.zzi.zzx(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzj(float f, float f2) {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzm() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            return zzcfbVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzn() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            return zzcfbVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final long zzo() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            return zzcfbVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final int zzp() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            return zzcfbVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzceq, com.google.android.gms.internal.ads.zzcfn
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzr(final boolean z2, final long j) {
        if (this.zzc != null) {
            zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcga
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z2, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzs(int i2) {
        if (this.zzm != i2) {
            this.zzm = i2;
            if (i2 == 3) {
                zzY();
                return;
            }
            if (i2 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzt(int i2, int i3) {
        this.zzr = i2;
        this.zzs = i3;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcft
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final Integer zzw() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            return zzcfbVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z2 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z2 = true;
        }
        this.zzj = str;
        zzV(z2, num);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzy(int i2) {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.zzF(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    public final void zzz(int i2) {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.zzG(i2);
        }
    }
}
