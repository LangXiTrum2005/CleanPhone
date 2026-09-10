package androidx.compose.ui.node;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ObserverModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/attabal$dern;", "Landroidx/compose/ui/node/creditor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "", "block", "attabal", "(Landroidx/compose/ui/attabal$dern;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class starveling {
    public static final <T extends androidx.compose.ui.attabal.dern & creditor> void attabal(T t, Function0<Unit> function0) {
        ObserverNodeOwnerScope ownerScope = t.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new ObserverNodeOwnerScope(t);
            t.sayid(ownerScope);
        }
        beachfront.taiyuan(t).getSnapshotObserver().taiyuan(ownerScope, ObserverNodeOwnerScope.INSTANCE.attabal(), function0);
    }
}
