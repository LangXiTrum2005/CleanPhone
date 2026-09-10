package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.p004ironsource.d9;
import com.smartdigimkt.x.g;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzcey extends FrameLayout implements zzcep {
    final zzcfm zza;
    private final zzcfk zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbgz zze;
    private final long zzf;
    private final zzceq zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcey(Context context, zzcfk zzcfkVar, int i2, boolean z2, zzbgz zzbgzVar, zzcfj zzcfjVar, zzdxe zzdxeVar) {
        zzceq zzceoVar;
        zzbgz zzbgzVar2;
        zzceq zzcigVar;
        super(context);
        this.zzb = zzcfkVar;
        this.zze = zzbgzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcfkVar.zzk());
        zzcer zzcerVar = zzcfkVar.zzk().zza;
        zzcfl zzcflVar = new zzcfl(context, zzcfkVar.zzs(), zzcfkVar.zzm(), zzbgzVar, zzcfkVar.zzi());
        if (i2 == 3) {
            zzcigVar = new zzcig(context, zzcflVar);
            zzbgzVar2 = zzbgzVar;
        } else {
            if (i2 == 2) {
                zzceoVar = new zzcgc(context, zzcflVar, zzcfkVar, z2, zzcer.zza(zzcfkVar), zzcfjVar, zzdxeVar);
                zzbgzVar2 = zzbgzVar;
            } else {
                zzbgzVar2 = zzbgzVar;
                zzceoVar = new zzceo(context, zzcfkVar, z2, zzcer.zza(zzcfkVar), zzcfjVar, new zzcfl(context, zzcfkVar.zzs(), zzcfkVar.zzm(), zzbgzVar, zzcfkVar.zzi()), zzdxeVar);
            }
            zzcigVar = zzceoVar;
        }
        this.zzg = zzcigVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcigVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzan)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzak)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzap)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzam)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbgzVar2 != null) {
            zzbgzVar2.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcfm(this);
        zzcigVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzcfk zzcfkVar = this.zzb;
        if (zzcfkVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcfkVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzceq zzceqVar = this.zzg;
            if (zzceqVar != null) {
                zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcev
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzceqVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcex
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z2);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcep
    public final void onWindowVisibilityChanged(int i2) {
        boolean z2;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.zza.zzb();
            z2 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z2 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzceu(this, z2));
    }

    public final void zzA(int i2) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzB(i2);
    }

    public final void zzB(int i2) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzC(i2);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        TextView textView = new TextView(zzceqVar.getContext());
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        textView.setText(String.valueOf(resourcesZzf == null ? "AdMob - " : resourcesZzf.getString(R.string.watermark_label_prefix)).concat(zzceqVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzceq zzceqVar = this.zzg;
        if (zzceqVar != null) {
            zzceqVar.zzd();
        }
        zzL();
    }

    public final void zzF() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        long jZzh = zzceqVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f = jZzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzceqVar.zzo()), "qoeCachedBytes", String.valueOf(zzceqVar.zzn()), "qoeLoadedBytes", String.valueOf(zzceqVar.zzm()), "droppedFrames", String.valueOf(zzceqVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = jZzh;
    }

    public final /* synthetic */ void zzG(boolean z2) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
    }

    public final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzces(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzb() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzceqVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzceqVar.zzk()), "videoHeight", String.valueOf(zzceqVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcw)).booleanValue()) {
            this.zza.zzb();
        }
        zzcfk zzcfkVar = this.zzb;
        if (zzcfkVar.zzj() != null && !this.zzi) {
            boolean z2 = (zzcfkVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z2;
            if (!z2) {
                zzcfkVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcw)).booleanValue()) {
            this.zza.zza();
        }
        zzI(d9.h.g0, new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzg(String str, String str2) {
        zzI(g.f39715A, "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcet(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzceqVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbgz zzbgzVar = this.zze;
            if (zzbgzVar != null) {
                zzbgzVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzj(int i2, int i3) {
        if (this.zzk) {
            zzbgb zzbgbVar = zzbgk.zzao;
            int iMax = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).intValue(), 1);
            int iMax2 = Math.max(i3 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcew
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar != null) {
            return zzceqVar.zzw();
        }
        return null;
    }

    public final void zzm(int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzan)).booleanValue()) {
            this.zzc.setBackgroundColor(i2);
            this.zzd.setBackgroundColor(i2);
        }
    }

    public final void zzn(int i2, int i3, int i4, int i5) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length() + 3 + String.valueOf(i5).length());
            androidx.datastore.preferences.protobuf.a.z(sb, "Set video bounds to x:", i2, ";y:", i3);
            sb.append(";w:");
            sb.append(i4);
            sb.append(";h:");
            sb.append(i5);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f2) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar != null) {
            zzceqVar.zzj(f, f2);
        }
    }

    public final void zzq(Integer num) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzceqVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzf();
    }

    public final void zzs() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zze();
    }

    public final void zzt(int i2) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzi(i2);
    }

    public final void zzu() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzb.zza(true);
        zzceqVar.zzq();
    }

    public final void zzv() {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzb.zza(false);
        zzceqVar.zzq();
    }

    public final void zzw(float f) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzb.zzb(f);
        zzceqVar.zzq();
    }

    public final void zzx(int i2) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzy(i2);
    }

    public final void zzy(int i2) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzz(i2);
    }

    public final void zzz(int i2) {
        zzceq zzceqVar = this.zzg;
        if (zzceqVar == null) {
            return;
        }
        zzceqVar.zzA(i2);
    }
}
