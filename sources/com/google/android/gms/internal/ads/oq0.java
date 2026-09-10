package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y80 f18330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yu0 f18331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ou0 f18332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzj f18333h = zzt.zzh().g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wh0 f18334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d90 f18335j;

    public oq0(Context context, String str, String str2, y80 y80Var, yu0 yu0Var, ou0 ou0Var, wh0 wh0Var, d90 d90Var, long j10) {
        this.f18326a = context;
        this.f18327b = str;
        this.f18328c = str2;
        this.f18330e = y80Var;
        this.f18331f = yu0Var;
        this.f18332g = ou0Var;
        this.f18334i = wh0Var;
        this.f18335j = d90Var;
        this.f18329d = j10;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        Bundle bundle = new Bundle();
        wh0 wh0Var = this.f18334i;
        ConcurrentHashMap concurrentHashMap = wh0Var.f21514a;
        String str = this.f18327b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue()) {
            ((p9.b) zzt.zzk()).getClass();
            wh0Var.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f18329d));
            zzt.zzc();
            wh0Var.b(DownloadService.KEY_FOREGROUND, true != zzs.zzJ(this.f18326a) ? "1" : "0");
        }
        y80 y80Var = this.f18330e;
        ou0 ou0Var = this.f18332g;
        zzm zzmVar = ou0Var.f18363d;
        b00 b00Var = y80Var.f22193b;
        synchronized (b00Var.f12577d) {
            ((p9.b) b00Var.f12574a).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            b00Var.f12583j = jElapsedRealtime;
            h00 h00Var = b00Var.f12575b;
            synchronized (h00Var.f15012a) {
                h00Var.f15015d.a(zzmVar, jElapsedRealtime);
            }
        }
        bundle.putAll(this.f18331f.b());
        return zw1.d(new pq0(this.f18326a, bundle, str, this.f18328c, this.f18333h, ou0Var.f18366g, this.f18335j));
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 12;
    }
}
