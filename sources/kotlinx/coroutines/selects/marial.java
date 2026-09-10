package kotlinx.coroutines.selects;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012J\b\u0002\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R<\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\\\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R<\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/selects/marial;", "Lkotlinx/coroutines/selects/wireman;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/taiyuan;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Ltetrahedral/triweekly;Ltetrahedral/triweekly;)V", "attabal", "Ljava/lang/Object;", "wireman", "()Ljava/lang/Object;", "saneness", "Ltetrahedral/triweekly;", "()Ltetrahedral/triweekly;", "dern", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class marial implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Object clauseObject;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final triweekly<taiyuan<?>, Object, Object, triweekly<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final triweekly<Object, taiyuan<?>, Object, Unit> regFunc;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final triweekly<Object, Object, Object, Object> processResFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public marial(Object obj, triweekly<Object, ? super taiyuan<?>, Object, Unit> triweeklyVar, triweekly<? super taiyuan<?>, Object, Object, ? extends triweekly<? super Throwable, Object, ? super CoroutineContext, Unit>> triweeklyVar2) {
        this.clauseObject = obj;
        this.regFunc = triweeklyVar;
        this.onCancellationConstructor = triweeklyVar2;
        this.processResFunc = cutely.f32435attabal;
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

    public /* synthetic */ marial(Object obj, triweekly triweeklyVar, triweekly triweeklyVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, triweeklyVar, (i & 4) != 0 ? null : triweeklyVar2);
    }
}
