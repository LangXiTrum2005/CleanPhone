package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.WrapperDataSource", f = "WrapperDataSource.jvm.kt", l = {68}, m = "load$suspendImpl")
final class WrapperDataSource$load$1<Key, ValueFrom, ValueTo> extends ContinuationImpl {
    public WrapperDataSource X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7894Y;
    public final /* synthetic */ WrapperDataSource Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource$load$1(WrapperDataSource wrapperDataSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = wrapperDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WrapperDataSource$load$1<Key, ValueFrom, ValueTo> wrapperDataSource$load$1;
        this.f7894Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        WrapperDataSource wrapperDataSource = this.Z;
        if (this instanceof WrapperDataSource$load$1) {
            int i2 = this.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                this.e0 = i2 - Integer.MIN_VALUE;
                wrapperDataSource$load$1 = this;
            } else {
                wrapperDataSource$load$1 = new WrapperDataSource$load$1<>(wrapperDataSource, this);
            }
        } else {
            wrapperDataSource$load$1 = new WrapperDataSource$load$1<>(wrapperDataSource, this);
        }
        Object obj2 = wrapperDataSource$load$1.f7894Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = wrapperDataSource$load$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            wrapperDataSource.getClass();
            wrapperDataSource$load$1.X = wrapperDataSource;
            wrapperDataSource$load$1.e0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        WrapperDataSource wrapperDataSource2 = wrapperDataSource$load$1.X;
        ResultKt.b(obj2);
        DataSource.BaseResult result = (DataSource.BaseResult) obj2;
        wrapperDataSource2.getClass();
        Intrinsics.f(result, "result");
        Intrinsics.f(null, "function");
        result.getClass();
        Intrinsics.f(null, "function");
        Intrinsics.f(null, "source");
        throw null;
    }
}
