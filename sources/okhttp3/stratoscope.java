package okhttp3;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.A5;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lokhttp3/stratoscope;", "Ljava/io/Closeable;", "<init>", "()V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lduvetyn/beachfront;", "consumer", "", "sizeMapper", "consumeSource", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", A5.N, "()Ljava/nio/charset/Charset;", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lduvetyn/beachfront;", "", "bytes", "()[B", "Lokio/ByteString;", "byteString", "()Lokio/ByteString;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "attabal", "saneness", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class stratoscope implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Reader reader;

    /* JADX INFO: compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/stratoscope$attabal;", "Ljava/io/Reader;", "Lduvetyn/beachfront;", "source", "Ljava/nio/charset/Charset;", A5.N, "<init>", "(Lduvetyn/beachfront;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "", "close", "()V", "kowloon", "Lduvetyn/beachfront;", "arytenoidectomy", "Ljava/nio/charset/Charset;", "", "monoploid", "Z", "closed", "polloi", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal extends Reader {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final Charset charset;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final duvetyn.beachfront source;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public Reader delegate;

        public attabal(duvetyn.beachfront source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                unit = null;
            } else {
                reader.close();
                unit = Unit.f29295attabal;
            }
            if (unit == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), hereditist.wireman.merc(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* JADX INFO: renamed from: okhttp3.stratoscope$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lokhttp3/stratoscope$saneness;", "", "<init>", "()V", "", "Lokhttp3/dovishness;", "contentType", "Lokhttp3/stratoscope;", "saneness", "(Ljava/lang/String;Lokhttp3/dovishness;)Lokhttp3/stratoscope;", "", "impromptu", "([BLokhttp3/dovishness;)Lokhttp3/stratoscope;", "Lokio/ByteString;", "competently", "(Lokio/ByteString;Lokhttp3/dovishness;)Lokhttp3/stratoscope;", "Lduvetyn/beachfront;", "", "contentLength", "attabal", "(Lduvetyn/beachfront;Lokhttp3/dovishness;J)Lokhttp3/stratoscope;", "content", "wireman", "(Lokhttp3/dovishness;Ljava/lang/String;)Lokhttp3/stratoscope;", "beachfront", "(Lokhttp3/dovishness;[B)Lokhttp3/stratoscope;", "marial", "(Lokhttp3/dovishness;Lokio/ByteString;)Lokhttp3/stratoscope;", "dern", "(Lokhttp3/dovishness;JLduvetyn/beachfront;)Lokhttp3/stratoscope;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: okhttp3.stratoscope$saneness$attabal */
        /* JADX INFO: compiled from: ResponseBody.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"okhttp3/stratoscope$saneness$attabal", "Lokhttp3/stratoscope;", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Lduvetyn/beachfront;", "source", "()Lduvetyn/beachfront;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class attabal extends stratoscope {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final /* synthetic */ long f34695arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ dovishness f34696kowloon;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final /* synthetic */ duvetyn.beachfront f34697monoploid;

            public attabal(dovishness dovishnessVar, long j, duvetyn.beachfront beachfrontVar) {
                this.f34696kowloon = dovishnessVar;
                this.f34695arytenoidectomy = j;
                this.f34697monoploid = beachfrontVar;
            }

            @Override // okhttp3.stratoscope
            /* JADX INFO: renamed from: contentLength, reason: from getter */
            public long getF34695arytenoidectomy() {
                return this.f34695arytenoidectomy;
            }

            @Override // okhttp3.stratoscope
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public dovishness getF34696kowloon() {
                return this.f34696kowloon;
            }

            @Override // okhttp3.stratoscope
            /* JADX INFO: renamed from: source, reason: from getter */
            public duvetyn.beachfront getF34697monoploid() {
                return this.f34697monoploid;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ stratoscope taiyuan(Companion companion, byte[] bArr, dovishness dovishnessVar, int i, Object obj) {
            if ((i & 1) != 0) {
                dovishnessVar = null;
            }
            return companion.impromptu(bArr, dovishnessVar);
        }

        public final stratoscope attabal(duvetyn.beachfront beachfrontVar, dovishness dovishnessVar, long j) {
            Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
            return new attabal(dovishnessVar, j, beachfrontVar);
        }

        @patroclinal.wireman
        public final stratoscope beachfront(dovishness contentType, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return impromptu(content, contentType);
        }

        public final stratoscope competently(ByteString byteString, dovishness dovishnessVar) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return attabal(new duvetyn.wireman().sensatory(byteString), dovishnessVar, byteString.size());
        }

        @patroclinal.wireman
        public final stratoscope dern(dovishness contentType, long contentLength, duvetyn.beachfront content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return attabal(content, contentType, contentLength);
        }

        public final stratoscope impromptu(byte[] bArr, dovishness dovishnessVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return attabal(new duvetyn.wireman().write(bArr), dovishnessVar, bArr.length);
        }

        @patroclinal.wireman
        public final stratoscope marial(dovishness contentType, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return competently(content, contentType);
        }

        public final stratoscope saneness(String str, dovishness dovishnessVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (dovishnessVar != null) {
                Charset charsetWireman = dovishness.wireman(dovishnessVar, null, 1, null);
                if (charsetWireman == null) {
                    dovishnessVar = dovishness.INSTANCE.saneness(dovishnessVar + "; charset=utf-8");
                } else {
                    charset = charsetWireman;
                }
            }
            duvetyn.wireman wiremanVarPicketboat = new duvetyn.wireman().picketboat(str, charset);
            return attabal(wiremanVarPicketboat, dovishnessVar, wiremanVarPicketboat.getSize());
        }

        @patroclinal.wireman
        public final stratoscope wireman(dovishness contentType, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return saneness(content, contentType);
        }

        public Companion() {
        }
    }

    private final Charset charset() {
        dovishness f34696kowloon = getF34696kowloon();
        Charset charsetDern = f34696kowloon == null ? null : f34696kowloon.dern(Charsets.UTF_8);
        return charsetDern == null ? Charsets.UTF_8 : charsetDern;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Function1<? super duvetyn.beachfront, ? extends T> consumer, Function1<? super T, Integer> sizeMapper) throws IOException {
        long f34695arytenoidectomy = getF34695arytenoidectomy();
        if (f34695arytenoidectomy > 2147483647L) {
            throw new IOException(Intrinsics.arytenoidectomy("Cannot buffer entire body for content length: ", Long.valueOf(f34695arytenoidectomy)));
        }
        duvetyn.beachfront f34697monoploid = getF34697monoploid();
        try {
            T tInvoke = consumer.invoke(f34697monoploid);
            p002kotlin.jvm.internal.impassible.saneness(1);
            interaction.saneness.attabal(f34697monoploid, null);
            p002kotlin.jvm.internal.impassible.attabal(1);
            int iIntValue = sizeMapper.invoke(tInvoke).intValue();
            if (f34695arytenoidectomy == -1 || f34695arytenoidectomy == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + f34695arytenoidectomy + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p002kotlin.jvm.internal.impassible.saneness(1);
                interaction.saneness.attabal(f34697monoploid, th);
                p002kotlin.jvm.internal.impassible.attabal(1);
                throw th2;
            }
        }
    }

    public static final stratoscope create(duvetyn.beachfront beachfrontVar, dovishness dovishnessVar, long j) {
        return INSTANCE.attabal(beachfrontVar, dovishnessVar, j);
    }

    public final InputStream byteStream() {
        return getF34697monoploid().inputStream();
    }

    public final ByteString byteString() throws IOException {
        long f34695arytenoidectomy = getF34695arytenoidectomy();
        if (f34695arytenoidectomy > 2147483647L) {
            throw new IOException(Intrinsics.arytenoidectomy("Cannot buffer entire body for content length: ", Long.valueOf(f34695arytenoidectomy)));
        }
        duvetyn.beachfront f34697monoploid = getF34697monoploid();
        try {
            ByteString byteString = f34697monoploid.readByteString();
            interaction.saneness.attabal(f34697monoploid, null);
            int size = byteString.size();
            if (f34695arytenoidectomy == -1 || f34695arytenoidectomy == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + f34695arytenoidectomy + ") and stream length (" + size + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                interaction.saneness.attabal(f34697monoploid, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long f34695arytenoidectomy = getF34695arytenoidectomy();
        if (f34695arytenoidectomy > 2147483647L) {
            throw new IOException(Intrinsics.arytenoidectomy("Cannot buffer entire body for content length: ", Long.valueOf(f34695arytenoidectomy)));
        }
        duvetyn.beachfront f34697monoploid = getF34697monoploid();
        try {
            byte[] byteArray = f34697monoploid.readByteArray();
            interaction.saneness.attabal(f34697monoploid, null);
            int length = byteArray.length;
            if (f34695arytenoidectomy == -1 || f34695arytenoidectomy == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + f34695arytenoidectomy + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                interaction.saneness.attabal(f34697monoploid, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        attabal attabalVar = new attabal(getF34697monoploid(), charset());
        this.reader = attabalVar;
        return attabalVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        hereditist.wireman.impassible(getF34697monoploid());
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long getF34695arytenoidectomy();

    /* JADX INFO: renamed from: contentType */
    public abstract dovishness getF34696kowloon();

    /* JADX INFO: renamed from: source */
    public abstract duvetyn.beachfront getF34697monoploid();

    public final String string() throws IOException {
        duvetyn.beachfront f34697monoploid = getF34697monoploid();
        try {
            String string = f34697monoploid.readString(hereditist.wireman.merc(f34697monoploid, charset()));
            interaction.saneness.attabal(f34697monoploid, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                interaction.saneness.attabal(f34697monoploid, th);
                throw th2;
            }
        }
    }

    public static final stratoscope create(String str, dovishness dovishnessVar) {
        return INSTANCE.saneness(str, dovishnessVar);
    }

    @patroclinal.wireman
    public static final stratoscope create(dovishness dovishnessVar, long j, duvetyn.beachfront beachfrontVar) {
        return INSTANCE.dern(dovishnessVar, j, beachfrontVar);
    }

    @patroclinal.wireman
    public static final stratoscope create(dovishness dovishnessVar, String str) {
        return INSTANCE.wireman(dovishnessVar, str);
    }

    @patroclinal.wireman
    public static final stratoscope create(dovishness dovishnessVar, ByteString byteString) {
        return INSTANCE.marial(dovishnessVar, byteString);
    }

    @patroclinal.wireman
    public static final stratoscope create(dovishness dovishnessVar, byte[] bArr) {
        return INSTANCE.beachfront(dovishnessVar, bArr);
    }

    public static final stratoscope create(ByteString byteString, dovishness dovishnessVar) {
        return INSTANCE.competently(byteString, dovishnessVar);
    }

    public static final stratoscope create(byte[] bArr, dovishness dovishnessVar) {
        return INSTANCE.impromptu(bArr, dovishnessVar);
    }
}
