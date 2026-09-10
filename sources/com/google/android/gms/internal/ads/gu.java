package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gu implements MediationAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f14966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f14968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Location f14970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14972g;

    public gu(Date date, int i10, HashSet hashSet, Location location, boolean z10, int i11, boolean z11) {
        this.f14966a = date;
        this.f14967b = i10;
        this.f14968c = hashSet;
        this.f14970e = location;
        this.f14969d = z10;
        this.f14971f = i11;
        this.f14972g = z11;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.f14966a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f14967b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.f14968c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f14970e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f14972g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f14969d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f14971f;
    }
}
