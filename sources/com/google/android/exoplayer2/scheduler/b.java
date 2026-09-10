package com.google.android.exoplayer2.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f18314Y;

    public /* synthetic */ b(RequirementsWatcher.NetworkCallback networkCallback, int i2) {
        this.X = i2;
        this.f18314Y = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                RequirementsWatcher requirementsWatcher = this.f18314Y.f18313c;
                if (requirementsWatcher.g != null) {
                    requirementsWatcher.a();
                }
                break;
            default:
                RequirementsWatcher requirementsWatcher2 = this.f18314Y.f18313c;
                if (requirementsWatcher2.g != null && (requirementsWatcher2.f & 3) != 0) {
                    requirementsWatcher2.a();
                    break;
                }
                break;
        }
    }
}
