package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: compiled from: LottieResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class starveling<V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Throwable f16192attabal;
    private final V value;

    public starveling(V v) {
        this.value = v;
        this.f16192attabal = null;
    }

    public Throwable attabal() {
        return this.f16192attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof starveling)) {
            return false;
        }
        starveling starvelingVar = (starveling) obj;
        if (saneness() != null && saneness().equals(starvelingVar.saneness())) {
            return true;
        }
        if (attabal() == null || starvelingVar.attabal() == null) {
            return false;
        }
        return attabal().toString().equals(attabal().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{saneness(), attabal()});
    }

    public V saneness() {
        return this.value;
    }

    public starveling(Throwable th) {
        this.f16192attabal = th;
        this.value = null;
    }
}
