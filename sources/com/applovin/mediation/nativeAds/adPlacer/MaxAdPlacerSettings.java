package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.p;
import d5.u;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f10403c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10404d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10405e = NotificationCompat.FLAG_LOCAL_ONLY;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10406f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f10401a = str;
    }

    public void addFixedPosition(int i10) {
        this.f10403c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f10401a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f10403c;
    }

    public int getMaxAdCount() {
        return this.f10405e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f10406f;
    }

    @Nullable
    public String getPlacement() {
        return this.f10402b;
    }

    public int getRepeatingInterval() {
        return this.f10404d;
    }

    public boolean hasValidPositioning() {
        return !this.f10403c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f10404d >= 2;
    }

    public void resetFixedPositions() {
        this.f10403c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f10405e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f10406f = i10;
    }

    public void setPlacement(@Nullable String str) {
        this.f10402b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f10404d = i10;
            p.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f10404d = 0;
        p.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb2.append(this.f10401a);
        sb2.append("', fixedPositions=");
        sb2.append(this.f10403c);
        sb2.append(", repeatingInterval=");
        sb2.append(this.f10404d);
        sb2.append(", maxAdCount=");
        sb2.append(this.f10405e);
        sb2.append(", maxPreloadedAdCount=");
        return u.g(sb2, this.f10406f, '}');
    }
}
