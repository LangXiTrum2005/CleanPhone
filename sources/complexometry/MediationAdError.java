package complexometry;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: renamed from: complexometry.arytenoidectomy, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"Lcomplexometry/arytenoidectomy;", "Lcomplexometry/apical;", "", "code", "", PglCryptUtils.KEY_MESSAGE, X3.j.D, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "saneness", "Ljava/lang/String;", "dern", "wireman", "attabal", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class MediationAdError extends apical<Integer> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from toString */
    public final int code;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final String domain;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final String message;

    public MediationAdError(int i, String message, String domain) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.code = i;
        this.message = message;
        this.domain = domain;
    }

    public final Integer attabal() {
        return Integer.valueOf(this.code);
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public String getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediationAdError)) {
            return false;
        }
        MediationAdError mediationAdError = (MediationAdError) other;
        return this.code == mediationAdError.code && Intrinsics.wireman(this.message, mediationAdError.message) && Intrinsics.wireman(this.domain, mediationAdError.domain);
    }

    public int hashCode() {
        return this.domain.hashCode() + licking.attabal(this.message, Integer.hashCode(this.code) * 31, 31);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    public String toString() {
        return "MediationAdError(code=" + this.code + ", message=" + this.message + ", domain=" + this.domain + ")";
    }
}
