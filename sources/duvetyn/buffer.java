package duvetyn;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.A5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.CharsKt;

/* JADX INFO: renamed from: duvetyn.trm, reason: from toString */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b\f\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0011\u00102\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020+H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010-J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u000206H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u001fH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001fH\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010>J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bA\u0010\u0013J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bC\u0010DJ'\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010GJ\u0017\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u0019H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u0019H\u0016¢\u0006\u0004\bN\u0010JJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010LJ\u001f\u0010Q\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u0019H\u0016¢\u0006\u0004\bQ\u0010RJ/\u0010T\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0001H\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u000eH\u0016¢\u0006\u0004\b[\u0010\u0010J\u000f\u0010\\\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020+H\u0016¢\u0006\u0004\ba\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010\u0007\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bk\u0010]\u001a\u0004\bj\u0010\b¨\u0006l"}, d2 = {"Lduvetyn/trm;", "Lduvetyn/beachfront;", "Lduvetyn/supplicat;", "source", "<init>", "(Lduvetyn/supplicat;)V", "Lduvetyn/wireman;", "buffer", "()Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "exhausted", "()Z", "", "require", "(J)V", AdActivity.REQUEST_KEY_EXTRA, "(J)Z", "", "readByte", "()B", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lduvetyn/rotuma;", "options", "", "splinterproof", "(Lduvetyn/rotuma;)I", "", "readByteArray", "()[B", "(J)[B", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Lduvetyn/sealless;", "clubfoot", "(Lduvetyn/sealless;)J", "", "readUtf8", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", A5.N, "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "()Ljava/lang/String;", "readUtf8LineStrict", "limit", "", "readShort", "()S", "readShortLe", "readInt", "()I", "readIntLe", "readLongLe", "()J", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "indexOf", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "bytes", "molybdenite", "(Lokio/ByteString;)J", "attabal", "(Lokio/ByteString;J)J", "targetBytes", "gintrap", "saneness", "offset", "trm", "(JLokio/ByteString;)Z", "bytesOffset", "dern", "(JLokio/ByteString;II)Z", "peek", "()Lduvetyn/beachfront;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "toString", "kowloon", "Lduvetyn/supplicat;", "arytenoidectomy", "Lduvetyn/wireman;", "bufferField", "monoploid", "Z", "closed", "getBuffer", "getBuffer$annotations", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class buffer implements beachfront {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final wireman bufferField;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final supplicat source;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public buffer(supplicat source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.bufferField = new wireman();
    }

    public long attabal(ByteString bytes, long fromIndex) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jRestrictive = this.bufferField.restrictive(bytes, fromIndex);
            if (jRestrictive != -1) {
                return jRestrictive;
            }
            long size = this.bufferField.getSize();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - ((long) bytes.size())) + 1);
        }
    }

    @Override // duvetyn.beachfront
    /* JADX INFO: renamed from: buffer, reason: from getter */
    public wireman getBufferField() {
        return this.bufferField;
    }

    @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.attabal();
    }

    @Override // duvetyn.beachfront
    public long clubfoot(sealless sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jMarial = this.bufferField.marial();
            if (jMarial > 0) {
                j += jMarial;
                sink.supplicat(this.bufferField, jMarial);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j;
        }
        long size = j + this.bufferField.getSize();
        wireman wiremanVar = this.bufferField;
        sink.supplicat(wiremanVar, wiremanVar.getSize());
        return size;
    }

    public boolean dern(long offset, ByteString bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            long j = ((long) i) + offset;
            if (!request(1 + j) || this.bufferField.cuirassed(j) != bytes.getByte(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // duvetyn.beachfront
    public boolean exhausted() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
    }

    @Override // duvetyn.beachfront
    public wireman getBuffer() {
        return this.bufferField;
    }

    @Override // duvetyn.beachfront
    public long gintrap(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return saneness(targetBytes, 0L);
    }

    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // duvetyn.beachfront
    public InputStream inputStream() {
        return new attabal();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // duvetyn.beachfront
    public long molybdenite(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return attabal(bytes, 0L);
    }

    @Override // duvetyn.beachfront
    public beachfront peek() {
        return adultoid.wireman(new cuirassed(this));
    }

    @Override // duvetyn.supplicat
    public long read(wireman sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1L;
        }
        return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.getSize()));
    }

    @Override // duvetyn.beachfront
    public byte readByte() throws EOFException {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // duvetyn.beachfront
    public byte[] readByteArray() throws IOException {
        this.bufferField.impromptu(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // duvetyn.beachfront
    public ByteString readByteString() throws IOException {
        this.bufferField.impromptu(this.source);
        return this.bufferField.readByteString();
    }

    @Override // duvetyn.beachfront
    public long readDecimalLong() throws EOFException {
        require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!request(j2)) {
                break;
            }
            byte bCuirassed = this.bufferField.cuirassed(j);
            if ((bCuirassed < 48 || bCuirassed > 57) && !(j == 0 && bCuirassed == 45)) {
                if (j != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bCuirassed, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j = j2;
        }
        return this.bufferField.readDecimalLong();
    }

    @Override // duvetyn.beachfront
    public long readHexadecimalUnsignedLong() throws EOFException {
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            byte bCuirassed = this.bufferField.cuirassed(i);
            if ((bCuirassed < 48 || bCuirassed > 57) && ((bCuirassed < 97 || bCuirassed > 102) && (bCuirassed < 65 || bCuirassed > 70))) {
                if (i != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bCuirassed, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i = i2;
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // duvetyn.beachfront
    public int readInt() throws EOFException {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // duvetyn.beachfront
    public int readIntLe() throws EOFException {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // duvetyn.beachfront
    public long readLongLe() throws EOFException {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // duvetyn.beachfront
    public short readShort() throws EOFException {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // duvetyn.beachfront
    public short readShortLe() throws EOFException {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // duvetyn.beachfront
    public String readString(Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.bufferField.impromptu(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // duvetyn.beachfront
    public String readUtf8(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readUtf8(byteCount);
    }

    @Override // duvetyn.beachfront
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.attabal.dern(this.bufferField, jIndexOf);
        }
        if (this.bufferField.getSize() != 0) {
            return readUtf8(this.bufferField.getSize());
        }
        return null;
    }

    @Override // duvetyn.beachfront
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // duvetyn.beachfront
    public boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.getSize() < byteCount) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // duvetyn.beachfront
    public void require(long byteCount) throws EOFException {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    public long saneness(ByteString targetBytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jMerc = this.bufferField.merc(targetBytes, fromIndex);
            if (jMerc != -1) {
                return jMerc;
            }
            long size = this.bufferField.getSize();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // duvetyn.beachfront
    public void skip(long byteCount) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.getSize());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // duvetyn.beachfront
    public int splinterproof(rotuma options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iWireman = okio.internal.attabal.wireman(this.bufferField, options, true);
            if (iWireman != -2) {
                if (iWireman == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[iWireman].size());
                return iWireman;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // duvetyn.supplicat
    /* JADX INFO: renamed from: timeout */
    public restrictive getF25466kowloon() {
        return this.source.getF25466kowloon();
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // duvetyn.beachfront
    public boolean trm(long offset, ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return dern(offset, bytes, 0, bytes.size());
    }

    public long indexOf(byte b, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        long jMax = fromIndex;
        while (jMax < toIndex) {
            byte b2 = b;
            long j = toIndex;
            long jIndexOf = this.bufferField.indexOf(b2, jMax, j);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.getSize();
            if (size >= j || this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b = b2;
            toIndex = j;
        }
        return -1L;
    }

    @Override // duvetyn.beachfront
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j);
        if (jIndexOf != -1) {
            return okio.internal.attabal.dern(this.bufferField, jIndexOf);
        }
        if (j < Long.MAX_VALUE && request(j) && this.bufferField.cuirassed(j - 1) == 13 && request(j + 1) && this.bufferField.cuirassed(j) == 10) {
            return okio.internal.attabal.dern(this.bufferField, j);
        }
        wireman wiremanVar = new wireman();
        wireman wiremanVar2 = this.bufferField;
        wiremanVar2.monoploid(wiremanVar, 0L, Math.min(32, wiremanVar2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + wiremanVar.readByteString().hex() + (char) 8230);
    }

    @Override // duvetyn.beachfront
    public byte[] readByteArray(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteArray(byteCount);
    }

    @Override // duvetyn.beachfront
    public ByteString readByteString(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteString(byteCount);
    }

    /* JADX INFO: renamed from: duvetyn.trm$attabal */
    /* JADX INFO: compiled from: RealBufferedSource.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"duvetyn/trm$attabal", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal extends InputStream {
        public attabal() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(bufferVar.bufferField.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            buffer.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            if (bufferVar.bufferField.getSize() == 0) {
                buffer bufferVar2 = buffer.this;
                if (bufferVar2.source.read(bufferVar2.bufferField, 8192L) == -1) {
                    return -1;
                }
            }
            return buffer.this.bufferField.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        public String toString() {
            return buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!buffer.this.closed) {
                duvetyn.attabal.saneness(data.length, offset, byteCount);
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
