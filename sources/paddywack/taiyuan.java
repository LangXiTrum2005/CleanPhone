package paddywack;

import com.vungle.ads.internal.ui.AdActivity;
import java.net.Proxy;
import okhttp3.graveside;
import okhttp3.preprohormone;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpaddywack/taiyuan;", "", "<init>", "()V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "Ljava/net/Proxy$Type;", "proxyType", "", "attabal", "(Lokhttp3/preprohormone;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lokhttp3/graveside;", "url", "dern", "(Lokhttp3/graveside;)Ljava/lang/String;", "", "saneness", "(Lokhttp3/preprohormone;Ljava/net/Proxy$Type;)Z", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f35015attabal = new taiyuan();

    public final String attabal(preprohormone request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.getMethod());
        sb.append(' ');
        taiyuan taiyuanVar = f35015attabal;
        if (taiyuanVar.saneness(request, proxyType)) {
            sb.append(request.getUrl());
        } else {
            sb.append(taiyuanVar.dern(request.getUrl()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String dern(graveside url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strWireman = url.wireman();
        String strBeachfront = url.beachfront();
        if (strBeachfront == null) {
            return strWireman;
        }
        return strWireman + '?' + ((Object) strBeachfront);
    }

    public final boolean saneness(preprohormone request, Proxy.Type proxyType) {
        return !request.competently() && proxyType == Proxy.Type.HTTP;
    }
}
