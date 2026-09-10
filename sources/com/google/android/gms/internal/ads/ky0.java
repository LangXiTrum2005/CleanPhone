package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8 f16557a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dz0 f16560d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16563g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy0 f16558b = new zy0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16561e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16562f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oz0 f16559c = new oz0(null);

    public ky0(m01 m01Var, a8 a8Var, String str) {
        this.f16557a = a8Var;
        this.f16563g = str;
        jy0 jy0Var = (jy0) a8Var.f11931g;
        if (jy0Var == jy0.HTML || jy0Var == jy0.JAVASCRIPT) {
            WebView webView = (WebView) a8Var.f11926b;
            ez0 ez0Var = new ez0(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            ez0Var.f13771b = new oz0(webView);
            this.f16560d = ez0Var;
        } else {
            this.f16560d = new gz0(str, Collections.unmodifiableMap((HashMap) a8Var.f11928d));
        }
        this.f16560d.a();
        vy0.f21317c.f21318a.add(this);
        dz0 dz0Var = this.f16560d;
        s6 s6Var = s6.f19863g;
        WebView webViewC = dz0Var.c();
        String str2 = dz0Var.f13770a;
        JSONObject jSONObject = new JSONObject();
        hz0.b(jSONObject, "impressionOwner", (py0) m01Var.f17186b);
        hz0.b(jSONObject, "mediaEventsOwner", (py0) m01Var.f17187c);
        hz0.b(jSONObject, "creativeType", (ly0) m01Var.f17188d);
        hz0.b(jSONObject, "impressionType", (ny0) m01Var.f17189e);
        hz0.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(m01Var.f17185a));
        s6Var.w(webViewC, "init", jSONObject, str2);
    }

    public final void a() {
        if (this.f16561e || this.f16560d == null) {
            return;
        }
        this.f16561e = true;
        ArrayList arrayList = vy0.f21317c.f21319b;
        boolean z10 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z10) {
            bz0 bz0VarA = bz0.a();
            bz0VarA.getClass();
            uy0 uy0Var = uy0.f20962d;
            uy0Var.f22038c = bz0VarA;
            uy0Var.f22036a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z11 = runningAppProcessInfo.importance == 100 || uy0Var.a();
            uy0Var.f22037b = z11;
            uy0Var.b(z11);
            kz0.f16576g.getClass();
            kz0.b();
            sy0 sy0Var = bz0VarA.f12942b;
            sy0Var.getClass();
            sy0Var.f20084f.submit(new ry0(sy0Var, 0));
            sy0Var.f20080b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, sy0Var);
        }
        float f10 = bz0.a().f12941a;
        dz0 dz0Var = this.f16560d;
        s6.f19863g.w(dz0Var.c(), "setDeviceVolume", Float.valueOf(f10), dz0Var.f13770a);
        dz0 dz0Var2 = this.f16560d;
        Date date = (Date) ty0.f20527e.f20530c;
        dz0Var2.f(date != null ? (Date) date.clone() : null);
        this.f16560d.d(this, this.f16557a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f16562f || ((View) this.f16559c.get()) == view) {
            return;
        }
        this.f16559c = new oz0(view);
        dz0 dz0Var = this.f16560d;
        dz0Var.getClass();
        dz0Var.f13772c = System.nanoTime();
        dz0Var.f13773d = 1;
        Collection<ky0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(vy0.f21317c.f21318a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (ky0 ky0Var : collectionUnmodifiableCollection) {
            if (ky0Var != this && ((View) ky0Var.f16559c.get()) == view) {
                ky0Var.f16559c.clear();
            }
        }
    }

    public final void c() {
        if (this.f16562f) {
            return;
        }
        this.f16559c.clear();
        if (!this.f16562f) {
            this.f16558b.f22774a.clear();
        }
        this.f16562f = true;
        dz0 dz0Var = this.f16560d;
        s6.f19863g.w(dz0Var.c(), "finishSession", dz0Var.f13770a);
        vy0 vy0Var = vy0.f21317c;
        ArrayList arrayList = vy0Var.f21318a;
        ArrayList arrayList2 = vy0Var.f21319b;
        boolean z10 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z10 && arrayList2.size() <= 0) {
            bz0 bz0VarA = bz0.a();
            bz0VarA.getClass();
            kz0 kz0Var = kz0.f16576g;
            kz0Var.getClass();
            Handler handler = kz0.f16578i;
            if (handler != null) {
                handler.removeCallbacks(kz0.f16580k);
                kz0.f16578i = null;
            }
            kz0Var.f16581a.clear();
            kz0.f16577h.post(new ry0(kz0Var));
            uy0 uy0Var = uy0.f20962d;
            uy0Var.f22036a = false;
            uy0Var.f22038c = null;
            sy0 sy0Var = bz0VarA.f12942b;
            sy0Var.f20080b.getContentResolver().unregisterContentObserver(sy0Var);
        }
        this.f16560d.b();
        this.f16560d = null;
    }
}
