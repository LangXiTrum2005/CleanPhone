package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okio.ByteString;
import org.jacoco.core.runtime.RemoteControlWriter;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0003\u0019\u0010\u001cB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0005\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010#¨\u0006&"}, d2 = {"Lokhttp3/gintrap;", "Lokhttp3/cord;", "Lokio/ByteString;", "boundaryByteString", "Lokhttp3/dovishness;", "type", "", "Lokhttp3/gintrap$dern;", "parts", "<init>", "(Lokio/ByteString;Lokhttp3/dovishness;Ljava/util/List;)V", "Lduvetyn/marial;", "sink", "", "countBytes", "", "saneness", "(Lduvetyn/marial;Z)J", "contentType", "()Lokhttp3/dovishness;", "contentLength", "()J", "", "writeTo", "(Lduvetyn/marial;)V", "attabal", "Lokio/ByteString;", "Lokhttp3/dovishness;", "dern", "Ljava/util/List;", "()Ljava/util/List;", "wireman", "marial", "J", "", "()Ljava/lang/String;", "boundary", "beachfront", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class gintrap extends cord {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final dovishness f34240apical;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final dovishness f34242competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final dovishness f34243cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final byte[] f34244formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final byte[] f34245impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final dovishness f34246impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final dovishness f34247taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final byte[] f34248triweekly;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final ByteString boundaryByteString;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final List<dern> parts;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public long contentLength;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final dovishness type;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final dovishness contentType;

    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/gintrap$attabal;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/dovishness;", "type", "wireman", "(Lokhttp3/dovishness;)Lokhttp3/gintrap$attabal;", "Lokhttp3/molybdenite;", "headers", "Lokhttp3/cord;", "body", "attabal", "(Lokhttp3/molybdenite;Lokhttp3/cord;)Lokhttp3/gintrap$attabal;", "Lokhttp3/gintrap$dern;", "part", "saneness", "(Lokhttp3/gintrap$dern;)Lokhttp3/gintrap$attabal;", "Lokhttp3/gintrap;", "dern", "()Lokhttp3/gintrap;", "Lokio/ByteString;", "Lokio/ByteString;", "Lokhttp3/dovishness;", "", "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final ByteString boundary;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final List<dern> parts;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public dovishness type;

        public attabal() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final attabal attabal(molybdenite headers, cord body) {
            Intrinsics.checkNotNullParameter(body, "body");
            saneness(dern.INSTANCE.attabal(headers, body));
            return this;
        }

        public final gintrap dern() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new gintrap(this.boundary, this.type, hereditist.wireman.peridotite(this.parts));
        }

        public final attabal saneness(dern part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.parts.add(part);
            return this;
        }

        public final attabal wireman(dovishness type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Intrinsics.wireman(type.getType(), "multipart")) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy("multipart != ", type).toString());
            }
            this.type = type;
            return this;
        }

        public attabal(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.boundary = ByteString.INSTANCE.wireman(boundary);
            this.type = gintrap.f34242competently;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ attabal(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lokhttp3/gintrap$dern;", "", "Lokhttp3/molybdenite;", "headers", "Lokhttp3/cord;", "body", "<init>", "(Lokhttp3/molybdenite;Lokhttp3/cord;)V", "attabal", "Lokhttp3/molybdenite;", "saneness", "()Lokhttp3/molybdenite;", "Lokhttp3/cord;", "()Lokhttp3/cord;", "dern", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class dern {

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final molybdenite headers;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final cord body;

        /* JADX INFO: renamed from: okhttp3.gintrap$dern$attabal, reason: from kotlin metadata */
        /* JADX INFO: compiled from: MultipartBody.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/gintrap$dern$attabal;", "", "<init>", "()V", "Lokhttp3/molybdenite;", "headers", "Lokhttp3/cord;", "body", "Lokhttp3/gintrap$dern;", "attabal", "(Lokhttp3/molybdenite;Lokhttp3/cord;)Lokhttp3/gintrap$dern;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final dern attabal(molybdenite headers, cord body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers == null ? null : headers.saneness("Content-Type")) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers == null ? null : headers.saneness("Content-Length")) == null) {
                    return new dern(headers, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public Companion() {
            }
        }

        public /* synthetic */ dern(molybdenite molybdeniteVar, cord cordVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(molybdeniteVar, cordVar);
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final cord getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final molybdenite getHeaders() {
            return this.headers;
        }

        public dern(molybdenite molybdeniteVar, cord cordVar) {
            this.headers = molybdeniteVar;
            this.body = cordVar;
        }
    }

    static {
        dovishness.Companion companion = dovishness.INSTANCE;
        f34242competently = companion.attabal("multipart/mixed");
        f34246impromptu = companion.attabal("multipart/alternative");
        f34247taiyuan = companion.attabal("multipart/digest");
        f34243cutely = companion.attabal("multipart/parallel");
        f34240apical = companion.attabal("multipart/form-data");
        f34244formularize = new byte[]{58, RemoteControlWriter.BLOCK_CMDOK};
        f34245impassible = new byte[]{13, 10};
        f34248triweekly = new byte[]{45, 45};
    }

    public gintrap(ByteString boundaryByteString, dovishness type, List<dern> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = dovishness.INSTANCE.attabal(type + "; boundary=" + attabal());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long saneness(duvetyn.marial sink, boolean countBytes) throws IOException {
        duvetyn.wireman wiremanVar;
        if (countBytes) {
            sink = new duvetyn.wireman();
            wiremanVar = sink;
        } else {
            wiremanVar = 0;
        }
        int size = this.parts.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            dern dernVar = this.parts.get(i);
            molybdenite headers = dernVar.getHeaders();
            cord body = dernVar.getBody();
            Intrinsics.beachfront(sink);
            sink.write(f34248triweekly);
            sink.sensatory(this.boundaryByteString);
            sink.write(f34245impassible);
            if (headers != null) {
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    sink.writeUtf8(headers.wireman(i3)).write(f34244formularize).writeUtf8(headers.impromptu(i3)).write(f34245impassible);
                }
            }
            dovishness contentType = body.getContentType();
            if (contentType != null) {
                sink.writeUtf8("Content-Type: ").writeUtf8(contentType.getMediaType()).write(f34245impassible);
            }
            long jContentLength = body.contentLength();
            if (jContentLength != -1) {
                sink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f34245impassible);
            } else if (countBytes) {
                Intrinsics.beachfront(wiremanVar);
                wiremanVar.attabal();
                return -1L;
            }
            byte[] bArr = f34245impassible;
            sink.write(bArr);
            if (countBytes) {
                j += jContentLength;
            } else {
                body.writeTo(sink);
            }
            sink.write(bArr);
            i = i2;
        }
        Intrinsics.beachfront(sink);
        byte[] bArr2 = f34248triweekly;
        sink.write(bArr2);
        sink.sensatory(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(f34245impassible);
        if (!countBytes) {
            return j;
        }
        Intrinsics.beachfront(wiremanVar);
        long size3 = j + wiremanVar.getSize();
        wiremanVar.attabal();
        return size3;
    }

    public final String attabal() {
        return this.boundaryByteString.utf8();
    }

    @Override // okhttp3.cord
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jSaneness = saneness(null, true);
        this.contentLength = jSaneness;
        return jSaneness;
    }

    @Override // okhttp3.cord
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public dovishness getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.cord
    public void writeTo(duvetyn.marial sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        saneness(sink, false);
    }
}
