package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2423, 2427}, m = "invokeSuspend")
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Iterator f44672Y;
    public int Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ Pair f0;
    public final /* synthetic */ SequencesKt___SequencesKt$sortedWith$1 g0;
    public final /* synthetic */ Function2 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(Pair pair, SequencesKt___SequencesKt$sortedWith$1 sequencesKt___SequencesKt$sortedWith$1, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f0 = pair;
        this.g0 = sequencesKt___SequencesKt$sortedWith$1;
        this.h0 = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.f0, this.g0, this.h0, continuation);
        sequencesKt___SequencesKt$runningFold$1.e0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SequencesKt___SequencesKt$runningFold$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.Z;
        Object obj2 = this.f0;
        if (i2 == 0) {
            ResultKt.b(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.e0;
            this.e0 = sequenceScope2;
            this.Z = 1;
            sequenceScope2.a(obj2, this);
            return coroutineSingletons;
        }
        if (i2 == 1) {
            sequenceScope = (SequenceScope) this.e0;
            ResultKt.b(obj);
            it = this.g0.getF44671a();
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f44672Y;
            obj2 = this.X;
            sequenceScope = (SequenceScope) this.e0;
            ResultKt.b(obj);
        }
        if (!it.hasNext()) {
            return Unit.f43263a;
        }
        Object objInvoke = this.h0.invoke(obj2, it.next());
        this.e0 = sequenceScope;
        this.X = objInvoke;
        this.f44672Y = it;
        this.Z = 2;
        sequenceScope.a(objInvoke, this);
        return coroutineSingletons;
    }
}
