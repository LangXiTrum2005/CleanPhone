package okhttp3;

import android.support.v4.media.a;
import com.applovin.sdk.AppLovinEventParameters;
import com.p004ironsource.dc;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", dc.M, "Ljava/nio/charset/Charset;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @JvmStatic
    public static final String basic(String username, String password) {
        Intrinsics.f(username, "username");
        Intrinsics.f(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            Intrinsics.e(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }

    @JvmStatic
    public static final String basic(String username, String password, Charset charset) {
        Intrinsics.f(username, "username");
        Intrinsics.f(password, "password");
        Intrinsics.f(charset, "charset");
        String str = username + AbstractJsonLexerKt.COLON + password;
        ByteString byteString = ByteString.e0;
        Intrinsics.f(str, "<this>");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        return a.C("Basic ", new ByteString(bytes).d());
    }
}
