package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11817a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyEvent.Callback f11818b;

    public a30(n30 n30Var) {
        this.f11818b = n30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof b30)) {
            return webView.getContext();
        }
        b30 b30Var = (b30) webView;
        Activity activityZzj = b30Var.zzj();
        return activityZzj != null ? activityZzj : b30Var.getContext();
    }

    public boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        g30 g30Var;
        zzb zzbVar;
        int i10 = 1;
        try {
            n30 n30Var = (n30) this.f11818b;
            int i11 = 2;
            int i12 = 0;
            if (n30Var != null && (g30Var = n30Var.f17626a.f19339n) != null && (zzbVar = g30Var.f14715w) != null && zzbVar != null && !zzbVar.zzb()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb2.append("window.");
                sb2.append(str);
                sb2.append("('");
                sb2.append(str3);
                sb2.append("')");
                zzbVar.zzc(sb2.toString());
                return false;
            }
            zzt.zzc();
            AlertDialog.Builder builderZzN = zzs.zzN(context);
            builderZzN.setTitle(str2);
            if (!z10) {
                builderZzN.setMessage(str3).setPositiveButton(R.string.ok, new x20(jsResult, 1)).setNegativeButton(R.string.cancel, new x20(jsResult, 0)).setOnCancelListener(new w20(jsResult, i12)).create().show();
                return true;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderZzN.setView(linearLayout).setPositiveButton(R.string.ok, new wl0(i11, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new lv(jsPromptResult, i10)).setOnCancelListener(new w20(jsPromptResult, i10)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e10) {
            int i13 = zze.zza;
            zzo.zzj("Fail to display Dialog.", e10);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        switch (this.f11817a) {
            case 0:
                if (!(webView instanceof b30)) {
                    int i10 = zze.zza;
                    zzo.zzi("Tried to close a WebView that wasn't an AdWebView.");
                } else {
                    zzm zzmVarZzL = ((b30) webView).zzL();
                    if (zzmVarZzL != null) {
                        zzmVarZzL.zzb();
                    } else {
                        int i11 = zze.zza;
                        zzo.zzi("Tried to close an AdWebView not associated with an overlay.");
                    }
                }
                break;
            default:
                super.onCloseWindow(webView);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        switch (this.f11817a) {
            case 0:
                String strMessage = consoleMessage.message();
                String strSourceId = consoleMessage.sourceId();
                int iLineNumber = consoleMessage.lineNumber();
                int length = String.valueOf(strMessage).length();
                StringBuilder sb2 = new StringBuilder(l1.d.r(length + 6 + String.valueOf(strSourceId).length(), 1, String.valueOf(iLineNumber).length(), 1));
                d5.u.r(sb2, "JS: ", strMessage, " (", strSourceId);
                String strM = com.applovin.impl.ca.m(sb2, ":", iLineNumber, ")");
                if (!strM.contains("Application Cache")) {
                    int i10 = y20.f22089a[consoleMessage.messageLevel().ordinal()];
                    if (i10 == 1) {
                        int i11 = zze.zza;
                        zzo.zzf(strM);
                    } else if (i10 == 2) {
                        int i12 = zze.zza;
                        zzo.zzi(strM);
                    } else if (i10 == 3 || i10 == 4 || i10 != 5) {
                        int i13 = zze.zza;
                        zzo.zzh(strM);
                    } else {
                        int i14 = zze.zza;
                        zzo.zzd(strM);
                    }
                }
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        switch (this.f11817a) {
            case 0:
                WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
                WebView webView2 = new WebView(webView.getContext());
                g30 g30Var = ((n30) this.f11818b).f17626a.f19339n;
                if (g30Var != null) {
                    webView2.setWebViewClient(g30Var);
                }
                webViewTransport.setWebView(webView2);
                message.sendToTarget();
                break;
            default:
                fz0 fz0Var = new fz0(this, 2);
                WebView webView3 = new WebView(((WebViewActivity) this.f11818b).f43414c.getContext());
                webView3.setWebViewClient(fz0Var);
                ((WebView.WebViewTransport) message.obj).setWebView(webView3);
                message.sendToTarget();
                break;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        switch (this.f11817a) {
            case 0:
                long j13 = 5242880 - j12;
                if (j13 > 0) {
                    if (j10 == 0) {
                        if (j11 > j13 || j11 > 1048576) {
                            j11 = 0;
                        }
                    } else if (j11 == 0) {
                        j11 = Math.min(Math.min(131072L, j13) + j10, 1048576L);
                    } else {
                        if (j11 <= Math.min(1048576 - j10, j13)) {
                            j10 += j11;
                        }
                        j11 = j10;
                    }
                    quotaUpdater.updateQuota(j11);
                } else {
                    quotaUpdater.updateQuota(j10);
                }
                break;
            default:
                super.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        switch (this.f11817a) {
            case 0:
                if (callback != null) {
                    n30 n30Var = (n30) this.f11818b;
                    zzt.zzc();
                    if (zzs.zzD(n30Var.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                        z10 = true;
                    } else {
                        zzt.zzc();
                        if (zzs.zzD(n30Var.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (((Boolean) zzba.zzc().a(am.Te)).booleanValue()) {
                        callback.invoke(str, false, true);
                    } else {
                        callback.invoke(str, z10, true);
                    }
                    if (((Boolean) zzba.zzc().a(am.Ue)).booleanValue()) {
                        int i10 = zze.zza;
                        zzo.zzd("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                    }
                }
                break;
            default:
                super.onGeolocationPermissionsShowPrompt(str, callback);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        switch (this.f11817a) {
            case 0:
                zzm zzmVarZzL = ((n30) this.f11818b).f17626a.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzc();
                } else {
                    int i10 = zze.zza;
                    zzo.zzi("Could not get ad overlay when hiding custom view.");
                }
                break;
            default:
                super.onHideCustomView();
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f11817a) {
            case 0:
                return a(b(webView), "alert", str, str2, null, jsResult, null, false);
            default:
                return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f11817a) {
            case 0:
                return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
            default:
                return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f11817a) {
            case 0:
                return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
            default:
                return super.onJsConfirm(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        switch (this.f11817a) {
            case 0:
                return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
            default:
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f11817a) {
            case 0:
                zzm zzmVarZzL = ((n30) this.f11818b).f17626a.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzx(view, customViewCallback);
                    zzmVarZzL.zzw(i10);
                } else {
                    int i11 = zze.zza;
                    zzo.zzi("Could not get ad overlay when showing custom view.");
                    customViewCallback.onCustomViewHidden();
                }
                break;
            default:
                super.onShowCustomView(view, i10, customViewCallback);
                break;
        }
    }

    public a30(WebViewActivity webViewActivity) {
        this.f11818b = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f11817a) {
            case 0:
                onShowCustomView(view, -1, customViewCallback);
                break;
            default:
                super.onShowCustomView(view, customViewCallback);
                break;
        }
    }
}
