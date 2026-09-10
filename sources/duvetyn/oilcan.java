package duvetyn;

import com.ironsource.D1;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0017B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lduvetyn/oilcan;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "wireman", "()Lduvetyn/oilcan;", "saneness", D1.i, "dern", "(Lduvetyn/oilcan;)Lduvetyn/oilcan;", "byteCount", "marial", "(I)Lduvetyn/oilcan;", "", "attabal", "sink", "beachfront", "(Lduvetyn/oilcan;I)V", "[B", "I", "Z", "Lduvetyn/oilcan;", "next", "competently", "prev", "impromptu", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final byte[] data;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public oilcan next;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public oilcan prev;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int limit;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean owner;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int pos;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean shared;

    public oilcan() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void attabal() {
        int i;
        oilcan oilcanVar = this.prev;
        if (oilcanVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.beachfront(oilcanVar);
        if (oilcanVar.owner) {
            int i2 = this.limit - this.pos;
            oilcan oilcanVar2 = this.prev;
            Intrinsics.beachfront(oilcanVar2);
            int i3 = 8192 - oilcanVar2.limit;
            oilcan oilcanVar3 = this.prev;
            Intrinsics.beachfront(oilcanVar3);
            if (oilcanVar3.shared) {
                i = 0;
            } else {
                oilcan oilcanVar4 = this.prev;
                Intrinsics.beachfront(oilcanVar4);
                i = oilcanVar4.pos;
            }
            if (i2 > i3 + i) {
                return;
            }
            oilcan oilcanVar5 = this.prev;
            Intrinsics.beachfront(oilcanVar5);
            beachfront(oilcanVar5, i2);
            saneness();
            yemenite.saneness(this);
        }
    }

    public final void beachfront(oilcan sink, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i = sink.limit;
        if (i + byteCount > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i2 = sink.pos;
            if ((i + byteCount) - i2 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            p002kotlin.collections.arytenoidectomy.cutely(bArr, bArr, 0, i2, i, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i3 = sink.limit;
        int i4 = this.pos;
        p002kotlin.collections.arytenoidectomy.marial(bArr2, bArr3, i3, i4, i4 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public final oilcan dern(oilcan segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        oilcan oilcanVar = this.next;
        Intrinsics.beachfront(oilcanVar);
        oilcanVar.prev = segment;
        this.next = segment;
        return segment;
    }

    public final oilcan marial(int byteCount) {
        oilcan oilcanVarDern;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            oilcanVarDern = wireman();
        } else {
            oilcanVarDern = yemenite.dern();
            byte[] bArr = this.data;
            byte[] bArr2 = oilcanVarDern.data;
            int i = this.pos;
            p002kotlin.collections.arytenoidectomy.cutely(bArr, bArr2, 0, i, i + byteCount, 2, null);
        }
        oilcanVarDern.limit = oilcanVarDern.pos + byteCount;
        this.pos += byteCount;
        oilcan oilcanVar = this.prev;
        Intrinsics.beachfront(oilcanVar);
        oilcanVar.dern(oilcanVarDern);
        return oilcanVarDern;
    }

    public final oilcan saneness() {
        oilcan oilcanVar = this.next;
        if (oilcanVar == this) {
            oilcanVar = null;
        }
        oilcan oilcanVar2 = this.prev;
        Intrinsics.beachfront(oilcanVar2);
        oilcanVar2.next = this.next;
        oilcan oilcanVar3 = this.next;
        Intrinsics.beachfront(oilcanVar3);
        oilcanVar3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return oilcanVar;
    }

    public final oilcan wireman() {
        this.shared = true;
        return new oilcan(this.data, this.pos, this.limit, true, false);
    }

    public oilcan(byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }
}
