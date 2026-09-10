package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4893w20 implements InterfaceC4615ss {
    public static final C4805v20 Companion = new C4805v20(null);
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 1;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;
    private C4689tj0 API_EXECUTOR;
    private C4689tj0 BACKGROUND_EXECUTOR;
    private C4689tj0 DOWNLOADER_EXECUTOR;
    private C4689tj0 IO_EXECUTOR;
    private C4689tj0 JOB_EXECUTOR;
    private C4689tj0 LOGGER_EXECUTOR;
    private final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    private C4689tj0 OFFLOAD_EXECUTOR;
    private C4689tj0 UA_EXECUTOR;

    public C4893w20() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.JOB_EXECUTOR = new C4689tj0(1, 1, 1L, timeUnit, new LinkedBlockingQueue(), new AQ("vng_jr"));
        this.IO_EXECUTOR = new C4689tj0(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new AQ("vng_io"));
        this.API_EXECUTOR = new C4689tj0(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new AQ("vng_api"));
        this.LOGGER_EXECUTOR = new C4689tj0(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new AQ("vng_logger"));
        this.BACKGROUND_EXECUTOR = new C4689tj0(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new AQ("vng_background"));
        this.UA_EXECUTOR = new C4689tj0(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new AQ("vng_ua"));
        this.DOWNLOADER_EXECUTOR = new C4689tj0(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new AQ("vng_down"));
        this.OFFLOAD_EXECUTOR = new C4689tj0(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new AQ("vng_ol"));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getApiExecutor() {
        return this.API_EXECUTOR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getBackgroundExecutor() {
        return this.BACKGROUND_EXECUTOR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getDownloaderExecutor() {
        return this.DOWNLOADER_EXECUTOR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getIoExecutor() {
        return this.IO_EXECUTOR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getJobExecutor() {
        return this.JOB_EXECUTOR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getLoggerExecutor() {
        return this.LOGGER_EXECUTOR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getOffloadExecutor() {
        return this.OFFLOAD_EXECUTOR;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4615ss
    public C4689tj0 getUaExecutor() {
        return this.UA_EXECUTOR;
    }
}
