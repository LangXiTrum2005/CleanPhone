package com.zg.adlib.util;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.zg.adlib.interceptor.MNetworkStateInterceptor;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.text.ParseException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/zg/adlib/util/Error;", "", "<init>", "(Ljava/lang/String;I)V", "REMOTE_MESSAGE", "REMOTE_TOKEN_INVALID", "LOCAL_TIME_OUT", "LOCAL_UNKNOWN_HOST", "LOCAL_NET_STATE", "LOCAL_PARSE", "LOCAL_DEFAULT", "LOCAL_UNKNOWN", "Companion", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Error {
    REMOTE_MESSAGE,
    REMOTE_TOKEN_INVALID,
    LOCAL_TIME_OUT,
    LOCAL_UNKNOWN_HOST,
    LOCAL_NET_STATE,
    LOCAL_PARSE,
    LOCAL_DEFAULT,
    LOCAL_UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/zg/adlib/util/Error$Companion;", "", "<init>", "()V", "getLocal", "Lcom/zg/adlib/util/Error;", "t", "", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Error getLocal(Throwable t) {
            Intrinsics.f(t, "t");
            t.printStackTrace();
            if (t instanceof SocketTimeoutException) {
                return Error.LOCAL_TIME_OUT;
            }
            if ((t instanceof UnknownServiceException) || (t instanceof UnknownHostException) || (t instanceof SSLHandshakeException) || (t instanceof SSLPeerUnverifiedException)) {
                return Error.LOCAL_UNKNOWN_HOST;
            }
            if ((t instanceof JsonParseException) || (t instanceof JsonSyntaxException) || (t instanceof JsonIOException) || (t instanceof JSONException) || (t instanceof ParseException)) {
                return Error.LOCAL_PARSE;
            }
            return t instanceof MNetworkStateInterceptor.UnknownNetworkException ? Error.LOCAL_NET_STATE : Error.LOCAL_UNKNOWN;
        }

        private Companion() {
        }
    }

    public static EnumEntries<Error> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static final Error getLocal(Throwable th) {
        return INSTANCE.getLocal(th);
    }
}
