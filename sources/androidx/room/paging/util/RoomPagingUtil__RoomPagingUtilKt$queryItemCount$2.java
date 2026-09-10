package androidx.room.paging.util;

import androidx.room.Transactor;
import androidx.room.d;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2", f = "RoomPagingUtil.kt", l = {160}, m = "invokeSuspend")
final class RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ String f8319Y;

    /* JADX INFO: renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2$1", f = "RoomPagingUtil.kt", l = {161}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<Transactor, Continuation<? super Integer>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f8320Y;
        public final /* synthetic */ String Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation continuation) {
            super(2, continuation);
            this.Z = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.Z, continuation);
            anonymousClass1.f8320Y = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            Transactor transactor = (Transactor) this.f8320Y;
            d dVar = new d(2);
            this.X = 1;
            Object objB = transactor.b(this.Z, dVar, this);
            return objB == coroutineSingletons ? coroutineSingletons : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2(String str, Continuation continuation) {
        super(2, continuation);
        this.f8319Y = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2(this.f8319Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2 roomPagingUtil__RoomPagingUtilKt$queryItemCount$2 = (RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        roomPagingUtil__RoomPagingUtilKt$queryItemCount$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        new AnonymousClass1(this.f8319Y, null);
        this.X = 1;
        throw null;
    }
}
