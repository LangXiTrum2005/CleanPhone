package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", f = "AdSelectionManagerFutures.kt", l = {327}, m = "invokeSuspend")
public final class AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl f7932Y;
    public final /* synthetic */ ReportImpressionRequest Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, ReportImpressionRequest reportImpressionRequest, Continuation continuation) {
        super(2, continuation);
        this.f7932Y = api33Ext4JavaImpl;
        this.Z = reportImpressionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this.f7932Y, this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1 adSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1 = (AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        adSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f43263a;
        }
        ResultKt.b(obj);
        Intrinsics.c(null);
        this.X = 1;
        throw null;
    }
}
