package androidx.compose.runtime;

import com.ironsource.A5;
import com.ironsource.X3;
import java.util.Iterator;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/runtime/ctenidium;", "Loilcan/apical;", "", "Landroidx/compose/runtime/cosy;", A5.R, "", "parent", "Landroidx/compose/runtime/splinterproof;", "sourceInformation", "Landroidx/compose/runtime/puffin;", "identityPath", "<init>", "(Landroidx/compose/runtime/cosy;ILandroidx/compose/runtime/splinterproof;Landroidx/compose/runtime/puffin;)V", "", "iterator", "()Ljava/util/Iterator;", "kowloon", "Landroidx/compose/runtime/cosy;", "getTable", "()Landroidx/compose/runtime/cosy;", "arytenoidectomy", "I", "getParent", "()I", "monoploid", "Landroidx/compose/runtime/splinterproof;", "getSourceInformation", "()Landroidx/compose/runtime/splinterproof;", "polloi", "Landroidx/compose/runtime/puffin;", "getIdentityPath", "()Landroidx/compose/runtime/puffin;", "", "molybdenite", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", X3.i.W, "graveside", "Ljava/lang/Iterable;", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ctenidium implements oilcan.apical, Iterable<oilcan.apical>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int parent;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final Iterable<oilcan.apical> compositionGroups = this;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final cosy table;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final Object key;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final splinterproof sourceInformation;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final puffin identityPath;

    public ctenidium(cosy cosyVar, int i, splinterproof splinterproofVar, puffin puffinVar) {
        this.table = cosyVar;
        this.parent = i;
        this.sourceInformation = splinterproofVar;
        this.identityPath = puffinVar;
        this.key = Integer.valueOf(splinterproofVar.getCom.ironsource.X3.i.W java.lang.String());
    }

    @Override // java.lang.Iterable
    public Iterator<oilcan.apical> iterator() {
        return new hyalinization(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
