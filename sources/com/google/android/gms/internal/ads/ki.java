package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ki implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f16446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gi f16447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f16448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16449d;

    public /* synthetic */ ki(o1 o1Var, gi giVar, WebView webView, boolean z10) {
        this.f16446a = o1Var;
        this.f16447b = giVar;
        this.f16448c = webView;
        this.f16449d = z10;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        li liVar = (li) this.f16446a.f18080d;
        gi giVar = this.f16447b;
        WebView webView = this.f16448c;
        String str = (String) obj;
        boolean z10 = this.f16449d;
        liVar.getClass();
        synchronized (giVar.f14867g) {
            giVar.f14872m--;
        }
        try {
            boolean z11 = true;
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (liVar.f17007n || TextUtils.isEmpty(webView.getTitle())) {
                    giVar.a(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(strOptString);
                    giVar.a(sb2.toString(), z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (giVar.f14867g) {
                if (giVar.f14872m != 0) {
                    z11 = false;
                }
            }
            if (z11) {
                liVar.f16998d.h(giVar);
            }
        } catch (JSONException unused) {
            int i10 = zze.zza;
            zzo.zzd("Json string may be malformed.");
        } catch (Throwable th2) {
            int i11 = zze.zza;
            zzo.zze("Failed to get webview content.", th2);
            zzt.zzh().d("ContentFetchTask.processWebViewContent", th2);
        }
    }
}
