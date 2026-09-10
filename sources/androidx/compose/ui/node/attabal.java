package androidx.compose.ui.node;

import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/attabal;", "Landroidx/compose/ui/layout/triweekly;", "", "molybdenite", "()V", "", "Landroidx/compose/ui/layout/attabal;", "", "wireman", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "grimness", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "hydrovane", "", "attabal", "()Z", "isPlaced", "Landroidx/compose/ui/node/NodeCoordinator;", "cuirassed", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/AlignmentLines;", "saneness", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "formularize", "()Landroidx/compose/ui/node/attabal;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface attabal extends androidx.compose.ui.layout.triweekly {
    /* JADX INFO: renamed from: attabal */
    boolean getIsPlaced();

    NodeCoordinator cuirassed();

    attabal formularize();

    void grimness(Function1<? super attabal, Unit> block);

    void hydrovane();

    void molybdenite();

    void requestLayout();

    /* JADX INFO: renamed from: saneness */
    AlignmentLines getAlignmentLines();

    Map<androidx.compose.ui.layout.attabal, Integer> wireman();
}
