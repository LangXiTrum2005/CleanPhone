package p002kotlin.coroutines.jvm.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.formularize;
import p002kotlin.jvm.internal.polloi;
import wretchedly.dern;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/formularize;", "", "", "arity", "Lwretchedly/dern;", "completion", "<init>", "(ILwretchedly/dern;)V", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements formularize<Object> {
    private final int arity;

    public RestrictedSuspendLambda(int i, dern<Object> dernVar) {
        super(dernVar);
        this.arity = i;
    }

    @Override // p002kotlin.jvm.internal.formularize
    public int getArity() {
        return this.arity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strFormularize = polloi.formularize(this);
        Intrinsics.checkNotNullExpressionValue(strFormularize, "renderLambdaToString(...)");
        return strFormularize;
    }

    public RestrictedSuspendLambda(int i) {
        this(i, null);
    }
}
