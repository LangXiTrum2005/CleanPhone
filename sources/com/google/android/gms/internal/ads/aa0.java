package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends zzdw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f11958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sm0 f11961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f11962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f11963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11964k;

    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    public aa0(du0 du0Var, String str, sm0 sm0Var, fu0 fu0Var, String str2) {
        String str3;
        String string = null;
        this.f11955b = du0Var == null ? null : du0Var.f13678b0;
        this.f11956c = str2;
        this.f11957d = fu0Var == null ? null : fu0Var.f14546b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && du0Var != null) {
            try {
                string = du0Var.f13713v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f11954a = string != null ? string : str;
        this.f11958e = sm0Var.f20000a;
        this.f11961h = sm0Var;
        this.f11963j = du0Var == null ? 0.0d : du0Var.f13722z0;
        this.f11964k = du0Var == null ? 2 : du0Var.I0;
        ((p9.b) zzt.zzk()).getClass();
        this.f11959f = System.currentTimeMillis() / 1000;
        if (((Boolean) zzba.zzc().a(am.f12398w)).booleanValue()) {
            Bundle bundle = new Bundle();
            if (((Boolean) zzba.zzc().a(am.Q7)).booleanValue() && fu0Var != null) {
                bundle.putAll(fu0Var.f14555k);
            }
            if (((Boolean) zzba.zzc().a(am.R7)).booleanValue() && du0Var != null) {
                bundle.putAll(du0Var.F0);
            }
            this.f11962i = bundle;
        } else {
            if (!((Boolean) zzba.zzc().a(am.Q7)).booleanValue() || fu0Var == null) {
                this.f11962i = new Bundle();
            } else {
                this.f11962i = fu0Var.f14555k;
            }
            if (((Boolean) zzba.zzc().a(am.R7)).booleanValue() && du0Var != null) {
                Bundle bundle2 = du0Var.F0;
                Bundle bundle3 = this.f11962i;
                if (bundle3 != null) {
                    bundle3.putAll(bundle2);
                }
            }
        }
        if (((Boolean) zzba.zzc().a(am.Ma)).booleanValue() && fu0Var != null) {
            str3 = fu0Var.f14553i;
            str3 = TextUtils.isEmpty(str3) ? "" : str3;
        }
        this.f11960g = str3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() {
        return this.f11954a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() {
        return this.f11955b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() {
        return this.f11958e;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv zzh() {
        sm0 sm0Var = this.f11961h;
        if (sm0Var != null) {
            return sm0Var.f20005f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() {
        return this.f11962i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() {
        return this.f11956c;
    }
}
