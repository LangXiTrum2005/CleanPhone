package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f23227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f23228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f23229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f23230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f23231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zc.u f23232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f23233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f23234h;

    public w(Application application, u uVar, Handler handler, Executor executor, t0 t0Var, zc.u uVar2, m mVar, h hVar) {
        this.f23227a = application;
        this.f23228b = uVar;
        this.f23229c = handler;
        this.f23230d = executor;
        this.f23231e = t0Var;
        this.f23232f = uVar2;
        this.f23233g = mVar;
        this.f23234h = hVar;
    }

    public final void a(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        i0[] i0VarArr = {this, this.f23232f};
        t0 t0Var = this.f23231e;
        t0Var.getClass();
        t0Var.f23201a.execute(new com.google.android.gms.common.api.internal.m0(queryParameter, queryParameter2, i0VarArr));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    @Override // com.google.android.gms.internal.consent_sdk.i0
    public final boolean b(String str, JSONObject jSONObject) {
        int i10;
        Dialog dialog;
        k kVar;
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener;
        m mVar = this.f23233g;
        switch (str) {
            case "load_complete":
                l lVar = (l) mVar.f23085j.getAndSet(null);
                if (lVar != null) {
                    if (!mVar.f23087m && !mVar.f23088n) {
                        c0 c0Var = mVar.f23081f;
                        c0Var.a((Queue) c0Var.f22971g.get(), 4, 5, null);
                    }
                    lVar.onConsentFormLoadSuccess(mVar);
                    return true;
                }
            case "configure_app_assets":
                this.f23230d.execute(new s(this, 1));
                return true;
            case "browser":
                String strOptString = jSONObject.optString("url");
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri uri = Uri.parse(strOptString);
                if (uri.getScheme() == null) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
                }
                try {
                    this.f23228b.startActivity(new Intent("android.intent.action.VIEW", uri));
                    return true;
                } catch (ActivityNotFoundException e10) {
                    Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e10);
                    return true;
                }
            case "dismiss":
                switch (jSONObject.optString("status")) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "personalized":
                    case "CONSENT_SIGNAL_SUFFICIENT":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                    case "non_personalized":
                        i10 = 3;
                        dialog = mVar.f23082g;
                        if (dialog != null) {
                            dialog.dismiss();
                            mVar.f23082g = null;
                        }
                        mVar.f23077b.f23210a = null;
                        kVar = (k) mVar.l.getAndSet(null);
                        if (kVar != null) {
                            kVar.f23065b.f23076a.unregisterActivityLifecycleCallbacks(kVar);
                        }
                        onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) mVar.f23086k.getAndSet(null);
                        if (onConsentFormDismissedListener != null) {
                            mVar.f23078c.f23032b.edit().putInt("consent_status", i10).commit();
                            onConsentFormDismissedListener.onConsentFormDismissed(null);
                            return true;
                        }
                    case "CONSENT_SIGNAL_NOT_REQUIRED":
                        i10 = 1;
                        dialog = mVar.f23082g;
                        if (dialog != null) {
                            dialog.dismiss();
                            mVar.f23082g = null;
                        }
                        mVar.f23077b.f23210a = null;
                        kVar = (k) mVar.l.getAndSet(null);
                        if (kVar != null) {
                            kVar.f23065b.f23076a.unregisterActivityLifecycleCallbacks(kVar);
                        }
                        onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) mVar.f23086k.getAndSet(null);
                        if (onConsentFormDismissedListener != null) {
                            mVar.f23078c.f23032b.edit().putInt("consent_status", i10).commit();
                            onConsentFormDismissedListener.onConsentFormDismissed(null);
                            return true;
                        }
                    default:
                        p1 p1Var = new p1(1, "We are getting something wrong with the webview.");
                        Dialog dialog2 = mVar.f23082g;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            mVar.f23082g = null;
                        }
                        mVar.f23077b.f23210a = null;
                        k kVar2 = (k) mVar.l.getAndSet(null);
                        if (kVar2 != null) {
                            kVar2.f23065b.f23076a.unregisterActivityLifecycleCallbacks(kVar2);
                        }
                        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener2 = (ConsentForm.OnConsentFormDismissedListener) mVar.f23086k.getAndSet(null);
                        if (onConsentFormDismissedListener2 != null) {
                            mVar.c(p1Var);
                            onConsentFormDismissedListener2.onConsentFormDismissed(p1Var.d());
                            return true;
                        }
                }
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.i0
    public final Executor zza() {
        final Handler handler = this.f23229c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.v
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
