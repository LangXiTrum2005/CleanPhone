package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import java.util.Map;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.name.attabal;
import p002kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import yeast.competently;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NullabilityAnnotationStatesImpl<T> implements dovishness<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LockBasedStorageManager f30297dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<dern, T> f30298saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final competently<dern, T> f30299wireman;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(Map<dern, ? extends T> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f30298saneness = states;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.f30297dern = lockBasedStorageManager;
        competently<dern, T> competentlyVarCompetently = lockBasedStorageManager.competently(new Function1<dern, T>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$cache$1
            final /* synthetic */ NullabilityAnnotationStatesImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final T invoke(dern dernVar) {
                Intrinsics.beachfront(dernVar);
                return (T) attabal.attabal(dernVar, this.this$0.saneness());
            }
        });
        Intrinsics.checkNotNullExpressionValue(competentlyVarCompetently, "createMemoizedFunctionWithNullableValues(...)");
        this.f30299wireman = competentlyVarCompetently;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.dovishness
    public T attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return this.f30299wireman.invoke(fqName);
    }

    public final Map<dern, T> saneness() {
        return this.f30298saneness;
    }
}
