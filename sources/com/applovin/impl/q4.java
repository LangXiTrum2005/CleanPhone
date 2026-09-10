package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f9096b;

    private q4(String str, Map map) {
        this.f9095a = str;
        this.f9096b = map;
    }

    public static q4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f9095a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f9095a + "'params='" + this.f9096b + "'}";
    }

    public static q4 a(String str, Map map) {
        return new q4(str, map);
    }

    public Map a() {
        return this.f9096b;
    }
}
