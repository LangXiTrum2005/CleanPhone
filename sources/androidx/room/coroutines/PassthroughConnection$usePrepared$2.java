package androidx.room.coroutines;

import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
final class PassthroughConnection$usePrepared$2 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
    public final /* synthetic */ PassthroughConnection X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ String f8292Y;
    public final /* synthetic */ Function1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$usePrepared$2(PassthroughConnection passthroughConnection, String str, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.X = passthroughConnection;
        this.f8292Y = str;
        this.Z = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PassthroughConnection$usePrepared$2(this.X, this.f8292Y, this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PassthroughConnection$usePrepared$2) create((Continuation) obj)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        SQLiteStatement sQLiteStatementR0 = this.X.f8287b.R0(this.f8292Y);
        try {
            Object objInvoke = this.Z.invoke(sQLiteStatementR0);
            AutoCloseableKt.a(sQLiteStatementR0, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.a(sQLiteStatementR0, th);
                throw th2;
            }
        }
    }
}
