package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public class MutableLiveData<T> extends LiveData<T> {
    public final void k(Object obj) {
        boolean z2;
        synchronized (this.f5245a) {
            z2 = this.f == LiveData.k;
            this.f = obj;
        }
        if (z2) {
            ArchTaskExecutor.a().b(this.j);
        }
    }
}
