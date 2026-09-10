package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f14992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f14993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sv0 f14994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClientApi f14995e = new ClientApi();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vu0 f14996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p9.a f14997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qx0 f14998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final uo0 f14999i;

    public gy0(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, sv0 sv0Var, vu0 vu0Var, p9.a aVar, qx0 qx0Var, uo0 uo0Var) {
        this.f14991a = context;
        this.f14992b = versionInfoParcel;
        this.f14993c = scheduledExecutorService;
        this.f14994d = sv0Var;
        this.f14997g = aVar;
        this.f14996f = vu0Var;
        this.f14998h = qx0Var;
        this.f14999i = uo0Var;
    }

    public final ux0 a(zzfp zzfpVar, zzcb zzcbVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        Context context = this.f14991a;
        VersionInfoParcel versionInfoParcel = this.f14992b;
        if (iOrdinal == 1) {
            return new ux0(this.f14995e, context, versionInfoParcel.clientJarVersion, this.f14996f, zzfpVar, zzcbVar, this.f14993c, this.f14994d, b(), this.f14997g, 1);
        }
        if (iOrdinal == 2) {
            return new ux0(this.f14995e, context, versionInfoParcel.clientJarVersion, this.f14996f, zzfpVar, zzcbVar, this.f14993c, this.f14994d, b(), this.f14997g, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new ux0(this.f14995e, context, versionInfoParcel.clientJarVersion, this.f14996f, zzfpVar, zzcbVar, this.f14993c, this.f14994d, b(), this.f14997g, 0);
    }

    public final vx0 b() {
        return new vx0(((Long) zzba.zzc().a(am.J)).longValue(), ((Long) zzba.zzc().a(am.K)).longValue(), this.f14997g, this.f14999i);
    }
}
