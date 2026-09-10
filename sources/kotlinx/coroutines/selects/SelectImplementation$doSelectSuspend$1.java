package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    public SelectImplementation X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f45093Y;
    public final /* synthetic */ SelectImplementation Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(SelectImplementation selectImplementation, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f45093Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SelectImplementation.g0;
        return this.Z.h(this);
    }
}
