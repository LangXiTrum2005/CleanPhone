package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainDispatcherLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MainCoroutineDispatcher f45042a;

    static {
        Object obj;
        String strC = SystemPropsKt.c("kotlinx.coroutines.fast.service.loader");
        if (strC != null) {
            Boolean.parseBoolean(strC);
        }
        Iterator it = SequencesKt.v(SequencesKt.b(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator())).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iB = ((MainDispatcherFactory) next).b();
                do {
                    Object next2 = it.next();
                    int iB2 = ((MainDispatcherFactory) next2).b();
                    if (iB < iB2) {
                        next = next2;
                        iB = iB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        f45042a = mainDispatcherFactory.a();
    }
}
