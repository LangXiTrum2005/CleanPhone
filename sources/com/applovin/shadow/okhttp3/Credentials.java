package com.applovin.shadow.okhttp3;

import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.shadow.okio.ByteString;
import com.ironsource.B5;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/applovin/shadow/okhttp3/Credentials;", "", "()V", "basic", "", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", B5.N, "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String username, String password) {
        n.f(username, "username");
        n.f(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            n.e(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }

    public static final String basic(String username, String password, Charset charset) {
        n.f(username, "username");
        n.f(password, "password");
        n.f(charset, "charset");
        return e.n("Basic ", ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64());
    }
}
