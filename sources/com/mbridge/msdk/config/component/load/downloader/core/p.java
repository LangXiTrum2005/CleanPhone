package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface p {
    p a(int i10);

    p a(com.mbridge.msdk.config.component.load.downloader.f fVar);

    d build();

    p withHttpRetryCounter(int i10);

    p withTimeout(long j10);
}
