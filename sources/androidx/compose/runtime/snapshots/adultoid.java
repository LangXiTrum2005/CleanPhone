package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010/\u001a\u00020\u00132\n\u0010-\u001a\u00060\u0000j\u0002`\u00012\n\u0010.\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u00100\u001a+\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u0002012\n\u0010*\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104\u001a7\u00107\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u00002\n\u00106\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0019\u0010@\u001a\u0004\u0018\u0001012\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010B\u001a\u00020\u00132\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bB\u0010C\u001a\u000f\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010'\u001a\u0017\u0010E\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0001¢\u0006\u0004\bG\u0010H\u001a5\u0010J\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\f2\u0006\u0010I\u001a\u00028\u0000H\u0000¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0000¢\u0006\u0004\bL\u0010H\u001a-\u0010M\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010H\u001a%\u0010N\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\bN\u0010<\u001a\u001f\u0010O\u001a\u00020\t2\u0006\u0010*\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\bO\u0010P\u001a9\u0010V\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0018\u00010U2\n\u0010Q\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u0003H\u0002¢\u0006\u0004\bV\u0010W\u001a\u000f\u0010X\u001a\u00020=H\u0002¢\u0006\u0004\bX\u0010?\u001a)\u0010Y\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\fH\u0001¢\u0006\u0004\bY\u0010Z\u001a!\u0010[\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u0000H\u0001¢\u0006\u0004\b[\u0010\\\u001a+\u0010_\u001a\u00020\u0003*\u00020\u00032\n\u0010]\u001a\u00060\u0000j\u0002`\u00012\n\u0010^\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b_\u0010`\" \u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b\"\u0018\u0010f\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e\"\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\f0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i\"$\u0010q\u001a\u00060\u0011j\u0002`k8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bp\u0010'\u001a\u0004\bn\u0010o\"\u0016\u0010t\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010s\"\u001a\u0010v\u001a\u00060\u0000j\u0002`\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010e\"\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y\"\u001a\u0010~\u001a\b\u0012\u0004\u0012\u0002090{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}\"9\u0010\u0084\u0001\u001a\"\u0012\u001e\u0012\u001c\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00110\u0081\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0080\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\"+\u0010\u0086\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001\"\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001\"%\u0010\u008d\u0001\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0012\u0005\b\u008c\u0001\u0010'\u001a\u0005\b\u008b\u0001\u0010\u000e\"\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0092\u0001"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "", "sayid", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "itchy", "(I)V", "Landroidx/compose/runtime/snapshots/formularize;", "grimness", "()Landroidx/compose/runtime/snapshots/formularize;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "restrictive", "(Landroidx/compose/runtime/snapshots/formularize;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/formularize;", "parentObserver", "mergeReadObserver", "creditor", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", "walach", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/saneness;", "globalSnapshot", "block", "lerp", "(Landroidx/compose/runtime/snapshots/saneness;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "sealless", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kattegat", "()V", "nosophobia", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/formularize;", "snapshot", "sensatory", "(Landroidx/compose/runtime/snapshots/formularize;)V", "currentSnapshot", "candidateSnapshot", "coi", "(JJLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Landroidx/compose/runtime/snapshots/grimness;", "data", "czestochowa", "(Landroidx/compose/runtime/snapshots/grimness;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "r", "id", "milliradian", "(Landroidx/compose/runtime/snapshots/grimness;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/grimness;", "Landroidx/compose/runtime/snapshots/polder;", "state", "treadless", "(Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/polder;)Landroidx/compose/runtime/snapshots/grimness;", "", "timberyard", "()Ljava/lang/Void;", "empress", "(Landroidx/compose/runtime/snapshots/polder;)Landroidx/compose/runtime/snapshots/grimness;", "cultivated", "(Landroidx/compose/runtime/snapshots/polder;)Z", "supplicat", "premeiotic", "(Landroidx/compose/runtime/snapshots/polder;)V", "underbelly", "(Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/polder;Landroidx/compose/runtime/snapshots/formularize;)Landroidx/compose/runtime/snapshots/grimness;", "candidate", "permissivist", "(Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/polder;Landroidx/compose/runtime/snapshots/formularize;Landroidx/compose/runtime/snapshots/grimness;)Landroidx/compose/runtime/snapshots/grimness;", "splinterproof", "overspeculate", "mathsort", "clubfoot", "(Landroidx/compose/runtime/snapshots/formularize;Landroidx/compose/runtime/snapshots/polder;)V", "currentSnapshotId", "Landroidx/compose/runtime/snapshots/wireman;", "applyingSnapshot", "invalidSnapshots", "", "dent", "(JLandroidx/compose/runtime/snapshots/wireman;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "coffeecake", "seminary", "(Landroidx/compose/runtime/snapshots/grimness;Landroidx/compose/runtime/snapshots/formularize;)Landroidx/compose/runtime/snapshots/grimness;", "polder", "(Landroidx/compose/runtime/snapshots/grimness;)Landroidx/compose/runtime/snapshots/grimness;", "from", "until", "yemenite", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;JJ)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "attabal", "Lkotlin/jvm/functions/Function1;", "emptyLambda", "saneness", "J", "INVALID_SNAPSHOT", "Lcuirassed/formularize;", "dern", "Lcuirassed/formularize;", "threadSnapshot", "Landroidx/compose/runtime/platform/SynchronizedObject;", "wireman", "Ljava/lang/Object;", "privatdozent", "()Ljava/lang/Object;", "getLock$annotations", "lock", "marial", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "openSnapshots", "beachfront", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/triweekly;", "competently", "Landroidx/compose/runtime/snapshots/triweekly;", "pinningTable", "Landroidx/compose/runtime/snapshots/supplicat;", "impromptu", "Landroidx/compose/runtime/snapshots/supplicat;", "extraStateObjects", "", "Lkotlin/Function2;", "", "taiyuan", "Ljava/util/List;", "applyObservers", "cutely", "globalWriteObservers", "apical", "Landroidx/compose/runtime/snapshots/saneness;", "formularize", "Landroidx/compose/runtime/snapshots/formularize;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "snapshotInitializer", "Landroidx/compose/runtime/internal/AtomicInt;", "impassible", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingApplyObserverCount", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class adultoid {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final saneness f6164apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static long f6166beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final triweekly f6167competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static List<? extends Function1<Object, Unit>> f6168cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final formularize f6170formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static AtomicInt f6171impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final supplicat<polder> f6172impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static SnapshotIdSet f6173marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long f6174saneness = 0;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static List<? extends Function2<? super Set<? extends Object>, ? super formularize, Unit>> f6175taiyuan;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Function1<SnapshotIdSet, Unit> f6165attabal = new Function1() { // from class: androidx.compose.runtime.snapshots.polloi
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return adultoid.saran((SnapshotIdSet) obj);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final cuirassed.formularize<formularize> f6169dern = new cuirassed.formularize<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Object f6176wireman = new Object();

    static {
        SnapshotIdSet.Companion attabalVar = SnapshotIdSet.INSTANCE;
        f6173marial = attabalVar.attabal();
        long j = 1;
        f6166beachfront = arytenoidectomy.dern(1) + j;
        f6167competently = new triweekly();
        f6172impromptu = new supplicat<>();
        f6175taiyuan = p002kotlin.collections.adultoid.formularize();
        f6168cutely = p002kotlin.collections.adultoid.formularize();
        long j2 = f6166beachfront;
        f6166beachfront = j + j2;
        saneness sanenessVar = new saneness(j2, attabalVar.attabal());
        f6173marial = f6173marial.kowloon(sanenessVar.getSnapshotId());
        f6164apical = sanenessVar;
        f6170formularize = sanenessVar;
        f6171impassible = new AtomicInt(0);
    }

    public static final void clubfoot(formularize formularizeVar, polder polderVar) {
        formularizeVar.gintrap(formularizeVar.cutely() + 1);
        Function1<Object, Unit> function1Apical = formularizeVar.apical();
        if (function1Apical != null) {
            function1Apical.invoke(polderVar);
        }
    }

    public static final Void coffeecake() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final boolean coi(long j, long j2, SnapshotIdSet snapshotIdSet) {
        return (j2 == f6174saneness || Intrinsics.cutely(j2, j) > 0 || snapshotIdSet.cutely(j2)) ? false : true;
    }

    public static final Function1<Object, Unit> creditor(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.monoploid
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return adultoid.hydrovane(function1, function2, obj);
            }
        };
    }

    public static final boolean cultivated(polder polderVar) {
        grimness grimnessVar;
        long jMarial = f6167competently.marial(f6166beachfront);
        grimness grimnessVar2 = null;
        grimness grimnessVarTriweekly = null;
        int i = 0;
        for (grimness grimnessVarTriweekly2 = polderVar.getFirstStateRecord(); grimnessVarTriweekly2 != null; grimnessVarTriweekly2 = grimnessVarTriweekly2.getNext()) {
            long jCompetently = grimnessVarTriweekly2.getSnapshotId();
            if (jCompetently != f6174saneness) {
                if (Intrinsics.cutely(jCompetently, jMarial) >= 0) {
                    i++;
                } else if (grimnessVar2 == null) {
                    i++;
                    grimnessVar2 = grimnessVarTriweekly2;
                } else {
                    if (Intrinsics.cutely(grimnessVarTriweekly2.getSnapshotId(), grimnessVar2.getSnapshotId()) < 0) {
                        grimnessVar = grimnessVar2;
                        grimnessVar2 = grimnessVarTriweekly2;
                    } else {
                        grimnessVar = grimnessVarTriweekly2;
                    }
                    if (grimnessVarTriweekly == null) {
                        grimnessVarTriweekly = polderVar.getFirstStateRecord();
                        grimness grimnessVar3 = grimnessVarTriweekly;
                        while (true) {
                            if (grimnessVarTriweekly == null) {
                                grimnessVarTriweekly = grimnessVar3;
                                break;
                            }
                            if (Intrinsics.cutely(grimnessVarTriweekly.getSnapshotId(), jMarial) >= 0) {
                                break;
                            }
                            if (Intrinsics.cutely(grimnessVar3.getSnapshotId(), grimnessVarTriweekly.getSnapshotId()) < 0) {
                                grimnessVar3 = grimnessVarTriweekly;
                            }
                            grimnessVarTriweekly = grimnessVarTriweekly.getNext();
                        }
                    }
                    grimnessVar2.taiyuan(f6174saneness);
                    grimnessVar2.dern(grimnessVarTriweekly);
                    grimnessVar2 = grimnessVar;
                }
            }
        }
        return i > 1;
    }

    public static final boolean czestochowa(grimness grimnessVar, long j, SnapshotIdSet snapshotIdSet) {
        return coi(j, grimnessVar.getSnapshotId(), snapshotIdSet);
    }

    public static final Map<grimness, grimness> dent(long j, wireman wiremanVar, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map<grimness, grimness> map;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        Map<grimness, grimness> map2;
        int i;
        androidx.collection.saran<polder> saranVarYemenite = wiremanVar.yemenite();
        Map<grimness, grimness> map3 = null;
        if (saranVarYemenite == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetTriweekly = wiremanVar.getInvalid().kowloon(wiremanVar.getSnapshotId()).triweekly(wiremanVar.sealless());
        Object[] objArr = saranVarYemenite.elements;
        long[] jArr3 = saranVarYemenite.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i2 = 0;
        while (true) {
            long j2 = jArr3[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j2) < 128) {
                        polder polderVar = (polder) objArr[(i2 << 3) + i5];
                        map2 = map3;
                        grimness grimnessVarTriweekly = polderVar.getFirstStateRecord();
                        i = i3;
                        grimness grimnessVarMilliradian = milliradian(grimnessVarTriweekly, j, snapshotIdSet);
                        if (grimnessVarMilliradian == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            grimness grimnessVarMilliradian2 = milliradian(grimnessVarTriweekly, j, snapshotIdSetTriweekly);
                            if (grimnessVarMilliradian2 != null && !Intrinsics.wireman(grimnessVarMilliradian, grimnessVarMilliradian2)) {
                                grimness grimnessVarMilliradian3 = milliradian(grimnessVarTriweekly, wiremanVar.getSnapshotId(), wiremanVar.getInvalid());
                                if (grimnessVarMilliradian3 == null) {
                                    timberyard();
                                    throw new KotlinNothingValueException();
                                }
                                grimness grimnessVarKowloon = polderVar.kowloon(grimnessVarMilliradian2, grimnessVarMilliradian, grimnessVarMilliradian3);
                                if (grimnessVarKowloon == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(grimnessVarMilliradian, grimnessVarKowloon);
                                map4 = map4;
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        i = i3;
                    }
                    j2 >>= i;
                    i5++;
                    j = j;
                    map3 = map2;
                    i3 = i;
                    jArr3 = jArr2;
                    snapshotIdSetTriweekly = snapshotIdSetTriweekly;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetTriweekly;
                if (i4 != i3) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetTriweekly;
            }
            if (i2 == length) {
                return map4;
            }
            i2++;
            map3 = map;
            jArr3 = jArr;
            snapshotIdSetTriweekly = snapshotIdSet2;
        }
    }

    public static final grimness empress(polder polderVar) {
        long jMarial = f6167competently.marial(f6166beachfront) - ((long) 1);
        SnapshotIdSet snapshotIdSetAttabal = SnapshotIdSet.INSTANCE.attabal();
        grimness grimnessVar = null;
        for (grimness grimnessVarTriweekly = polderVar.getFirstStateRecord(); grimnessVarTriweekly != null; grimnessVarTriweekly = grimnessVarTriweekly.getNext()) {
            if (grimnessVarTriweekly.getSnapshotId() != f6174saneness) {
                if (czestochowa(grimnessVarTriweekly, jMarial, snapshotIdSetAttabal)) {
                    if (grimnessVar == null) {
                        grimnessVar = grimnessVarTriweekly;
                    } else if (Intrinsics.cutely(grimnessVarTriweekly.getSnapshotId(), grimnessVar.getSnapshotId()) >= 0) {
                        return grimnessVar;
                    }
                }
            }
            return grimnessVarTriweekly;
        }
        return null;
    }

    public static final formularize grimness() {
        formularize formularizeVarAttabal = f6169dern.attabal();
        return formularizeVarAttabal == null ? f6164apical : formularizeVarAttabal;
    }

    public static final Unit hydrovane(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f29295attabal;
    }

    public static final void itchy(int i) {
        f6167competently.beachfront(i);
    }

    public static final void kattegat() {
        sealless(f6165attabal);
    }

    public static final <T> T lerp(saneness sanenessVar, Function1<? super SnapshotIdSet, ? extends T> function1) {
        long jTaiyuan = sanenessVar.getSnapshotId();
        T tInvoke = function1.invoke(f6173marial.taiyuan(jTaiyuan));
        long j = f6166beachfront;
        f6166beachfront = ((long) 1) + j;
        f6173marial = f6173marial.taiyuan(jTaiyuan);
        sanenessVar.dovishness(j);
        sanenessVar.adultoid(f6173marial);
        sanenessVar.gintrap(0);
        sanenessVar.starveling(null);
        sanenessVar.monoploid();
        f6173marial = f6173marial.kowloon(j);
        return tInvoke;
    }

    public static final formularize lotta(Function1 function1, SnapshotIdSet snapshotIdSet) {
        formularize formularizeVar = (formularize) function1.invoke(snapshotIdSet);
        synchronized (privatdozent()) {
            f6173marial = f6173marial.kowloon(formularizeVar.getSnapshotId());
            Unit unit = Unit.f29295attabal;
        }
        return formularizeVar;
    }

    public static final <T extends grimness> T mathsort(T t, polder polderVar) {
        T t2 = (T) empress(polderVar);
        if (t2 != null) {
            t2.taiyuan(Long.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.marial(Long.MAX_VALUE);
        t3.impromptu(polderVar.getFirstStateRecord());
        Intrinsics.competently(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        polderVar.impassible(t3);
        Intrinsics.competently(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t3;
    }

    public static /* synthetic */ formularize merc(formularize formularizeVar, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return restrictive(formularizeVar, function1, z);
    }

    public static final <T extends grimness> T milliradian(T t, long j, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (czestochowa(t, j, snapshotIdSet) && (t2 == null || Intrinsics.cutely(t2.getSnapshotId(), t.getSnapshotId()) < 0)) {
                t2 = t;
            }
            t = (T) t.getNext();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends formularize> T nosophobia(final Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) sealless(new Function1() { // from class: androidx.compose.runtime.snapshots.graveside
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return adultoid.lotta(function1, (SnapshotIdSet) obj);
            }
        });
    }

    public static final <T extends grimness> T overspeculate(T t, polder polderVar, formularize formularizeVar) {
        T t2 = (T) mathsort(t, polderVar);
        t2.dern(t);
        t2.taiyuan(formularizeVar.getSnapshotId());
        return t2;
    }

    public static final Unit peridotite(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f29295attabal;
    }

    public static final <T extends grimness> T permissivist(T t, polder polderVar, formularize formularizeVar, T t2) {
        T t3;
        if (formularizeVar.impromptu()) {
            formularizeVar.arytenoidectomy(polderVar);
        }
        long jTaiyuan = formularizeVar.getSnapshotId();
        if (t2.getSnapshotId() == jTaiyuan) {
            return t2;
        }
        synchronized (privatdozent()) {
            t3 = (T) mathsort(t, polderVar);
        }
        t3.taiyuan(jTaiyuan);
        if (t2.getSnapshotId() != arytenoidectomy.dern(1)) {
            formularizeVar.arytenoidectomy(polderVar);
        }
        return t3;
    }

    public static final <T extends grimness> T polder(T t) {
        T t2;
        formularize.Companion attabalVar = formularize.INSTANCE;
        formularize formularizeVarDern = attabalVar.dern();
        T t3 = (T) milliradian(t, formularizeVarDern.getSnapshotId(), formularizeVarDern.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (privatdozent()) {
            formularize formularizeVarDern2 = attabalVar.dern();
            t2 = (T) milliradian(t, formularizeVarDern2.getSnapshotId(), formularizeVarDern2.getInvalid());
        }
        if (t2 != null) {
            return t2;
        }
        timberyard();
        throw new KotlinNothingValueException();
    }

    public static final void premeiotic(polder polderVar) {
        if (cultivated(polderVar)) {
            f6172impromptu.attabal(polderVar);
        }
    }

    public static final Object privatdozent() {
        return f6176wireman;
    }

    public static final formularize restrictive(formularize formularizeVar, Function1<Object, Unit> function1, boolean z) {
        boolean z2 = formularizeVar instanceof wireman;
        if (z2 || formularizeVar == null) {
            return new starveling(z2 ? (wireman) formularizeVar : null, function1, null, false, z);
        }
        return new hydrovane(formularizeVar, function1, false, z);
    }

    public static final Unit saran(SnapshotIdSet snapshotIdSet) {
        return Unit.f29295attabal;
    }

    public static final int sayid(long j, SnapshotIdSet snapshotIdSet) {
        int iAttabal;
        long jImpassible = snapshotIdSet.impassible(j);
        synchronized (privatdozent()) {
            iAttabal = f6167competently.attabal(jImpassible);
        }
        return iAttabal;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0098 A[Catch: all -> 0x008e, LOOP:1: B:30:0x005e->B:42:0x0098, LOOP_END, TryCatch #2 {all -> 0x008e, blocks: (B:25:0x004f, B:27:0x0054, B:30:0x005e, B:32:0x006e, B:34:0x007a, B:36:0x0083, B:39:0x0090, B:42:0x0098, B:43:0x009b), top: B:54:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x009b A[EDGE_INSN: B:58:0x009b->B:43:0x009b BREAK  A[LOOP:1: B:30:0x005e->B:42:0x0098], SYNTHETIC] */
    public static final <T> T sealless(Function1<? super SnapshotIdSet, ? extends T> function1) {
        androidx.collection.saran<polder> saranVarYemenite;
        T t;
        saneness sanenessVar = f6164apical;
        synchronized (privatdozent()) {
            try {
                saranVarYemenite = sanenessVar.yemenite();
                if (saranVarYemenite != null) {
                    f6171impassible.add(1);
                }
                t = (T) lerp(sanenessVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (saranVarYemenite != null) {
            try {
                List<? extends Function2<? super Set<? extends Object>, ? super formularize, Unit>> list = f6175taiyuan;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(androidx.compose.runtime.collection.marial.attabal(saranVarYemenite), sanenessVar);
                }
                f6171impassible.add(-1);
            } catch (Throwable th2) {
                f6171impassible.add(-1);
                throw th2;
            }
        }
        synchronized (privatdozent()) {
            try {
                supplicat();
                if (saranVarYemenite != null) {
                    Object[] objArr = saranVarYemenite.elements;
                    long[] jArr = saranVarYemenite.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i2 != length) {
                                    break;
                                    break;
                                }
                                i2++;
                            } else {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        premeiotic((polder) objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                                if (i2 != length) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    Unit unit = Unit.f29295attabal;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t;
    }

    public static final <T extends grimness> T seminary(T t, formularize formularizeVar) {
        T t2;
        T t3 = (T) milliradian(t, formularizeVar.getSnapshotId(), formularizeVar.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (privatdozent()) {
            t2 = (T) milliradian(t, formularizeVar.getSnapshotId(), formularizeVar.getInvalid());
        }
        if (t2 != null) {
            return t2;
        }
        timberyard();
        throw new KotlinNothingValueException();
    }

    public static final void sensatory(formularize formularizeVar) {
        long jMarial;
        if (f6173marial.cutely(formularizeVar.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: snapshotId=");
        sb.append(formularizeVar.getSnapshotId());
        sb.append(", disposed=");
        sb.append(formularizeVar.getDisposed());
        sb.append(", applied=");
        wireman wiremanVar = formularizeVar instanceof wireman ? (wireman) formularizeVar : null;
        sb.append(wiremanVar != null ? Boolean.valueOf(wiremanVar.oilcan()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (privatdozent()) {
            jMarial = f6167competently.marial(-1L);
        }
        sb.append(jMarial);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final <T extends grimness> T splinterproof(T t, polder polderVar, formularize formularizeVar) {
        T t2;
        synchronized (privatdozent()) {
            t2 = (T) overspeculate(t, polderVar, formularizeVar);
        }
        return t2;
    }

    public static /* synthetic */ Function1 starveling(Function1 function1, Function1 function2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return creditor(function1, function2, z);
    }

    public static final void supplicat() {
        supplicat<polder> supplicatVar = f6172impromptu;
        int iMarial = supplicatVar.getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMarial) {
                break;
            }
            cuirassed.graveside<polder> gravesideVar = supplicatVar.beachfront()[i];
            polder polderVar = gravesideVar != null ? gravesideVar.get() : null;
            if (polderVar != null && cultivated(polderVar)) {
                if (i2 != i) {
                    supplicatVar.beachfront()[i2] = gravesideVar;
                    supplicatVar.getHashes()[i2] = supplicatVar.getHashes()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < iMarial; i3++) {
            supplicatVar.beachfront()[i3] = null;
            supplicatVar.getHashes()[i3] = 0;
        }
        if (i2 != iMarial) {
            supplicatVar.competently(i2);
        }
    }

    public static final Void timberyard() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends grimness> T treadless(T t, polder polderVar) {
        T t2;
        formularize.Companion attabalVar = formularize.INSTANCE;
        formularize formularizeVarDern = attabalVar.dern();
        Function1<Object, Unit> function1Competently = formularizeVarDern.competently();
        if (function1Competently != null) {
            function1Competently.invoke(polderVar);
        }
        T t3 = (T) milliradian(t, formularizeVarDern.getSnapshotId(), formularizeVarDern.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (privatdozent()) {
            formularize formularizeVarDern2 = attabalVar.dern();
            grimness grimnessVarTriweekly = polderVar.getFirstStateRecord();
            Intrinsics.competently(grimnessVarTriweekly, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t2 = (T) milliradian(grimnessVarTriweekly, formularizeVarDern2.getSnapshotId(), formularizeVarDern2.getInvalid());
            if (t2 == null) {
                timberyard();
                throw new KotlinNothingValueException();
            }
        }
        return t2;
    }

    public static final <T extends grimness> T underbelly(T t, polder polderVar, formularize formularizeVar) {
        T t2;
        if (formularizeVar.impromptu()) {
            formularizeVar.arytenoidectomy(polderVar);
        }
        long jTaiyuan = formularizeVar.getSnapshotId();
        T t3 = (T) milliradian(t, jTaiyuan, formularizeVar.getInvalid());
        if (t3 == null) {
            timberyard();
            throw new KotlinNothingValueException();
        }
        if (t3.getSnapshotId() == formularizeVar.getSnapshotId()) {
            return t3;
        }
        synchronized (privatdozent()) {
            t2 = (T) milliradian(polderVar.getFirstStateRecord(), jTaiyuan, formularizeVar.getInvalid());
            if (t2 == null) {
                timberyard();
                throw new KotlinNothingValueException();
            }
            if (t2.getSnapshotId() != jTaiyuan) {
                t2 = (T) overspeculate(t2, polderVar, formularizeVar);
            }
        }
        Intrinsics.competently(t2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t3.getSnapshotId() != arytenoidectomy.dern(1)) {
            formularizeVar.arytenoidectomy(polderVar);
        }
        return t2;
    }

    public static final Function1<Object, Unit> walach(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.molybdenite
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return adultoid.peridotite(function1, function2, obj);
            }
        };
    }

    public static final SnapshotIdSet yemenite(SnapshotIdSet snapshotIdSet, long j, long j2) {
        while (Intrinsics.cutely(j, j2) < 0) {
            snapshotIdSet = snapshotIdSet.kowloon(j);
            j += (long) 1;
        }
        return snapshotIdSet;
    }
}
