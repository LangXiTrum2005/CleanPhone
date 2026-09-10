package androidx.collection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1696}, m = "invokeSuspend")
final class MutableValues$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    public long[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f3758Y;
    public int Z;
    public int e0;
    public int f0;
    public long g0;
    public int h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ MutableValues j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableValues$iterator$1$iterator$1(MutableValues mutableValues, Continuation continuation) {
        super(2, continuation);
        this.j0 = mutableValues;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableValues$iterator$1$iterator$1 mutableValues$iterator$1$iterator$1 = new MutableValues$iterator$1$iterator$1(this.j0, continuation);
        mutableValues$iterator$1$iterator$1.i0 = obj;
        return mutableValues$iterator$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableValues$iterator$1$iterator$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.h0;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = this.f0;
        int i4 = this.e0;
        long j = this.g0;
        int i5 = this.Z;
        int i6 = this.f3758Y;
        long[] jArr = this.X;
        SequenceScope sequenceScope = (SequenceScope) this.i0;
        ResultKt.b(obj);
        do {
            j >>= 8;
            i3++;
            while (i3 >= i4) {
                if (i4 == 8) {
                    do {
                        if (i5 != i6) {
                            i5++;
                            j = jArr[i5];
                        }
                    } while ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L);
                    i4 = 8 - ((~(i5 - i6)) >>> 31);
                    i3 = 0;
                }
                return Unit.f43263a;
            }
        } while ((255 & j) >= 128);
        Integer num = new Integer((i5 << 3) + i3);
        this.i0 = sequenceScope;
        this.X = jArr;
        this.f3758Y = i6;
        this.Z = i5;
        this.g0 = j;
        this.e0 = i4;
        this.f0 = i3;
        this.h0 = 1;
        sequenceScope.a(num, this);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.X;
        return coroutineSingletons;
    }
}
