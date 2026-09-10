package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {564}, m = "onStaticList")
final class SeparatorState$onStaticList$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SeparatorState f7869Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onStaticList$1(SeparatorState separatorState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7869Y = separatorState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SeparatorState$onStaticList$1 separatorState$onStaticList$1;
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        SeparatorState separatorState = this.f7869Y;
        Object obj2 = null;
        separatorState.getClass();
        if (this instanceof SeparatorState$onStaticList$1) {
            int i2 = this.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                this.Z = i2 - Integer.MIN_VALUE;
                separatorState$onStaticList$1 = this;
            } else {
                separatorState$onStaticList$1 = new SeparatorState$onStaticList$1(separatorState, this);
            }
        } else {
            separatorState$onStaticList$1 = new SeparatorState$onStaticList$1(separatorState, this);
        }
        Object obj3 = separatorState$onStaticList$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = separatorState$onStaticList$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj3);
            new ArrayList();
            obj2.getClass();
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj3);
        if (obj3 == null) {
            throw null;
        }
        throw null;
    }
}
