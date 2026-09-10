package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.ironsource.X3;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i10, int i11) {
            super(d.f("Priority too low [priority=", i10, ", highest=", i11, X3.j.f27836e));
        }
    }

    public void add(int i10) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i10));
            this.highestPriority = Math.max(this.highestPriority, i10);
        }
    }

    public void proceed(int i10) throws InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i10) {
                try {
                    this.lock.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i10) {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.highestPriority == i10;
        }
        return z10;
    }

    public void proceedOrThrow(int i10) throws PriorityTooLowException {
        synchronized (this.lock) {
            try {
                if (this.highestPriority != i10) {
                    throw new PriorityTooLowException(i10, this.highestPriority);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void remove(int i10) {
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i10));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : this.queue.peek().intValue();
            this.lock.notifyAll();
        }
    }
}
