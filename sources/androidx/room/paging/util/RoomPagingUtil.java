package androidx.room.paging.util;

import androidx.paging.PagingSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt", "androidx/room/paging/util/RoomPagingUtil__RoomPagingUtil_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class RoomPagingUtil {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ContinuationImpl continuationImpl) {
        RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 roomPagingUtil__RoomPagingUtilKt$queryDatabase$1;
        if (continuationImpl instanceof RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1) {
            roomPagingUtil__RoomPagingUtilKt$queryDatabase$1 = (RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1) continuationImpl;
            int i2 = roomPagingUtil__RoomPagingUtilKt$queryDatabase$1.f8318Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roomPagingUtil__RoomPagingUtilKt$queryDatabase$1.f8318Y = i2 - Integer.MIN_VALUE;
            } else {
                roomPagingUtil__RoomPagingUtilKt$queryDatabase$1 = new RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1(continuationImpl);
            }
        } else {
            roomPagingUtil__RoomPagingUtilKt$queryDatabase$1 = new RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1(continuationImpl);
        }
        Object obj = roomPagingUtil__RoomPagingUtilKt$queryDatabase$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = roomPagingUtil__RoomPagingUtilKt$queryDatabase$1.f8318Y;
        if (i3 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) obj;
        int size = list.size() + 0;
        return new PagingSource.LoadResult.Page(list, null, (list.isEmpty() || list.size() < 0 || size >= 0) ? null : new Integer(size), 0, Math.max(0, 0 - size));
    }
}
