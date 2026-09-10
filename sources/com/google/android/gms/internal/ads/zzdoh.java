package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.thinkup.core.api.ErrorCode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdoh extends zzbkb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdpj {
    public static final zzgtd zza = zzgtd.zzl(ErrorCode.loadInShowingFilter, "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgyw zzf;
    private View zzg;
    private zzdnh zzi;
    private zzbcm zzj;
    private zzbjv zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdoh(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = ErrorCode.loadCappingError;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zzb(frameLayout, this);
        this.zzf = zzcdo.zzf;
        this.zzj = new zzbcm(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmS)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdop(this.zzi, this));
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdog
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzs();
            }
        });
    }

    private final synchronized void zzv(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Encountered invalid base64 watermark.", e2);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdnh zzdnhVar = this.zzi;
        if (zzdnhVar == null || !zzdnhVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzj(), zzk(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdnh zzdnhVar = this.zzi;
        if (zzdnhVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdnhVar.zzu(frameLayout, zzj(), zzk(), zzdnh.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdnh zzdnhVar = this.zzi;
        if (zzdnhVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdnhVar.zzu(frameLayout, zzj(), zzk(), zzdnh.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdnh zzdnhVar = this.zzi;
        if (zzdnhVar != null) {
            zzdnhVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmS)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzi(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized IObjectWrapper zzc(String str) {
        return ObjectWrapper.wrap(zzm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdnh)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdnh zzdnhVar = this.zzi;
        if (zzdnhVar != null) {
            zzdnhVar.zzh(this);
        }
        zzu();
        zzdnh zzdnhVar2 = (zzdnh) objUnwrap;
        this.zzi = zzdnhVar2;
        zzdnhVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeK)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzv(this.zzi.zzK());
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final FrameLayout zzdA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized void zzdB(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzdC(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized void zzdD(zzbjv zzbjvVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbjvVar;
            zzdnh zzdnhVar = this.zzi;
            if (zzdnhVar != null) {
                zzdnhVar.zzP().zzb(zzbjvVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final /* synthetic */ View zzdE() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized void zze() {
        try {
            if (this.zzn) {
                return;
            }
            zzdnh zzdnhVar = this.zzi;
            if (zzdnhVar != null) {
                zzdnhVar.zzh(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        this.zzi.zzx((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final zzbcm zzh() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized void zzi(String str, View view, boolean z2) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized Map zzk() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized Map zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized View zzm(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized String zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final IObjectWrapper zzo() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized JSONObject zzp() {
        zzdnh zzdnhVar = this.zzi;
        if (zzdnhVar == null) {
            return null;
        }
        return zzdnhVar.zzv(this.zzd, zzj(), zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized JSONObject zzq() {
        zzdnh zzdnhVar = this.zzi;
        if (zzdnhVar == null) {
            return null;
        }
        return zzdnhVar.zzw(this.zzd, zzj(), zzk());
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
