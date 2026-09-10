package com.mbridge.msdk.playercommon.exoplayer2.util;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized boolean close() {
        boolean z10;
        z10 = this.isOpen;
        this.isOpen = false;
        return z10;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public synchronized boolean block(long j10) throws InterruptedException {
        boolean z10;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j11 = j10 + jElapsedRealtime;
        while (true) {
            z10 = this.isOpen;
            if (z10 || jElapsedRealtime >= j11) {
                break;
            }
            wait(j11 - jElapsedRealtime);
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z10;
    }
}
