package androidx.paging;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", l = {445}, m = MobileAdsBridgeBase.initializeMethodName)
final class RemoteMediatorAccessImpl$initialize$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7862Y;
    public final /* synthetic */ RemoteMediatorAccessImpl Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMediatorAccessImpl$initialize$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RemoteMediatorAccessImpl$initialize$1 remoteMediatorAccessImpl$initialize$1;
        this.f7862Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        RemoteMediatorAccessImpl remoteMediatorAccessImpl = this.Z;
        remoteMediatorAccessImpl.getClass();
        int i2 = this.e0;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.e0 = i2 - Integer.MIN_VALUE;
            remoteMediatorAccessImpl$initialize$1 = this;
        } else {
            remoteMediatorAccessImpl$initialize$1 = new RemoteMediatorAccessImpl$initialize$1(remoteMediatorAccessImpl, this);
        }
        Object obj2 = remoteMediatorAccessImpl$initialize$1.f7862Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = remoteMediatorAccessImpl$initialize$1.e0;
        RemoteMediator.InitializeAction initializeAction = RemoteMediator.InitializeAction.X;
        if (i3 == 0) {
            ResultKt.b(obj2);
            remoteMediatorAccessImpl$initialize$1.X = remoteMediatorAccessImpl;
            remoteMediatorAccessImpl$initialize$1.e0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RemoteMediatorAccessImpl remoteMediatorAccessImpl2 = (RemoteMediatorAccessImpl) remoteMediatorAccessImpl$initialize$1.X;
        ResultKt.b(obj2);
        if (((RemoteMediator.InitializeAction) obj2) != initializeAction) {
            return obj2;
        }
        remoteMediatorAccessImpl2.getClass();
        throw null;
    }
}
