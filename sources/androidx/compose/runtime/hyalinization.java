package androidx.compose.runtime;

import com.ironsource.A5;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"Landroidx/compose/runtime/hyalinization;", "", "Loilcan/apical;", "Landroidx/compose/runtime/cosy;", A5.R, "", "parent", "Landroidx/compose/runtime/splinterproof;", "group", "Landroidx/compose/runtime/puffin;", "path", "<init>", "(Landroidx/compose/runtime/cosy;ILandroidx/compose/runtime/splinterproof;Landroidx/compose/runtime/puffin;)V", "", "hasNext", "()Z", "saneness", "()Loilcan/apical;", "kowloon", "Landroidx/compose/runtime/cosy;", "getTable", "()Landroidx/compose/runtime/cosy;", "arytenoidectomy", "I", "getParent", "()I", "monoploid", "Landroidx/compose/runtime/splinterproof;", "getGroup", "()Landroidx/compose/runtime/splinterproof;", "polloi", "Landroidx/compose/runtime/puffin;", "getPath", "()Landroidx/compose/runtime/puffin;", "molybdenite", "version", "graveside", "index", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hyalinization implements Iterator<oilcan.apical>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int parent;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final cosy table;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final int version;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final splinterproof group;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final puffin path;

    public hyalinization(cosy cosyVar, int i, splinterproof splinterproofVar, puffin puffinVar) {
        this.table = cosyVar;
        this.parent = i;
        this.group = splinterproofVar;
        this.path = puffinVar;
        this.version = cosyVar.getVersion();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListBeachfront = this.group.beachfront();
        return arrayListBeachfront != null && this.index < arrayListBeachfront.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public oilcan.apical next() {
        Object obj;
        ArrayList<Object> arrayListBeachfront = this.group.beachfront();
        if (arrayListBeachfront != null) {
            int i = this.index;
            this.index = i + 1;
            obj = arrayListBeachfront.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof saneness) {
            return new pruinose(this.table, ((saneness) obj).getLocation(), this.version);
        }
        if (obj instanceof splinterproof) {
            return new ctenidium(this.table, this.parent, (splinterproof) obj, new sakeen(this.path, this.index - 1));
        }
        polloi.dovishness("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }
}
