package rotproof;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: YoadxAdConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u0005\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u000f\u0010\nR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lrotproof/attabal;", "", "<init>", "()V", "", "saneness", "Ljava/lang/String;", "getAppAdmobPubId", "()Ljava/lang/String;", "attabal", "(Ljava/lang/String;)V", "appAdmobPubId", "dern", "getAuthorizationHmackey", "authorizationHmackey", "wireman", "getHeaderXTokenValue", "headerXTokenValue", "", "marial", "I", "getEncryptedKeyRaw", "()I", "(I)V", "encryptedKeyRaw", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static int encryptedKeyRaw;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f36890attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static String appAdmobPubId = "";

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static String authorizationHmackey = "";

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static String headerXTokenValue = "";

    public final void attabal(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        appAdmobPubId = str;
    }

    public final void dern(int i) {
        encryptedKeyRaw = i;
    }

    public final void saneness(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        authorizationHmackey = str;
    }

    public final void wireman(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        headerXTokenValue = str;
    }
}
