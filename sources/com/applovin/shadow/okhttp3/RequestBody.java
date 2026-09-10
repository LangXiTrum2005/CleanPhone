package com.applovin.shadow.okhttp3;

import an.a;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Source;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/applovin/shadow/okhttp3/RequestBody;", "", "<init>", "()V", "Lcom/applovin/shadow/okhttp3/MediaType;", "contentType", "()Lcom/applovin/shadow/okhttp3/MediaType;", "", "contentLength", "()J", "Lcom/applovin/shadow/okio/BufferedSink;", "sink", "Lwj/r;", "writeTo", "(Lcom/applovin/shadow/okio/BufferedSink;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class RequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, d2 = {"Lcom/applovin/shadow/okhttp3/RequestBody$Companion;", "", "()V", "create", "Lcom/applovin/shadow/okhttp3/RequestBody;", "contentType", "Lcom/applovin/shadow/okhttp3/MediaType;", X3.i.f27782b, "Ljava/io/File;", "content", "", "offset", "", "byteCount", "", "Lcom/applovin/shadow/okio/ByteString;", "asRequestBody", "toRequestBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content) {
            n.f(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i10) {
            n.f(content, "content");
            return create$default(this, mediaType, content, i10, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.create(bArr, mediaType, i10, i11);
        }

        public final RequestBody create(byte[] bArr) {
            n.f(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            n.f(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
            n.f(bArr, "<this>");
            return create$default(this, bArr, mediaType, i10, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.create(mediaType, bArr, i10, i11);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            n.f(str, "<this>");
            Charset charset = a.f3768a;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(final ByteString byteString, final MediaType mediaType) {
            n.f(byteString, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    n.f(sink, "sink");
                    sink.write(byteString);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i10, final int i11) {
            n.f(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i10, i11);
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return i11;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws IOException {
                    n.f(sink, "sink");
                    sink.write(bArr, i10, i11);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            n.f(file, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink sink) throws FileNotFoundException {
                    n.f(sink, "sink");
                    Source source = Okio.source(file);
                    try {
                        sink.writeAll(source);
                        i0.j(source, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            i0.j(source, th2);
                            throw th3;
                        }
                    }
                }
            };
        }

        public final RequestBody create(MediaType contentType, String content) {
            n.f(content, "content");
            return create(content, contentType);
        }

        public final RequestBody create(MediaType contentType, ByteString content) {
            n.f(content, "content");
            return create(content, contentType);
        }

        public final RequestBody create(MediaType contentType, byte[] content, int offset, int byteCount) {
            n.f(content, "content");
            return create(content, contentType, offset, byteCount);
        }

        public final RequestBody create(MediaType contentType, File file) {
            n.f(file, "file");
            return create(file, contentType);
        }
    }

    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink sink) throws IOException;

    public static final RequestBody create(MediaType mediaType, File file) {
        return INSTANCE.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10) {
        return INSTANCE.create(mediaType, bArr, i10);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i10, int i11) {
        return INSTANCE.create(mediaType, bArr, i10, i11);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10) {
        return INSTANCE.create(bArr, mediaType, i10);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i10, int i11) {
        return INSTANCE.create(bArr, mediaType, i10, i11);
    }
}
