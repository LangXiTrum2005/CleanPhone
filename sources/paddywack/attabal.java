package paddywack;

import com.mbridge.msdk.foundation.download.Command;
import duvetyn.kowloon;
import java.io.IOException;
import java.util.List;
import okhttp3.adultoid;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.dovishness;
import okhttp3.formularize;
import okhttp3.impassible;
import okhttp3.preprohormone;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpaddywack/attabal;", "Lokhttp3/adultoid;", "Lokhttp3/impassible;", "cookieJar", "<init>", "(Lokhttp3/impassible;)V", "Lokhttp3/adultoid$attabal;", "chain", "Lokhttp3/cuirassed;", "intercept", "(Lokhttp3/adultoid$attabal;)Lokhttp3/cuirassed;", "", "Lokhttp3/formularize;", "cookies", "", "attabal", "(Ljava/util/List;)Ljava/lang/String;", "kowloon", "Lokhttp3/impassible;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class attabal implements adultoid {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final impassible cookieJar;

    public attabal(impassible cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    public final String attabal(List<formularize> cookies) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : cookies) {
            int i2 = i + 1;
            if (i < 0) {
                p002kotlin.collections.adultoid.dovishness();
            }
            formularize formularizeVar = (formularize) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(formularizeVar.getName());
            sb.append('=');
            sb.append(formularizeVar.getValue());
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.adultoid
    public cuirassed intercept(adultoid.attabal chain) throws IOException {
        stratoscope body;
        Intrinsics.checkNotNullParameter(chain, "chain");
        preprohormone preprohormoneVarRequest = chain.request();
        preprohormone.attabal attabalVarTaiyuan = preprohormoneVarRequest.taiyuan();
        cord body2 = preprohormoneVarRequest.getBody();
        if (body2 != null) {
            dovishness contentType = body2.getContentType();
            if (contentType != null) {
                attabalVarTaiyuan.impromptu("Content-Type", contentType.getMediaType());
            }
            long jContentLength = body2.contentLength();
            if (jContentLength != -1) {
                attabalVarTaiyuan.impromptu("Content-Length", String.valueOf(jContentLength));
                attabalVarTaiyuan.formularize("Transfer-Encoding");
            } else {
                attabalVarTaiyuan.impromptu("Transfer-Encoding", "chunked");
                attabalVarTaiyuan.formularize("Content-Length");
            }
        }
        boolean z = false;
        if (preprohormoneVarRequest.wireman("Host") == null) {
            attabalVarTaiyuan.impromptu("Host", hereditist.wireman.walach(preprohormoneVarRequest.getUrl(), false, 1, null));
        }
        if (preprohormoneVarRequest.wireman("Connection") == null) {
            attabalVarTaiyuan.impromptu("Connection", "Keep-Alive");
        }
        if (preprohormoneVarRequest.wireman("Accept-Encoding") == null && preprohormoneVarRequest.wireman(Command.HTTP_HEADER_RANGE) == null) {
            attabalVarTaiyuan.impromptu("Accept-Encoding", "gzip");
            z = true;
        }
        List<formularize> listAttabal = this.cookieJar.attabal(preprohormoneVarRequest.getUrl());
        if (!listAttabal.isEmpty()) {
            attabalVarTaiyuan.impromptu("Cookie", attabal(listAttabal));
        }
        if (preprohormoneVarRequest.wireman(Command.HTTP_HEADER_USER_AGENT) == null) {
            attabalVarTaiyuan.impromptu(Command.HTTP_HEADER_USER_AGENT, "okhttp/4.11.0");
        }
        cuirassed cuirassedVarAttabal = chain.attabal(attabalVarTaiyuan.saneness());
        marial.beachfront(this.cookieJar, preprohormoneVarRequest.getUrl(), cuirassedVarAttabal.getHeaders());
        cuirassed.attabal attabalVarMolybdenite = cuirassedVarAttabal.polder().molybdenite(preprohormoneVarRequest);
        if (z && p002kotlin.text.dovishness.stratoscope("gzip", cuirassed.rotuma(cuirassedVarAttabal, "Content-Encoding", null, 2, null), true) && marial.saneness(cuirassedVarAttabal) && (body = cuirassedVarAttabal.getBody()) != null) {
            kowloon kowloonVar = new kowloon(body.getDelegateSource());
            attabalVarMolybdenite.formularize(cuirassedVarAttabal.getHeaders().marial().impromptu("Content-Encoding").impromptu("Content-Length").marial());
            attabalVarMolybdenite.saneness(new impromptu(cuirassed.rotuma(cuirassedVarAttabal, "Content-Type", null, 2, null), -1L, duvetyn.adultoid.wireman(kowloonVar)));
        }
        return attabalVarMolybdenite.dern();
    }
}
