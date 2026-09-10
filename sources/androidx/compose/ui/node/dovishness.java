package androidx.compose.ui.node;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "saneness", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;Landroidx/compose/ui/layout/attabal;)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class dovishness {
    public static final int saneness(LookaheadCapablePlaceable lookaheadCapablePlaceable, androidx.compose.ui.layout.attabal attabalVar) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableCzestochowa = lookaheadCapablePlaceable.czestochowa();
        if (!(lookaheadCapablePlaceableCzestochowa != null)) {
            peridotite.attabal.saneness("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.wostteth().saneness().containsKey(attabalVar)) {
            Integer num = lookaheadCapablePlaceable.wostteth().saneness().get(attabalVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iCoi = lookaheadCapablePlaceableCzestochowa.coi(attabalVar);
        if (iCoi == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        lookaheadCapablePlaceableCzestochowa.outmarry(true);
        lookaheadCapablePlaceable.technofreak(true);
        lookaheadCapablePlaceable.herdbook();
        lookaheadCapablePlaceableCzestochowa.outmarry(false);
        lookaheadCapablePlaceable.technofreak(false);
        return iCoi + (attabalVar instanceof androidx.compose.ui.layout.marial ? milliradian.impassible.marial(lookaheadCapablePlaceableCzestochowa.getPosition()) : milliradian.impassible.wireman(lookaheadCapablePlaceableCzestochowa.getPosition()));
    }
}
