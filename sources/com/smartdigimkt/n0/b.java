package com.smartdigimkt.n0;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.smartdigimkt.k0.c> f36911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InputStream f36912c;

    public b(int i2, List<com.smartdigimkt.k0.c> list) {
        this(i2, list, null);
    }

    public final InputStream a() {
        return this.f36912c;
    }

    public final List<com.smartdigimkt.k0.c> b() {
        return Collections.unmodifiableList(this.f36911b);
    }

    public final int c() {
        return this.f36910a;
    }

    public b(int i2, List<com.smartdigimkt.k0.c> list, InputStream inputStream) {
        this.f36910a = i2;
        this.f36911b = list;
        this.f36912c = inputStream;
    }
}
