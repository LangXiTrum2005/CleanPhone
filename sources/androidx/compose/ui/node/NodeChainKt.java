package androidx.compose.ui.node;

import androidx.compose.ui.CombinedModifier;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/attabal$saneness;", "prev", "next", "", "wireman", "(Landroidx/compose/ui/attabal$saneness;Landroidx/compose/ui/attabal$saneness;)I", "Landroidx/compose/ui/attabal$dern;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/node/kattegat;", "node", "", "beachfront", "(Landroidx/compose/ui/node/kattegat;Landroidx/compose/ui/attabal$dern;)V", "Landroidx/compose/ui/attabal;", "Landroidx/compose/runtime/collection/dern;", "result", "marial", "(Landroidx/compose/ui/attabal;Landroidx/compose/runtime/collection/dern;)Landroidx/compose/runtime/collection/dern;", "androidx/compose/ui/node/NodeChainKt$attabal", "attabal", "Landroidx/compose/ui/node/NodeChainKt$attabal;", "SentinelHead", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NodeChainKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f6939attabal;

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/NodeChainKt$attabal", "Landroidx/compose/ui/attabal$dern;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends androidx.compose.ui.attabal.dern {
        public String toString() {
            return "<Head>";
        }
    }

    static {
        attabal attabalVar = new attabal();
        attabalVar.coffeecake(-1);
        f6939attabal = attabalVar;
    }

    public static final <T extends androidx.compose.ui.attabal.dern> void beachfront(kattegat<T> kattegatVar, androidx.compose.ui.attabal.dern dernVar) {
        Intrinsics.competently(dernVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        kattegatVar.molybdenite(dernVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> marial(androidx.compose.ui.attabal attabalVar, final androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar) {
        androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal[p002kotlin.ranges.wireman.wireman(dernVar.getSize(), 16)], 0);
        dernVar2.saneness(attabalVar);
        Function1<androidx.compose.ui.attabal.saneness, Boolean> function1 = null;
        while (dernVar2.kowloon()) {
            androidx.compose.ui.attabal attabalVar2 = (androidx.compose.ui.attabal) dernVar2.molybdenite(dernVar2.getSize() - 1);
            if (attabalVar2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) attabalVar2;
                dernVar2.saneness(combinedModifier.getInner());
                dernVar2.saneness(combinedModifier.getOuter());
            } else if (attabalVar2 instanceof androidx.compose.ui.attabal.saneness) {
                dernVar.saneness(attabalVar2);
            } else {
                if (function1 == null) {
                    function1 = new Function1<androidx.compose.ui.attabal.saneness, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p002kotlin.jvm.functions.Function1
                        public final Boolean invoke(androidx.compose.ui.attabal.saneness sanenessVar) {
                            dernVar.saneness(sanenessVar);
                            return Boolean.TRUE;
                        }
                    };
                }
                attabalVar2.marial(function1);
                function1 = function1;
            }
        }
        return dernVar;
    }

    public static final int wireman(androidx.compose.ui.attabal.saneness sanenessVar, androidx.compose.ui.attabal.saneness sanenessVar2) {
        if (Intrinsics.wireman(sanenessVar, sanenessVar2)) {
            return 2;
        }
        return yemenite.attabal.attabal(sanenessVar, sanenessVar2) ? 1 : 0;
    }
}
