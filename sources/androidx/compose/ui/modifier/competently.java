package androidx.compose.ui.modifier;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/competently;", "Landroidx/compose/ui/modifier/cutely;", "Landroidx/compose/ui/node/marial;", "Landroidx/compose/ui/modifier/beachfront;", "arytenoidectomy", "()Landroidx/compose/ui/modifier/beachfront;", "providedValues", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/modifier/dern;", "triweekly", "(Landroidx/compose/ui/modifier/dern;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface competently extends cutely, androidx.compose.ui.node.marial {
    default beachfront arytenoidectomy() {
        return saneness.f6778attabal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.attabal$dern] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.dern] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.dern] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    default <T> T triweekly(dern<T> dernVar) {
        seminary nodes;
        if (!getNode().getIsAttached()) {
            peridotite.attabal.attabal("ModifierLocal accessed from an unattached node");
        }
        int iAttabal = saran.attabal(32);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern parent = getNode().getParent();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(this);
        while (layoutNodeImpromptu != null) {
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iAttabal) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iAttabal) != 0) {
                        ?? Beachfront = parent;
                        ?? dernVar2 = 0;
                        while (Beachfront != 0) {
                            if (Beachfront instanceof competently) {
                                competently competentlyVar = (competently) Beachfront;
                                if (competentlyVar.arytenoidectomy().attabal(dernVar)) {
                                    return (T) competentlyVar.arytenoidectomy().saneness(dernVar);
                                }
                            } else if ((Beachfront.getKindSet() & iAttabal) != 0 && (Beachfront instanceof androidx.compose.ui.node.competently)) {
                                androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) Beachfront).getDelegate();
                                int i = 0;
                                Beachfront = Beachfront;
                                dernVar2 = dernVar2;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dernVar2 = dernVar2;
                                            Beachfront = delegate;
                                        } else {
                                            if (dernVar2 == 0) {
                                                dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (Beachfront != 0) {
                                                dernVar2.saneness(Beachfront);
                                                Beachfront = 0;
                                            }
                                            dernVar2.saneness(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    Beachfront = Beachfront;
                                    dernVar2 = dernVar2;
                                }
                                if (i == 1) {
                                }
                            }
                            Beachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeImpromptu = layoutNodeImpromptu.permissivist();
            parent = (layoutNodeImpromptu == null || (nodes = layoutNodeImpromptu.getNodes()) == null) ? null : nodes.getTail();
        }
        return dernVar.attabal().invoke();
    }
}
