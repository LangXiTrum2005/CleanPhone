package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f32153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.b f32154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f32155c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.f f32156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Map<String, String> f32157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    HashMap<String, List<String>> f32158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f32159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f32160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f32161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f32162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f32163k;

    public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        this.f32154b = bVar;
    }

    public e a(long j10) {
        this.f32153a = j10;
        return this;
    }

    public e b(long j10) {
        this.f32159g = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d build() {
        return d.a(this);
    }

    public p c(long j10) {
        this.f32163k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p withTimeout(long j10) {
        this.f32161i = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p a(com.mbridge.msdk.config.component.load.downloader.f fVar) {
        this.f32156d = fVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e withHttpRetryCounter(int i10) {
        this.f32160h = i10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p a(int i10) {
        this.f32155c = i10;
        return this;
    }
}
