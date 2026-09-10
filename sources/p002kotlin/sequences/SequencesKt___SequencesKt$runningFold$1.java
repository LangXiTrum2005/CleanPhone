package p002kotlin.sequences;

import igo.wireman;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/sequences/taiyuan;", "", "<anonymous>", "(Lkotlin/sequences/taiyuan;)V"}, k = 3, mv = {2, 2, 0})
@wireman(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2423, 2427}, m = "invokeSuspend", v = 2)
public final class SequencesKt___SequencesKt$runningFold$1<R> extends RestrictedSuspendLambda implements Function2<taiyuan<? super R>, dern<? super Unit>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ Function2<R, T, R> $operation;
    final /* synthetic */ Sequence<T> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFold$1(R r, Sequence<? extends T> sequence, Function2<? super R, ? super T, ? extends R> function2, dern<? super SequencesKt___SequencesKt$runningFold$1> dernVar) {
        super(2, dernVar);
        this.$initial = r;
        this.$this_runningFold = sequence;
        this.$operation = function2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, dernVar);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0041->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r0.wireman(r7, r6) == r1) goto L18;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlin.sequences.taiyuan r0 = (p002kotlin.sequences.taiyuan) r0
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r6.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L29
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r2 = r6.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r6.L$1
            p002kotlin.dern.saneness(r7)
            r7 = r4
            goto L41
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L25:
            p002kotlin.dern.saneness(r7)
            goto L39
        L29:
            p002kotlin.dern.saneness(r7)
            R r7 = r6.$initial
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r7 = r0.wireman(r7, r6)
            if (r7 != r1) goto L39
            goto L65
        L39:
            R r7 = r6.$initial
            kotlin.sequences.Sequence<T> r2 = r6.$this_runningFold
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r2.next()
            kotlin.jvm.functions.Function2<R, T, R> r5 = r6.$operation
            java.lang.Object r7 = r5.invoke(r7, r4)
            r6.L$0 = r0
            r6.L$1 = r7
            r6.L$2 = r2
            java.lang.Object r4 = igo.impromptu.attabal(r4)
            r6.L$3 = r4
            r6.label = r3
            java.lang.Object r4 = r0.wireman(r7, r6)
            if (r4 != r1) goto L41
        L65:
            return r1
        L66:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p002kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(taiyuan<? super R> taiyuanVar, dern<? super Unit> dernVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(taiyuanVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
