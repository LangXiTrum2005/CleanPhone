package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.gms.internal.ads.fz0;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import com.ironsource.Xa;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ConsentForm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f23076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f23077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f23078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f23079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f23080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f23081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dialog f23082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f23083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f23084i = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f23085j = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f23086k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23087m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23088n = false;

    public m(Application application, u uVar, h hVar, r rVar, p pVar, c0 c0Var) {
        this.f23076a = application;
        this.f23077b = uVar;
        this.f23078c = hVar;
        this.f23079d = rVar;
        this.f23080e = pVar;
        this.f23081f = c0Var;
    }

    public final void a(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        this.f23083h = this.f23080e.zzb();
        boolean z10 = this.f23087m;
        c0 c0Var = this.f23081f;
        if (!z10) {
            ((Queue) c0Var.f22974j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        t tVar = this.f23083h;
        tVar.setBackgroundColor(0);
        tVar.getSettings().setJavaScriptEnabled(true);
        tVar.getSettings().setAllowFileAccess(false);
        tVar.getSettings().setAllowContentAccess(false);
        tVar.setWebViewClient(new fz0(tVar));
        if (!this.f23087m) {
            c0Var.a((Queue) c0Var.f22974j.get(), 3, 2, null);
        }
        this.f23085j.set(new l(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener));
        t tVar2 = this.f23083h;
        r rVar = this.f23079d;
        tVar2.loadDataWithBaseURL(rVar.f23175a, rVar.f23176b, "text/html", "UTF-8", null);
        h0.f23034a.postDelayed(new j(this, 0), Xa.f27908s);
    }

    public final void b(p1 p1Var) {
        l lVar = (l) this.f23085j.getAndSet(null);
        if (lVar == null) {
            return;
        }
        if (!this.f23087m) {
            String message = p1Var.getMessage();
            boolean z10 = this.f23088n;
            c0 c0Var = this.f23081f;
            if (z10) {
                c0Var.a((Queue) c0Var.f22973i.get(), 10, 11, message);
            } else {
                c0Var.a((Queue) c0Var.f22971g.get(), 4, 5, message);
            }
        }
        lVar.onConsentFormLoadFailure(p1Var.d());
    }

    public final void c(p1 p1Var) {
        if (this.f23087m) {
            return;
        }
        String message = p1Var == null ? null : p1Var.getMessage();
        boolean z10 = this.f23088n;
        c0 c0Var = this.f23081f;
        if (z10) {
            c0Var.a((Queue) c0Var.f22973i.get(), 10, 11, message);
        } else {
            c0Var.a((Queue) c0Var.f22972h.get(), 6, 7, message);
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        h0.a();
        ((Queue) this.f23081f.f22972h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.f23084i.compareAndSet(false, true)) {
            p1 p1Var = new p1(3, true != this.f23087m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            c(p1Var);
            onConsentFormDismissedListener.onConsentFormDismissed(p1Var.d());
            return;
        }
        t tVar = this.f23083h;
        w wVar = tVar.f23199b;
        Objects.requireNonNull(wVar);
        tVar.f23198a.post(new s(wVar, 0));
        k kVar = new k(this, activity);
        this.f23076a.registerActivityLifecycleCallbacks(kVar);
        this.l.set(kVar);
        this.f23077b.f23210a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f23083h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            p1 p1Var2 = new p1(3, "Activity with null windows is passed in.");
            c(p1Var2);
            onConsentFormDismissedListener.onConsentFormDismissed(p1Var2.d());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        go.c.F(window);
        this.f23086k.set(onConsentFormDismissedListener);
        dialog.show();
        this.f23082g = dialog;
        this.f23083h.a("UMP_messagePresented", "");
        c(null);
    }
}
