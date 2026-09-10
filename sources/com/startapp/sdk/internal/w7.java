package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OverlayActivity f41606a;
    public String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean[] f41609e;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f41610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f41611i;
    public String[] j;
    public Ad k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f41612l;
    public AdPreferences.Placement m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AdInformationOverrides f41613n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Long f41614p;
    public Long t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.startapp.sdk.adsbase.adinformation.a f41607b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t7 f41608c = new t7(this);
    public boolean[] f = {true};
    public Boolean[] q = null;
    public int r = 0;
    public boolean s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f41615u = false;

    public abstract void a(Bundle bundle);

    public boolean a(int i2, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f41606a.runOnUiThread(new u7(this));
    }

    public abstract void b(Bundle bundle);

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public void e() {
        if (this.f41608c != null) {
            zb.a(this.f41606a).a(this.f41608c);
        }
        this.f41608c = null;
    }

    public abstract void f();

    public abstract void g();

    public void h() {
        zb.a(this.f41606a).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public final String a() {
        try {
            String[] strArr = this.f41610h;
            return (strArr == null || strArr.length <= 0) ? "" : h0.a(strArr[0], (String) null);
        } catch (Throwable th) {
            g9.a(th);
            return "";
        }
    }

    public final void a(String str) {
        String str2;
        if (str != null && (str2 = this.o) != null && str2.length() > 0) {
            this.f41612l = str.replaceAll("startapp_adtag_placeholder", this.o);
        } else {
            this.f41612l = str;
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(this.f41606a, AdInformationObject$Size.LARGE, this.m, this.f41613n, this.k.getConsentData(), this.k.getRequestUrl(), this.k.getDParam(), this.k.getErid(), this.k.getEridUrl());
        this.f41607b = aVar;
        aVar.a(relativeLayout);
    }
}
