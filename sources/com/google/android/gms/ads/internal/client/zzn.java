package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f10884a = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f10885b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10886c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10887d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f10888e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f10889f = new Bundle();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f10890g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10891h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f10892i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f10893j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10894k = 60000;
    public final int l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10895m = 0;

    public final zzm zza() {
        return new zzm(8, -1L, this.f10884a, -1, this.f10885b, this.f10886c, this.f10887d, false, null, null, null, null, this.f10888e, this.f10889f, this.f10890g, null, null, false, null, this.f10891h, this.f10892i, this.f10893j, this.f10894k, null, this.l, this.f10895m, 0L, -1);
    }

    public final zzn zzb(Bundle bundle) {
        this.f10884a = bundle;
        return this;
    }

    public final zzn zzc(List list) {
        this.f10885b = list;
        return this;
    }

    public final zzn zzd(boolean z10) {
        this.f10886c = z10;
        return this;
    }

    public final zzn zze(int i10) {
        this.f10887d = i10;
        return this;
    }

    public final zzn zzf(int i10) {
        this.f10891h = i10;
        return this;
    }

    public final zzn zzg(String str) {
        this.f10892i = str;
        return this;
    }

    public final zzn zzh(int i10) {
        this.f10894k = i10;
        return this;
    }

    public final zzn zzi(long j10) {
        this.f10895m = j10;
        return this;
    }
}
