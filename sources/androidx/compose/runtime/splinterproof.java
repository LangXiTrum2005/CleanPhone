package androidx.compose.runtime;

import com.ironsource.A5;
import com.ironsource.X3;
import java.util.ArrayList;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR6\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010(j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00105\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00101\u001a\u0004\b%\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b*\u0010\u001c\"\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/compose/runtime/splinterproof;", "", "Landroidx/compose/runtime/cig;", "writer", "", "group", "", "impassible", "(Landroidx/compose/runtime/cig;I)V", "Landroidx/compose/runtime/cosy;", A5.R, "formularize", "(Landroidx/compose/runtime/cosy;I)V", "predecessor", "saneness", "(Landroidx/compose/runtime/cig;II)V", "Landroidx/compose/runtime/saneness;", "anchor", "", "apical", "(Landroidx/compose/runtime/saneness;)Z", "cutely", "()Landroidx/compose/runtime/splinterproof;", "attabal", "(Ljava/lang/Object;)V", "taiyuan", "I", "competently", "()I", X3.i.W, "", "Ljava/lang/String;", "impromptu", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "sourceInformation", "dern", "marial", "dataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "wireman", "Ljava/util/ArrayList;", "beachfront", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "groups", "Z", "()Z", "setClosed", "(Z)V", "closed", "setDataEndOffset", "(I)V", "dataEndOffset", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class splinterproof {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int key;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int dataEndOffset;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int dataStartOffset;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public String sourceInformation;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public ArrayList<Object> groups;

    public final boolean apical(saneness anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof saneness) {
                    if (Intrinsics.wireman(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof splinterproof) && !((splinterproof) obj).apical(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void attabal(Object group) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    public final ArrayList<Object> beachfront() {
        return this.groups;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    public final splinterproof cutely() {
        Object obj;
        splinterproof splinterproofVarCutely;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if ((obj instanceof splinterproof) && !((splinterproof) obj).closed) {
                break;
            }
            size--;
        }
        splinterproof splinterproofVar = obj instanceof splinterproof ? (splinterproof) obj : null;
        return (splinterproofVar == null || (splinterproofVarCutely = splinterproofVar.cutely()) == null) ? this : splinterproofVarCutely;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final void formularize(cosy table, int group) {
        cutely().attabal(table.saneness(group));
    }

    public final void impassible(SlotWriter writer, int group) {
        cutely().attabal(writer.stratoscope(group));
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    public final void saneness(SlotWriter writer, int predecessor, int group) {
        saneness sanenessVarVir;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i = 0;
        if (predecessor >= 0 && (sanenessVarVir = writer.vir(predecessor)) != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                if (!Intrinsics.wireman(obj, sanenessVarVir) && (!(obj instanceof splinterproof) || !((splinterproof) obj).taiyuan(sanenessVarVir))) {
                    i++;
                }
            }
            i = -1;
        }
        arrayList.add(i, writer.stratoscope(group));
    }

    public final boolean taiyuan(saneness anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (Intrinsics.wireman(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof splinterproof) && ((splinterproof) obj).taiyuan(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }
}
