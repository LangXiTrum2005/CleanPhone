package okhttp3;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.ironsource.A5;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FormBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0015\u0018B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/polloi;", "Lokhttp3/cord;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Lduvetyn/marial;", "sink", "", "writeTo", "(Lduvetyn/marial;)V", "", "countBytes", "attabal", "(Lduvetyn/marial;Z)J", "Ljava/util/List;", "saneness", "dern", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class polloi extends cord {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final dovishness f34607wireman = dovishness.INSTANCE.attabal("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<String> encodedNames;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final List<String> encodedValues;

    /* JADX INFO: compiled from: FormBody.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/polloi$attabal;", "", "Ljava/nio/charset/Charset;", A5.N, "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", "value", "attabal", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/polloi$attabal;", "saneness", "Lokhttp3/polloi;", "dern", "()Lokhttp3/polloi;", "Ljava/nio/charset/Charset;", "", "Ljava/util/List;", "names", "values", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Charset charset;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final List<String> values;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final List<String> names;

        public attabal() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final attabal attabal(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = this.names;
            graveside.Companion companion = graveside.INSTANCE;
            list.add(graveside.Companion.saneness(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(graveside.Companion.saneness(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final polloi dern() {
            return new polloi(this.names, this.values);
        }

        public final attabal saneness(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = this.names;
            graveside.Companion companion = graveside.INSTANCE;
            list.add(graveside.Companion.saneness(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(graveside.Companion.saneness(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public attabal(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ attabal(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    public polloi(List<String> encodedNames, List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.encodedNames = hereditist.wireman.peridotite(encodedNames);
        this.encodedValues = hereditist.wireman.peridotite(encodedValues);
    }

    public final long attabal(duvetyn.marial sink, boolean countBytes) throws EOFException {
        duvetyn.wireman bufferField;
        if (countBytes) {
            bufferField = new duvetyn.wireman();
        } else {
            Intrinsics.beachfront(sink);
            bufferField = sink.getBufferField();
        }
        int size = this.encodedNames.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                bufferField.writeByte(38);
            }
            bufferField.writeUtf8(this.encodedNames.get(i));
            bufferField.writeByte(61);
            bufferField.writeUtf8(this.encodedValues.get(i));
            i = i2;
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = bufferField.getSize();
        bufferField.attabal();
        return size2;
    }

    @Override // okhttp3.cord
    public long contentLength() {
        return attabal(null, true);
    }

    @Override // okhttp3.cord
    /* JADX INFO: renamed from: contentType */
    public dovishness getContentType() {
        return f34607wireman;
    }

    @Override // okhttp3.cord
    public void writeTo(duvetyn.marial sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        attabal(sink, false);
    }
}
