package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: DispatchGroup.java */
/* JADX INFO: loaded from: classes4.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f23675attabal = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Runnable f23676saneness;

    public synchronized void attabal() {
        this.f23675attabal++;
    }

    public final void dern() {
        Runnable runnable;
        if (this.f23675attabal > 0 || (runnable = this.f23676saneness) == null) {
            return;
        }
        runnable.run();
    }

    public void saneness(Runnable runnable) {
        this.f23676saneness = runnable;
        dern();
    }
}
