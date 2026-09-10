package com.google.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24850b;

    public h1(int i10, MessageLite messageLite) {
        this.f24849a = messageLite;
        this.f24850b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f24849a == h1Var.f24849a && this.f24850b == h1Var.f24850b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f24849a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f24850b;
    }
}
