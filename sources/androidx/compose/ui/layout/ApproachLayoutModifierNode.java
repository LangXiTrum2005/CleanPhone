package androidx.compose.ui.layout;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ApproachLayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/graveside;", "Lmilliradian/monoploid;", "lookaheadSize", "", "stratoscope", "(J)Z", "Landroidx/compose/ui/layout/gintrap$attabal;", "Landroidx/compose/ui/layout/competently;", "lookaheadCoordinates", "saran", "(Landroidx/compose/ui/layout/gintrap$attabal;Landroidx/compose/ui/layout/competently;)Z", "Landroidx/compose/ui/layout/monoploid;", "Landroidx/compose/ui/layout/triweekly;", "measurable", "Lmilliradian/saneness;", "constraints", "Landroidx/compose/ui/layout/arytenoidectomy;", "attabal", "(Landroidx/compose/ui/layout/monoploid;Landroidx/compose/ui/layout/triweekly;J)Landroidx/compose/ui/layout/arytenoidectomy;", "Landroidx/compose/ui/layout/saneness;", "gintrap", "(Landroidx/compose/ui/layout/saneness;Landroidx/compose/ui/layout/triweekly;J)Landroidx/compose/ui/layout/arytenoidectomy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ApproachLayoutModifierNode extends androidx.compose.ui.node.graveside {
    @Override // androidx.compose.ui.node.graveside
    default arytenoidectomy attabal(monoploid monoploidVar, triweekly triweeklyVar, long j) {
        final gintrap gintrapVarSealless = triweeklyVar.sealless(j);
        return monoploid.polloi(monoploidVar, gintrapVarSealless.getWidth(), gintrapVarSealless.getHeight(), null, new Function1<gintrap.attabal, Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gintrap.attabal attabalVar) {
                invoke2(attabalVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(gintrap.attabal attabalVar) {
                gintrap.attabal.impromptu(attabalVar, gintrapVarSealless, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
            }
        }, 4, null);
    }

    arytenoidectomy gintrap(saneness sanenessVar, triweekly triweeklyVar, long j);

    default boolean saran(gintrap.attabal attabalVar, competently competentlyVar) {
        return false;
    }

    boolean stratoscope(long lookaheadSize);
}
