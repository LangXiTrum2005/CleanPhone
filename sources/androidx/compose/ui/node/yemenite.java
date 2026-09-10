package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import com.ironsource.Y3;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u0012J%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R(\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u000bR$\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u0010:\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b6\u00107\"\u0004\b8\u00109R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0*8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010=R\u0016\u0010A\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u0002048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010CR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010@R\u0014\u0010W\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010^\u001a\u00020\\8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010(R\u001a\u0010a\u001a\u00020_8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b`\u0010(R\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0016\u0010i\u001a\u0004\u0018\u00010f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/ui/node/yemenite;", "Landroidx/compose/ui/layout/triweekly;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Lmilliradian/impassible;", X3.i.L, "", "immediately", "(J)V", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "mastfed", "(Landroidx/compose/ui/layout/attabal;)I", "herdbook", "()V", "", "zIndex", "Lkotlin/Function1;", "Lrestrictive/treadless;", "layerBlock", "treadless", "(JFLkotlin/jvm/functions/Function1;)V", "basify", "sakeen", "ancestor", "", "excludingAgnosticOffset", "tectonization", "(Landroidx/compose/ui/node/yemenite;Z)J", "oilcan", "Landroidx/compose/ui/node/NodeCoordinator;", "lampshade", "()Landroidx/compose/ui/node/NodeCoordinator;", "yemenite", "J", "picketboat", "()J", "prefect", "", "sealless", "Ljava/util/Map;", "oldAlignmentLines", "Landroidx/compose/ui/layout/formularize;", "kattegat", "Landroidx/compose/ui/layout/formularize;", "libyan", "()Landroidx/compose/ui/layout/formularize;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/arytenoidectomy;", "result", "supplicat", "Landroidx/compose/ui/layout/arytenoidectomy;", "osteal", "(Landroidx/compose/ui/layout/arytenoidectomy;)V", "_measureResult", "restrictive", "attendance", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "czestochowa", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "underbelly", "()Z", "hasMeasureResult", "wostteth", "()Landroidx/compose/ui/layout/arytenoidectomy;", "measureResult", "julian", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "fontScale", "igbo", "parent", "Landroidx/compose/ui/node/LayoutNode;", "preterite", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/competently;", "sensatory", "()Landroidx/compose/ui/layout/competently;", Y3.f, "Lmilliradian/monoploid;", "molet", "size", "Lmilliradian/saneness;", "homozygous", "constraints", "Landroidx/compose/ui/node/attabal;", "setterwort", "()Landroidx/compose/ui/node/attabal;", "alignmentLinesOwner", "", "deadwork", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class yemenite extends LookaheadCapablePlaceable implements androidx.compose.ui.layout.triweekly {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final NodeCoordinator coordinator;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public Map<androidx.compose.ui.layout.attabal, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.layout.arytenoidectomy _measureResult;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public long position = milliradian.impassible.INSTANCE.attabal();

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.layout.formularize lookaheadLayoutCoordinates = new androidx.compose.ui.layout.formularize(this);

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public final Map<androidx.compose.ui.layout.attabal, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    public yemenite(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    public final Map<androidx.compose.ui.layout.attabal, Integer> attendance() {
        return this.cachedAlignmentLinesMap;
    }

    public final void basify(long position) {
        immediately(milliradian.impassible.competently(position, getApparentToRealOffset()));
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable czestochowa() {
        NodeCoordinator wrapped = this.coordinator.getWrapped();
        if (wrapped != null) {
            return wrapped.getLookaheadDelegate();
        }
        return null;
    }

    public Object deadwork() {
        return this.coordinator.miliaria();
    }

    @Override // milliradian.wireman
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.layout.beachfront
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void herdbook() {
        treadless(getCom.ironsource.X3.i.L java.lang.String(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
    }

    public final long homozygous() {
        return getMeasurementConstraints();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable igbo() {
        NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        if (wrappedBy != null) {
            return wrappedBy.getLookaheadDelegate();
        }
        return null;
    }

    public final void immediately(long position) {
        if (!milliradian.impassible.dern(getCom.ironsource.X3.i.L java.lang.String(), position)) {
            prefect(position);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateSupplicat = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegateSupplicat != null) {
                lookaheadPassDelegateSupplicat.lightstruck();
            }
            lightstruck(this.coordinator);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        sayid(wostteth());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean julian() {
        return true;
    }

    @Override // milliradian.apical
    /* JADX INFO: renamed from: kattegat */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    /* JADX INFO: renamed from: lampshade, reason: from getter */
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX INFO: renamed from: libyan, reason: from getter */
    public final androidx.compose.ui.layout.formularize getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final int mastfed(androidx.compose.ui.layout.attabal alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final long molet() {
        return milliradian.polloi.attabal(getWidth(), getHeight());
    }

    public final void osteal(androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVar) {
        Unit unit;
        Map<androidx.compose.ui.layout.attabal, Integer> map;
        if (arytenoidectomyVar != null) {
            itchy(milliradian.polloi.attabal(arytenoidectomyVar.getWidth(), arytenoidectomyVar.getHeight()));
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            itchy(milliradian.monoploid.INSTANCE.attabal());
        }
        if (!Intrinsics.wireman(this._measureResult, arytenoidectomyVar) && arytenoidectomyVar != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !arytenoidectomyVar.saneness().isEmpty()) && !Intrinsics.wireman(arytenoidectomyVar.saneness(), this.oldAlignmentLines))) {
            setterwort().getAlignmentLines().impassible();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(arytenoidectomyVar.saneness());
        }
        this._measureResult = arytenoidectomyVar;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: picketboat, reason: from getter */
    public long getCom.ironsource.X3.i.L java.lang.String() {
        return this.position;
    }

    public void prefect(long j) {
        this.position = j;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: preterite */
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public void sakeen() {
        wostteth().dern();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.competently sensatory() {
        return this.lookaheadLayoutCoordinates;
    }

    public attabal setterwort() {
        attabal attabalVarTrm = this.coordinator.getLayoutNode().getLayoutDelegate().trm();
        Intrinsics.beachfront(attabalVarTrm);
        return attabalVarTrm;
    }

    public final long tectonization(yemenite ancestor, boolean excludingAgnosticOffset) {
        long jAttabal = milliradian.impassible.INSTANCE.attabal();
        yemenite lookaheadDelegate = this;
        while (!Intrinsics.wireman(lookaheadDelegate, ancestor)) {
            if (!lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference() || !excludingAgnosticOffset) {
                jAttabal = milliradian.impassible.competently(jAttabal, lookaheadDelegate.getCom.ironsource.X3.i.L java.lang.String());
            }
            NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            Intrinsics.beachfront(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            Intrinsics.beachfront(lookaheadDelegate);
        }
        return jAttabal;
    }

    @Override // androidx.compose.ui.layout.gintrap
    public final void treadless(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock) {
        immediately(position);
        if (getIsShallowPlacing()) {
            return;
        }
        sakeen();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean underbelly() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.arytenoidectomy wostteth() {
        androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVar = this._measureResult;
        if (arytenoidectomyVar != null) {
            return arytenoidectomyVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }
}
