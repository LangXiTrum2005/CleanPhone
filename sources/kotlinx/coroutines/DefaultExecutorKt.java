package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DefaultExecutorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Delay f44750a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Delay delay;
        String strC = SystemPropsKt.c("kotlinx.coroutines.main.delay");
        if (strC != null ? Boolean.parseBoolean(strC) : false) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
            delay = (MainDispatchersKt.a(mainCoroutineDispatcher) || !(mainCoroutineDispatcher instanceof Delay)) ? DefaultExecutor.j0 : (Delay) mainCoroutineDispatcher;
        } else {
            delay = DefaultExecutor.j0;
        }
        f44750a = delay;
    }
}
