package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.premeiotic;
import androidx.compose.ui.node.saran;
import androidx.compose.ui.node.seminary;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/SemanticsNode;", "attabal", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Function1;", "selector", "beachfront", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "", "marial", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "taiyuan", "Landroidx/compose/ui/node/premeiotic;", "competently", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/premeiotic;", "outerMergingSemantics", "Landroidx/compose/ui/semantics/impromptu;", "impromptu", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/impromptu;", "role", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class triweekly {
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a A[EDGE_INSN: B:41:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    public static final SemanticsNode attabal(LayoutNode layoutNode, boolean z) {
        seminary nodes = layoutNode.getNodes();
        int iAttabal = saran.attabal(8);
        Object obj = null;
        if ((nodes.taiyuan() & iAttabal) != 0) {
            loop0: for (androidx.compose.ui.attabal.dern head = nodes.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iAttabal) == 0) {
                    if ((head.getAggregateChildKindSet() & iAttabal) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.attabal.dern dernVarBeachfront = head;
                    androidx.compose.runtime.collection.dern dernVar = null;
                    while (dernVarBeachfront != null) {
                        if (dernVarBeachfront instanceof premeiotic) {
                            obj = dernVarBeachfront;
                            break loop0;
                        }
                        if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                            int i = 0;
                            for (androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); dernVarUnderbelly != null; dernVarUnderbelly = dernVarUnderbelly.getChild()) {
                                if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dernVarBeachfront = dernVarUnderbelly;
                                    } else {
                                        if (dernVar == null) {
                                            dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                        }
                                        if (dernVarBeachfront != null) {
                                            dernVar.saneness(dernVarBeachfront);
                                            dernVarBeachfront = null;
                                        }
                                        dernVar.saneness(dernVarUnderbelly);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar);
                    }
                    if ((head.getAggregateChildKindSet() & iAttabal) != 0) {
                        break;
                    }
                }
            }
        }
        Intrinsics.beachfront(obj);
        androidx.compose.ui.attabal.dern node = ((premeiotic) obj).getNode();
        apical apicalVarPreprohormone = layoutNode.preprohormone();
        Intrinsics.beachfront(apicalVarPreprohormone);
        return new SemanticsNode(node, z, layoutNode, apicalVarPreprohormone);
    }

    public static final LayoutNode beachfront(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode layoutNodePermissivist = layoutNode.permissivist(); layoutNodePermissivist != null; layoutNodePermissivist = layoutNodePermissivist.permissivist()) {
            if (function1.invoke(layoutNodePermissivist).booleanValue()) {
                return layoutNodePermissivist;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    public static final premeiotic competently(LayoutNode layoutNode) {
        seminary nodes = layoutNode.getNodes();
        int iAttabal = saran.attabal(8);
        Object obj = null;
        if ((nodes.taiyuan() & iAttabal) != 0) {
            loop0: for (androidx.compose.ui.attabal.dern head = nodes.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iAttabal) == 0) {
                    if ((head.getAggregateChildKindSet() & iAttabal) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.attabal.dern dernVarBeachfront = head;
                    androidx.compose.runtime.collection.dern dernVar = null;
                    while (dernVarBeachfront != null) {
                        if (dernVarBeachfront instanceof premeiotic) {
                            if (((premeiotic) dernVarBeachfront).seminary()) {
                                obj = dernVarBeachfront;
                                break loop0;
                            }
                        } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                            int i = 0;
                            for (androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); dernVarUnderbelly != null; dernVarUnderbelly = dernVarUnderbelly.getChild()) {
                                if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dernVarBeachfront = dernVarUnderbelly;
                                    } else {
                                        if (dernVar == null) {
                                            dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                        }
                                        if (dernVarBeachfront != null) {
                                            dernVar.saneness(dernVarBeachfront);
                                            dernVarBeachfront = null;
                                        }
                                        dernVar.saneness(dernVarUnderbelly);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar);
                    }
                    if ((head.getAggregateChildKindSet() & iAttabal) != 0) {
                        break;
                    }
                }
            }
        }
        return (premeiotic) obj;
    }

    public static final impromptu impromptu(SemanticsNode semanticsNode) {
        return (impromptu) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), SemanticsProperties.f7561attabal.dovishness());
    }

    public static final int marial(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    public static final int taiyuan(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}
