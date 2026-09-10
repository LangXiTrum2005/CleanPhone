package com.vungle.ads.internal.executor;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/executor/attabal;", "", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "getBackgroundExecutor", "()Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "backgroundExecutor", "getIoExecutor", "ioExecutor", "getJobExecutor", "jobExecutor", "getLoggerExecutor", "loggerExecutor", "getOffloadExecutor", "offloadExecutor", "getUaExecutor", "uaExecutor", "getDownloaderExecutor", "downloaderExecutor", "getApiExecutor", "apiExecutor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface attabal {
    VungleThreadPoolExecutor getApiExecutor();

    VungleThreadPoolExecutor getBackgroundExecutor();

    VungleThreadPoolExecutor getDownloaderExecutor();

    VungleThreadPoolExecutor getIoExecutor();

    VungleThreadPoolExecutor getJobExecutor();

    VungleThreadPoolExecutor getLoggerExecutor();

    VungleThreadPoolExecutor getOffloadExecutor();

    VungleThreadPoolExecutor getUaExecutor();
}
