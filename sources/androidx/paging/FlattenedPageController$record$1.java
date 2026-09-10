package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "record")
final class FlattenedPageController$record$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public IndexedValue f7786Y;
    public MutexImpl Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ FlattenedPageController f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$record$1(FlattenedPageController flattenedPageController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f0 = flattenedPageController;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlattenedPageController$record$1 flattenedPageController$record$1;
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        FlattenedPageController flattenedPageController = this.f0;
        flattenedPageController.getClass();
        if (this instanceof FlattenedPageController$record$1) {
            int i2 = this.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                this.g0 = i2 - Integer.MIN_VALUE;
                flattenedPageController$record$1 = this;
            } else {
                flattenedPageController$record$1 = new FlattenedPageController$record$1(flattenedPageController, this);
            }
        } else {
            flattenedPageController$record$1 = new FlattenedPageController$record$1(flattenedPageController, this);
        }
        Object obj2 = flattenedPageController$record$1.e0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flattenedPageController$record$1.g0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            flattenedPageController$record$1.X = flattenedPageController;
            flattenedPageController$record$1.f7786Y = null;
            flattenedPageController$record$1.Z = null;
            flattenedPageController$record$1.g0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutexImpl mutexImpl = flattenedPageController$record$1.Z;
        IndexedValue indexedValue = flattenedPageController$record$1.f7786Y;
        FlattenedPageController flattenedPageController2 = (FlattenedPageController) flattenedPageController$record$1.X;
        ResultKt.b(obj2);
        try {
            flattenedPageController2.f7784a = indexedValue.f43274a;
            throw null;
        } catch (Throwable th) {
            mutexImpl.b(null);
            throw th;
        }
    }
}
