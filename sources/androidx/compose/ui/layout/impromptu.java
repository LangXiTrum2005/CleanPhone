package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/layout/competently;", "Lsupplicat/competently;", "marial", "(Landroidx/compose/ui/layout/competently;)J", "Lsupplicat/taiyuan;", "saneness", "(Landroidx/compose/ui/layout/competently;)Lsupplicat/taiyuan;", "dern", "attabal", "wireman", "(Landroidx/compose/ui/layout/competently;)Landroidx/compose/ui/layout/competently;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class impromptu {
    public static final supplicat.taiyuan attabal(competently competentlyVar) {
        supplicat.taiyuan taiyuanVarBeachfront;
        competently competentlyVarSupplicat = competentlyVar.supplicat();
        return (competentlyVarSupplicat == null || (taiyuanVarBeachfront = competently.beachfront(competentlyVarSupplicat, competentlyVar, false, 2, null)) == null) ? new supplicat.taiyuan(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, milliradian.monoploid.competently(competentlyVar.triweekly()), milliradian.monoploid.beachfront(competentlyVar.triweekly())) : taiyuanVarBeachfront;
    }

    public static final supplicat.taiyuan dern(competently competentlyVar) {
        competently competentlyVarWireman = wireman(competentlyVar);
        float fCompetently = milliradian.monoploid.competently(competentlyVarWireman.triweekly());
        float fBeachfront = milliradian.monoploid.beachfront(competentlyVarWireman.triweekly());
        supplicat.taiyuan taiyuanVarSaneness = saneness(competentlyVar);
        float f = taiyuanVarSaneness.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        if (f > fCompetently) {
            f = fCompetently;
        }
        float top = taiyuanVarSaneness.getTop();
        if (top < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            top = 0.0f;
        }
        if (top > fBeachfront) {
            top = fBeachfront;
        }
        float f3 = taiyuanVarSaneness.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = 0.0f;
        }
        if (f3 <= fCompetently) {
            fCompetently = f3;
        }
        float bottom = taiyuanVarSaneness.getBottom();
        if (bottom >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = bottom;
        }
        if (f2 <= fBeachfront) {
            fBeachfront = f2;
        }
        if (f == fCompetently || top == fBeachfront) {
            return supplicat.taiyuan.INSTANCE.attabal();
        }
        long jAdultoid = competentlyVarWireman.adultoid(supplicat.impromptu.attabal(f, top));
        long jAdultoid2 = competentlyVarWireman.adultoid(supplicat.impromptu.attabal(fCompetently, top));
        long jAdultoid3 = competentlyVarWireman.adultoid(supplicat.impromptu.attabal(fCompetently, fBeachfront));
        long jAdultoid4 = competentlyVarWireman.adultoid(supplicat.impromptu.attabal(f, fBeachfront));
        float fApical = supplicat.competently.apical(jAdultoid);
        float fApical2 = supplicat.competently.apical(jAdultoid2);
        float fApical3 = supplicat.competently.apical(jAdultoid4);
        float fApical4 = supplicat.competently.apical(jAdultoid3);
        float fMin = Math.min(fApical, Math.min(fApical2, Math.min(fApical3, fApical4)));
        float fMax = Math.max(fApical, Math.max(fApical2, Math.max(fApical3, fApical4)));
        float fFormularize = supplicat.competently.formularize(jAdultoid);
        float fFormularize2 = supplicat.competently.formularize(jAdultoid2);
        float fFormularize3 = supplicat.competently.formularize(jAdultoid4);
        float fFormularize4 = supplicat.competently.formularize(jAdultoid3);
        return new supplicat.taiyuan(fMin, Math.min(fFormularize, Math.min(fFormularize2, Math.min(fFormularize3, fFormularize4))), fMax, Math.max(fFormularize, Math.max(fFormularize2, Math.max(fFormularize3, fFormularize4))));
    }

    public static final long marial(competently competentlyVar) {
        return competentlyVar.starveling(supplicat.competently.INSTANCE.dern());
    }

    public static final supplicat.taiyuan saneness(competently competentlyVar) {
        return competently.beachfront(wireman(competentlyVar), competentlyVar, false, 2, null);
    }

    public static final competently wireman(competently competentlyVar) {
        competently competentlyVar2;
        competently competentlyVarSupplicat = competentlyVar.supplicat();
        while (true) {
            competently competentlyVar3 = competentlyVarSupplicat;
            competentlyVar2 = competentlyVar;
            competentlyVar = competentlyVar3;
            if (competentlyVar == null) {
                break;
            }
            competentlyVarSupplicat = competentlyVar.supplicat();
        }
        NodeCoordinator nodeCoordinator = competentlyVar2 instanceof NodeCoordinator ? (NodeCoordinator) competentlyVar2 : null;
        if (nodeCoordinator == null) {
            return competentlyVar2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }
}
