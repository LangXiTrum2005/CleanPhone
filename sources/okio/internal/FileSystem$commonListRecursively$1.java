package okio.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import okio.Path;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
final class FileSystem$commonListRecursively$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
    public ArrayDeque X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Iterator f45171Y;
    public int Z;
    public /* synthetic */ Object e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.Z;
        if (i2 == 0) {
            ResultKt.b(obj);
            new ArrayDeque();
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = this.f45171Y;
        ArrayDeque arrayDeque = this.X;
        SequenceScope sequenceScope = (SequenceScope) this.e0;
        ResultKt.b(obj);
        if (!it.hasNext()) {
            return Unit.f43263a;
        }
        this.e0 = sequenceScope;
        this.X = arrayDeque;
        this.f45171Y = it;
        this.Z = 1;
        throw null;
    }
}
