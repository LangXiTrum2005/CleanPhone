package androidx.compose.ui.node;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "", "marial", "(Landroidx/compose/ui/node/BackwardsCompatNode;)Z", "androidx/compose/ui/node/BackwardsCompatNodeKt$attabal", "attabal", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$attabal;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "", "saneness", "Lkotlin/jvm/functions/Function1;", "onDrawCacheReadsChanged", "dern", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackwardsCompatNodeKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f6794attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Function1<BackwardsCompatNode, Unit> f6796saneness = new Function1<BackwardsCompatNode, Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.gusty();
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Function1<BackwardsCompatNode, Unit> f6795dern = new Function1<BackwardsCompatNode, Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.monroe();
        }
    };

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNodeKt$attabal", "Landroidx/compose/ui/modifier/cutely;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements androidx.compose.ui.modifier.cutely {
    }

    public static final boolean marial(BackwardsCompatNode backwardsCompatNode) {
        androidx.compose.ui.attabal.dern tail = beachfront.impromptu(backwardsCompatNode).getNodes().getTail();
        Intrinsics.competently(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((treadless) tail).getAttachHasBeenRun();
    }
}
