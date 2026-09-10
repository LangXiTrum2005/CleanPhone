package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzfqw;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
final class zzcfw extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcex {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcfz zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfk zzE;
    private zzbfi zzF;
    private zzazx zzG;
    private int zzH;
    private int zzI;
    private zzbcx zzJ;
    private final zzbcx zzK;
    private zzbcx zzL;
    private final zzbcy zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbbj zzX;
    private boolean zzY;
    private final zzcgq zzb;
    private final zzava zzc;
    private final zzfcn zzd;
    private final zzbds zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfbo zzk;
    private zzfbr zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcff zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzecr zzq;
    private zzecp zzr;
    private zzcgr zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    @VisibleForTesting
    public zzcfw(zzcgq zzcgqVar, zzcgr zzcgrVar, String str, boolean z, boolean z2, zzava zzavaVar, zzbds zzbdsVar, VersionInfoParcel versionInfoParcel, zzbda zzbdaVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbbj zzbbjVar, zzfbo zzfboVar, zzfbr zzfbrVar, zzfcn zzfcnVar) {
        zzfbr zzfbrVar2;
        super(zzcgqVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcgqVar;
        this.zzs = zzcgrVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzavaVar;
        this.zzd = zzfcnVar;
        this.zze = zzbdsVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzv.zzq();
        DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu(windowManager);
        this.zzi = displayMetricsZzu;
        this.zzj = displayMetricsZzu.density;
        this.zzX = zzbbjVar;
        this.zzk = zzfboVar;
        this.zzl = zzfbrVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzck(zzcgqVar.zza(), this, this, null);
        this.zzY = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlv)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlu)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzv.zzq().zzc(zzcgqVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzv.zzq();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfqw zzfqwVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaV)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcgd(this, new zzcgc(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbcy zzbcyVar = new zzbcy(new zzbda(true, "make_wv", this.zzt));
        this.zzM = zzbcyVar;
        zzbcyVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && (zzfbrVar2 = this.zzl) != null && zzfbrVar2.zzb != null) {
            zzbcyVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbcyVar.zza();
        zzbcx zzbcxVarZzf = zzbda.zzf();
        this.zzK = zzbcxVarZzf;
        zzbcyVar.zzb("native:view_create", zzbcxVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcg.zza().zzb(zzcgqVar);
        com.google.android.gms.ads.internal.zzv.zzp().zzt();
    }

    private final synchronized void zzba() {
        zzfbo zzfboVar = this.zzk;
        if (zzfboVar != null && zzfboVar.zzam) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzv.zzp().zzr();
    }

    private final synchronized void zzbc() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbd(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf(String str) {
        final String str2 = AndroidWebViewClient.BLANK_PAGE;
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfr
                public final /* synthetic */ String zzb = AndroidWebViewClient.BLANK_PAGE;

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbcs.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        try {
            Map map = this.zzV;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcde) it.next()).release();
                }
            }
            this.zzV = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbi() {
        zzbcy zzbcyVar = this.zzM;
        if (zzbcyVar == null) {
            return;
        }
        zzbda zzbdaVarZza = zzbcyVar.zza();
        zzbcq zzbcqVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzg();
        if (zzbcqVarZzg != null) {
            zzbcqVarZzg.zzf(zzbdaVarZza);
        }
    }

    private final synchronized void zzbj() {
        Boolean boolZzl = com.google.android.gms.ads.internal.zzv.zzp().zzl();
        this.zzy = boolZzl;
        if (boolZzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void destroy() {
        try {
            zzbi();
            this.zzQ.zza();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.zzp.zzm();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzi();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
            zzbh();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            Activity activityZza = this.zzb.zza();
            if (activityZza != null && activityZza.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzbf(AndroidWebViewClient.BLANK_PAGE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkG)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzbzw.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzi();
                        com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
                        zzbh();
                        zzbb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcft
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdWebViewImpl.loadUrl");
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzaE()) {
                this.zzQ.zzc();
            }
            if (this.zzY) {
                onResume();
                this.zzY = false;
            }
            boolean z = this.zzC;
            zzcff zzcffVar = this.zzo;
            if (zzcffVar != null && zzcffVar.zzU()) {
                if (!this.zzD) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = true;
                }
                zzaZ();
                z = true;
            }
            zzbd(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcff zzcffVar;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    this.zzQ.zzd();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcffVar = this.zzo) != null && zzcffVar.zzU() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkU)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zZzaZ) {
            return;
        }
        zzmVarZzL.zzn();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:11:0x0012, B:13:0x0018, B:15:0x001c, B:18:0x0026, B:20:0x002e, B:23:0x0033, B:25:0x003b, B:27:0x004d, B:30:0x0052, B:32:0x0059, B:36:0x0063, B:39:0x0068, B:42:0x007a, B:50:0x0093, B:44:0x0082, B:47:0x0087, B:53:0x00a0, B:55:0x00a8, B:57:0x00ba, B:60:0x00bf, B:62:0x00db, B:64:0x00e4, B:63:0x00e0, B:67:0x00e9, B:69:0x00f1, B:72:0x00fc, B:81:0x0122, B:83:0x0129, B:87:0x0130, B:89:0x0142, B:91:0x0150, B:95:0x015d, B:98:0x0162, B:100:0x01a8, B:101:0x01ac, B:103:0x01b3, B:108:0x01c0, B:110:0x01c6, B:111:0x01c9, B:113:0x01cd, B:114:0x01d6, B:117:0x01e1), top: B:122:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (zzaE()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzf()) {
            if (this.zzs.zzh()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzs.zzj()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdV)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcfz zzcfzVarZzq = zzq();
                float fZze = zzcfzVarZzq != null ? zzcfzVarZzq.zze() : 0.0f;
                if (fZze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * fZze;
                int i7 = (int) (size / fZze);
                if (size2 != 0) {
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                } else if (i7 != 0) {
                    i5 = (int) (i7 * fZze);
                    i6 = size;
                    i4 = i7;
                } else {
                    size2 = 0;
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                }
                setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                return;
            }
            if (this.zzs.zzg()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzea)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzag("/contentHeight", new zzcfu(this));
                zzaT("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i8 = this.zzI;
                setMeasuredDimension(size3, i8 != -1 ? (int) (i8 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzs.zzi()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            int i9 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i10 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzcgr zzcgrVar = this.zzs;
            boolean z = zzcgrVar.zzb > i9 || zzcgrVar.zza > i10;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfs)).booleanValue()) {
                zzcgr zzcgrVar2 = this.zzs;
                float f3 = zzcgrVar2.zzb;
                float f4 = this.zzj;
                z &= f3 / f4 <= ((float) i9) / f4 && ((float) zzcgrVar2.zza) / f4 <= ((float) i10) / f4;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzn) {
                    this.zzX.zzc(EnumC4719u30.AD_LOAD_TOO_FREQUENTLY_VALUE);
                    this.zzn = true;
                }
                zzcgr zzcgrVar3 = this.zzs;
                setMeasuredDimension(zzcgrVar3.zzb, zzcgrVar3.zza);
                return;
            }
            zzcgr zzcgrVar4 = this.zzs;
            float f5 = zzcgrVar4.zzb;
            float f6 = this.zzj;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not enough space to show ad. Needs " + ((int) (f5 / f6)) + "x" + ((int) (zzcgrVar4.zza / f6)) + " dp, but only has " + ((int) (size4 / f6)) + "x" + ((int) (size5 / f6)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzm) {
                return;
            }
            this.zzX.zzc(EnumC4719u30.AD_NO_FILL_VALUE);
            this.zzm = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmu)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmx)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmu)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmx)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdD)).booleanValue() && this.zzo.zzR();
        if ((!this.zzo.zzU() || this.zzo.zzS()) && !z) {
            zzava zzavaVar = this.zzc;
            if (zzavaVar != null) {
                zzavaVar.zzd(motionEvent);
            }
            zzbds zzbdsVar = this.zze;
            if (zzbdsVar != null) {
                zzbdsVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbfk zzbfkVar = this.zzE;
                    if (zzbfkVar != null) {
                        zzbfkVar.zzd(motionEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcex
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcff) {
            this.zzo = (zzcff) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzA(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzC(zzcfz zzcfzVar) {
        if (this.zzB != null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcfzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzceo
    public final zzfbo zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgm
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgk
    public final zzava zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized zzazx zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized zzbfk zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final /* synthetic */ zzcgp zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgj
    public final synchronized zzcgr zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized zzecp zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized zzecr zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcga
    public final zzfbr zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final zzfcn zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final AI zzT() {
        zzbds zzbdsVar = this.zze;
        return zzbdsVar == null ? zzgch.zzh(null) : zzbdsVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzW(zzfbo zzfboVar, zzfbr zzfbrVar) {
        this.zzk = zzfboVar;
        this.zzl = zzfbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzY() {
        zzbg();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzZ(int i) {
        if (i == 0) {
            zzbcy zzbcyVar = this.zzM;
            zzbcs.zza(zzbcyVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zza(String str) {
        zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaA(String str, Predicate predicate) {
        zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzQ(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaD(final boolean z, final int i) {
        destroy();
        this.zzX.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzcfs
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                int i2 = zzcfw.zza;
                zzbbq.zzbl.zza zzaVarZzb = zzbbq.zzbl.zzb();
                boolean zZzf = zzaVarZzb.zzf();
                boolean z2 = z;
                if (zZzf != z2) {
                    zzaVarZzb.zzd(z2);
                }
                zzaVarZzb.zze(i);
                zzaVar.zzab(zzaVarZzb.zzbr());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.zzo.zzv(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaK(String str, String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaL(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzA(z, i, str, z2, z3);
    }

    public final zzcff zzaO() {
        return this.zzo;
    }

    @VisibleForTesting
    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaS(String str, ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaT(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaX("javascript:".concat(str));
            return;
        }
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaS(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public final synchronized void zzaX(String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @VisibleForTesting
    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzy(bool);
    }

    public final boolean zzaZ() {
        int i;
        int iZzv;
        if (this.zzo.zzT() || this.zzo.zzU()) {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int iZzv2 = com.google.android.gms.ads.internal.util.client.zzf.zzv(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int iZzv3 = com.google.android.gms.ads.internal.util.client.zzf.zzv(displayMetrics2, displayMetrics2.heightPixels);
            Activity activityZza = this.zzb.zza();
            if (activityZza == null || activityZza.getWindow() == null) {
                i = iZzv2;
                iZzv = iZzv3;
            } else {
                com.google.android.gms.ads.internal.zzv.zzq();
                int[] iArrZzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(activityZza);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                int iZzv4 = com.google.android.gms.ads.internal.util.client.zzf.zzv(this.zzi, iArrZzQ[0]);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                iZzv = com.google.android.gms.ads.internal.util.client.zzf.zzv(this.zzi, iArrZzQ[1]);
                i = iZzv4;
            }
            int i2 = this.zzS;
            if (i2 != iZzv2 || this.zzR != iZzv3 || this.zzT != i || this.zzU != iZzv) {
                boolean z = (i2 == iZzv2 && this.zzR == iZzv3) ? false : true;
                this.zzS = iZzv2;
                this.zzR = iZzv3;
                this.zzT = i;
                this.zzU = iZzv;
                new zzbsi(this, "").zzj(iZzv2, iZzv3, i, iZzv, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbcy zzbcyVar = this.zzM;
            zzbcs.zza(zzbcyVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbcx zzbcxVarZzf = zzbda.zzf();
            this.zzJ = zzbcxVarZzf;
            this.zzM.zzb("native:view_show", zzbcxVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzab() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zze()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zza()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(getContext())));
        zzd("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzac(boolean z) {
        this.zzo.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        try {
            if (zzaE()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzab);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcgi.zzb(str2, strArr), "text/html", C.UTF8_NAME, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbcx zzbcxVarZzf = zzbda.zzf();
            this.zzL = zzbcxVarZzf;
            this.zzM.zzb("native:view_load", zzbcxVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzag(String str, zzbjp zzbjpVar) {
        zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzB(str, zzbjpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzah() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzaj(zzcgr zzcgrVar) {
        this.zzs = zzcgrVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzak(zzazx zzazxVar) {
        this.zzG = zzazxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzal(boolean z) {
        this.zzz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzao(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzT(), z);
        } else {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzap(zzbfi zzbfiVar) {
        this.zzF = zzbfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzaq(boolean z) {
        try {
            boolean z2 = this.zzw;
            this.zzw = z;
            zzba();
            if (z != z2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzac)).booleanValue()) {
                    if (!this.zzs.zzi()) {
                    }
                }
                new zzbsi(this, "").zzl(true != z ? MRAIDCommunicatorUtil.STATES_DEFAULT : MRAIDCommunicatorUtil.STATES_EXPANDED);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzar(zzbfk zzbfkVar) {
        this.zzE = zzbfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzas(zzecp zzecpVar) {
        this.zzr = zzecpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzat(zzecr zzecrVar) {
        this.zzq = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzau(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzav(boolean z) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzax(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final synchronized void zzay(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaz(String str, zzbjp zzbjpVar) {
        zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzP(str, zzbjpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzb(String str, String str2) {
        zzaT(AbstractC3888ke0.j(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzdd();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzde() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzde();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdf() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzdg() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayjVar) {
        boolean z;
        synchronized (this) {
            z = zzayjVar.zzj;
            this.zzC = z;
        }
        zzbd(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbR = DM.r("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(sbR.toString()));
        zzaT(sbR.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final zzbcx zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final zzbcy zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final zzcbh zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized zzcde zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcde) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final synchronized zzcfz zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized String zzr() {
        zzfbr zzfbrVar = this.zzl;
        if (zzfbrVar == null) {
            return null;
        }
        return zzfbrVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized String zzs() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzt(String str, zzcde zzcdeVar) {
        try {
            if (this.zzV == null) {
                this.zzV = new HashMap();
            }
            this.zzV.put(str, zzcdeVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzcff zzcffVar = this.zzo;
        if (zzcffVar != null) {
            zzcffVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzv(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzw() {
        zzbfi zzbfiVar = this.zzF;
        if (zzbfiVar != null) {
            final zzdmm zzdmmVar = (zzdmm) zzbfiVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmk
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdmmVar.zzd();
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzz(boolean z) {
        this.zzo.zzE(false);
    }
}
