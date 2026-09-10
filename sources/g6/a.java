package g6;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f41555b;

    public /* synthetic */ a(int i10, Runnable runnable) {
        this.f41554a = i10;
        this.f41555b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41554a) {
            case 0:
                Process.setThreadPriority(10);
                this.f41555b.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f41555b.run();
                break;
            case 2:
                try {
                    this.f41555b.run();
                } catch (Exception e10) {
                    no.b.t("Executor", "Background execution failure.", e10);
                    return;
                }
                break;
            case 3:
                this.f41555b.run();
                break;
            default:
                this.f41555b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f41554a) {
            case 3:
                return this.f41555b.toString();
            case 4:
                return this.f41555b.toString();
            default:
                return super.toString();
        }
    }
}
