package okhttp3;

import com.ironsource.X3;
import duvetyn.supplicat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lokhttp3/cord;", "", "<init>", "()V", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Lduvetyn/marial;", "sink", "", "writeTo", "(Lduvetyn/marial;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class cord {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: okhttp3.cord$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RequestBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/cord$attabal;", "", "<init>", "()V", "", "Lokhttp3/dovishness;", "contentType", "Lokhttp3/cord;", "saneness", "(Ljava/lang/String;Lokhttp3/dovishness;)Lokhttp3/cord;", "Lokio/ByteString;", "taiyuan", "(Lokio/ByteString;Lokhttp3/dovishness;)Lokhttp3/cord;", "", "", "offset", "byteCount", "impassible", "([BLokhttp3/dovishness;II)Lokhttp3/cord;", "Ljava/io/File;", "attabal", "(Ljava/io/File;Lokhttp3/dovishness;)Lokhttp3/cord;", "content", "wireman", "(Lokhttp3/dovishness;Ljava/lang/String;)Lokhttp3/cord;", "marial", "(Lokhttp3/dovishness;Lokio/ByteString;)Lokhttp3/cord;", "impromptu", "(Lokhttp3/dovishness;[BII)Lokhttp3/cord;", X3.i.b, "dern", "(Lokhttp3/dovishness;Ljava/io/File;)Lokhttp3/cord;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: okhttp3.cord$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/cord$attabal$attabal", "Lokhttp3/cord;", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Lduvetyn/marial;", "sink", "", "writeTo", "(Lduvetyn/marial;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0756attabal extends cord {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ dovishness f34152attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final /* synthetic */ File f34153saneness;

            public C0756attabal(dovishness dovishnessVar, File file) {
                this.f34152attabal = dovishnessVar;
                this.f34153saneness = file;
            }

            @Override // okhttp3.cord
            public long contentLength() {
                return this.f34153saneness.length();
            }

            @Override // okhttp3.cord
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public dovishness getF34158attabal() {
                return this.f34152attabal;
            }

            @Override // okhttp3.cord
            public void writeTo(duvetyn.marial sink) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                supplicat supplicatVarCutely = duvetyn.adultoid.cutely(this.f34153saneness);
                try {
                    sink.impromptu(supplicatVarCutely);
                    interaction.saneness.attabal(supplicatVarCutely, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        interaction.saneness.attabal(supplicatVarCutely, th);
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: okhttp3.cord$attabal$dern */
        /* JADX INFO: compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/cord$attabal$dern", "Lokhttp3/cord;", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Lduvetyn/marial;", "sink", "", "writeTo", "(Lduvetyn/marial;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class dern extends cord {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ dovishness f34154attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public final /* synthetic */ byte[] f34155dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final /* synthetic */ int f34156saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ int f34157wireman;

            public dern(dovishness dovishnessVar, int i, byte[] bArr, int i2) {
                this.f34154attabal = dovishnessVar;
                this.f34156saneness = i;
                this.f34155dern = bArr;
                this.f34157wireman = i2;
            }

            @Override // okhttp3.cord
            public long contentLength() {
                return this.f34156saneness;
            }

            @Override // okhttp3.cord
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public dovishness getF34158attabal() {
                return this.f34154attabal;
            }

            @Override // okhttp3.cord
            public void writeTo(duvetyn.marial sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f34155dern, this.f34157wireman, this.f34156saneness);
            }
        }

        /* JADX INFO: renamed from: okhttp3.cord$attabal$saneness */
        /* JADX INFO: compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/cord$attabal$saneness", "Lokhttp3/cord;", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Lduvetyn/marial;", "sink", "", "writeTo", "(Lduvetyn/marial;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class saneness extends cord {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ dovishness f34158attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final /* synthetic */ ByteString f34159saneness;

            public saneness(dovishness dovishnessVar, ByteString byteString) {
                this.f34158attabal = dovishnessVar;
                this.f34159saneness = byteString;
            }

            @Override // okhttp3.cord
            public long contentLength() {
                return this.f34159saneness.size();
            }

            @Override // okhttp3.cord
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public dovishness getF34158attabal() {
                return this.f34158attabal;
            }

            @Override // okhttp3.cord
            public void writeTo(duvetyn.marial sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.sensatory(this.f34159saneness);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ cord kowloon(Companion companion, byte[] bArr, dovishness dovishnessVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                dovishnessVar = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.impassible(bArr, dovishnessVar, i, i2);
        }

        public static /* synthetic */ cord triweekly(Companion companion, dovishness dovishnessVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.impromptu(dovishnessVar, bArr, i, i2);
        }

        public final cord apical(byte[] bArr, dovishness dovishnessVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return kowloon(this, bArr, dovishnessVar, 0, 0, 6, null);
        }

        public final cord attabal(File file, dovishness dovishnessVar) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C0756attabal(dovishnessVar, file);
        }

        @patroclinal.wireman
        public final cord beachfront(dovishness dovishnessVar, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return triweekly(this, dovishnessVar, content, 0, 0, 12, null);
        }

        @patroclinal.wireman
        public final cord competently(dovishness dovishnessVar, byte[] content, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            return triweekly(this, dovishnessVar, content, i, 0, 8, null);
        }

        public final cord cutely(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return kowloon(this, bArr, null, 0, 0, 7, null);
        }

        @patroclinal.wireman
        public final cord dern(dovishness contentType, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return attabal(file, contentType);
        }

        public final cord formularize(byte[] bArr, dovishness dovishnessVar, int i) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return kowloon(this, bArr, dovishnessVar, i, 0, 4, null);
        }

        public final cord impassible(byte[] bArr, dovishness dovishnessVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            hereditist.wireman.formularize(bArr.length, i, i2);
            return new dern(dovishnessVar, i2, bArr, i);
        }

        @patroclinal.wireman
        public final cord impromptu(dovishness contentType, byte[] content, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(content, "content");
            return impassible(content, contentType, offset, byteCount);
        }

        @patroclinal.wireman
        public final cord marial(dovishness contentType, ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return taiyuan(content, contentType);
        }

        public final cord saneness(String str, dovishness dovishnessVar) {
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return impassible(bytes, dovishnessVar, 0, bytes.length);
        }

        public final cord taiyuan(ByteString byteString, dovishness dovishnessVar) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return new saneness(dovishnessVar, byteString);
        }

        @patroclinal.wireman
        public final cord wireman(dovishness contentType, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return saneness(content, contentType);
        }

        public Companion() {
        }
    }

    public static final cord create(File file, dovishness dovishnessVar) {
        return INSTANCE.attabal(file, dovishnessVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    /* JADX INFO: renamed from: contentType */
    public abstract dovishness getF34158attabal();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(duvetyn.marial sink) throws IOException;

    public static final cord create(String str, dovishness dovishnessVar) {
        return INSTANCE.saneness(str, dovishnessVar);
    }

    @patroclinal.wireman
    public static final cord create(dovishness dovishnessVar, File file) {
        return INSTANCE.dern(dovishnessVar, file);
    }

    @patroclinal.wireman
    public static final cord create(dovishness dovishnessVar, String str) {
        return INSTANCE.wireman(dovishnessVar, str);
    }

    @patroclinal.wireman
    public static final cord create(dovishness dovishnessVar, ByteString byteString) {
        return INSTANCE.marial(dovishnessVar, byteString);
    }

    @patroclinal.wireman
    public static final cord create(dovishness dovishnessVar, byte[] bArr) {
        return INSTANCE.beachfront(dovishnessVar, bArr);
    }

    @patroclinal.wireman
    public static final cord create(dovishness dovishnessVar, byte[] bArr, int i) {
        return INSTANCE.competently(dovishnessVar, bArr, i);
    }

    @patroclinal.wireman
    public static final cord create(dovishness dovishnessVar, byte[] bArr, int i, int i2) {
        return INSTANCE.impromptu(dovishnessVar, bArr, i, i2);
    }

    public static final cord create(ByteString byteString, dovishness dovishnessVar) {
        return INSTANCE.taiyuan(byteString, dovishnessVar);
    }

    public static final cord create(byte[] bArr) {
        return INSTANCE.cutely(bArr);
    }

    public static final cord create(byte[] bArr, dovishness dovishnessVar) {
        return INSTANCE.apical(bArr, dovishnessVar);
    }

    public static final cord create(byte[] bArr, dovishness dovishnessVar, int i) {
        return INSTANCE.formularize(bArr, dovishnessVar, i);
    }

    public static final cord create(byte[] bArr, dovishness dovishnessVar, int i, int i2) {
        return INSTANCE.impassible(bArr, dovishnessVar, i, i2);
    }
}
