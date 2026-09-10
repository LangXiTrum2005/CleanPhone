package okio.internal;

import duvetyn.formularize;
import duvetyn.supplicat;
import java.io.IOException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FixedLengthSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lokio/internal/competently;", "Lduvetyn/formularize;", "Lduvetyn/supplicat;", "delegate", "", "size", "", "truncate", "<init>", "(Lduvetyn/supplicat;JZ)V", "Lduvetyn/wireman;", "sink", "byteCount", "read", "(Lduvetyn/wireman;J)J", "newSize", "", "attabal", "(Lduvetyn/wireman;J)V", "kowloon", "J", "arytenoidectomy", "Z", "monoploid", "bytesReceived", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class competently extends formularize {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final boolean truncate;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public long bytesReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public competently(supplicat delegate, long j, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.size = j;
        this.truncate = z;
    }

    public final void attabal(duvetyn.wireman wiremanVar, long j) throws IOException {
        duvetyn.wireman wiremanVar2 = new duvetyn.wireman();
        wiremanVar2.impromptu(wiremanVar);
        wiremanVar.supplicat(wiremanVar2, j);
        wiremanVar2.attabal();
    }

    @Override // duvetyn.formularize, duvetyn.supplicat
    public long read(duvetyn.wireman sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.bytesReceived;
        long j2 = this.size;
        if (j > j2) {
            byteCount = 0;
        } else if (this.truncate) {
            long j3 = j2 - j;
            if (j3 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j3);
        }
        long j4 = super.read(sink, byteCount);
        if (j4 != -1) {
            this.bytesReceived += j4;
        }
        long j5 = this.bytesReceived;
        long j6 = this.size;
        if ((j5 >= j6 || j4 != -1) && j5 <= j6) {
            return j4;
        }
        if (j4 > 0 && j5 > j6) {
            attabal(sink, sink.getSize() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
