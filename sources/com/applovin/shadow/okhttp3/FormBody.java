package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.B5;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0002#\"B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006$"}, d2 = {"Lcom/applovin/shadow/okhttp3/FormBody;", "Lcom/applovin/shadow/okhttp3/RequestBody;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lcom/applovin/shadow/okio/BufferedSink;", "sink", "", "countBytes", "", "writeOrCountBytes", "(Lcom/applovin/shadow/okio/BufferedSink;Z)J", "", "-deprecated_size", "()I", "size", "index", "encodedName", "(I)Ljava/lang/String;", "name", "encodedValue", X3.i.X, "Lcom/applovin/shadow/okhttp3/MediaType;", "contentType", "()Lcom/applovin/shadow/okhttp3/MediaType;", "contentLength", "()J", "Lwj/r;", "writeTo", "(Lcom/applovin/shadow/okio/BufferedSink;)V", "Ljava/util/List;", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    private static final MediaType CONTENT_TYPE = MediaType.INSTANCE.get("application/x-www-form-urlencoded");

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/applovin/shadow/okhttp3/FormBody$Builder;", "", B5.N, "Ljava/nio/charset/Charset;", "(Ljava/nio/charset/Charset;)V", "names", "", "", "values", "add", "name", X3.i.X, "addEncoded", InAppPurchaseConstants.METHOD_BUILD, "Lcom/applovin/shadow/okhttp3/FormBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder add(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public FormBody(List<String> encodedNames, List<String> encodedValues) {
        n.f(encodedNames, "encodedNames");
        n.f(encodedValues, "encodedValues");
        this.encodedNames = Util.toImmutableList(encodedNames);
        this.encodedValues = Util.toImmutableList(encodedValues);
    }

    private final long writeOrCountBytes(BufferedSink sink, boolean countBytes) throws EOFException {
        Buffer buffer;
        if (countBytes) {
            buffer = new Buffer();
        } else {
            n.c(sink);
            buffer = sink.getBuffer();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i10));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i10));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m41deprecated_size() {
        return size();
    }

    @Override // com.applovin.shadow.okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // com.applovin.shadow.okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int index) {
        return this.encodedNames.get(index);
    }

    public final String encodedValue(int index) {
        return this.encodedValues.get(index);
    }

    public final String name(int index) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedName(index), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int index) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedValue(index), 0, 0, true, 3, null);
    }

    @Override // com.applovin.shadow.okhttp3.RequestBody
    public void writeTo(BufferedSink sink) throws IOException {
        n.f(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
