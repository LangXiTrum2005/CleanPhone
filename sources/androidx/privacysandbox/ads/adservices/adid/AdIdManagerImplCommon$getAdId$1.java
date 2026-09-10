package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", l = {40}, m = "getAdId$suspendImpl")
public final class AdIdManagerImplCommon$getAdId$1 extends ContinuationImpl {
    public AdIdManagerImplCommon X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7904Y;
    public final /* synthetic */ AdIdManagerImplCommon Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManagerImplCommon$getAdId$1(AdIdManagerImplCommon adIdManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.Z = adIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7904Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return AdIdManagerImplCommon.b(this.Z, this);
    }
}
