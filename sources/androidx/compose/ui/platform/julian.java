package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import clubfoot.TextLayoutResult;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u0013*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u001eH\u0000¢\u0006\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/semantics/apical;", "configuration", "Lclubfoot/beachfront;", "marial", "(Landroidx/compose/ui/semantics/apical;)Lclubfoot/beachfront;", "", "wireman", "(Landroidx/compose/ui/semantics/apical;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/palmyra;", "", "id", "attabal", "(Ljava/util/List;I)Landroidx/compose/ui/platform/palmyra;", "Landroidx/compose/ui/semantics/impromptu;", "", "taiyuan", "(I)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "competently", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "impromptu", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "node", "beachfront", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/semantics/kowloon;", "Landroidx/collection/kowloon;", "Landroidx/compose/ui/platform/monroe;", "saneness", "(Landroidx/compose/ui/semantics/kowloon;)Landroidx/collection/kowloon;", "Lsupplicat/taiyuan;", "Lsupplicat/taiyuan;", "getDefaultFakeNodeBounds", "()Lsupplicat/taiyuan;", "DefaultFakeNodeBounds", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class julian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final supplicat.taiyuan f7441attabal = new supplicat.taiyuan(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 10.0f);

    public static final palmyra attabal(List<palmyra> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    public static final boolean beachfront(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNodePermissivist = layoutNode2.permissivist();
        if (layoutNodePermissivist == null) {
            return false;
        }
        return Intrinsics.wireman(layoutNodePermissivist, layoutNode) || beachfront(layoutNode, layoutNodePermissivist);
    }

    public static final boolean competently(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig().beachfront();
    }

    public static final void dern(Region region, SemanticsNode semanticsNode, androidx.collection.yemenite<monroe> yemeniteVar, SemanticsNode semanticsNode2, Region region2) {
        androidx.compose.ui.layout.taiyuan taiyuanVarArytenoidectomy;
        boolean z = (semanticsNode2.getLayoutNode().attabal() && semanticsNode2.getLayoutNode().picketboat()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.getIsFake()) {
                supplicat.taiyuan taiyuanVarDovishness = semanticsNode2.dovishness();
                int iRound = Math.round(taiyuanVarDovishness.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String());
                int iRound2 = Math.round(taiyuanVarDovishness.getTop());
                int iRound3 = Math.round(taiyuanVarDovishness.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String());
                int iRound4 = Math.round(taiyuanVarDovishness.getBottom());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (semanticsNode2.getIsFake()) {
                        SemanticsNode semanticsNodePolloi = semanticsNode2.polloi();
                        supplicat.taiyuan taiyuanVarTaiyuan = (semanticsNodePolloi == null || (taiyuanVarArytenoidectomy = semanticsNodePolloi.arytenoidectomy()) == null || !taiyuanVarArytenoidectomy.attabal()) ? f7441attabal : semanticsNodePolloi.taiyuan();
                        yemeniteVar.molybdenite(id, new monroe(semanticsNode2, new Rect(Math.round(taiyuanVarTaiyuan.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String()), Math.round(taiyuanVarTaiyuan.getTop()), Math.round(taiyuanVarTaiyuan.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(taiyuanVarTaiyuan.getBottom()))));
                        return;
                    } else {
                        if (id == -1) {
                            yemeniteVar.molybdenite(id, new monroe(semanticsNode2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                yemeniteVar.molybdenite(id, new monroe(semanticsNode2, region2.getBounds()));
                List<SemanticsNode> listGraveside = semanticsNode2.graveside();
                for (int size = listGraveside.size() - 1; -1 < size; size--) {
                    dern(region, semanticsNode, yemeniteVar, listGraveside.get(size), region2);
                }
                if (competently(semanticsNode2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final View impromptu(AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final TextLayoutResult marial(androidx.compose.ui.semantics.apical apicalVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(apicalVar, androidx.compose.ui.semantics.cutely.f7617attabal.taiyuan());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.attabal()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final androidx.collection.kowloon<monroe> saneness(androidx.compose.ui.semantics.kowloon kowloonVar) {
        SemanticsNode semanticsNodeAttabal = kowloonVar.attabal();
        androidx.collection.yemenite yemeniteVarSaneness = androidx.collection.arytenoidectomy.saneness();
        if (semanticsNodeAttabal.getLayoutNode().attabal() && semanticsNodeAttabal.getLayoutNode().picketboat()) {
            supplicat.taiyuan taiyuanVarTaiyuan = semanticsNodeAttabal.taiyuan();
            dern(new Region(Math.round(taiyuanVarTaiyuan.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String()), Math.round(taiyuanVarTaiyuan.getTop()), Math.round(taiyuanVarTaiyuan.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(taiyuanVarTaiyuan.getBottom())), semanticsNodeAttabal, yemeniteVarSaneness, semanticsNodeAttabal, new Region());
        }
        return yemeniteVarSaneness;
    }

    public static final String taiyuan(int i) {
        androidx.compose.ui.semantics.impromptu.Companion companion = androidx.compose.ui.semantics.impromptu.INSTANCE;
        if (androidx.compose.ui.semantics.impromptu.apical(i, companion.attabal())) {
            return "android.widget.Button";
        }
        if (androidx.compose.ui.semantics.impromptu.apical(i, companion.saneness())) {
            return "android.widget.CheckBox";
        }
        if (androidx.compose.ui.semantics.impromptu.apical(i, companion.marial())) {
            return "android.widget.RadioButton";
        }
        if (androidx.compose.ui.semantics.impromptu.apical(i, companion.wireman())) {
            return "android.widget.ImageView";
        }
        if (androidx.compose.ui.semantics.impromptu.apical(i, companion.dern())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final Float wireman(androidx.compose.ui.semantics.apical apicalVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.attabal(apicalVar, androidx.compose.ui.semantics.cutely.f7617attabal.impromptu());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.attabal()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }
}
