package androidx.compose.runtime;

import com.ironsource.A5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.runtime.fastrack, reason: from toString */
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0014J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020#¢\u0006\u0004\b'\u0010%J\r\u0010(\u001a\u00020#¢\u0006\u0004\b(\u0010%J\r\u0010)\u001a\u00020#¢\u0006\u0004\b)\u0010%J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020#¢\u0006\u0004\b,\u0010%J\u0015\u0010-\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00020#¢\u0006\u0004\b0\u0010%J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010A\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010@R\u001e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010CR\u0014\u0010E\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010@R6\u0010J\u001a\"\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020G\u0018\u00010Fj\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020G\u0018\u0001`H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010IR$\u0010O\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bM\u0010NR\"\u0010R\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010@\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010.R$\u0010T\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bS\u0010+R$\u0010V\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010@\u001a\u0004\bU\u0010+R\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u0016\u0010^\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010@R\u0016\u0010`\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010@R$\u0010c\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010NR\u0011\u0010e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bd\u0010+R\u0011\u0010g\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bf\u0010+R\u0011\u0010i\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bh\u0010NR\u0011\u0010k\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bj\u0010NR\u0011\u0010m\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bl\u0010NR\u0011\u0010n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010+R\u0011\u0010o\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b[\u0010+R\u0011\u0010p\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b]\u0010+R\u0011\u0010r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bq\u0010+R\u0011\u0010t\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bs\u0010NR\u0013\u0010u\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b_\u0010\"R\u0013\u0010v\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010\"R\u0011\u0010x\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bw\u0010+R\u0011\u0010z\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\by\u0010+¨\u0006{"}, d2 = {"Landroidx/compose/runtime/fastrack;", "", "Landroidx/compose/runtime/cosy;", A5.R, "<init>", "(Landroidx/compose/runtime/cosy;)V", "", "", "index", "grimness", "([II)Ljava/lang/Object;", "saneness", "privatdozent", "creditor", "(I)I", "", "merc", "(I)Z", "saran", "seminary", "(I)Ljava/lang/Object;", "yemenite", "group", "mathsort", "trm", "kattegat", "oilcan", "cord", "sealless", "marial", "cuirassed", "stratoscope", "(II)Ljava/lang/Object;", "polder", "()Ljava/lang/Object;", "", "dern", "()V", "beachfront", "wireman", "splinterproof", "overspeculate", "walach", "()I", "peridotite", "starveling", "(I)V", "hydrovane", "competently", "", "Landroidx/compose/runtime/permissivist;", "impromptu", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/saneness;", "attabal", "(I)Landroidx/compose/runtime/saneness;", "Landroidx/compose/runtime/cosy;", "preprohormone", "()Landroidx/compose/runtime/cosy;", "[I", "groups", "I", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/splinterproof;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "value", "Z", "taiyuan", "()Z", "closed", "cutely", "setCurrentGroup", "currentGroup", "getCurrentEnd", "currentEnd", "graveside", "parent", "Landroidx/compose/runtime/overspeculate;", "apical", "Landroidx/compose/runtime/overspeculate;", "currentSlotStack", "formularize", "emptyCount", "impassible", "currentSlot", "triweekly", "currentSlotEnd", "kowloon", "monoploid", "hadNext", "gintrap", "size", "rotuma", "slot", "restrictive", "isNode", "supplicat", "isGroupEnd", "molybdenite", "inEmpty", "groupSize", "groupEnd", "groupKey", "arytenoidectomy", "groupSlotIndex", "polloi", "hasObjectKey", "groupObjectKey", "groupAux", "adultoid", "parentNodes", "dovishness", "remainingSlots", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotReader {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final overspeculate currentSlotStack;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cosy table;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public HashMap<saneness, splinterproof> sourceInformationMap;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata and from toString */
    public int parent;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int groupsSize;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public int emptyCount;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public int currentSlot;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    public int current;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public boolean hadNext;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final int slotsSize;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int[] groups;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata and from toString */
    public int end;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public int currentSlotEnd;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Object[] slots;

    public SlotReader(cosy cosyVar) {
        this.table = cosyVar;
        this.groups = cosyVar.getGroups();
        int groupsSize = cosyVar.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = cosyVar.getSlots();
        this.slotsSize = cosyVar.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new overspeculate();
    }

    public final int adultoid() {
        int i = this.parent;
        if (i >= 0) {
            return this.groups[(i * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final Object apical() {
        int i = this.current;
        if (i < this.end) {
            return saneness(this.groups, i);
        }
        return 0;
    }

    public final int arytenoidectomy() {
        return this.currentSlot - tarboosh.graveside(this.groups, this.parent);
    }

    public final saneness attabal(int index) {
        ArrayList<saneness> arrayListTaiyuan = this.table.taiyuan();
        int iMolybdenite = tarboosh.molybdenite(arrayListTaiyuan, index, this.groupsSize);
        if (iMolybdenite >= 0) {
            return arrayListTaiyuan.get(iMolybdenite);
        }
        saneness sanenessVar = new saneness(index);
        arrayListTaiyuan.add(-(iMolybdenite + 1), sanenessVar);
        return sanenessVar;
    }

    public final void beachfront() {
        if (!(this.emptyCount > 0)) {
            lightstruck.attabal("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void competently() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                polloi.adultoid("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i = iArr[(this.parent * 5) + 2];
            this.parent = i;
            this.end = i < 0 ? this.groupsSize : tarboosh.kowloon(iArr, i) + i;
            int iBeachfront = this.currentSlotStack.beachfront();
            if (iBeachfront < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iBeachfront;
                this.currentSlotEnd = i >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i + 1) * 5) + 4];
            }
        }
    }

    public final Object cord(int index) {
        return saneness(this.groups, index);
    }

    public final int creditor(int index) {
        return this.groups[(index * 5) + 2];
    }

    public final Object cuirassed(int index) {
        return stratoscope(this.current, index);
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final void dern() {
        this.emptyCount++;
    }

    public final int dovishness() {
        return this.currentSlotEnd - this.currentSlot;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* JADX INFO: renamed from: graveside, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final Object grimness(int[] iArr, int i) {
        int i2 = i * 5;
        return (iArr[i2 + 1] & 1073741824) != 0 ? this.slots[iArr[i2 + 4]] : taiyuan.INSTANCE.attabal();
    }

    public final void hydrovane(int index) {
        int iKowloon = tarboosh.kowloon(this.groups, index) + index;
        int i = this.current;
        if (!(i >= index && i <= iKowloon)) {
            polloi.adultoid("Index " + index + " is not a parent of " + i);
        }
        this.parent = index;
        this.end = iKowloon;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int impassible() {
        int i = this.current;
        if (i < this.end) {
            return this.groups[i * 5];
        }
        return 0;
    }

    public final List<permissivist> impromptu() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i = 0;
            int iKowloon = this.current;
            while (true) {
                int i2 = i;
                if (iKowloon >= this.end) {
                    break;
                }
                int[] iArr = this.groups;
                int i3 = iKowloon * 5;
                int i4 = iArr[i3];
                Object objPrivatdozent = privatdozent(iArr, iKowloon);
                int i5 = 1;
                int i6 = this.groups[i3 + 1];
                if ((1073741824 & i6) == 0) {
                    i5 = i6 & 67108863;
                }
                i = i2 + 1;
                arrayList.add(new permissivist(i4, objPrivatdozent, iKowloon, i5, i2));
                iKowloon += tarboosh.kowloon(this.groups, iKowloon);
            }
        }
        return arrayList;
    }

    public final boolean kattegat(int index) {
        return (this.groups[(index * 5) + 1] & 536870912) != 0;
    }

    public final int kowloon() {
        return tarboosh.kowloon(this.groups, this.current);
    }

    public final boolean marial(int index) {
        return (this.groups[(index * 5) + 1] & 67108864) != 0;
    }

    public final int mathsort(int group) {
        int iGraveside = tarboosh.graveside(this.groups, group);
        int i = group + 1;
        return (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slotsSize) - iGraveside;
    }

    public final boolean merc(int index) {
        return (this.groups[(index * 5) + 1] & 1073741824) != 0;
    }

    public final boolean molybdenite() {
        return this.emptyCount > 0;
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final Object oilcan(int index) {
        return privatdozent(this.groups, index);
    }

    public final void overspeculate() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.current * 5) + 1] & 1073741824) != 0)) {
                lightstruck.attabal("Expected a node group");
            }
            splinterproof();
        }
    }

    public final void peridotite() {
        if (!(this.emptyCount == 0)) {
            polloi.adultoid("Cannot skip the enclosing group while in an empty region");
        }
        this.current = this.end;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final Object polder() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return taiyuan.INSTANCE.attabal();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final boolean polloi() {
        int i = this.current;
        return i < this.end && (this.groups[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: preprohormone, reason: from getter */
    public final cosy getTable() {
        return this.table;
    }

    public final Object privatdozent(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.slots[tarboosh.polloi(iArr, i)];
        }
        return null;
    }

    public final boolean restrictive() {
        return (this.groups[(this.current * 5) + 1] & 1073741824) != 0;
    }

    public final int rotuma() {
        return this.currentSlot - tarboosh.graveside(this.groups, this.parent);
    }

    public final Object saneness(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0 ? this.slots[tarboosh.impassible(iArr, i)] : taiyuan.INSTANCE.attabal();
    }

    public final int saran(int index) {
        return this.groups[(index * 5) + 1] & 67108863;
    }

    public final boolean sealless(int index) {
        return (this.groups[(index * 5) + 1] & 134217728) != 0;
    }

    public final Object seminary(int index) {
        int[] iArr = this.groups;
        if ((iArr[(index * 5) + 1] & 1073741824) != 0) {
            return grimness(iArr, index);
        }
        return null;
    }

    public final void splinterproof() {
        splinterproof splinterproofVar;
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.current;
            if (!(this.groups[(i2 * 5) + 2] == i)) {
                lightstruck.attabal("Invalid slot table detected");
            }
            HashMap<saneness, splinterproof> map = this.sourceInformationMap;
            if (map != null && (splinterproofVar = map.get(attabal(i))) != null) {
                splinterproofVar.formularize(this.table, i2);
            }
            overspeculate overspeculateVar = this.currentSlotStack;
            int i3 = this.currentSlot;
            int i4 = this.currentSlotEnd;
            if (i3 == 0 && i4 == 0) {
                overspeculateVar.competently(-1);
            } else {
                overspeculateVar.competently(i3);
            }
            this.parent = i2;
            this.end = tarboosh.kowloon(this.groups, i2) + i2;
            int i5 = i2 + 1;
            this.current = i5;
            this.currentSlot = tarboosh.graveside(this.groups, i2);
            this.currentSlotEnd = i2 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i5 * 5) + 4];
        }
    }

    public final void starveling(int index) {
        if (!(this.emptyCount == 0)) {
            polloi.adultoid("Cannot reposition while in an empty region");
        }
        this.current = index;
        int i = this.groupsSize;
        int i2 = index < i ? this.groups[(index * 5) + 2] : -1;
        if (i2 != this.parent) {
            this.parent = i2;
            if (i2 < 0) {
                this.end = i;
            } else {
                this.end = i2 + tarboosh.kowloon(this.groups, i2);
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
        }
    }

    public final Object stratoscope(int group, int index) {
        int iGraveside = tarboosh.graveside(this.groups, group);
        int i = group + 1;
        int i2 = iGraveside + index;
        return i2 < (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slotsSize) ? this.slots[i2] : taiyuan.INSTANCE.attabal();
    }

    public final boolean supplicat() {
        return molybdenite() || this.current == this.end;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + impassible() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    public final Object triweekly() {
        int i = this.current;
        if (i < this.end) {
            return privatdozent(this.groups, i);
        }
        return null;
    }

    public final int trm(int index) {
        return this.groups[index * 5];
    }

    public final int walach() {
        if (!(this.emptyCount == 0)) {
            polloi.adultoid("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i = this.current;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.current = i + tarboosh.kowloon(iArr, i);
        return i2;
    }

    public final void wireman() {
        this.closed = true;
        this.table.marial(this, this.sourceInformationMap);
        this.slots = new Object[0];
    }

    public final int yemenite(int index) {
        return tarboosh.kowloon(this.groups, index);
    }
}
