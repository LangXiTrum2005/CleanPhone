package androidx.compose.runtime;

import com.ironsource.A5;
import java.util.Iterator;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/pruinose;", "Loilcan/apical;", "", "Landroidx/compose/runtime/cosy;", A5.R, "", "group", "version", "<init>", "(Landroidx/compose/runtime/cosy;II)V", "", "saneness", "()V", "", "iterator", "()Ljava/util/Iterator;", "kowloon", "Landroidx/compose/runtime/cosy;", "getTable", "()Landroidx/compose/runtime/cosy;", "arytenoidectomy", "I", "getGroup", "()I", "monoploid", "getVersion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pruinose implements oilcan.apical, Iterable<oilcan.apical>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int group;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final cosy table;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final int version;

    public pruinose(cosy cosyVar, int i, int i2) {
        this.table = cosyVar;
        this.group = i;
        this.version = i2;
    }

    private final void saneness() {
        if (this.table.getVersion() != this.version) {
            tarboosh.adultoid();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<oilcan.apical> iterator() {
        saneness();
        splinterproof splinterproofVarCuirassed = this.table.cuirassed(this.group);
        if (splinterproofVarCuirassed != null) {
            cosy cosyVar = this.table;
            int i = this.group;
            return new hyalinization(cosyVar, i, splinterproofVarCuirassed, new dern(i));
        }
        cosy cosyVar2 = this.table;
        int i2 = this.group;
        return new peridotite(cosyVar2, i2 + 1, i2 + tarboosh.kowloon(cosyVar2.getGroups(), this.group));
    }
}
