package g6;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41556a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f41556a) {
            case 0:
                return new Thread(new a(0, runnable), "glide-active-resources");
            default:
                return new j0.j(runnable);
        }
    }
}
