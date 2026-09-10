package androidx.compose.ui.node;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001:\u0002CHB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u0010\u000eJ\u000f\u00109\u001a\u00020\fH\u0000¢\u0006\u0004\b9\u0010\u000eJ\u001e\u0010<\u001a\u00020\u00162\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:H\u0000ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0004\b?\u0010=J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010L\u001a\u00020G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010R\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bW\u0010\bR\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010YR\u001c\u0010]\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\\R\u0014\u0010`\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Landroidx/compose/ui/node/seminary;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/attabal$dern;", "adultoid", "()Landroidx/compose/ui/attabal$dern;", "paddedHead", "oilcan", "(Landroidx/compose/ui/attabal$dern;)Landroidx/compose/ui/attabal$dern;", "", "stratoscope", "()V", TtmlNode.TAG_HEAD, "", "offset", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/ui/attabal$saneness;", "before", "after", "", "shouldAttachOnInsert", "Landroidx/compose/ui/node/seminary$attabal;", "cutely", "(Landroidx/compose/ui/attabal$dern;ILandroidx/compose/runtime/collection/dern;Landroidx/compose/runtime/collection/dern;Z)Landroidx/compose/ui/node/seminary$attabal;", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "dovishness", "(Landroidx/compose/ui/attabal$dern;Landroidx/compose/ui/node/NodeCoordinator;)V", "tail", "cuirassed", "(ILandroidx/compose/runtime/collection/dern;Landroidx/compose/runtime/collection/dern;Landroidx/compose/ui/attabal$dern;Z)V", "node", "impromptu", "gintrap", "element", "parent", "competently", "(Landroidx/compose/ui/attabal$saneness;Landroidx/compose/ui/attabal$dern;)Landroidx/compose/ui/attabal$dern;", "polloi", "(Landroidx/compose/ui/attabal$dern;Landroidx/compose/ui/attabal$dern;)Landroidx/compose/ui/attabal$dern;", "prev", "next", "sealless", "(Landroidx/compose/ui/attabal$saneness;Landroidx/compose/ui/attabal$saneness;Landroidx/compose/ui/attabal$dern;)V", "Landroidx/compose/ui/attabal;", "m", "yemenite", "(Landroidx/compose/ui/attabal;)V", "rotuma", "trm", "molybdenite", "preprohormone", "graveside", "cord", "Landroidx/compose/ui/node/saran;", "type", "monoploid", "(I)Z", "mask", "arytenoidectomy", "", "toString", "()Ljava/lang/String;", "attabal", "Landroidx/compose/ui/node/LayoutNode;", "impassible", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/arytenoidectomy;", "saneness", "Landroidx/compose/ui/node/arytenoidectomy;", "formularize", "()Landroidx/compose/ui/node/arytenoidectomy;", "innerCoordinator", "<set-?>", "dern", "Landroidx/compose/ui/node/NodeCoordinator;", "triweekly", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "wireman", "Landroidx/compose/ui/attabal$dern;", "kowloon", "marial", "apical", "beachfront", "Landroidx/compose/runtime/collection/dern;", "current", "buffer", "Landroidx/compose/ui/node/seminary$attabal;", "cachedDiffer", "taiyuan", "()I", "aggregateChildKindSet", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> current;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> buffer;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public NodeCoordinator outerCoordinator;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public attabal cachedDiffer;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.attabal.dern head;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final arytenoidectomy innerCoordinator;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.attabal.dern tail;

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/node/seminary$attabal;", "Landroidx/compose/ui/node/taiyuan;", "Landroidx/compose/ui/attabal$dern;", "node", "", "offset", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/ui/attabal$saneness;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Landroidx/compose/ui/node/seminary;Landroidx/compose/ui/attabal$dern;ILandroidx/compose/runtime/collection/dern;Landroidx/compose/runtime/collection/dern;Z)V", "oldIndex", "newIndex", "saneness", "(II)Z", "", "dern", "(I)V", "atIndex", "attabal", "(II)V", "wireman", "Landroidx/compose/ui/attabal$dern;", "getNode", "()Landroidx/compose/ui/attabal$dern;", "competently", "(Landroidx/compose/ui/attabal$dern;)V", "I", "getOffset", "()I", "impromptu", "Landroidx/compose/runtime/collection/dern;", "getBefore", "()Landroidx/compose/runtime/collection/dern;", "beachfront", "(Landroidx/compose/runtime/collection/dern;)V", "getAfter", "marial", "Z", "getShouldAttachOnInsert", "()Z", "taiyuan", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class attabal implements taiyuan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public androidx.compose.ui.attabal.dern node;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> before;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public boolean shouldAttachOnInsert;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public int offset;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> after;

        public attabal(androidx.compose.ui.attabal.dern dernVar, int i, androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar2, androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar3, boolean z) {
            this.node = dernVar;
            this.offset = i;
            this.before = dernVar2;
            this.after = dernVar3;
            this.shouldAttachOnInsert = z;
        }

        @Override // androidx.compose.ui.node.taiyuan
        public void attabal(int atIndex, int oldIndex) {
            androidx.compose.ui.attabal.dern child = this.node.getChild();
            Intrinsics.beachfront(child);
            seminary.wireman(seminary.this);
            if ((saran.attabal(2) & child.getKindSet()) != 0) {
                NodeCoordinator coordinator = child.getCoordinator();
                Intrinsics.beachfront(coordinator);
                NodeCoordinator wrappedBy = coordinator.getWrappedBy();
                NodeCoordinator wrapped = coordinator.getWrapped();
                Intrinsics.beachfront(wrapped);
                if (wrappedBy != null) {
                    wrappedBy.strother(wrapped);
                }
                wrapped.philabeg(wrappedBy);
                seminary.this.dovishness(this.node, wrapped);
            }
            this.node = seminary.this.impromptu(child);
        }

        public final void beachfront(androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar) {
            this.before = dernVar;
        }

        public final void competently(androidx.compose.ui.attabal.dern dernVar) {
            this.node = dernVar;
        }

        @Override // androidx.compose.ui.node.taiyuan
        public void dern(int newIndex) {
            int i = this.offset + newIndex;
            this.node = seminary.this.competently(this.after.apical()[i], this.node);
            seminary.wireman(seminary.this);
            if (!this.shouldAttachOnInsert) {
                this.node.nosophobia(true);
                return;
            }
            androidx.compose.ui.attabal.dern child = this.node.getChild();
            Intrinsics.beachfront(child);
            NodeCoordinator coordinator = child.getCoordinator();
            Intrinsics.beachfront(coordinator);
            graveside gravesideVarWireman = beachfront.wireman(this.node);
            if (gravesideVarWireman != null) {
                adultoid adultoidVar = new adultoid(seminary.this.getLayoutNode(), gravesideVarWireman);
                this.node.sensatory(adultoidVar);
                seminary.this.dovishness(this.node, adultoidVar);
                adultoidVar.philabeg(coordinator.getWrappedBy());
                adultoidVar.strother(coordinator);
                coordinator.philabeg(adultoidVar);
            } else {
                this.node.sensatory(coordinator);
            }
            this.node.dent();
            this.node.treadless();
            privatdozent.attabal(this.node);
        }

        public final void impromptu(int i) {
            this.offset = i;
        }

        public final void marial(androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar) {
            this.after = dernVar;
        }

        @Override // androidx.compose.ui.node.taiyuan
        public boolean saneness(int oldIndex, int newIndex) {
            return NodeChainKt.wireman(this.before.apical()[this.offset + oldIndex], this.after.apical()[this.offset + newIndex]) != 0;
        }

        public final void taiyuan(boolean z) {
            this.shouldAttachOnInsert = z;
        }

        @Override // androidx.compose.ui.node.taiyuan
        public void wireman(int oldIndex, int newIndex) {
            androidx.compose.ui.attabal.dern child = this.node.getChild();
            Intrinsics.beachfront(child);
            this.node = child;
            androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar = this.before;
            androidx.compose.ui.attabal.saneness sanenessVar = dernVar.apical()[this.offset + oldIndex];
            androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar2 = this.after;
            androidx.compose.ui.attabal.saneness sanenessVar2 = dernVar2.apical()[this.offset + newIndex];
            if (Intrinsics.wireman(sanenessVar, sanenessVar2)) {
                seminary.wireman(seminary.this);
            } else {
                seminary.this.sealless(sanenessVar, sanenessVar2, this.node);
                seminary.wireman(seminary.this);
            }
        }
    }

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/seminary$saneness;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface saneness {
    }

    public seminary(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        arytenoidectomy arytenoidectomyVar = new arytenoidectomy(layoutNode);
        this.innerCoordinator = arytenoidectomyVar;
        this.outerCoordinator = arytenoidectomyVar;
        treadless treadlessVarGarter = arytenoidectomyVar.puffin();
        this.tail = treadlessVarGarter;
        this.head = treadlessVarGarter;
    }

    public static final /* synthetic */ saneness wireman(seminary seminaryVar) {
        seminaryVar.getClass();
        return null;
    }

    public final androidx.compose.ui.attabal.dern adultoid() {
        if (!(this.head != NodeChainKt.f6939attabal)) {
            peridotite.attabal.saneness("padChain called on already padded chain");
        }
        androidx.compose.ui.attabal.dern dernVar = this.head;
        dernVar.empress(NodeChainKt.f6939attabal);
        NodeChainKt.f6939attabal.lerp(dernVar);
        return NodeChainKt.f6939attabal;
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final androidx.compose.ui.attabal.dern getHead() {
        return this.head;
    }

    public final boolean arytenoidectomy(int mask) {
        return (mask & taiyuan()) != 0;
    }

    public final androidx.compose.ui.attabal.dern competently(androidx.compose.ui.attabal.saneness element, androidx.compose.ui.attabal.dern parent) {
        androidx.compose.ui.attabal.dern backwardsCompatNode;
        if (element instanceof kattegat) {
            backwardsCompatNode = ((kattegat) element).polloi();
            backwardsCompatNode.lotta(privatdozent.impromptu(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.getIsAttached()) {
            peridotite.attabal.saneness("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.nosophobia(true);
        return polloi(backwardsCompatNode, parent);
    }

    public final void cord() {
        for (androidx.compose.ui.attabal.dern tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.itchy();
            }
        }
    }

    public final void cuirassed(int offset, androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> before, androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> after, androidx.compose.ui.attabal.dern tail, boolean shouldAttachOnInsert) {
        merc.marial(before.getSize() - offset, after.getSize() - offset, cutely(tail, offset, before, after, shouldAttachOnInsert));
        stratoscope();
    }

    public final attabal cutely(androidx.compose.ui.attabal.dern head, int offset, androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> before, androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> after, boolean shouldAttachOnInsert) {
        attabal attabalVar = this.cachedDiffer;
        if (attabalVar == null) {
            attabal attabalVar2 = new attabal(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = attabalVar2;
            return attabalVar2;
        }
        attabalVar.competently(head);
        attabalVar.impromptu(offset);
        attabalVar.beachfront(before);
        attabalVar.marial(after);
        attabalVar.taiyuan(shouldAttachOnInsert);
        return attabalVar;
    }

    public final void dovishness(androidx.compose.ui.attabal.dern start, NodeCoordinator coordinator) {
        for (androidx.compose.ui.attabal.dern parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == NodeChainKt.f6939attabal) {
                LayoutNode layoutNodePermissivist = this.layoutNode.permissivist();
                coordinator.philabeg(layoutNodePermissivist != null ? layoutNodePermissivist.yemenite() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((saran.attabal(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.sensatory(coordinator);
            }
        }
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final arytenoidectomy getInnerCoordinator() {
        return this.innerCoordinator;
    }

    public final androidx.compose.ui.attabal.dern gintrap(androidx.compose.ui.attabal.dern node) {
        androidx.compose.ui.attabal.dern child = node.getChild();
        androidx.compose.ui.attabal.dern parent = node.getParent();
        if (child != null) {
            child.empress(parent);
            node.lerp(null);
        }
        if (parent != null) {
            parent.lerp(child);
            node.empress(null);
        }
        Intrinsics.beachfront(parent);
        return parent;
    }

    public final void graveside() {
        for (androidx.compose.ui.attabal.dern tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.permissivist();
            }
        }
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final androidx.compose.ui.attabal.dern impromptu(androidx.compose.ui.attabal.dern node) {
        if (node.getIsAttached()) {
            privatdozent.wireman(node);
            node.itchy();
            node.permissivist();
        }
        return gintrap(node);
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final androidx.compose.ui.attabal.dern getTail() {
        return this.tail;
    }

    public final void molybdenite() {
        for (androidx.compose.ui.attabal.dern head = getHead(); head != null; head = head.getChild()) {
            head.dent();
        }
    }

    public final boolean monoploid(int type) {
        return (type & taiyuan()) != 0;
    }

    public final androidx.compose.ui.attabal.dern oilcan(androidx.compose.ui.attabal.dern paddedHead) {
        if (!(paddedHead == NodeChainKt.f6939attabal)) {
            peridotite.attabal.saneness("trimChain called on already trimmed chain");
        }
        androidx.compose.ui.attabal.dern child = NodeChainKt.f6939attabal.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.empress(null);
        NodeChainKt.f6939attabal.lerp(null);
        NodeChainKt.f6939attabal.coffeecake(-1);
        NodeChainKt.f6939attabal.sensatory(null);
        if (!(child != NodeChainKt.f6939attabal)) {
            peridotite.attabal.saneness("trimChain did not update the head");
        }
        return child;
    }

    public final androidx.compose.ui.attabal.dern polloi(androidx.compose.ui.attabal.dern node, androidx.compose.ui.attabal.dern parent) {
        androidx.compose.ui.attabal.dern child = parent.getChild();
        if (child != null) {
            child.empress(node);
            node.lerp(child);
        }
        parent.lerp(node);
        node.empress(parent);
        return node;
    }

    public final void preprohormone() {
        for (androidx.compose.ui.attabal.dern head = getHead(); head != null; head = head.getChild()) {
            head.treadless();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                privatdozent.attabal(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                privatdozent.marial(head);
            }
            head.nosophobia(false);
            head.coi(false);
        }
    }

    public final void rotuma() {
        for (androidx.compose.ui.attabal.dern tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.milliradian();
            }
        }
        cord();
        graveside();
    }

    public final void sealless(androidx.compose.ui.attabal.saneness prev, androidx.compose.ui.attabal.saneness next, androidx.compose.ui.attabal.dern node) {
        if ((prev instanceof kattegat) && (next instanceof kattegat)) {
            NodeChainKt.beachfront((kattegat) next, node);
            if (node.getIsAttached()) {
                privatdozent.marial(node);
                return;
            } else {
                node.coi(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((BackwardsCompatNode) node).picketboat(next);
        if (node.getIsAttached()) {
            privatdozent.marial(node);
        } else {
            node.coi(true);
        }
    }

    public final void stratoscope() {
        int kindSet = 0;
        for (androidx.compose.ui.attabal.dern parent = this.tail.getParent(); parent != null && parent != NodeChainKt.f6939attabal; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.coffeecake(kindSet);
        }
    }

    public final int taiyuan() {
        return this.head.getAggregateChildKindSet();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(X3.j.d);
        if (this.head == this.tail) {
            sb.append(X3.j.e);
        } else {
            for (androidx.compose.ui.attabal.dern head = getHead(); head != null && head != getTail(); head = head.getChild()) {
                sb.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append(X3.j.e);
                    break;
                }
                sb.append(",");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    public final void trm() {
        NodeCoordinator adultoidVar;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (androidx.compose.ui.attabal.dern parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            graveside gravesideVarWireman = beachfront.wireman(parent);
            if (gravesideVarWireman != null) {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.competently(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    adultoidVar = (adultoid) coordinator;
                    graveside gravesideVarSulfarsenide = adultoidVar.getLayoutModifierNode();
                    adultoidVar.wittig(gravesideVarWireman);
                    if (gravesideVarSulfarsenide != parent) {
                        adultoidVar.saccharic();
                    }
                } else {
                    adultoidVar = new adultoid(this.layoutNode, gravesideVarWireman);
                    parent.sensatory(adultoidVar);
                }
                nodeCoordinator.philabeg(adultoidVar);
                adultoidVar.strother(nodeCoordinator);
                nodeCoordinator = adultoidVar;
            } else {
                parent.sensatory(nodeCoordinator);
            }
        }
        LayoutNode layoutNodePermissivist = this.layoutNode.permissivist();
        nodeCoordinator.philabeg(layoutNodePermissivist != null ? layoutNodePermissivist.yemenite() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    public final void yemenite(androidx.compose.ui.attabal m) {
        seminary seminaryVar;
        androidx.compose.ui.attabal.dern dernVarAdultoid = adultoid();
        androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar = this.current;
        int i = 0;
        int size = dernVar != null ? dernVar.getSize() : 0;
        androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar2 = this.buffer;
        if (dernVar2 == null) {
            dernVar2 = new androidx.compose.runtime.collection.dern<>(new androidx.compose.ui.attabal.saneness[16], 0);
        }
        androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVarMarial = NodeChainKt.marial(m, dernVar2);
        androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar3 = null;
        if (dernVarMarial.getSize() == size) {
            androidx.compose.ui.attabal.dern child = dernVarAdultoid.getChild();
            int i2 = 0;
            while (child != null && i2 < size) {
                if (dernVar == null) {
                    peridotite.attabal.dern("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                androidx.compose.ui.attabal.saneness sanenessVar = dernVar.apical()[i2];
                androidx.compose.ui.attabal.saneness sanenessVar2 = dernVarMarial.apical()[i2];
                int iWireman = NodeChainKt.wireman(sanenessVar, sanenessVar2);
                if (iWireman == 0) {
                    child = child.getParent();
                    break;
                }
                if (iWireman == 1) {
                    sealless(sanenessVar, sanenessVar2, child);
                }
                child = child.getChild();
                i2++;
            }
            androidx.compose.ui.attabal.dern dernVar4 = child;
            if (i2 >= size) {
                seminaryVar = this;
            } else {
                if (dernVar == null) {
                    peridotite.attabal.dern("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                if (dernVar4 == null) {
                    peridotite.attabal.dern("structuralUpdate requires a non-null tail");
                    throw new KotlinNothingValueException();
                }
                seminaryVar = this;
                seminaryVar.cuirassed(i2, dernVar, dernVarMarial, dernVar4, !this.layoutNode.graveside());
                i = 1;
            }
        } else {
            seminaryVar = this;
            if (seminaryVar.layoutNode.graveside() && size == 0) {
                androidx.compose.ui.attabal.dern dernVarCompetently = dernVarAdultoid;
                while (i < dernVarMarial.getSize()) {
                    dernVarCompetently = competently(dernVarMarial.apical()[i], dernVarCompetently);
                    i++;
                }
                stratoscope();
            } else if (dernVarMarial.getSize() != 0) {
                if (dernVar == null) {
                    dernVar = new androidx.compose.runtime.collection.dern<>(new androidx.compose.ui.attabal.saneness[16], 0);
                }
                androidx.compose.runtime.collection.dern<androidx.compose.ui.attabal.saneness> dernVar5 = dernVar;
                seminaryVar.cuirassed(0, dernVar5, dernVarMarial, dernVarAdultoid, !seminaryVar.layoutNode.graveside());
                seminaryVar = seminaryVar;
                dernVar = dernVar5;
            } else {
                if (dernVar == null) {
                    peridotite.attabal.dern("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                androidx.compose.ui.attabal.dern child2 = dernVarAdultoid.getChild();
                for (int i3 = 0; child2 != null && i3 < dernVar.getSize(); i3++) {
                    child2 = impromptu(child2).getChild();
                }
                arytenoidectomy arytenoidectomyVar = seminaryVar.innerCoordinator;
                LayoutNode layoutNodePermissivist = seminaryVar.layoutNode.permissivist();
                arytenoidectomyVar.philabeg(layoutNodePermissivist != null ? layoutNodePermissivist.yemenite() : null);
                seminaryVar.outerCoordinator = seminaryVar.innerCoordinator;
            }
            i = 1;
        }
        seminaryVar.current = dernVarMarial;
        if (dernVar != null) {
            dernVar.impromptu();
            dernVar3 = dernVar;
        }
        seminaryVar.buffer = dernVar3;
        seminaryVar.head = oilcan(dernVarAdultoid);
        if (i != 0) {
            trm();
        }
    }
}
