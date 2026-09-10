package kotlinx.coroutines.selects;

import kotlinx.coroutines.impassible;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import pigboat.stratoscope;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"6\u0010\u0011\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u001a\u0010\u001f\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e*H\b\u0007\u0010!\" \u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u00022 \u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0002*H\b\u0007\u0010\"\" \u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022 \u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002*\u0080\u0001\b\u0007\u0010#\"<\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00020\u00022<\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00020\u0002¨\u0006$"}, d2 = {"Lkotlinx/coroutines/impassible;", "", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "onCancellation", "", "cutely", "(Lkotlinx/coroutines/impassible;Ltetrahedral/triweekly;)Z", "", "trySelectInternalResult", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "attabal", "(I)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "Ltetrahedral/triweekly;", "DUMMY_PROCESS_RESULT_FUNCTION", "Lpigboat/stratoscope;", "saneness", "Lpigboat/stratoscope;", "STATE_REG", "dern", "STATE_COMPLETED", "wireman", "STATE_CANCELLED", "marial", "NO_RESULT", "beachfront", "taiyuan", "()Lpigboat/stratoscope;", "PARAM_CLAUSE_0", "Lkotlinx/coroutines/selects/taiyuan;", "RegistrationFunction", "ProcessResultFunction", "OnCancellationConstructor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final triweekly<Object, Object, Object, Object> f32435attabal = attabal.f32441kowloon;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final stratoscope f32439saneness = new stratoscope("STATE_REG");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final stratoscope f32437dern = new stratoscope("STATE_COMPLETED");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final stratoscope f32440wireman = new stratoscope("STATE_CANCELLED");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final stratoscope f32438marial = new stratoscope("NO_RESULT");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final stratoscope f32436beachfront = new stratoscope("PARAM_CLAUSE_0");

    /* JADX INFO: compiled from: Select.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class attabal implements triweekly {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final attabal f32441kowloon = new attabal();

        @Override // tetrahedral.triweekly
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    public static final TrySelectDetailedResult attabal(int i) {
        if (i == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    public static final boolean cutely(impassible<? super Unit> impassibleVar, triweekly<? super Throwable, Object, ? super CoroutineContext, Unit> triweeklyVar) {
        Object objMarial = impassibleVar.marial(Unit.f29295attabal, null, triweeklyVar);
        if (objMarial == null) {
            return false;
        }
        impassibleVar.gintrap(objMarial);
        return true;
    }

    public static final stratoscope taiyuan() {
        return f32436beachfront;
    }
}
