package formularism;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import duvetyn.restrictive;
import duvetyn.supplicat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u00032\u000e\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J/\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u0017J/\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u0017J/\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010\u0017J/\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010\u0017J/\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010\u0017J/\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lformularism/beachfront;", "Ljava/io/Closeable;", "Lduvetyn/beachfront;", "source", "", "client", "<init>", "(Lduvetyn/beachfront;Z)V", "Lformularism/beachfront$dern;", "handler", "", "dern", "(Lformularism/beachfront$dern;)V", "requireSettings", "saneness", "(ZLformularism/beachfront$dern;)Z", "close", "()V", "", "length", "flags", "streamId", "arytenoidectomy", "(Lformularism/beachfront$dern;III)V", "padding", "", "Lformularism/attabal;", "formularize", "(IIII)Ljava/util/List;", "marial", "rotuma", "dovishness", "(Lformularism/beachfront$dern;I)V", "kattegat", "restrictive", "cuirassed", "monoploid", "cutely", "merc", "kowloon", "Lduvetyn/beachfront;", "Z", "Lformularism/beachfront$saneness;", "Lformularism/beachfront$saneness;", "continuation", "Lformularism/saneness$attabal;", "polloi", "Lformularism/saneness$attabal;", "hpackReader", "molybdenite", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class beachfront implements Closeable {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final Logger f26313graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final duvetyn.beachfront source;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final saneness continuation;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final formularism.saneness.attabal hpackReader;

    /* JADX INFO: renamed from: formularism.beachfront$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lformularism/beachfront$attabal;", "", "<init>", "()V", "", "length", "flags", "padding", "saneness", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "attabal", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger attabal() {
            return beachfront.f26313graveside;
        }

        public final int saneness(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lformularism/beachfront$dern;", "", "", "inFinished", "", "streamId", "Lduvetyn/beachfront;", "source", "length", "", "dern", "(ZILduvetyn/beachfront;I)V", "associatedStreamId", "", "Lformularism/attabal;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "saneness", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lformularism/apical;", "settings", "attabal", "(ZLformularism/apical;)V", "ackSettings", "()V", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "wireman", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface dern {
        void ackSettings();

        void attabal(boolean clearPrevious, apical settings);

        void dern(boolean inFinished, int streamId, duvetyn.beachfront source, int length) throws IOException;

        void headers(boolean inFinished, int streamId, int associatedStreamId, List<attabal> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, List<attabal> requestHeaders) throws IOException;

        void saneness(int streamId, ErrorCode errorCode);

        void windowUpdate(int streamId, long windowSizeIncrement);

        void wireman(int lastGoodStreamId, ErrorCode errorCode, ByteString debugData);
    }

    static {
        Logger logger = Logger.getLogger(formularism.dern.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f26313graveside = logger;
    }

    public beachfront(duvetyn.beachfront source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.client = z;
        saneness sanenessVar = new saneness(source);
        this.continuation = sanenessVar;
        this.hpackReader = new formularism.saneness.attabal(sanenessVar, 4096, 0, 4, null);
    }

    public final void arytenoidectomy(dern handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (flags & 1) != 0;
        int iWireman = (flags & 8) != 0 ? hereditist.wireman.wireman(this.source.readByte(), 255) : 0;
        if ((flags & 32) != 0) {
            dovishness(handler, streamId);
            length -= 5;
        }
        handler.headers(z, streamId, -1, formularize(INSTANCE.saneness(length, flags, iWireman), iWireman, flags, streamId));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final void cuirassed(dern handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iWireman = (flags & 8) != 0 ? hereditist.wireman.wireman(this.source.readByte(), 255) : 0;
        handler.pushPromise(streamId, this.source.readInt() & Integer.MAX_VALUE, formularize(INSTANCE.saneness(length - 4, flags, iWireman), iWireman, flags, streamId));
    }

    public final void cutely(dern handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException(Intrinsics.arytenoidectomy("TYPE_GOAWAY length < 8: ", Integer.valueOf(length)));
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i = this.source.readInt();
        int i2 = this.source.readInt();
        int i3 = length - 8;
        ErrorCode errorCodeAttabal = ErrorCode.INSTANCE.attabal(i2);
        if (errorCodeAttabal == null) {
            throw new IOException(Intrinsics.arytenoidectomy("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i2)));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i3 > 0) {
            byteString = this.source.readByteString(i3);
        }
        handler.wireman(i, errorCodeAttabal, byteString);
    }

    public final void dern(dern handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.client) {
            if (!saneness(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        duvetyn.beachfront beachfrontVar = this.source;
        ByteString byteString = formularism.dern.CONNECTION_PREFACE;
        ByteString byteString2 = beachfrontVar.readByteString(byteString.size());
        Logger logger = f26313graveside;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(hereditist.wireman.graveside(Intrinsics.arytenoidectomy("<< CONNECTION ", byteString2.hex()), new Object[0]));
        }
        if (!Intrinsics.wireman(byteString, byteString2)) {
            throw new IOException(Intrinsics.arytenoidectomy("Expected a connection header but was ", byteString2.utf8()));
        }
    }

    public final void dovishness(dern handler, int streamId) throws IOException {
        int i = this.source.readInt();
        handler.priority(streamId, i & Integer.MAX_VALUE, hereditist.wireman.wireman(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i) != 0);
    }

    public final List<attabal> formularize(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.marial(length);
        saneness sanenessVar = this.continuation;
        sanenessVar.cutely(sanenessVar.getLeft());
        this.continuation.formularize(padding);
        this.continuation.dern(flags);
        this.continuation.arytenoidectomy(streamId);
        this.hpackReader.apical();
        return this.hpackReader.marial();
    }

    public final void kattegat(dern handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i = this.source.readInt();
        ErrorCode errorCodeAttabal = ErrorCode.INSTANCE.attabal(i);
        if (errorCodeAttabal == null) {
            throw new IOException(Intrinsics.arytenoidectomy("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i)));
        }
        handler.saneness(streamId, errorCodeAttabal);
    }

    public final void marial(dern handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iWireman = (flags & 8) != 0 ? hereditist.wireman.wireman(this.source.readByte(), 255) : 0;
        handler.dern(z, streamId, this.source, INSTANCE.saneness(length, flags, iWireman));
        this.source.skip(iWireman);
    }

    public final void merc(dern handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException(Intrinsics.arytenoidectomy("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(length)));
        }
        long jBeachfront = hereditist.wireman.beachfront(this.source.readInt(), 2147483647L);
        if (jBeachfront == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(streamId, jBeachfront);
    }

    public final void monoploid(dern handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException(Intrinsics.arytenoidectomy("TYPE_PING length != 8: ", Integer.valueOf(length)));
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    public final void restrictive(dern handler, int length, int flags, int streamId) throws IOException {
        if (streamId != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (length % 6 != 0) {
            throw new IOException(Intrinsics.arytenoidectomy("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(length)));
        }
        apical apicalVar = new apical();
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, length), 6);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int i = first + step;
                int iMarial = hereditist.wireman.marial(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                int i2 = this.source.readInt();
                if (iMarial != 2) {
                    if (iMarial == 3) {
                        iMarial = 4;
                    } else if (iMarial != 4) {
                        if (iMarial == 5 && (i2 < 16384 || i2 > 16777215)) {
                            throw new IOException(Intrinsics.arytenoidectomy("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(i2)));
                        }
                    } else {
                        if (i2 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iMarial = 7;
                    }
                } else if (i2 != 0 && i2 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                apicalVar.impromptu(iMarial, i2);
                if (first != last) {
                    first = i;
                }
            }
        }
        handler.attabal(false, apicalVar);
    }

    public final void rotuma(dern handler, int length, int flags, int streamId) throws IOException {
        if (length == 5) {
            if (streamId == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            dovishness(handler, streamId);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
    }

    public final boolean saneness(boolean requireSettings, dern handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.source.require(9L);
            int iPolder = hereditist.wireman.polder(this.source);
            if (iPolder > 16384) {
                throw new IOException(Intrinsics.arytenoidectomy("FRAME_SIZE_ERROR: ", Integer.valueOf(iPolder)));
            }
            int iWireman = hereditist.wireman.wireman(this.source.readByte(), 255);
            int iWireman2 = hereditist.wireman.wireman(this.source.readByte(), 255);
            int i = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger = f26313graveside;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(formularism.dern.f26356attabal.dern(true, i, iPolder, iWireman, iWireman2));
            }
            if (requireSettings && iWireman != 4) {
                throw new IOException(Intrinsics.arytenoidectomy("Expected a SETTINGS frame but was ", formularism.dern.f26356attabal.saneness(iWireman)));
            }
            switch (iWireman) {
                case 0:
                    marial(handler, iPolder, iWireman2, i);
                    return true;
                case 1:
                    arytenoidectomy(handler, iPolder, iWireman2, i);
                    return true;
                case 2:
                    rotuma(handler, iPolder, iWireman2, i);
                    return true;
                case 3:
                    kattegat(handler, iPolder, iWireman2, i);
                    return true;
                case 4:
                    restrictive(handler, iPolder, iWireman2, i);
                    return true;
                case 5:
                    cuirassed(handler, iPolder, iWireman2, i);
                    return true;
                case 6:
                    monoploid(handler, iPolder, iWireman2, i);
                    return true;
                case 7:
                    cutely(handler, iPolder, iWireman2, i);
                    return true;
                case 8:
                    merc(handler, iPolder, iWireman2, i);
                    return true;
                default:
                    this.source.skip(iPolder);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010#\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b\u0016\u0010\u001bR\"\u0010'\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001b¨\u0006,"}, d2 = {"Lformularism/beachfront$saneness;", "Lduvetyn/supplicat;", "Lduvetyn/beachfront;", "source", "<init>", "(Lduvetyn/beachfront;)V", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", "close", "()V", "saneness", "kowloon", "Lduvetyn/beachfront;", "", "arytenoidectomy", "I", "getLength", "()I", "cutely", "(I)V", "length", "monoploid", "getFlags", "dern", "flags", "polloi", "getStreamId", "streamId", "molybdenite", "attabal", "marial", TtmlNode.LEFT, "graveside", "getPadding", "formularize", "padding", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class saneness implements supplicat {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public int padding;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.beachfront source;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public int left;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public int flags;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public int streamId;

        public saneness(duvetyn.beachfront source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final void arytenoidectomy(int i) {
            this.streamId = i;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        public final void cutely(int i) {
            this.length = i;
        }

        public final void dern(int i) {
            this.flags = i;
        }

        public final void formularize(int i) {
            this.padding = i;
        }

        public final void marial(int i) {
            this.left = i;
        }

        @Override // duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i = this.left;
                if (i != 0) {
                    long j = this.source.read(sink, Math.min(byteCount, i));
                    if (j == -1) {
                        return -1L;
                    }
                    this.left -= (int) j;
                    return j;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                saneness();
            }
        }

        public final void saneness() throws IOException {
            int i = this.streamId;
            int iPolder = hereditist.wireman.polder(this.source);
            this.left = iPolder;
            this.length = iPolder;
            int iWireman = hereditist.wireman.wireman(this.source.readByte(), 255);
            this.flags = hereditist.wireman.wireman(this.source.readByte(), 255);
            Companion companion = beachfront.INSTANCE;
            if (companion.attabal().isLoggable(Level.FINE)) {
                companion.attabal().fine(formularism.dern.f26356attabal.dern(true, this.streamId, this.length, iWireman, this.flags));
            }
            int i2 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i2;
            if (iWireman == 9) {
                if (i2 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iWireman + " != TYPE_CONTINUATION");
            }
        }

        @Override // duvetyn.supplicat
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25466kowloon() {
            return this.source.getF25466kowloon();
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
