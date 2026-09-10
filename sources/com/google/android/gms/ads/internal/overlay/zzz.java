package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.f71;
import com.google.android.gms.internal.ads.h71;
import com.google.android.gms.internal.ads.j71;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.l71;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.internal.ads.m71;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.ads.o71;
import com.google.android.gms.internal.ads.r71;
import com.google.android.gms.internal.ads.s71;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzz {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o71 f10967f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b30 f10964c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10966e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10962a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public at0 f10965d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10963b = null;

    public final void a(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.f10964c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            b("onError", map);
        }
    }

    public final void b(final String str, final HashMap map) {
        l00.f16613f.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                b30 b30Var = this.f10959a.f10964c;
                if (b30Var != null) {
                    b30Var.e(str, map);
                }
            }
        });
    }

    public final j71 c() {
        String str;
        String str2 = null;
        if (!((Boolean) zzba.zzc().a(am.f12184hd)).booleanValue() || TextUtils.isEmpty(this.f10963b)) {
            String str3 = this.f10962a;
            if (str3 != null) {
                str = null;
                str2 = str3;
            } else {
                a("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.f10963b;
        }
        return new j71(str2, str);
    }

    public final synchronized void zza(@Nullable b30 b30Var, Context context) {
        this.f10964c = b30Var;
        if (!zzb(context)) {
            a("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        b("on_play_store_bind", map);
    }

    public final synchronized boolean zzb(Context context) {
        if (!s71.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f10965d = new at0(new l71(context), 8);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e10);
        }
        if (this.f10965d == null) {
            this.f10966e = false;
            return false;
        }
        if (this.f10967f == null) {
            this.f10967f = new zzx(this);
        }
        this.f10966e = true;
        return true;
    }

    public final void zzc(@Nullable b30 b30Var, @Nullable m71 m71Var) {
        if (b30Var == null) {
            a("adWebview missing", "onLMDShow");
            return;
        }
        this.f10964c = b30Var;
        if (!this.f10966e && !zzb(b30Var.getContext())) {
            a("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12184hd)).booleanValue()) {
            this.f10963b = ((h71) m71Var).f15202b;
        }
        if (this.f10967f == null) {
            this.f10967f = new zzx(this);
        }
        at0 at0Var = this.f10965d;
        if (at0Var != null) {
            o71 o71Var = this.f10967f;
            l71 l71Var = (l71) at0Var.f12510b;
            ln0 ln0Var = l71Var.f16776a;
            if (ln0Var == null) {
                l71.f16774c.d("error: %s", "Play Store not found.");
            } else if (l71.c(o71Var, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, ((h71) m71Var).f15202b))) {
                ln0Var.j(new r71(ln0Var, new o1(l71Var, m71Var, o71Var, 13), 0));
            }
        }
    }

    public final void zzd() {
        at0 at0Var;
        if (!this.f10966e || (at0Var = this.f10965d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((l71) at0Var.f12510b).a(c(), this.f10967f, 1);
            b("onLMDOverlayExpand", new HashMap());
        }
    }

    public final void zze() {
        at0 at0Var;
        if (!this.f10966e || (at0Var = this.f10965d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((l71) at0Var.f12510b).a(c(), this.f10967f, 2);
            b("onLMDOverlayCollapse", new HashMap());
        }
    }

    public final void zzf() {
        at0 at0Var;
        String str;
        if (!this.f10966e || (at0Var = this.f10965d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        String str2 = null;
        if (!((Boolean) zzba.zzc().a(am.f12184hd)).booleanValue() || TextUtils.isEmpty(this.f10963b)) {
            String str3 = this.f10962a;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                a("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.f10963b;
        }
        f71 f71Var = new f71(str2, str);
        o71 o71Var = this.f10967f;
        l71 l71Var = (l71) at0Var.f12510b;
        ln0 ln0Var = l71Var.f16776a;
        if (ln0Var == null) {
            l71.f16774c.d("error: %s", "Play Store not found.");
        } else if (l71.c(o71Var, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
            ln0Var.j(new r71(ln0Var, new o1(l71Var, f71Var, o71Var, 12), 0));
        }
    }
}
