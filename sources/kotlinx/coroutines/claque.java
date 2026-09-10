package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, d2 = {"", "competently", "(Ljava/lang/Object;)Ljava/lang/Object;", "impromptu", "Lpigboat/stratoscope;", "attabal", "Lpigboat/stratoscope;", "COMPLETING_ALREADY", "saneness", "COMPLETING_WAITING_CHILDREN", "dern", "COMPLETING_RETRY", "wireman", "TOO_LATE_TO_CANCEL", "marial", "SEALED", "Lkotlinx/coroutines/coffeecake;", "beachfront", "Lkotlinx/coroutines/coffeecake;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class claque {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final pigboat.stratoscope f32173attabal = new pigboat.stratoscope("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final pigboat.stratoscope f32178saneness = new pigboat.stratoscope("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final pigboat.stratoscope f32176dern = new pigboat.stratoscope("COMPLETING_RETRY");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final pigboat.stratoscope f32179wireman = new pigboat.stratoscope("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final pigboat.stratoscope f32177marial = new pigboat.stratoscope("SEALED");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final coffeecake f32174beachfront = new coffeecake(false);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final coffeecake f32175competently = new coffeecake(true);

    public static final Object competently(Object obj) {
        return obj instanceof gusty ? new picketboat((gusty) obj) : obj;
    }

    public static final Object impromptu(Object obj) {
        gusty gustyVar;
        picketboat picketboatVar = obj instanceof picketboat ? (picketboat) obj : null;
        return (picketboatVar == null || (gustyVar = picketboatVar.state) == null) ? obj : gustyVar;
    }
}
