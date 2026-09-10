package duvetyn;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lduvetyn/arytenoidectomy;", "Lduvetyn/supplicat;", "Lduvetyn/beachfront;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lduvetyn/beachfront;Ljava/util/zip/Inflater;)V", "(Lduvetyn/supplicat;Ljava/util/zip/Inflater;)V", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "attabal", "", "saneness", "()Z", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", "close", "()V", "dern", "kowloon", "Lduvetyn/beachfront;", "arytenoidectomy", "Ljava/util/zip/Inflater;", "", "monoploid", "I", "bufferBytesHeldByInflater", "polloi", "Z", "closed", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class arytenoidectomy implements supplicat {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Inflater inflater;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final beachfront source;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int bufferBytesHeldByInflater;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public arytenoidectomy(beachfront source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    public final long attabal(wireman sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            oilcan oilcanVarMilliradian = sink.milliradian(1);
            int iMin = (int) Math.min(byteCount, 8192 - oilcanVarMilliradian.limit);
            saneness();
            int iInflate = this.inflater.inflate(oilcanVarMilliradian.data, oilcanVarMilliradian.limit, iMin);
            dern();
            if (iInflate > 0) {
                oilcanVarMilliradian.limit += iInflate;
                long j = iInflate;
                sink.starveling(sink.getSize() + j);
                return j;
            }
            if (oilcanVarMilliradian.pos == oilcanVarMilliradian.limit) {
                sink.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String = oilcanVarMilliradian.saneness();
                yemenite.saneness(oilcanVarMilliradian);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    public final void dern() throws IOException {
        int i = this.bufferBytesHeldByInflater;
        if (i == 0) {
            return;
        }
        int remaining = i - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // duvetyn.supplicat
    public long read(wireman sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jAttabal = attabal(sink, byteCount);
            if (jAttabal > 0) {
                return jAttabal;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final boolean saneness() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.exhausted()) {
            return true;
        }
        oilcan oilcanVar = this.source.getBuffer().com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String;
        Intrinsics.beachfront(oilcanVar);
        int i = oilcanVar.limit;
        int i2 = oilcanVar.pos;
        int i3 = i - i2;
        this.bufferBytesHeldByInflater = i3;
        this.inflater.setInput(oilcanVar.data, i2, i3);
        return false;
    }

    @Override // duvetyn.supplicat
    /* JADX INFO: renamed from: timeout */
    public restrictive getF25466kowloon() {
        return this.source.getF25466kowloon();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public arytenoidectomy(supplicat source, Inflater inflater) {
        this(adultoid.wireman(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
