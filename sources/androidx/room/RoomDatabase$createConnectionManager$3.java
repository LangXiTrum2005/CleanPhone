package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class RoomDatabase$createConnectionManager$3 extends FunctionReferenceImpl implements Function2<Function1<? super Continuation<? super Object>, ? extends Object>, Continuation<? super Object>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Continuation continuation = (Continuation) obj2;
        return RoomDatabaseKt.a((RoomDatabase) this.receiver, continuation, (Function1) obj);
    }
}
