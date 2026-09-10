package a7;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g f3425b = new g(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g f3426c = new g(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g f3427d = new g(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3428a;

    public /* synthetic */ g(int i10) {
        this.f3428a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3428a) {
            case 0:
                p.f().post(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
