package ads_mobile_sdk;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class km2 extends lk2 {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ lk2 c;
    public final /* synthetic */ qm2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km2(qm2 qm2Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, i62 i62Var) {
        super(taskCompletionSource);
        this.d = qm2Var;
        this.b = taskCompletionSource2;
        this.c = i62Var;
    }

    @Override // ads_mobile_sdk.lk2
    public final void a() {
        synchronized (this.d.f) {
            try {
                TaskCompletionSource taskCompletionSource = this.b;
                if (taskCompletionSource != null) {
                    this.d.a(taskCompletionSource);
                }
                if (this.d.l.getAndIncrement() > 0) {
                    this.d.b.a("Already connected to the service.", new Object[0]);
                }
                this.d.a(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
