package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f10810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f10811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f10815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f10816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f10817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10818k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10820n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f10821o;

    public zzeh(zzeg zzegVar) {
        this.f10821o = 0L;
        this.f10808a = zzegVar.f10800g;
        this.f10809b = zzegVar.f10801h;
        this.f10810c = Collections.unmodifiableSet(zzegVar.f10794a);
        this.f10811d = zzegVar.f10795b;
        Collections.unmodifiableMap(zzegVar.f10796c);
        this.f10812e = zzegVar.f10802i;
        this.f10813f = zzegVar.f10803j;
        this.f10814g = zzegVar.f10804k;
        this.f10815h = Collections.unmodifiableSet(zzegVar.f10797d);
        this.f10816i = zzegVar.f10798e;
        this.f10817j = Collections.unmodifiableSet(zzegVar.f10799f);
        this.f10818k = zzegVar.l;
        this.l = zzegVar.f10805m;
        this.f10819m = zzegVar.f10806n;
        this.f10821o = zzegVar.f10807o;
    }

    public final String zza() {
        return this.f10808a;
    }

    public final List zzb() {
        return new ArrayList(this.f10809b);
    }

    public final Set zzc() {
        return this.f10810c;
    }

    @Nullable
    public final Bundle zzd(Class cls) {
        return this.f10811d.getBundle(cls.getName());
    }

    @Nullable
    public final Bundle zze(Class cls) {
        Bundle bundle = this.f10811d.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String zzf() {
        return this.f10812e;
    }

    public final String zzg() {
        return this.f10813f;
    }

    public final boolean zzh(Context context) {
        RequestConfiguration requestConfigurationZzp = zzeu.zzb().zzp();
        zzay.zza();
        String strZzF = com.google.android.gms.ads.internal.util.client.zzf.zzF(context);
        return this.f10815h.contains(strZzF) || requestConfigurationZzp.getTestDeviceIds().contains(strZzF);
    }

    public final Bundle zzi() {
        return this.f10811d;
    }

    public final int zzj() {
        return this.f10814g;
    }

    public final Bundle zzk() {
        return this.f10816i;
    }

    public final Set zzl() {
        return this.f10817j;
    }

    @Deprecated
    public final boolean zzm() {
        return this.f10818k;
    }

    @Nullable
    public final String zzn() {
        return this.l;
    }

    public final int zzo() {
        return this.f10819m;
    }

    public final void zzp(long j10) {
        this.f10820n = j10;
    }

    public final long zzq() {
        return this.f10820n;
    }

    public final long zzr() {
        return this.f10821o;
    }
}
