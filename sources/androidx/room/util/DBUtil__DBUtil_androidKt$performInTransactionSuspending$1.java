package androidx.room.util;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$1<R> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f8332Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.X = obj;
        int i2 = (this.f8332Y | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f8332Y = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            return obj;
        }
        if (i2 == 2) {
            ResultKt.b(obj);
            return obj;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(null, null, null);
        this.f8332Y = 4;
        Object objF = BuildersKt.f((CoroutineContext) obj, dBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, this);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
