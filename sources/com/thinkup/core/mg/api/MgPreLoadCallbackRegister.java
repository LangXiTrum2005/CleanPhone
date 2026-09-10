package com.thinkup.core.mg.api;

import com.thinkup.core.common.o0n.m;
import com.thinkup.core.common.o0n.o0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class MgPreLoadCallbackRegister {
    private static final String TAG = "MgPreLoadCallbackRegister";
    private volatile m timeoutRunnable;
    private final Object timeoutLock = new Object();
    private final Object callbackLock = new Object();
    private final List<MgPreLoadCallback> preLoadCallbackList = new CopyOnWriteArrayList();
    private final AtomicBoolean isCallback = new AtomicBoolean(false);
    private final AtomicReference<MgAdInfo> mgAdInfoRef = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCallback(boolean z2) {
        notifyCallback(z2, false);
    }

    public MgAdInfo getMgAdInfo() {
        return this.mgAdInfoRef.get();
    }

    public void notifyPreLoadCallback(MgAdInfo mgAdInfo) {
        this.mgAdInfoRef.set(mgAdInfo);
        synchronized (this.timeoutLock) {
            try {
                if (this.timeoutRunnable != null) {
                    o0.o().o(this.timeoutRunnable);
                    this.timeoutRunnable = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyCallback(false, true);
    }

    public void registerPreLoadCallback(MgPreLoadCallback mgPreLoadCallback) {
        this.mgAdInfoRef.get();
        if (mgPreLoadCallback == null) {
            return;
        }
        synchronized (this.callbackLock) {
            this.isCallback.set(false);
            this.preLoadCallbackList.add(mgPreLoadCallback);
        }
    }

    public void startTimeoutCountDown(long j) {
        synchronized (this.timeoutLock) {
            try {
                if (this.timeoutRunnable != null) {
                    o0.o().o(this.timeoutRunnable);
                }
                if (j <= 0) {
                    notifyCallback(false);
                } else if (!this.isCallback.get()) {
                    this.timeoutRunnable = new m() { // from class: com.thinkup.core.mg.api.MgPreLoadCallbackRegister.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MgPreLoadCallbackRegister.this.notifyCallback(true);
                        }
                    };
                    o0.o().o(this.timeoutRunnable, j, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void notifyCallback(final boolean z2, boolean z3) {
        CopyOnWriteArrayList<MgPreLoadCallback> copyOnWriteArrayList;
        if (this.preLoadCallbackList.isEmpty()) {
            return;
        }
        synchronized (this.callbackLock) {
            try {
                if (this.preLoadCallbackList.isEmpty() || this.isCallback.get()) {
                    copyOnWriteArrayList = null;
                } else {
                    this.isCallback.set(true);
                    copyOnWriteArrayList = new CopyOnWriteArrayList(this.preLoadCallbackList);
                    this.preLoadCallbackList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        final MgAdInfo mgAdInfo = this.mgAdInfoRef.get();
        try {
            for (final MgPreLoadCallback mgPreLoadCallback : copyOnWriteArrayList) {
                if (mgPreLoadCallback != null) {
                    if (z2 || z3) {
                        com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.mg.api.MgPreLoadCallbackRegister.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                mgPreLoadCallback.onMgAdInfo(mgAdInfo, z2);
                            }
                        });
                    } else {
                        mgPreLoadCallback.onMgAdInfo(mgAdInfo, false);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
