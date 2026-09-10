package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfw f18360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bs f18361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hp0 f18362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzm f18363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f18364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzr f18365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f18367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f18368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final eo f18369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzx f18370k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdManagerAdViewOptions f18371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PublisherAdViewOptions f18372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zzcl f18373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d5.o f18374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f18375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f18376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f18377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f18378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f18379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f18380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final JSONArray f18381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zzcp f18382x;

    public /* synthetic */ ou0(nu0 nu0Var) {
        this.f18365f = nu0Var.f17958b;
        this.f18366g = nu0Var.f17959c;
        this.f18382x = nu0Var.f17979x;
        zzm zzmVar = nu0Var.f17957a;
        this.f18364e = zzmVar.zzC;
        int i10 = zzmVar.zza;
        long j10 = zzmVar.zzb;
        Bundle bundle = zzmVar.zzc;
        int i11 = zzmVar.zzd;
        List list = zzmVar.zze;
        boolean z10 = zzmVar.zzf;
        int i12 = zzmVar.zzg;
        boolean z11 = true;
        if (!zzmVar.zzh && !nu0Var.f17961e) {
            z11 = false;
        }
        boolean z12 = z11;
        zzm zzmVar2 = nu0Var.f17957a;
        String str = zzmVar2.zzi;
        zzft zzftVar = zzmVar2.zzj;
        Location location = zzmVar2.zzk;
        String str2 = zzmVar2.zzl;
        Bundle bundle2 = zzmVar2.zzm;
        Bundle bundle3 = zzmVar2.zzn;
        List list2 = zzmVar2.zzo;
        String str3 = zzmVar2.zzp;
        String str4 = zzmVar2.zzq;
        boolean z13 = zzmVar2.zzr;
        zzc zzcVar = zzmVar2.zzs;
        int i13 = zzmVar2.zzt;
        String str5 = zzmVar2.zzu;
        List list3 = zzmVar2.zzv;
        int iZza = zzs.zza(zzmVar2.zzw);
        zzm zzmVar3 = nu0Var.f17957a;
        zzm zzmVar4 = new zzm(i10, j10, bundle, i11, list, z10, i12, z12, str, zzftVar, location, str2, bundle2, bundle3, list2, str3, str4, z13, zzcVar, i13, str5, list3, iZza, zzmVar3.zzx, zzmVar3.zzy, zzmVar3.zzz, zzmVar3.zzA, zzmVar3.zzB);
        this.f18363d = zzmVar4;
        zzfw zzfwVar = nu0Var.f17960d;
        eo eoVar = null;
        if (zzfwVar == null) {
            eo eoVar2 = nu0Var.f17964h;
            zzfwVar = eoVar2 != null ? eoVar2.f14035f : null;
        }
        this.f18360a = zzfwVar;
        ArrayList arrayList = nu0Var.f17962f;
        this.f18367h = arrayList;
        this.f18368i = nu0Var.f17963g;
        if (arrayList != null && (eoVar = nu0Var.f17964h) == null) {
            eoVar = new eo(new NativeAdOptions.Builder().build());
        }
        this.f18369j = eoVar;
        this.f18370k = nu0Var.f17965i;
        this.l = nu0Var.f17968m;
        this.f18371m = nu0Var.f17966j;
        this.f18372n = nu0Var.f17967k;
        this.f18373o = nu0Var.l;
        this.f18361b = nu0Var.f17969n;
        this.f18374p = new d5.o(nu0Var.f17970o);
        this.f18375q = nu0Var.f17971p;
        this.f18376r = nu0Var.f17972q;
        this.f18362c = nu0Var.f17973r;
        this.f18377s = nu0Var.f17974s;
        this.f18378t = nu0Var.f17975t;
        this.f18379u = zzmVar4.zzA != 0 ? new AtomicLong(zzmVar4.zzA) : nu0Var.f17976u;
        this.f18380v = nu0Var.f17977v;
        this.f18381w = nu0Var.f17978w;
    }
}
