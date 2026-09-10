package androidx.compose.ui.layout;

import androidx.compose.ui.node.yemenite;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApproachMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u0017*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u0017*\u00020\u001dH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u001d*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010$\u001a\u00020#*\u00020\"H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J]\u0010(\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u001d8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010C\u001a\u00020@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010G\u001a\u00020D8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/layout/dern;", "Landroidx/compose/ui/layout/saneness;", "Landroidx/compose/ui/layout/monoploid;", "", "Landroidx/compose/ui/node/adultoid;", "coordinator", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "approachNode", "<init>", "(Landroidx/compose/ui/node/adultoid;Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/attabal;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/gintrap$attabal;", "", "placementBlock", "Landroidx/compose/ui/layout/arytenoidectomy;", "preprohormone", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/arytenoidectomy;", "Lmilliradian/impromptu;", "arytenoidectomy", "(F)I", "Lmilliradian/graveside;", "impromptu", "(J)F", "", "trm", "(F)F", "restrictive", "graveside", "Lmilliradian/cutely;", "Lsupplicat/impassible;", "saran", "(J)J", "Landroidx/compose/ui/layout/cuirassed;", "rulers", "polder", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/arytenoidectomy;", "kowloon", "Landroidx/compose/ui/node/adultoid;", "wireman", "()Landroidx/compose/ui/node/adultoid;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "saneness", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "cutely", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "monoploid", "Z", "attabal", "()Z", "beachfront", "(Z)V", "approachMeasureRequired", "getDensity", "()F", "density", "kattegat", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lmilliradian/monoploid;", "marial", "()J", "lookaheadSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern implements saneness, monoploid {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public ApproachLayoutModifierNode approachNode;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.node.adultoid coordinator;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean approachMeasureRequired;

    /* JADX INFO: compiled from: ApproachMeasureScope.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u0012\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u000b\u0010\u0011R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"androidx/compose/ui/layout/dern$attabal", "Landroidx/compose/ui/layout/arytenoidectomy;", "", "dern", "()V", "", "attabal", "I", "getWidth", "()I", "width", "saneness", "getHeight", "height", "", "Landroidx/compose/ui/layout/attabal;", "Ljava/util/Map;", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/cuirassed;", "wireman", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements arytenoidectomy {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int width;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ dern f6742beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final Map<androidx.compose.ui.layout.attabal, Integer> alignmentLines;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ Function1<gintrap.attabal, Unit> f6744marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final int height;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final Function1<cuirassed, Unit> rulers;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(int i, int i2, Map<androidx.compose.ui.layout.attabal, Integer> map, Function1<? super cuirassed, Unit> function1, Function1<? super gintrap.attabal, Unit> function2, dern dernVar) {
            this.f6744marial = function2;
            this.f6742beachfront = dernVar;
            this.width = i;
            this.height = i2;
            this.alignmentLines = map;
            this.rulers = function1;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public void dern() {
            this.f6744marial.invoke(this.f6742beachfront.getCoordinator().getPlacementScope());
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Map<androidx.compose.ui.layout.attabal, Integer> saneness() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Function1<cuirassed, Unit> wireman() {
            return this.rulers;
        }
    }

    public dern(androidx.compose.ui.node.adultoid adultoidVar, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = adultoidVar;
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // milliradian.wireman
    public int arytenoidectomy(float f) {
        return this.coordinator.arytenoidectomy(f);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    public final void beachfront(boolean z) {
        this.approachMeasureRequired = z;
    }

    public final void cutely(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // milliradian.wireman
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.layout.beachfront
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // milliradian.wireman
    public float graveside(long j) {
        return this.coordinator.graveside(j);
    }

    @Override // milliradian.apical
    public float impromptu(long j) {
        return this.coordinator.impromptu(j);
    }

    @Override // milliradian.apical
    /* JADX INFO: renamed from: kattegat */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    public long marial() {
        yemenite lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        Intrinsics.beachfront(lookaheadDelegate);
        arytenoidectomy arytenoidectomyVarWostteth = lookaheadDelegate.wostteth();
        return milliradian.polloi.attabal(arytenoidectomyVarWostteth.getWidth(), arytenoidectomyVarWostteth.getHeight());
    }

    @Override // androidx.compose.ui.layout.monoploid
    public arytenoidectomy polder(int width, int height, Map<androidx.compose.ui.layout.attabal, Integer> alignmentLines, Function1<? super cuirassed, Unit> rulers, Function1<? super gintrap.attabal, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            peridotite.attabal.saneness("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new attabal(width, height, alignmentLines, rulers, placementBlock, this);
    }

    @Override // androidx.compose.ui.layout.monoploid
    public arytenoidectomy preprohormone(int width, int height, Map<androidx.compose.ui.layout.attabal, Integer> alignmentLines, Function1<? super gintrap.attabal, Unit> placementBlock) {
        return this.coordinator.preprohormone(width, height, alignmentLines, placementBlock);
    }

    @Override // milliradian.wireman
    public float restrictive(float f) {
        return this.coordinator.restrictive(f);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    @Override // milliradian.wireman
    public long saran(long j) {
        return this.coordinator.saran(j);
    }

    @Override // milliradian.wireman
    public float trm(float f) {
        return this.coordinator.trm(f);
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final androidx.compose.ui.node.adultoid getCoordinator() {
        return this.coordinator;
    }
}
