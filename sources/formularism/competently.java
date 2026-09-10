package formularism;

import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import duvetyn.restrictive;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.molybdenite;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 T2\u00020\u0001:\u0004.*0\u001eB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0000¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0004\b1\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R*\u0010=\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010/R*\u0010@\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010/R*\u0010C\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\bA\u0010;\"\u0004\bB\u0010/R*\u0010F\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010/R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010#\u001a\u00060MR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010V\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR\u001e\u0010[\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010]\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\b\\\u0010ZR$\u0010\u000e\u001a\u0004\u0018\u00010\r8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010^\u001a\u0004\bJ\u0010_\"\u0004\b`\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\bN\u0010b\"\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010i\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010f¨\u0006j"}, d2 = {"Lformularism/competently;", "", "", "id", "Lformularism/wireman;", "connection", "", "outFinished", "inFinished", "Lokhttp3/molybdenite;", "headers", "<init>", "(ILformularism/wireman;ZZLokhttp3/molybdenite;)V", "Lokhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "Ljava/io/IOException;", "errorException", "marial", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "yemenite", "()Lokhttp3/molybdenite;", "Lduvetyn/restrictive;", "dovishness", "()Lduvetyn/restrictive;", "kattegat", "Lduvetyn/sealless;", "triweekly", "()Lduvetyn/sealless;", "rstStatusCode", "", "wireman", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "beachfront", "(Lokhttp3/internal/http2/ErrorCode;)V", "Lduvetyn/beachfront;", "source", "length", "gintrap", "(Lduvetyn/beachfront;I)V", "rotuma", "(Lokhttp3/molybdenite;Z)V", "preprohormone", "saneness", "()V", "", "delta", "attabal", "(J)V", "dern", "sealless", "I", "cutely", "()I", "Lformularism/wireman;", "competently", "()Lformularism/wireman;", "<set-?>", "J", "formularize", "()J", "trm", "readBytesTotal", "apical", "stratoscope", "readBytesAcknowledged", "polloi", "oilcan", "writeBytesTotal", "monoploid", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "impromptu", "Z", "hasResponseHeaders", "Lformularism/competently$dern;", "taiyuan", "Lformularism/competently$dern;", "arytenoidectomy", "()Lformularism/competently$dern;", "Lformularism/competently$saneness;", "Lformularism/competently$saneness;", "kowloon", "()Lformularism/competently$saneness;", "sink", "Lformularism/competently$wireman;", "Lformularism/competently$wireman;", "impassible", "()Lformularism/competently$wireman;", "readTimeout", "molybdenite", "writeTimeout", "Lokhttp3/internal/http2/ErrorCode;", "()Lokhttp3/internal/http2/ErrorCode;", "cord", "Ljava/io/IOException;", "()Ljava/io/IOException;", "cuirassed", "(Ljava/io/IOException;)V", "adultoid", "()Z", "isOpen", "graveside", "isLocallyInitiated", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final wireman readTimeout;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public long writeBytesMaximum;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final ArrayDeque<molybdenite> headersQueue;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final saneness sink;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public long readBytesTotal;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final wireman writeTimeout;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public ErrorCode errorCode;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean hasResponseHeaders;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public long writeBytesTotal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final formularism.wireman connection;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final dern source;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public IOException errorException;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public long readBytesAcknowledged;

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001b\u0010\u001fR\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R$\u0010.\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b \u0010-R\"\u00102\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010\u001f¨\u00063"}, d2 = {"Lformularism/competently$dern;", "Lduvetyn/supplicat;", "", "maxByteCount", "", "finished", "<init>", "(Lformularism/competently;JZ)V", "Lduvetyn/wireman;", "sink", "byteCount", "read", "(Lduvetyn/wireman;J)J", "Lduvetyn/beachfront;", "source", "", "cutely", "(Lduvetyn/beachfront;J)V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "close", "()V", "dovishness", "(J)V", "kowloon", "J", "arytenoidectomy", "Z", "saneness", "()Z", "(Z)V", "monoploid", "Lduvetyn/wireman;", "marial", "()Lduvetyn/wireman;", "receiveBuffer", "polloi", "dern", "readBuffer", "Lokhttp3/molybdenite;", "molybdenite", "Lokhttp3/molybdenite;", "getTrailers", "()Lokhttp3/molybdenite;", "(Lokhttp3/molybdenite;)V", "trailers", "graveside", "attabal", "formularize", "closed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class dern implements supplicat {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public final /* synthetic */ competently f26340adultoid;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public boolean finished;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final long maxByteCount;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public molybdenite trailers;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.wireman receiveBuffer;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.wireman readBuffer;

        public dern(competently this$0, long j, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f26340adultoid = this$0;
            this.maxByteCount = j;
            this.finished = z;
            this.receiveBuffer = new duvetyn.wireman();
            this.readBuffer = new duvetyn.wireman();
        }

        public final void arytenoidectomy(boolean z) {
            this.finished = z;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            competently competentlyVar = this.f26340adultoid;
            synchronized (competentlyVar) {
                formularize(true);
                size = getReadBuffer().getSize();
                getReadBuffer().attabal();
                competentlyVar.notifyAll();
                Unit unit = Unit.f29295attabal;
            }
            if (size > 0) {
                dovishness(size);
            }
            this.f26340adultoid.saneness();
        }

        public final void cutely(duvetyn.beachfront source, long byteCount) throws IOException {
            boolean finished;
            boolean z;
            long size;
            Intrinsics.checkNotNullParameter(source, "source");
            competently competentlyVar = this.f26340adultoid;
            if (hereditist.wireman.f27721impromptu && Thread.holdsLock(competentlyVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + competentlyVar);
            }
            while (byteCount > 0) {
                synchronized (this.f26340adultoid) {
                    finished = getFinished();
                    z = getReadBuffer().getSize() + byteCount > this.maxByteCount;
                    Unit unit = Unit.f29295attabal;
                }
                if (z) {
                    source.skip(byteCount);
                    this.f26340adultoid.beachfront(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (finished) {
                    source.skip(byteCount);
                    return;
                }
                long j = source.read(this.receiveBuffer, byteCount);
                if (j == -1) {
                    throw new EOFException();
                }
                byteCount -= j;
                competently competentlyVar2 = this.f26340adultoid;
                synchronized (competentlyVar2) {
                    try {
                        if (getClosed()) {
                            size = getReceiveBuffer().getSize();
                            getReceiveBuffer().attabal();
                        } else {
                            boolean z2 = getReadBuffer().getSize() == 0;
                            getReadBuffer().impromptu(getReceiveBuffer());
                            if (z2) {
                                competentlyVar2.notifyAll();
                            }
                            size = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (size > 0) {
                    dovishness(size);
                }
            }
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final duvetyn.wireman getReadBuffer() {
            return this.readBuffer;
        }

        public final void dovishness(long read) {
            competently competentlyVar = this.f26340adultoid;
            if (!hereditist.wireman.f27721impromptu || !Thread.holdsLock(competentlyVar)) {
                this.f26340adultoid.getConnection().mastfed(read);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + competentlyVar);
        }

        public final void formularize(boolean z) {
            this.closed = z;
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final duvetyn.wireman getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final void monoploid(molybdenite molybdeniteVar) {
            this.trailers = molybdeniteVar;
        }

        @Override // duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            IOException errorException;
            boolean z;
            long j;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j2 = 0;
            if (byteCount < 0) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("byteCount < 0: ", Long.valueOf(byteCount)).toString());
            }
            while (true) {
                competently competentlyVar = this.f26340adultoid;
                synchronized (competentlyVar) {
                    competentlyVar.getReadTimeout().dovishness();
                    try {
                        if (competentlyVar.impromptu() == null || getFinished()) {
                            errorException = null;
                        } else {
                            errorException = competentlyVar.getErrorException();
                            if (errorException == null) {
                                ErrorCode errorCodeImpromptu = competentlyVar.impromptu();
                                Intrinsics.beachfront(errorCodeImpromptu);
                                errorException = new StreamResetException(errorCodeImpromptu);
                            }
                        }
                        if (getClosed()) {
                            throw new IOException("stream closed");
                        }
                        z = false;
                        if (getReadBuffer().getSize() > j2) {
                            j = getReadBuffer().read(sink, Math.min(byteCount, getReadBuffer().getSize()));
                            competentlyVar.trm(competentlyVar.getReadBytesTotal() + j);
                            long readBytesTotal = competentlyVar.getReadBytesTotal() - competentlyVar.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= competentlyVar.getConnection().getOkHttpSettings().dern() / 2) {
                                competentlyVar.getConnection().molet(competentlyVar.getId(), readBytesTotal);
                                competentlyVar.stratoscope(competentlyVar.getReadBytesTotal());
                            }
                        } else {
                            if (!getFinished() && errorException == null) {
                                competentlyVar.sealless();
                                z = true;
                            }
                            j = -1;
                        }
                        competentlyVar.getReadTimeout().trm();
                        Unit unit = Unit.f29295attabal;
                    } catch (Throwable th) {
                        competentlyVar.getReadTimeout().trm();
                        throw th;
                    }
                    throw th;
                }
                if (!z) {
                    if (j != -1) {
                        dovishness(j);
                        return j;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j2 = 0;
            }
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @Override // duvetyn.supplicat
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25466kowloon() {
            return this.f26340adultoid.getReadTimeout();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u0015¨\u0006*"}, d2 = {"Lformularism/competently$saneness;", "Lduvetyn/sealless;", "", "finished", "<init>", "(Lformularism/competently;Z)V", "Lduvetyn/wireman;", "source", "", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "close", "outFinishedOnLastFrame", "attabal", "(Z)V", "kowloon", "Z", "dern", "()Z", "setFinished", "arytenoidectomy", "Lduvetyn/wireman;", "sendBuffer", "Lokhttp3/molybdenite;", "monoploid", "Lokhttp3/molybdenite;", "getTrailers", "()Lokhttp3/molybdenite;", "setTrailers", "(Lokhttp3/molybdenite;)V", "trailers", "polloi", "saneness", "marial", "closed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class saneness implements sealless {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.wireman sendBuffer;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public boolean finished;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final /* synthetic */ competently f26349molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public molybdenite trailers;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public saneness(competently this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f26349molybdenite = this$0;
            this.finished = z;
            this.sendBuffer = new duvetyn.wireman();
        }

        public final void attabal(boolean outFinishedOnLastFrame) throws IOException {
            long jMin;
            boolean z;
            competently competentlyVar = this.f26349molybdenite;
            synchronized (competentlyVar) {
                try {
                    competentlyVar.getWriteTimeout().dovishness();
                    while (competentlyVar.getWriteBytesTotal() >= competentlyVar.getWriteBytesMaximum() && !getFinished() && !getClosed() && competentlyVar.impromptu() == null) {
                        try {
                            competentlyVar.sealless();
                        } catch (Throwable th) {
                            competentlyVar.getWriteTimeout().trm();
                            throw th;
                        }
                    }
                    competentlyVar.getWriteTimeout().trm();
                    competentlyVar.dern();
                    jMin = Math.min(competentlyVar.getWriteBytesMaximum() - competentlyVar.getWriteBytesTotal(), this.sendBuffer.getSize());
                    competentlyVar.oilcan(competentlyVar.getWriteBytesTotal() + jMin);
                    z = outFinishedOnLastFrame && jMin == this.sendBuffer.getSize();
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f26349molybdenite.getWriteTimeout().dovishness();
            try {
                this.f26349molybdenite.getConnection().attendance(this.f26349molybdenite.getId(), z, this.sendBuffer, jMin);
            } finally {
                this.f26349molybdenite.getWriteTimeout().trm();
            }
        }

        @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            competently competentlyVar = this.f26349molybdenite;
            if (hereditist.wireman.f27721impromptu && Thread.holdsLock(competentlyVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + competentlyVar);
            }
            competently competentlyVar2 = this.f26349molybdenite;
            synchronized (competentlyVar2) {
                if (getClosed()) {
                    return;
                }
                boolean z = competentlyVar2.impromptu() == null;
                Unit unit = Unit.f29295attabal;
                if (!this.f26349molybdenite.getSink().finished) {
                    boolean z2 = this.sendBuffer.getSize() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.getSize() > 0) {
                            attabal(false);
                        }
                        formularism.wireman connection = this.f26349molybdenite.getConnection();
                        int id = this.f26349molybdenite.getId();
                        molybdenite molybdeniteVar = this.trailers;
                        Intrinsics.beachfront(molybdeniteVar);
                        connection.homozygous(id, z, hereditist.wireman.creditor(molybdeniteVar));
                    } else if (z2) {
                        while (this.sendBuffer.getSize() > 0) {
                            attabal(true);
                        }
                    } else if (z) {
                        this.f26349molybdenite.getConnection().attendance(this.f26349molybdenite.getId(), true, null, 0L);
                    }
                }
                synchronized (this.f26349molybdenite) {
                    marial(true);
                    Unit unit2 = Unit.f29295attabal;
                }
                this.f26349molybdenite.getConnection().flush();
                this.f26349molybdenite.saneness();
            }
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @Override // duvetyn.sealless, java.io.Flushable
        public void flush() throws IOException {
            competently competentlyVar = this.f26349molybdenite;
            if (hereditist.wireman.f27721impromptu && Thread.holdsLock(competentlyVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + competentlyVar);
            }
            competently competentlyVar2 = this.f26349molybdenite;
            synchronized (competentlyVar2) {
                competentlyVar2.dern();
                Unit unit = Unit.f29295attabal;
            }
            while (this.sendBuffer.getSize() > 0) {
                attabal(false);
                this.f26349molybdenite.getConnection().flush();
            }
        }

        public final void marial(boolean z) {
            this.closed = z;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        @Override // duvetyn.sealless
        public void supplicat(duvetyn.wireman source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            competently competentlyVar = this.f26349molybdenite;
            if (!hereditist.wireman.f27721impromptu || !Thread.holdsLock(competentlyVar)) {
                this.sendBuffer.supplicat(source, byteCount);
                while (this.sendBuffer.getSize() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    attabal(false);
                }
            } else {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + competentlyVar);
            }
        }

        @Override // duvetyn.sealless
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25464kowloon() {
            return this.f26349molybdenite.getWriteTimeout();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lformularism/competently$wireman;", "Lduvetyn/saneness;", "<init>", "(Lformularism/competently;)V", "", "stratoscope", "()V", "Ljava/io/IOException;", "cause", "rotuma", "(Ljava/io/IOException;)Ljava/io/IOException;", "trm", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class wireman extends duvetyn.saneness {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ competently f26352kowloon;

        public wireman(competently this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f26352kowloon = this$0;
        }

        @Override // duvetyn.saneness
        public IOException rotuma(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // duvetyn.saneness
        public void stratoscope() {
            this.f26352kowloon.beachfront(ErrorCode.CANCEL);
            this.f26352kowloon.getConnection().hardpan();
        }

        public final void trm() throws IOException {
            if (gintrap()) {
                throw rotuma(null);
            }
        }
    }

    public competently(int i, formularism.wireman connection, boolean z, boolean z2, molybdenite molybdeniteVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.id = i;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().dern();
        ArrayDeque<molybdenite> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new dern(this, connection.getOkHttpSettings().dern(), z2);
        this.sink = new saneness(this, z);
        this.readTimeout = new wireman(this);
        this.writeTimeout = new wireman(this);
        if (molybdeniteVar == null) {
            if (!graveside()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (graveside()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(molybdeniteVar);
        }
    }

    public final synchronized boolean adultoid() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() || this.source.getClosed()) {
                if ((this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final dern getSource() {
        return this.source;
    }

    public final void attabal(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    public final void beachfront(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (marial(errorCode, null)) {
            this.connection.deadwork(this.id, errorCode);
        }
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final formularism.wireman getConnection() {
        return this.connection;
    }

    public final void cord(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void cuirassed(IOException iOException) {
        this.errorException = iOException;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final void dern() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.beachfront(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final restrictive dovishness() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void gintrap(duvetyn.beachfront source, int length) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!hereditist.wireman.f27721impromptu || !Thread.holdsLock(this)) {
            this.source.cutely(source, length);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    public final boolean graveside() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final wireman getReadTimeout() {
        return this.readTimeout;
    }

    public final synchronized ErrorCode impromptu() {
        return this.errorCode;
    }

    public final restrictive kattegat() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final saneness getSink() {
        return this.sink;
    }

    public final boolean marial(ErrorCode errorCode, IOException errorException) {
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (impromptu() != null) {
                return false;
            }
            if (getSource().getFinished() && getSink().getFinished()) {
                return false;
            }
            cord(errorCode);
            cuirassed(errorException);
            notifyAll();
            Unit unit = Unit.f29295attabal;
            this.connection.claque(this.id);
            return true;
        }
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final wireman getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void oilcan(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final synchronized void preprohormone(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void rotuma(molybdenite headers, boolean inFinished) {
        boolean zAdultoid;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && inFinished) {
                    getSource().monoploid(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (inFinished) {
                    getSource().arytenoidectomy(true);
                }
                zAdultoid = adultoid();
                notifyAll();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zAdultoid) {
            return;
        }
        this.connection.claque(this.id);
    }

    public final void saneness() throws IOException {
        boolean z;
        boolean zAdultoid;
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z = !getSource().getFinished() && getSource().getClosed() && (getSink().getFinished() || getSink().getClosed());
                zAdultoid = adultoid();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            wireman(ErrorCode.CANCEL, null);
        } else {
            if (zAdultoid) {
                return;
            }
            this.connection.claque(this.id);
        }
    }

    public final void sealless() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void stratoscope(long j) {
        this.readBytesAcknowledged = j;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final sealless triweekly() {
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !graveside()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.sink;
    }

    public final void trm(long j) {
        this.readBytesTotal = j;
    }

    public final void wireman(ErrorCode rstStatusCode, IOException errorException) throws IOException {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (marial(rstStatusCode, errorException)) {
            this.connection.libyan(this.id, rstStatusCode);
        }
    }

    public final synchronized molybdenite yemenite() throws IOException {
        molybdenite molybdeniteVarRemoveFirst;
        this.readTimeout.dovishness();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                sealless();
            } catch (Throwable th) {
                this.readTimeout.trm();
                throw th;
            }
        }
        this.readTimeout.trm();
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.beachfront(errorCode);
            throw new StreamResetException(errorCode);
        }
        molybdeniteVarRemoveFirst = this.headersQueue.removeFirst();
        Intrinsics.checkNotNullExpressionValue(molybdeniteVarRemoveFirst, "headersQueue.removeFirst()");
        return molybdeniteVarRemoveFirst;
    }
}
