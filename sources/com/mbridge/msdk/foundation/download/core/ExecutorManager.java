package com.mbridge.msdk.foundation.download.core;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ExecutorManager {
    private static ExecutorManager instance;
    private final ExecutorSupplier executorSupplier;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class ClassHolder {
        private static final ExecutorManager EXECUTOR_MANAGER = new ExecutorManager();

        private ClassHolder() {
        }
    }

    public static ExecutorManager getInstance() {
        return ClassHolder.EXECUTOR_MANAGER;
    }

    public static void shutDown() {
        if (instance != null) {
            instance = null;
        }
    }

    public ExecutorSupplier getExecutorSupplier() {
        return this.executorSupplier;
    }

    private ExecutorManager() {
        this.executorSupplier = new DefaultExecutorSupplier();
    }
}
