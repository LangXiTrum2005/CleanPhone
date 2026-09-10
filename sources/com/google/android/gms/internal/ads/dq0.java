package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzr f13623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f13632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f0.b f13633k;
    public final bq0 l;

    public dq0(zzr zzrVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, int i12, boolean z11, f0.b bVar, bq0 bq0Var) {
        k9.c0.i(zzrVar, "the adSize must not be null");
        this.f13623a = zzrVar;
        this.f13624b = str;
        this.f13625c = z10;
        this.f13626d = str2;
        this.f13627e = f10;
        this.f13628f = i10;
        this.f13629g = i11;
        this.f13630h = str3;
        this.f13631i = i12;
        this.f13632j = z11;
        this.f13633k = bVar;
        this.l = bq0Var;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzr zzrVar = this.f13623a;
        int i10 = zzrVar.zze;
        rb0.r(bundle, "smart_w", "full", i10 == -1);
        int i11 = zzrVar.zzb;
        rb0.r(bundle, "smart_h", "auto", i11 == -2);
        rb0.A(bundle, "ene", true, zzrVar.zzj);
        rb0.r(bundle, "rafmt", "102", zzrVar.zzm);
        rb0.r(bundle, "rafmt", "108", zzrVar.zzp);
        rb0.r(bundle, "rafmt", "103", zzrVar.zzn);
        rb0.r(bundle, "rafmt", "105", zzrVar.zzo);
        rb0.A(bundle, "inline_adaptive_slot", true, this.f13632j);
        rb0.A(bundle, "interscroller_slot", true, zzrVar.zzo);
        rb0.F("format", bundle, this.f13624b);
        rb0.r(bundle, "fluid", "height", this.f13625c);
        String str = this.f13626d;
        rb0.r(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f13627e);
        bundle.putInt("sw", this.f13628f);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.f13629g);
        String str2 = this.f13630h;
        rb0.r(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        int i12 = this.f13631i;
        if (i12 != -1) {
            bundle.putInt("u_mso", i12);
        }
        f0.b bVar = this.f13633k;
        if (bVar != null) {
            bundle.putInt("sam_t", bVar.f40259b);
            bundle.putInt("sam_b", bVar.f40261d);
            bundle.putInt("sam_l", bVar.f40258a);
            bundle.putInt("sam_r", bVar.f40260c);
        }
        bq0 bq0Var = this.l;
        if (bq0Var != null) {
            bundle.putInt("rc_tl", bq0Var.f12845a);
            bundle.putInt("rc_tr", bq0Var.f12846b);
            bundle.putInt("rc_bl", bq0Var.f12847c);
            bundle.putInt("rc_br", bq0Var.f12848d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i11);
            bundle2.putInt("width", i10);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
