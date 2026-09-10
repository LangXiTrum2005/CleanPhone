package com.charging.screenshow.battery.animations.themes.utils.async;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class TaskQueue extends Thread {
    public LinkedBlockingQueue X;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Object objTake = this.X.take();
                if (!(objTake instanceof Runnable)) {
                    return;
                } else {
                    ((Runnable) objTake).run();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
