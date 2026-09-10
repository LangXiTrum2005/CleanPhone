package amphitheatre;

import com.ironsource.Ie;
import com.vungle.ads.internal.ui.AdActivity;
import duvetyn.impassible;
import duvetyn.restrictive;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.cuirassed;
import okhttp3.graveside;
import okhttp3.internal.connection.RealConnection;
import okhttp3.molybdenite;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import paddywack.apical;
import paddywack.taiyuan;
import paddywack.wireman;

/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 T2\u00020\u0001:\u0007-+#'EILB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010&J\u001d\u00105\u001a\u00020\u001d2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010CR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u000207*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010Q\u001a\u000207*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lamphitheatre/saneness;", "Lpaddywack/wireman;", "Lokhttp3/rotuma;", "client", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lduvetyn/beachfront;", "source", "Lduvetyn/marial;", "sink", "<init>", "(Lokhttp3/rotuma;Lokhttp3/internal/connection/RealConnection;Lduvetyn/beachfront;Lduvetyn/marial;)V", "Lduvetyn/sealless;", "monoploid", "()Lduvetyn/sealless;", "graveside", "", "length", "Lduvetyn/supplicat;", "molybdenite", "(J)Lduvetyn/supplicat;", "Lokhttp3/graveside;", "url", "polloi", "(Lokhttp3/graveside;)Lduvetyn/supplicat;", "adultoid", "()Lduvetyn/supplicat;", "Lduvetyn/impassible;", "timeout", "", "triweekly", "(Lduvetyn/impassible;)V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "contentLength", "dern", "(Lokhttp3/preprohormone;J)Lduvetyn/sealless;", "cancel", "()V", "wireman", "(Lokhttp3/preprohormone;)V", "Lokhttp3/cuirassed;", Ie.n, "saneness", "(Lokhttp3/cuirassed;)J", "attabal", "(Lokhttp3/cuirassed;)Lduvetyn/supplicat;", "flushRequest", "finishRequest", "Lokhttp3/molybdenite;", "headers", "", "requestLine", "gintrap", "(Lokhttp3/molybdenite;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/cuirassed$attabal;", "readResponseHeaders", "(Z)Lokhttp3/cuirassed$attabal;", "dovishness", "(Lokhttp3/cuirassed;)V", "Lokhttp3/rotuma;", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lduvetyn/beachfront;", "Lduvetyn/marial;", "", "marial", "I", "state", "Lamphitheatre/attabal;", "beachfront", "Lamphitheatre/attabal;", "headersReader", "competently", "Lokhttp3/molybdenite;", "trailers", "arytenoidectomy", "(Lokhttp3/cuirassed;)Z", "isChunked", "kowloon", "(Lokhttp3/preprohormone;)Z", "impromptu", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class saneness implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final rotuma client;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final amphitheatre.attabal headersReader;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public molybdenite trailers;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final duvetyn.beachfront source;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final RealConnection connection;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final duvetyn.marial sink;

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lamphitheatre/saneness$attabal;", "Lduvetyn/supplicat;", "<init>", "(Lamphitheatre/saneness;)V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "saneness", "()V", "Lduvetyn/impassible;", "kowloon", "Lduvetyn/impassible;", "getTimeout", "()Lduvetyn/impassible;", "", "arytenoidectomy", "Z", "attabal", "()Z", "dern", "(Z)V", "closed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public abstract class attabal implements supplicat {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final impassible timeout;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ saneness f4414monoploid;

        public attabal(saneness this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f4414monoploid = this$0;
            this.timeout = new impassible(this$0.source.getF25466kowloon());
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        public final void dern(boolean z) {
            this.closed = z;
        }

        @Override // duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return this.f4414monoploid.source.read(sink, byteCount);
            } catch (IOException e) {
                this.f4414monoploid.getConnection().preprohormone();
                saneness();
                throw e;
            }
        }

        public final void saneness() {
            if (this.f4414monoploid.state == 6) {
                return;
            }
            if (this.f4414monoploid.state != 5) {
                throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(this.f4414monoploid.state)));
            }
            this.f4414monoploid.triweekly(this.timeout);
            this.f4414monoploid.state = 6;
        }

        @Override // duvetyn.supplicat
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25466kowloon() {
            return this.timeout;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lamphitheatre/saneness$beachfront;", "Lduvetyn/sealless;", "<init>", "(Lamphitheatre/saneness;)V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "Lduvetyn/wireman;", "source", "", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "close", "Lduvetyn/impassible;", "kowloon", "Lduvetyn/impassible;", "", "arytenoidectomy", "Z", "closed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class beachfront implements sealless {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final impassible timeout;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ saneness f4417monoploid;

        public beachfront(saneness this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f4417monoploid = this$0;
            this.timeout = new impassible(this$0.sink.getF25464kowloon());
        }

        @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.f4417monoploid.triweekly(this.timeout);
            this.f4417monoploid.state = 3;
        }

        @Override // duvetyn.sealless, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            this.f4417monoploid.sink.flush();
        }

        @Override // duvetyn.sealless
        public void supplicat(duvetyn.wireman source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            hereditist.wireman.formularize(source.getSize(), 0L, byteCount);
            this.f4417monoploid.sink.supplicat(source, byteCount);
        }

        @Override // duvetyn.sealless
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25464kowloon() {
            return this.timeout;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lamphitheatre/saneness$competently;", "Lamphitheatre/saneness$attabal;", "Lamphitheatre/saneness;", "<init>", "(Lamphitheatre/saneness;)V", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "close", "()V", "", "polloi", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class competently extends attabal {

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final /* synthetic */ saneness f4418molybdenite;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public boolean inputExhausted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public competently(saneness this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f4418molybdenite = this$0;
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                saneness();
            }
            dern(true);
        }

        @Override // amphitheatre.saneness.attabal, duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("byteCount < 0: ", Long.valueOf(byteCount)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j = super.read(sink, byteCount);
            if (j != -1) {
                return j;
            }
            this.inputExhausted = true;
            saneness();
            return -1L;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lamphitheatre/saneness$dern;", "Lamphitheatre/saneness$attabal;", "Lamphitheatre/saneness;", "Lokhttp3/graveside;", "url", "<init>", "(Lamphitheatre/saneness;Lokhttp3/graveside;)V", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "close", "()V", "marial", "polloi", "Lokhttp3/graveside;", "molybdenite", "J", "bytesRemainingInChunk", "", "graveside", "Z", "hasMoreChunks", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class dern extends attabal {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public final /* synthetic */ saneness f4420adultoid;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public boolean hasMoreChunks;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public long bytesRemainingInChunk;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public final graveside url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dern(saneness this$0, graveside url) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f4420adultoid = this$0;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !hereditist.wireman.molybdenite(this, 100, TimeUnit.MILLISECONDS)) {
                this.f4420adultoid.getConnection().preprohormone();
                saneness();
            }
            dern(true);
        }

        public final void marial() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                this.f4420adultoid.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = this.f4420adultoid.source.readHexadecimalUnsignedLong();
                String string = StringsKt.stupefactive(this.f4420adultoid.source.readUtf8LineStrict()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !dovishness.starveling(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    saneness sanenessVar = this.f4420adultoid;
                    sanenessVar.trailers = sanenessVar.headersReader.attabal();
                    rotuma rotumaVar = this.f4420adultoid.client;
                    Intrinsics.beachfront(rotumaVar);
                    okhttp3.impassible cookieJar = rotumaVar.getCookieJar();
                    graveside gravesideVar = this.url;
                    molybdenite molybdeniteVar = this.f4420adultoid.trailers;
                    Intrinsics.beachfront(molybdeniteVar);
                    paddywack.marial.beachfront(cookieJar, gravesideVar, molybdeniteVar);
                    saneness();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // amphitheatre.saneness.attabal, duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("byteCount < 0: ", Long.valueOf(byteCount)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j = this.bytesRemainingInChunk;
            if (j == 0 || j == -1) {
                marial();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j2 = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (j2 != -1) {
                this.bytesRemainingInChunk -= j2;
                return j2;
            }
            this.f4420adultoid.getConnection().preprohormone();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            saneness();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lamphitheatre/saneness$marial;", "Lamphitheatre/saneness$attabal;", "Lamphitheatre/saneness;", "", "bytesRemaining", "<init>", "(Lamphitheatre/saneness;J)V", "Lduvetyn/wireman;", "sink", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "close", "()V", "polloi", "J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class marial extends attabal {

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final /* synthetic */ saneness f4424molybdenite;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public long bytesRemaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public marial(saneness this$0, long j) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f4424molybdenite = this$0;
            this.bytesRemaining = j;
            if (j == 0) {
                saneness();
            }
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !hereditist.wireman.molybdenite(this, 100, TimeUnit.MILLISECONDS)) {
                this.f4424molybdenite.getConnection().preprohormone();
                saneness();
            }
            dern(true);
        }

        @Override // amphitheatre.saneness.attabal, duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("byteCount < 0: ", Long.valueOf(byteCount)).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j = this.bytesRemaining;
            if (j == 0) {
                return -1L;
            }
            long j2 = super.read(sink, Math.min(j, byteCount));
            if (j2 == -1) {
                this.f4424molybdenite.getConnection().preprohormone();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                saneness();
                throw protocolException;
            }
            long j3 = this.bytesRemaining - j2;
            this.bytesRemaining = j3;
            if (j3 == 0) {
                saneness();
            }
            return j2;
        }
    }

    /* JADX INFO: renamed from: amphitheatre.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lamphitheatre/saneness$saneness;", "Lduvetyn/sealless;", "<init>", "(Lamphitheatre/saneness;)V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "Lduvetyn/wireman;", "source", "", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "close", "Lduvetyn/impassible;", "kowloon", "Lduvetyn/impassible;", "", "arytenoidectomy", "Z", "closed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class C0026saneness implements sealless {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final impassible timeout;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ saneness f4428monoploid;

        public C0026saneness(saneness this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f4428monoploid = this$0;
            this.timeout = new impassible(this$0.sink.getF25464kowloon());
        }

        @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.f4428monoploid.sink.writeUtf8("0\r\n\r\n");
            this.f4428monoploid.triweekly(this.timeout);
            this.f4428monoploid.state = 3;
        }

        @Override // duvetyn.sealless, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            this.f4428monoploid.sink.flush();
        }

        @Override // duvetyn.sealless
        public void supplicat(duvetyn.wireman source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            this.f4428monoploid.sink.writeHexadecimalUnsignedLong(byteCount);
            this.f4428monoploid.sink.writeUtf8("\r\n");
            this.f4428monoploid.sink.supplicat(source, byteCount);
            this.f4428monoploid.sink.writeUtf8("\r\n");
        }

        @Override // duvetyn.sealless
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25464kowloon() {
            return this.timeout;
        }
    }

    public saneness(rotuma rotumaVar, RealConnection connection, duvetyn.beachfront source, duvetyn.marial sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.client = rotumaVar;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new amphitheatre.attabal(source);
    }

    public final supplicat adultoid() {
        int i = this.state;
        if (i != 4) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 5;
        getConnection().preprohormone();
        return new competently(this);
    }

    public final boolean arytenoidectomy(cuirassed cuirassedVar) {
        return dovishness.stratoscope("chunked", cuirassed.rotuma(cuirassedVar, "Transfer-Encoding", null, 2, null), true);
    }

    @Override // paddywack.wireman
    public supplicat attabal(cuirassed response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!paddywack.marial.saneness(response)) {
            return molybdenite(0L);
        }
        if (arytenoidectomy(response)) {
            return polloi(response.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getUrl());
        }
        long jDovishness = hereditist.wireman.dovishness(response);
        return jDovishness != -1 ? molybdenite(jDovishness) : adultoid();
    }

    @Override // paddywack.wireman
    public void cancel() {
        getConnection().wireman();
    }

    @Override // paddywack.wireman
    public sealless dern(preprohormone request, long contentLength) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getBody() != null && request.getBody().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (kowloon(request)) {
            return monoploid();
        }
        if (contentLength != -1) {
            return graveside();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void dovishness(cuirassed response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jDovishness = hereditist.wireman.dovishness(response);
        if (jDovishness == -1) {
            return;
        }
        supplicat supplicatVarMolybdenite = molybdenite(jDovishness);
        hereditist.wireman.grimness(supplicatVarMolybdenite, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        supplicatVarMolybdenite.close();
    }

    @Override // paddywack.wireman
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // paddywack.wireman
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    @Override // paddywack.wireman
    public RealConnection getConnection() {
        return this.connection;
    }

    public final void gintrap(molybdenite headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i = this.state;
        if (i != 0) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(i)).toString());
        }
        this.sink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.sink.writeUtf8(headers.wireman(i2)).writeUtf8(": ").writeUtf8(headers.impromptu(i2)).writeUtf8("\r\n");
        }
        this.sink.writeUtf8("\r\n");
        this.state = 1;
    }

    public final sealless graveside() {
        int i = this.state;
        if (i != 1) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 2;
        return new beachfront(this);
    }

    public final boolean kowloon(preprohormone preprohormoneVar) {
        return dovishness.stratoscope("chunked", preprohormoneVar.wireman("Transfer-Encoding"), true);
    }

    public final supplicat molybdenite(long length) {
        int i = this.state;
        if (i != 4) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 5;
        return new marial(this, length);
    }

    public final sealless monoploid() {
        int i = this.state;
        if (i != 1) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 2;
        return new C0026saneness(this);
    }

    public final supplicat polloi(graveside url) {
        int i = this.state;
        if (i != 4) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(i)).toString());
        }
        this.state = 5;
        return new dern(this, url);
    }

    @Override // paddywack.wireman
    public cuirassed.attabal readResponseHeaders(boolean expectContinue) {
        int i = this.state;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy("state: ", Integer.valueOf(i)).toString());
        }
        try {
            apical apicalVarAttabal = apical.INSTANCE.attabal(this.headersReader.saneness());
            cuirassed.attabal attabalVarFormularize = new cuirassed.attabal().monoploid(apicalVarAttabal.protocol).competently(apicalVarAttabal.code).triweekly(apicalVarAttabal.com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String).formularize(this.headersReader.attabal());
            if (expectContinue && apicalVarAttabal.code == 100) {
                return null;
            }
            int i2 = apicalVarAttabal.code;
            if (i2 == 100) {
                this.state = 3;
                return attabalVarFormularize;
            }
            if (102 > i2 || i2 >= 200) {
                this.state = 4;
                return attabalVarFormularize;
            }
            this.state = 3;
            return attabalVarFormularize;
        } catch (EOFException e) {
            throw new IOException(Intrinsics.arytenoidectomy("unexpected end of stream on ", getConnection().getRoute().getOrg.jacoco.core.runtime.AgentOptions.ADDRESS java.lang.String().getUrl().monoploid()), e);
        }
    }

    @Override // paddywack.wireman
    public long saneness(cuirassed response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!paddywack.marial.saneness(response)) {
            return 0L;
        }
        if (arytenoidectomy(response)) {
            return -1L;
        }
        return hereditist.wireman.dovishness(response);
    }

    public final void triweekly(impassible timeout) {
        restrictive delegate = timeout.getDelegate();
        timeout.cutely(restrictive.f25446marial);
        delegate.attabal();
        delegate.saneness();
    }

    @Override // paddywack.wireman
    public void wireman(preprohormone request) {
        Intrinsics.checkNotNullParameter(request, "request");
        taiyuan taiyuanVar = taiyuan.f35015attabal;
        Proxy.Type type = getConnection().getRoute().getProxy().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        gintrap(request.getHeaders(), taiyuanVar.attabal(request, type));
    }
}
