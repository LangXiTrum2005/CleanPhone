package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.lightstruck;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 22\u00020\u0001:\u0001$B\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH ¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R2\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010*\u001a\u00060\u0002j\u0002`\u00038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00109\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\n\u00107\u0012\u0004\b8\u0010\u000bR$\u0010=\u001a\u00020!2\u0006\u0010*\u001a\u00020!8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b:\u0010#\"\u0004\b;\u0010<R\u0014\u0010?\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u00103R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X¡\u0004¢\u0006\f\u0012\u0004\bB\u0010\u000b\u001a\u0004\b@\u0010AR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X \u0004¢\u0006\u0006\u001a\u0004\bC\u0010A\u0082\u0001\u0004EFGH¨\u0006I"}, d2 = {"Landroidx/compose/runtime/snapshots/formularize;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "", "wireman", "()V", "Lkotlin/Function1;", "readObserver", "rotuma", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/formularize;", "formularize", "()Landroidx/compose/runtime/snapshots/formularize;", "snapshot", "molybdenite", "(Landroidx/compose/runtime/snapshots/formularize;)V", "impassible", "triweekly", "Landroidx/compose/runtime/snapshots/polder;", "state", "arytenoidectomy", "(Landroidx/compose/runtime/snapshots/polder;)V", "kowloon", "saneness", "dern", "polloi", "cord", "monoploid", "", "preprohormone", "()I", "attabal", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "beachfront", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "adultoid", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "value", "J", "taiyuan", "()J", "dovishness", "(J)V", "", "Z", "marial", "()Z", "graveside", "(Z)V", "disposed", "I", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "cutely", "gintrap", "(I)V", "writeCount", "impromptu", "readOnly", "competently", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "apical", "writeObserver", "Landroidx/compose/runtime/snapshots/wireman;", "Landroidx/compose/runtime/snapshots/beachfront;", "Landroidx/compose/runtime/snapshots/taiyuan;", "Landroidx/compose/runtime/snapshots/hydrovane;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public SnapshotIdSet invalid;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean disposed;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public long snapshotId;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int pinningTrackingHandle;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f6189beachfront = 8;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.formularize$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJQ\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u00020\u001a2\u001e\u0010\u0015\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001a2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010\u0003R\u0011\u0010#\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u00108@X\u0081\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0003\u001a\u0004\b(\u0010\"¨\u0006+"}, d2 = {"Landroidx/compose/runtime/snapshots/formularize$attabal;", "", "<init>", "()V", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "Landroidx/compose/runtime/snapshots/wireman;", "kowloon", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/wireman;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "block", "impromptu", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/formularize;", "previous", "beachfront", "(Landroidx/compose/runtime/snapshots/formularize;)Landroidx/compose/runtime/snapshots/formularize;", "nonObservable", "observer", "impassible", "(Landroidx/compose/runtime/snapshots/formularize;Landroidx/compose/runtime/snapshots/formularize;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/competently;", "taiyuan", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/competently;", "apical", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/competently;", "competently", "triweekly", "dern", "()Landroidx/compose/runtime/snapshots/formularize;", "current", "", "marial", "()Z", "isInSnapshot", "wireman", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void cutely(Function2 function2) {
            synchronized (adultoid.privatdozent()) {
                adultoid.f6175taiyuan = CollectionsKt.monroe(adultoid.f6175taiyuan, function2);
                Unit unit = Unit.f29295attabal;
            }
        }

        public static final void formularize(Function1 function1) {
            synchronized (adultoid.privatdozent()) {
                adultoid.f6168cutely = CollectionsKt.monroe(adultoid.f6168cutely, function1);
                Unit unit = Unit.f29295attabal;
            }
            adultoid.kattegat();
        }

        public final competently apical(final Function1<Object, Unit> observer) {
            synchronized (adultoid.privatdozent()) {
                adultoid.f6168cutely = CollectionsKt.claque(adultoid.f6168cutely, observer);
                Unit unit = Unit.f29295attabal;
            }
            adultoid.kattegat();
            return new competently() { // from class: androidx.compose.runtime.snapshots.cutely
                @Override // androidx.compose.runtime.snapshots.competently
                public final void attabal() {
                    formularize.Companion.formularize(observer);
                }
            };
        }

        public final formularize beachfront(formularize previous) {
            if (previous instanceof starveling) {
                starveling starvelingVar = (starveling) previous;
                if (starvelingVar.getThreadId() == cuirassed.monoploid.attabal()) {
                    starvelingVar.dent(null);
                    return previous;
                }
            }
            if (previous instanceof hydrovane) {
                hydrovane hydrovaneVar = (hydrovane) previous;
                if (hydrovaneVar.trm() == cuirassed.monoploid.attabal()) {
                    hydrovaneVar.sealless(null);
                    return previous;
                }
            }
            formularize formularizeVarMerc = adultoid.merc(previous, null, false, 6, null);
            formularizeVarMerc.formularize();
            return formularizeVarMerc;
        }

        public final void competently() {
            adultoid.grimness().kowloon();
        }

        public final formularize dern() {
            return adultoid.grimness();
        }

        public final void impassible(formularize previous, formularize nonObservable, Function1<Object, Unit> observer) {
            if (previous != nonObservable) {
                nonObservable.molybdenite(previous);
                nonObservable.wireman();
            } else if (previous instanceof starveling) {
                ((starveling) previous).dent(observer);
            } else {
                if (previous instanceof hydrovane) {
                    ((hydrovane) previous).sealless(observer);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final <T> T impromptu(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver, Function0<? extends T> block) {
            formularize starvelingVar;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            formularize formularizeVar = (formularize) adultoid.f6169dern.attabal();
            if (formularizeVar instanceof starveling) {
                starveling starvelingVar2 = (starveling) formularizeVar;
                if (starvelingVar2.getThreadId() == cuirassed.monoploid.attabal()) {
                    Function1<Object, Unit> function1Supplicat = starvelingVar2.competently();
                    Function1<Object, Unit> function1Apical = starvelingVar2.apical();
                    try {
                        ((starveling) formularizeVar).dent(adultoid.starveling(readObserver, function1Supplicat, false, 4, null));
                        ((starveling) formularizeVar).permissivist(adultoid.walach(writeObserver, function1Apical));
                        return block.invoke();
                    } finally {
                        starvelingVar2.dent(function1Supplicat);
                        starvelingVar2.permissivist(function1Apical);
                    }
                }
            }
            if (formularizeVar == null || (formularizeVar instanceof wireman)) {
                starvelingVar = new starveling(formularizeVar instanceof wireman ? (wireman) formularizeVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                starvelingVar = formularizeVar.rotuma(readObserver);
            }
            try {
                formularize formularizeVarFormularize = starvelingVar.formularize();
                try {
                    T tInvoke = block.invoke();
                    starvelingVar.molybdenite(formularizeVarFormularize);
                    starvelingVar.wireman();
                    return tInvoke;
                } catch (Throwable th) {
                    starvelingVar.molybdenite(formularizeVarFormularize);
                    throw th;
                }
            } catch (Throwable th2) {
                starvelingVar.wireman();
                throw th2;
            }
        }

        public final wireman kowloon(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
            wireman wiremanVarHydrovane;
            formularize formularizeVarGrimness = adultoid.grimness();
            wireman wiremanVar = formularizeVarGrimness instanceof wireman ? (wireman) formularizeVarGrimness : null;
            if (wiremanVar == null || (wiremanVarHydrovane = wiremanVar.hydrovane(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return wiremanVarHydrovane;
        }

        public final boolean marial() {
            return adultoid.f6169dern.attabal() != null;
        }

        public final competently taiyuan(final Function2<? super Set<? extends Object>, ? super formularize, Unit> observer) {
            adultoid.sealless(adultoid.f6165attabal);
            synchronized (adultoid.privatdozent()) {
                adultoid.f6175taiyuan = CollectionsKt.claque(adultoid.f6175taiyuan, observer);
                Unit unit = Unit.f29295attabal;
            }
            return new competently() { // from class: androidx.compose.runtime.snapshots.apical
                @Override // androidx.compose.runtime.snapshots.competently
                public final void attabal() {
                    formularize.Companion.cutely(observer);
                }
            };
        }

        public final void triweekly() {
            boolean zRestrictive;
            synchronized (adultoid.privatdozent()) {
                zRestrictive = adultoid.f6164apical.restrictive();
            }
            if (zRestrictive) {
                adultoid.kattegat();
            }
        }

        public final formularize wireman() {
            return (formularize) adultoid.f6169dern.attabal();
        }

        public Companion() {
        }
    }

    public /* synthetic */ formularize(long j, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, snapshotIdSet);
    }

    public void adultoid(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public abstract Function1<Object, Unit> apical();

    public abstract void arytenoidectomy(polder state);

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    public abstract Function1<Object, Unit> competently();

    public final void cord() {
        if (this.disposed) {
            lightstruck.attabal("Cannot use a disposed snapshot");
        }
    }

    public int cutely() {
        return 0;
    }

    public void dern() {
        adultoid.f6173marial = adultoid.f6173marial.taiyuan(getSnapshotId());
    }

    public void dovishness(long j) {
        this.snapshotId = j;
    }

    public formularize formularize() {
        formularize formularizeVar = (formularize) adultoid.f6169dern.attabal();
        adultoid.f6169dern.saneness(this);
        return formularizeVar;
    }

    public void gintrap(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public final void graveside(boolean z) {
        this.disposed = z;
    }

    public abstract void impassible(formularize snapshot);

    public abstract boolean impromptu();

    public abstract void kowloon();

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public void molybdenite(formularize snapshot) {
        adultoid.f6169dern.saneness(snapshot);
    }

    public final void monoploid() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            adultoid.itchy(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void polloi() {
        monoploid();
    }

    public final int preprohormone() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    public abstract formularize rotuma(Function1<Object, Unit> readObserver);

    public final void saneness() {
        synchronized (adultoid.privatdozent()) {
            dern();
            polloi();
            Unit unit = Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public long getSnapshotId() {
        return this.snapshotId;
    }

    public abstract void triweekly(formularize snapshot);

    public void wireman() {
        this.disposed = true;
        synchronized (adultoid.privatdozent()) {
            monoploid();
            Unit unit = Unit.f29295attabal;
        }
    }

    public formularize(long j, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j;
        this.pinningTrackingHandle = j != adultoid.f6174saneness ? adultoid.sayid(j, getInvalid()) : -1;
    }
}
