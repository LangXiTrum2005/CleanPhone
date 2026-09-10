package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0002FGB5\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b(\u0010%R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0017\u0010<\u001a\u0002008\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u00104R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010E\u001a\u0002058F¢\u0006\u0006\u001a\u0004\bE\u00109¨\u0006H"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;", "", "Ljava/io/RandomAccessFile;", X3.i.f27782b, "Lcom/applovin/shadow/okio/Source;", "upstream", "", "upstreamPos", "Lcom/applovin/shadow/okio/ByteString;", TtmlNode.TAG_METADATA, "bufferMaxSize", "<init>", "(Ljava/io/RandomAccessFile;Llo/t;JLlo/h;J)V", "prefix", "upstreamSize", "metadataSize", "Lwj/r;", "writeHeader", "(Lcom/applovin/shadow/okio/ByteString;JJ)V", "writeMetadata", "(J)V", "commit", "()Lcom/applovin/shadow/okio/ByteString;", "newSource", "()Lcom/applovin/shadow/okio/Source;", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "Lcom/applovin/shadow/okio/Source;", "getUpstream", "()Llo/t;", "setUpstream", "(Llo/t;)V", "J", "getUpstreamPos", "()J", "setUpstreamPos", "Lcom/applovin/shadow/okio/ByteString;", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lcom/applovin/shadow/okio/Buffer;", "upstreamBuffer", "Lcom/applovin/shadow/okio/Buffer;", "getUpstreamBuffer", "()Llo/e;", "", CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Relay {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private Source upstream;
    private final Buffer upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$Companion;", "", "()V", "FILE_HEADER_SIZE", "", "PREFIX_CLEAN", "Lcom/applovin/shadow/okio/ByteString;", "PREFIX_DIRTY", "SOURCE_FILE", "", "SOURCE_UPSTREAM", "edit", "Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;", X3.i.f27782b, "Ljava/io/File;", "upstream", "Lcom/applovin/shadow/okio/Source;", TtmlNode.TAG_METADATA, "bufferMaxSize", "read", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Relay edit(File file, Source upstream, ByteString metadata, long bufferMaxSize) throws IOException {
            n.f(file, "file");
            n.f(upstream, "upstream");
            n.f(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            n.f(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            n.e(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, Relay.FILE_HEADER_SIZE);
            ByteString byteString = Relay.PREFIX_CLEAN;
            if (!n.a(buffer.readByteString(byteString.size()), byteString)) {
                throw new IOException("unreadable cache file");
            }
            long j10 = buffer.readLong();
            long j11 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(Relay.FILE_HEADER_SIZE + j10, buffer2, j11);
            return new Relay(randomAccessFile, null, j10, buffer2.readByteString(), 0L, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;", "Lcom/applovin/shadow/okio/Source;", "<init>", "(Ljava/lang/Object;)V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "Lwj/r;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "Lcom/applovin/shadow/okio/Timeout;", "Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;", "fileOperator", "Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public final class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            n.c(file);
            FileChannel channel = file.getChannel();
            n.e(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // com.applovin.shadow.okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            char c4;
            n.f(sink, "sink");
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                            if (this.sourcePos < upstreamPos) {
                                c4 = 2;
                                break;
                            }
                            long jMin = Math.min(byteCount, relay.getUpstreamPos() - this.sourcePos);
                            relay.getBuffer().copyTo(sink, this.sourcePos - upstreamPos, jMin);
                            this.sourcePos += jMin;
                            return jMin;
                        }
                        if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c4 = 1;
                                break;
                            }
                            this.timeout.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c4 == 2) {
                    long jMin2 = Math.min(byteCount, Relay.this.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    n.c(fileOperator);
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, sink, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    Source upstream = Relay.this.getUpstream();
                    n.c(upstream);
                    long j10 = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j10 == -1) {
                        Relay relay2 = Relay.this;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = Relay.this;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            relay3.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j10, byteCount);
                    Relay.this.getUpstreamBuffer().copyTo(sink, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    n.c(fileOperator2);
                    fileOperator2.write(Relay.this.getUpstreamPos() + Relay.FILE_HEADER_SIZE, Relay.this.getUpstreamBuffer().m139clone(), j10);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), j10);
                            if (relay4.getBuffer().size() > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().skip(relay4.getBuffer().size() - relay4.getBufferMaxSize());
                            }
                            relay4.setUpstreamPos(relay4.getUpstreamPos() + j10);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th4) {
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        relay6.notifyAll();
                        throw th4;
                    }
                }
            }
        }

        @Override // com.applovin.shadow.okio.Source
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        PREFIX_CLEAN = companion.encodeUtf8("OkHttp cache v1\n");
        PREFIX_DIRTY = companion.encodeUtf8("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j10, ByteString byteString, long j11, g gVar) {
        this(randomAccessFile, source, j10, byteString, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString prefix, long upstreamSize, long metadataSize) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(prefix);
        buffer.writeLong(upstreamSize);
        buffer.writeLong(metadataSize);
        if (buffer.size() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        n.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        n.e(channel, "file!!.channel");
        new FileOperator(channel).write(0L, buffer, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long upstreamSize) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        n.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        n.e(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + upstreamSize, buffer, this.metadata.size());
    }

    public final void commit(long upstreamSize) throws IOException {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        n.c(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        n.c(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final Source getUpstream() {
        return this.upstream;
    }

    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX INFO: renamed from: metadata, reason: from getter */
    public final ByteString getMetadata() {
        return this.metadata;
    }

    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i10) {
        this.sourceCount = i10;
    }

    public final void setUpstream(Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j10) {
        this.upstreamPos = j10;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j10, ByteString byteString, long j11) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j10;
        this.metadata = byteString;
        this.bufferMaxSize = j11;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }
}
