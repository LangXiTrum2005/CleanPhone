package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", l = {38}, m = "getAppSetId$suspendImpl")
public final class AppSetIdManagerImplCommon$getAppSetId$1 extends ContinuationImpl {
    public AppSetIdManagerImplCommon X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7923Y;
    public final /* synthetic */ AppSetIdManagerImplCommon Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManagerImplCommon$getAppSetId$1(AppSetIdManagerImplCommon appSetIdManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.Z = appSetIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7923Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return AppSetIdManagerImplCommon.b(this.Z, this);
    }
}
