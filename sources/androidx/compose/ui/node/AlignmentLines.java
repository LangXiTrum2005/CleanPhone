package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLineKt;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\u001e\u0010\u0017\u001a\u00020\u0015*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H$ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Landroidx/compose/ui/node/attabal;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/attabal;)V", "", "kowloon", "()V", "", "Landroidx/compose/ui/layout/attabal;", "", "impromptu", "()Ljava/util/Map;", "Landroidx/compose/ui/node/NodeCoordinator;", "alignmentLine", "taiyuan", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/attabal;)I", "triweekly", "arytenoidectomy", "impassible", "Lsupplicat/competently;", X3.i.L, "wireman", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "initialPosition", "initialCoordinator", "dern", "(Landroidx/compose/ui/layout/attabal;ILandroidx/compose/ui/node/NodeCoordinator;)V", "attabal", "Landroidx/compose/ui/node/attabal;", "beachfront", "()Landroidx/compose/ui/node/attabal;", "", "saneness", "Z", "competently", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "adultoid", "usedDuringParentMeasurement", "formularize", "graveside", "usedDuringParentLayout", "marial", "getPreviousUsedDuringParentLayout$ui_release", "monoploid", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "molybdenite", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "polloi", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "cutely", "queried", "apical", "required", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/preprohormone;", "Landroidx/compose/ui/node/oilcan;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final attabal alignmentLinesOwner;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean usedByModifierMeasurement;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean usedByModifierLayout;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean usedDuringParentMeasurement;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public attabal queryOwner;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean previousUsedDuringParentLayout;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean dirty;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final Map<androidx.compose.ui.layout.attabal, Integer> alignmentLineMap;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean usedDuringParentLayout;

    public /* synthetic */ AlignmentLines(attabal attabalVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar);
    }

    public final void adultoid(boolean z) {
        this.usedDuringParentMeasurement = z;
    }

    public final boolean apical() {
        kowloon();
        return this.queryOwner != null;
    }

    public final void arytenoidectomy() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final attabal getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final boolean cutely() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final void dern(androidx.compose.ui.layout.attabal alignmentLine, int initialPosition, NodeCoordinator initialCoordinator) {
        float f = initialPosition;
        long jAttabal = supplicat.impromptu.attabal(f, f);
        while (true) {
            jAttabal = wireman(initialCoordinator, jAttabal);
            initialCoordinator = initialCoordinator.getWrappedBy();
            Intrinsics.beachfront(initialCoordinator);
            if (Intrinsics.wireman(initialCoordinator, this.alignmentLinesOwner.cuirassed())) {
                break;
            } else if (marial(initialCoordinator).containsKey(alignmentLine)) {
                float fTaiyuan = taiyuan(initialCoordinator, alignmentLine);
                jAttabal = supplicat.impromptu.attabal(fTaiyuan, fTaiyuan);
            }
        }
        int iRound = Math.round(alignmentLine instanceof androidx.compose.ui.layout.marial ? supplicat.competently.formularize(jAttabal) : supplicat.competently.apical(jAttabal));
        Map<androidx.compose.ui.layout.attabal, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = AlignmentLineKt.attabal(alignmentLine, ((Number) p002kotlin.collections.seminary.cutely(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public final void graveside(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void impassible() {
        this.dirty = true;
        attabal attabalVarFormularize = this.alignmentLinesOwner.formularize();
        if (attabalVarFormularize == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            attabalVarFormularize.hydrovane();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            attabalVarFormularize.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.hydrovane();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        attabalVarFormularize.getAlignmentLines().impassible();
    }

    public final Map<androidx.compose.ui.layout.attabal, Integer> impromptu() {
        return this.alignmentLineMap;
    }

    public final void kowloon() {
        attabal attabalVar;
        AlignmentLines alignmentLinesSaneness;
        AlignmentLines alignmentLinesSaneness2;
        if (cutely()) {
            attabalVar = this.alignmentLinesOwner;
        } else {
            attabal attabalVarFormularize = this.alignmentLinesOwner.formularize();
            if (attabalVarFormularize == null) {
                return;
            }
            attabalVar = attabalVarFormularize.getAlignmentLines().queryOwner;
            if (attabalVar == null || !attabalVar.getAlignmentLines().cutely()) {
                attabal attabalVar2 = this.queryOwner;
                if (attabalVar2 == null || attabalVar2.getAlignmentLines().cutely()) {
                    return;
                }
                attabal attabalVarFormularize2 = attabalVar2.formularize();
                if (attabalVarFormularize2 != null && (alignmentLinesSaneness2 = attabalVarFormularize2.getAlignmentLines()) != null) {
                    alignmentLinesSaneness2.kowloon();
                }
                attabal attabalVarFormularize3 = attabalVar2.formularize();
                attabalVar = (attabalVarFormularize3 == null || (alignmentLinesSaneness = attabalVarFormularize3.getAlignmentLines()) == null) ? null : alignmentLinesSaneness.queryOwner;
            }
        }
        this.queryOwner = attabalVar;
    }

    public abstract Map<androidx.compose.ui.layout.attabal, Integer> marial(NodeCoordinator nodeCoordinator);

    public final void molybdenite(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public final void monoploid(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void polloi(boolean z) {
        this.usedByModifierLayout = z;
    }

    public abstract int taiyuan(NodeCoordinator nodeCoordinator, androidx.compose.ui.layout.attabal attabalVar);

    public final void triweekly() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.grimness(new Function1<attabal, Unit>() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(attabal attabalVar) {
                invoke2(attabalVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(attabal attabalVar) {
                if (attabalVar.getIsPlaced()) {
                    if (attabalVar.getAlignmentLines().getDirty()) {
                        attabalVar.molybdenite();
                    }
                    Map map = attabalVar.getAlignmentLines().alignmentLineMap;
                    AlignmentLines alignmentLines = this.this$0;
                    for (Map.Entry entry : map.entrySet()) {
                        alignmentLines.dern((androidx.compose.ui.layout.attabal) entry.getKey(), ((Number) entry.getValue()).intValue(), attabalVar.cuirassed());
                    }
                    NodeCoordinator wrappedBy = attabalVar.cuirassed().getWrappedBy();
                    Intrinsics.beachfront(wrappedBy);
                    while (!Intrinsics.wireman(wrappedBy, this.this$0.getAlignmentLinesOwner().cuirassed())) {
                        Set<androidx.compose.ui.layout.attabal> setKeySet = this.this$0.marial(wrappedBy).keySet();
                        AlignmentLines alignmentLines2 = this.this$0;
                        for (androidx.compose.ui.layout.attabal attabalVar2 : setKeySet) {
                            alignmentLines2.dern(attabalVar2, alignmentLines2.taiyuan(wrappedBy, attabalVar2), wrappedBy);
                        }
                        wrappedBy = wrappedBy.getWrappedBy();
                        Intrinsics.beachfront(wrappedBy);
                    }
                }
            }
        });
        this.alignmentLineMap.putAll(marial(this.alignmentLinesOwner.cuirassed()));
        this.dirty = false;
    }

    public abstract long wireman(NodeCoordinator nodeCoordinator, long j);

    public AlignmentLines(attabal attabalVar) {
        this.alignmentLinesOwner = attabalVar;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
