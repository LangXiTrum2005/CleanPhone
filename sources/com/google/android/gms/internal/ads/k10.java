package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k10 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f16246r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f16249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final em f16250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gm f16251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzbf f16252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f16253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f16254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16257k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z00 f16259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16262q;

    static {
        f16246r = zzay.zzh().nextInt(100) < ((Integer) zzba.zzc().a(am.f12351se)).intValue();
    }

    public k10(Context context, VersionInfoParcel versionInfoParcel, String str, gm gmVar, em emVar) {
        zzbe zzbeVar = new zzbe();
        zzbeVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbeVar.zza("1_5", 1.0d, 5.0d);
        zzbeVar.zza("5_10", 5.0d, 10.0d);
        zzbeVar.zza("10_20", 10.0d, 20.0d);
        zzbeVar.zza("20_30", 20.0d, 30.0d);
        zzbeVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f16252f = zzbeVar.zzb();
        this.f16255i = false;
        this.f16256j = false;
        this.f16257k = false;
        this.l = false;
        this.f16262q = -1L;
        this.f16247a = context;
        this.f16249c = versionInfoParcel;
        this.f16248b = str;
        this.f16251e = gmVar;
        this.f16250d = emVar;
        String str2 = (String) zzba.zzc().a(am.t0);
        if (str2 == null) {
            this.f16254h = new String[0];
            this.f16253g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f16254h = new String[length];
        this.f16253g = new long[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                this.f16253g[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException e10) {
                int i11 = zze.zza;
                zzo.zzj("Unable to parse frame hash target time number.", e10);
                this.f16253g[i10] = -1;
            }
        }
    }

    public final void a(z00 z00Var) {
        em emVar = this.f16250d;
        gm gmVar = this.f16251e;
        pi1.j(gmVar, emVar, "vpc2");
        this.f16255i = true;
        gmVar.c("vpn", z00Var.h());
        this.f16259n = z00Var;
    }

    public final void b() {
        if (!f16246r || this.f16260o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f16248b);
        bundle.putString("player", this.f16259n.h());
        for (zzbd zzbdVar : this.f16252f.zzb()) {
            String str = zzbdVar.zza;
            String strValueOf = String.valueOf(str);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbdVar.zze));
            String strValueOf2 = String.valueOf(str);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbdVar.zzd));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f16253g;
            if (i10 >= jArr.length) {
                zzt.zzc().zzg(this.f16247a, this.f16249c.afmaVersion, "gmob-apps", bundle, true);
                this.f16260o = true;
                return;
            }
            String str2 = this.f16254h[i10];
            if (str2 != null) {
                Long lValueOf = Long.valueOf(jArr[i10]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundle.putString("fh_".concat(lValueOf.toString()), str2);
            }
            i10++;
        }
    }

    public final void c(z00 z00Var) {
        if (this.f16257k && !this.l) {
            if (zze.zzc() && !this.l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            pi1.j(this.f16251e, this.f16250d, "vff2");
            this.l = true;
        }
        ((p9.b) zzt.zzk()).getClass();
        long jNanoTime = System.nanoTime();
        if (this.f16258m && this.f16261p && this.f16262q != -1) {
            this.f16252f.zza(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f16262q));
        }
        this.f16261p = this.f16258m;
        this.f16262q = jNanoTime;
        long jLongValue = ((Long) zzba.zzc().a(am.f12369u0)).longValue();
        long jO = z00Var.o();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f16254h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jO - this.f16253g[i10])) {
                int i11 = 8;
                Bitmap bitmap = z00Var.getBitmap(8, 8);
                long j10 = 63;
                long j11 = 0;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }

    public final void d() {
        this.f16258m = true;
        if (!this.f16256j || this.f16257k) {
            return;
        }
        pi1.j(this.f16251e, this.f16250d, "vfp2");
        this.f16257k = true;
    }
}
