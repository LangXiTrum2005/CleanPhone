package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {478}, m = "presentNewList")
final class PagingDataPresenter$presentNewList$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f7851Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.f7851Y |= Integer.MIN_VALUE;
        throw null;
    }
}
