package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import com.ironsource.C3700q2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.retroflection;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00022\u00020\u00022\u00020\u0004B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b,\u0010-J)\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u0010/\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b9\u0010\u0011J\u001d\u0010:\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b:\u0010\u0011J\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u0014J\u001d\u0010<\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\u00020\u000e2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\bA\u0010BJ)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00020D0C2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\bG\u0010$J\u0017\u0010H\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\bH\u0010$J\u000f\u0010I\u001a\u00020\u0015H\u0016¢\u0006\u0004\bI\u0010\u0017J+\u0010L\u001a\u00020\u000e2\u001a\u0010K\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020J\u0012\u0006\u0012\u0004\u0018\u00010J0D0CH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u0014J\u000f\u0010S\u001a\u00020\u000eH\u0016¢\u0006\u0004\bS\u0010\u0014J\u000f\u0010T\u001a\u00020\u000eH\u0016¢\u0006\u0004\bT\u0010\u0014J\u000f\u0010U\u001a\u00020\u000eH\u0016¢\u0006\u0004\bU\u0010\u0014J\u000f\u0010V\u001a\u00020\u000eH\u0016¢\u0006\u0004\bV\u0010\u0014J5\u0010[\u001a\u00028\u0000\"\u0004\b\u0000\u0010W2\b\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010Z\u001a\u00020Y2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b[\u0010\\J!\u0010]\u001a\u0002002\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b_\u0010`J\u001f\u0010a\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\ba\u0010bJ\u001b\u0010d\u001a\u00020\u000e2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030cH\u0000¢\u0006\u0004\bd\u0010eR\u0017\u0010\u0006\u001a\u00020\u00058G¢\u0006\f\n\u0004\b<\u0010f\u001a\u0004\bg\u0010hR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010iR(\u0010n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020jj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u00060\u0002j\u0002`o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR \u0010w\u001a\b\u0012\u0004\u0012\u00020t0s8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bH\u0010u\u0012\u0004\bv\u0010\u0014R \u0010}\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\bU\u0010y\u0012\u0004\b|\u0010\u0014\u001a\u0004\bz\u0010{R \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010~R\u001d\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020)0\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u0081\u0001R\u001d\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020)0\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010\u0081\u0001R%\u0010\u0084\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030c038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010~R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0085\u0001R\u0016\u0010\u0086\u0001\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0085\u0001R!\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010~R#\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010~R.\u0010\u008e\u0001\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\b\u0012\u0010\u0089\u0001\u0012\u0005\b\u008d\u0001\u0010\u0014\u001a\u0005\b\u008a\u0001\u0010\u0017\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u008f\u0001R\u0018\u0010\u0092\u0001\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0091\u0001R\u001f\u0010\u0097\u0001\u001a\u00030\u0093\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0013\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u009a\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0099\u0001R \u0010 \u0001\u001a\u00030\u009b\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¢\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010¡\u0001R\u001a\u0010£\u0001\u001a\u00020\u00158\u0006¢\u0006\u000e\n\u0005\b1\u0010\u0089\u0001\u001a\u0005\b£\u0001\u0010\u0017R\u0017\u0010O\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u0091\u0001R-\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b7\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010\u0011R\u0016\u0010©\u0001\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u0017R\u0015\u0010ª\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0017R\u0016\u0010¬\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\u0017¨\u0006\u00ad\u0001"}, d2 = {"Landroidx/compose/runtime/gintrap;", "Landroidx/compose/runtime/supplicat;", "", "Landroidx/compose/runtime/dhss;", "Loilcan/polloi;", "Landroidx/compose/runtime/graveside;", "parent", "Landroidx/compose/runtime/wireman;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/graveside;Landroidx/compose/runtime/wireman;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "content", "stratoscope", "(Lkotlin/jvm/functions/Function2;)V", "trm", "sealless", "()V", "", "cuirassed", "()Z", "oilcan", "yemenite", "value", "forgetConditionalScopes", "dovishness", "(Ljava/lang/Object;Z)V", "", "values", "rotuma", "(Ljava/util/Set;Z)V", "cord", "polder", "(Ljava/lang/Object;)V", "Ladultoid/attabal;", "changes", "preprohormone", "(Ladultoid/attabal;)V", "Landroidx/compose/runtime/technofreak;", "scope", C3700q2.p, "creditor", "(Landroidx/compose/runtime/technofreak;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/saneness;", "anchor", "Landroidx/compose/runtime/InvalidationResult;", "merc", "(Landroidx/compose/runtime/technofreak;Landroidx/compose/runtime/saneness;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "Landroidx/compose/runtime/collection/beachfront;", "privatdozent", "()Landroidx/collection/grimness;", "Loilcan/formularize;", "seminary", "()Loilcan/formularize;", "competently", "wireman", "attabal", "kowloon", "(Ljava/util/Set;)V", "formularize", "(Ljava/util/Set;)Z", "block", "triweekly", "(Lkotlin/jvm/functions/Function0;)V", "", "Lkotlin/Pair;", "kattegat", "(Landroidx/compose/runtime/saneness;)Ljava/util/List;", "saneness", "molybdenite", "apical", "Landroidx/compose/runtime/nosophobia;", "references", "taiyuan", "(Ljava/util/List;)V", "Landroidx/compose/runtime/lerp;", "state", "impromptu", "(Landroidx/compose/runtime/lerp;)V", "arytenoidectomy", "marial", "adultoid", "graveside", "gintrap", "R", "to", "", "groupIndex", "cutely", "(Landroidx/compose/runtime/supplicat;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "impassible", "(Landroidx/compose/runtime/technofreak;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "dern", "(Landroidx/compose/runtime/technofreak;)V", "saran", "(Ljava/lang/Object;Landroidx/compose/runtime/technofreak;)V", "Landroidx/compose/runtime/polder;", "grimness", "(Landroidx/compose/runtime/polder;)V", "Landroidx/compose/runtime/graveside;", "getParent", "()Landroidx/compose/runtime/graveside;", "Landroidx/compose/runtime/wireman;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "monoploid", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Landroidx/compose/runtime/platform/SynchronizedObject;", "polloi", "Ljava/lang/Object;", "lock", "", "Landroidx/compose/runtime/basify;", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "Landroidx/compose/runtime/cosy;", "Landroidx/compose/runtime/cosy;", "restrictive", "()Landroidx/compose/runtime/cosy;", "getSlotTable$runtime$annotations", "slotTable", "Landroidx/collection/grimness;", "observations", "Landroidx/collection/saran;", "Landroidx/collection/saran;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "Ladultoid/attabal;", "lateChanges", "observationsProcessed", "invalidations", "Z", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "getPendingInvalidScopes$runtime$annotations", "pendingInvalidScopes", "Landroidx/compose/runtime/gintrap;", "invalidationDelegate", "I", "invalidationDelegateGroup", "Landroidx/compose/runtime/yemenite;", "Landroidx/compose/runtime/yemenite;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/yemenite;", "observerHolder", "Lcuirassed/apical;", "Lcuirassed/apical;", "rememberManager", "Landroidx/compose/runtime/kowloon;", "supplicat", "Landroidx/compose/runtime/kowloon;", "getComposer$runtime", "()Landroidx/compose/runtime/kowloon;", "composer", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "isRoot", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "areChildrenComposing", "isComposing", "beachfront", "isDisposed", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class gintrap implements supplicat, molybdenite, dhss, oilcan.polloi {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<Object, Object> observations;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final wireman<?> applier;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final adultoid.attabal lateChanges;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<Object, Object> observationsProcessed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.saran<technofreak> invalidatedScopes;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.saran<technofreak> conditionallyInvalidatedScopes;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final cosy slotTable;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public final cuirassed.apical rememberManager;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final graveside parent;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public final boolean isRoot;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final Set<basify> abandonSet;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final AtomicReference<Object> pendingModifications;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public gintrap invalidationDelegate;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Object lock;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final adultoid.attabal changes;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext _recomposeContext;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<Object, Object> derivedStates;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final yemenite observerHolder;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public Function2<? super taiyuan, ? super Integer, Unit> composable;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.grimness<Object, Object> invalidations;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public final kowloon composer;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public boolean pendingInvalidScopes;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public int invalidationDelegateGroup;

    public gintrap(graveside gravesideVar, wireman<?> wiremanVar, CoroutineContext coroutineContext) {
        this.parent = gravesideVar;
        this.applier = wiremanVar;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        int i = 0;
        int i2 = 1;
        Set<basify> setFormularize = new androidx.collection.saran(i, i2, defaultConstructorMarker).formularize();
        this.abandonSet = setFormularize;
        cosy cosyVar = new cosy();
        if (gravesideVar.wireman()) {
            cosyVar.competently();
        }
        if (gravesideVar.beachfront()) {
            cosyVar.impromptu();
        }
        this.slotTable = cosyVar;
        this.observations = androidx.compose.runtime.collection.beachfront.wireman(null, 1, null);
        this.invalidatedScopes = new androidx.collection.saran<>(i, i2, defaultConstructorMarker);
        this.conditionallyInvalidatedScopes = new androidx.collection.saran<>(i, i2, defaultConstructorMarker);
        this.derivedStates = androidx.compose.runtime.collection.beachfront.wireman(null, 1, null);
        adultoid.attabal attabalVar = new adultoid.attabal();
        this.changes = attabalVar;
        adultoid.attabal attabalVar2 = new adultoid.attabal();
        this.lateChanges = attabalVar2;
        this.observationsProcessed = androidx.compose.runtime.collection.beachfront.wireman(null, 1, null);
        this.invalidations = androidx.compose.runtime.collection.beachfront.wireman(null, 1, null);
        yemenite yemeniteVar = new yemenite(null, false, gravesideVar, 3, null);
        this.observerHolder = yemeniteVar;
        this.rememberManager = new cuirassed.apical();
        kowloon kowloonVar = new kowloon(wiremanVar, gravesideVar, cosyVar, setFormularize, attabalVar, attabalVar2, yemeniteVar, this);
        gravesideVar.monoploid(kowloonVar);
        this.composer = kowloonVar;
        this._recomposeContext = coroutineContext;
        this.isRoot = gravesideVar instanceof Recomposer;
        this.composable = beachfront.f5829attabal.saneness();
    }

    @Override // androidx.compose.runtime.supplicat
    public void adultoid() {
        synchronized (this.lock) {
            try {
                this.composer.yemenite();
                if (!this.abandonSet.isEmpty()) {
                    cuirassed.apical apicalVar = this.rememberManager;
                    try {
                        apicalVar.formularize(this.abandonSet, this.composer.sayid());
                        apicalVar.competently();
                        apicalVar.beachfront();
                    } catch (Throwable th) {
                        apicalVar.beachfront();
                        throw th;
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        cuirassed.apical apicalVar2 = this.rememberManager;
                        try {
                            apicalVar2.formularize(this.abandonSet, this.composer.sayid());
                            apicalVar2.competently();
                        } finally {
                            apicalVar2.beachfront();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    graveside();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.supplicat
    public boolean apical() {
        boolean zHerdbook;
        synchronized (this.lock) {
            oilcan();
            try {
                androidx.collection.grimness<Object, Object> grimnessVarPrivatdozent = privatdozent();
                try {
                    zHerdbook = this.composer.herdbook(grimnessVarPrivatdozent, null);
                    if (!zHerdbook) {
                        yemenite();
                    }
                } catch (Throwable th) {
                    this.invalidations = grimnessVarPrivatdozent;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        cuirassed.apical apicalVar = this.rememberManager;
                        try {
                            apicalVar.formularize(this.abandonSet, this.composer.sayid());
                            apicalVar.competently();
                        } finally {
                            apicalVar.beachfront();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    graveside();
                    throw th3;
                }
            }
        }
        return zHerdbook;
    }

    @Override // androidx.compose.runtime.supplicat
    public void arytenoidectomy() {
        synchronized (this.lock) {
            try {
                preprohormone(this.changes);
                yemenite();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        cuirassed.apical apicalVar = this.rememberManager;
                        try {
                            apicalVar.formularize(this.abandonSet, this.composer.sayid());
                            apicalVar.competently();
                        } finally {
                            apicalVar.beachfront();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    graveside();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.molybdenite
    public void attabal() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    lightstruck.saneness("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.state != 3) {
                    this.state = 3;
                    this.composable = beachfront.f5829attabal.attabal();
                    adultoid.attabal attabalVarLotta = this.composer.getDeferredChanges();
                    if (attabalVarLotta != null) {
                        preprohormone(attabalVarLotta);
                    }
                    boolean z = this.slotTable.getGroupsSize() > 0;
                    if (z || !this.abandonSet.isEmpty()) {
                        cuirassed.apical apicalVar = this.rememberManager;
                        try {
                            apicalVar.formularize(this.abandonSet, this.composer.sayid());
                            if (z) {
                                this.applier.competently();
                                SlotWriter slotWriterGintrap = this.slotTable.gintrap();
                                try {
                                    polloi.creditor(slotWriterGintrap, this.rememberManager);
                                    Unit unit = Unit.f29295attabal;
                                    slotWriterGintrap.restrictive(true);
                                    this.applier.clear();
                                    this.applier.wireman();
                                    apicalVar.taiyuan();
                                } catch (Throwable th) {
                                    slotWriterGintrap.restrictive(false);
                                    throw th;
                                }
                            }
                            apicalVar.competently();
                            apicalVar.beachfront();
                        } catch (Throwable th2) {
                            apicalVar.beachfront();
                            throw th2;
                        }
                    }
                    this.composer.privatdozent();
                }
                Unit unit2 = Unit.f29295attabal;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.parent.graveside(this);
    }

    @Override // androidx.compose.runtime.molybdenite
    public boolean beachfront() {
        return this.state == 3;
    }

    @Override // androidx.compose.runtime.molybdenite
    public void competently(Function2<? super taiyuan, ? super Integer, Unit> content) {
        boolean zCuirassed = cuirassed();
        sealless();
        if (zCuirassed) {
            trm(content);
        } else {
            stratoscope(content);
        }
    }

    public final void cord() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zWireman;
        long[] jArr3;
        int i3;
        int i4;
        androidx.collection.grimness<Object, Object> grimnessVar = this.derivedStates;
        long[] jArr4 = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr4.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            long j8 = 128;
            while (true) {
                long j9 = jArr4[i6];
                j2 = 255;
                if ((((~j9) << c3) & j9 & j7) != j7) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j9 & 255) < j8) {
                            c2 = c3;
                            int i9 = (i6 << 3) + i8;
                            j5 = j7;
                            Object obj = grimnessVar.keys[i9];
                            Object obj2 = grimnessVar.values[i9];
                            if (obj2 instanceof androidx.collection.saran) {
                                Intrinsics.competently(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                androidx.collection.saran saranVar = (androidx.collection.saran) obj2;
                                Object[] objArr = saranVar.elements;
                                long[] jArr5 = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i10 = 0;
                                    int i11 = i5;
                                    while (true) {
                                        int i12 = length2;
                                        long j10 = jArr5[i10];
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i10 - i12)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & 255) < j6) {
                                                    jArr3 = jArr4;
                                                    int i15 = (i10 << 3) + i14;
                                                    i3 = i14;
                                                    i4 = i8;
                                                    if (!androidx.compose.runtime.collection.beachfront.marial(this.observations, (polder) objArr[i15])) {
                                                        saranVar.cuirassed(i15);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i3 = i14;
                                                    i4 = i8;
                                                }
                                                j10 >>= i11;
                                                i14 = i3 + 1;
                                                i8 = i4;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i = i8;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i8;
                                        }
                                        length2 = i12;
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j9 = j4;
                                        i8 = i;
                                        jArr4 = jArr2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                zWireman = saranVar.wireman();
                            } else {
                                jArr2 = jArr4;
                                j4 = j9;
                                i = i8;
                                j6 = j8;
                                Intrinsics.competently(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zWireman = !androidx.compose.runtime.collection.beachfront.marial(this.observations, (polder) obj2);
                            }
                            if (zWireman) {
                                grimnessVar.polloi(i9);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr4;
                            j4 = j9;
                            i = i8;
                            c2 = c3;
                            j5 = j7;
                            j6 = j8;
                            i2 = i5;
                        }
                        j9 = j4 >> i2;
                        i8 = i + 1;
                        i5 = i2;
                        c3 = c2;
                        j7 = j5;
                        j8 = j6;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c3 = c;
                j7 = j;
                j8 = j3;
                jArr4 = jArr;
                i5 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.marial()) {
            return;
        }
        androidx.collection.saran<technofreak> saranVar2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = saranVar2.elements;
        long[] jArr6 = saranVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j11 = jArr6[i16];
            if ((((~j11) << c) & j11 & j) != j) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j11 & j2) < j3) {
                        int i19 = (i16 << 3) + i18;
                        if (!((technofreak) objArr2[i19]).dovishness()) {
                            saranVar2.cuirassed(i19);
                        }
                    }
                    j11 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    public final boolean creditor(technofreak scope, Object instance) {
        return polloi() && this.composer.sultanate(scope, instance);
    }

    public final boolean cuirassed() {
        boolean z;
        synchronized (this.lock) {
            z = true;
            if (this.state != 1) {
                z = false;
            }
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.supplicat
    public <R> R cutely(supplicat to, int groupIndex, Function0<? extends R> block) {
        if (to == null || Intrinsics.wireman(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (gintrap) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.dhss
    public void dern(technofreak scope) {
        this.pendingInvalidScopes = true;
        seminary();
    }

    public final void dovishness(Object value, boolean forgetConditionalScopes) {
        Object objDern = this.observations.dern(value);
        if (objDern == null) {
            return;
        }
        if (!(objDern instanceof androidx.collection.saran)) {
            technofreak technofreakVar = (technofreak) objDern;
            if (androidx.compose.runtime.collection.beachfront.competently(this.observationsProcessed, value, technofreakVar) || technofreakVar.adultoid(value) == InvalidationResult.IGNORED) {
                return;
            }
            if (!technofreakVar.dovishness() || forgetConditionalScopes) {
                this.invalidatedScopes.impromptu(technofreakVar);
                return;
            } else {
                this.conditionallyInvalidatedScopes.impromptu(technofreakVar);
                return;
            }
        }
        androidx.collection.saran saranVar = (androidx.collection.saran) objDern;
        Object[] objArr = saranVar.elements;
        long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        technofreak technofreakVar2 = (technofreak) objArr[(i << 3) + i3];
                        if (!androidx.compose.runtime.collection.beachfront.competently(this.observationsProcessed, value, technofreakVar2) && technofreakVar2.adultoid(value) != InvalidationResult.IGNORED) {
                            if (!technofreakVar2.dovishness() || forgetConditionalScopes) {
                                this.invalidatedScopes.impromptu(technofreakVar2);
                            } else {
                                this.conditionallyInvalidatedScopes.impromptu(technofreakVar2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // androidx.compose.runtime.supplicat
    public boolean formularize(Set<? extends Object> values) {
        if (values instanceof ScatterSetWrapper) {
            ScatterSet scatterSetSaneness = ((ScatterSetWrapper) values).saneness();
            Object[] objArr = scatterSetSaneness.elements;
            long[] jArr = scatterSetSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (androidx.compose.runtime.collection.beachfront.marial(this.observations, obj) || androidx.compose.runtime.collection.beachfront.marial(this.derivedStates, obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : values) {
                if (androidx.compose.runtime.collection.beachfront.marial(this.observations, obj2) || androidx.compose.runtime.collection.beachfront.marial(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.supplicat
    public void gintrap() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    technofreak technofreakVar = obj instanceof technofreak ? (technofreak) obj : null;
                    if (technofreakVar != null) {
                        technofreakVar.invalidate();
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.supplicat
    public void graveside() {
        this.pendingModifications.set(null);
        this.changes.attabal();
        this.lateChanges.attabal();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        cuirassed.apical apicalVar = this.rememberManager;
        try {
            apicalVar.formularize(this.abandonSet, this.composer.sayid());
            apicalVar.competently();
        } finally {
            apicalVar.beachfront();
        }
    }

    public final void grimness(polder<?> state) {
        if (androidx.compose.runtime.collection.beachfront.marial(this.observations, state)) {
            return;
        }
        androidx.compose.runtime.collection.beachfront.impromptu(this.derivedStates, state);
    }

    @Override // androidx.compose.runtime.dhss
    public InvalidationResult impassible(technofreak scope, Object instance) {
        gintrap gintrapVar;
        if (scope.cutely()) {
            scope.oilcan(true);
        }
        saneness sanenessVarImpromptu = scope.getAnchor();
        if (sanenessVarImpromptu == null || !sanenessVarImpromptu.saneness()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotTable.rotuma(sanenessVarImpromptu)) {
            synchronized (this.lock) {
                gintrapVar = this.invalidationDelegate;
            }
            return (gintrapVar == null || !gintrapVar.creditor(scope, instance)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
        }
        if (!scope.taiyuan()) {
            return InvalidationResult.IGNORED;
        }
        InvalidationResult invalidationResultMerc = merc(scope, sanenessVarImpromptu, instance);
        if (invalidationResultMerc != InvalidationResult.IGNORED) {
            seminary();
        }
        return invalidationResultMerc;
    }

    @Override // androidx.compose.runtime.supplicat
    public void impromptu(lerp state) {
        cuirassed.apical apicalVar = this.rememberManager;
        try {
            apicalVar.formularize(this.abandonSet, this.composer.sayid());
            SlotWriter slotWriterGintrap = state.getSlotTable().gintrap();
            try {
                polloi.creditor(slotWriterGintrap, this.rememberManager);
                Unit unit = Unit.f29295attabal;
                slotWriterGintrap.restrictive(true);
                apicalVar.taiyuan();
                apicalVar.beachfront();
            } catch (Throwable th) {
                slotWriterGintrap.restrictive(false);
                throw th;
            }
        } catch (Throwable th2) {
            apicalVar.beachfront();
            throw th2;
        }
    }

    public final List<Pair<technofreak, Object>> kattegat(saneness anchor) {
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j;
        char c;
        long j2;
        int i3;
        boolean zWireman;
        Object[] objArr;
        int i4;
        long j3;
        Object[] objArr2;
        if (androidx.compose.runtime.collection.beachfront.beachfront(this.invalidations) <= 0) {
            return p002kotlin.collections.adultoid.formularize();
        }
        ArrayList arrayList = new ArrayList();
        cosy cosyVar = this.slotTable;
        androidx.collection.grimness<Object, Object> grimnessVar = this.invalidations;
        long[] jArr3 = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr3[i5];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            c = c2;
                            int i9 = (i5 << 3) + i8;
                            j2 = j5;
                            Object obj = grimnessVar.keys[i9];
                            Object obj2 = grimnessVar.values[i9];
                            int i10 = i6;
                            Intrinsics.competently(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj2 instanceof androidx.collection.saran) {
                                Intrinsics.competently(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                androidx.collection.saran saranVar = (androidx.collection.saran) obj2;
                                Object[] objArr3 = saranVar.elements;
                                long[] jArr4 = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j = j4;
                                    int i11 = 0;
                                    while (true) {
                                        long j6 = jArr4[i11];
                                        i = length;
                                        i2 = i8;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j6 & 255) < 128) {
                                                    i4 = i13;
                                                    int i14 = (i11 << 3) + i4;
                                                    j3 = j6;
                                                    Object obj3 = objArr3[i14];
                                                    technofreak technofreakVar = (technofreak) obj;
                                                    objArr2 = objArr3;
                                                    saneness sanenessVarImpromptu = technofreakVar.getAnchor();
                                                    if (sanenessVarImpromptu != null && cosyVar.adultoid(anchor, sanenessVarImpromptu)) {
                                                        arrayList.add(patroclinal.formularize.attabal(technofreakVar, obj3));
                                                        saranVar.cuirassed(i14);
                                                    }
                                                } else {
                                                    i4 = i13;
                                                    j3 = j6;
                                                    objArr2 = objArr3;
                                                }
                                                j6 = j3 >> i10;
                                                i13 = i4 + 1;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        length = i;
                                        i8 = i2;
                                        objArr3 = objArr;
                                        i10 = 8;
                                    }
                                } else {
                                    i = length;
                                    i2 = i8;
                                    j = j4;
                                }
                                zWireman = saranVar.wireman();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i8;
                                j = j4;
                                Intrinsics.competently(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                technofreak technofreakVar2 = (technofreak) obj;
                                saneness sanenessVarImpromptu2 = technofreakVar2.getAnchor();
                                if (sanenessVarImpromptu2 == null || !cosyVar.adultoid(anchor, sanenessVarImpromptu2)) {
                                    zWireman = false;
                                } else {
                                    arrayList.add(patroclinal.formularize.attabal(technofreakVar2, obj2));
                                    zWireman = true;
                                }
                            }
                            if (zWireman) {
                                grimnessVar.polloi(i9);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i8;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i3 = i6;
                        }
                        j4 = j >> i3;
                        i6 = i3;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                        length = i;
                        i8 = i2 + 1;
                    }
                    jArr = jArr3;
                    int i15 = length;
                    if (i7 != i6) {
                        break;
                    }
                    length = i15;
                } else {
                    jArr = jArr3;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.supplicat
    public void kowloon(Set<? extends Object> values) {
        Object obj;
        Object objCord;
        do {
            obj = this.pendingModifications.get();
            if (obj == null || Intrinsics.wireman(obj, rotuma.f6146attabal)) {
                objCord = values;
            } else if (obj instanceof Set) {
                objCord = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objCord = p002kotlin.collections.arytenoidectomy.cord((Set[]) obj, values);
            }
        } while (!retroflection.attabal(this.pendingModifications, obj, objCord));
        if (obj == null) {
            synchronized (this.lock) {
                yemenite();
                Unit unit = Unit.f29295attabal;
            }
        }
    }

    @Override // androidx.compose.runtime.supplicat
    public void marial() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.wireman()) {
                    preprohormone(this.lateChanges);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        cuirassed.apical apicalVar = this.rememberManager;
                        try {
                            apicalVar.formularize(this.abandonSet, this.composer.sayid());
                            apicalVar.competently();
                        } finally {
                            apicalVar.beachfront();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    graveside();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009e A[Catch: all -> 0x001e, LOOP:0: B:31:0x005d->B:45:0x009e, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:23:0x003c, B:24:0x0045, B:26:0x004d, B:28:0x0051, B:31:0x005d, B:33:0x006d, B:35:0x0079, B:37:0x0083, B:41:0x0092, B:45:0x009e, B:46:0x00a1, B:49:0x00a6), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[Catch: all -> 0x001e, EDGE_INSN: B:49:0x00a6->B:50:0x00ab BREAK  A[LOOP:0: B:31:0x005d->B:45:0x009e], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:23:0x003c, B:24:0x0045, B:26:0x004d, B:28:0x0051, B:31:0x005d, B:33:0x006d, B:35:0x0079, B:37:0x0083, B:41:0x0092, B:45:0x009e, B:46:0x00a1, B:49:0x00a6), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6 A[SYNTHETIC] */
    public final InvalidationResult merc(technofreak scope, saneness anchor, Object instance) {
        synchronized (this.lock) {
            try {
                gintrap gintrapVar = this.invalidationDelegate;
                gintrap gintrapVar2 = null;
                if (gintrapVar != null) {
                    if (!this.slotTable.graveside(this.invalidationDelegateGroup, anchor)) {
                        gintrapVar = null;
                    }
                    gintrapVar2 = gintrapVar;
                }
                if (gintrapVar2 == null) {
                    if (creditor(scope, instance)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (instance != null && (instance instanceof polder)) {
                        Object objDern = this.invalidations.dern(scope);
                        if (objDern != null) {
                            if (!(objDern instanceof androidx.collection.saran)) {
                                if (objDern != osteal.f6102attabal) {
                                    androidx.compose.runtime.collection.beachfront.attabal(this.invalidations, scope, instance);
                                    break;
                                }
                            } else {
                                androidx.collection.saran saranVar = (androidx.collection.saran) objDern;
                                Object[] objArr = saranVar.elements;
                                long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    androidx.compose.runtime.collection.beachfront.attabal(this.invalidations, scope, instance);
                                    break;
                                }
                                int i = 0;
                                loop0: while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i == length) {
                                            androidx.compose.runtime.collection.beachfront.attabal(this.invalidations, scope, instance);
                                            break;
                                        }
                                        i++;
                                    } else {
                                        int i2 = 8;
                                        int i3 = 8 - ((~(i - length)) >>> 31);
                                        int i4 = 0;
                                        while (i4 < i3) {
                                            if ((j & 255) < 128 && objArr[(i << 3) + i4] == osteal.f6102attabal) {
                                                break loop0;
                                            }
                                            j >>= i2;
                                            i4++;
                                            i2 = i2;
                                        }
                                        if (i3 == i2) {
                                            if (i == length) {
                                                i++;
                                            }
                                        }
                                        androidx.compose.runtime.collection.beachfront.attabal(this.invalidations, scope, instance);
                                        break;
                                    }
                                }
                            }
                        } else {
                            androidx.compose.runtime.collection.beachfront.attabal(this.invalidations, scope, instance);
                            break;
                        }
                    } else {
                        androidx.compose.runtime.collection.beachfront.taiyuan(this.invalidations, scope, osteal.f6102attabal);
                    }
                }
                if (gintrapVar2 != null) {
                    return gintrapVar2.merc(scope, anchor, instance);
                }
                this.parent.impassible(this);
                return polloi() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    @Override // androidx.compose.runtime.supplicat
    public void molybdenite(Object value) {
        synchronized (this.lock) {
            try {
                polder(value);
                Object objDern = this.derivedStates.dern(value);
                if (objDern != null) {
                    if (objDern instanceof androidx.collection.saran) {
                        androidx.collection.saran saranVar = (androidx.collection.saran) objDern;
                        Object[] objArr = saranVar.elements;
                        long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            polder((polder) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        polder((polder) objDern);
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void oilcan() {
        Object andSet = this.pendingModifications.getAndSet(rotuma.f6146attabal);
        if (andSet != null) {
            if (Intrinsics.wireman(andSet, rotuma.f6146attabal)) {
                polloi.dovishness("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                rotuma((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                polloi.dovishness("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                rotuma(set, true);
            }
        }
    }

    public final void polder(Object value) {
        Object objDern = this.observations.dern(value);
        if (objDern == null) {
            return;
        }
        if (!(objDern instanceof androidx.collection.saran)) {
            technofreak technofreakVar = (technofreak) objDern;
            if (technofreakVar.adultoid(value) == InvalidationResult.IMMINENT) {
                androidx.compose.runtime.collection.beachfront.attabal(this.observationsProcessed, value, technofreakVar);
                return;
            }
            return;
        }
        androidx.collection.saran saranVar = (androidx.collection.saran) objDern;
        Object[] objArr = saranVar.elements;
        long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        technofreak technofreakVar2 = (technofreak) objArr[(i << 3) + i3];
                        if (technofreakVar2.adultoid(value) == InvalidationResult.IMMINENT) {
                            androidx.compose.runtime.collection.beachfront.attabal(this.observationsProcessed, value, technofreakVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.compose.runtime.supplicat
    public boolean polloi() {
        return this.composer.getIsComposing();
    }

    public final void preprohormone(adultoid.attabal changes) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean zWireman;
        long[] jArr3;
        this.rememberManager.formularize(this.abandonSet, this.composer.sayid());
        try {
            if (changes.dern()) {
                try {
                    if (this.lateChanges.dern()) {
                        this.rememberManager.competently();
                    }
                } finally {
                    this.rememberManager.beachfront();
                }
            } else {
                cuirassed.polloi polloiVar = cuirassed.polloi.f24276attabal;
                Object objAttabal = polloiVar.attabal("Compose:applyChanges");
                try {
                    wireman<?> wiremanVar = this.applier;
                    cuirassed.apical apicalVar = this.rememberManager;
                    wiremanVar.competently();
                    SlotWriter slotWriterGintrap = this.slotTable.gintrap();
                    int i2 = 0;
                    try {
                        changes.saneness(wiremanVar, slotWriterGintrap, apicalVar, this.composer.sayid());
                        Unit unit = Unit.f29295attabal;
                        slotWriterGintrap.restrictive(true);
                        wiremanVar.wireman();
                        polloiVar.saneness(objAttabal);
                        this.rememberManager.taiyuan();
                        this.rememberManager.cutely();
                        if (this.pendingInvalidScopes) {
                            Object objAttabal2 = polloiVar.attabal("Compose:unobserve");
                            try {
                                this.pendingInvalidScopes = false;
                                androidx.collection.grimness<Object, Object> grimnessVar = this.observations;
                                long[] jArr4 = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j3 = jArr4[i3];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8;
                                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                                            int i6 = i2;
                                            while (i6 < i5) {
                                                if ((j3 & 255) < 128) {
                                                    int i7 = (i3 << 3) + i6;
                                                    c = c2;
                                                    Object obj = grimnessVar.keys[i7];
                                                    Object obj2 = grimnessVar.values[i7];
                                                    j2 = j4;
                                                    if (obj2 instanceof androidx.collection.saran) {
                                                        Intrinsics.competently(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        androidx.collection.saran saranVar = (androidx.collection.saran) obj2;
                                                        Object[] objArr = saranVar.elements;
                                                        long[] jArr5 = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j = j3;
                                                            int i8 = i4;
                                                            int i9 = 0;
                                                            while (true) {
                                                                long j5 = jArr5[i9];
                                                                Object[] objArr2 = objArr;
                                                                long[] jArr6 = jArr5;
                                                                if ((((~j5) << c) & j5 & j2) != j2) {
                                                                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                                    int i11 = 0;
                                                                    while (i11 < i10) {
                                                                        if ((j5 & 255) < 128) {
                                                                            jArr3 = jArr4;
                                                                            int i12 = (i9 << 3) + i11;
                                                                            if (!((technofreak) objArr2[i12]).graveside()) {
                                                                                saranVar.cuirassed(i12);
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr4;
                                                                        }
                                                                        j5 >>= i8;
                                                                        i11++;
                                                                        jArr4 = jArr3;
                                                                    }
                                                                    jArr2 = jArr4;
                                                                    if (i10 != i8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr4;
                                                                }
                                                                if (i9 == length2) {
                                                                    break;
                                                                }
                                                                i9++;
                                                                objArr = objArr2;
                                                                jArr5 = jArr6;
                                                                jArr4 = jArr2;
                                                                i8 = 8;
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j = j3;
                                                        }
                                                        zWireman = saranVar.wireman();
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                        Intrinsics.competently(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zWireman = !((technofreak) obj2).graveside();
                                                    }
                                                    if (zWireman) {
                                                        grimnessVar.polloi(i7);
                                                    }
                                                    i = 8;
                                                } else {
                                                    jArr2 = jArr4;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i = i4;
                                                }
                                                j3 = j >> i;
                                                i6++;
                                                i4 = i;
                                                c2 = c;
                                                j4 = j2;
                                                jArr4 = jArr2;
                                            }
                                            jArr = jArr4;
                                            if (i5 != i4) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                        jArr4 = jArr;
                                        i2 = 0;
                                    }
                                }
                                cord();
                                Unit unit2 = Unit.f29295attabal;
                                cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                            } catch (Throwable th) {
                                cuirassed.polloi.f24276attabal.saneness(objAttabal2);
                                throw th;
                            }
                        }
                        try {
                            if (this.lateChanges.dern()) {
                                this.rememberManager.competently();
                            }
                        } finally {
                            this.rememberManager.beachfront();
                        }
                    } catch (Throwable th2) {
                        slotWriterGintrap.restrictive(false);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    cuirassed.polloi.f24276attabal.saneness(objAttabal);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (this.lateChanges.dern()) {
                    this.rememberManager.competently();
                }
                throw th4;
            } finally {
                this.rememberManager.beachfront();
            }
        }
    }

    public final androidx.collection.grimness<Object, Object> privatdozent() {
        androidx.collection.grimness<Object, Object> grimnessVar = this.invalidations;
        this.invalidations = androidx.compose.runtime.collection.beachfront.wireman(null, 1, null);
        return grimnessVar;
    }

    /* JADX INFO: renamed from: restrictive, reason: from getter */
    public final cosy getSlotTable() {
        return this.slotTable;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x023d A[LOOP:6: B:93:0x01e9->B:110:0x023d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x034c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x034e A[LOOP:10: B:152:0x0301->B:170:0x034e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x00c8 A[EDGE_INSN: B:193:0x00c8->B:37:0x00c8 BREAK  A[LOOP:2: B:23:0x0077->B:34:0x00b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x024a A[EDGE_INSN: B:201:0x024a->B:112:0x024a BREAK  A[LOOP:6: B:93:0x01e9->B:110:0x023d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0355 A[EDGE_INSN: B:207:0x0355->B:172:0x0355 BREAK  A[LOOP:10: B:152:0x0301->B:170:0x034e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0187 A[EDGE_INSN: B:216:0x0187->B:74:0x0187 BREAK  A[LOOP:13: B:61:0x014b->B:72:0x017f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[LOOP:2: B:23:0x0077->B:34:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x017f A[LOOP:13: B:61:0x014b->B:72:0x017f, LOOP_END] */
    public final void rotuma(Set<? extends Object> values, boolean forgetConditionalScopes) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        String str;
        long j4;
        boolean zAttabal;
        long j5;
        long[] jArr2;
        int i;
        long[] jArr3;
        int i2;
        int i3;
        long j6;
        boolean zWireman;
        int i4;
        long j7;
        long j8;
        char c2;
        long j9;
        int i5;
        int i6;
        Object obj = null;
        char c3 = 7;
        long j10 = -9187201950435737472L;
        int i7 = 8;
        if (values instanceof ScatterSetWrapper) {
            ScatterSet scatterSetSaneness = ((ScatterSetWrapper) values).saneness();
            Object[] objArr = scatterSetSaneness.elements;
            long[] jArr4 = scatterSetSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 128;
                while (true) {
                    long j11 = jArr4[i8];
                    j3 = 255;
                    if ((((~j11) << c3) & j11 & j10) != j10) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j11 & 255) < 128) {
                                c2 = c3;
                                Object obj2 = objArr[(i8 << 3) + i10];
                                j9 = j10;
                                if (obj2 instanceof technofreak) {
                                    ((technofreak) obj2).adultoid(obj);
                                    j8 = j11;
                                    i5 = length;
                                } else {
                                    dovishness(obj2, forgetConditionalScopes);
                                    Object objDern = this.derivedStates.dern(obj2);
                                    if (objDern == null) {
                                        j8 = j11;
                                        i5 = length;
                                    } else if (objDern instanceof androidx.collection.saran) {
                                        androidx.collection.saran saranVar = (androidx.collection.saran) objDern;
                                        Object[] objArr2 = saranVar.elements;
                                        long[] jArr5 = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            j8 = j11;
                                            int i11 = 0;
                                            while (true) {
                                                long j12 = jArr5[i11];
                                                int i12 = i7;
                                                i5 = length;
                                                if ((((~j12) << c2) & j12 & j9) != j9) {
                                                    int i13 = 8 - ((~(i11 - length2)) >>> 31);
                                                    int i14 = 0;
                                                    while (i14 < i13) {
                                                        if ((j12 & 255) < 128) {
                                                            dovishness((polder) objArr2[(i11 << 3) + i14], forgetConditionalScopes);
                                                        }
                                                        j12 >>= i12;
                                                        i14++;
                                                        i12 = i12;
                                                    }
                                                    if (i13 != i12) {
                                                        break;
                                                    }
                                                    if (i11 != length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    length = i5;
                                                    i7 = 8;
                                                } else if (i11 != length2) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11++;
                                                    length = i5;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            j8 = j11;
                                            i5 = length;
                                        }
                                    } else {
                                        j8 = j11;
                                        i5 = length;
                                        dovishness((polder) objDern, forgetConditionalScopes);
                                    }
                                    Unit unit = Unit.f29295attabal;
                                }
                                i6 = 8;
                            } else {
                                j8 = j11;
                                c2 = c3;
                                j9 = j10;
                                i5 = length;
                                i6 = i7;
                            }
                            i10++;
                            length = i5;
                            i7 = i6;
                            c3 = c2;
                            j10 = j9;
                            j11 = j8 >> i6;
                            obj = null;
                        }
                        c = c3;
                        j = j10;
                        int i15 = length;
                        if (i9 != i7) {
                            break;
                        } else {
                            length = i15;
                        }
                    } else {
                        c = c3;
                        j = j10;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    c3 = c;
                    j10 = j;
                    obj = null;
                    i7 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (Object obj3 : values) {
                if (obj3 instanceof technofreak) {
                    ((technofreak) obj3).adultoid(null);
                } else {
                    dovishness(obj3, forgetConditionalScopes);
                    Object objDern2 = this.derivedStates.dern(obj3);
                    if (objDern2 != null) {
                        if (objDern2 instanceof androidx.collection.saran) {
                            androidx.collection.saran saranVar2 = (androidx.collection.saran) objDern2;
                            Object[] objArr3 = saranVar2.elements;
                            long[] jArr6 = saranVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j13 = jArr6[i16];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length3) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j13 & 255) < 128) {
                                                dovishness((polder) objArr3[(i16 << 3) + i18], forgetConditionalScopes);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        } else if (i16 != length3) {
                                            break;
                                        } else {
                                            i16++;
                                        }
                                    }
                                }
                            }
                        } else {
                            dovishness((polder) objDern2, forgetConditionalScopes);
                        }
                    }
                    Unit unit2 = Unit.f29295attabal;
                }
            }
        }
        androidx.collection.saran<technofreak> saranVar3 = this.conditionallyInvalidatedScopes;
        androidx.collection.saran<technofreak> saranVar4 = this.invalidatedScopes;
        String str2 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (!forgetConditionalScopes || !saranVar3.marial()) {
            if (saranVar4.marial()) {
                androidx.collection.grimness<Object, Object> grimnessVar = this.observations;
                long[] jArr7 = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length4 = jArr7.length - 2;
                if (length4 >= 0) {
                    int i19 = 0;
                    while (true) {
                        long j14 = jArr7[i19];
                        if ((((~j14) << c) & j14 & j) != j) {
                            int i20 = 8 - ((~(i19 - length4)) >>> 31);
                            int i21 = 0;
                            while (i21 < i20) {
                                if ((j14 & j3) < j2) {
                                    int i22 = (i19 << 3) + i21;
                                    Object obj4 = grimnessVar.keys[i22];
                                    Object obj5 = grimnessVar.values[i22];
                                    if (obj5 instanceof androidx.collection.saran) {
                                        Intrinsics.competently(obj5, str2);
                                        androidx.collection.saran saranVar5 = (androidx.collection.saran) obj5;
                                        Object[] objArr4 = saranVar5.elements;
                                        long[] jArr8 = saranVar5.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i23 = 0;
                                            while (true) {
                                                long j15 = jArr8[i23];
                                                j4 = j14;
                                                if ((((~j15) << c) & j15 & j) != j) {
                                                    int i24 = 8 - ((~(i23 - length5)) >>> 31);
                                                    int i25 = 0;
                                                    while (i25 < i24) {
                                                        if ((j15 & j3) < j2) {
                                                            j5 = j15;
                                                            int i26 = (i23 << 3) + i25;
                                                            if (saranVar4.attabal((technofreak) objArr4[i26])) {
                                                                saranVar5.cuirassed(i26);
                                                            }
                                                        } else {
                                                            j5 = j15;
                                                        }
                                                        i25++;
                                                        j15 = j5 >> 8;
                                                    }
                                                    if (i24 != 8) {
                                                        break;
                                                    }
                                                    if (i23 != length5) {
                                                        break;
                                                    }
                                                    i23++;
                                                    j14 = j4;
                                                } else if (i23 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i23++;
                                                    j14 = j4;
                                                }
                                            }
                                        } else {
                                            j4 = j14;
                                        }
                                        zAttabal = saranVar5.wireman();
                                    } else {
                                        j4 = j14;
                                        Intrinsics.competently(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        zAttabal = saranVar4.attabal((technofreak) obj5);
                                    }
                                    if (zAttabal) {
                                        grimnessVar.polloi(i22);
                                    }
                                } else {
                                    jArr7 = jArr7;
                                    str2 = str2;
                                    j4 = j14;
                                }
                                j14 = j4 >> 8;
                                i21++;
                                jArr7 = jArr7;
                                str2 = str2;
                            }
                            jArr = jArr7;
                            str = str2;
                            if (i20 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr7;
                            str = str2;
                        }
                        if (i19 == length4) {
                            break;
                        }
                        i19++;
                        jArr7 = jArr;
                        str2 = str;
                    }
                }
                cord();
                saranVar4.impassible();
                return;
            }
            return;
        }
        androidx.collection.grimness<Object, Object> grimnessVar2 = this.observations;
        long[] jArr9 = grimnessVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length6 = jArr9.length - 2;
        if (length6 >= 0) {
            int i27 = 0;
            while (true) {
                long j16 = jArr9[i27];
                if ((((~j16) << c) & j16 & j) != j) {
                    int i28 = 8 - ((~(i27 - length6)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j16 & j3) < j2) {
                            int i30 = (i27 << 3) + i29;
                            Object obj6 = grimnessVar2.keys[i30];
                            Object obj7 = grimnessVar2.values[i30];
                            if (obj7 instanceof androidx.collection.saran) {
                                Intrinsics.competently(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                androidx.collection.saran saranVar6 = (androidx.collection.saran) obj7;
                                Object[] objArr5 = saranVar6.elements;
                                long[] jArr10 = saranVar6.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                jArr3 = jArr9;
                                int length7 = jArr10.length - 2;
                                if (length7 >= 0) {
                                    j6 = j16;
                                    int i31 = 0;
                                    while (true) {
                                        long j17 = jArr10[i31];
                                        i2 = length6;
                                        i3 = i27;
                                        if ((((~j17) << c) & j17 & j) != j) {
                                            int i32 = 8 - ((~(i31 - length7)) >>> 31);
                                            for (int i33 = 0; i33 < i32; i33 = i4 + 1) {
                                                if ((j17 & j3) < j2) {
                                                    i4 = i33;
                                                    int i34 = (i31 << 3) + i4;
                                                    j7 = j17;
                                                    technofreak technofreakVar = (technofreak) objArr5[i34];
                                                    if (saranVar3.attabal(technofreakVar) || saranVar4.attabal(technofreakVar)) {
                                                        saranVar6.cuirassed(i34);
                                                    }
                                                } else {
                                                    i4 = i33;
                                                    j7 = j17;
                                                }
                                                j17 = j7 >> 8;
                                            }
                                            if (i32 != 8) {
                                                break;
                                            }
                                            if (i31 != length7) {
                                                break;
                                            }
                                            i31++;
                                            length6 = i2;
                                            i27 = i3;
                                        } else if (i31 != length7) {
                                            break;
                                            break;
                                        } else {
                                            i31++;
                                            length6 = i2;
                                            i27 = i3;
                                        }
                                    }
                                } else {
                                    i2 = length6;
                                    i3 = i27;
                                    j6 = j16;
                                }
                                zWireman = saranVar6.wireman();
                            } else {
                                jArr3 = jArr9;
                                i2 = length6;
                                i3 = i27;
                                j6 = j16;
                                Intrinsics.competently(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                technofreak technofreakVar2 = (technofreak) obj7;
                                zWireman = saranVar3.attabal(technofreakVar2) || saranVar4.attabal(technofreakVar2);
                            }
                            if (zWireman) {
                                grimnessVar2.polloi(i30);
                            }
                        } else {
                            jArr3 = jArr9;
                            i2 = length6;
                            i3 = i27;
                            j6 = j16;
                        }
                        j16 = j6 >> 8;
                        i29++;
                        length6 = i2;
                        jArr9 = jArr3;
                        i27 = i3;
                    }
                    jArr2 = jArr9;
                    int i35 = length6;
                    int i36 = i27;
                    if (i28 != 8) {
                        break;
                    }
                    length6 = i35;
                    i = i36;
                } else {
                    jArr2 = jArr9;
                    i = i27;
                }
                if (i == length6) {
                    break;
                }
                i27 = i + 1;
                jArr9 = jArr2;
            }
        }
        saranVar3.impassible();
        cord();
    }

    @Override // androidx.compose.runtime.supplicat, androidx.compose.runtime.dhss
    public void saneness(Object value) {
        technofreak technofreakVarNosophobia;
        int i;
        int i2;
        if (supplicat() || (technofreakVarNosophobia = this.composer.nosophobia()) == null) {
            return;
        }
        int i3 = 1;
        technofreakVarNosophobia.grimness(true);
        boolean zPreprohormone = technofreakVarNosophobia.preprohormone(value);
        seminary();
        if (zPreprohormone) {
            return;
        }
        if (value instanceof androidx.compose.runtime.snapshots.seminary) {
            ((androidx.compose.runtime.snapshots.seminary) value).adultoid(androidx.compose.runtime.snapshots.impromptu.attabal(1));
        }
        androidx.compose.runtime.collection.beachfront.attabal(this.observations, value, technofreakVarNosophobia);
        if (value instanceof polder) {
            polder<?> polderVar = (polder) value;
            polder.attabal<?> attabalVarMolybdenite = polderVar.molybdenite();
            androidx.compose.runtime.collection.beachfront.impromptu(this.derivedStates, value);
            androidx.collection.creditor<androidx.compose.runtime.snapshots.polder> creditorVarSaneness = attabalVarMolybdenite.saneness();
            Object[] objArr = creditorVarSaneness.keys;
            long[] jArr = creditorVarSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j & 255) < 128) {
                                i2 = i3;
                                androidx.compose.runtime.snapshots.polder polderVar2 = (androidx.compose.runtime.snapshots.polder) objArr[(i4 << 3) + i7];
                                if (polderVar2 instanceof androidx.compose.runtime.snapshots.seminary) {
                                    ((androidx.compose.runtime.snapshots.seminary) polderVar2).adultoid(androidx.compose.runtime.snapshots.impromptu.attabal(i2));
                                }
                                androidx.compose.runtime.collection.beachfront.attabal(this.derivedStates, polderVar2, value);
                            } else {
                                i2 = i3;
                                i5 = i5;
                            }
                            j >>= i5;
                            i7++;
                            i3 = i2;
                            i5 = i5;
                        }
                        i = i3;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        i = i3;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
            }
            technofreakVarNosophobia.rotuma(polderVar, attabalVarMolybdenite.attabal());
        }
    }

    public final void saran(Object instance, technofreak scope) {
        androidx.compose.runtime.collection.beachfront.competently(this.observations, instance, scope);
    }

    public final void sealless() {
        String str;
        int i = this.state;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            str = "The composition should be activated before setting content.";
        } else if (i != 2) {
            str = i != 3 ? "" : "The composition is disposed";
        } else {
            str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
        }
        lightstruck.saneness(str);
    }

    public final oilcan.formularize seminary() {
        this.observerHolder.attabal();
        return null;
    }

    public final void stratoscope(Function2<? super taiyuan, ? super Integer, Unit> content) {
        this.composable = content;
        this.parent.attabal(this, content);
    }

    public final boolean supplicat() {
        return this.composer.itchy();
    }

    @Override // androidx.compose.runtime.supplicat
    public void taiyuan(List<Pair<nosophobia, nosophobia>> references) {
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.wireman(references.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            polloi.adultoid("Check failed");
        }
        try {
            this.composer.wostteth(references);
            Unit unit = Unit.f29295attabal;
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    cuirassed.apical apicalVar = this.rememberManager;
                    try {
                        apicalVar.formularize(this.abandonSet, this.composer.sayid());
                        apicalVar.competently();
                    } finally {
                        apicalVar.beachfront();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                graveside();
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.supplicat
    public void triweekly(Function0<Unit> block) {
        this.composer.claque(block);
    }

    public final void trm(Function2<? super taiyuan, ? super Integer, Unit> content) {
        this.composer.cig();
        stratoscope(content);
        this.composer.splinterproof();
    }

    @Override // androidx.compose.runtime.supplicat
    public void wireman(Function2<? super taiyuan, ? super Integer, Unit> content) {
        try {
            synchronized (this.lock) {
                oilcan();
                androidx.collection.grimness<Object, Object> grimnessVarPrivatdozent = privatdozent();
                try {
                    this.composer.supplicat(grimnessVarPrivatdozent, content, null);
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    this.invalidations = grimnessVarPrivatdozent;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    cuirassed.apical apicalVar = this.rememberManager;
                    try {
                        apicalVar.formularize(this.abandonSet, this.composer.sayid());
                        apicalVar.competently();
                    } finally {
                        apicalVar.beachfront();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                graveside();
                throw th3;
            }
        }
    }

    public final void yemenite() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.wireman(andSet, rotuma.f6146attabal)) {
            return;
        }
        if (andSet instanceof Set) {
            rotuma((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                rotuma(set, false);
            }
            return;
        }
        if (andSet == null) {
            polloi.dovishness("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        polloi.dovishness("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ gintrap(graveside gravesideVar, wireman wiremanVar, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gravesideVar, wiremanVar, (i & 4) != 0 ? null : coroutineContext);
    }
}
