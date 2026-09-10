package androidx.compose.runtime.snapshots;

import java.util.List;
import java.util.Map;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0011\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/saneness;", "Landroidx/compose/runtime/snapshots/wireman;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Lkotlin/Function1;", "", "", "readObserver", "Landroidx/compose/runtime/snapshots/formularize;", "rotuma", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/formularize;", "writeObserver", "hydrovane", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/wireman;", "kowloon", "()V", "snapshot", "", "clubfoot", "(Landroidx/compose/runtime/snapshots/formularize;)Ljava/lang/Void;", "overspeculate", "Landroidx/compose/runtime/snapshots/impassible;", "trm", "()Landroidx/compose/runtime/snapshots/impassible;", "wireman", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness extends wireman {

    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Function1<SnapshotIdSet, wireman> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f6231arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f6232kowloon;

        public attabal(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            this.f6232kowloon = function1;
            this.f6231arytenoidectomy = function2;
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public final wireman invoke(SnapshotIdSet snapshotIdSet) {
            long j;
            synchronized (adultoid.privatdozent()) {
                j = adultoid.f6166beachfront;
                adultoid.f6166beachfront += (long) 1;
            }
            return new wireman(j, snapshotIdSet, this.f6232kowloon, this.f6231arytenoidectomy);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C0039saneness implements Function1<SnapshotIdSet, taiyuan> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f6233kowloon;

        public C0039saneness(Function1<Object, Unit> function1) {
            this.f6233kowloon = function1;
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public final taiyuan invoke(SnapshotIdSet snapshotIdSet) {
            long j;
            synchronized (adultoid.privatdozent()) {
                j = adultoid.f6166beachfront;
                adultoid.f6166beachfront += (long) 1;
            }
            return new taiyuan(j, snapshotIdSet, this.f6233kowloon);
        }
    }

    public saneness(long j, SnapshotIdSet snapshotIdSet) {
        super(j, snapshotIdSet, null, new Function1() { // from class: androidx.compose.runtime.snapshots.attabal
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return saneness.splinterproof(obj);
            }
        });
    }

    public static final Unit splinterproof(Object obj) {
        synchronized (adultoid.privatdozent()) {
            List list = adultoid.f6168cutely;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Function1) list.get(i)).invoke(obj);
            }
        }
        return Unit.f29295attabal;
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: clubfoot, reason: merged with bridge method [inline-methods] */
    public Void triweekly(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.wireman
    public wireman hydrovane(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Function1<Object, Unit> function1;
        Map<trm.saneness, trm.attabal> second;
        dovishness.marial marialVar = trm.wireman.f38993attabal;
        if (marialVar != null) {
            Pair<trm.attabal, Map<trm.saneness, trm.attabal>> pairBeachfront = trm.wireman.beachfront(marialVar, null, false, readObserver, writeObserver);
            trm.attabal first = pairBeachfront.getFirst();
            Function1<Object, Unit> function1Attabal = first.attabal();
            Function1<Object, Unit> function1Saneness = first.saneness();
            second = pairBeachfront.getSecond();
            readObserver = function1Attabal;
            function1 = function1Saneness;
        } else {
            function1 = writeObserver;
            second = null;
        }
        wireman wiremanVar = (wireman) adultoid.nosophobia(new attabal(readObserver, function1));
        if (marialVar != null) {
            trm.wireman.dern(marialVar, null, wiremanVar, second);
        }
        return wiremanVar;
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public void kowloon() {
        adultoid.kattegat();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    /* JADX INFO: renamed from: overspeculate, reason: merged with bridge method [inline-methods] */
    public Void impassible(formularize snapshot) {
        cuirassed.attabal();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public formularize rotuma(Function1<Object, Unit> readObserver) {
        Map<trm.saneness, trm.attabal> second;
        dovishness.marial marialVar = trm.wireman.f38993attabal;
        if (marialVar != null) {
            Pair<trm.attabal, Map<trm.saneness, trm.attabal>> pairBeachfront = trm.wireman.beachfront(marialVar, null, true, readObserver, null);
            trm.attabal first = pairBeachfront.getFirst();
            Function1<Object, Unit> function1Attabal = first.attabal();
            first.saneness();
            second = pairBeachfront.getSecond();
            readObserver = function1Attabal;
        } else {
            second = null;
        }
        taiyuan taiyuanVar = (taiyuan) adultoid.nosophobia(new C0039saneness(readObserver));
        if (marialVar != null) {
            trm.wireman.dern(marialVar, null, taiyuanVar, second);
        }
        return taiyuanVar;
    }

    @Override // androidx.compose.runtime.snapshots.wireman
    public impassible trm() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.wireman, androidx.compose.runtime.snapshots.formularize
    public void wireman() {
        synchronized (adultoid.privatdozent()) {
            monoploid();
            Unit unit = Unit.f29295attabal;
        }
    }
}
