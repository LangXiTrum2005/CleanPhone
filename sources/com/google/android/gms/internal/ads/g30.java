package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g30 extends WebViewClient implements zza, qc0 {
    public static final /* synthetic */ int I = 0;
    public n90 A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final zl0 G;
    public c30 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30 f14694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj f14695b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zza f14698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzr f14699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y30 f14700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z30 f14701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fq f14702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gq f14703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qc0 f14704k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14705m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzad f14713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public nv f14714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zzb f14715w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public bz f14717y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public yh0 f14718z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14696c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14697d = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14706n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f14707o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f14708p = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public kv f14716x = null;
    public final HashSet F = new HashSet(Arrays.asList(((String) zzba.zzc().a(am.N6)).split(",")));

    public g30(b30 b30Var, pj pjVar, boolean z10, nv nvVar, zl0 zl0Var) {
        this.f14695b = pjVar;
        this.f14694a = b30Var;
        this.f14709q = z10;
        this.f14714v = nvVar;
        this.G = zl0Var;
    }

    public static WebResourceResponse Y() {
        if (((Boolean) zzba.zzc().a(am.A1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean j0(b30 b30Var) {
        return b30Var.zzC() != null && b30Var.zzC().b();
    }

    public static final boolean n0(boolean z10, b30 b30Var) {
        return (!z10 || b30Var.zzN().b() || b30Var.n().equals("interstitial_mb")) ? false : true;
    }

    public final void A0(zzc zzcVar, boolean z10, boolean z11, String str) {
        b30 b30Var = this.f14694a;
        boolean zI = b30Var.i();
        boolean z12 = false;
        boolean z13 = n0(zI, b30Var) || z11;
        if (z13 || !z10) {
            z12 = true;
        }
        a(new AdOverlayInfoParcel(zzcVar, z13 ? null : this.f14698e, zI ? null : this.f14699f, this.f14713u, b30Var.zzs(), b30Var, z12 ? null : this.f14704k, str));
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void C() {
        qc0 qc0Var = this.f14704k;
        if (qc0Var != null) {
            qc0Var.C();
        }
    }

    public final void J(zza zzaVar, fq fqVar, zzr zzrVar, gq gqVar, zzad zzadVar, boolean z10, rq rqVar, zzb zzbVar, b21 b21Var, bz bzVar, ul0 ul0Var, mx0 mx0Var, yh0 yh0Var, pq pqVar, qc0 qc0Var, eq eqVar, wq wqVar, pq pqVar2, m60 m60Var, ji0 ji0Var, q90 q90Var, n90 n90Var) {
        b30 b30Var = this.f14694a;
        zzb zzbVar2 = zzbVar == null ? new zzb(b30Var.getContext(), bzVar, null) : zzbVar;
        this.f14716x = new kv(b30Var, b21Var);
        this.f14717y = bzVar;
        if (((Boolean) zzba.zzc().a(am.J1)).booleanValue()) {
            b("/adMetadata", new eq(fqVar, 0));
        }
        if (gqVar != null) {
            b("/appEvent", new eq(gqVar, 1));
        }
        b("/backButton", nq.f17894e);
        b("/refresh", nq.f17895f);
        b("/canOpenApp", iq.f15817b);
        b("/canOpenURLs", iq.f15821f);
        b("/canOpenIntents", iq.f15818c);
        b("/close", nq.f17890a);
        b("/customClose", nq.f17891b);
        b("/instrument", nq.f17898i);
        b("/delayPageLoaded", nq.f17900k);
        b("/delayPageClosed", nq.l);
        b("/getLocationInfo", nq.f17901m);
        b("/log", nq.f17892c);
        b("/mraid", new sq(zzbVar2, this.f14716x, b21Var));
        nv nvVar = this.f14714v;
        if (nvVar != null) {
            b("/mraidLoaded", nvVar);
        }
        zzb zzbVar3 = zzbVar2;
        b("/open", new vq(zzbVar3, this.f14716x, ul0Var, yh0Var, m60Var, q90Var));
        b("/precache", new iq(26));
        b("/touch", iq.f15820e);
        b("/video", nq.f17896g);
        b("/videoMeta", nq.f17897h);
        if (ul0Var == null || mx0Var == null) {
            b("/click", new lq(0, qc0Var, m60Var));
            b("/httpTrack", iq.f15819d);
        } else {
            b("/click", new sd0(qc0Var, m60Var, mx0Var, ul0Var));
            b("/httpTrack", new lq(6, mx0Var, ul0Var));
        }
        if (zzt.zzD().a(b30Var.getContext())) {
            Object map = new HashMap();
            if (b30Var.zzC() != null) {
                map = b30Var.zzC().f13716w0;
            }
            b("/logScionEvent", new lq(1, b30Var.getContext(), map));
        }
        if (rqVar != null) {
            b("/setInterstitialProperties", new eq(rqVar, 2));
        }
        if (pqVar != null) {
            if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue()) {
                b("/inspectorNetworkExtras", pqVar);
            }
        }
        if (((Boolean) zzba.zzc().a(am.Oa)).booleanValue() && eqVar != null) {
            b("/shareSheet", eqVar);
        }
        if (((Boolean) zzba.zzc().a(am.Q8)).booleanValue() && ji0Var != null) {
            b("/onDeviceStorageEvent", new eq(ji0Var, 3));
        }
        if (((Boolean) zzba.zzc().a(am.Ta)).booleanValue() && wqVar != null) {
            b("/inspectorOutOfContextTest", wqVar);
        }
        if (((Boolean) zzba.zzc().a(am.Ya)).booleanValue() && pqVar2 != null) {
            b("/inspectorStorage", pqVar2);
        }
        if (((Boolean) zzba.zzc().a(am.f12201id)).booleanValue()) {
            b("/bindPlayStoreOverlay", nq.f17904p);
            b("/presentPlayStoreOverlay", nq.f17905q);
            b("/expandPlayStoreOverlay", nq.f17906r);
            b("/collapsePlayStoreOverlay", nq.f17907s);
            b("/closePlayStoreOverlay", nq.f17908t);
        }
        if (((Boolean) zzba.zzc().a(am.f12313q4)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", nq.f17910v);
            b("/resetPAID", nq.f17909u);
        }
        if (((Boolean) zzba.zzc().a(am.Cd)).booleanValue() && b30Var.zzC() != null && b30Var.zzC().r0) {
            b("/writeToLocalStorage", nq.f17911w);
            b("/clearLocalStorageKeys", nq.f17912x);
        }
        this.f14698e = zzaVar;
        this.f14699f = zzrVar;
        this.f14702i = fqVar;
        this.f14703j = gqVar;
        this.f14713u = zzadVar;
        this.f14715w = zzbVar3;
        this.f14704k = qc0Var;
        this.f14718z = yh0Var;
        this.A = n90Var;
        this.l = z10;
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void O() {
        qc0 qc0Var = this.f14704k;
        if (qc0Var != null) {
            qc0Var.O();
        }
    }

    public final void Q(View view, bz bzVar, int i10) {
        boolean z10;
        Bitmap bitmapCreateBitmap;
        zy zyVar = (zy) bzVar;
        boolean z11 = zyVar.f22768g.f12546c;
        if (!z11 || (z10 = zyVar.f22771j) || i10 <= 0) {
            return;
        }
        if (z11 && !z10) {
            zzt.zzc();
            Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e10) {
                        e = e10;
                        int i11 = zze.zza;
                        zzo.zzg("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i12 = zze.zza;
                            zzo.zzi("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e12) {
                        int i13 = zze.zza;
                        zzo.zzg("Fail to capture the webview", e12);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                x10.j("Failed to capture the webview bitmap.");
            } else {
                zyVar.f22771j = true;
                zd1 zd1Var = new zd1(11, zyVar, bitmap);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    zd1Var.run();
                } else {
                    l00.f16608a.execute(zd1Var);
                }
            }
        }
        if (!zyVar.f22768g.f12546c || zyVar.f22771j) {
            return;
        }
        zzs.zza.postDelayed(new c20(this, view, zyVar, i10), 100L);
    }

    public final WebResourceResponse Z(String str, Map map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                zzs zzsVarZzc = zzt.zzc();
                b30 b30Var = this.f14694a;
                zzsVarZzc.zzb(b30Var.getContext(), b30Var.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                WebResourceResponse webResourceResponseZzc = null;
                zzl zzlVar = new zzl(null);
                zzlVar.zza(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zzc(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    zzt.zzc();
                    zzt.zzc();
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                    zzt.zzc();
                    String contentType2 = httpURLConnection.getContentType();
                    if (!TextUtils.isEmpty(contentType2)) {
                        String[] strArrSplit = contentType2.split(";");
                        if (strArrSplit.length != 1) {
                            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                                if (strArrSplit[i11].trim().startsWith(B5.N)) {
                                    String[] strArrSplit2 = strArrSplit[i11].trim().split(X3.j.f27830b);
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String str2 = strTrim;
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap map2 = new HashMap(headerFields.size());
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    webResourceResponseZzc = zzt.zzf().zzc(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            int i12 = zze.zza;
                            zzo.zzi("Protocol is null");
                            webResourceResponseZzc = Y();
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            StringBuilder sb2 = new StringBuilder(headerField.length() + 15);
                            sb2.append("Redirecting to ");
                            sb2.append(headerField);
                            String string = sb2.toString();
                            int i13 = zze.zza;
                            zzo.zzd(string);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            StringBuilder sb3 = new StringBuilder(protocol.length() + 20);
                            sb3.append("Unsupported scheme: ");
                            sb3.append(protocol);
                            String string2 = sb3.toString();
                            int i14 = zze.zza;
                            zzo.zzi(string2);
                            webResourceResponseZzc = Y();
                        }
                    }
                }
                TrafficStats.clearThreadStatsTag();
                return webResourceResponseZzc;
            }
        } catch (Throwable th2) {
            TrafficStats.clearThreadStatsTag();
            throw th2;
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        kv kvVar = this.f14716x;
        boolean z10 = false;
        if (kvVar != null) {
            synchronized (kvVar.l) {
                z10 = kvVar.f16540s != null;
            }
        }
        zzt.zzb();
        zzn.zza(this.f14694a.getContext(), adOverlayInfoParcel, !z10, this.f14718z);
        bz bzVar = this.f14717y;
        if (bzVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            ((zy) bzVar).a(str);
        }
    }

    public final void b(String str, oq oqVar) {
        synchronized (this.f14697d) {
            try {
                HashMap map = this.f14696c;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(oqVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b0(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                zze.zza(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((oq) it.next()).b(this.f14694a, map);
        }
    }

    public final void e(String str) {
        synchronized (this.f14697d) {
            try {
                List list = (List) this.f14696c.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        bz bzVar = this.f14717y;
        if (bzVar != null) {
            zy zyVar = (zy) bzVar;
            synchronized (zyVar.f22769h) {
                zyVar.f22763b.keySet();
                be1 be1VarD = zw1.d(Collections.EMPTY_MAP);
                rr rrVar = new rr(zyVar, 1);
                k00 k00Var = l00.f16615h;
                fd1 fd1VarX = zw1.x(be1VarD, rrVar, k00Var);
                ListenableFuture listenableFutureV = zw1.v(fd1VarX, 10L, TimeUnit.SECONDS, l00.f16611d);
                fd1VarX.addListener(new zd1(0, fd1VarX, new so0(zyVar, listenableFutureV)), k00Var);
                zy.l.add(listenableFutureV);
            }
            this.f14717y = null;
        }
        c30 c30Var = this.H;
        if (c30Var != null) {
            ((View) this.f14694a).removeOnAttachStateChangeListener(c30Var);
        }
        synchronized (this.f14697d) {
            try {
                this.f14696c.clear();
                this.f14698e = null;
                this.f14699f = null;
                this.f14700g = null;
                this.f14701h = null;
                this.f14702i = null;
                this.f14703j = null;
                this.l = false;
                this.f14709q = false;
                this.f14710r = false;
                this.f14711s = false;
                this.f14713u = null;
                this.f14715w = null;
                this.f14714v = null;
                kv kvVar = this.f14716x;
                if (kvVar != null) {
                    kvVar.m(true);
                    this.f14716x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x01bd: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r18 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:446), block:B:70:0x01bd */
    public final WebResourceResponse k(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i10;
        InputStream rbVar;
        boolean z10;
        long j10;
        InputStream inputStreamB;
        Long l;
        boolean z11;
        final boolean z12;
        Throwable th2;
        InputStream inputStream;
        boolean z13;
        boolean z14;
        String string;
        String str2 = "ms";
        try {
            Map map2 = new HashMap();
            b30 b30Var = this.f14694a;
            if (b30Var.zzC() != null) {
                map2 = b30Var.zzC().f13716w0;
            }
            String strE = rb0.e(str, b30Var.getContext(), this.E, map2);
            if (!strE.equals(str)) {
                return Z(strE, map);
            }
            ij ijVarB = ij.b(Uri.parse(str));
            if (ijVarB != null) {
                HashMap map3 = new HashMap();
                webResourceResponse = null;
                map3.put("Access-Control-Allow-Origin", "*");
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listM = t6.l.h(new z71('-')).m(uri.getQueryParameter("range"));
                    if (listM.size() == 2) {
                        int i11 = Integer.parseInt((String) listM.get(0));
                        int i12 = Integer.parseInt((String) listM.get(1)) + 1;
                        if (i11 > 0) {
                            ijVarB.f15765h = i11;
                        }
                        i10 = i12 - i11;
                    } else {
                        str2 = "ms";
                        i10 = -1;
                    }
                } else {
                    str2 = "ms";
                    i10 = -1;
                }
                if (((Boolean) zzba.zzc().a(am.f12342s5)).booleanValue()) {
                    String strZzn = b30Var.zzn();
                    if (strZzn == null) {
                        strZzn = "";
                    }
                    ijVarB.f15766i = strZzn;
                    ijVarB.f15767j = b30Var.zzp();
                    if (ijVarB.f15764g) {
                        l = (Long) zzba.zzc().a(am.f12374u5);
                    } else {
                        l = (Long) zzba.zzc().a(am.f12358t5);
                    }
                    try {
                        long jLongValue = l.longValue();
                        ((p9.b) zzt.zzk()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        zzt.zzz();
                        kj kjVarA = mj.a(b30Var.getContext(), ijVarB);
                        try {
                            nj njVar = (nj) kjVarA.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(njVar.f17838b));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(njVar.f17839c));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(njVar.f17841e));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(njVar.f17840d));
                                    inputStreamB = njVar.f17837a;
                                    if (i10 != -1) {
                                        long j11 = i10;
                                        try {
                                            int i13 = tb1.f20283a;
                                            inputStreamB = new rb(inputStreamB, j11);
                                        } catch (InterruptedException e10) {
                                            e = e10;
                                            inputStream = inputStreamB;
                                            z14 = true;
                                            if (((Boolean) zzba.zzc().a(am.f12419x5)).booleanValue()) {
                                                zzt.zzh().d("AdWebViewClient.interceptRequest.gcache", e);
                                            }
                                            kjVarA.cancel(true);
                                            Thread.currentThread().interrupt();
                                            ((p9.b) zzt.zzk()).getClass();
                                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            final int i14 = 1;
                                            final boolean z15 = z14;
                                            zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.e30

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ g30 f13817b;

                                                {
                                                    this.f13817b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    switch (i14) {
                                                        case 0:
                                                            this.f13817b.f14694a.B(jElapsedRealtime2, z15);
                                                            break;
                                                        case 1:
                                                            this.f13817b.f14694a.B(jElapsedRealtime2, z15);
                                                            break;
                                                        default:
                                                            this.f13817b.f14694a.B(jElapsedRealtime2, z15);
                                                            break;
                                                    }
                                                }
                                            });
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 24);
                                            sb2.append("Cache connection took ");
                                            sb2.append(jElapsedRealtime2);
                                            sb2.append(str2);
                                            string = sb2.toString();
                                            zze.zza(string);
                                            rbVar = inputStream;
                                        } catch (ExecutionException | TimeoutException e11) {
                                            e = e11;
                                            inputStream = inputStreamB;
                                            z13 = true;
                                            if (((Boolean) zzba.zzc().a(am.f12419x5)).booleanValue()) {
                                                zzt.zzh().d("AdWebViewClient.interceptRequest.gcache", e);
                                            }
                                            kjVarA.cancel(true);
                                            ((p9.b) zzt.zzk()).getClass();
                                            final long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            final int i15 = 0;
                                            final boolean z16 = z13;
                                            zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.e30

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ g30 f13817b;

                                                {
                                                    this.f13817b = this;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    switch (i15) {
                                                        case 0:
                                                            this.f13817b.f14694a.B(jElapsedRealtime3, z16);
                                                            break;
                                                        case 1:
                                                            this.f13817b.f14694a.B(jElapsedRealtime3, z16);
                                                            break;
                                                        default:
                                                            this.f13817b.f14694a.B(jElapsedRealtime3, z16);
                                                            break;
                                                    }
                                                }
                                            });
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                                            sb3.append("Cache connection took ");
                                            sb3.append(jElapsedRealtime3);
                                            sb3.append(str2);
                                            string = sb3.toString();
                                            zze.zza(string);
                                            rbVar = inputStream;
                                        }
                                    }
                                    ((p9.b) zzt.zzk()).getClass();
                                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    zzs.zza.post(new d30(this, jElapsedRealtime4));
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                                    sb4.append("Cache connection took ");
                                    sb4.append(jElapsedRealtime4);
                                    sb4.append(str2);
                                    zze.zza(sb4.toString());
                                    rbVar = inputStreamB;
                                } catch (InterruptedException e12) {
                                    e = e12;
                                    inputStream = null;
                                } catch (ExecutionException | TimeoutException e13) {
                                    e = e13;
                                    inputStream = null;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                z12 = true;
                                ((p9.b) zzt.zzk()).getClass();
                                final long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                final int i16 = 2;
                                zzs.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.e30

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ g30 f13817b;

                                    {
                                        this.f13817b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i16) {
                                            case 0:
                                                this.f13817b.f14694a.B(jElapsedRealtime5, z12);
                                                break;
                                            case 1:
                                                this.f13817b.f14694a.B(jElapsedRealtime5, z12);
                                                break;
                                            default:
                                                this.f13817b.f14694a.B(jElapsedRealtime5, z12);
                                                break;
                                        }
                                    }
                                });
                                StringBuilder sb5 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                                sb5.append("Cache connection took ");
                                sb5.append(jElapsedRealtime5);
                                sb5.append(str2);
                                zze.zza(sb5.toString());
                                throw th2;
                            }
                        } catch (InterruptedException e14) {
                            e = e14;
                            inputStream = null;
                            z14 = false;
                        } catch (ExecutionException | TimeoutException e15) {
                            e = e15;
                            inputStream = null;
                            z13 = false;
                        } catch (Throwable th4) {
                            th2 = th4;
                            z12 = false;
                        }
                    } catch (Throwable th5) {
                        z12 = z11;
                        th2 = th5;
                    }
                } else {
                    fj fjVarB = zzt.zzj().b(ijVarB);
                    if (fjVarB == null || !fjVarB.zza()) {
                        rbVar = null;
                    } else {
                        synchronized (fjVarB) {
                            z10 = fjVarB.f14445b;
                        }
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(z10));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(fjVarB.m()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(fjVarB.h()));
                        synchronized (fjVarB) {
                            j10 = fjVarB.f14447d;
                        }
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(j10));
                        inputStreamB = fjVarB.b();
                        if (i10 != -1) {
                            int i17 = tb1.f20283a;
                            rbVar = new rb(inputStreamB, i10);
                        } else {
                            rbVar = inputStreamB;
                        }
                    }
                }
                if (rbVar != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, rbVar);
                }
            } else {
                webResourceResponse = null;
            }
            return (zzl.zzj() && ((Boolean) cn.f13213b.o()).booleanValue()) ? Z(str, map) : webResourceResponse;
        } catch (Exception | NoClassDefFoundError e16) {
            zzt.zzh().d("AdWebViewClient.interceptRequest", e16);
            return Y();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.f14698e;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            v(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f14697d) {
            try {
                b30 b30Var = this.f14694a;
                if (b30Var.l()) {
                    zze.zza("Blank page loaded, 1...");
                    b30Var.K();
                    return;
                }
                this.B = true;
                z30 z30Var = this.f14701h;
                if (z30Var != null) {
                    z30Var.mo163zza();
                    this.f14701h = null;
                }
                z0();
                b30 b30Var2 = this.f14694a;
                if (b30Var2.zzL() != null) {
                    if (((Boolean) zzba.zzc().a(am.Dd)).booleanValue()) {
                        b30Var2.zzL().zzz(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f14705m = true;
        this.f14706n = i10;
        this.f14707o = str;
        this.f14708p = str2;
    }

    public final void q0(m60 m60Var, ul0 ul0Var, mx0 mx0Var) {
        e("/click");
        if (ul0Var != null && mx0Var != null) {
            b("/click", new sd0(this.f14704k, m60Var, mx0Var, ul0Var));
            return;
        }
        qc0 qc0Var = this.f14704k;
        iq iqVar = nq.f17890a;
        b("/click", new lq(0, qc0Var, m60Var));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return k(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriB = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriB.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriB.getHost())) {
            v(uriB);
            return true;
        }
        boolean z10 = this.l;
        b30 b30Var = this.f14694a;
        if (z10 && webView == b30Var.zzD()) {
            String scheme = uriB.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zza zzaVar = this.f14698e;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                    bz bzVar = this.f14717y;
                    if (bzVar != null) {
                        ((zy) bzVar).a(str);
                    }
                    this.f14698e = null;
                }
                qc0 qc0Var = this.f14704k;
                if (qc0Var != null) {
                    qc0Var.C();
                    this.f14704k = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (b30Var.zzD().willNotDraw()) {
            zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            qf qfVarM0 = b30Var.m0();
            pu0 pu0VarZzT = b30Var.zzT();
            if (!((Boolean) zzba.zzc().a(am.Hd)).booleanValue() || pu0VarZzT == null) {
                if (qfVarM0 != null && qfVarM0.a(uriB)) {
                    uriB = qfVarM0.b(uriB, b30Var.getContext(), (View) b30Var, b30Var.zzj());
                }
            } else if (qfVarM0 != null && qfVarM0.a(uriB)) {
                uriB = pu0VarZzT.a(uriB, b30Var.getContext(), (View) b30Var, b30Var.zzj());
            }
        } catch (rf unused) {
            zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        zzb zzbVar = this.f14715w;
        if (zzbVar == null || zzbVar.zzb()) {
            A0(new zzc("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null, null), true, false, b30Var.zzn());
        } else {
            zzbVar.zzc(str);
        }
        return true;
    }

    public final void u0(m60 m60Var, ul0 ul0Var, yh0 yh0Var) {
        e("/open");
        b("/open", new vq(this.f14715w, this.f14716x, ul0Var, yh0Var, m60Var, null));
    }

    public final void v(Uri uri) {
        zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.f14696c.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) zzba.zzc().a(am.N7)).booleanValue() || zzt.zzh().a() == null) {
                return;
            }
            l00.f16608a.execute(new d((path == null || path.length() < 2) ? "null" : path.substring(1), 24));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzba.zzc().a(am.M6)).booleanValue() && this.F.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzba.zzc().a(am.O6)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                ListenableFuture listenableFutureZzf = zzt.zzc().zzf(uri);
                listenableFutureZzf.addListener(new zd1(0, listenableFutureZzf, new hz((Object) this, (Object) list, (Object) path, (Comparable) uri, 4)), l00.f16613f);
                return;
            }
        }
        zzt.zzc();
        b0(zzs.zzT(uri), list, path);
    }

    public final boolean v0() {
        boolean z10;
        synchronized (this.f14697d) {
            z10 = this.f14710r;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0() {
        bz bzVar = this.f14717y;
        if (bzVar != null) {
            b30 b30Var = this.f14694a;
            WebView webViewZzD = b30Var.zzD();
            WeakHashMap weakHashMap = m0.s0.f45746a;
            if (webViewZzD.isAttachedToWindow()) {
                Q(webViewZzD, bzVar, 10);
                return;
            }
            c30 c30Var = this.H;
            if (c30Var != null) {
                ((View) b30Var).removeOnAttachStateChangeListener(c30Var);
            }
            c30 c30Var2 = new c30(this, bzVar);
            this.H = c30Var2;
            ((View) b30Var).addOnAttachStateChangeListener(c30Var2);
        }
    }

    public final void z(int i10, int i11) {
        nv nvVar = this.f14714v;
        if (nvVar != null) {
            nvVar.m(i10, i11);
        }
        kv kvVar = this.f14716x;
        if (kvVar != null) {
            synchronized (kvVar.l) {
                kvVar.f16528f = i10;
                kvVar.f16529g = i11;
            }
        }
    }

    public final void z0() {
        y30 y30Var = this.f14700g;
        b30 b30Var = this.f14694a;
        if (y30Var != null && ((this.B && this.D <= 0) || this.C || this.f14705m)) {
            if (((Boolean) zzba.zzc().a(am.G2)).booleanValue() && b30Var.zzq() != null) {
                pi1.j((gm) b30Var.zzq().f17037c, b30Var.zzi(), "awfllc");
            }
            y30 y30Var2 = this.f14700g;
            boolean z10 = false;
            if (!this.C && !this.f14705m) {
                z10 = true;
            }
            y30Var2.zza(z10, this.f14706n, this.f14707o, this.f14708p);
            this.f14700g = null;
        }
        b30Var.W();
    }
}
