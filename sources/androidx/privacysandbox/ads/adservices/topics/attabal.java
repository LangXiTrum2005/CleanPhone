package androidx.privacysandbox.ads.adservices.topics;

import com.ironsource.C3414a2;
import java.util.Arrays;
import java.util.Objects;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EncryptedTopic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/attabal;", "", "", "encryptedTopic", "", "keyIdentifier", "encapsulatedKey", "<init>", "([BLjava/lang/String;[B)V", "toString", "()Ljava/lang/String;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "attabal", "[B", "getEncryptedTopic", "()[B", "saneness", "Ljava/lang/String;", "getKeyIdentifier", "dern", "getEncapsulatedKey", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final byte[] EncryptedTopic;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final byte[] EncapsulatedKey;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final String KeyIdentifier;

    public attabal(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.EncryptedTopic = encryptedTopic;
        this.KeyIdentifier = keyIdentifier;
        this.EncapsulatedKey = encapsulatedKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) other;
        return Arrays.equals(this.EncryptedTopic, attabalVar.EncryptedTopic) && this.KeyIdentifier.contentEquals(attabalVar.KeyIdentifier) && Arrays.equals(this.EncapsulatedKey, attabalVar.EncapsulatedKey);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.EncryptedTopic)), this.KeyIdentifier, Integer.valueOf(Arrays.hashCode(this.EncapsulatedKey)));
    }

    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + p002kotlin.text.dovishness.rotuma(this.EncryptedTopic) + ", KeyIdentifier=" + this.KeyIdentifier + ", EncapsulatedKey=" + p002kotlin.text.dovishness.rotuma(this.EncapsulatedKey) + " }");
    }
}
