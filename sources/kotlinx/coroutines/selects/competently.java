package kotlinx.coroutines.selects;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012(\u0010\u000b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\n\u0012J\b\u0002\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R<\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R<\u0010\u000b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\\\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/selects/competently;", "Q", "Lkotlinx/coroutines/selects/beachfront;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/taiyuan;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Ltetrahedral/triweekly;Ltetrahedral/triweekly;Ltetrahedral/triweekly;)V", "attabal", "Ljava/lang/Object;", "wireman", "()Ljava/lang/Object;", "saneness", "Ltetrahedral/triweekly;", "()Ltetrahedral/triweekly;", "dern", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class competently<Q> implements beachfront<Q> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Object clauseObject;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final triweekly<Object, Object, Object, Object> processResFunc;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final triweekly<Object, taiyuan<?>, Object, Unit> regFunc;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final triweekly<taiyuan<?>, Object, Object, triweekly<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

    /* JADX WARN: Multi-variable type inference failed */
    public competently(Object obj, triweekly<Object, ? super taiyuan<?>, Object, Unit> triweeklyVar, triweekly<Object, Object, Object, ? extends Object> triweeklyVar2, triweekly<? super taiyuan<?>, Object, Object, ? extends triweekly<? super Throwable, Object, ? super CoroutineContext, Unit>> triweeklyVar3) {
        this.clauseObject = obj;
        this.regFunc = triweeklyVar;
        this.processResFunc = triweeklyVar2;
        this.onCancellationConstructor = triweeklyVar3;
    }

    @Override // kotlinx.coroutines.selects.impromptu
    public triweekly<Object, taiyuan<?>, Object, Unit> attabal() {
        return this.regFunc;
    }

    @Override // kotlinx.coroutines.selects.impromptu
    public triweekly<Object, Object, Object, Object> dern() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.impromptu
    public triweekly<taiyuan<?>, Object, Object, triweekly<Throwable, Object, CoroutineContext, Unit>> saneness() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.impromptu
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }
}
