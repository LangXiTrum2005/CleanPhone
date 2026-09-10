package kotlinx.coroutines;

import androidx.room.d;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key extends AbstractCoroutineContextKey<CoroutineDispatcher, ExecutorCoroutineDispatcher> {
    }

    static {
        new Key(CoroutineDispatcher.X, new d(19));
    }

    public abstract Executor j0();
}
