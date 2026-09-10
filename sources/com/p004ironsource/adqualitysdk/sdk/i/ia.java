package com.p004ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ia<T> {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hz f2351;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2352;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hu f2353 = new hu();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<Object> f2350 = new HashSet();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Set<T> f2354 = new HashSet();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Set<ht> f2349 = new HashSet();

    public ia(hz hzVar) {
        this.f2351 = hzVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Set<T> m2380() {
        return this.f2354;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Set<ht> m2381() {
        return this.f2349;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hz m2382() {
        return this.f2351;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ia m2384() {
        this.f2352 = true;
        return this;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Set<Object> m2385() {
        return this.f2350;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final hu m2387() {
        return this.f2353;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2388() {
        return this.f2352;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2383(ht htVar) {
        this.f2349.add(htVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2386(T t) {
        this.f2354.add(t);
    }
}
