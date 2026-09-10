package gutturalization;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReferrerModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgutturalization/attabal;", "", "<init>", "()V", "", "attabal", "Ljava/lang/String;", "()Ljava/lang/String;", "saneness", "(Ljava/lang/String;)V", "appsflyerKey", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appsflyerKey")
    private String appsflyerKey = "";

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getAppsflyerKey() {
        return this.appsflyerKey;
    }

    public final void saneness(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appsflyerKey = str;
    }
}
