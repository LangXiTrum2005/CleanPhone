package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import com.ironsource.Ie;
import com.vungle.ads.internal.ui.AdActivity;
import duvetyn.adultoid;
import duvetyn.apical;
import duvetyn.formularize;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.monoploid;
import okhttp3.preprohormone;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Exchange.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002/&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0017J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u0017J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0017J9\u0010/\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u0010\u0017J\u0017\u00102\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010=R$\u0010B\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010AR$\u0010D\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\bC\u0010AR\u001a\u0010I\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010A¨\u0006L"}, d2 = {"Lokhttp3/internal/connection/dern;", "", "Lokhttp3/internal/connection/marial;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/monoploid;", "eventListener", "Lokhttp3/internal/connection/wireman;", "finder", "Lpaddywack/wireman;", "codec", "<init>", "(Lokhttp3/internal/connection/marial;Lokhttp3/monoploid;Lokhttp3/internal/connection/wireman;Lpaddywack/wireman;)V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "", "adultoid", "(Lokhttp3/preprohormone;)V", "", "duplex", "Lduvetyn/sealless;", "dern", "(Lokhttp3/preprohormone;Z)Lduvetyn/sealless;", "beachfront", "()V", "marial", "molybdenite", "expectContinue", "Lokhttp3/cuirassed$attabal;", "monoploid", "(Z)Lokhttp3/cuirassed$attabal;", "Lokhttp3/cuirassed;", Ie.n, "polloi", "(Lokhttp3/cuirassed;)V", "Lokhttp3/stratoscope;", "arytenoidectomy", "(Lokhttp3/cuirassed;)Lokhttp3/stratoscope;", "triweekly", "saneness", "wireman", "Ljava/io/IOException;", "E", "", "bytesRead", "responseDone", "requestDone", "e", "attabal", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "kowloon", "graveside", "(Ljava/io/IOException;)V", "Lokhttp3/internal/connection/marial;", "competently", "()Lokhttp3/internal/connection/marial;", "Lokhttp3/monoploid;", "taiyuan", "()Lokhttp3/monoploid;", "Lokhttp3/internal/connection/wireman;", "cutely", "()Lokhttp3/internal/connection/wireman;", "Lpaddywack/wireman;", "<set-?>", "Z", "impassible", "()Z", "isDuplex", "apical", "hasFailure", "Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RealConnection;", "impromptu", "()Lokhttp3/internal/connection/RealConnection;", "connection", "formularize", "isCoalescedConnection", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final marial call;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean hasFailure;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final RealConnection connection;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final wireman finder;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean isDuplex;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final monoploid eventListener;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final paddywack.wireman codec;

    /* JADX INFO: compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lokhttp3/internal/connection/dern$attabal;", "Lduvetyn/apical;", "Lduvetyn/sealless;", "delegate", "", "contentLength", "<init>", "(Lokhttp3/internal/connection/dern;Lduvetyn/sealless;J)V", "Ljava/io/IOException;", "E", "e", "attabal", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lduvetyn/wireman;", "source", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "close", "arytenoidectomy", "J", "", "monoploid", "Z", "completed", "polloi", "bytesReceived", "molybdenite", "closed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class attabal extends apical {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final long contentLength;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final /* synthetic */ dern f34523graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public boolean completed;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public long bytesReceived;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(dern this$0, sealless delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f34523graveside = this$0;
            this.contentLength = j;
        }

        private final <E extends IOException> E attabal(E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return (E) this.f34523graveside.attabal(this.bytesReceived, false, true, e);
        }

        @Override // duvetyn.apical, duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                attabal(null);
            } catch (IOException e) {
                throw attabal(e);
            }
        }

        @Override // duvetyn.apical, duvetyn.sealless, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw attabal(e);
            }
        }

        @Override // duvetyn.apical, duvetyn.sealless
        public void supplicat(duvetyn.wireman source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j = this.contentLength;
            if (j == -1 || this.bytesReceived + byteCount <= j) {
                try {
                    super.supplicat(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e) {
                    throw attabal(e);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
        }
    }

    /* JADX INFO: compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lokhttp3/internal/connection/dern$saneness;", "Lduvetyn/formularize;", "Lduvetyn/supplicat;", "delegate", "", "contentLength", "<init>", "(Lokhttp3/internal/connection/dern;Lduvetyn/supplicat;J)V", "Lduvetyn/wireman;", "sink", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "close", "()V", "Ljava/io/IOException;", "E", "e", "attabal", "(Ljava/io/IOException;)Ljava/io/IOException;", "kowloon", "J", "arytenoidectomy", "bytesReceived", "", "monoploid", "Z", "invokeStartEvent", "polloi", "completed", "molybdenite", "closed", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class saneness extends formularize {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public long bytesReceived;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final /* synthetic */ dern f34528graveside;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final long contentLength;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public boolean invokeStartEvent;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public boolean completed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(dern this$0, supplicat delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f34528graveside = this$0;
            this.contentLength = j;
            this.invokeStartEvent = true;
            if (j == 0) {
                attabal(null);
            }
        }

        public final <E extends IOException> E attabal(E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            if (e == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.f34528graveside.getEventListener().gintrap(this.f34528graveside.getCall());
            }
            return (E) this.f34528graveside.attabal(this.bytesReceived, true, false, e);
        }

        @Override // duvetyn.formularize, duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                attabal(null);
            } catch (IOException e) {
                throw attabal(e);
            }
        }

        @Override // duvetyn.formularize, duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long j = delegate().read(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f34528graveside.getEventListener().gintrap(this.f34528graveside.getCall());
                }
                if (j == -1) {
                    attabal(null);
                    return -1L;
                }
                long j2 = this.bytesReceived + j;
                long j3 = this.contentLength;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j2);
                }
                this.bytesReceived = j2;
                if (j2 == j3) {
                    attabal(null);
                }
                return j;
            } catch (IOException e) {
                throw attabal(e);
            }
        }
    }

    public dern(marial call, monoploid eventListener, wireman finder, paddywack.wireman codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    public final void adultoid(preprohormone request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.eventListener.adultoid(this.call);
            this.codec.wireman(request);
            this.eventListener.graveside(this.call, request);
        } catch (IOException e) {
            this.eventListener.molybdenite(this.call, e);
            graveside(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final stratoscope arytenoidectomy(cuirassed response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strRotuma = cuirassed.rotuma(response, "Content-Type", null, 2, null);
            long jSaneness = this.codec.saneness(response);
            return new paddywack.impromptu(strRotuma, jSaneness, adultoid.wireman(new saneness(this, this.codec.attabal(response), jSaneness)));
        } catch (IOException e) {
            this.eventListener.rotuma(this.call, e);
            graveside(e);
            throw e;
        }
    }

    public final <E extends IOException> E attabal(long bytesRead, boolean responseDone, boolean requestDone, E e) {
        if (e != null) {
            graveside(e);
        }
        if (requestDone) {
            if (e != null) {
                this.eventListener.molybdenite(this.call, e);
            } else {
                this.eventListener.monoploid(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e != null) {
                this.eventListener.rotuma(this.call, e);
            } else {
                this.eventListener.dovishness(this.call, bytesRead);
            }
        }
        return (E) this.call.adultoid(this, requestDone, responseDone, e);
    }

    public final void beachfront() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e) {
            this.eventListener.molybdenite(this.call, e);
            graveside(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final marial getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final wireman getFinder() {
        return this.finder;
    }

    public final sealless dern(preprohormone request, boolean duplex) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.isDuplex = duplex;
        cord body = request.getBody();
        Intrinsics.beachfront(body);
        long jContentLength = body.contentLength();
        this.eventListener.polloi(this.call);
        return new attabal(this, this.codec.dern(request, jContentLength), jContentLength);
    }

    public final boolean formularize() {
        return !Intrinsics.wireman(this.finder.getAddress().getUrl().getHost(), this.connection.getRoute().getOrg.jacoco.core.runtime.AgentOptions.ADDRESS java.lang.String().getUrl().getHost());
    }

    public final void graveside(IOException e) {
        this.hasFailure = true;
        this.finder.impromptu(e);
        this.codec.getConnection().kattegat(this.call, e);
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final RealConnection getConnection() {
        return this.connection;
    }

    public final void kowloon() {
        this.call.adultoid(this, true, false, null);
    }

    public final void marial() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e) {
            this.eventListener.molybdenite(this.call, e);
            graveside(e);
            throw e;
        }
    }

    public final void molybdenite() {
        this.eventListener.cord(this.call);
    }

    public final cuirassed.attabal monoploid(boolean expectContinue) throws IOException {
        try {
            cuirassed.attabal responseHeaders = this.codec.readResponseHeaders(expectContinue);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.impassible(this);
            return responseHeaders;
        } catch (IOException e) {
            this.eventListener.rotuma(this.call, e);
            graveside(e);
            throw e;
        }
    }

    public final void polloi(cuirassed response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.eventListener.preprohormone(this.call, response);
    }

    public final void saneness() {
        this.codec.cancel();
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final monoploid getEventListener() {
        return this.eventListener;
    }

    public final void triweekly() {
        this.codec.getConnection().preprohormone();
    }

    public final void wireman() {
        this.codec.cancel();
        this.call.adultoid(this, true, true, null);
    }
}
