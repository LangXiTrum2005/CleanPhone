package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/support/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryInterceptorStatement implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: androidx.room.support.QueryInterceptorStatement$execute$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.support.QueryInterceptorStatement$execute$1", f = "QueryInterceptorStatement.android.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ List f8328Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, Continuation continuation) {
            super(2, continuation);
            this.f8328Y = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QueryInterceptorStatement.this.new AnonymousClass1(this.f8328Y, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void B0(int i2) {
        a(i2, null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int E() {
        new QueryInterceptorStatement$executeUpdateDelete$1(this, CollectionsKt.i0(null), null);
        throw null;
    }

    public final void a(int i2, Object obj) {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long b0() {
        new QueryInterceptorStatement$executeInsert$1(this, CollectionsKt.i0(null), null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void c(int i2, double d) {
        a(i2, Double.valueOf(d));
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void d0(int i2, String value) {
        Intrinsics.f(value, "value");
        a(i2, value);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        new AnonymousClass1(CollectionsKt.i0(null), null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void k0(int i2, long j) {
        a(i2, Long.valueOf(j));
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void r0(int i2, byte[] bArr) {
        a(i2, bArr);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void w() {
        throw null;
    }
}
