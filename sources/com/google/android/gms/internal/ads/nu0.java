package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzm f17957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzr f17958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzfw f17960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f17962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f17963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public eo f17964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zzx f17965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AdManagerAdViewOptions f17966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PublisherAdViewOptions f17967k;
    public zzcl l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17968m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bs f17969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d5.o f17970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public hp0 f17973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f17975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f17976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JSONArray f17978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public zzcp f17979x;

    public nu0() {
        d5.o oVar = new d5.o(4, false);
        oVar.f38703b = 2;
        this.f17970o = oVar;
        this.f17971p = false;
        this.f17972q = false;
        this.f17974s = false;
        this.f17976u = new AtomicLong();
        this.f17977v = false;
    }

    public final ou0 a() {
        k9.c0.i(this.f17959c, "ad unit must not be null");
        k9.c0.i(this.f17958b, "ad size must not be null");
        k9.c0.i(this.f17957a, "ad request must not be null");
        return new ou0(this);
    }
}
