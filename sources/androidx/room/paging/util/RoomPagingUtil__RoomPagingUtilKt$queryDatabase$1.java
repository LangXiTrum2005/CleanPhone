package androidx.room.paging.util;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt", f = "RoomPagingUtil.kt", l = {130}, m = "queryDatabase")
final class RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1<Value> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f8318Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.f8318Y |= Integer.MIN_VALUE;
        return RoomPagingUtil.a(this);
    }
}
