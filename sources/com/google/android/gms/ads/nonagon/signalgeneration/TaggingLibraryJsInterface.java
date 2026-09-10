package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.pu0;
import com.google.android.gms.internal.ads.qf;
import com.google.android.gms.internal.ads.rf;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l1.d;
import org.json.JSONException;
import org.json.JSONObject;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class TaggingLibraryJsInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f11353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf f11354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pu0 f11355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ci0 f11357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k00 f11359h = l00.f16613f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mx0 f11360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzj f11361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zza f11362k;
    public final zze l;

    public TaggingLibraryJsInterface(WebView webView, qf qfVar, ci0 ci0Var, mx0 mx0Var, pu0 pu0Var, zzj zzjVar, zza zzaVar, zze zzeVar) {
        this.f11353b = webView;
        Context context = webView.getContext();
        this.f11352a = context;
        this.f11354c = qfVar;
        this.f11357f = ci0Var;
        am.a(context);
        this.f11356e = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12214jb)).intValue();
        this.f11358g = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12229kb)).booleanValue();
        this.f11360i = mx0Var;
        this.f11355d = pu0Var;
        this.f11361j = zzjVar;
        this.f11362k = zzaVar;
        this.l = zzeVar;
    }

    @NonNull
    @JavascriptInterface
    public String getClickSignals(@NonNull String str) {
        try {
            ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzg = this.f11354c.f19044b.zzg(this.f11352a, str, this.f11353b);
            if (this.f11358g) {
                ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzv.zze(this.f11357f, null, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzg;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getClickSignals", e10);
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    public String getClickSignalsWithTimeout(@NonNull final String str, int i10) {
        if (i10 <= 0) {
            String strK = d.k(new StringBuilder(String.valueOf(i10).length() + 51), "Invalid timeout for getting click signals. Timeout=", i10);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(strK);
            return "";
        }
        try {
            return (String) l00.f16608a.b(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f11458a.getClickSignals(str);
                }
            }).get(Math.min(i10, this.f11356e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e10);
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @NonNull
    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbf zzbfVar = new zzbf(this, string);
        if (((Boolean) ln.f17066e.o()).booleanValue()) {
            this.f11361j.zzb(this.f11353b, zzbfVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12258mb)).booleanValue()) {
            this.f11359h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    TaggingLibraryJsInterface taggingLibraryJsInterface = this.f11462a;
                    taggingLibraryJsInterface.getClass();
                    com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
                    Context context = taggingLibraryJsInterface.f11352a;
                    CookieManager cookieManagerZza = zzzVarZzf.zza(context);
                    boolean zAcceptThirdPartyCookies = cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(taggingLibraryJsInterface.f11353b) : false;
                    Bundle bundle2 = bundle;
                    bundle2.putBoolean("accept_3p_cookie", zAcceptThirdPartyCookies);
                    QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle2).build(), zzbfVar);
                }
            });
            return string;
        }
        QueryInfo.generate(this.f11352a, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbfVar);
        return string;
    }

    @NonNull
    @JavascriptInterface
    public String getViewSignals() {
        try {
            ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzj = this.f11354c.f19044b.zzj(this.f11352a, this.f11353b, null);
            if (this.f11358g) {
                ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzv.zze(this.f11357f, null, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzj;
        } catch (RuntimeException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getViewSignals", e10);
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            String strK = d.k(new StringBuilder(String.valueOf(i10).length() + 50), "Invalid timeout for getting view signals. Timeout=", i10);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(strK);
            return "";
        }
        try {
            return (String) l00.f16608a.b(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f11457a.getViewSignals();
                }
            }).get(Math.min(i10, this.f11356e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e10);
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(@NonNull final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12287ob)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        l00.f16608a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                pu0 pu0Var;
                TaggingLibraryJsInterface taggingLibraryJsInterface = this.f11460a;
                WebView webView = taggingLibraryJsInterface.f11353b;
                Context context = taggingLibraryJsInterface.f11352a;
                Uri uriB = Uri.parse(str);
                try {
                    uriB = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Hd)).booleanValue() || (pu0Var = taggingLibraryJsInterface.f11355d) == null) ? taggingLibraryJsInterface.f11354c.b(uriB, context, webView, null) : pu0Var.a(uriB, context, webView, null);
                } catch (rf e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e10);
                    com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.recordClick", e10);
                }
                taggingLibraryJsInterface.f11360i.b(uriB.toString(), null, null, null);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(@NonNull String str) {
        int i10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("x");
            int i12 = jSONObject.getInt("y");
            int i13 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i14 = jSONObject.getInt("type");
            if (i14 != 0) {
                i10 = 1;
                if (i14 != 1) {
                    i10 = 2;
                    if (i14 != 2) {
                        i10 = 3;
                        if (i14 != 3) {
                            i10 = -1;
                        }
                    }
                }
            } else {
                i10 = 0;
            }
            this.f11354c.f19044b.zzd(MotionEvent.obtain(0L, i13, i10, i11, i12, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e10) {
            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e10);
            com.google.android.gms.ads.internal.zzt.zzh().d("TaggingLibraryJsInterface.reportTouchEvent", e10);
        }
    }
}
