package paddywack;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdSize;
import com.ironsource.C3460cc;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.adultoid;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.graveside;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import okhttp3.stratoscope;
import okhttp3.trm;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lpaddywack/cutely;", "Lokhttp3/adultoid;", "Lokhttp3/rotuma;", "client", "<init>", "(Lokhttp3/rotuma;)V", "Lokhttp3/adultoid$attabal;", "chain", "Lokhttp3/cuirassed;", "intercept", "(Lokhttp3/adultoid$attabal;)Lokhttp3/cuirassed;", "Ljava/io/IOException;", "e", "Lokhttp3/internal/connection/marial;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/preprohormone;", "userRequest", "", "requestSendStarted", "wireman", "(Ljava/io/IOException;Lokhttp3/internal/connection/marial;Lokhttp3/preprohormone;Z)Z", "marial", "(Ljava/io/IOException;Lokhttp3/preprohormone;)Z", "dern", "(Ljava/io/IOException;Z)Z", "userResponse", "Lokhttp3/internal/connection/dern;", "exchange", "saneness", "(Lokhttp3/cuirassed;Lokhttp3/internal/connection/dern;)Lokhttp3/preprohormone;", "", "method", "attabal", "(Lokhttp3/cuirassed;Ljava/lang/String;)Lokhttp3/preprohormone;", "", "defaultDelay", "beachfront", "(Lokhttp3/cuirassed;I)I", "kowloon", "Lokhttp3/rotuma;", "arytenoidectomy", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class cutely implements adultoid {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final rotuma client;

    public cutely(rotuma client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    public final preprohormone attabal(cuirassed userResponse, String method) {
        String strRotuma;
        graveside gravesideVarPolloi;
        if (!this.client.getFollowRedirects() || (strRotuma = cuirassed.rotuma(userResponse, "Location", null, 2, null)) == null || (gravesideVarPolloi = userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getUrl().polloi(strRotuma)) == null) {
            return null;
        }
        if (!Intrinsics.wireman(gravesideVarPolloi.getScheme(), userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getUrl().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        preprohormone.attabal attabalVarTaiyuan = userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().taiyuan();
        if (beachfront.saneness(method)) {
            int code = userResponse.getCode();
            beachfront beachfrontVar = beachfront.f34994attabal;
            boolean z = beachfrontVar.wireman(method) || code == 308 || code == 307;
            if (!beachfrontVar.dern(method) || code == 308 || code == 307) {
                attabalVarTaiyuan.cutely(method, z ? userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getBody() : null);
            } else {
                attabalVarTaiyuan.cutely(C3460cc.a, null);
            }
            if (!z) {
                attabalVarTaiyuan.formularize("Transfer-Encoding");
                attabalVarTaiyuan.formularize("Content-Length");
                attabalVarTaiyuan.formularize("Content-Type");
            }
        }
        if (!hereditist.wireman.cutely(userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getUrl(), gravesideVarPolloi)) {
            attabalVarTaiyuan.formularize("Authorization");
        }
        return attabalVarTaiyuan.dovishness(gravesideVarPolloi).saneness();
    }

    public final int beachfront(cuirassed userResponse, int defaultDelay) {
        String strRotuma = cuirassed.rotuma(userResponse, CommonGatewayClient.HEADER_RETRY_AFTER, null, 2, null);
        if (strRotuma == null) {
            return defaultDelay;
        }
        if (!new Regex("\\d+").matches(strRotuma)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strRotuma);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    public final boolean dern(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            return (e instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    @Override // okhttp3.adultoid
    public cuirassed intercept(adultoid.attabal chain) throws IOException {
        cuirassed cuirassedVarAttabal;
        Intrinsics.checkNotNullParameter(chain, "chain");
        competently competentlyVar = (competently) chain;
        preprohormone preprohormoneVar = competentlyVar.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String();
        okhttp3.internal.connection.marial marialVar = competentlyVar.getAndroidx.core.app.NotificationCompat.CATEGORY_CALL java.lang.String();
        List listFormularize = p002kotlin.collections.adultoid.formularize();
        int i = 0;
        cuirassed cuirassedVar = null;
        while (true) {
            boolean z = true;
            while (true) {
                marialVar.taiyuan(preprohormoneVar, z);
                try {
                    if (marialVar.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        cuirassedVarAttabal = competentlyVar.attabal(preprohormoneVar);
                    } catch (IOException e) {
                        if (!wireman(e, marialVar, preprohormoneVar, !(e instanceof ConnectionShutdownException))) {
                            throw hereditist.wireman.permissivist(e, listFormularize);
                        }
                        listFormularize = CollectionsKt.claque(listFormularize, e);
                        marialVar.apical(true);
                        z = false;
                    } catch (RouteException e2) {
                        if (!wireman(e2.getLastConnectException(), marialVar, preprohormoneVar, false)) {
                            throw hereditist.wireman.permissivist(e2.getFirstConnectException(), listFormularize);
                        }
                        listFormularize = CollectionsKt.claque(listFormularize, e2.getFirstConnectException());
                        marialVar.apical(true);
                        z = false;
                    }
                    marialVar.apical(true);
                    z = false;
                } catch (Throwable th) {
                    marialVar.apical(true);
                    throw th;
                }
            }
            if (cuirassedVar != null) {
                cuirassedVarAttabal = cuirassedVarAttabal.polder().arytenoidectomy(cuirassedVar.polder().saneness(null).dern()).dern();
            }
            cuirassedVar = cuirassedVarAttabal;
            okhttp3.internal.connection.dern interceptorScopedExchange = marialVar.getInterceptorScopedExchange();
            preprohormone preprohormoneVarSaneness = saneness(cuirassedVar, interceptorScopedExchange);
            if (preprohormoneVarSaneness == null) {
                if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                    marialVar.cuirassed();
                }
                marialVar.apical(false);
                return cuirassedVar;
            }
            cord body = preprohormoneVarSaneness.getBody();
            if (body != null && body.isOneShot()) {
                marialVar.apical(false);
                return cuirassedVar;
            }
            stratoscope body2 = cuirassedVar.getBody();
            if (body2 != null) {
                hereditist.wireman.impassible(body2);
            }
            i++;
            if (i > 20) {
                throw new ProtocolException(Intrinsics.arytenoidectomy("Too many follow-up requests: ", Integer.valueOf(i)));
            }
            marialVar.apical(true);
            preprohormoneVar = preprohormoneVarSaneness;
        }
    }

    public final boolean marial(IOException e, preprohormone userRequest) {
        cord body = userRequest.getBody();
        return (body != null && body.isOneShot()) || (e instanceof FileNotFoundException);
    }

    public final preprohormone saneness(cuirassed userResponse, okhttp3.internal.connection.dern exchange) throws IOException {
        RealConnection connection;
        trm route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int code = userResponse.getCode();
        String method = userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getMethod();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.getAuthenticator().attabal(route, userResponse);
            }
            if (code == 421) {
                cord body = userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getBody();
                if ((body != null && body.isOneShot()) || exchange == null || !exchange.formularize()) {
                    return null;
                }
                exchange.getConnection().rotuma();
                return userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String();
            }
            if (code == 503) {
                cuirassed priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.getCode() != 503) && beachfront(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String();
                }
                return null;
            }
            if (code == 407) {
                Intrinsics.beachfront(route);
                if (route.getProxy().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().attabal(route, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (code == 408) {
                if (!this.client.getRetryOnConnectionFailure()) {
                    return null;
                }
                cord body2 = userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getBody();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                cuirassed priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.getCode() != 408) && beachfront(userResponse, 0) <= 0) {
                    return userResponse.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String();
                }
                return null;
            }
            switch (code) {
                case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return attabal(userResponse, method);
    }

    public final boolean wireman(IOException e, okhttp3.internal.connection.marial call, preprohormone userRequest, boolean requestSendStarted) {
        if (this.client.getRetryOnConnectionFailure()) {
            return !(requestSendStarted && marial(e, userRequest)) && dern(e, requestSendStarted) && call.preprohormone();
        }
        return false;
    }
}
