package adultoid;

import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.cosy;
import androidx.compose.runtime.graveside;
import androidx.compose.runtime.kowloon;
import androidx.compose.runtime.lerp;
import androidx.compose.runtime.molybdenite;
import androidx.compose.runtime.nosophobia;
import androidx.compose.runtime.overspeculate;
import androidx.compose.runtime.polloi;
import androidx.compose.runtime.rajahship;
import androidx.compose.runtime.supplicat;
import androidx.compose.runtime.technofreak;
import androidx.compose.runtime.tectonization;
import com.ironsource.C3414a2;
import cuirassed.IntRef;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ComposerChangeListWriter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u00016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J\u001f\u00102\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u0018¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0018¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b8\u0010%J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\u0017\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\b¢\u0006\u0004\b=\u0010\nJ\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\nJ\r\u0010?\u001a\u00020\b¢\u0006\u0004\b?\u0010\nJ\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\nJ\u001d\u0010B\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020A¢\u0006\u0004\bB\u0010CJ%\u0010F\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020A2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u0018¢\u0006\u0004\bI\u0010%J)\u0010N\u001a\u00020\b2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0J2\u0006\u0010M\u001a\u00020K¢\u0006\u0004\bN\u0010OJ\u001d\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bQ\u0010\u001cJ%\u0010R\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bR\u0010!J\r\u0010S\u001a\u00020\b¢\u0006\u0004\bS\u0010\nJ\u001d\u0010U\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u00182\u0006\u0010T\u001a\u00020\u0018¢\u0006\u0004\bU\u0010\u001cJ\r\u0010V\u001a\u00020\b¢\u0006\u0004\bV\u0010\nJ\u0017\u0010X\u001a\u00020\b2\b\u0010W\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bX\u0010<J\u001d\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b[\u0010\\J%\u0010`\u001a\u00020\b2\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010]2\u0006\u0010_\u001a\u00020Y¢\u0006\u0004\b`\u0010aJ/\u0010g\u001a\u00020\b2\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010e\u001a\u00020d2\u0006\u0010\u001e\u001a\u00020f2\u0006\u0010\u001d\u001a\u00020f¢\u0006\u0004\bg\u0010hJ%\u0010k\u001a\u00020\b2\u0006\u0010M\u001a\u00020i2\u0006\u0010e\u001a\u00020d2\u0006\u0010j\u001a\u00020f¢\u0006\u0004\bk\u0010lJ\r\u0010m\u001a\u00020\b¢\u0006\u0004\bm\u0010\nJ!\u0010o\u001a\u00020\b2\u0006\u0010n\u001a\u00020\u00042\n\b\u0002\u0010_\u001a\u0004\u0018\u00010Y¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020\b¢\u0006\u0004\bq\u0010\nJ\r\u0010r\u001a\u00020\b¢\u0006\u0004\br\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010sR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010yR\u0014\u0010}\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010|R$\u0010\u0081\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\bN\u0010y\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010\u000fR\u0018\u0010\u0083\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b>\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0082\u0001R\u001f\u0010\u0087\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0086\u0001R\u0017\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0082\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0082\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b=\u0010\u0082\u0001R\u0017\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u0082\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0013\u0010\u008f\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u007f¨\u0006\u0090\u0001"}, d2 = {"Ladultoid/saneness;", "", "Landroidx/compose/runtime/kowloon;", "composer", "Ladultoid/attabal;", "changeList", "<init>", "(Landroidx/compose/runtime/kowloon;Ladultoid/attabal;)V", "", "stratoscope", "()V", "oilcan", "", "useParentSlot", "yemenite", "(Z)V", "impassible", "Landroidx/compose/runtime/saneness;", "anchor", "formularize", "(Landroidx/compose/runtime/saneness;)V", "forParent", "restrictive", "supplicat", "", "removeFrom", "moveCount", "polder", "(II)V", "to", "from", "count", "kattegat", "(III)V", "trm", "location", "preprohormone", "(I)V", "cord", "seminary", "Landroidx/compose/runtime/tectonization;", "value", "saran", "(Landroidx/compose/runtime/tectonization;)V", "Landroidx/compose/runtime/technofreak;", "scope", "splinterproof", "(Landroidx/compose/runtime/technofreak;)V", "cutely", "groupSlotIndex", "permissivist", "(Ljava/lang/Object;I)V", "clubfoot", "(Ljava/lang/Object;Landroidx/compose/runtime/saneness;I)V", "attabal", "(Landroidx/compose/runtime/saneness;Ljava/lang/Object;)V", "overspeculate", "starveling", "data", "dent", "(Ljava/lang/Object;)V", "apical", "beachfront", "mathsort", "privatdozent", "Landroidx/compose/runtime/cosy;", "graveside", "(Landroidx/compose/runtime/saneness;Landroidx/compose/runtime/cosy;)V", "Ladultoid/dern;", "fixups", "adultoid", "(Landroidx/compose/runtime/saneness;Landroidx/compose/runtime/cosy;Ladultoid/dern;)V", "offset", "dovishness", "Lkotlin/Function1;", "Landroidx/compose/runtime/molybdenite;", "action", "composition", "marial", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/molybdenite;)V", "nodeIndex", "creditor", "rotuma", "impromptu", "group", "taiyuan", "cuirassed", "node", "gintrap", "Lcuirassed/beachfront;", "effectiveNodeIndexOut", "wireman", "(Lcuirassed/beachfront;Landroidx/compose/runtime/saneness;)V", "", "nodes", "effectiveNodeIndex", "saneness", "(Ljava/util/List;Lcuirassed/beachfront;)V", "Landroidx/compose/runtime/lerp;", "resolvedState", "Landroidx/compose/runtime/graveside;", "parentContext", "Landroidx/compose/runtime/nosophobia;", "dern", "(Landroidx/compose/runtime/lerp;Landroidx/compose/runtime/graveside;Landroidx/compose/runtime/nosophobia;Landroidx/compose/runtime/nosophobia;)V", "Landroidx/compose/runtime/supplicat;", "reference", "grimness", "(Landroidx/compose/runtime/supplicat;Landroidx/compose/runtime/graveside;Landroidx/compose/runtime/nosophobia;)V", "competently", C3414a2.d, "molybdenite", "(Ladultoid/attabal;Lcuirassed/beachfront;)V", "triweekly", "hydrovane", "Landroidx/compose/runtime/kowloon;", "Ladultoid/attabal;", "kowloon", "()Ladultoid/attabal;", "walach", "(Ladultoid/attabal;)V", "Z", "startedGroup", "Landroidx/compose/runtime/overspeculate;", "Landroidx/compose/runtime/overspeculate;", "startedGroups", "arytenoidectomy", "()Z", "peridotite", "implicitRootStart", "I", "writersReaderDelta", "pendingUps", "Landroidx/compose/runtime/rajahship;", "Ljava/util/ArrayList;", "pendingDownNodes", "moveFrom", "moveTo", "Landroidx/compose/runtime/fastrack;", "polloi", "()Landroidx/compose/runtime/fastrack;", "reader", "monoploid", "pastParent", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final int f3755triweekly = 8;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final kowloon composer;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int writersReaderDelta;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int pendingUps;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean startedGroup;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public int moveCount;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public attabal changeList;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final overspeculate startedGroups = new overspeculate();

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean implicitRootStart = true;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final ArrayList pendingDownNodes = rajahship.dern(null, 1, null);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public int removeFrom = -1;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public int moveFrom = -1;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public int moveTo = -1;

    public saneness(kowloon kowloonVar, attabal attabalVar) {
        this.composer = kowloonVar;
        this.changeList = attabalVar;
    }

    public static /* synthetic */ void merc(saneness sanenessVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sanenessVar.restrictive(z);
    }

    public static /* synthetic */ void sealless(saneness sanenessVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sanenessVar.yemenite(z);
    }

    public final void adultoid(androidx.compose.runtime.saneness anchor, cosy from, dern fixups) {
        trm();
        oilcan();
        supplicat();
        this.changeList.molybdenite(anchor, from, fixups);
    }

    public final void apical() {
        if (this.startedGroup) {
            sealless(this, false, 1, null);
            sealless(this, false, 1, null);
            this.changeList.formularize();
            this.startedGroup = false;
        }
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void attabal(androidx.compose.runtime.saneness anchor, Object value) {
        this.changeList.beachfront(anchor, value);
    }

    public final void beachfront() {
        int parent = polloi().getParent();
        if (!(this.startedGroups.marial(-1) <= parent)) {
            polloi.adultoid("Missed recording an endGroup");
        }
        if (this.startedGroups.marial(-1) == parent) {
            sealless(this, false, 1, null);
            this.startedGroups.beachfront();
            this.changeList.formularize();
        }
    }

    public final void clubfoot(Object value, androidx.compose.runtime.saneness anchor, int groupSlotIndex) {
        this.changeList.oilcan(value, anchor, groupSlotIndex);
    }

    public final void competently() {
        this.changeList.impassible();
        this.writersReaderDelta = 0;
    }

    public final void cord(int location) {
        this.writersReaderDelta = location;
    }

    public final void creditor(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                polloi.adultoid("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            supplicat();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void cuirassed() {
        supplicat();
        if (rajahship.beachfront(this.pendingDownNodes)) {
            rajahship.taiyuan(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void cutely(technofreak scope) {
        this.changeList.triweekly(scope);
    }

    public final void dent(Object data) {
        sealless(this, false, 1, null);
        this.changeList.yemenite(data);
    }

    public final void dern(lerp resolvedState, graveside parentContext, nosophobia from, nosophobia to) {
        this.changeList.impromptu(resolvedState, parentContext, from, to);
    }

    public final void dovishness(int offset) {
        oilcan();
        this.changeList.graveside(offset);
    }

    public final void formularize(androidx.compose.runtime.saneness anchor) {
        sealless(this, false, 1, null);
        this.changeList.kowloon(anchor);
        this.startedGroup = true;
    }

    public final void gintrap(Object node) {
        supplicat();
        rajahship.cutely(this.pendingDownNodes, node);
    }

    public final void graveside(androidx.compose.runtime.saneness anchor, cosy from) {
        trm();
        oilcan();
        supplicat();
        this.changeList.polloi(anchor, from);
    }

    public final void grimness(supplicat composition, graveside parentContext, nosophobia reference) {
        this.changeList.dovishness(composition, parentContext, reference);
    }

    public final void hydrovane() {
        this.startedGroup = false;
        this.startedGroups.attabal();
        this.writersReaderDelta = 0;
        this.implicitRootStart = true;
        this.pendingUps = 0;
        rajahship.attabal(this.pendingDownNodes);
        this.removeFrom = -1;
        this.moveFrom = -1;
        this.moveTo = -1;
        this.moveCount = 0;
    }

    public final void impassible() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        sealless(this, false, 1, null);
        this.changeList.arytenoidectomy();
        this.startedGroup = true;
    }

    public final void impromptu() {
        supplicat();
    }

    public final void kattegat(int to, int from, int count) {
        stratoscope();
        this.changeList.adultoid(to, from, count);
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final attabal getChangeList() {
        return this.changeList;
    }

    public final void marial(Function1<? super molybdenite, Unit> action, molybdenite composition) {
        this.changeList.apical(action, composition);
    }

    public final void mathsort() {
        this.changeList.cuirassed();
    }

    public final void molybdenite(attabal other, IntRef effectiveNodeIndex) {
        this.changeList.monoploid(other, effectiveNodeIndex);
    }

    public final boolean monoploid() {
        return polloi().getParent() - this.writersReaderDelta < 0;
    }

    public final void oilcan() {
        merc(this, false, 1, null);
        seminary();
    }

    public final void overspeculate(int count) {
        if (count > 0) {
            oilcan();
            this.changeList.trm(count);
        }
    }

    public final void peridotite(boolean z) {
        this.implicitRootStart = z;
    }

    public final void permissivist(Object value, int groupSlotIndex) {
        yemenite(true);
        this.changeList.sealless(value, groupSlotIndex);
    }

    public final void polder(int removeFrom, int moveCount) {
        stratoscope();
        this.changeList.preprohormone(removeFrom, moveCount);
    }

    public final SlotReader polloi() {
        return this.composer.getReader();
    }

    public final void preprohormone(int location) {
        this.writersReaderDelta += location - polloi().getCurrent();
    }

    public final void privatdozent() {
        oilcan();
        this.changeList.rotuma();
        this.writersReaderDelta += polloi().kowloon();
    }

    public final void restrictive(boolean forParent) {
        int parent = forParent ? polloi().getParent() : polloi().getCurrent();
        int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            polloi.adultoid("Tried to seek backward");
        }
        if (i > 0) {
            this.changeList.marial(i);
            this.writersReaderDelta = parent;
        }
    }

    public final void rotuma(int from, int to, int count) {
        if (count > 0) {
            int i = this.moveCount;
            if (i > 0 && this.moveFrom == from - i && this.moveTo == to - i) {
                this.moveCount = i + count;
                return;
            }
            supplicat();
            this.moveFrom = from;
            this.moveTo = to;
            this.moveCount = count;
        }
    }

    public final void saneness(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.competently(nodes, effectiveNodeIndex);
    }

    public final void saran(tectonization value) {
        this.changeList.gintrap(value);
    }

    public final void seminary() {
        SlotReader slotReaderPolloi;
        int parent;
        if (polloi().getGroupsSize() <= 0 || this.startedGroups.marial(-2) == (parent = (slotReaderPolloi = polloi()).getParent())) {
            return;
        }
        impassible();
        if (parent > 0) {
            androidx.compose.runtime.saneness sanenessVarAttabal = slotReaderPolloi.attabal(parent);
            this.startedGroups.competently(parent);
            formularize(sanenessVarAttabal);
        }
    }

    public final void splinterproof(technofreak scope) {
        this.changeList.stratoscope(scope);
    }

    public final void starveling() {
        this.changeList.cord();
    }

    public final void stratoscope() {
        trm();
    }

    public final void supplicat() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                polder(i2, i);
                this.removeFrom = -1;
            } else {
                kattegat(this.moveTo, this.moveFrom, i);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    public final void taiyuan(int nodeIndex, int group) {
        impromptu();
        trm();
        int iSaran = polloi().merc(group) ? 1 : polloi().saran(group);
        if (iSaran > 0) {
            creditor(nodeIndex, iSaran);
        }
    }

    public final void triweekly() {
        trm();
        if (this.startedGroups.tos == 0) {
            return;
        }
        polloi.adultoid("Missed recording an endGroup()");
    }

    public final void trm() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.kattegat(i);
            this.pendingUps = 0;
        }
        if (rajahship.beachfront(this.pendingDownNodes)) {
            this.changeList.cutely(rajahship.apical(this.pendingDownNodes));
            rajahship.attabal(this.pendingDownNodes);
        }
    }

    public final void walach(attabal attabalVar) {
        this.changeList = attabalVar;
    }

    public final void wireman(IntRef effectiveNodeIndexOut, androidx.compose.runtime.saneness anchor) {
        trm();
        this.changeList.taiyuan(effectiveNodeIndexOut, anchor);
    }

    public final void yemenite(boolean useParentSlot) {
        restrictive(useParentSlot);
    }
}
