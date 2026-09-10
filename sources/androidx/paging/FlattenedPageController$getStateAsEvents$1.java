package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "getStateAsEvents")
final class FlattenedPageController$getStateAsEvents$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MutexImpl f7785Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ FlattenedPageController e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$getStateAsEvents$1(FlattenedPageController flattenedPageController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e0 = flattenedPageController;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlattenedPageController$getStateAsEvents$1 flattenedPageController$getStateAsEvents$1;
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        FlattenedPageController flattenedPageController = this.e0;
        flattenedPageController.getClass();
        if (this instanceof FlattenedPageController$getStateAsEvents$1) {
            int i2 = this.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                this.f0 = i2 - Integer.MIN_VALUE;
                flattenedPageController$getStateAsEvents$1 = this;
            } else {
                flattenedPageController$getStateAsEvents$1 = new FlattenedPageController$getStateAsEvents$1(flattenedPageController, this);
            }
        } else {
            flattenedPageController$getStateAsEvents$1 = new FlattenedPageController$getStateAsEvents$1(flattenedPageController, this);
        }
        Object obj2 = flattenedPageController$getStateAsEvents$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = flattenedPageController$getStateAsEvents$1.f0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            flattenedPageController$getStateAsEvents$1.X = flattenedPageController;
            flattenedPageController$getStateAsEvents$1.f7785Y = null;
            flattenedPageController$getStateAsEvents$1.f0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutexImpl mutexImpl = flattenedPageController$getStateAsEvents$1.f7785Y;
        FlattenedPageController flattenedPageController2 = (FlattenedPageController) flattenedPageController$getStateAsEvents$1.X;
        ResultKt.b(obj2);
        try {
            flattenedPageController2.getClass();
            throw null;
        } catch (Throwable th) {
            mutexImpl.b(null);
            throw th;
        }
    }
}
