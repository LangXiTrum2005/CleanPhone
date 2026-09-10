package scarbroite;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lscarbroite/saneness;", "", "", "userId", "customData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "attabal", "Ljava/lang/String;", "saneness", "()Ljava/lang/String;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String userId;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final String customData;

    public saneness(String userId, String customData) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(customData, "customData");
        this.userId = userId;
        this.customData = customData;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getCustomData() {
        return this.customData;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }
}
