package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SDKExecutors.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0014\u0010!\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0012¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/executor/wireman;", "Lcom/vungle/ads/internal/executor/attabal;", "<init>", "()V", "", "NUMBER_OF_CORES", "I", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "IO_EXECUTOR", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "BACKGROUND_EXECUTOR", "JOB_EXECUTOR", "LOGGER_EXECUTOR", "UA_EXECUTOR", "DOWNLOADER_EXECUTOR", "OFFLOAD_EXECUTOR", "API_EXECUTOR", "getBackgroundExecutor", "()Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "backgroundExecutor", "getIoExecutor", "ioExecutor", "getApiExecutor", "apiExecutor", "getJobExecutor", "jobExecutor", "getLoggerExecutor", "loggerExecutor", "getOffloadExecutor", "offloadExecutor", "getUaExecutor", "uaExecutor", "getDownloaderExecutor", "downloaderExecutor", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class wireman implements attabal {
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;
    private VungleThreadPoolExecutor API_EXECUTOR;
    private VungleThreadPoolExecutor BACKGROUND_EXECUTOR;
    private VungleThreadPoolExecutor DOWNLOADER_EXECUTOR;
    private VungleThreadPoolExecutor IO_EXECUTOR;
    private VungleThreadPoolExecutor JOB_EXECUTOR;
    private VungleThreadPoolExecutor LOGGER_EXECUTOR;
    private final int NUMBER_OF_CORES;
    private VungleThreadPoolExecutor OFFLOAD_EXECUTOR;
    private VungleThreadPoolExecutor UA_EXECUTOR;

    public wireman() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.NUMBER_OF_CORES = iAvailableProcessors;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.JOB_EXECUTOR = new VungleThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 5L, timeUnit, new LinkedBlockingQueue(), new dern("vng_jr"));
        this.IO_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new dern("vng_io"));
        this.API_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new dern("vng_api"));
        this.LOGGER_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new dern("vng_logger"));
        this.BACKGROUND_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new dern("vng_background"));
        this.UA_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new dern("vng_ua"));
        this.DOWNLOADER_EXECUTOR = new VungleThreadPoolExecutor(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new dern("vng_down"));
        this.OFFLOAD_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new dern("vng_ol"));
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getApiExecutor, reason: from getter */
    public VungleThreadPoolExecutor getAPI_EXECUTOR() {
        return this.API_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getBackgroundExecutor, reason: from getter */
    public VungleThreadPoolExecutor getBACKGROUND_EXECUTOR() {
        return this.BACKGROUND_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getDownloaderExecutor, reason: from getter */
    public VungleThreadPoolExecutor getDOWNLOADER_EXECUTOR() {
        return this.DOWNLOADER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getIoExecutor, reason: from getter */
    public VungleThreadPoolExecutor getIO_EXECUTOR() {
        return this.IO_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getJobExecutor, reason: from getter */
    public VungleThreadPoolExecutor getJOB_EXECUTOR() {
        return this.JOB_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getLoggerExecutor, reason: from getter */
    public VungleThreadPoolExecutor getLOGGER_EXECUTOR() {
        return this.LOGGER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getOffloadExecutor, reason: from getter */
    public VungleThreadPoolExecutor getOFFLOAD_EXECUTOR() {
        return this.OFFLOAD_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.attabal
    /* JADX INFO: renamed from: getUaExecutor, reason: from getter */
    public VungleThreadPoolExecutor getUA_EXECUTOR() {
        return this.UA_EXECUTOR;
    }
}
