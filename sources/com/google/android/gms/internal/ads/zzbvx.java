package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbvx extends zzbwd {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcir zzj;
    private final Activity zzk;
    private zzclb zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwe zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(d9.e.f24671c, d9.e.f24670b, "top-center", TtmlNode.CENTER, d9.e.f24672e, d9.e.d, "bottom-center");
    }

    public zzbvx(zzcir zzcirVar, zzbwe zzbweVar) {
        super(zzcirVar, "resize");
        this.zza = d9.e.f24670b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcirVar;
        this.zzk = zzcirVar.zzj();
        this.zzo = zzbweVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmi)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmj)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmk)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcir zzcirVar = this.zzj;
                    viewGroup2.addView((View) zzcirVar);
                    zzcirVar.zzaf(this.zzl);
                } catch (IllegalStateException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e2);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcir zzcirVar2 = this.zzj;
                viewGroup3.addView((View) zzcirVar2);
                zzcirVar2.zzaf(this.zzl);
            }
        }
        if (z2) {
            zzk("default");
            zzbwe zzbweVar = this.zzo;
            if (zzbweVar != null) {
                zzbweVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x019b A[PHI: r18
  0x019b: PHI (r18v12 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v10 int), (r18v13 int) binds: [B:85:0x0197, B:82:0x018a, B:79:0x017e, B:76:0x0172, B:73:0x0166, B:70:0x015a, B:68:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int iB;
        int i4;
        int iB2;
        int i5;
        synchronized (this.zzi) {
            try {
                Activity activity = this.zzk;
                if (activity == null) {
                    zzg("Not an activity context. Cannot resize.");
                    return;
                }
                zzcir zzcirVar = this.zzj;
                if (zzcirVar.zzN() == null) {
                    zzg("Webview is not yet available, size is not set.");
                    return;
                }
                if (zzcirVar.zzN().zzg()) {
                    zzg("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (zzcirVar.zzW()) {
                    zzg("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zze = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzf = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzg = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzg("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = activity.getWindow();
                if (window != null && window.getDecorView() != null) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] iArrZzac = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] iArrZzY = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                    int i6 = iArrZzac[0];
                    int i7 = iArrZzac[1];
                    int i8 = this.zzh;
                    int[] iArr = null;
                    if (i8 < 50 || i8 > i6) {
                        i2 = 50;
                        int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                    } else {
                        int i10 = this.zze;
                        if (i10 < 50 || i10 > i7) {
                            i2 = 50;
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                        } else if (i10 == i7 && i8 == i6) {
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                            i2 = 50;
                        } else if (this.zzb) {
                            String str2 = this.zza;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    i2 = 50;
                                    if (!str2.equals(TtmlNode.CENTER)) {
                                        b3 = -1;
                                    } else {
                                        b3 = 2;
                                    }
                                    break;
                                case -1012429441:
                                    i2 = 50;
                                    if (!str2.equals(d9.e.f24671c)) {
                                        b3 = -1;
                                    } else {
                                        b3 = 0;
                                    }
                                    break;
                                case -655373719:
                                    i2 = 50;
                                    if (!str2.equals(d9.e.f24672e)) {
                                        b3 = -1;
                                    } else {
                                        b3 = 3;
                                    }
                                    break;
                                case 1163912186:
                                    i2 = 50;
                                    if (!str2.equals(d9.e.d)) {
                                        b3 = -1;
                                    } else {
                                        b3 = 5;
                                    }
                                    break;
                                case 1288627767:
                                    i2 = 50;
                                    if (!str2.equals("bottom-center")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 4;
                                    }
                                    break;
                                case 1755462605:
                                    i2 = 50;
                                    if (!str2.equals("top-center")) {
                                        b3 = -1;
                                    } else {
                                        b3 = 1;
                                    }
                                    break;
                                default:
                                    i2 = 50;
                                    b3 = -1;
                                    break;
                            }
                            if (b3 == 0) {
                                iB = this.zzc + this.zzf;
                                i4 = this.zzd;
                            } else if (b3 != 1) {
                                if (b3 != 2) {
                                    if (b3 == 3) {
                                        iB = this.zzc + this.zzf;
                                        i5 = this.zzd;
                                    } else if (b3 == 4) {
                                        iB = android.support.v4.media.a.b(this.zzc, this.zzf, i8 >> 1, -25);
                                        i5 = this.zzd;
                                    } else if (b3 != 5) {
                                        iB = android.support.v4.media.a.b(this.zzc, this.zzf, i8, -50);
                                        i4 = this.zzd;
                                    } else {
                                        iB = android.support.v4.media.a.b(this.zzc, this.zzf, i8, -50);
                                        i5 = this.zzd;
                                    }
                                    iB2 = android.support.v4.media.a.b(i5, this.zzg, i10, -50);
                                } else {
                                    iB = android.support.v4.media.a.b(this.zzc, this.zzf, i8 >> 1, -25);
                                    iB2 = (-25) + this.zzd + this.zzg + (i10 >> 1);
                                }
                                if (iB >= 0 && iB + 50 <= i6 && iB2 >= iArrZzY[0] && iB2 + 50 <= iArrZzY[1]) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                iB = android.support.v4.media.a.b(this.zzc, this.zzf, i8 >> 1, -25);
                                i4 = this.zzd;
                            }
                            iB2 = i4 + this.zzg;
                            if (iB >= 0) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            i2 = 50;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] iArrZzac2 = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] iArrZzY2 = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                            int i13 = iArrZzac2[0];
                            int i14 = this.zzc + this.zzf;
                            int i15 = this.zzd + this.zzg;
                            if (i14 < 0) {
                                i3 = 0;
                            } else {
                                int i16 = this.zzh;
                                i3 = i14 + i16 > i13 ? i13 - i16 : i14;
                            }
                            int i17 = iArrZzY2[0];
                            if (i15 < i17) {
                                i15 = i17;
                            } else {
                                int i18 = this.zze;
                                int i19 = i15 + i18;
                                int i20 = iArrZzY2[1];
                                if (i19 > i20) {
                                    i15 = i20 - i18;
                                }
                            }
                            iArr = new int[]{i3, i15};
                        }
                    }
                    if (iArr == null) {
                        zzg("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                    ViewParent parent = ((View) zzcirVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                        zzg("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) zzcirVar);
                    PopupWindow popupWindow = this.zzp;
                    if (popupWindow == null) {
                        this.zzr = viewGroup;
                        com.google.android.gms.ads.internal.zzt.zzc();
                        ((View) zzcirVar).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzcirVar).getDrawingCache());
                        ((View) zzcirVar).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(activity);
                        this.zzm = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.zzl = zzcirVar.zzN();
                        this.zzr.addView(this.zzm);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(activity);
                    this.zzq = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzC, iZzC2));
                    com.google.android.gms.ads.internal.zzt.zzc();
                    PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iZzC, iZzC2, false);
                    this.zzp = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.zzp.setTouchable(true);
                    this.zzp.setClippingEnabled(!this.zzb);
                    this.zzq.addView((View) zzcirVar, -1, -1);
                    this.zzn = new LinearLayout(activity);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int i21 = i2;
                    int iZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, i21);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, i21));
                    switch (this.zza) {
                        case "center":
                            b2 = 2;
                            break;
                        case "top-left":
                            b2 = 0;
                            break;
                        case "bottom-left":
                            b2 = 3;
                            break;
                        case "bottom-right":
                            b2 = 5;
                            break;
                        case "bottom-center":
                            b2 = 4;
                            break;
                        case "top-center":
                            b2 = 1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                    } else if (b2 == 1) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                    } else if (b2 == 2) {
                        layoutParams.addRule(13);
                    } else if (b2 == 3) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                    } else if (b2 == 4) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                    } else if (b2 != 5) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                    }
                    this.zzn.setOnClickListener(new zzbvv(this));
                    this.zzn.setContentDescription("Close button");
                    this.zzq.addView(this.zzn, layoutParams);
                    try {
                        PopupWindow popupWindow3 = this.zzp;
                        View decorView = window.getDecorView();
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int iZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[0]);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        popupWindow3.showAtLocation(decorView, 0, iZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[1]));
                        int i22 = iArr[0];
                        int i23 = iArr[1];
                        zzbwe zzbweVar = this.zzo;
                        if (zzbweVar != null) {
                            zzbweVar.zza(i22, i23, this.zzh, this.zze);
                        }
                        this.zzj.zzaf(zzclb.zzc(iZzC, iZzC2));
                        int i24 = iArr[0];
                        int i25 = iArr[1];
                        com.google.android.gms.ads.internal.zzt.zzc();
                        zzi(i24, i25 - com.google.android.gms.ads.internal.util.zzs.zzY(this.zzk)[0], this.zzh, this.zze);
                        zzk("resized");
                        return;
                    } catch (RuntimeException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                        sb.append("Cannot show popup window: ");
                        sb.append(message);
                        zzg(sb.toString());
                        RelativeLayout relativeLayout2 = this.zzq;
                        zzcir zzcirVar2 = this.zzj;
                        relativeLayout2.removeView((View) zzcirVar2);
                        ViewGroup viewGroup2 = this.zzr;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.zzm);
                            this.zzr.addView((View) zzcirVar2);
                            zzcirVar2.zzaf(this.zzl);
                        }
                        return;
                    }
                }
                zzg("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(final boolean z2) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmh)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z2);
                    } else {
                        zzcdo.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf(z2);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i2, int i3, boolean z2) {
        synchronized (this.zzi) {
            this.zzc = i2;
            this.zzd = i3;
        }
    }

    public final boolean zzd() {
        boolean z2;
        synchronized (this.zzi) {
            z2 = this.zzp != null;
        }
        return z2;
    }

    public final void zze(int i2, int i3) {
        this.zzc = i2;
        this.zzd = i3;
    }
}
