package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
final class DataStoreImpl$InitDataStore$doRun$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f4613Y;
    public final /* synthetic */ DataStoreImpl.InitDataStore Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$1(DataStoreImpl.InitDataStore initDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4613Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.a(this);
    }
}
