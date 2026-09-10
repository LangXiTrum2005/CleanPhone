package com.kochava.core.network.base.internal;

import com.kochava.core.json.internal.JsonObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NetworkBaseResponse implements NetworkBaseResponseApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28046c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JsonObject f28047e;

    public NetworkBaseResponse(boolean z2, boolean z3, long j, long j2, JsonObject jsonObject) {
        this.f28045b = z2;
        this.f28046c = z3;
        this.d = j;
        this.f28044a = j2;
        this.f28047e = jsonObject;
    }

    @Override // com.kochava.core.network.base.internal.NetworkBaseResponseApi
    public final long a() {
        return this.d;
    }

    @Override // com.kochava.core.network.base.internal.NetworkBaseResponseApi
    public final long i() {
        return this.f28044a;
    }

    @Override // com.kochava.core.network.base.internal.NetworkBaseResponseApi
    public final boolean isSuccess() {
        return this.f28045b;
    }
}
