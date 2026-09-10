package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010(\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u000b2&\u0010\"\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u0001`!H\u0000¢\u0006\u0004\b$\u0010%J\u008f\u0001\u00104\u001a\u00020#2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020\u00062\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\b0.j\b\u0012\u0004\u0012\u00020\b`/2&\u0010\"\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u0001`!2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0000¢\u0006\u0004\b4\u00105J\u0087\u0001\u00106\u001a\u00020#2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020\u00062\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\b0.j\b\u0012\u0004\u0012\u00020\b`/2&\u0010\"\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u0001`!2\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0004\u0018\u00010 2\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020#¢\u0006\u0004\b;\u0010\u0005J\r\u0010<\u001a\u00020#¢\u0006\u0004\b<\u0010\u0005J!\u0010>\u001a\u0004\u0018\u00010+2\u0006\u00108\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0000¢\u0006\u0004\b>\u0010?J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030@H\u0096\u0002¢\u0006\u0004\bA\u0010BR$\u0010(\u001a\u00020'2\u0006\u0010C\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR$\u0010)\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR4\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bD\u0010NR$\u0010-\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bH\u0010KR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010IR\u0018\u0010T\u001a\u00060+j\u0002`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010SR$\u0010&\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\bP\u0010VR\"\u0010Y\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010I\u001a\u0004\bO\u0010K\"\u0004\bW\u0010XR2\u00100\u001a\u0012\u0012\u0004\u0012\u00020\b0.j\b\u0012\u0004\u0012\u00020\b`/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^RB\u0010\"\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u0001`!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010_\u001a\u0004\bL\u0010`\"\u0004\ba\u0010bR*\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010V¨\u0006i"}, d2 = {"Landroidx/compose/runtime/cosy;", "Loilcan/marial;", "", "Loilcan/apical;", "<init>", "()V", "", "index", "Landroidx/compose/runtime/saneness;", "stratoscope", "(I)Landroidx/compose/runtime/saneness;", "Landroidx/compose/runtime/fastrack;", "dovishness", "()Landroidx/compose/runtime/fastrack;", "Landroidx/compose/runtime/cig;", "gintrap", "()Landroidx/compose/runtime/cig;", "saneness", "anchor", "wireman", "(Landroidx/compose/runtime/saneness;)I", "", "rotuma", "(Landroidx/compose/runtime/saneness;)Z", "groupAnchor", "adultoid", "(Landroidx/compose/runtime/saneness;Landroidx/compose/runtime/saneness;)Z", "groupIndex", "graveside", "(ILandroidx/compose/runtime/saneness;)Z", "reader", "Ljava/util/HashMap;", "Landroidx/compose/runtime/splinterproof;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "", "marial", "(Landroidx/compose/runtime/fastrack;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Landroidx/collection/yemenite;", "Landroidx/collection/sealless;", "calledByMap", "beachfront", "(Landroidx/compose/runtime/cig;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/yemenite;)V", "preprohormone", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/yemenite;)V", "group", "cuirassed", "(I)Landroidx/compose/runtime/splinterproof;", "competently", "impromptu", "slotIndex", "cord", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "value", "kowloon", "[I", "impassible", "()[I", "arytenoidectomy", "I", "triweekly", "()I", "monoploid", "[Ljava/lang/Object;", "()[Ljava/lang/Object;", "polloi", "molybdenite", "readers", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "lock", "Z", "()Z", "setVersion$runtime", "(I)V", "version", "Ljava/util/ArrayList;", "taiyuan", "()Ljava/util/ArrayList;", "setAnchors$runtime", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime", "(Ljava/util/HashMap;)V", "Landroidx/collection/yemenite;", "cutely", "()Landroidx/collection/yemenite;", "setCalledByMap$runtime", "(Landroidx/collection/yemenite;)V", "isEmpty", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cosy implements oilcan.marial, Iterable<oilcan.apical>, unready.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public boolean writer;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int groupsSize;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public int version;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int readers;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int slotsSize;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.yemenite<androidx.collection.sealless> calledByMap;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public HashMap<saneness, splinterproof> sourceInformationMap;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int[] groups = new int[0];

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Object[] slots = new Object[0];

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final Object lock = new Object();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public ArrayList<saneness> anchors = new ArrayList<>();

    public final boolean adultoid(saneness groupAnchor, saneness anchor) {
        int iAttabal = groupAnchor.getLocation();
        int iKowloon = tarboosh.kowloon(this.groups, iAttabal) + iAttabal;
        int iAttabal2 = anchor.getLocation();
        return iAttabal <= iAttabal2 && iAttabal2 < iKowloon;
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final void beachfront(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<saneness> anchors, HashMap<saneness, splinterproof> sourceInformationMap, androidx.collection.yemenite<androidx.collection.sealless> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            lightstruck.attabal("Unexpected writer close()");
        }
        this.writer = false;
        preprohormone(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final void competently() {
        this.calledByMap = new androidx.collection.yemenite<>(0, 1, null);
    }

    public final Object cord(int group, int slotIndex) {
        int iGraveside = tarboosh.graveside(this.groups, group);
        int i = group + 1;
        return (slotIndex < 0 || slotIndex >= (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slots.length) - iGraveside) ? taiyuan.INSTANCE.attabal() : this.slots[iGraveside + slotIndex];
    }

    public final splinterproof cuirassed(int group) {
        saneness sanenessVarStratoscope;
        HashMap<saneness, splinterproof> map = this.sourceInformationMap;
        if (map == null || (sanenessVarStratoscope = stratoscope(group)) == null) {
            return null;
        }
        return map.get(sanenessVarStratoscope);
    }

    public final androidx.collection.yemenite<androidx.collection.sealless> cutely() {
        return this.calledByMap;
    }

    public final SlotReader dovishness() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter gintrap() {
        if (this.writer) {
            polloi.adultoid("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            polloi.adultoid("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean graveside(int groupIndex, saneness anchor) {
        if (this.writer) {
            polloi.adultoid("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            polloi.adultoid("Invalid group index");
        }
        if (rotuma(anchor)) {
            int iKowloon = tarboosh.kowloon(this.groups, groupIndex) + groupIndex;
            int iAttabal = anchor.getLocation();
            if (groupIndex <= iAttabal && iAttabal < iKowloon) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    public final void impromptu() {
        this.sourceInformationMap = new HashMap<>();
    }

    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<oilcan.apical> iterator() {
        return new peridotite(this, 0, this.groupsSize);
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    public final void marial(SlotReader reader, HashMap<saneness, splinterproof> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            polloi.adultoid("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap<saneness, splinterproof> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final HashMap<saneness, splinterproof> monoploid() {
        return this.sourceInformationMap;
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final void preprohormone(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<saneness> anchors, HashMap<saneness, splinterproof> sourceInformationMap, androidx.collection.yemenite<androidx.collection.sealless> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final boolean rotuma(saneness anchor) {
        int iMolybdenite;
        return anchor.saneness() && (iMolybdenite = tarboosh.molybdenite(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.wireman(this.anchors.get(iMolybdenite), anchor);
    }

    public final saneness saneness(int index) {
        if (this.writer) {
            polloi.adultoid("use active SlotWriter to create an anchor location instead");
        }
        boolean z = false;
        if (index >= 0 && index < this.groupsSize) {
            z = true;
        }
        if (!z) {
            lightstruck.attabal("Parameter index is out of range");
        }
        ArrayList<saneness> arrayList = this.anchors;
        int iMolybdenite = tarboosh.molybdenite(arrayList, index, this.groupsSize);
        if (iMolybdenite >= 0) {
            return arrayList.get(iMolybdenite);
        }
        saneness sanenessVar = new saneness(index);
        arrayList.add(-(iMolybdenite + 1), sanenessVar);
        return sanenessVar;
    }

    public final saneness stratoscope(int index) {
        int i;
        if (this.writer) {
            polloi.adultoid("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i = this.groupsSize)) {
            return null;
        }
        return tarboosh.triweekly(this.anchors, index, i);
    }

    public final ArrayList<saneness> taiyuan() {
        return this.anchors;
    }

    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int wireman(saneness anchor) {
        if (this.writer) {
            polloi.adultoid("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.saneness()) {
            lightstruck.attabal("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }
}
