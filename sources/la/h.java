package la;

import com.google.android.gms.tasks.TaskCompletionSource;
import eb.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f45252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ka.d f45253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f45254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, ka.d dVar) {
        super(taskCompletionSource);
        this.f45252b = taskCompletionSource2;
        this.f45253c = dVar;
        this.f45254d = kVar;
    }

    @Override // la.f
    public final void a() {
        synchronized (this.f45254d.f45265f) {
            try {
                k kVar = this.f45254d;
                TaskCompletionSource taskCompletionSource = this.f45252b;
                kVar.f45264e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new d0((Object) kVar, false, (Object) taskCompletionSource, 28));
                if (this.f45254d.f45270k.getAndIncrement() > 0) {
                    this.f45254d.f45261b.a("Already connected to the service.", new Object[0]);
                }
                k.b(this.f45254d, this.f45253c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
