package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
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
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.applovin.impl.Z;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.ch;
import com.thinkup.core.common.oo0.on;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
final class zzcju extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcir {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcjx zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbjl zzE;
    private zzbji zzF;
    private zzbdx zzG;
    private int zzH;
    private int zzI;
    private zzbgw zzJ;
    private final zzbgw zzK;
    private zzbgw zzL;
    private final zzbgx zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbfj zzY;
    private boolean zzZ;
    private final zzckt zzb;
    private final zzayq zzc;
    private final zzfio zzd;
    private final zzbhr zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfhr zzk;
    private zzfhu zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcjc zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzejb zzq;
    private zzeiz zzr;
    private zzclb zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcju(zzckt zzcktVar, zzclb zzclbVar, String str, boolean z2, boolean z3, zzayq zzayqVar, zzbhr zzbhrVar, VersionInfoParcel versionInfoParcel, zzbgz zzbgzVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbfj zzbfjVar, zzfhr zzfhrVar, zzfhu zzfhuVar, zzfio zzfioVar) {
        zzfhu zzfhuVar2;
        super(zzcktVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcktVar;
        this.zzs = zzclbVar;
        this.zzt = str;
        this.zzw = z2;
        this.zzc = zzayqVar;
        this.zzd = zzfioVar;
        this.zze = zzbhrVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        this.zzi = displayMetricsZzx;
        this.zzj = displayMetricsZzx.density;
        this.zzY = zzbfjVar;
        this.zzk = zzfhrVar;
        this.zzl = zzfhuVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcktVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmV)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmU)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoB)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzcktVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzr(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzckc(this, new zzckb() { // from class: com.google.android.gms.internal.ads.zzcka
            @Override // com.google.android.gms.internal.ads.zzckb
            public final /* synthetic */ void zza(Uri uri) {
                zzcjc zzcjcVarZzaS = ((zzcju) this).zzaS();
                if (zzcjcVarZzaS != null) {
                    zzcjcVarZzaS.zzQ(uri);
                } else {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbgx zzbgxVar = new zzbgx(new zzbgz(true, "make_wv", this.zzt));
        this.zzM = zzbgxVar;
        zzbgxVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue() && (zzfhuVar2 = this.zzl) != null && zzfhuVar2.zzb != null) {
            zzbgxVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbgxVar.zzc();
        zzbgw zzbgwVarZzf = zzbgz.zzf();
        this.zzK = zzbgwVarZzf;
        zzbgxVar.zza("native:view_create", zzbgwVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcktVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcjr
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean boolZzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = boolZzc;
        if (boolZzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbgr.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfhr zzfhrVar = this.zzk;
        if (zzfhrVar != null && zzfhrVar.zzam) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
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

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcgx) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbh() {
        zzbgx zzbgxVar = this.zzM;
        if (zzbgxVar == null) {
            return;
        }
        zzbgz zzbgzVarZzc = zzbgxVar.zzc();
        zzbgp zzbgpVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zzbgpVarZza != null) {
            zzbgpVarZza.zzb(zzbgzVarZzc);
        }
    }

    private final void zzbi(boolean z2) {
        HashMap map = new HashMap();
        map.put(ch.k, true != z2 ? "0" : "1");
        zze("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcir
    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.zzc();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmf)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb != null && activityZzb.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmg)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcdo.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
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
                        this.zzo.zzF();
                        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                        zzbg();
                        zzbf();
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcir
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcir
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzX()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcir
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrl");
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcjc zzcjcVar = this.zzo;
        if (zzcjcVar != null) {
            zzcjcVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.zzd();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z2 = this.zzC;
            zzcjc zzcjcVar = this.zzo;
            if (zzcjcVar != null && zzcjcVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z2 = true;
            }
            zzbi(z2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcjc zzcjcVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.zze();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcjcVar = this.zzo) != null && zzcjcVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmu)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(getContext(), intent);
        } catch (ActivityNotFoundException e2) {
            String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(strQ);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzX()) {
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
        boolean zZzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zZzaM) {
            return;
        }
        zzmVarZzL.zzC();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:10:0x0010, B:12:0x0016, B:14:0x001a, B:17:0x0024, B:19:0x002c, B:22:0x0031, B:24:0x0039, B:26:0x004b, B:29:0x0050, B:31:0x0057, B:35:0x0061, B:38:0x0066, B:41:0x0077, B:49:0x008f, B:43:0x007e, B:46:0x0083, B:52:0x009c, B:54:0x00a4, B:56:0x00b6, B:59:0x00bb, B:61:0x00d7, B:63:0x00df, B:62:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:80:0x011b, B:82:0x0122, B:86:0x0129, B:88:0x013b, B:90:0x0149, B:94:0x0156, B:97:0x015b, B:99:0x01d0, B:100:0x01d3, B:102:0x01da, B:107:0x01e7, B:109:0x01ed, B:110:0x01f0, B:112:0x01f4, B:113:0x01fd, B:116:0x0208), top: B:121:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i2, i3);
                return;
            }
            if (this.zzs.zzi()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeH)).booleanValue()) {
                    super.onMeasure(i2, i3);
                    return;
                }
                zzcjx zzcjxVarZzh = zzh();
                float fZzm = zzcjxVarZzh != null ? zzcjxVarZzh.zzm() : 0.0f;
                if (fZzm == 0.0f) {
                    super.onMeasure(i2, i3);
                    return;
                }
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                float f = size2 * fZzm;
                int i8 = (int) (size / fZzm);
                if (size2 != 0) {
                    i4 = (int) f;
                    if (size == 0) {
                        i7 = size;
                    } else if (i4 != 0) {
                        i8 = (int) (i4 / fZzm);
                        i5 = size2;
                        i6 = i4;
                        i7 = i6;
                    }
                    i5 = size2;
                    i6 = i4;
                } else if (i8 != 0) {
                    i6 = (int) (i8 * fZzm);
                    i7 = size;
                    i5 = i8;
                } else {
                    size2 = 0;
                    i4 = (int) f;
                    if (size == 0) {
                        i7 = size;
                    } else if (i4 != 0) {
                        i8 = (int) (i4 / fZzm);
                        i5 = size2;
                        i6 = i4;
                        i7 = i6;
                    }
                    i5 = size2;
                    i6 = i4;
                }
                setMeasuredDimension(Math.min(i6, i7), Math.min(i8, i5));
                return;
            }
            if (this.zzs.zzf()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeP)).booleanValue()) {
                    super.onMeasure(i2, i3);
                    return;
                }
                zzab("/contentHeight", new zzcjo(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i2);
                int i9 = this.zzI;
                setMeasuredDimension(size3, i9 != -1 ? (int) (i9 * f2) : View.MeasureSpec.getSize(i3));
                return;
            }
            if (this.zzs.zzg()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size5 = View.MeasureSpec.getSize(i3);
            int i10 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i11 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzclb zzclbVar = this.zzs;
            boolean z2 = zzclbVar.zzb > i10 || zzclbVar.zza > i11;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgr)).booleanValue()) {
                zzclb zzclbVar2 = this.zzs;
                float f3 = zzclbVar2.zzb;
                float f4 = this.zzj;
                z2 &= f3 / f4 <= ((float) i10) / f4 && ((float) zzclbVar2.zza) / f4 <= ((float) i11) / f4;
            }
            if (!z2) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzn) {
                    this.zzY.zzc(10002);
                    this.zzn = true;
                }
                zzclb zzclbVar3 = this.zzs;
                setMeasuredDimension(zzclbVar3.zzb, zzclbVar3.zza);
                return;
            }
            zzclb zzclbVar4 = this.zzs;
            float f5 = zzclbVar4.zzb;
            float f6 = this.zzj;
            int i12 = (int) (f5 / f6);
            int i13 = (int) (zzclbVar4.zza / f6);
            int i14 = (int) (size4 / f6);
            int i15 = (int) (size5 / f6);
            StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 36 + String.valueOf(i13).length() + 18 + String.valueOf(i14).length() + 1 + String.valueOf(i15).length() + 4);
            sb.append("Not enough space to show ad. Needs ");
            sb.append(i12);
            sb.append("x");
            sb.append(i13);
            sb.append(" dp, but only has ");
            sb.append(i14);
            sb.append("x");
            sb.append(i15);
            sb.append(" dp.");
            String string = sb.toString();
            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzm) {
                return;
            }
            this.zzY.zzc(10001);
            this.zzm = true;
            return;
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcir
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznV)).booleanValue() && WebViewFeature.a("MUTE_AUDIO")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                int i3 = WebViewCompat.f8565a;
                if (!WebViewFeatureInternal.m.c()) {
                    throw WebViewFeatureInternal.a();
                }
                WebViewCompat.c(this).f8592a.setAudioMuted(true);
            }
        } catch (Exception e2) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznY)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcir
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznV)).booleanValue() && WebViewFeature.a("MUTE_AUDIO")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                int i3 = WebViewCompat.f8565a;
                if (!WebViewFeatureInternal.m.c()) {
                    throw WebViewFeatureInternal.a();
                }
                WebViewCompat.c(this).f8592a.setAudioMuted(false);
            }
        } catch (Exception e2) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznY)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzep)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z2) {
            zzayq zzayqVar = this.zzc;
            if (zzayqVar != null) {
                zzayqVar.zzc(motionEvent);
            }
            zzbhr zzbhrVar = this.zze;
            if (zzbhrVar != null) {
                zzbhrVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbjl zzbjlVar = this.zzE;
                    if (zzbjlVar != null) {
                        zzbjlVar.zzb(motionEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcir
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcjc) {
            this.zzo = (zzcjc) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzA(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzB(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcii
    public final zzfhr zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckm
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzG() {
        zzbb();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzH(int i2) {
        if (i2 == 0) {
            zzbgx zzbgxVar = this.zzM;
            zzbgr.zza(zzbgxVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbgx zzbgxVar2 = this.zzM;
        zzbgxVar2.zzc();
        zzbgxVar2.zzc().zzd("close_type", String.valueOf(i2));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i2));
        map.put("version", this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzI() {
        if (this.zzJ == null) {
            zzbgx zzbgxVar = this.zzM;
            zzbgr.zza(zzbgxVar.zzc(), this.zzK, "aes2");
            zzbgxVar.zzc();
            zzbgw zzbgwVarZzf = zzbgz.zzf();
            this.zzJ = zzbgwVarZzf;
            zzbgxVar.zza("native:view_show", zzbgwVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzJ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckj
    public final synchronized zzclb zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final /* synthetic */ zzckp zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckk
    public final zzayq zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final zzfio zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized zzejb zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized zzeiz zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcjp(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzaA(final boolean z2, final int i2) {
        destroy();
        zzbfi zzbfiVar = new zzbfi() { // from class: com.google.android.gms.internal.ads.zzcjs
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar) {
                int i3 = zzcju.zza;
                zzbfp.zzbl.zza zzaVarZzq = zzbfp.zzbl.zzq();
                boolean zZzb = zzaVarZzq.zzb();
                boolean z3 = z2;
                if (zZzb != z3) {
                    zzaVarZzq.zzc(z3);
                }
                zzaVarZzq.zzg(i2);
                zzaVar.zzal(zzaVarZzq.zzbu());
            }
        };
        zzbfj zzbfjVar = this.zzY;
        zzbfjVar.zzb(zzbfiVar);
        zzbfjVar.zzc(on.f42285n);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcjy
    public final zzfhu zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaD(zzfhr zzfhrVar, zzfhu zzfhuVar) {
        this.zzk = zzfhrVar;
        this.zzl = zzfhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzaE(boolean z2) {
        if (z2) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzu(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final ListenableFuture zzaF() {
        zzbhr zzbhrVar = this.zze;
        return zzbhrVar == null ? zzgym.zza(null) : zzbhrVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaG(boolean z2) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3, String str) {
        this.zzo.zzv(zzcVar, z2, z3, str);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaI(boolean z2, int i2, boolean z3) {
        this.zzo.zzx(z2, i2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaJ(boolean z2, int i2, String str, boolean z3, boolean z4) {
        this.zzo.zzy(z2, i2, str, z3, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaK(boolean z2, int i2, String str, String str2, boolean z3) {
        this.zzo.zzz(z2, i2, str, str2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaL(String str, String str2, int i2) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaM() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcjc r0 = r10.zzo
            boolean r0 = r0.zzk()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzcjc r0 = r10.zzo
            boolean r0 = r0.zzl()
            if (r0 == 0) goto L86
        L11:
            com.google.android.gms.ads.internal.client.zzbb.zza()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            com.google.android.gms.internal.ads.zzckt r2 = r10.zzb
            android.app.Activity r2 = r2.zzb()
            r3 = 1
            if (r2 == 0) goto L50
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L35
            goto L50
        L35:
            com.google.android.gms.ads.internal.zzt.zzc()
            int[] r2 = com.google.android.gms.ads.internal.util.zzs.zzX(r2)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            r6 = r2[r1]
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r6)
            com.google.android.gms.ads.internal.client.zzbb.zza()
            r2 = r2[r3]
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r0, r2)
            r7 = r2
            goto L52
        L50:
            r6 = r4
            r7 = r5
        L52:
            com.google.android.gms.ads.internal.zzt.zzc()
            android.view.WindowManager r2 = r10.zzX
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.zzS
            if (r2 != r4) goto L87
            int r2 = r10.zzR
            if (r2 != r5) goto L87
            int r2 = r10.zzT
            if (r2 != r6) goto L87
            int r2 = r10.zzU
            if (r2 != r7) goto L87
            com.google.android.gms.internal.ads.zzbgb r2 = com.google.android.gms.internal.ads.zzbgk.zzaz
            com.google.android.gms.internal.ads.zzbgi r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L86
            int r2 = r10.zzV
            if (r2 == r9) goto L86
            goto L87
        L86:
            return r1
        L87:
            int r2 = r10.zzS
            if (r2 != r4) goto La5
            int r2 = r10.zzR
            if (r2 != r5) goto La5
            com.google.android.gms.internal.ads.zzbgb r2 = com.google.android.gms.internal.ads.zzbgk.zzaz
            com.google.android.gms.internal.ads.zzbgi r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La6
            int r2 = r10.zzV
            if (r2 == r9) goto La6
        La5:
            r1 = r3
        La6:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            r10.zzV = r9
            com.google.android.gms.internal.ads.zzbwd r3 = new com.google.android.gms.internal.ads.zzbwd
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.zzl(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcju.zzaM():boolean");
    }

    public final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    public final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcjc zzaS() {
        return this.zzo;
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    public final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    public final /* synthetic */ void zzaY(int i2) {
        this.zzI = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzab(String str, zzbnn zzbnnVar) {
        zzcjc zzcjcVar = this.zzo;
        if (zzcjcVar != null) {
            zzcjcVar.zzB(str, zzbnnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzac(String str, zzbnn zzbnnVar) {
        zzcjc zzcjcVar = this.zzo;
        if (zzcjcVar != null) {
            zzcjcVar.zzC(str, zzbnnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzad(String str, Predicate predicate) {
        zzcjc zzcjcVar = this.zzo;
        if (zzcjcVar != null) {
            zzcjcVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzaf(zzclb zzclbVar) {
        this.zzs = zzclbVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzag(boolean z2) {
        try {
            boolean z3 = this.zzw;
            this.zzw = z2;
            zzbc();
            if (z2 != z3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzax)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbwd(this, "").zzk(true != z2 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzai(Context context) {
        zzckt zzcktVar = this.zzb;
        zzcktVar.setBaseContext(context);
        this.zzQ.zza(zzcktVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzaj(boolean z2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(this.zzo.zzk(), z2);
        } else {
            this.zzu = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzak(zzejb zzejbVar) {
        this.zzq = zzejbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzal(zzeiz zzeizVar) {
        this.zzr = zzeizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzam(int i2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzw(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzao(boolean z2) {
        this.zzz = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzap() {
        if (this.zzL == null) {
            zzbgx zzbgxVar = this.zzM;
            zzbgxVar.zzc();
            zzbgw zzbgwVarZzf = zzbgz.zzf();
            this.zzL = zzbgwVarZzf;
            zzbgxVar.zza("native:view_load", zzbgwVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzaq(zzbjl zzbjlVar) {
        this.zzE = zzbjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized zzbjl zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzas(boolean z2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i2 = this.zzH + (true != z2 ? -1 : 1);
        this.zzH = i2;
        if (i2 > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzau(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaw);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e2) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e2);
                        str4 = null;
                    }
                    super.loadDataWithBaseURL(str, zzcki.zza(str2, str4), "text/html", "UTF-8", null);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaw(boolean z2) {
        this.zzo.zzO(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzax(zzbji zzbjiVar) {
        this.zzF = zzbjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized void zzay(zzbdx zzbdxVar) {
        this.zzG = zzbdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final synchronized zzbdx zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzc(String str, String str2) {
        zzaP(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(Z.d(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbQ.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string));
        zzaP(sbQ.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdQ() {
        zzcjc zzcjcVar = this.zzo;
        if (zzcjcVar != null) {
            zzcjcVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final void zzdj(zzbcj zzbcjVar) {
        boolean z2;
        synchronized (this) {
            z2 = zzbcjVar.zzj;
            this.zzC = z2;
        }
        zzbi(z2);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzcez zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzdn(boolean z2) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdu() {
        zzcjc zzcjcVar = this.zzo;
        if (zzcjcVar != null) {
            zzcjcVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzcjx zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzbgw zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckd, com.google.android.gms.internal.ads.zzcfk
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized String zzn() {
        zzfhu zzfhuVar = this.zzl;
        if (zzfhuVar == null) {
            return null;
        }
        return zzfhuVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzo(int i2) {
        this.zzN = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final zzbgx zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzcgx zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcgx) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckl, com.google.android.gms.internal.ads.zzcfk
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzt(String str, zzcgx zzcgxVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzcgxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzu(boolean z2, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z2 ? "0" : "1");
        map.put("duration", Long.toString(j));
        zze("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzv(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzw(zzcjx zzcjxVar) {
        if (this.zzB == null) {
            this.zzB = zzcjxVar;
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzz() {
        zzbji zzbjiVar = this.zzF;
        if (zzbjiVar != null) {
            zzbjiVar.zza();
        }
    }
}
