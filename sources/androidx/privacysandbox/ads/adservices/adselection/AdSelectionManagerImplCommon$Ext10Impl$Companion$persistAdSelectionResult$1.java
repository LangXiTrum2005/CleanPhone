package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", l = {231}, m = "persistAdSelectionResult")
public final class AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7912Y;
    public final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, Continuation continuation) {
        super(continuation);
        this.Z = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7912Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.b(null, null, this);
    }
}
