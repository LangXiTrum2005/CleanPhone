package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ForwardingSource;
import com.applovin.shadow.okio.Source;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/applovin/shadow/okio/internal/FixedLengthSource;", "Lcom/applovin/shadow/okio/ForwardingSource;", "Lcom/applovin/shadow/okio/Source;", "delegate", "", "size", "", "truncate", "<init>", "(Llo/t;JZ)V", "Lcom/applovin/shadow/okio/Buffer;", "newSize", "Lwj/r;", "truncateToSize", "(Lcom/applovin/shadow/okio/Buffer;J)V", "sink", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "J", "Z", "bytesReceived", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FixedLengthSource extends ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(Source delegate, long j10, boolean z10) {
        super(delegate);
        n.f(delegate, "delegate");
        this.size = j10;
        this.truncate = z10;
    }

    private final void truncateToSize(Buffer buffer, long j10) throws IOException {
        Buffer buffer2 = new Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j10);
        buffer2.clear();
    }

    @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
    public long read(Buffer sink, long byteCount) throws IOException {
        n.f(sink, "sink");
        long j10 = this.bytesReceived;
        long j11 = this.size;
        if (j10 > j11) {
            byteCount = 0;
        } else if (this.truncate) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j12);
        }
        long j13 = super.read(sink, byteCount);
        if (j13 != -1) {
            this.bytesReceived += j13;
        }
        long j14 = this.bytesReceived;
        long j15 = this.size;
        if ((j14 >= j15 || j13 != -1) && j14 <= j15) {
            return j13;
        }
        if (j13 > 0 && j14 > j15) {
            truncateToSize(sink, sink.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
