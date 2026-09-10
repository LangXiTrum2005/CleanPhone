package com.zg.adlib.interceptor;

import android.content.Context;
import android.net.ConnectivityManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/zg/adlib/interceptor/MNetworkStateInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "hasNetwork", "", "UnknownNetworkException", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MNetworkStateInterceptor implements Interceptor {
    private final Context context;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/zg/adlib/interceptor/MNetworkStateInterceptor$UnknownNetworkException;", "Ljava/io/IOException;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownNetworkException extends IOException {
        public UnknownNetworkException(String str) {
            super(str);
        }
    }

    public MNetworkStateInterceptor(Context context) {
        Intrinsics.f(context, "context");
        this.context = context;
    }

    private final boolean hasNetwork() {
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        return (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null) ? false : true;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws UnknownNetworkException {
        Intrinsics.f(chain, "chain");
        if (hasNetwork()) {
            return chain.proceed(chain.request());
        }
        throw new UnknownNetworkException("Unknown Network");
    }
}
