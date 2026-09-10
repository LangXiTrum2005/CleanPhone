package ac;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.Hf;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Continuation, Hf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f3456a;

    public /* synthetic */ c(Runnable runnable) {
        this.f3456a = runnable;
    }

    @Override // com.ironsource.Hf.a
    public void cancel() {
        IronSourceThreadManager.d.a(this.f3456a);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        this.f3456a.run();
        return Tasks.forResult(null);
    }
}
