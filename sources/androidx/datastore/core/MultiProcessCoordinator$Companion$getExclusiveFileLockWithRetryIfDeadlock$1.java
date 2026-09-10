package androidx.datastore.core;

import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock")
final class MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 extends ContinuationImpl {
    public FileOutputStream X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f4669Y;
    public /* synthetic */ Object Z;
    public int e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        return MultiProcessCoordinator.Companion.a(null, this);
    }
}
