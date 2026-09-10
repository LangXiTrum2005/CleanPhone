package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f18764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzg f18767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d90 f18769g;

    public pq0(Context context, Bundle bundle, String str, String str2, zzj zzjVar, String str3, d90 d90Var) {
        this.f18763a = context;
        this.f18764b = bundle;
        this.f18765c = str;
        this.f18766d = str2;
        this.f18767e = zzjVar;
        this.f18768f = str3;
        this.f18769g = d90Var;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.f18764b);
        bundle.putString("seq_num", this.f18765c);
        zzg zzgVar = this.f18767e;
        if (!zzgVar.zzx()) {
            bundle.putString("session_id", this.f18766d);
        }
        bundle.putBoolean("client_purpose_one", !zzgVar.zzx());
        if (((Boolean) zzba.zzc().a(am.L6)).booleanValue()) {
            try {
                zzt.zzc();
                bundle.putString("_app_id", zzs.zzr(this.f18763a));
            } catch (RemoteException | RuntimeException e10) {
                zzt.zzh().d("AppStatsSignal_AppId", e10);
            }
        }
        String str = this.f18768f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            d90 d90Var = this.f18769g;
            Long l = (Long) d90Var.f13470d.get(str);
            bundle2.putLong("dload", l == null ? -1L : l.longValue());
            Integer num = (Integer) d90Var.f13468b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) zzba.zzc().a(am.f12332rb)).booleanValue() || zzt.zzh().l.get() <= 0) {
            return;
        }
        bundle.putInt("nrwv", zzt.zzh().l.get());
    }
}
