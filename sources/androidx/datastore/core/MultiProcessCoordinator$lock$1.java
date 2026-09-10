package androidx.datastore.core;

import com.smartdigimkt.sdk.basead.ui.BaseATView;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {BaseATView.g.f38289J, 47, 48}, m = "lock")
final class MultiProcessCoordinator$lock$1<T> extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f4670Y;
    public Object Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ MultiProcessCoordinator f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lock$1(MultiProcessCoordinator multiProcessCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        return this.f0.d(null, this);
    }
}
