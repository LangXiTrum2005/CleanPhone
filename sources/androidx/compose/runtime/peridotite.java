package androidx.compose.runtime;

import com.ironsource.A5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/peridotite;", "", "Loilcan/apical;", "Landroidx/compose/runtime/cosy;", A5.R, "", "start", TtmlNode.END, "<init>", "(Landroidx/compose/runtime/cosy;II)V", "", "hasNext", "()Z", "saneness", "()Loilcan/apical;", "", "wireman", "()V", "kowloon", "Landroidx/compose/runtime/cosy;", "getTable", "()Landroidx/compose/runtime/cosy;", "arytenoidectomy", "I", "getEnd", "()I", "monoploid", "index", "polloi", "version", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class peridotite implements Iterator<oilcan.apical>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int end;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final cosy table;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final int version;

    public peridotite(cosy cosyVar, int i, int i2) {
        this.table = cosyVar;
        this.end = i2;
        this.index = i;
        this.version = cosyVar.getVersion();
        if (cosyVar.getWriter()) {
            tarboosh.adultoid();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public oilcan.apical next() {
        wireman();
        int i = this.index;
        this.index = tarboosh.kowloon(this.table.getGroups(), i) + i;
        return new pruinose(this.table, i, this.version);
    }

    public final void wireman() {
        if (this.table.getVersion() != this.version) {
            tarboosh.adultoid();
        }
    }
}
