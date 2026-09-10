package formularism;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.ironsource.C3414a2;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lformularism/attabal;", "", "Lokio/ByteString;", "name", "value", "<init>", "(Lokio/ByteString;Lokio/ByteString;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/ByteString;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "attabal", "()Lokio/ByteString;", "saneness", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "I", "hpackSize", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final ByteString f26305beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final ByteString f26306competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final ByteString f26307dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final ByteString f26308impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ByteString f26309marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final ByteString f26311wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f26307dern = companion.wireman(":");
        f26311wireman = companion.wireman(Header.RESPONSE_STATUS_UTF8);
        f26309marial = companion.wireman(Header.TARGET_METHOD_UTF8);
        f26305beachfront = companion.wireman(Header.TARGET_PATH_UTF8);
        f26306competently = companion.wireman(Header.TARGET_SCHEME_UTF8);
        f26308impromptu = companion.wireman(Header.TARGET_AUTHORITY_UTF8);
    }

    public attabal(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final ByteString getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) other;
        return Intrinsics.wireman(this.name, attabalVar.name) && Intrinsics.wireman(this.value, attabalVar.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final ByteString getValue() {
        return this.value;
    }

    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public attabal(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.wireman(name), companion.wireman(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public attabal(ByteString name, String value) {
        this(name, ByteString.INSTANCE.wireman(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
