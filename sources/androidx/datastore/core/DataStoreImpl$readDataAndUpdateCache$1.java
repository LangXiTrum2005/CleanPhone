package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, com.smartdigimkt.b0.a.T0, 304}, m = "readDataAndUpdateCache")
final class DataStoreImpl$readDataAndUpdateCache$1 extends ContinuationImpl {
    public DataStoreImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public State f4630Y;
    public boolean Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ DataStoreImpl f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.f0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        return DataStoreImpl.e(this.f0, false, this);
    }
}
