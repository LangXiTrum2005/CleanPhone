package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher e0(int i2) {
        LimitedDispatcherKt.a(1);
        return this;
    }

    public abstract MainCoroutineDispatcher j0();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherJ0;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherJ0 = mainCoroutineDispatcher.j0();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherJ0 = null;
            }
            str = this == mainCoroutineDispatcherJ0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + DebugStringsKt.a(this);
    }
}
