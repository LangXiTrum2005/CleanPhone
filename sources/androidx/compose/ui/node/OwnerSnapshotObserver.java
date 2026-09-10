package androidx.compose.ui.node;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0017\u001a\u00020\u0004\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001aR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\"¨\u0006-"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "block", "marial", "(Landroidx/compose/ui/node/LayoutNode;ZLkotlin/jvm/functions/Function0;)V", "dern", "competently", "cutely", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/node/mathsort;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "target", "onChanged", "taiyuan", "(Landroidx/compose/ui/node/mathsort;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "saneness", "()V", "attabal", "(Ljava/lang/Object;)V", "apical", "formularize", "Landroidx/compose/runtime/snapshots/yemenite;", "Landroidx/compose/runtime/snapshots/yemenite;", "observer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", "wireman", "onCommitAffectingSemantics", "onCommitAffectingLayout", "beachfront", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "impromptu", "onCommitAffectingLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OwnerSnapshotObserver {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int f6974taiyuan = androidx.compose.runtime.snapshots.yemenite.f6271formularize;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.snapshots.yemenite observer;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Function1<LayoutNode, Unit> onCommitAffectingLookaheadMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.oilcan()) {
                LayoutNode.prefect(layoutNode, false, false, false, 7, null);
            }
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Function1<LayoutNode, Unit> onCommitAffectingMeasure = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.oilcan()) {
                LayoutNode.fastrack(layoutNode, false, false, false, 7, null);
            }
        }
    };

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Function1<LayoutNode, Unit> onCommitAffectingSemantics = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.oilcan()) {
                layoutNode.igbo();
            }
        }
    };

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Function1<LayoutNode, Unit> onCommitAffectingLayout = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.oilcan()) {
                LayoutNode.licking(layoutNode, false, 1, null);
            }
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifier = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.oilcan()) {
                LayoutNode.licking(layoutNode, false, 1, null);
            }
        }
    };

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Function1<LayoutNode, Unit> onCommitAffectingLayoutModifierInLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.oilcan()) {
                LayoutNode.basify(layoutNode, false, 1, null);
            }
        }
    };

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final Function1<LayoutNode, Unit> onCommitAffectingLookahead = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.oilcan()) {
                LayoutNode.basify(layoutNode, false, 1, null);
            }
        }
    };

    public OwnerSnapshotObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.observer = new androidx.compose.runtime.snapshots.yemenite(function1);
    }

    public static /* synthetic */ void beachfront(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.marial(layoutNode, z, function0);
    }

    public static /* synthetic */ void impromptu(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.competently(layoutNode, z, function0);
    }

    public static /* synthetic */ void wireman(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.dern(layoutNode, z, function0);
    }

    public final void apical() {
        this.observer.monoploid();
    }

    public final void attabal(Object target) {
        this.observer.competently(target);
    }

    public final void competently(LayoutNode node, boolean affectsLookahead, Function0<Unit> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            taiyuan(node, this.onCommitAffectingMeasure, block);
        } else {
            taiyuan(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final void cutely(LayoutNode node, Function0<Unit> block) {
        taiyuan(node, this.onCommitAffectingSemantics, block);
    }

    public final void dern(LayoutNode node, boolean affectsLookahead, Function0<Unit> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            taiyuan(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            taiyuan(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void formularize() {
        this.observer.polloi();
        this.observer.beachfront();
    }

    public final void marial(LayoutNode node, boolean affectsLookahead, Function0<Unit> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            taiyuan(node, this.onCommitAffectingLayout, block);
        } else {
            taiyuan(node, this.onCommitAffectingLookahead, block);
        }
    }

    public final void saneness() {
        this.observer.impromptu(new Function1<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((mathsort) obj).oilcan());
            }
        });
    }

    public final <T extends mathsort> void taiyuan(T target, Function1<? super T, Unit> onChanged, Function0<Unit> block) {
        this.observer.apical(target, onChanged, block);
    }
}
