package androidx.compose.ui.node;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ObserverModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/mathsort;", "Landroidx/compose/ui/node/creditor;", "observerNode", "<init>", "(Landroidx/compose/ui/node/creditor;)V", "kowloon", "Landroidx/compose/ui/node/creditor;", "saneness", "()Landroidx/compose/ui/node/creditor;", "", "oilcan", "()Z", "isValidOwnerScope", "arytenoidectomy", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ObserverNodeOwnerScope implements mathsort {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int f6971monoploid = 8;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final Function1<ObserverNodeOwnerScope, Unit> f6972polloi = new Function1<ObserverNodeOwnerScope, Unit>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            invoke2(observerNodeOwnerScope);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.oilcan()) {
                observerNodeOwnerScope.getObserverNode().molybdenite();
            }
        }
    };

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final creditor observerNode;

    /* JADX INFO: renamed from: androidx.compose.ui.node.ObserverNodeOwnerScope$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$attabal;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", "attabal", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1<ObserverNodeOwnerScope, Unit> attabal() {
            return ObserverNodeOwnerScope.f6972polloi;
        }

        public Companion() {
        }
    }

    public ObserverNodeOwnerScope(creditor creditorVar) {
        this.observerNode = creditorVar;
    }

    @Override // androidx.compose.ui.node.mathsort
    public boolean oilcan() {
        return this.observerNode.getNode().getIsAttached();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final creditor getObserverNode() {
        return this.observerNode;
    }
}
