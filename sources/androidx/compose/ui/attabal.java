package androidx.compose.ui;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import androidx.compose.ui.node.beachfront;
import androidx.compose.ui.node.marial;
import com.ironsource.C3414a2;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/attabal;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/attabal$saneness;", "operation", "wireman", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "marial", "(Lkotlin/jvm/functions/Function1;)Z", C3414a2.d, "impassible", "(Landroidx/compose/ui/attabal;)Landroidx/compose/ui/attabal;", "attabal", "saneness", "dern", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6341saneness;

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/attabal$saneness;", "Landroidx/compose/ui/attabal;", "R", "initial", "Lkotlin/Function2;", "operation", "wireman", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "marial", "(Lkotlin/jvm/functions/Function1;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface saneness extends attabal {
        @Override // androidx.compose.ui.attabal
        default boolean marial(Function1<? super saneness, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.attabal
        default <R> R wireman(R initial, Function2<? super R, ? super saneness, ? extends R> operation) {
            return operation.invoke(initial, this);
        }
    }

    default attabal impassible(attabal other) {
        return other == INSTANCE ? this : new CombinedModifier(this, other);
    }

    boolean marial(Function1<? super saneness, Boolean> predicate);

    <R> R wireman(R initial, Function2<? super R, ? super saneness, ? extends R> operation);

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010*\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010/\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010.R$\u00103\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010.R$\u0010;\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\u0016\u0010M\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010BR\u0016\u0010O\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010BR$\u0010R\u001a\u00020@2\u0006\u0010\u0015\u001a\u00020@8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010DR\u001a\u0010U\u001a\u00020@8VX\u0096\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0003\u001a\u0004\bS\u0010D¨\u0006V"}, d2 = {"Landroidx/compose/ui/attabal$dern;", "Landroidx/compose/ui/node/marial;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "sensatory", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "dent", "treadless", "itchy", "permissivist", "milliradian", "cultivated", "premeiotic", "timberyard", "Lkotlin/Function0;", "effect", "czestochowa", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "kowloon", "Landroidx/compose/ui/attabal$dern;", "polloi", "()Landroidx/compose/ui/attabal$dern;", "getNode$annotations", "node", "Lkotlinx/coroutines/saran;", "arytenoidectomy", "Lkotlinx/coroutines/saran;", "scope", "", "monoploid", "I", "walach", "()I", "lotta", "(I)V", "kindSet", "privatdozent", "coffeecake", "aggregateChildKindSet", "molybdenite", "mathsort", "empress", "(Landroidx/compose/ui/attabal$dern;)V", "parent", "graveside", "creditor", "lerp", "child", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "adultoid", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "peridotite", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "sayid", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "ownerScope", "dovishness", "Landroidx/compose/ui/node/NodeCoordinator;", "starveling", "()Landroidx/compose/ui/node/NodeCoordinator;", "", "gintrap", "Z", "hydrovane", "()Z", "nosophobia", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "rotuma", "overspeculate", "coi", "updatedNodeAwaitingAttachForInvalidation", "preprohormone", "onAttachRunExpected", "cord", "onDetachRunExpected", "cuirassed", "clubfoot", "isAttached", "splinterproof", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class dern implements marial {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
        public ObserverNodeOwnerScope ownerScope;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public saran scope;

        /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
        public boolean onDetachRunExpected;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
        public boolean isAttached;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
        public NodeCoordinator coordinator;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
        public boolean insertedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public dern child;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public dern parent;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public int kindSet;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
        public boolean onAttachRunExpected;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public boolean updatedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public dern node = this;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public int aggregateChildKindSet = -1;

        /* JADX INFO: renamed from: clubfoot, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public final void coffeecake(int i) {
            this.aggregateChildKindSet = i;
        }

        public final void coi(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        /* JADX INFO: renamed from: creditor, reason: from getter */
        public final dern getChild() {
            return this.child;
        }

        public final void czestochowa(Function0<Unit> effect) {
            beachfront.taiyuan(this).adultoid(effect);
        }

        public void dent() {
            if (this.isAttached) {
                peridotite.attabal.saneness("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                peridotite.attabal.saneness("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public final void empress(dern dernVar) {
            this.parent = dernVar;
        }

        /* JADX INFO: renamed from: hydrovane, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public void itchy() {
            if (!this.isAttached) {
                peridotite.attabal.saneness("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                peridotite.attabal.saneness("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                peridotite.attabal.saneness("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            premeiotic();
        }

        public final void lerp(dern dernVar) {
            this.child = dernVar;
        }

        public final void lotta(int i) {
            this.kindSet = i;
        }

        /* JADX INFO: renamed from: mathsort, reason: from getter */
        public final dern getParent() {
            return this.parent;
        }

        public void milliradian() {
            if (!this.isAttached) {
                peridotite.attabal.saneness("reset() called on an unattached node");
            }
            timberyard();
        }

        public final void nosophobia(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        /* JADX INFO: renamed from: overspeculate, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: peridotite, reason: from getter */
        public final ObserverNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        public void permissivist() {
            if (!this.isAttached) {
                peridotite.attabal.saneness("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                peridotite.attabal.saneness("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                peridotite.attabal.saneness("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            saran saranVar = this.scope;
            if (saranVar != null) {
                privatdozent.dern(saranVar, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        @Override // androidx.compose.ui.node.marial
        /* JADX INFO: renamed from: polloi, reason: from getter */
        public final dern getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: privatdozent, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        public final void sayid(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public void sensatory(NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        public boolean splinterproof() {
            return true;
        }

        /* JADX INFO: renamed from: starveling, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        public void treadless() {
            if (!this.isAttached) {
                peridotite.attabal.saneness("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                peridotite.attabal.saneness("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            cultivated();
            this.onDetachRunExpected = true;
        }

        /* JADX INFO: renamed from: walach, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        public void cultivated() {
        }

        public void premeiotic() {
        }

        public void timberyard() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/attabal$attabal;", "Landroidx/compose/ui/attabal;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/attabal$saneness;", "operation", "wireman", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "marial", "(Lkotlin/jvm/functions/Function1;)Z", C3414a2.d, "impassible", "(Landroidx/compose/ui/attabal;)Landroidx/compose/ui/attabal;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements attabal {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ Companion f6341saneness = new Companion();

        @Override // androidx.compose.ui.attabal
        public boolean marial(Function1<? super saneness, Boolean> predicate) {
            return true;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.attabal
        public attabal impassible(attabal other) {
            return other;
        }

        @Override // androidx.compose.ui.attabal
        public <R> R wireman(R initial, Function2<? super R, ? super saneness, ? extends R> operation) {
            return initial;
        }
    }
}
