package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/saneness;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/wireman$attabal;", "block", "attabal", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class attabal {
    public static final <T> T attabal(FocusTargetNode focusTargetNode, int i, Function1<? super androidx.compose.ui.layout.wireman.attabal, ? extends T> function1) {
        androidx.compose.ui.attabal.dern dernVarBeachfront;
        androidx.compose.ui.layout.wireman wiremanVarPalmyra;
        int iDern;
        seminary nodes;
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.attabal.dern parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeImpromptu == null) {
                dernVarBeachfront = null;
                break;
            }
            if ((layoutNodeImpromptu.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getAggregateChildKindSet() & iAttabal) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iAttabal) != 0) {
                        dernVarBeachfront = parent;
                        androidx.compose.runtime.collection.dern dernVar = null;
                        while (dernVarBeachfront != null) {
                            if (dernVarBeachfront instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i2 = 0;
                                for (androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iAttabal) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            dernVarBeachfront = delegate;
                                        } else {
                                            if (dernVar == null) {
                                                dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                            }
                                            if (dernVarBeachfront != null) {
                                                dernVar.saneness(dernVarBeachfront);
                                                dernVarBeachfront = null;
                                            }
                                            dernVar.saneness(delegate);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeImpromptu = layoutNodeImpromptu.permissivist();
            parent = (layoutNodeImpromptu == null || (nodes = layoutNodeImpromptu.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) dernVarBeachfront;
        if ((focusTargetNode2 != null && Intrinsics.wireman(focusTargetNode2.palmyra(), focusTargetNode.palmyra())) || (wiremanVarPalmyra = focusTargetNode.palmyra()) == null) {
            return null;
        }
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.impromptu())) {
            iDern = androidx.compose.ui.layout.wireman.saneness.INSTANCE.attabal();
        } else if (saneness.formularize(i, companion.attabal())) {
            iDern = androidx.compose.ui.layout.wireman.saneness.INSTANCE.wireman();
        } else if (saneness.formularize(i, companion.wireman())) {
            iDern = androidx.compose.ui.layout.wireman.saneness.INSTANCE.marial();
        } else if (saneness.formularize(i, companion.competently())) {
            iDern = androidx.compose.ui.layout.wireman.saneness.INSTANCE.beachfront();
        } else if (saneness.formularize(i, companion.marial())) {
            iDern = androidx.compose.ui.layout.wireman.saneness.INSTANCE.saneness();
        } else {
            if (!saneness.formularize(i, companion.beachfront())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iDern = androidx.compose.ui.layout.wireman.saneness.INSTANCE.dern();
        }
        return (T) wiremanVarPalmyra.attabal(iDern, function1);
    }
}
