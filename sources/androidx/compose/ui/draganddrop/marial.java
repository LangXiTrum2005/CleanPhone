package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.coffeecake;
import androidx.compose.ui.node.itchy;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import milliradian.monoploid;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: DragAndDropNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/draganddrop/beachfront;", "Landroidx/compose/ui/draganddrop/saneness;", NotificationCompat.CATEGORY_EVENT, "", "marial", "(Landroidx/compose/ui/draganddrop/beachfront;Landroidx/compose/ui/draganddrop/saneness;)V", "Landroidx/compose/ui/draganddrop/wireman;", "Lsupplicat/competently;", X3.i.L, "", "wireman", "(Landroidx/compose/ui/draganddrop/wireman;J)Z", "Landroidx/compose/ui/node/itchy;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "block", "beachfront", "(Landroidx/compose/ui/node/itchy;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class marial {
    public static final <T extends itchy> void beachfront(T t, Function1<? super T, ? extends TraversableNode$Companion$TraverseDescendantsAction> function1) {
        if (function1.invoke(t) != TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        coffeecake.attabal(t, function1);
    }

    public static final void marial(beachfront beachfrontVar, saneness sanenessVar) {
        beachfrontVar.graveside(sanenessVar);
        beachfrontVar.marial(sanenessVar);
    }

    public static final boolean wireman(wireman wiremanVar, long j) {
        if (!wiremanVar.getNode().getIsAttached()) {
            return false;
        }
        androidx.compose.ui.layout.competently competentlyVarMarial = androidx.compose.ui.node.beachfront.impromptu(wiremanVar).marial();
        if (!competentlyVarMarial.impassible()) {
            return false;
        }
        long jTriweekly = competentlyVarMarial.triweekly();
        int iCompetently = monoploid.competently(jTriweekly);
        int iBeachfront = monoploid.beachfront(jTriweekly);
        long jMarial = androidx.compose.ui.layout.impromptu.marial(competentlyVarMarial);
        float fApical = supplicat.competently.apical(jMarial);
        float fFormularize = supplicat.competently.formularize(jMarial);
        float f = iCompetently + fApical;
        float f2 = iBeachfront + fFormularize;
        float fApical2 = supplicat.competently.apical(j);
        if (fApical <= fApical2 && fApical2 <= f) {
            float fFormularize2 = supplicat.competently.formularize(j);
            if (fFormularize <= fFormularize2 && fFormularize2 <= f2) {
                return true;
            }
        }
        return false;
    }
}
