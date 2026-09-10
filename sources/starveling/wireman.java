package starveling;

import androidx.collection.seminary;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0016J%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001a\u0010$\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lstarveling/wireman;", "", "Landroidx/compose/ui/layout/competently;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/competently;)V", "Lstarveling/graveside;", "pointerId", "", "Landroidx/compose/ui/attabal$dern;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "", "attabal", "(JLjava/util/List;Z)V", "Lstarveling/marial;", "internalPointerEvent", "isInBounds", "dern", "(Lstarveling/marial;Z)Z", "saneness", "()V", "wireman", "marial", "", "Landroidx/collection/seminary;", "Lstarveling/cutely;", "hitNodes", "beachfront", "(JLandroidx/collection/seminary;)V", "Landroidx/compose/ui/layout/competently;", "Lstarveling/apical;", "Lstarveling/apical;", "getRoot$ui_release", "()Lstarveling/apical;", "root", "Landroidx/collection/supplicat;", "Landroidx/collection/supplicat;", "hitPointerIdsAndNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.layout.competently rootCoordinates;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final apical root = new apical();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.supplicat<seminary<Node>> hitPointerIdsAndNodes = new androidx.collection.supplicat<>(10);

    public wireman(androidx.compose.ui.layout.competently competentlyVar) {
        this.rootCoordinates = competentlyVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    public final void attabal(long pointerId, List<? extends androidx.compose.ui.attabal.dern> pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        androidx.collection.supplicat<seminary<Node>> supplicatVar;
        seminary<Node> seminaryVarSaneness;
        Node node;
        apical apicalVar = this.root;
        this.hitPointerIdsAndNodes.competently();
        int size = pointerInputNodes.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.attabal.dern dernVar = pointerInputNodes.get(i);
            if (z) {
                androidx.compose.runtime.collection.dern<Node> dernVarCompetently = apicalVar.competently();
                int size2 = dernVarCompetently.getSize();
                if (size2 <= 0) {
                    node = null;
                    break;
                }
                Node[] nodeArrApical = dernVarCompetently.apical();
                int i2 = 0;
                while (true) {
                    node = nodeArrApical[i2];
                    if (Intrinsics.wireman(node.getPointerInputFilter(), dernVar)) {
                        break;
                    }
                    i2++;
                    if (i2 >= size2) {
                        node = null;
                        break;
                    }
                }
                Node node2 = node;
                if (node2 != null) {
                    node2.triweekly();
                    node2.getPointerIds().saneness(pointerId);
                    androidx.collection.supplicat<seminary<Node>> supplicatVar2 = this.hitPointerIdsAndNodes;
                    seminary<Node> seminaryVarSaneness2 = supplicatVar2.saneness(pointerId);
                    if (seminaryVarSaneness2 == null) {
                        seminaryVarSaneness2 = new seminary<>(0, 1, null);
                        supplicatVar2.kowloon(pointerId, seminaryVarSaneness2);
                    }
                    seminaryVarSaneness2.triweekly(node2);
                    apicalVar = node2;
                } else {
                    z = false;
                    Node node3 = new Node(dernVar);
                    node3.getPointerIds().saneness(pointerId);
                    supplicatVar = this.hitPointerIdsAndNodes;
                    seminaryVarSaneness = supplicatVar.saneness(pointerId);
                    if (seminaryVarSaneness == null) {
                        seminaryVarSaneness = new seminary<>(0, 1, null);
                        supplicatVar.kowloon(pointerId, seminaryVarSaneness);
                    }
                    seminaryVarSaneness.triweekly(node3);
                    apicalVar.competently().saneness(node3);
                    apicalVar = node3;
                }
            } else {
                Node node4 = new Node(dernVar);
                node4.getPointerIds().saneness(pointerId);
                supplicatVar = this.hitPointerIdsAndNodes;
                seminaryVarSaneness = supplicatVar.saneness(pointerId);
                if (seminaryVarSaneness == null) {
                    seminaryVarSaneness = new seminary<>(0, 1, null);
                    supplicatVar.kowloon(pointerId, seminaryVarSaneness);
                }
                seminaryVarSaneness.triweekly(node4);
                apicalVar.competently().saneness(node4);
                apicalVar = node4;
            }
        }
        if (!prunePointerIdsAndChangesNotInNodesList) {
            return;
        }
        androidx.collection.supplicat<seminary<Node>> supplicatVar3 = this.hitPointerIdsAndNodes;
        long[] jArr = supplicatVar3.keys;
        Object[] objArr = supplicatVar3.values;
        long[] jArr2 = supplicatVar3.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr2[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i3 << 3) + i5;
                        beachfront(jArr[i6], (seminary) objArr[i6]);
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void beachfront(long pointerId, seminary<Node> hitNodes) {
        this.root.taiyuan(pointerId, hitNodes);
    }

    public final boolean dern(marial internalPointerEvent, boolean isInBounds) {
        if (this.root.attabal(internalPointerEvent.saneness(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return this.root.marial(internalPointerEvent) || this.root.beachfront(internalPointerEvent.saneness(), this.rootCoordinates, internalPointerEvent, isInBounds);
        }
        return false;
    }

    public final void marial() {
        this.root.impromptu();
    }

    public final void saneness() {
        this.root.dern();
    }

    public final void wireman() {
        this.root.wireman();
        saneness();
    }
}
