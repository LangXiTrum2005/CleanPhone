package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
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
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public class zzcjc extends WebViewClient implements zzckp {
    public static final /* synthetic */ int zzc = 0;
    private zzdxe zzA;
    private zzcze zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final zzeif zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzcir zza;
    protected zzcbk zzb;
    private final zzbfj zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzckn zzi;
    private zzcko zzj;
    private zzbmd zzk;
    private zzbmf zzl;
    private zzdir zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbwc zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbvx zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgB)).split(",")));

    public zzcjc(zzcir zzcirVar, zzbfj zzbfjVar, boolean z2, zzbwc zzbwcVar, zzbvx zzbvxVar, zzeif zzeifVar) {
        this.zzd = zzbfjVar;
        this.zza = zzcirVar;
        this.zzs = z2;
        this.zzx = zzbwcVar;
        this.zzH = zzeifVar;
    }

    private final void zzac(final View view, final zzcbk zzcbkVar, final int i2) {
        if (!zzcbkVar.zzc() || i2 <= 0) {
            return;
        }
        zzcbkVar.zzd(view);
        if (zzcbkVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcja
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(view, zzcbkVar, i2);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbo)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzaf(String str, Map map) throws Throwable {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i2 = 0;
            while (true) {
                i2++;
                if (i2 > 20) {
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
                com.google.android.gms.ads.internal.util.zzs zzsVarZzc = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzcir zzcirVar = this.zza;
                    zzsVarZzc.zzb(zzcirVar.getContext(), zzcirVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    WebResourceResponse webResourceResponseZzc = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zzc(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        String contentType = httpURLConnection.getContentType();
                        String strTrim = "";
                        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        String contentType2 = httpURLConnection.getContentType();
                        if (!TextUtils.isEmpty(contentType2)) {
                            String[] strArrSplit = contentType2.split(";");
                            if (strArrSplit.length != 1) {
                                for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                                    if (strArrSplit[i3].trim().startsWith(dc.M)) {
                                        String[] strArrSplit2 = strArrSplit[i3].trim().split(d9.i.f24747b);
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
                        webResourceResponseZzc = com.google.android.gms.ads.internal.zzt.zzf().zzc(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        }
                        if (!headerField.startsWith("tel:")) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                                webResourceResponseZzc = zzae();
                            } else if (protocol.equals("http") || protocol.equals(HttpRequest.DEFAULT_SCHEME)) {
                                StringBuilder sb = new StringBuilder(headerField.length() + 15);
                                sb.append("Redirecting to ");
                                sb.append(headerField);
                                String string = sb.toString();
                                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                StringBuilder sb2 = new StringBuilder(protocol.length() + 20);
                                sb2.append("Unsupported scheme: ");
                                sb2.append(protocol);
                                String string2 = sb2.toString();
                                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                                webResourceResponseZzc = zzae();
                            }
                        }
                    }
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzc;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbnn) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z2, long j) {
        this.zza.zzu(z2, j);
    }

    private static final boolean zzai(zzcir zzcirVar) {
        return zzcirVar.zzC() != null && zzcirVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z2, zzcir zzcirVar) {
        return (!z2 || zzcirVar.zzN().zzg() || zzcirVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzQ(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcir zzcirVar = this.zza;
                if (zzcirVar.zzX()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzcirVar.zzY();
                    return;
                }
                this.zzC = true;
                zzcko zzckoVar = this.zzj;
                if (zzckoVar != null) {
                    zzckoVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzcir zzcirVar2 = this.zza;
                if (zzcirVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznm)).booleanValue()) {
                        zzcirVar2.zzL().zzz(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.zzo = true;
        this.zzp = i2;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzL(str, Collections.EMPTY_MAP);
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
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZzd = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzQ(uriZzd);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if ("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcbk zzcbkVar = this.zzb;
                        if (zzcbkVar != null) {
                            zzcbkVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdir zzdirVar = this.zzm;
                    if (zzdirVar != null) {
                        zzdirVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcir zzcirVar = this.zza;
            if (zzcirVar.zzD().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzayq zzayqVarZzS = zzcirVar.zzS();
                    zzfio zzfioVarZzT = zzcirVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznq)).booleanValue() || zzfioVarZzT == null) {
                        if (zzayqVarZzS != null && zzayqVarZzS.zza(uriZzd)) {
                            uriZzd = zzayqVarZzS.zzd(uriZzd, zzcirVar.getContext(), (View) zzcirVar, zzcirVar.zzj());
                        }
                    } else if (zzayqVarZzS != null && zzayqVarZzS.zza(uriZzd)) {
                        uriZzd = zzfioVarZzT.zza(uriZzd, zzcirVar.getContext(), (View) zzcirVar, zzcirVar.zzj());
                    }
                } catch (zzayr unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzcir zzcirVar2 = this.zza;
                    zzv(zzcVar, true, false, zzcirVar2 != null ? zzcirVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbvx zzbvxVar = this.zzz;
        boolean zZzd = zzbvxVar != null ? zzbvxVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzcbk zzcbkVar = this.zzb;
        if (zzcbkVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcbkVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbnn zzbnnVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbnnVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(String str, zzbnn zzbnnVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbnnVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzbnn> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbnn zzbnnVar : list) {
                    if (predicate.apply(zzbnnVar)) {
                        arrayList.add(zzbnnVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        zzcbk zzcbkVar = this.zzb;
        if (zzcbkVar != null) {
            zzcbkVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbvx zzbvxVar = this.zzz;
                if (zzbvxVar != null) {
                    zzbvxVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzG(zzckn zzcknVar) {
        this.zzi = zzcknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzH(zzcko zzckoVar) {
        this.zzj = zzckoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final zzdxe zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzJ(zzcze zzczeVar) {
        this.zzB = zzczeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final zzcze zzK() {
        return this.zzB;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:83:0x020e A[Catch: all -> 0x01bb, TryCatch #12 {all -> 0x01bb, blocks: (B:71:0x01a0, B:73:0x01b2, B:77:0x01be, B:81:0x01fc, B:83:0x020e, B:84:0x0215), top: B:111:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02cd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzL(String str, Map map) throws Throwable {
        WebResourceResponse webResourceResponse;
        int i2;
        InputStream inputStream;
        InputStream inputStreamZzb;
        Long l2;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        String string;
        try {
            Map map2 = new HashMap();
            zzcir zzcirVar = this.zza;
            if (zzcirVar.zzC() != null) {
                map2 = zzcirVar.zzC().zzaw;
            }
            String strZza = zzcby.zza(str, zzcirVar.getContext(), this.zzF, map2);
            if (!strZza.equals(str)) {
                return zzaf(strZza, map);
            }
            Parcelable.Creator<zzbev> creator = zzbev.CREATOR;
            zzbev zzbevVarZza = zzbev.zza(Uri.parse(str));
            if (zzbevVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put("Access-Control-Allow-Origin", "*");
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZze = zzgqp.zza(zzgpo.zzc('-')).zze(uri.getQueryParameter("range"));
                    if (listZze.size() == 2) {
                        int i3 = Integer.parseInt((String) listZze.get(0));
                        int i4 = Integer.parseInt((String) listZze.get(1)) + 1;
                        if (i3 > 0) {
                            zzbevVarZza.zzh = i3;
                        }
                        i2 = i4 - i3;
                    } else {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                String str2 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfh)).booleanValue()) {
                    zzbevVarZza.zzi = zzgqr.zza(zzcirVar.zzn());
                    zzbevVarZza.zzj = zzcirVar.zzp();
                    if (zzbevVarZza.zzg) {
                        l2 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfj);
                    } else {
                        l2 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfi);
                    }
                    try {
                        long jLongValue = l2.longValue();
                        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                        com.google.android.gms.ads.internal.zzt.zzz();
                        Future futureZza = zzbfg.zza(zzcirVar.getContext(), zzbevVarZza);
                        try {
                            zzbfh zzbfhVar = (zzbfh) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbfhVar.zzc()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbfhVar.zzd()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbfhVar.zzf()));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbfhVar.zze()));
                                    inputStreamZzb = zzbfhVar.zzb();
                                    if (i2 != -1) {
                                        try {
                                            inputStreamZzb = zzgwd.zzb(inputStreamZzb, i2);
                                        } catch (InterruptedException e2) {
                                            e = e2;
                                            z4 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfm)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzX(z4, jElapsedRealtime2);
                                                }
                                            });
                                            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 24);
                                            sb.append("Cache connection took ");
                                            sb.append(jElapsedRealtime2);
                                            sb.append("ms");
                                            string = sb.toString();
                                        } catch (ExecutionException e3) {
                                            e = e3;
                                            z3 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfm)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzW(z3, jElapsedRealtime3);
                                                }
                                            });
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                                            sb2.append("Cache connection took ");
                                            sb2.append(jElapsedRealtime3);
                                            sb2.append("ms");
                                            string = sb2.toString();
                                        } catch (TimeoutException e4) {
                                            e = e4;
                                            z3 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfm)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzW(z3, jElapsedRealtime4);
                                                }
                                            });
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                                            sb3.append("Cache connection took ");
                                            sb3.append(jElapsedRealtime4);
                                            sb3.append("ms");
                                            string = sb3.toString();
                                        }
                                    }
                                    final long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    final boolean z5 = true;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z5, jElapsedRealtime5) { // from class: com.google.android.gms.internal.ads.zzciu
                                        private final /* synthetic */ long zzb;

                                        {
                                            this.zzb = jElapsedRealtime5;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzV(true, this.zzb);
                                        }
                                    });
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                                    sb4.append("Cache connection took ");
                                    sb4.append(jElapsedRealtime5);
                                    sb4.append("ms");
                                    string = sb4.toString();
                                } catch (InterruptedException e5) {
                                    e = e5;
                                    inputStreamZzb = null;
                                } catch (ExecutionException e6) {
                                    e = e6;
                                    inputStreamZzb = null;
                                    z3 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfm)).booleanValue()) {
                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                    }
                                    futureZza.cancel(true);
                                    final long jElapsedRealtime6 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzW(z3, jElapsedRealtime6);
                                        }
                                    });
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(jElapsedRealtime6).length() + 24);
                                    sb5.append("Cache connection took ");
                                    sb5.append(jElapsedRealtime6);
                                    sb5.append("ms");
                                    string = sb5.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(string);
                                    inputStream = inputStreamZzb;
                                    if (inputStream != null) {
                                        return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (TimeoutException e7) {
                                    e = e7;
                                    inputStreamZzb = null;
                                    z3 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfm)).booleanValue()) {
                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                    }
                                    futureZza.cancel(true);
                                    final long jElapsedRealtime7 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzW(z3, jElapsedRealtime7);
                                        }
                                    });
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(jElapsedRealtime7).length() + 24);
                                    sb6.append("Cache connection took ");
                                    sb6.append(jElapsedRealtime7);
                                    sb6.append("ms");
                                    string = sb6.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(string);
                                    inputStream = inputStreamZzb;
                                    if (inputStream != null) {
                                        return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(string);
                            } catch (Throwable th) {
                                th = th;
                                z2 = 1;
                                final long jElapsedRealtime8 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcix
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzY(z2, jElapsedRealtime8);
                                    }
                                });
                                StringBuilder sb7 = new StringBuilder(String.valueOf(jElapsedRealtime8).length() + 24);
                                sb7.append("Cache connection took ");
                                sb7.append(jElapsedRealtime8);
                                sb7.append("ms");
                                com.google.android.gms.ads.internal.util.zze.zza(sb7.toString());
                                throw th;
                            }
                        } catch (InterruptedException e8) {
                            e = e8;
                            inputStreamZzb = null;
                            z4 = false;
                        } catch (ExecutionException e9) {
                            e = e9;
                            inputStreamZzb = null;
                            z3 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfm)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime9 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzW(z3, jElapsedRealtime9);
                                }
                            });
                            StringBuilder sb8 = new StringBuilder(String.valueOf(jElapsedRealtime9).length() + 24);
                            sb8.append("Cache connection took ");
                            sb8.append(jElapsedRealtime9);
                            sb8.append("ms");
                            string = sb8.toString();
                            com.google.android.gms.ads.internal.util.zze.zza(string);
                            inputStream = inputStreamZzb;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                            }
                        } catch (TimeoutException e10) {
                            e = e10;
                            inputStreamZzb = null;
                            z3 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfm)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime10 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzW(z3, jElapsedRealtime10);
                                }
                            });
                            StringBuilder sb9 = new StringBuilder(String.valueOf(jElapsedRealtime10).length() + 24);
                            sb9.append("Cache connection took ");
                            sb9.append(jElapsedRealtime10);
                            sb9.append("ms");
                            string = sb9.toString();
                            com.google.android.gms.ads.internal.util.zze.zza(string);
                            inputStream = inputStreamZzb;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = 0;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = str2;
                    }
                } else {
                    zzbes zzbesVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(zzbevVarZza);
                    if (zzbesVarZzc == null || !zzbesVarZzc.zza()) {
                        inputStream = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbesVarZzc.zzd()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbesVarZzc.zzg()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbesVarZzc.zze()));
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbesVarZzc.zzf()));
                        inputStreamZzb = zzbesVarZzc.zzb();
                        if (i2 != -1) {
                            inputStreamZzb = zzgwd.zzb(inputStreamZzb, i2);
                        }
                    }
                    if (inputStream != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                    }
                }
                inputStream = inputStreamZzb;
                if (inputStream != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbig.zzb.zze()).booleanValue()) ? webResourceResponse : zzaf(str, map);
        } catch (Exception e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest");
            return zzae();
        } catch (NoClassDefFoundError e12) {
            e = e12;
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    public final void zzM(boolean z2) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcir zzcirVar = this.zza.zza;
                    zzcirVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcirVar.zzL();
                    if (zzmVarZzL != null) {
                        zzmVarZzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z2) {
        this.zzF = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzP(int i2, int i3) {
        zzbvx zzbvxVar = this.zzz;
        if (zzbvxVar != null) {
            zzbvxVar.zze(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzQ(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhA)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? AbstractJsonLexerKt.NULL : path.substring(1);
            zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i2 = zzcjc.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgA)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgC)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgym.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcit(this, list, path, uri), zzcdo.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzV(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzR(boolean z2) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzS(boolean z2) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzT(boolean z2) {
        synchronized (this.zzf) {
            this.zzv = z2;
        }
    }

    public final /* synthetic */ void zzU(View view, zzcbk zzcbkVar, int i2) {
        zzac(view, zzcbkVar, i2 - 1);
    }

    public final /* synthetic */ void zzV(boolean z2, long j) {
        zzY(true, j);
    }

    public final /* synthetic */ void zzZ(View view, zzcbk zzcbkVar, int i2) {
        zzac(view, zzcbkVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zza(int i2, int i3, boolean z2) {
        zzbwc zzbwcVar = this.zzx;
        if (zzbwcVar != null) {
            zzbwcVar.zzb(i2, i3);
        }
        zzbvx zzbvxVar = this.zzz;
        if (zzbvxVar != null) {
            zzbvxVar.zzc(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzab(com.google.android.gms.ads.internal.client.zza zzaVar, zzbmd zzbmdVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbmf zzbmfVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z2, zzbnq zzbnqVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbwe zzbweVar, zzcbk zzcbkVar, zzehu zzehuVar, zzfpi zzfpiVar, zzdxe zzdxeVar, zzboi zzboiVar, zzdir zzdirVar, zzboh zzbohVar, zzbob zzbobVar, zzbno zzbnoVar, zzcra zzcraVar, zzdyh zzdyhVar, zzczj zzczjVar, zzcze zzczeVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcbkVar, null) : zzbVar;
        zzcir zzcirVar = this.zza;
        this.zzz = new zzbvx(zzcirVar, zzbweVar);
        this.zzb = zzcbkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbx)).booleanValue()) {
            zzB("/adMetadata", new zzbmc(zzbmdVar));
        }
        if (zzbmfVar != null) {
            zzB("/appEvent", new zzbme(zzbmfVar));
        }
        zzB("/backButton", zzbnm.zzj);
        zzB("/refresh", zzbnm.zzk);
        zzB("/canOpenApp", zzbnm.zzb);
        zzB("/canOpenURLs", zzbnm.zza);
        zzB("/canOpenIntents", zzbnm.zzc);
        zzB("/close", zzbnm.zzd);
        zzB("/customClose", zzbnm.zze);
        zzB("/instrument", zzbnm.zzn);
        zzB("/delayPageLoaded", zzbnm.zzp);
        zzB("/delayPageClosed", zzbnm.zzq);
        zzB("/getLocationInfo", zzbnm.zzr);
        zzB("/log", zzbnm.zzg);
        zzB("/mraid", new zzbnu(zzbVar2, this.zzz, zzbweVar));
        zzbwc zzbwcVar = this.zzx;
        if (zzbwcVar != null) {
            zzB("/mraidLoaded", zzbwcVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzboa(zzbVar3, this.zzz, zzehuVar, zzdxeVar, zzcraVar, zzczjVar));
        zzB("/precache", new zzcgy());
        zzB("/touch", zzbnm.zzi);
        zzB("/video", zzbnm.zzl);
        zzB("/videoMeta", zzbnm.zzm);
        if (zzehuVar == null || zzfpiVar == null) {
            zzB("/click", zzbnm.zzb(zzdirVar, zzcraVar));
            zzB("/httpTrack", zzbnm.zzf);
        } else {
            zzB("/click", zzfiv.zza(zzehuVar, zzfpiVar, zzcraVar, zzdirVar));
            zzB("/httpTrack", zzfiv.zzb(zzehuVar, zzfpiVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcirVar.getContext())) {
            Map map = new HashMap();
            if (zzcirVar.zzC() != null) {
                map = zzcirVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbnt(zzcirVar.getContext(), map));
        }
        if (zzbnqVar != null) {
            zzB("/setInterstitialProperties", new zzbnp(zzbnqVar));
        }
        if (zzboiVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkl)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzboiVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkE)).booleanValue() && zzbohVar != null) {
            zzB("/shareSheet", zzbohVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziK)).booleanValue() && zzdyhVar != null) {
            zzB("/onDeviceStorageEvent", new zzbnv(zzdyhVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkJ)).booleanValue() && zzbobVar != null) {
            zzB("/inspectorOutOfContextTest", zzbobVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkO)).booleanValue() && zzbnoVar != null) {
            zzB("/inspectorStorage", zzbnoVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmR)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbnm.zzu);
            zzB("/presentPlayStoreOverlay", zzbnm.zzv);
            zzB("/expandPlayStoreOverlay", zzbnm.zzw);
            zzB("/collapsePlayStoreOverlay", zzbnm.zzx);
            zzB("/closePlayStoreOverlay", zzbnm.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzec)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbnm.zzA);
            zzB("/resetPAID", zzbnm.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznl)).booleanValue() && zzcirVar.zzC() != null && zzcirVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbnm.zzB);
            zzB("/clearLocalStorageKeys", zzbnm.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbmdVar;
        this.zzl = zzbmfVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdirVar;
        this.zzA = zzdxeVar;
        this.zzB = zzczeVar;
        this.zzn = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzb(zzfhr zzfhrVar) {
        zzcir zzcirVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcirVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbnt(zzcirVar.getContext(), zzfhrVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzc(zzcra zzcraVar) {
        zzD("/click");
        zzB("/click", zzbnm.zzb(this.zzm, zzcraVar));
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzd(zzcra zzcraVar, zzehu zzehuVar, zzfpi zzfpiVar) {
        zzD("/click");
        if (zzehuVar == null || zzfpiVar == null) {
            zzB("/click", zzbnm.zzb(this.zzm, zzcraVar));
        } else {
            zzB("/click", zzfiv.zza(zzehuVar, zzfpiVar, zzcraVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdQ() {
        zzdir zzdirVar = this.zzm;
        if (zzdirVar != null) {
            zzdirVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdu() {
        zzdir zzdirVar = this.zzm;
        if (zzdirVar != null) {
            zzdirVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zze(zzcra zzcraVar, zzehu zzehuVar, zzdxe zzdxeVar) {
        zzD("/open");
        zzB("/open", new zzboa(this.zzy, this.zzz, zzehuVar, zzdxeVar, zzcraVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzj(zzcbk zzcbkVar) {
        this.zzb = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final boolean zzk() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzs;
        }
        return z2;
    }

    public final boolean zzl() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzt;
        }
        return z2;
    }

    public final boolean zzm() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzu;
        }
        return z2;
    }

    public final boolean zzn() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzv;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzq() {
        zzcbk zzcbkVar = this.zzb;
        if (zzcbkVar != null) {
            zzcir zzcirVar = this.zza;
            WebView webViewZzD = zzcirVar.zzD();
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (webViewZzD.isAttachedToWindow()) {
                zzac(webViewZzD, zzcbkVar, 10);
                return;
            }
            zzad();
            zzcis zzcisVar = new zzcis(this, zzcbkVar);
            this.zzI = zzcisVar;
            ((View) zzcirVar).addOnAttachStateChangeListener(zzcisVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzckp
    public final void zzt() {
        zzbfj zzbfjVar = this.zzd;
        if (zzbfjVar != null) {
            zzbfjVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue()) {
                zzcir zzcirVar = this.zza;
                if (zzcirVar.zzq() != null) {
                    zzbgr.zza(zzcirVar.zzq().zzc(), zzcirVar.zzi(), "awfllc");
                }
            }
            zzckn zzcknVar = this.zzi;
            boolean z2 = false;
            if (!this.zzD && !this.zzo) {
                z2 = true;
            }
            zzcknVar.zza(z2, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3, String str) {
        zzcir zzcirVar = this.zza;
        boolean zZzW = zzcirVar.zzW();
        boolean z4 = false;
        boolean z5 = zzaj(zZzW, zzcirVar) || z3;
        if (z5 || !z2) {
            z4 = true;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z5 ? null : this.zzg, zZzW ? null : this.zzh, this.zzw, zzcirVar.zzs(), zzcirVar, z4 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i2) {
        zzeif zzeifVar = this.zzH;
        zzcir zzcirVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcirVar, zzcirVar.zzs(), str, str2, 14, zzeifVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbwr] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z2, int i2, boolean z3) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdir zzdirVar;
        zzcir zzcirVar = this.zza;
        boolean zZzaj = zzaj(zzcirVar.zzW(), zzcirVar);
        boolean z4 = true;
        if (!zZzaj && z3) {
            z4 = false;
        }
        if (zZzaj) {
            zzaVar = null;
            zzdirVar = null;
        } else {
            zzaVar = this.zzg;
            zzdirVar = null;
        }
        zzdir zzdirVar2 = zzdirVar;
        zzA(new AdOverlayInfoParcel(zzaVar, this.zzh, this.zzw, zzcirVar, z2, i2, zzcirVar.zzs(), z4 ? zzdirVar2 : this.zzm, zzai(zzcirVar) ? this.zzH : zzdirVar2));
    }

    public final void zzy(boolean z2, int i2, String str, boolean z3, boolean z4) {
        zzcir zzcirVar = this.zza;
        boolean zZzW = zzcirVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcirVar);
        boolean z5 = true;
        if (!zZzaj && z3) {
            z5 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzaj ? null : this.zzg;
        zzcjb zzcjbVar = zZzW ? null : new zzcjb(zzcirVar, this.zzh);
        zzbmd zzbmdVar = this.zzk;
        zzeif zzeifVar = null;
        zzbmf zzbmfVar = this.zzl;
        boolean z6 = z5;
        zzcjb zzcjbVar2 = zzcjbVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcirVar.zzs();
        zzdir zzdirVar = z6 ? null : this.zzm;
        if (zzai(zzcirVar)) {
            zzeifVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjbVar2, zzbmdVar, zzbmfVar, zzadVar, zzcirVar, z2, i2, str, versionInfoParcelZzs, zzdirVar, zzeifVar, z4));
    }

    public final void zzz(boolean z2, int i2, String str, String str2, boolean z3) {
        zzcir zzcirVar = this.zza;
        boolean zZzW = zzcirVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcirVar);
        boolean z4 = true;
        if (!zZzaj && z3) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzaj ? null : this.zzg;
        zzcjb zzcjbVar = zZzW ? null : new zzcjb(zzcirVar, this.zzh);
        zzbmd zzbmdVar = this.zzk;
        zzeif zzeifVar = null;
        zzbmf zzbmfVar = this.zzl;
        boolean z5 = z4;
        zzcjb zzcjbVar2 = zzcjbVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcirVar.zzs();
        zzdir zzdirVar = z5 ? null : this.zzm;
        if (zzai(zzcirVar)) {
            zzeifVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjbVar2, zzbmdVar, zzbmfVar, zzadVar, zzcirVar, z2, i2, str, str2, versionInfoParcelZzs, zzdirVar, zzeifVar));
    }
}
