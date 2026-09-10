package androidx.room.paging;

import androidx.room.RoomRawQuery;
import androidx.room.b;
import androidx.room.util.DBUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class LimitOffsetPagingSource$implementation$1 extends FunctionReferenceImpl implements Function3<RoomRawQuery, Integer, Continuation<? super List<Object>>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        LimitOffsetPagingSource limitOffsetPagingSource = (LimitOffsetPagingSource) this.receiver;
        limitOffsetPagingSource.getClass();
        return DBUtil.b(true, new b((RoomRawQuery) obj, limitOffsetPagingSource, iIntValue), (Continuation) obj3);
    }
}
