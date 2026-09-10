package okhttp3;

import com.applovin.sdk.AppLovinEventParameters;
import com.ironsource.A5;
import java.nio.charset.Charset;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/triweekly;", "", "<init>", "()V", "", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", "Ljava/nio/charset/Charset;", A5.N, "attabal", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final triweekly f34698attabal = new triweekly();

    public static final String attabal(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return Intrinsics.arytenoidectomy("Basic ", ByteString.INSTANCE.dern(username + ':' + password, charset).base64());
    }
}
