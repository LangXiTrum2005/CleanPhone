package androidx.p001lifecycle;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import impassible.attabal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.gintrap;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0002%\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010&R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u001304j\b\u0012\u0004\u0012\u00020\u0013`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0013088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010>\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010<\"\u0004\b=\u0010\u0016R\u0014\u0010@\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010?¨\u0006A"}, d2 = {"Landroidx/lifecycle/polloi;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/arytenoidectomy;", IronSourceConstants.EVENTS_PROVIDER, "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/arytenoidectomy;Z)V", "(Landroidx/lifecycle/arytenoidectomy;)V", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "taiyuan", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/kowloon;", "observer", "attabal", "(Landroidx/lifecycle/kowloon;)V", "wireman", "Landroidx/lifecycle/Lifecycle$State;", "next", "apical", "(Landroidx/lifecycle/Lifecycle$State;)V", "beachfront", "(Landroidx/lifecycle/kowloon;)Landroidx/lifecycle/Lifecycle$State;", "formularize", "()V", "state", "impassible", "lifecycleOwner", "impromptu", "marial", "kowloon", "", "methodName", "competently", "(Ljava/lang/String;)V", "saneness", "Z", "Limpassible/attabal;", "Landroidx/lifecycle/polloi$saneness;", "dern", "Limpassible/attabal;", "observerMap", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Lkotlinx/coroutines/flow/formularize;", "cutely", "Lkotlinx/coroutines/flow/formularize;", "_currentStateFlow", "()Landroidx/lifecycle/Lifecycle$State;", "triweekly", "currentState", "()Z", "isSynced", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class polloi extends Lifecycle {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int addingObserverCounter;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean handlingEvent;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final formularize<Lifecycle.State> _currentStateFlow;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public attabal<kowloon, saneness> observerMap;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean newEventOccurred;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final WeakReference<arytenoidectomy> lifecycleOwner;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean enforceMainThread;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public ArrayList<Lifecycle.State> parentStates;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Lifecycle.State state;

    /* JADX INFO: renamed from: androidx.lifecycle.polloi$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/polloi$attabal;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "attabal", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Lifecycle.State attabal(Lifecycle.State state1, Lifecycle.State state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/polloi$saneness;", "", "Landroidx/lifecycle/kowloon;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", "<init>", "(Landroidx/lifecycle/kowloon;Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/arytenoidectomy;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "attabal", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle$State;", "saneness", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "state", "Landroidx/lifecycle/impassible;", "Landroidx/lifecycle/impassible;", "getLifecycleObserver", "()Landroidx/lifecycle/impassible;", "setLifecycleObserver", "(Landroidx/lifecycle/impassible;)V", "lifecycleObserver", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public Lifecycle.State state;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public impassible lifecycleObserver;

        public saneness(kowloon kowloonVar, Lifecycle.State initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.beachfront(kowloonVar);
            this.lifecycleObserver = dovishness.beachfront(kowloonVar);
            this.state = initialState;
        }

        public final void attabal(arytenoidectomy owner, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.state = polloi.INSTANCE.attabal(this.state, targetState);
            impassible impassibleVar = this.lifecycleObserver;
            Intrinsics.beachfront(owner);
            impassibleVar.onStateChanged(owner, event);
            this.state = targetState;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final Lifecycle.State getState() {
            return this.state;
        }
    }

    public polloi(arytenoidectomy arytenoidectomyVar, boolean z) {
        this.enforceMainThread = z;
        this.observerMap = new attabal<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(arytenoidectomyVar);
        this._currentStateFlow = gintrap.attabal(state);
    }

    public final void apical(Lifecycle.State next) {
        if (this.state == next) {
            return;
        }
        molybdenite.attabal(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        kowloon();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new attabal<>();
        }
    }

    @Override // androidx.p001lifecycle.Lifecycle
    public void attabal(kowloon observer) {
        arytenoidectomy arytenoidectomyVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        competently("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        saneness sanenessVar = new saneness(observer, state2);
        if (this.observerMap.competently(observer, sanenessVar) == null && (arytenoidectomyVar = this.lifecycleOwner.get()) != null) {
            boolean z = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateBeachfront = beachfront(observer);
            this.addingObserverCounter++;
            while (sanenessVar.getState().compareTo(stateBeachfront) < 0 && this.observerMap.contains(observer)) {
                impassible(sanenessVar.getState());
                Lifecycle.Event eventDern = Lifecycle.Event.INSTANCE.dern(sanenessVar.getState());
                if (eventDern == null) {
                    throw new IllegalStateException("no event up from " + sanenessVar.getState());
                }
                sanenessVar.attabal(arytenoidectomyVar, eventDern);
                formularize();
                stateBeachfront = beachfront(observer);
            }
            if (!z) {
                kowloon();
            }
            this.addingObserverCounter--;
        }
    }

    public final Lifecycle.State beachfront(kowloon observer) {
        saneness value;
        Map.Entry<kowloon, saneness> entryTaiyuan = this.observerMap.taiyuan(observer);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryTaiyuan == null || (value = entryTaiyuan.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.parentStates;
            state = arrayList.get(arrayList.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.attabal(companion.attabal(this.state, state2), state);
    }

    public final void competently(String methodName) {
        if (!this.enforceMainThread || adultoid.attabal()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    public final boolean cutely() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<kowloon, saneness> entrySaneness = this.observerMap.saneness();
        Intrinsics.beachfront(entrySaneness);
        Lifecycle.State state = entrySaneness.getValue().getState();
        Map.Entry<kowloon, saneness> entryMarial = this.observerMap.marial();
        Intrinsics.beachfront(entryMarial);
        Lifecycle.State state2 = entryMarial.getValue().getState();
        return state == state2 && this.state == state2;
    }

    public final void formularize() {
        ArrayList<Lifecycle.State> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void impassible(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    public final void impromptu(arytenoidectomy lifecycleOwner) {
        impassible.saneness<kowloon, saneness>.wireman wiremanVarWireman = this.observerMap.wireman();
        Intrinsics.checkNotNullExpressionValue(wiremanVarWireman, "iteratorWithAdditions(...)");
        while (wiremanVarWireman.hasNext() && !this.newEventOccurred) {
            Map.Entry next = wiremanVarWireman.next();
            kowloon kowloonVar = (kowloon) next.getKey();
            saneness sanenessVar = (saneness) next.getValue();
            while (sanenessVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(kowloonVar)) {
                impassible(sanenessVar.getState());
                Lifecycle.Event eventDern = Lifecycle.Event.INSTANCE.dern(sanenessVar.getState());
                if (eventDern == null) {
                    throw new IllegalStateException("no event up from " + sanenessVar.getState());
                }
                sanenessVar.attabal(lifecycleOwner, eventDern);
                formularize();
            }
        }
    }

    public final void kowloon() {
        arytenoidectomy arytenoidectomyVar = this.lifecycleOwner.get();
        if (arytenoidectomyVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!cutely()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            Map.Entry<kowloon, saneness> entrySaneness = this.observerMap.saneness();
            Intrinsics.beachfront(entrySaneness);
            if (state.compareTo(entrySaneness.getValue().getState()) < 0) {
                marial(arytenoidectomyVar);
            }
            Map.Entry<kowloon, saneness> entryMarial = this.observerMap.marial();
            if (!this.newEventOccurred && entryMarial != null && this.state.compareTo(entryMarial.getValue().getState()) > 0) {
                impromptu(arytenoidectomyVar);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    public final void marial(arytenoidectomy lifecycleOwner) {
        Iterator<Map.Entry<kowloon, saneness>> itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<kowloon, saneness> next = itDescendingIterator.next();
            Intrinsics.beachfront(next);
            kowloon key = next.getKey();
            saneness value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.Event eventAttabal = Lifecycle.Event.INSTANCE.attabal(value.getState());
                if (eventAttabal == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                impassible(eventAttabal.getTargetState());
                value.attabal(lifecycleOwner, eventAttabal);
                formularize();
            }
        }
    }

    @Override // androidx.p001lifecycle.Lifecycle
    /* JADX INFO: renamed from: saneness, reason: from getter */
    public Lifecycle.State getState() {
        return this.state;
    }

    public void taiyuan(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        competently("handleLifecycleEvent");
        apical(event.getTargetState());
    }

    public void triweekly(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        competently("setCurrentState");
        apical(state);
    }

    @Override // androidx.p001lifecycle.Lifecycle
    public void wireman(kowloon observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        competently("removeObserver");
        this.observerMap.impromptu(observer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public polloi(arytenoidectomy provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
