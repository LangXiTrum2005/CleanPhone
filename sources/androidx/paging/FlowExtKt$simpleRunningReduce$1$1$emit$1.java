package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", l = {73, 76}, m = "emit")
final class FlowExtKt$simpleRunningReduce$1$1$emit$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Ref.ObjectRef f7799Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ FlowExtKt$simpleRunningReduce$1.AnonymousClass1 e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleRunningReduce$1$1$emit$1(FlowExtKt$simpleRunningReduce$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.e0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        return this.e0.emit(null, this);
    }
}
