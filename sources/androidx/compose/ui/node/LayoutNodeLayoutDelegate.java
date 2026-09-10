package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002yzB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001cR$\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001eR$\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0016\u00105\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001cR\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R*\u0010A\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010@R*\u0010E\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010@R*\u0010K\u001a\u0002062\u0006\u0010<\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010O\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u001c\u001a\u0004\bM\u0010\u001e\"\u0004\bN\u0010@R*\u0010S\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001c\u001a\u0004\bQ\u0010\u001e\"\u0004\bR\u0010@R*\u0010V\u001a\u0002062\u0006\u0010<\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\bT\u0010H\"\u0004\bU\u0010JR\u001e\u0010\\\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R0\u0010a\u001a\b\u0018\u00010]R\u00020\u00002\f\u0010\u001a\u001a\b\u0018\u00010]R\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\b0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010eR\u0011\u0010j\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0019\u0010m\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0019\u0010o\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0014\u0010q\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bp\u0010HR\u0014\u0010s\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\br\u0010HR\u0014\u0010v\u001a\u00020t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010uR\u0016\u0010x\u001a\u0004\u0018\u00010t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bw\u0010u\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lmilliradian/saneness;", "constraints", "", "mathsort", "(J)V", "peridotite", "privatdozent", "()V", "hydrovane", "creditor", "starveling", "walach", "monoploid", "timberyard", "grimness", "splinterproof", "saran", "attabal", "Landroidx/compose/ui/node/LayoutNode;", "", "<set-?>", "saneness", "Z", "gintrap", "()Z", "detachedFromParentLookaheadPass", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "dern", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "stratoscope", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "wireman", "merc", "measurePending", "marial", "cuirassed", "layoutPending", "beachfront", "layoutPendingForAlignment", "competently", "kattegat", "lookaheadMeasurePending", "impromptu", "sealless", "lookaheadLayoutPending", "taiyuan", "lookaheadLayoutPendingForAlignment", "", "cutely", "I", "nextChildLookaheadPlaceOrder", "apical", "nextChildPlaceOrder", "value", "formularize", "dovishness", "permissivist", "(Z)V", "coordinatesAccessedDuringPlacement", "impassible", "adultoid", "dent", "coordinatesAccessedDuringModifierPlacement", "triweekly", "molybdenite", "()I", "overspeculate", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "kowloon", "yemenite", "premeiotic", "lookaheadCoordinatesAccessedDuringPlacement", "arytenoidectomy", "oilcan", "cultivated", "lookaheadCoordinatesAccessedDuringModifierPlacement", "graveside", "clubfoot", "childrenAccessingLookaheadCoordinatesDuringPlacement", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "polloi", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "restrictive", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "supplicat", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "J", "performMeasureConstraints", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "performMeasureBlock", "Landroidx/compose/ui/node/NodeCoordinator;", "polder", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "preprohormone", "()Lmilliradian/saneness;", "lastConstraints", "cord", "lastLookaheadConstraints", "rotuma", "height", "seminary", "width", "Landroidx/compose/ui/node/attabal;", "()Landroidx/compose/ui/node/attabal;", "alignmentLinesOwner", "trm", "lookaheadAlignmentLinesOwner", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutNodeLayoutDelegate {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public int nextChildPlaceOrder;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean lookaheadCoordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean layoutPendingForAlignment;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean lookaheadMeasurePending;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public int nextChildLookaheadPlaceOrder;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public boolean coordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public boolean coordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean lookaheadLayoutPending;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public boolean lookaheadCoordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean layoutPending;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public LookaheadPassDelegate lookaheadPassDelegate;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int childrenAccessingLookaheadCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean detachedFromParentLookaheadPass;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public boolean lookaheadLayoutPendingForAlignment;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public int childrenAccessingCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean measurePending;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public long performMeasureConstraints = milliradian.dern.saneness(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> performMeasureBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.polder().sealless(this.this$0.performMeasureConstraints);
        }
    };

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJB\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u00072\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\tJ\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\tJ\u001a\u0010+\u001a\u00020\u00012\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)ø\u0001\u0000¢\u0006\u0004\b.\u0010/J8\u00100\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013H\u0014ø\u0001\u0000¢\u0006\u0004\b0\u00101J*\u00102\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020-¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0007¢\u0006\u0004\b7\u0010\tJ\r\u00108\u001a\u00020-¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0004\b:\u0010\tJ\r\u0010;\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\tJ\r\u0010<\u001a\u00020\u0007¢\u0006\u0004\b<\u0010\tR\u0016\u0010?\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010C\u001a\u00020 2\u0006\u0010@\u001a\u00020 8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010I\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010B\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010>\u001a\u0004\bS\u00109\"\u0004\bT\u00106R\"\u0010Y\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010>\u001a\u0004\bW\u00109\"\u0004\bX\u00106R\u0016\u0010[\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010>R\u001e\u0010^\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u0010]R*\u0010c\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u0010h\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR@\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR(\u0010r\u001a\u0004\u0018\u00010\u00162\b\u0010@\u001a\u0004\u0018\u00010\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\"\u0010u\u001a\u00020-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010>\u001a\u0004\bs\u00109\"\u0004\bt\u00106R\u001a\u0010{\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001f\u0010\u0080\u0001\u001a\f\u0012\b\u0012\u00060\u0000R\u00020}0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010>\u001a\u0005\b\u0082\u0001\u00109\"\u0005\b\u0083\u0001\u00106R'\u0010\u0087\u0001\u001a\u00020-2\u0006\u0010@\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010>\u001a\u0005\b\u0086\u0001\u00109R\u0018\u0010\u0089\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010>R/\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010@\u001a\u0005\u0018\u00010\u008a\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R.\u0010\u0091\u0001\u001a\u00020-2\u0007\u0010\u0090\u0001\u001a\u00020-8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b$\u0010>\u001a\u0005\b\u0091\u0001\u00109\"\u0005\b\u0092\u0001\u00106R\u0018\u0010\u0094\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010>R\u001c\u0010\u0098\u0001\u001a\u00070\u0095\u0001R\u00020}8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u009b\u0001\u001a\u0004\u0018\u00010)8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009e\u0001\u001a\u00030\u009c\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\\\u0010\u009d\u0001R\"\u0010¢\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020}0\u009f\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¥\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¦\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/gintrap;", "Landroidx/compose/ui/layout/triweekly;", "Landroidx/compose/ui/node/attabal;", "Landroidx/compose/ui/node/supplicat;", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "lotta", "()V", "palmyra", "Landroidx/compose/ui/node/LayoutNode;", "node", "vesuvio", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lmilliradian/impassible;", X3.i.L, "", "zIndex", "Lkotlin/Function1;", "Lrestrictive/treadless;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "unconsolidated", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "sayid", "picketboat", "monroe", "molybdenite", "", "Landroidx/compose/ui/layout/attabal;", "", "wireman", "()Ljava/util/Map;", "block", "grimness", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "hydrovane", "lightstruck", "Lmilliradian/saneness;", "constraints", "sealless", "(J)Landroidx/compose/ui/layout/gintrap;", "", "claque", "(J)Z", "treadless", "(JFLkotlin/jvm/functions/Function1;)V", "milliradian", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "forceRequest", "igbo", "(Z)V", "gusty", "setterwort", "()Z", "achondroplasia", "hardpan", "julian", "graveside", "Z", "relayoutWithoutParentInProgress", "<set-?>", "adultoid", "I", "previousPlaceOrder", "dovishness", "getPlaceOrder$ui_release", "()I", "outmarry", "(I)V", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "gintrap", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "underbelly", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "technofreak", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "rotuma", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "preprohormone", "wostteth", "setPlacedOnce$ui_release", "placedOnce", "cord", "measuredOnce", "cuirassed", "Lmilliradian/saneness;", "lookaheadConstraints", "stratoscope", "J", "getLastPosition-nOcc-ac$ui_release", "()J", "lastPosition", "trm", "F", "getLastZIndex$ui_release", "()F", "lastZIndex", "oilcan", "Lkotlin/jvm/functions/Function1;", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "yemenite", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getLastExplicitLayer$ui_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "attabal", "dhss", "isPlaced", "Landroidx/compose/ui/node/AlignmentLines;", "kattegat", "Landroidx/compose/ui/node/AlignmentLines;", "saneness", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "supplicat", "Landroidx/compose/runtime/collection/dern;", "_childDelegates", "restrictive", "getChildDelegatesDirty$ui_release", "herdbook", "childDelegatesDirty", "merc", "czestochowa", "layingOutChildren", "polder", "parentDataDirty", "", "seminary", "Ljava/lang/Object;", "preterite", "()Ljava/lang/Object;", "parentData", "new", "isPlacedUnderMotionFrameOfReference", "privatdozent", "saran", "onNodePlacedCalled", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "sensatory", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "coi", "()Lmilliradian/saneness;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "empress", "()Ljava/util/List;", "childDelegates", "formularize", "()Landroidx/compose/ui/node/attabal;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LookaheadPassDelegate extends androidx.compose.ui.layout.gintrap implements androidx.compose.ui.layout.triweekly, androidx.compose.ui.node.attabal, supplicat {

        /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
        public boolean measuredOnce;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
        public milliradian.saneness lookaheadConstraints;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public boolean relayoutWithoutParentInProgress;

        /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
        public boolean isPlacedUnderMotionFrameOfReference;

        /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
        public boolean layingOutChildren;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
        public Function1<? super restrictive.treadless, Unit> lastLayerBlock;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
        public boolean placedOnce;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public boolean duringAlignmentLinesQuery;

        /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
        public boolean onNodePlacedCalled;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
        public boolean isPlaced;

        /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
        public float lastZIndex;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
        public GraphicsLayer lastExplicitLayer;

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
        public int previousPlaceOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
        public int placeOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
        public LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
        public long lastPosition = milliradian.impassible.INSTANCE.attabal();

        /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
        public final AlignmentLines alignmentLines = new oilcan(this);

        /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
        public final androidx.compose.runtime.collection.dern<LookaheadPassDelegate> _childDelegates = new androidx.compose.runtime.collection.dern<>(new LookaheadPassDelegate[16], 0);

        /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
        public boolean childDelegatesDirty = true;

        /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
        public boolean parentDataDirty = true;

        /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
        public Object parentData = sensatory().getParentData();

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f6888attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public static final /* synthetic */ int[] f6889saneness;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f6888attabal = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f6889saneness = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        private final void unconsolidated(final long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock, GraphicsLayer layer) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                peridotite.attabal.attabal("place is called on a deactivated node");
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!milliradian.impassible.dern(position, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getLookaheadCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                }
                lightstruck();
            }
            final peridotite peridotiteVarSaneness = cuirassed.saneness(LayoutNodeLayoutDelegate.this.layoutNode);
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending() || !getIsPlaced()) {
                LayoutNodeLayoutDelegate.this.cultivated(false);
                getAlignmentLines().polloi(false);
                OwnerSnapshotObserver snapshotObserver = peridotiteVarSaneness.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.wireman(snapshotObserver, layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        yemenite lookaheadDelegate;
                        androidx.compose.ui.layout.gintrap.attabal placementScope = null;
                        if (stratoscope.attabal(layoutNodeLayoutDelegate.layoutNode)) {
                            NodeCoordinator wrappedBy = layoutNodeLayoutDelegate.polder().getWrappedBy();
                            if (wrappedBy != null) {
                                placementScope = wrappedBy.getPlacementScope();
                            }
                        } else {
                            NodeCoordinator wrappedBy2 = layoutNodeLayoutDelegate.polder().getWrappedBy();
                            if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                                placementScope = lookaheadDelegate.getPlacementScope();
                            }
                        }
                        if (placementScope == null) {
                            placementScope = peridotiteVarSaneness.getPlacementScope();
                        }
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeLayoutDelegate;
                        long j = position;
                        yemenite lookaheadDelegate2 = layoutNodeLayoutDelegate2.polder().getLookaheadDelegate();
                        Intrinsics.beachfront(lookaheadDelegate2);
                        androidx.compose.ui.layout.gintrap.attabal.cutely(placementScope, lookaheadDelegate2, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);
                    }
                }, 2, null);
            } else {
                yemenite lookaheadDelegate = LayoutNodeLayoutDelegate.this.polder().getLookaheadDelegate();
                Intrinsics.beachfront(lookaheadDelegate);
                lookaheadDelegate.basify(position);
                achondroplasia();
            }
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        public final void achondroplasia() {
            this.onNodePlacedCalled = true;
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            if (!getIsPlaced()) {
                picketboat();
                if (this.relayoutWithoutParentInProgress && layoutNodePermissivist != null) {
                    LayoutNode.basify(layoutNodePermissivist, false, 1, null);
                }
            }
            if (layoutNodePermissivist == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && (layoutNodePermissivist.merc() == LayoutNode.LayoutState.LayingOut || layoutNodePermissivist.merc() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (!(this.placeOrder == Integer.MAX_VALUE)) {
                    peridotite.attabal.saneness("Place was called on a node which was placed already");
                }
                this.placeOrder = layoutNodePermissivist.getLayoutDelegate().nextChildLookaheadPlaceOrder;
                layoutNodePermissivist.getLayoutDelegate().nextChildLookaheadPlaceOrder++;
            }
            molybdenite();
        }

        @Override // androidx.compose.ui.node.attabal
        /* JADX INFO: renamed from: attabal, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        public final boolean claque(long constraints) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                peridotite.attabal.attabal("measure is called on a deactivated node");
            }
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            LayoutNodeLayoutDelegate.this.layoutNode.cig(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure() || (layoutNodePermissivist != null && layoutNodePermissivist.getCanMultiMeasure()));
            if (!LayoutNodeLayoutDelegate.this.layoutNode.seminary()) {
                milliradian.saneness sanenessVar = this.lookaheadConstraints;
                if (sanenessVar == null ? false : milliradian.saneness.wireman(sanenessVar.getValue(), constraints)) {
                    peridotite owner = LayoutNodeLayoutDelegate.this.layoutNode.getOwner();
                    if (owner != null) {
                        owner.taiyuan(LayoutNodeLayoutDelegate.this.layoutNode, true);
                    }
                    LayoutNodeLayoutDelegate.this.layoutNode.tarboosh();
                    return false;
                }
            }
            this.lookaheadConstraints = milliradian.saneness.attabal(constraints);
            coffeecake(constraints);
            getAlignmentLines().molybdenite(false);
            grimness(new Function1<androidx.compose.ui.node.attabal, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2
                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(attabal attabalVar) {
                    invoke2(attabalVar);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(attabal attabalVar) {
                    attabalVar.getAlignmentLines().adultoid(false);
                }
            });
            long measuredSize = this.measuredOnce ? getMeasuredSize() : milliradian.polloi.attabal(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.measuredOnce = true;
            yemenite lookaheadDelegate = LayoutNodeLayoutDelegate.this.polder().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                peridotite.attabal.saneness("Lookahead result from lookaheadRemeasure cannot be null");
            }
            LayoutNodeLayoutDelegate.this.peridotite(constraints);
            itchy(milliradian.polloi.attabal(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (milliradian.monoploid.competently(measuredSize) == lookaheadDelegate.getWidth() && milliradian.monoploid.beachfront(measuredSize) == lookaheadDelegate.getHeight()) ? false : true;
        }

        /* JADX INFO: renamed from: coi, reason: from getter */
        public final milliradian.saneness getLookaheadConstraints() {
            return this.lookaheadConstraints;
        }

        @Override // androidx.compose.ui.node.attabal
        public NodeCoordinator cuirassed() {
            return LayoutNodeLayoutDelegate.this.layoutNode.yemenite();
        }

        /* JADX INFO: renamed from: czestochowa, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        public void dhss(boolean z) {
            this.isPlaced = z;
        }

        public final List<LookaheadPassDelegate> empress() {
            LayoutNodeLayoutDelegate.this.layoutNode.rotuma();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.competently();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.runtime.collection.dern<LookaheadPassDelegate> dernVar = this._childDelegates;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrApical[i];
                    if (dernVar.getSize() <= i) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.beachfront(lookaheadPassDelegate);
                        dernVar.saneness(lookaheadPassDelegate);
                    } else {
                        LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.beachfront(lookaheadPassDelegate2);
                        dernVar.gintrap(i, lookaheadPassDelegate2);
                    }
                    i++;
                } while (i < size);
            }
            dernVar.graveside(layoutNode.rotuma().size(), dernVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.competently();
        }

        @Override // androidx.compose.ui.node.attabal
        public androidx.compose.ui.node.attabal formularize() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            if (layoutNodePermissivist == null || (layoutDelegate = layoutNodePermissivist.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.trm();
        }

        @Override // androidx.compose.ui.node.attabal
        public void grimness(Function1<? super androidx.compose.ui.node.attabal, Unit> block) {
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    androidx.compose.ui.node.attabal attabalVarTrm = layoutNodeArrApical[i].getLayoutDelegate().trm();
                    Intrinsics.beachfront(attabalVarTrm);
                    block.invoke(attabalVarTrm);
                    i++;
                } while (i < size);
            }
        }

        public final void gusty() {
            this.parentDataDirty = true;
        }

        public final void hardpan() {
            LookaheadPassDelegate lookaheadPassDelegate;
            LayoutNode layoutNodePermissivist;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    peridotite.attabal.saneness("replace() called on item that was not placed");
                }
                this.onNodePlacedCalled = false;
                boolean isPlaced = getIsPlaced();
                lookaheadPassDelegate = this;
                try {
                    lookaheadPassDelegate.unconsolidated(this.lastPosition, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.lastLayerBlock, this.lastExplicitLayer);
                    if (isPlaced && !lookaheadPassDelegate.onNodePlacedCalled && (layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist()) != null) {
                        LayoutNode.basify(layoutNodePermissivist, false, 1, null);
                    }
                    lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
                } catch (Throwable th) {
                    th = th;
                    lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                lookaheadPassDelegate = this;
            }
        }

        public final void herdbook(boolean z) {
            this.childDelegatesDirty = z;
        }

        @Override // androidx.compose.ui.node.attabal
        public void hydrovane() {
            LayoutNode.prefect(LayoutNodeLayoutDelegate.this.layoutNode, false, false, false, 7, null);
        }

        public final void igbo(boolean forceRequest) {
            LayoutNode layoutNode;
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            if (layoutNodePermissivist == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            do {
                layoutNode = layoutNodePermissivist;
                if (layoutNode.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    layoutNodePermissivist = layoutNode.permissivist();
                }
            } while (layoutNodePermissivist != null);
            int i = attabal.f6889saneness[intrinsicsUsageByParent.ordinal()];
            if (i == 1) {
                if (layoutNode.getLookaheadRoot() != null) {
                    LayoutNode.prefect(layoutNode, forceRequest, false, false, 6, null);
                    return;
                } else {
                    LayoutNode.fastrack(layoutNode, forceRequest, false, false, 6, null);
                    return;
                }
            }
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (layoutNode.getLookaheadRoot() != null) {
                layoutNode.immediately(forceRequest);
            } else {
                layoutNode.osteal(forceRequest);
            }
        }

        public final void julian() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            dhss(false);
        }

        public final void lightstruck() {
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingLookaheadCoordinatesDuringPlacement() <= 0 || (size = (dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                LayoutNode layoutNode = layoutNodeArrApical[i];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    LayoutNode.basify(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.lightstruck();
                }
                i++;
            } while (i < size);
        }

        public final void lotta() {
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArrApical[i].getLayoutDelegate().getLookaheadPassDelegate();
                    Intrinsics.beachfront(lookaheadPassDelegate);
                    int i2 = lookaheadPassDelegate.previousPlaceOrder;
                    int i3 = lookaheadPassDelegate.placeOrder;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate.palmyra();
                    }
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.layout.gintrap
        public void milliradian(long position, float zIndex, GraphicsLayer layer) {
            unconsolidated(position, zIndex, null, layer);
        }

        @Override // androidx.compose.ui.node.attabal
        public void molybdenite() {
            this.layingOutChildren = true;
            getAlignmentLines().kowloon();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending()) {
                monroe();
            }
            final yemenite lookaheadDelegate = cuirassed().getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending())) {
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState = LayoutNodeLayoutDelegate.this.getLayoutState();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                peridotite peridotiteVarSaneness = cuirassed.saneness(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.premeiotic(false);
                OwnerSnapshotObserver snapshotObserver = peridotiteVarSaneness.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.beachfront(snapshotObserver, layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.sayid();
                        this.this$0.grimness(new Function1<attabal, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.1
                            @Override // p002kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(attabal attabalVar) {
                                invoke2(attabalVar);
                                return Unit.f29295attabal;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(attabal attabalVar) {
                                attabalVar.getAlignmentLines().graveside(false);
                            }
                        });
                        yemenite lookaheadDelegate2 = this.this$0.cuirassed().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            boolean isPlacingForAlignment = lookaheadDelegate2.getIsPlacingForAlignment();
                            List<LayoutNode> listRotuma = layoutNodeLayoutDelegate.layoutNode.rotuma();
                            int size = listRotuma.size();
                            for (int i = 0; i < size; i++) {
                                yemenite lookaheadDelegate3 = listRotuma.get(i).clubfoot().getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.technofreak(isPlacingForAlignment);
                                }
                            }
                        }
                        lookaheadDelegate.wostteth().dern();
                        yemenite lookaheadDelegate4 = this.this$0.cuirassed().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.getIsPlacingForAlignment();
                            List<LayoutNode> listRotuma2 = layoutNodeLayoutDelegate.layoutNode.rotuma();
                            int size2 = listRotuma2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                yemenite lookaheadDelegate5 = listRotuma2.get(i2).clubfoot().getLookaheadDelegate();
                                if (lookaheadDelegate5 != null) {
                                    lookaheadDelegate5.technofreak(false);
                                }
                            }
                        }
                        this.this$0.lotta();
                        this.this$0.grimness(new Function1<attabal, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.4
                            @Override // p002kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(attabal attabalVar) {
                                invoke2(attabalVar);
                                return Unit.f29295attabal;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(attabal attabalVar) {
                                attabalVar.getAlignmentLines().monoploid(attabalVar.getAlignmentLines().getUsedDuringParentLayout());
                            }
                        });
                    }
                }, 2, null);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState;
                if (LayoutNodeLayoutDelegate.this.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().monoploid(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().apical()) {
                getAlignmentLines().triweekly();
            }
            this.layingOutChildren = false;
        }

        public final void monroe() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrApical[i];
                    if (layoutNode2.seminary() && layoutNode2.peridotite() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.beachfront(lookaheadPassDelegate);
                        milliradian.saneness sanenessVarCord = layoutNode2.getLayoutDelegate().cord();
                        Intrinsics.beachfront(sanenessVarCord);
                        if (lookaheadPassDelegate.claque(sanenessVarCord.getValue())) {
                            LayoutNode.prefect(layoutNodeLayoutDelegate.layoutNode, false, false, false, 7, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void outmarry(int i) {
            this.placeOrder = i;
        }

        public final void palmyra() {
            if (getIsPlaced()) {
                int i = 0;
                dhss(false);
                androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
                int size = dernVarCoffeecake.getSize();
                if (size > 0) {
                    LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArrApical[i].getLayoutDelegate().getLookaheadPassDelegate();
                        Intrinsics.beachfront(lookaheadPassDelegate);
                        lookaheadPassDelegate.palmyra();
                        i++;
                    } while (i < size);
                }
            }
        }

        public final void picketboat() {
            boolean isPlaced = getIsPlaced();
            dhss(true);
            if (!isPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending()) {
                LayoutNode.prefect(LayoutNodeLayoutDelegate.this.layoutNode, true, false, false, 6, null);
            }
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNode layoutNode = layoutNodeArrApical[i];
                    if (layoutNode.cultivated() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegateGrimness = layoutNode.grimness();
                        Intrinsics.beachfront(lookaheadPassDelegateGrimness);
                        lookaheadPassDelegateGrimness.picketboat();
                        layoutNode.cosy(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* JADX INFO: renamed from: preterite, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        @Override // androidx.compose.ui.node.supplicat
        public void privatdozent(boolean z) {
            yemenite lookaheadDelegate;
            yemenite lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.polder().getLookaheadDelegate();
            if (!Intrinsics.wireman(Boolean.valueOf(z), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.getIsPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = LayoutNodeLayoutDelegate.this.polder().getLookaheadDelegate()) != null) {
                lookaheadDelegate.privatdozent(z);
            }
            this.isPlacedUnderMotionFrameOfReference = z;
        }

        @Override // androidx.compose.ui.node.attabal
        public void requestLayout() {
            LayoutNode.basify(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.attabal
        /* JADX INFO: renamed from: saneness, reason: from getter */
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final void sayid() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArrApical[i].getLayoutDelegate().getLookaheadPassDelegate();
                    Intrinsics.beachfront(lookaheadPassDelegate);
                    lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.placeOrder;
                    lookaheadPassDelegate.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        @Override // androidx.compose.ui.layout.triweekly
        public androidx.compose.ui.layout.gintrap sealless(long constraints) {
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            if ((layoutNodePermissivist != null ? layoutNodePermissivist.merc() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
                LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = false;
            } else {
                LayoutNode layoutNodePermissivist2 = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
                if ((layoutNodePermissivist2 != null ? layoutNodePermissivist2.merc() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = false;
                }
            }
            vesuvio(LayoutNodeLayoutDelegate.this.layoutNode);
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNodeLayoutDelegate.this.layoutNode.formularize();
            }
            claque(constraints);
            return this;
        }

        public final MeasurePassDelegate sensatory() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate();
        }

        public final boolean setterwort() {
            if (getParentData() == null) {
                yemenite lookaheadDelegate = LayoutNodeLayoutDelegate.this.polder().getLookaheadDelegate();
                Intrinsics.beachfront(lookaheadDelegate);
                if (lookaheadDelegate.deadwork() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            yemenite lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.polder().getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.deadwork();
            return true;
        }

        public final void technofreak(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        @Override // androidx.compose.ui.layout.gintrap
        public void treadless(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock) {
            unconsolidated(position, zIndex, layerBlock, null);
        }

        /* JADX INFO: renamed from: underbelly, reason: from getter */
        public final LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        public final void vesuvio(LayoutNode node) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode layoutNodePermissivist = node.permissivist();
            if (layoutNodePermissivist == null) {
                this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                return;
            }
            if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || node.getCanMultiMeasure())) {
                peridotite.attabal.saneness("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = attabal.f6888attabal[layoutNodePermissivist.merc().ordinal()];
            if (i == 1 || i == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodePermissivist.merc());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.measuredByParent = usageByParent;
        }

        @Override // androidx.compose.ui.node.attabal
        public Map<androidx.compose.ui.layout.attabal, Integer> wireman() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().molybdenite(true);
                    if (getAlignmentLines().getDirty()) {
                        LayoutNodeLayoutDelegate.this.creditor();
                    }
                } else {
                    getAlignmentLines().polloi(true);
                }
            }
            yemenite lookaheadDelegate = cuirassed().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.technofreak(true);
            }
            molybdenite();
            yemenite lookaheadDelegate2 = cuirassed().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.technofreak(false);
            }
            return getAlignmentLines().impromptu();
        }

        /* JADX INFO: renamed from: wostteth, reason: from getter */
        public final boolean getPlacedOnce() {
            return this.placedOnce;
        }
    }

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\tJ\u001a\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b%\u0010&J8\u0010'\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0014ø\u0001\u0000¢\u0006\u0004\b'\u0010(J*\u0010)\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0014ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\tJ\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\tJ\r\u0010-\u001a\u00020$¢\u0006\u0004\b-\u0010.J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/H\u0016¢\u0006\u0004\b2\u00103J#\u00105\u001a\u00020\u00072\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0015H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\tJ\u000f\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u0010\tJ\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010\tJ\u0015\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020$¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0007¢\u0006\u0004\b=\u0010\tR\u0016\u0010@\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010F\u001a\u0002012\u0006\u0010A\u001a\u0002018\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010I\u001a\u0002012\u0006\u0010A\u001a\u0002018\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u0016\u0010K\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\u0016\u0010M\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010?R\"\u0010U\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010?\u001a\u0004\bW\u0010.\"\u0004\bX\u0010<R\u001c\u0010\\\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010?R(\u0010l\u001a\u0004\u0018\u00010h2\b\u0010A\u001a\u0004\u0018\u00010h8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\"\u0010i\u001a\u0004\bj\u0010kR*\u0010p\u001a\u00020$2\u0006\u0010A\u001a\u00020$8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010?\u001a\u0004\bn\u0010.\"\u0004\bo\u0010<R*\u0010t\u001a\u00020$2\u0006\u0010A\u001a\u00020$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010?\u001a\u0004\br\u0010.\"\u0004\bs\u0010<R\u001a\u0010z\u001a\u00020u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001e\u0010\u007f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010?\u001a\u0005\b\u0081\u0001\u0010.\"\u0005\b\u0082\u0001\u0010<R'\u0010\u0086\u0001\u001a\u00020$2\u0006\u0010A\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010?\u001a\u0005\b\u0085\u0001\u0010.R\u001d\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u0088\u0001R'\u0010\u0014\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010d\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010?R&\u0010\u0090\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010^R\u001a\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010aR\u001d\u0010\u0093\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u0010[R\u0018\u0010\u0095\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010dR\u001e\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0088\u0001R\u0018\u0010\u0099\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010?R/\u0010\u009c\u0001\u001a\u00020$2\u0007\u0010\u009a\u0001\u001a\u00020$8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010?\u001a\u0005\b\u009c\u0001\u0010.\"\u0005\b\u008d\u0001\u0010<R\u001c\u0010\u009f\u0001\u001a\u0004\u0018\u00010 8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0017\u0010¢\u0001\u001a\u00030 \u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bZ\u0010¡\u0001R\"\u0010¦\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020|0£\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010©\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ª\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/triweekly;", "Landroidx/compose/ui/layout/gintrap;", "Landroidx/compose/ui/node/attabal;", "Landroidx/compose/ui/node/supplicat;", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "czestochowa", "()V", "unconsolidated", "achondroplasia", "sensatory", "Landroidx/compose/ui/node/LayoutNode;", "node", "lampshade", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lmilliradian/impassible;", X3.i.L, "", "zIndex", "Lkotlin/Function1;", "Lrestrictive/treadless;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "dhss", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "outmarry", "hardpan", "molybdenite", "technofreak", "Lmilliradian/saneness;", "constraints", "sealless", "(J)Landroidx/compose/ui/layout/gintrap;", "", "vesuvio", "(J)Z", "treadless", "(JFLkotlin/jvm/functions/Function1;)V", "milliradian", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "setterwort", "monroe", "libyan", "()Z", "", "Landroidx/compose/ui/layout/attabal;", "", "wireman", "()Ljava/util/Map;", "block", "grimness", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "hydrovane", "claque", "forceRequest", "lightstruck", "(Z)V", "herdbook", "graveside", "Z", "relayoutWithoutParentInProgress", "<set-?>", "adultoid", "I", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "dovishness", "picketboat", "placeOrder", "gintrap", "measuredOnce", "rotuma", "placedOnce", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "preprohormone", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "igbo", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "attendance", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "cord", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "cuirassed", "J", "lastPosition", "stratoscope", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "trm", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "oilcan", "F", "lastZIndex", "yemenite", "parentDataDirty", "", "Ljava/lang/Object;", "gusty", "()Ljava/lang/Object;", "parentData", "kattegat", "attabal", "homozygous", "isPlaced", "supplicat", "julian", "setPlacedByParent$ui_release", "isPlacedByParent", "Landroidx/compose/ui/node/AlignmentLines;", "restrictive", "Landroidx/compose/ui/node/AlignmentLines;", "saneness", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "merc", "Landroidx/compose/runtime/collection/dern;", "_childDelegates", "polder", "getChildDelegatesDirty$ui_release", "mastfed", "childDelegatesDirty", "seminary", "wostteth", "layingOutChildren", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "layoutChildrenBlock", "saran", "palmyra", "()F", "privatdozent", "onNodePlacedCalled", "creditor", "placeOuterCoordinatorLayerBlock", "starveling", "placeOuterCoordinatorLayer", "placeOuterCoordinatorPosition", "walach", "placeOuterCoordinatorZIndex", "peridotite", "placeOuterCoordinatorBlock", "mathsort", "needsCoordinatesUpdate", "new", "splinterproof", "isPlacedUnderMotionFrameOfReference", "preterite", "()Lmilliradian/saneness;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "underbelly", "()Ljava/util/List;", "childDelegates", "formularize", "()Landroidx/compose/ui/node/attabal;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MeasurePassDelegate extends androidx.compose.ui.layout.gintrap implements androidx.compose.ui.layout.triweekly, androidx.compose.ui.node.attabal, supplicat {

        /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
        public boolean duringAlignmentLinesQuery;

        /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
        public Function1<? super restrictive.treadless, Unit> placeOuterCoordinatorLayerBlock;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
        public long lastPosition;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
        public boolean measuredOnce;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public boolean relayoutWithoutParentInProgress;

        /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
        public final Function0<Unit> layoutChildrenBlock;

        /* JADX INFO: renamed from: hydrovane, reason: collision with root package name and from kotlin metadata */
        public long placeOuterCoordinatorPosition;

        /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
        public boolean isPlaced;

        /* JADX INFO: renamed from: mathsort, reason: collision with root package name and from kotlin metadata */
        public boolean needsCoordinatesUpdate;

        /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
        public final androidx.compose.runtime.collection.dern<MeasurePassDelegate> _childDelegates;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
        public float lastZIndex;

        /* JADX INFO: renamed from: peridotite, reason: collision with root package name and from kotlin metadata */
        public final Function0<Unit> placeOuterCoordinatorBlock;

        /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
        public boolean childDelegatesDirty;

        /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
        public boolean onNodePlacedCalled;

        /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
        public final AlignmentLines alignmentLines;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public boolean placedOnce;

        /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
        public float zIndex;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
        public Object parentData;

        /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
        public boolean layingOutChildren;

        /* JADX INFO: renamed from: splinterproof, reason: collision with root package name and from kotlin metadata */
        public boolean isPlacedUnderMotionFrameOfReference;

        /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
        public GraphicsLayer placeOuterCoordinatorLayer;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
        public Function1<? super restrictive.treadless, Unit> lastLayerBlock;

        /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
        public boolean isPlacedByParent;

        /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
        public GraphicsLayer lastExplicitLayer;

        /* JADX INFO: renamed from: walach, reason: collision with root package name and from kotlin metadata */
        public float placeOuterCoordinatorZIndex;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
        public boolean parentDataDirty;

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
        public int previousPlaceOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
        public int placeOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
        public LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f6920attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public static final /* synthetic */ int[] f6921saneness;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6920attabal = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f6921saneness = iArr2;
            }
        }

        public MeasurePassDelegate() {
            milliradian.impassible.Companion companion = milliradian.impassible.INSTANCE;
            this.lastPosition = companion.attabal();
            this.parentDataDirty = true;
            this.alignmentLines = new preprohormone(this);
            this._childDelegates = new androidx.compose.runtime.collection.dern<>(new MeasurePassDelegate[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.sensatory();
                    this.this$0.grimness(new Function1<attabal, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.1
                        @Override // p002kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(attabal attabalVar) {
                            invoke2(attabalVar);
                            return Unit.f29295attabal;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(attabal attabalVar) {
                            attabalVar.getAlignmentLines().graveside(false);
                        }
                    });
                    this.this$0.cuirassed().wostteth().dern();
                    this.this$0.czestochowa();
                    this.this$0.grimness(new Function1<attabal, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.2
                        @Override // p002kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(attabal attabalVar) {
                            invoke2(attabalVar);
                            return Unit.f29295attabal;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(attabal attabalVar) {
                            attabalVar.getAlignmentLines().monoploid(attabalVar.getAlignmentLines().getUsedDuringParentLayout());
                        }
                    });
                }
            };
            this.placeOuterCoordinatorPosition = companion.attabal();
            this.placeOuterCoordinatorBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.layout.gintrap.attabal placementScope;
                    NodeCoordinator wrappedBy = layoutNodeLayoutDelegate.polder().getWrappedBy();
                    if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                        placementScope = cuirassed.saneness(layoutNodeLayoutDelegate.layoutNode).getPlacementScope();
                    }
                    androidx.compose.ui.layout.gintrap.attabal attabalVar = placementScope;
                    LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
                    Function1<? super restrictive.treadless, Unit> function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                    GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                    if (graphicsLayer != null) {
                        attabalVar.arytenoidectomy(layoutNodeLayoutDelegate.polder(), measurePassDelegate.placeOuterCoordinatorPosition, graphicsLayer, measurePassDelegate.placeOuterCoordinatorZIndex);
                    } else if (function1 == null) {
                        attabalVar.taiyuan(layoutNodeLayoutDelegate.polder(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex);
                    } else {
                        attabalVar.kowloon(layoutNodeLayoutDelegate.polder(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex, function1);
                    }
                }
            };
        }

        private final void achondroplasia() {
            boolean isPlaced = getIsPlaced();
            homozygous(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            if (!isPlaced) {
                if (layoutNode.starveling()) {
                    LayoutNode.fastrack(layoutNode, true, false, false, 6, null);
                } else if (layoutNode.seminary()) {
                    LayoutNode.prefect(layoutNode, true, false, false, 6, null);
                }
            }
            NodeCoordinator wrapped = layoutNode.yemenite().getWrapped();
            for (NodeCoordinator nodeCoordinatorClubfoot = layoutNode.clubfoot(); !Intrinsics.wireman(nodeCoordinatorClubfoot, wrapped) && nodeCoordinatorClubfoot != null; nodeCoordinatorClubfoot = nodeCoordinatorClubfoot.getWrapped()) {
                if (nodeCoordinatorClubfoot.getLastLayerDrawingWasSkipped()) {
                    nodeCoordinatorClubfoot.cybernatic();
                }
            }
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrApical[i];
                    if (layoutNode2.cultivated() != Integer.MAX_VALUE) {
                        layoutNode2.creditor().achondroplasia();
                        layoutNode.cosy(layoutNode2);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void czestochowa() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrApical[i];
                    if (layoutNode2.creditor().previousPlaceOrder != layoutNode2.cultivated()) {
                        layoutNode.mastfed();
                        layoutNode.czestochowa();
                        if (layoutNode2.cultivated() == Integer.MAX_VALUE) {
                            layoutNode2.creditor().unconsolidated();
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void dhss(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock, GraphicsLayer layer) {
            androidx.compose.ui.layout.gintrap.attabal placementScope;
            this.isPlacedByParent = true;
            if (!milliradian.impassible.dern(position, this.lastPosition) || this.needsCoordinatesUpdate) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                    LayoutNodeLayoutDelegate.this.layoutPending = true;
                    this.needsCoordinatesUpdate = false;
                }
                claque();
            }
            if (stratoscope.attabal(LayoutNodeLayoutDelegate.this.layoutNode)) {
                NodeCoordinator wrappedBy = LayoutNodeLayoutDelegate.this.polder().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = cuirassed.saneness(LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                }
                androidx.compose.ui.layout.gintrap.attabal attabalVar = placementScope;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.getLookaheadPassDelegate();
                Intrinsics.beachfront(lookaheadPassDelegate);
                LayoutNode layoutNodePermissivist = layoutNodeLayoutDelegate.layoutNode.permissivist();
                if (layoutNodePermissivist != null) {
                    layoutNodePermissivist.getLayoutDelegate().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate.outmarry(Integer.MAX_VALUE);
                androidx.compose.ui.layout.gintrap.attabal.impromptu(attabalVar, lookaheadPassDelegate, milliradian.impassible.wireman(position), milliradian.impassible.marial(position), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegate2 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            if ((lookaheadPassDelegate2 == null || lookaheadPassDelegate2.getPlacedOnce()) ? false : true) {
                peridotite.attabal.saneness("Error: Placement happened before lookahead.");
            }
            outmarry(position, zIndex, layerBlock, layer);
        }

        private final void hardpan() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrApical[i];
                    if (layoutNode2.starveling() && layoutNode2.walach() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.libyan(layoutNode2, null, 1, null)) {
                        LayoutNode.fastrack(layoutNodeLayoutDelegate.layoutNode, false, false, false, 7, null);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void sensatory() {
            LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    MeasurePassDelegate measurePassDelegateCreditor = layoutNodeArrApical[i].creditor();
                    measurePassDelegateCreditor.previousPlaceOrder = measurePassDelegateCreditor.placeOrder;
                    measurePassDelegateCreditor.placeOrder = Integer.MAX_VALUE;
                    measurePassDelegateCreditor.isPlacedByParent = false;
                    if (measurePassDelegateCreditor.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegateCreditor.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void unconsolidated() {
            if (getIsPlaced()) {
                int i = 0;
                homozygous(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                NodeCoordinator wrapped = layoutNode.yemenite().getWrapped();
                for (NodeCoordinator nodeCoordinatorClubfoot = layoutNode.clubfoot(); !Intrinsics.wireman(nodeCoordinatorClubfoot, wrapped) && nodeCoordinatorClubfoot != null; nodeCoordinatorClubfoot = nodeCoordinatorClubfoot.getWrapped()) {
                    nodeCoordinatorClubfoot.polliwog();
                }
                androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
                int size = dernVarCoffeecake.getSize();
                if (size > 0) {
                    LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                    do {
                        layoutNodeArrApical[i].creditor().unconsolidated();
                        i++;
                    } while (i < size);
                }
            }
        }

        @Override // androidx.compose.ui.node.attabal
        /* JADX INFO: renamed from: attabal, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        public final void attendance(LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public final void claque() {
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake()).getSize()) <= 0) {
                return;
            }
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                LayoutNode layoutNode = layoutNodeArrApical[i];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    LayoutNode.licking(layoutNode, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().claque();
                i++;
            } while (i < size);
        }

        @Override // androidx.compose.ui.node.attabal
        public NodeCoordinator cuirassed() {
            return LayoutNodeLayoutDelegate.this.layoutNode.yemenite();
        }

        @Override // androidx.compose.ui.node.attabal
        public androidx.compose.ui.node.attabal formularize() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            if (layoutNodePermissivist == null || (layoutDelegate = layoutNodePermissivist.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.polloi();
        }

        @Override // androidx.compose.ui.node.attabal
        public void grimness(Function1<? super androidx.compose.ui.node.attabal, Unit> block) {
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = LayoutNodeLayoutDelegate.this.layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    block.invoke(layoutNodeArrApical[i].getLayoutDelegate().polloi());
                    i++;
                } while (i < size);
            }
        }

        /* JADX INFO: renamed from: gusty, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        public final void herdbook() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            homozygous(false);
        }

        public void homozygous(boolean z) {
            this.isPlaced = z;
        }

        @Override // androidx.compose.ui.node.attabal
        public void hydrovane() {
            LayoutNode.fastrack(LayoutNodeLayoutDelegate.this.layoutNode, false, false, false, 7, null);
        }

        /* JADX INFO: renamed from: igbo, reason: from getter */
        public final LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        /* JADX INFO: renamed from: julian, reason: from getter */
        public final boolean getIsPlacedByParent() {
            return this.isPlacedByParent;
        }

        public final void lampshade(LayoutNode node) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode layoutNodePermissivist = node.permissivist();
            if (layoutNodePermissivist == null) {
                this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                return;
            }
            if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || node.getCanMultiMeasure())) {
                peridotite.attabal.saneness("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = attabal.f6920attabal[layoutNodePermissivist.merc().ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodePermissivist.merc());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.measuredByParent = usageByParent;
        }

        public final boolean libyan() {
            if ((getParentData() == null && LayoutNodeLayoutDelegate.this.polder().miliaria() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = LayoutNodeLayoutDelegate.this.polder().miliaria();
            return true;
        }

        public final void lightstruck(boolean forceRequest) {
            LayoutNode layoutNode;
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            if (layoutNodePermissivist == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            do {
                layoutNode = layoutNodePermissivist;
                if (layoutNode.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    layoutNodePermissivist = layoutNode.permissivist();
                }
            } while (layoutNodePermissivist != null);
            int i = attabal.f6921saneness[intrinsicsUsageByParent.ordinal()];
            if (i == 1) {
                LayoutNode.fastrack(layoutNode, forceRequest, false, false, 6, null);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                layoutNode.osteal(forceRequest);
            }
        }

        public final void mastfed(boolean z) {
            this.childDelegatesDirty = z;
        }

        @Override // androidx.compose.ui.layout.gintrap
        public void milliradian(long position, float zIndex, GraphicsLayer layer) {
            dhss(position, zIndex, null, layer);
        }

        @Override // androidx.compose.ui.node.attabal
        public void molybdenite() {
            this.layingOutChildren = true;
            getAlignmentLines().kowloon();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending()) {
                hardpan();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !cuirassed().getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getLayoutPending())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState = LayoutNodeLayoutDelegate.this.getLayoutState();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.permissivist(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                cuirassed.saneness(layoutNode).getSnapshotObserver().marial(layoutNode, false, this.layoutChildrenBlock);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState;
                if (cuirassed().getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().monoploid(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().apical()) {
                getAlignmentLines().triweekly();
            }
            this.layingOutChildren = false;
        }

        public final void monroe() {
            this.parentDataDirty = true;
        }

        public final void outmarry(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock, GraphicsLayer layer) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                peridotite.attabal.attabal("place is called on a deactivated node");
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            peridotite peridotiteVarSaneness = cuirassed.saneness(LayoutNodeLayoutDelegate.this.layoutNode);
            if (LayoutNodeLayoutDelegate.this.getLayoutPending() || !getIsPlaced()) {
                getAlignmentLines().polloi(false);
                LayoutNodeLayoutDelegate.this.dent(false);
                this.placeOuterCoordinatorLayerBlock = layerBlock;
                this.placeOuterCoordinatorPosition = position;
                this.placeOuterCoordinatorZIndex = zIndex;
                this.placeOuterCoordinatorLayer = layer;
                peridotiteVarSaneness.getSnapshotObserver().dern(LayoutNodeLayoutDelegate.this.layoutNode, false, this.placeOuterCoordinatorBlock);
            } else {
                LayoutNodeLayoutDelegate.this.polder().imparkation(position, zIndex, layerBlock, layer);
                technofreak();
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        /* JADX INFO: renamed from: palmyra, reason: from getter */
        public final float getZIndex() {
            return this.zIndex;
        }

        /* JADX INFO: renamed from: picketboat, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        public final milliradian.saneness preterite() {
            if (this.measuredOnce) {
                return milliradian.saneness.attabal(getMeasurementConstraints());
            }
            return null;
        }

        @Override // androidx.compose.ui.node.supplicat
        public void privatdozent(boolean z) {
            boolean isPlacedUnderMotionFrameOfReference = LayoutNodeLayoutDelegate.this.polder().getIsPlacedUnderMotionFrameOfReference();
            if (z != isPlacedUnderMotionFrameOfReference) {
                LayoutNodeLayoutDelegate.this.polder().privatdozent(isPlacedUnderMotionFrameOfReference);
                this.needsCoordinatesUpdate = true;
            }
            this.isPlacedUnderMotionFrameOfReference = z;
        }

        @Override // androidx.compose.ui.node.attabal
        public void requestLayout() {
            LayoutNode.licking(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.attabal
        /* JADX INFO: renamed from: saneness, reason: from getter */
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.triweekly
        public androidx.compose.ui.layout.gintrap sealless(long constraints) {
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent == usageByParent) {
                LayoutNodeLayoutDelegate.this.layoutNode.formularize();
            }
            if (stratoscope.attabal(LayoutNodeLayoutDelegate.this.layoutNode)) {
                LookaheadPassDelegate lookaheadPassDelegate = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
                Intrinsics.beachfront(lookaheadPassDelegate);
                lookaheadPassDelegate.technofreak(usageByParent);
                lookaheadPassDelegate.sealless(constraints);
            }
            lampshade(LayoutNodeLayoutDelegate.this.layoutNode);
            vesuvio(constraints);
            return this;
        }

        public final void setterwort() {
            MeasurePassDelegate measurePassDelegate;
            LayoutNode layoutNodePermissivist;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    peridotite.attabal.saneness("replace called on unplaced item");
                }
                boolean isPlaced = getIsPlaced();
                measurePassDelegate = this;
                try {
                    measurePassDelegate.outmarry(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                    if (isPlaced && !measurePassDelegate.onNodePlacedCalled && (layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist()) != null) {
                        LayoutNode.licking(layoutNodePermissivist, false, 1, null);
                    }
                    measurePassDelegate.relayoutWithoutParentInProgress = false;
                } catch (Throwable th) {
                    th = th;
                    measurePassDelegate.relayoutWithoutParentInProgress = false;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                measurePassDelegate = this;
            }
        }

        public final void technofreak() {
            this.onNodePlacedCalled = true;
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            float zIndex = cuirassed().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            NodeCoordinator nodeCoordinatorClubfoot = layoutNode.clubfoot();
            NodeCoordinator nodeCoordinatorYemenite = layoutNode.yemenite();
            while (nodeCoordinatorClubfoot != nodeCoordinatorYemenite) {
                Intrinsics.competently(nodeCoordinatorClubfoot, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                adultoid adultoidVar = (adultoid) nodeCoordinatorClubfoot;
                zIndex += adultoidVar.getZIndex();
                nodeCoordinatorClubfoot = adultoidVar.getWrapped();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (layoutNodePermissivist != null) {
                    layoutNodePermissivist.mastfed();
                }
                if (layoutNodePermissivist != null) {
                    layoutNodePermissivist.czestochowa();
                }
            }
            if (!getIsPlaced()) {
                if (layoutNodePermissivist != null) {
                    layoutNodePermissivist.czestochowa();
                }
                achondroplasia();
                if (this.relayoutWithoutParentInProgress && layoutNodePermissivist != null) {
                    LayoutNode.licking(layoutNodePermissivist, false, 1, null);
                }
            }
            if (layoutNodePermissivist == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && layoutNodePermissivist.merc() == LayoutNode.LayoutState.LayingOut) {
                if (!(this.placeOrder == Integer.MAX_VALUE)) {
                    peridotite.attabal.saneness("Place was called on a node which was placed already");
                }
                this.placeOrder = layoutNodePermissivist.getLayoutDelegate().nextChildPlaceOrder;
                layoutNodePermissivist.getLayoutDelegate().nextChildPlaceOrder++;
            }
            molybdenite();
        }

        @Override // androidx.compose.ui.layout.gintrap
        public void treadless(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock) {
            dhss(position, zIndex, layerBlock, null);
        }

        public final List<MeasurePassDelegate> underbelly() {
            LayoutNodeLayoutDelegate.this.layoutNode.tailoring();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.competently();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.runtime.collection.dern<MeasurePassDelegate> dernVar = this._childDelegates;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
            int size = dernVarCoffeecake.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrApical[i];
                    if (dernVar.getSize() <= i) {
                        dernVar.saneness(layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    } else {
                        dernVar.gintrap(i, layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    }
                    i++;
                } while (i < size);
            }
            dernVar.graveside(layoutNode.rotuma().size(), dernVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.competently();
        }

        public final boolean vesuvio(long constraints) {
            if (LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                peridotite.attabal.attabal("measure is called on a deactivated node");
            }
            peridotite peridotiteVarSaneness = cuirassed.saneness(LayoutNodeLayoutDelegate.this.layoutNode);
            LayoutNode layoutNodePermissivist = LayoutNodeLayoutDelegate.this.layoutNode.permissivist();
            boolean z = true;
            LayoutNodeLayoutDelegate.this.layoutNode.cig(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure() || (layoutNodePermissivist != null && layoutNodePermissivist.getCanMultiMeasure()));
            if (!LayoutNodeLayoutDelegate.this.layoutNode.starveling() && milliradian.saneness.wireman(getMeasurementConstraints(), constraints)) {
                peridotite.cutely(peridotiteVarSaneness, LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                LayoutNodeLayoutDelegate.this.layoutNode.tarboosh();
                return false;
            }
            getAlignmentLines().molybdenite(false);
            grimness(new Function1<androidx.compose.ui.node.attabal, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2
                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(attabal attabalVar) {
                    invoke2(attabalVar);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(attabal attabalVar) {
                    attabalVar.getAlignmentLines().adultoid(false);
                }
            });
            this.measuredOnce = true;
            long jTriweekly = LayoutNodeLayoutDelegate.this.polder().triweekly();
            coffeecake(constraints);
            LayoutNodeLayoutDelegate.this.mathsort(constraints);
            if (milliradian.monoploid.marial(LayoutNodeLayoutDelegate.this.polder().triweekly(), jTriweekly) && LayoutNodeLayoutDelegate.this.polder().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.polder().getHeight() == getHeight()) {
                z = false;
            }
            itchy(milliradian.polloi.attabal(LayoutNodeLayoutDelegate.this.polder().getWidth(), LayoutNodeLayoutDelegate.this.polder().getHeight()));
            return z;
        }

        @Override // androidx.compose.ui.node.attabal
        public Map<androidx.compose.ui.layout.attabal, Integer> wireman() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().molybdenite(true);
                    if (getAlignmentLines().getDirty()) {
                        LayoutNodeLayoutDelegate.this.privatdozent();
                    }
                } else {
                    getAlignmentLines().polloi(true);
                }
            }
            cuirassed().technofreak(true);
            molybdenite();
            cuirassed().technofreak(false);
            return getAlignmentLines().impromptu();
        }

        /* JADX INFO: renamed from: wostteth, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: renamed from: adultoid, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final void clubfoot(int i) {
        int i2 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodePermissivist = this.layoutNode.permissivist();
            LayoutNodeLayoutDelegate layoutDelegate = layoutNodePermissivist != null ? layoutNodePermissivist.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i == 0) {
                    layoutDelegate.clubfoot(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.clubfoot(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final milliradian.saneness cord() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getLookaheadConstraints();
        }
        return null;
    }

    public final void creditor() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    /* JADX INFO: renamed from: cuirassed, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    public final void cultivated(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                clubfoot(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                clubfoot(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void dent(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                overspeculate(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                overspeculate(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    /* JADX INFO: renamed from: graveside, reason: from getter */
    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    public final void grimness() {
        this.measurePassDelegate.monroe();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.gusty();
        }
    }

    public final void hydrovane() {
        this.measurePending = true;
    }

    /* JADX INFO: renamed from: kattegat, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    public final void mathsort(long constraints) {
        LayoutNode.LayoutState layoutState = this.layoutState;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (!(layoutState == layoutState2)) {
            peridotite.attabal.saneness("layout state is not idle before measure starts");
        }
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        this.layoutState = layoutState3;
        this.measurePending = false;
        this.performMeasureConstraints = constraints;
        cuirassed.saneness(this.layoutNode).getSnapshotObserver().competently(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == layoutState3) {
            privatdozent();
            this.layoutState = layoutState2;
        }
    }

    /* JADX INFO: renamed from: merc, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final void monoploid() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    /* JADX INFO: renamed from: oilcan, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    public final void overspeculate(int i) {
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode layoutNodePermissivist = this.layoutNode.permissivist();
            LayoutNodeLayoutDelegate layoutDelegate = layoutNodePermissivist != null ? layoutNodePermissivist.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i == 0) {
                    layoutDelegate.overspeculate(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.overspeculate(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void peridotite(final long constraints) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.impromptu(cuirassed.saneness(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                yemenite lookaheadDelegate = this.this$0.polder().getLookaheadDelegate();
                Intrinsics.beachfront(lookaheadDelegate);
                lookaheadDelegate.sealless(constraints);
            }
        }, 2, null);
        creditor();
        if (stratoscope.attabal(this.layoutNode)) {
            privatdozent();
        } else {
            hydrovane();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    public final void permissivist(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                overspeculate(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                overspeculate(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final NodeCoordinator polder() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    public final attabal polloi() {
        return this.measurePassDelegate;
    }

    public final void premeiotic(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                clubfoot(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                clubfoot(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final milliradian.saneness preprohormone() {
        return this.measurePassDelegate.preterite();
    }

    public final void privatdozent() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    /* JADX INFO: renamed from: restrictive, reason: from getter */
    public final MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    public final int rotuma() {
        return this.measurePassDelegate.getHeight();
    }

    public final void saran() {
        this.measurePassDelegate.mastfed(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.herdbook(true);
        }
    }

    /* JADX INFO: renamed from: sealless, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    public final int seminary() {
        return this.measurePassDelegate.getWidth();
    }

    public final void splinterproof() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().arytenoidectomy();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.arytenoidectomy();
    }

    public final void starveling() {
        this.lookaheadMeasurePending = true;
    }

    /* JADX INFO: renamed from: stratoscope, reason: from getter */
    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    /* JADX INFO: renamed from: supplicat, reason: from getter */
    public final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    public final void timberyard() {
        LayoutNode layoutNodePermissivist;
        if (this.measurePassDelegate.libyan() && (layoutNodePermissivist = this.layoutNode.permissivist()) != null) {
            LayoutNode.fastrack(layoutNodePermissivist, false, false, false, 7, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.setterwort()) {
            return;
        }
        if (stratoscope.attabal(this.layoutNode)) {
            LayoutNode layoutNodePermissivist2 = this.layoutNode.permissivist();
            if (layoutNodePermissivist2 != null) {
                LayoutNode.fastrack(layoutNodePermissivist2, false, false, false, 7, null);
                return;
            }
            return;
        }
        LayoutNode layoutNodePermissivist3 = this.layoutNode.permissivist();
        if (layoutNodePermissivist3 != null) {
            LayoutNode.prefect(layoutNodePermissivist3, false, false, false, 7, null);
        }
    }

    public final attabal trm() {
        return this.lookaheadPassDelegate;
    }

    public final void walach() {
        LayoutNode.LayoutState layoutStateMerc = this.layoutNode.merc();
        if (layoutStateMerc == LayoutNode.LayoutState.LayingOut || layoutStateMerc == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                permissivist(true);
            } else {
                dent(true);
            }
        }
        if (layoutStateMerc == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.getLayingOutChildren()) {
                cultivated(true);
            } else {
                premeiotic(true);
            }
        }
    }

    /* JADX INFO: renamed from: yemenite, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }
}
