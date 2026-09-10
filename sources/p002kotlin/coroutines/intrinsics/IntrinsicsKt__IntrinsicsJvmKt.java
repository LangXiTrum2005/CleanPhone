package p002kotlin.coroutines.intrinsics;

import com.google.android.gms.ads.RequestConfiguration;
import igo.beachfront;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;
import tetrahedral.triweekly;
import wretchedly.dern;

/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001ag\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0001*$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u0001¢\u0006\u0004\b\f\u0010\r\u001aW\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lwretchedly/dern;", "", "receiver", "completion", "wireman", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "marial", "(Ltetrahedral/triweekly;Ljava/lang/Object;Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "", "attabal", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lwretchedly/dern;)Lwretchedly/dern;", "dern", "(Lwretchedly/dern;)Lwretchedly/dern;", "saneness", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class IntrinsicsKt__IntrinsicsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> dern<Unit> attabal(final Function2<? super R, ? super dern<? super T>, ? extends Object> function2, final R r, dern<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        final dern<?> dernVarAttabal = beachfront.attabal(completion);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r, dernVarAttabal);
        }
        final CoroutineContext context = dernVarAttabal.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(dernVarAttabal, function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(dernVarAttabal);
                this.$this_createCoroutineUnintercepted$inlined = function2;
                this.$receiver$inlined = r;
                Intrinsics.competently(dernVarAttabal, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    p002kotlin.dern.saneness(result);
                    Intrinsics.competently(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((Function2) rotuma.beachfront(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                p002kotlin.dern.saneness(result);
                return result;
            }
        } : new ContinuationImpl(dernVarAttabal, context, function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(dernVarAttabal, context);
                this.$this_createCoroutineUnintercepted$inlined = function2;
                this.$receiver$inlined = r;
                Intrinsics.competently(dernVarAttabal, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    p002kotlin.dern.saneness(result);
                    Intrinsics.competently(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((Function2) rotuma.beachfront(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.label = 2;
                p002kotlin.dern.saneness(result);
                return result;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> dern<T> dern(dern<? super T> dernVar) {
        dern<T> dernVar2;
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        ContinuationImpl continuationImpl = dernVar instanceof ContinuationImpl ? (ContinuationImpl) dernVar : null;
        return (continuationImpl == null || (dernVar2 = (dern<T>) continuationImpl.intercepted()) == null) ? dernVar : dernVar2;
    }

    public static <R, P, T> Object marial(triweekly<? super R, ? super P, ? super dern<? super T>, ? extends Object> triweeklyVar, R r, P p, dern<? super T> completion) {
        Intrinsics.checkNotNullParameter(triweeklyVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((triweekly) rotuma.beachfront(triweeklyVar, 3)).invoke(r, p, saneness(beachfront.attabal(completion)));
    }

    public static final <T> dern<T> saneness(final dern<? super T> dernVar) {
        final CoroutineContext context = dernVar.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(dernVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(dernVar);
                Intrinsics.competently(dernVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                p002kotlin.dern.saneness(result);
                return result;
            }
        } : new ContinuationImpl(dernVar, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(dernVar, context);
                Intrinsics.competently(dernVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                p002kotlin.dern.saneness(result);
                return result;
            }
        };
    }

    public static <R, T> Object wireman(Function2<? super R, ? super dern<? super T>, ? extends Object> function2, R r, dern<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) rotuma.beachfront(function2, 2)).invoke(r, saneness(beachfront.attabal(completion)));
    }
}
