package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext11OptIn
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/EncryptedTopic;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EncryptedTopic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7957c;

    public EncryptedTopic(byte[] bArr, String str, byte[] bArr2) {
        this.f7955a = bArr;
        this.f7956b = str;
        this.f7957c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedTopic)) {
            return false;
        }
        EncryptedTopic encryptedTopic = (EncryptedTopic) obj;
        return Arrays.equals(this.f7955a, encryptedTopic.f7955a) && this.f7956b.contentEquals(encryptedTopic.f7956b) && Arrays.equals(this.f7957c, encryptedTopic.f7957c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f7955a)), this.f7956b, Integer.valueOf(Arrays.hashCode(this.f7957c)));
    }

    public final String toString() {
        return android.support.v4.media.a.C("EncryptedTopic { ", "EncryptedTopic=" + StringsKt.n(this.f7955a) + ", KeyIdentifier=" + this.f7956b + ", EncapsulatedKey=" + StringsKt.n(this.f7957c) + " }");
    }
}
