package com.unity3d.services.core.timer;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface IBaseTimer {
    void kill();

    boolean pause();

    boolean resume();

    void start(ScheduledExecutorService scheduledExecutorService);

    void stop();
}
