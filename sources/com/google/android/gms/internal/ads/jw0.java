package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kw0 f16203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16204c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public uw f16207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zze f16208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture f16209h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16202a = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16210i = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mw0 f16205d = mw0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public jw0(kw0 kw0Var) {
        this.f16203b = kw0Var;
    }

    public final synchronized void a(fw0 fw0Var) {
        try {
            if (((Boolean) an.f12466c.o()).booleanValue()) {
                ArrayList arrayList = this.f16202a;
                fw0Var.zzc();
                arrayList.add(fw0Var);
                ScheduledFuture scheduledFuture = this.f16209h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f16209h = l00.f16611d.schedule(this, ((Integer) zzba.zzc().a(am.f12181ha)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) an.f12466c.o()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.f16210i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.f16210i = 4;
                } else if (arrayList.contains(IronSourceConstants.EVENTS_NATIVE) || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.f16210i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.f16210i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f16210i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.f16210i = 6;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(String str) {
        boolean zMatches;
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzba.zzc().a(am.f12198ia), str);
            }
            if (zMatches) {
                this.f16204c = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            this.f16205d = zzv.zzd(bundle);
        }
    }

    public final synchronized void e(uw uwVar) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            this.f16207f = uwVar;
        }
    }

    public final synchronized void f(zze zzeVar) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            this.f16208g = zzeVar;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            this.f16206e = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) an.f12466c.o()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f16209h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList<fw0> arrayList = this.f16202a;
                for (fw0 fw0Var : arrayList) {
                    int i10 = this.f16210i;
                    if (i10 != 2) {
                        fw0Var.g(i10);
                    }
                    if (!TextUtils.isEmpty(this.f16204c)) {
                        fw0Var.zze(this.f16204c);
                    }
                    if (!TextUtils.isEmpty(this.f16206e) && !fw0Var.zzl()) {
                        fw0Var.zzi(this.f16206e);
                    }
                    uw uwVar = this.f16207f;
                    if (uwVar != null) {
                        fw0Var.b(uwVar);
                    } else {
                        zze zzeVar = this.f16208g;
                        if (zzeVar != null) {
                            fw0Var.c(zzeVar);
                        }
                    }
                    fw0Var.e(this.f16205d);
                    this.f16203b.b(fw0Var.zzm());
                }
                arrayList.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(int i10) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            this.f16210i = i10;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
