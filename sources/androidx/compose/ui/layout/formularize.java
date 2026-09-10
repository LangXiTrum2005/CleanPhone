package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.yemenite;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b)\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/formularize;", "Landroidx/compose/ui/layout/competently;", "Landroidx/compose/ui/node/yemenite;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/yemenite;)V", "Lsupplicat/competently;", "relativeToLocal", "adultoid", "(J)J", "starveling", "sourceCoordinates", "relativeToSource", "cutely", "(Landroidx/compose/ui/layout/competently;J)J", "", "includeMotionFrameOfReference", "marial", "(Landroidx/compose/ui/layout/competently;JZ)J", "clipBounds", "Lsupplicat/taiyuan;", "stratoscope", "(Landroidx/compose/ui/layout/competently;Z)Lsupplicat/taiyuan;", "kowloon", "Landroidx/compose/ui/node/yemenite;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/yemenite;", "Landroidx/compose/ui/node/NodeCoordinator;", "attabal", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lmilliradian/monoploid;", "triweekly", "()J", "size", "supplicat", "()Landroidx/compose/ui/layout/competently;", "parentLayoutCoordinates", "impassible", "()Z", "isAttached", "saneness", "lookaheadOffset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class formularize implements competently {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final yemenite lookaheadDelegate;

    public formularize(yemenite yemeniteVar) {
        this.lookaheadDelegate = yemeniteVar;
    }

    @Override // androidx.compose.ui.layout.competently
    public long adultoid(long relativeToLocal) {
        return attabal().adultoid(supplicat.competently.arytenoidectomy(relativeToLocal, saneness()));
    }

    public final NodeCoordinator attabal() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.competently
    public long cutely(competently sourceCoordinates, long relativeToSource) {
        return marial(sourceCoordinates, relativeToSource, true);
    }

    @Override // androidx.compose.ui.layout.competently
    public boolean impassible() {
        return attabal().impassible();
    }

    @Override // androidx.compose.ui.layout.competently
    public long marial(competently sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof formularize)) {
            yemenite yemeniteVarAttabal = impassible.attabal(this.lookaheadDelegate);
            return supplicat.competently.arytenoidectomy(marial(yemeniteVarAttabal.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference), yemeniteVarAttabal.getCoordinator().sensatory().marial(sourceCoordinates, supplicat.competently.INSTANCE.dern(), includeMotionFrameOfReference));
        }
        yemenite yemeniteVar = ((formularize) sourceCoordinates).lookaheadDelegate;
        yemeniteVar.getCoordinator().genii();
        yemenite lookaheadDelegate = attabal().cig(yemeniteVar.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            long jBeachfront = milliradian.impassible.beachfront(milliradian.impassible.competently(yemeniteVar.tectonization(lookaheadDelegate, !includeMotionFrameOfReference), milliradian.triweekly.wireman(relativeToSource)), this.lookaheadDelegate.tectonization(lookaheadDelegate, !includeMotionFrameOfReference));
            return supplicat.impromptu.attabal(milliradian.impassible.wireman(jBeachfront), milliradian.impassible.marial(jBeachfront));
        }
        yemenite yemeniteVarAttabal2 = impassible.attabal(yemeniteVar);
        long jCompetently = milliradian.impassible.competently(milliradian.impassible.competently(yemeniteVar.tectonization(yemeniteVarAttabal2, !includeMotionFrameOfReference), yemeniteVarAttabal2.getCom.ironsource.X3.i.L java.lang.String()), milliradian.triweekly.wireman(relativeToSource));
        yemenite yemeniteVarAttabal3 = impassible.attabal(this.lookaheadDelegate);
        long jBeachfront2 = milliradian.impassible.beachfront(jCompetently, milliradian.impassible.competently(this.lookaheadDelegate.tectonization(yemeniteVarAttabal3, !includeMotionFrameOfReference), yemeniteVarAttabal3.getCom.ironsource.X3.i.L java.lang.String()));
        long jAttabal = supplicat.impromptu.attabal(milliradian.impassible.wireman(jBeachfront2), milliradian.impassible.marial(jBeachfront2));
        NodeCoordinator wrappedBy = yemeniteVarAttabal3.getCoordinator().getWrappedBy();
        Intrinsics.beachfront(wrappedBy);
        NodeCoordinator wrappedBy2 = yemeniteVarAttabal2.getCoordinator().getWrappedBy();
        Intrinsics.beachfront(wrappedBy2);
        return wrappedBy.marial(wrappedBy2, jAttabal, includeMotionFrameOfReference);
    }

    public final long saneness() {
        yemenite yemeniteVarAttabal = impassible.attabal(this.lookaheadDelegate);
        competently competentlyVarSensatory = yemeniteVarAttabal.sensatory();
        supplicat.competently.Companion companion = supplicat.competently.INSTANCE;
        return supplicat.competently.kowloon(cutely(competentlyVarSensatory, companion.dern()), attabal().cutely(yemeniteVarAttabal.getCoordinator(), companion.dern()));
    }

    @Override // androidx.compose.ui.layout.competently
    public long starveling(long relativeToLocal) {
        return attabal().starveling(supplicat.competently.arytenoidectomy(relativeToLocal, saneness()));
    }

    @Override // androidx.compose.ui.layout.competently
    public supplicat.taiyuan stratoscope(competently sourceCoordinates, boolean clipBounds) {
        return attabal().stratoscope(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.ui.layout.competently
    public competently supplicat() {
        yemenite lookaheadDelegate;
        if (!impassible()) {
            peridotite.attabal.saneness("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = attabal().getLayoutNode().clubfoot().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.sensatory();
    }

    @Override // androidx.compose.ui.layout.competently
    public long triweekly() {
        yemenite yemeniteVar = this.lookaheadDelegate;
        return milliradian.polloi.attabal(yemeniteVar.getWidth(), yemeniteVar.getHeight());
    }
}
