package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R'\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001cj\b\u0012\u0004\u0012\u00020\u0006`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "saneness", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "attabal", "(Landroidx/compose/ui/node/LayoutNode;)V", "beachfront", "marial", "()Landroidx/compose/ui/node/LayoutNode;", "wireman", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "", "", "Lpatroclinal/taiyuan;", "dern", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "Landroidx/compose/ui/node/TreeSet;", "Landroidx/compose/ui/node/TreeSet;", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DepthSortedSet {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean extraAssertions;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Comparator<LayoutNode> DepthComparator;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan mapOfOriginalDepth = p002kotlin.saneness.attabal(LazyThreadSafetyMode.NONE, new Function0<Map<LayoutNode, Integer>>() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
        @Override // p002kotlin.jvm.functions.Function0
        public final Map<LayoutNode, Integer> invoke() {
            return new LinkedHashMap();
        }
    });

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final TreeSet<LayoutNode> set;

    /* JADX INFO: compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/node/DepthSortedSet$attabal", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "l1", "l2", "", "attabal", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements Comparator<LayoutNode> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(LayoutNode l1, LayoutNode l2) {
            int iTaiyuan = Intrinsics.taiyuan(l1.getDepth(), l2.getDepth());
            return iTaiyuan != 0 ? iTaiyuan : Intrinsics.taiyuan(l1.hashCode(), l2.hashCode());
        }
    }

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
        attabal attabalVar = new attabal();
        this.DepthComparator = attabalVar;
        this.set = new TreeSet<>(attabalVar);
    }

    public final void attabal(LayoutNode node) {
        if (!node.picketboat()) {
            peridotite.attabal.saneness("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            Integer num = dern().get(node);
            if (num == null) {
                dern().put(node, Integer.valueOf(node.getDepth()));
            } else {
                if (!(num.intValue() == node.getDepth())) {
                    peridotite.attabal.saneness("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean beachfront(LayoutNode node) {
        if (!node.picketboat()) {
            peridotite.attabal.saneness("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            if (!Intrinsics.wireman(dern().remove(node), zRemove ? Integer.valueOf(node.getDepth()) : null)) {
                peridotite.attabal.saneness("invalid node depth");
            }
        }
        return zRemove;
    }

    public final Map<LayoutNode, Integer> dern() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final LayoutNode marial() {
        LayoutNode layoutNodeFirst = this.set.first();
        beachfront(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final boolean saneness(LayoutNode node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == dern().containsKey(node))) {
                peridotite.attabal.saneness("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public String toString() {
        return this.set.toString();
    }

    public final boolean wireman() {
        return this.set.isEmpty();
    }
}
