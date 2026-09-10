package androidx.datastore.core;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
final class MultiProcessCoordinator$tryLock$1<T> extends ContinuationImpl {
    public MutexImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public FileInputStream f4671Y;
    public FileLock Z;
    public boolean e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ MultiProcessCoordinator g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$tryLock$1(MultiProcessCoordinator multiProcessCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        return this.g0.a(null, this);
    }
}
