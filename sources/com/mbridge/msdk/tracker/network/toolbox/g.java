package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f37000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f37002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f37003e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f37002d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f37003e != null) {
            return new ByteArrayInputStream(this.f37003e);
        }
        return null;
    }

    public final int b() {
        return this.f37001c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f37000b);
    }

    public final int d() {
        return this.f36999a;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f36999a = i10;
        this.f37000b = list;
        this.f37001c = i11;
        this.f37002d = inputStream;
        this.f37003e = null;
    }
}
