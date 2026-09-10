package androidx.room;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {638}, m = "collect")
final class ObservedTableVersions$collect$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ObservedTableVersions f8209Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservedTableVersions$collect$1(ObservedTableVersions observedTableVersions, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f8209Y = observedTableVersions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ObservedTableVersions$collect$1 observedTableVersions$collect$1;
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        ObservedTableVersions observedTableVersions = this.f8209Y;
        observedTableVersions.getClass();
        int i2 = this.Z;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.Z = i2 - Integer.MIN_VALUE;
            observedTableVersions$collect$1 = this;
        } else {
            observedTableVersions$collect$1 = new ObservedTableVersions$collect$1(observedTableVersions, this);
        }
        Object obj2 = observedTableVersions$collect$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = observedTableVersions$collect$1.Z;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            throw new KotlinNothingValueException();
        }
        ResultKt.b(obj2);
        MutableStateFlow mutableStateFlow = observedTableVersions.f8208a;
        observedTableVersions$collect$1.Z = 1;
        mutableStateFlow.collect(null, observedTableVersions$collect$1);
        return CoroutineSingletons.X;
    }
}
