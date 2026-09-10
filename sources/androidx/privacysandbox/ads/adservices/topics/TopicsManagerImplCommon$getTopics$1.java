package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
public final class TopicsManagerImplCommon$getTopics$1 extends ContinuationImpl {
    public TopicsManagerImplCommon X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7965Y;
    public final /* synthetic */ TopicsManagerImplCommon Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.Z = topicsManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7965Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.d(this.Z, null, this);
    }
}
