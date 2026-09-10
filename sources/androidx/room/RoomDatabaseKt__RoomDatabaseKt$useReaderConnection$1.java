package androidx.room;

import androidx.room.util.DBUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", l = {471, 471}, m = "useReaderConnection")
final class RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1<R> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f8235Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.X = obj;
        int i2 = (this.f8235Y | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f8235Y = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.f8235Y = 1;
            obj = DBUtil.a(null, false, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        CoroutineContext coroutineContextPlus = ((CoroutineContext) obj).plus(RoomExternalOperationElement.X);
        RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 roomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 = new RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2(null, null, null);
        this.f8235Y = 2;
        Object objF = BuildersKt.f(coroutineContextPlus, roomDatabaseKt__RoomDatabaseKt$useReaderConnection$2, this);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
