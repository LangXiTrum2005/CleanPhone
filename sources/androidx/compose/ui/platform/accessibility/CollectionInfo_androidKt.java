package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.apical;
import androidx.compose.ui.semantics.dern;
import androidx.compose.ui.semantics.saneness;
import java.util.ArrayList;
import java.util.List;
import outmarry.rotuma;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import supplicat.competently;
import supplicat.impromptu;

/* JADX INFO: compiled from: CollectionInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Loutmarry/rotuma;", "info", "", "wireman", "(Landroidx/compose/ui/semantics/SemanticsNode;Loutmarry/rotuma;)V", "marial", "", "saneness", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "", "items", "attabal", "(Ljava/util/List;)Z", "Landroidx/compose/ui/semantics/saneness;", "Loutmarry/rotuma$marial;", "kotlin.jvm.PlatformType", "beachfront", "(Landroidx/compose/ui/semantics/saneness;)Loutmarry/rotuma$marial;", "Landroidx/compose/ui/semantics/dern;", "itemNode", "Loutmarry/rotuma$beachfront;", "competently", "(Landroidx/compose/ui/semantics/dern;Landroidx/compose/ui/semantics/SemanticsNode;)Loutmarry/rotuma$beachfront;", "dern", "(Landroidx/compose/ui/semantics/saneness;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CollectionInfo_androidKt {
    public static final boolean attabal(List<SemanticsNode> list) {
        List listFormularize;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listFormularize = adultoid.formularize();
        } else {
            listFormularize = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int iTriweekly = adultoid.triweekly(list);
            int i = 0;
            while (i < iTriweekly) {
                i++;
                SemanticsNode semanticsNode2 = list.get(i);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                listFormularize.add(competently.wireman(impromptu.attabal(Math.abs(competently.apical(semanticsNode4.taiyuan().wireman()) - competently.apical(semanticsNode3.taiyuan().wireman())), Math.abs(competently.formularize(semanticsNode4.taiyuan().wireman()) - competently.formularize(semanticsNode3.taiyuan().wireman())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (listFormularize.size() == 1) {
            packedValue = ((competently) CollectionsKt.lerp(listFormularize)).getPackedValue();
        } else {
            if (listFormularize.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objLerp = CollectionsKt.lerp(listFormularize);
            int iTriweekly2 = adultoid.triweekly(listFormularize);
            if (1 <= iTriweekly2) {
                int i2 = 1;
                while (true) {
                    objLerp = competently.wireman(competently.arytenoidectomy(((competently) objLerp).getPackedValue(), ((competently) listFormularize.get(i2)).getPackedValue()));
                    if (i2 == iTriweekly2) {
                        break;
                    }
                    i2++;
                }
            }
            packedValue = ((competently) objLerp).getPackedValue();
        }
        return competently.formularize(packedValue) < competently.apical(packedValue);
    }

    public static final rotuma.marial beachfront(saneness sanenessVar) {
        return rotuma.marial.saneness(sanenessVar.getRowCount(), sanenessVar.getColumnCount(), false, 0);
    }

    public static final rotuma.beachfront competently(dern dernVar, SemanticsNode semanticsNode) {
        return rotuma.beachfront.attabal(dernVar.getRowIndex(), dernVar.getRowSpan(), dernVar.getColumnIndex(), dernVar.getColumnSpan(), false, ((Boolean) semanticsNode.triweekly().taiyuan(SemanticsProperties.f7561attabal.rotuma(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }

    public static final boolean dern(saneness sanenessVar) {
        return sanenessVar.getRowCount() < 0 || sanenessVar.getColumnCount() < 0;
    }

    public static final void marial(SemanticsNode semanticsNode, rotuma rotumaVar) {
        apical apicalVarTriweekly = semanticsNode.triweekly();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        dern dernVar = (dern) SemanticsConfigurationKt.attabal(apicalVarTriweekly, semanticsProperties.saneness());
        if (dernVar != null) {
            rotumaVar.gusty(competently(dernVar, semanticsNode));
        }
        SemanticsNode semanticsNodePolloi = semanticsNode.polloi();
        if (semanticsNodePolloi == null || SemanticsConfigurationKt.attabal(semanticsNodePolloi.triweekly(), semanticsProperties.gintrap()) == null) {
            return;
        }
        saneness sanenessVar = (saneness) SemanticsConfigurationKt.attabal(semanticsNodePolloi.triweekly(), semanticsProperties.attabal());
        if ((sanenessVar == null || !dern(sanenessVar)) && semanticsNode.triweekly().marial(semanticsProperties.rotuma())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> listGraveside = semanticsNodePolloi.graveside();
            int size = listGraveside.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = listGraveside.get(i2);
                if (semanticsNode2.triweekly().marial(SemanticsProperties.f7561attabal.rotuma())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode().cultivated() < semanticsNode.getLayoutNode().cultivated()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zAttabal = attabal(arrayList);
            rotuma.beachfront beachfrontVarAttabal = rotuma.beachfront.attabal(zAttabal ? 0 : i, 1, zAttabal ? i : 0, 1, false, ((Boolean) semanticsNode.triweekly().taiyuan(SemanticsProperties.f7561attabal.rotuma(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p002kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue());
            if (beachfrontVarAttabal != null) {
                rotumaVar.gusty(beachfrontVarAttabal);
            }
        }
    }

    public static final boolean saneness(SemanticsNode semanticsNode) {
        apical apicalVarTriweekly = semanticsNode.triweekly();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        return (SemanticsConfigurationKt.attabal(apicalVarTriweekly, semanticsProperties.attabal()) == null && SemanticsConfigurationKt.attabal(semanticsNode.triweekly(), semanticsProperties.gintrap()) == null) ? false : true;
    }

    public static final void wireman(SemanticsNode semanticsNode, rotuma rotumaVar) {
        apical apicalVarTriweekly = semanticsNode.triweekly();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        saneness sanenessVar = (saneness) SemanticsConfigurationKt.attabal(apicalVarTriweekly, semanticsProperties.attabal());
        if (sanenessVar != null) {
            rotumaVar.igbo(beachfront(sanenessVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.attabal(semanticsNode.triweekly(), semanticsProperties.gintrap()) != null) {
            List<SemanticsNode> listGraveside = semanticsNode.graveside();
            int size = listGraveside.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = listGraveside.get(i);
                if (semanticsNode2.triweekly().marial(SemanticsProperties.f7561attabal.rotuma())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zAttabal = attabal(arrayList);
        rotumaVar.igbo(rotuma.marial.saneness(zAttabal ? 1 : arrayList.size(), zAttabal ? arrayList.size() : 1, false, 0));
    }
}
