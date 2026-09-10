package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: classes.dex */
public class StartWorkRunnable implements Runnable {
    public WorkManagerImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f8812Y;
    public WorkerParameters.RuntimeExtras Z;

    @Override // java.lang.Runnable
    public final void run() {
        this.X.f.g(this.f8812Y, this.Z);
    }
}
