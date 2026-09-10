package duvetyn;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0002\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lduvetyn/kowloon;", "Lduvetyn/supplicat;", "source", "<init>", "(Lduvetyn/supplicat;)V", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", "close", "()V", "saneness", "dern", "buffer", "offset", "marial", "(Lduvetyn/wireman;JJ)V", "", "name", "", "expected", "actual", "attabal", "(Ljava/lang/String;II)V", "", "kowloon", "B", "section", "Lduvetyn/trm;", "arytenoidectomy", "Lduvetyn/trm;", "Ljava/util/zip/Inflater;", "monoploid", "Ljava/util/zip/Inflater;", "inflater", "Lduvetyn/arytenoidectomy;", "polloi", "Lduvetyn/arytenoidectomy;", "inflaterSource", "Ljava/util/zip/CRC32;", "molybdenite", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class kowloon implements supplicat {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final buffer source;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public byte section;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final CRC32 crc;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Inflater inflater;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final arytenoidectomy inflaterSource;

    public kowloon(supplicat source) {
        Intrinsics.checkNotNullParameter(source, "source");
        buffer bufferVar = new buffer(source);
        this.source = bufferVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new arytenoidectomy((beachfront) bufferVar, inflater);
        this.crc = new CRC32();
    }

    public final void attabal(String name, int expected, int actual) throws IOException {
        if (actual == expected) {
            return;
        }
        String str = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{name, Integer.valueOf(actual), Integer.valueOf(expected)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        throw new IOException(str);
    }

    @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void dern() throws IOException {
        attabal("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        attabal("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    public final void marial(wireman buffer, long offset, long byteCount) {
        oilcan oilcanVar = buffer.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String;
        Intrinsics.beachfront(oilcanVar);
        while (true) {
            int i = oilcanVar.limit;
            int i2 = oilcanVar.pos;
            if (offset < i - i2) {
                break;
            }
            offset -= (long) (i - i2);
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
        }
        while (byteCount > 0) {
            int i3 = (int) (((long) oilcanVar.pos) + offset);
            int iMin = (int) Math.min(oilcanVar.limit - i3, byteCount);
            this.crc.update(oilcanVar.data, i3, iMin);
            byteCount -= (long) iMin;
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
            offset = 0;
        }
    }

    @Override // duvetyn.supplicat
    public long read(wireman sink, long byteCount) throws IOException {
        kowloon kowloonVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            saneness();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.getSize();
            long j = this.inflaterSource.read(sink, byteCount);
            if (j != -1) {
                marial(sink, size, j);
                return j;
            }
            kowloonVar = this;
            kowloonVar.section = (byte) 2;
        } else {
            kowloonVar = this;
        }
        if (kowloonVar.section == 2) {
            dern();
            kowloonVar.section = (byte) 3;
            if (!kowloonVar.source.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void saneness() throws IOException {
        this.source.require(10L);
        byte bCuirassed = this.source.bufferField.cuirassed(3L);
        boolean z = ((bCuirassed >> 1) & 1) == 1;
        if (z) {
            marial(this.source.bufferField, 0L, 10L);
        }
        attabal("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((bCuirassed >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z) {
                marial(this.source.bufferField, 0L, 2L);
            }
            long shortLe = this.source.bufferField.readShortLe() & 65535;
            this.source.require(shortLe);
            if (z) {
                marial(this.source.bufferField, 0L, shortLe);
            }
            this.source.skip(shortLe);
        }
        if (((bCuirassed >> 3) & 1) == 1) {
            long jIndexOf = this.source.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new EOFException();
            }
            if (z) {
                marial(this.source.bufferField, 0L, jIndexOf + 1);
            }
            this.source.skip(jIndexOf + 1);
        }
        if (((bCuirassed >> 4) & 1) == 1) {
            long jIndexOf2 = this.source.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new EOFException();
            }
            if (z) {
                marial(this.source.bufferField, 0L, jIndexOf2 + 1);
            }
            this.source.skip(jIndexOf2 + 1);
        }
        if (z) {
            attabal("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    @Override // duvetyn.supplicat
    /* JADX INFO: renamed from: timeout */
    public restrictive getF25466kowloon() {
        return this.source.getF25466kowloon();
    }
}
