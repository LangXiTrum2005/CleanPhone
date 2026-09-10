package okhttp3;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.AdSize;
import com.ironsource.Ie;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.Closeable;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001BB}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b.\u0010;R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u001c\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010Q\u001a\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00020X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0011\u0010\\\u001a\u00020X8F¢\u0006\u0006\u001a\u0004\b[\u0010ZR\u0011\u0010_\u001a\u00020T8G¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"Lokhttp3/cuirassed;", "Ljava/io/Closeable;", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/Protocol;", "protocol", "", PglCryptUtils.KEY_MESSAGE, "", "code", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/molybdenite;", "headers", "Lokhttp3/stratoscope;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/dern;", "exchange", "<init>", "(Lokhttp3/preprohormone;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/molybdenite;Lokhttp3/stratoscope;Lokhttp3/cuirassed;Lokhttp3/cuirassed;Lokhttp3/cuirassed;JJLokhttp3/internal/connection/dern;)V", "name", "defaultValue", "dovishness", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/cuirassed$attabal;", "polder", "()Lokhttp3/cuirassed$attabal;", "", "Lokhttp3/competently;", "marial", "()Ljava/util/List;", "", "close", "()V", "toString", "()Ljava/lang/String;", "kowloon", "Lokhttp3/preprohormone;", "creditor", "()Lokhttp3/preprohormone;", "arytenoidectomy", "Lokhttp3/Protocol;", "saran", "()Lokhttp3/Protocol;", "monoploid", "Ljava/lang/String;", "restrictive", "polloi", "I", "cutely", "()I", "molybdenite", "Lokhttp3/Handshake;", "()Lokhttp3/Handshake;", "graveside", "Lokhttp3/molybdenite;", "cuirassed", "()Lokhttp3/molybdenite;", "adultoid", "Lokhttp3/stratoscope;", "attabal", "()Lokhttp3/stratoscope;", "Lokhttp3/cuirassed;", "merc", "()Lokhttp3/cuirassed;", "gintrap", "dern", "rotuma", "seminary", "preprohormone", "J", "starveling", "()J", "cord", "privatdozent", "Lokhttp3/internal/connection/dern;", "formularize", "()Lokhttp3/internal/connection/dern;", "Lokhttp3/wireman;", "stratoscope", "Lokhttp3/wireman;", "lazyCacheControl", "", "isSuccessful", "()Z", "kattegat", "isRedirect", "saneness", "()Lokhttp3/wireman;", "cacheControl", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class cuirassed implements Closeable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final stratoscope body;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Protocol protocol;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final long receivedResponseAtMillis;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.internal.connection.dern exchange;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final cuirassed networkResponse;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final cuirassed cacheResponse;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final molybdenite headers;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final preprohormone request;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final Handshake handshake;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata and from toString */
    public final String message;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata and from toString */
    public final int code;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final long sentRequestAtMillis;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final cuirassed priorResponse;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public wireman lazyCacheControl;

    public cuirassed(preprohormone request, Protocol protocol, String message, int i, Handshake handshake, molybdenite headers, stratoscope stratoscopeVar, cuirassed cuirassedVar, cuirassed cuirassedVar2, cuirassed cuirassedVar3, long j, long j2, okhttp3.internal.connection.dern dernVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = stratoscopeVar;
        this.networkResponse = cuirassedVar;
        this.cacheResponse = cuirassedVar2;
        this.priorResponse = cuirassedVar3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = dernVar;
    }

    public static /* synthetic */ String rotuma(cuirassed cuirassedVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return cuirassedVar.dovishness(str, str2);
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final stratoscope getBody() {
        return this.body;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        stratoscope stratoscopeVar = this.body;
        if (stratoscopeVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        stratoscopeVar.close();
    }

    /* JADX INFO: renamed from: creditor, reason: from getter */
    public final preprohormone getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: cuirassed, reason: from getter */
    public final molybdenite getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final cuirassed getCacheResponse() {
        return this.cacheResponse;
    }

    public final String dovishness(String name, String defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strSaneness = this.headers.saneness(name);
        return strSaneness == null ? defaultValue : strSaneness;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final okhttp3.internal.connection.dern getExchange() {
        return this.exchange;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i < 300;
    }

    public final boolean kattegat() {
        int i = this.code;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final List<competently> marial() {
        String str;
        molybdenite molybdeniteVar = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return p002kotlin.collections.adultoid.formularize();
            }
            str = "Proxy-Authenticate";
        }
        return paddywack.marial.attabal(molybdeniteVar, str);
    }

    /* JADX INFO: renamed from: merc, reason: from getter */
    public final cuirassed getNetworkResponse() {
        return this.networkResponse;
    }

    public final String monoploid(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return rotuma(this, name, null, 2, null);
    }

    public final attabal polder() {
        return new attabal(this);
    }

    /* JADX INFO: renamed from: privatdozent, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX INFO: renamed from: restrictive, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final wireman saneness() {
        wireman wiremanVar = this.lazyCacheControl;
        if (wiremanVar != null) {
            return wiremanVar;
        }
        wireman wiremanVarSaneness = wireman.INSTANCE.saneness(this.headers);
        this.lazyCacheControl = wiremanVarSaneness;
        return wiremanVarSaneness;
    }

    /* JADX INFO: renamed from: saran, reason: from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: seminary, reason: from getter */
    public final cuirassed getPriorResponse() {
        return this.priorResponse;
    }

    /* JADX INFO: renamed from: starveling, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.getUrl() + '}';
    }

    /* JADX INFO: compiled from: Response.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b0\u0010.J\u0019\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b2\u0010.J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000203H\u0016¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010>R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010%\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010c\u001a\u0004\bd\u0010>\"\u0004\be\u0010\u0006R$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010c\u001a\u0004\bf\u0010>\"\u0004\bg\u0010\u0006R$\u00101\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010c\u001a\u0004\bh\u0010>\"\u0004\bi\u0010\u0006R\"\u00104\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u00107\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010j\u001a\u0004\bo\u0010l\"\u0004\bp\u0010nR$\u0010u\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010<¨\u0006v"}, d2 = {"Lokhttp3/cuirassed$attabal;", "", "<init>", "()V", "Lokhttp3/cuirassed;", Ie.n, "(Lokhttp3/cuirassed;)V", "", "name", "", "beachfront", "(Ljava/lang/String;Lokhttp3/cuirassed;)V", "marial", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "molybdenite", "(Lokhttp3/preprohormone;)Lokhttp3/cuirassed$attabal;", "Lokhttp3/Protocol;", "protocol", "monoploid", "(Lokhttp3/Protocol;)Lokhttp3/cuirassed$attabal;", "", "code", "competently", "(I)Lokhttp3/cuirassed$attabal;", PglCryptUtils.KEY_MESSAGE, "triweekly", "(Ljava/lang/String;)Lokhttp3/cuirassed$attabal;", "Lokhttp3/Handshake;", "handshake", "cutely", "(Lokhttp3/Handshake;)Lokhttp3/cuirassed$attabal;", "value", "apical", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/cuirassed$attabal;", "attabal", "Lokhttp3/molybdenite;", "headers", "formularize", "(Lokhttp3/molybdenite;)Lokhttp3/cuirassed$attabal;", "Lokhttp3/stratoscope;", "body", "saneness", "(Lokhttp3/stratoscope;)Lokhttp3/cuirassed$attabal;", "networkResponse", "kowloon", "(Lokhttp3/cuirassed;)Lokhttp3/cuirassed$attabal;", "cacheResponse", "wireman", "priorResponse", "arytenoidectomy", "", "sentRequestAtMillis", "graveside", "(J)Lokhttp3/cuirassed$attabal;", "receivedResponseAtMillis", "polloi", "Lokhttp3/internal/connection/dern;", "deferredTrailers", "impassible", "(Lokhttp3/internal/connection/dern;)V", "dern", "()Lokhttp3/cuirassed;", "Lokhttp3/preprohormone;", "getRequest$okhttp", "()Lokhttp3/preprohormone;", "yemenite", "(Lokhttp3/preprohormone;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "trm", "(Lokhttp3/Protocol;)V", "I", "impromptu", "()I", "gintrap", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "cord", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "rotuma", "(Lokhttp3/Handshake;)V", "Lokhttp3/molybdenite$attabal;", "Lokhttp3/molybdenite$attabal;", "taiyuan", "()Lokhttp3/molybdenite$attabal;", "preprohormone", "(Lokhttp3/molybdenite$attabal;)V", "Lokhttp3/stratoscope;", "getBody$okhttp", "()Lokhttp3/stratoscope;", "adultoid", "(Lokhttp3/stratoscope;)V", "Lokhttp3/cuirassed;", "getNetworkResponse$okhttp", "cuirassed", "getCacheResponse$okhttp", "dovishness", "getPriorResponse$okhttp", "stratoscope", "J", "getSentRequestAtMillis$okhttp", "()J", "sealless", "(J)V", "getReceivedResponseAtMillis$okhttp", "oilcan", "Lokhttp3/internal/connection/dern;", "getExchange$okhttp", "()Lokhttp3/internal/connection/dern;", "setExchange$okhttp", "exchange", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class attabal {

        /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
        public long sentRequestAtMillis;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public preprohormone request;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public molybdenite.attabal headers;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public stratoscope body;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public cuirassed priorResponse;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public int code;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
        public long receivedResponseAtMillis;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
        public okhttp3.internal.connection.dern exchange;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public cuirassed networkResponse;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public Handshake handshake;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public Protocol protocol;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public cuirassed cacheResponse;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public String message;

        public attabal() {
            this.code = -1;
            this.headers = new molybdenite.attabal();
        }

        public final void adultoid(stratoscope stratoscopeVar) {
            this.body = stratoscopeVar;
        }

        public attabal apical(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            getHeaders().taiyuan(name, value);
            return this;
        }

        public attabal arytenoidectomy(cuirassed priorResponse) {
            marial(priorResponse);
            stratoscope(priorResponse);
            return this;
        }

        public attabal attabal(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            getHeaders().attabal(name, value);
            return this;
        }

        public final void beachfront(String name, cuirassed response) {
            if (response == null) {
                return;
            }
            if (response.getBody() != null) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy(name, ".body != null").toString());
            }
            if (response.getNetworkResponse() != null) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy(name, ".networkResponse != null").toString());
            }
            if (response.getCacheResponse() != null) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy(name, ".cacheResponse != null").toString());
            }
            if (response.getPriorResponse() != null) {
                throw new IllegalArgumentException(Intrinsics.arytenoidectomy(name, ".priorResponse != null").toString());
            }
        }

        public attabal competently(int code) {
            gintrap(code);
            return this;
        }

        public final void cord(String str) {
            this.message = str;
        }

        public final void cuirassed(cuirassed cuirassedVar) {
            this.networkResponse = cuirassedVar;
        }

        public attabal cutely(Handshake handshake) {
            rotuma(handshake);
            return this;
        }

        public cuirassed dern() {
            int i = this.code;
            if (i < 0) {
                throw new IllegalStateException(Intrinsics.arytenoidectomy("code < 0: ", Integer.valueOf(getCode())).toString());
            }
            preprohormone preprohormoneVar = this.request;
            if (preprohormoneVar == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new cuirassed(preprohormoneVar, protocol, str, i, this.handshake, this.headers.marial(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public final void dovishness(cuirassed cuirassedVar) {
            this.cacheResponse = cuirassedVar;
        }

        public attabal formularize(molybdenite headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            preprohormone(headers.marial());
            return this;
        }

        public final void gintrap(int i) {
            this.code = i;
        }

        public attabal graveside(long sentRequestAtMillis) {
            sealless(sentRequestAtMillis);
            return this;
        }

        public final void impassible(okhttp3.internal.connection.dern deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        /* JADX INFO: renamed from: impromptu, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public attabal kowloon(cuirassed networkResponse) {
            beachfront("networkResponse", networkResponse);
            cuirassed(networkResponse);
            return this;
        }

        public final void marial(cuirassed response) {
            if (response != null && response.getBody() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public attabal molybdenite(preprohormone request) {
            Intrinsics.checkNotNullParameter(request, "request");
            yemenite(request);
            return this;
        }

        public attabal monoploid(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            trm(protocol);
            return this;
        }

        public final void oilcan(long j) {
            this.receivedResponseAtMillis = j;
        }

        public attabal polloi(long receivedResponseAtMillis) {
            oilcan(receivedResponseAtMillis);
            return this;
        }

        public final void preprohormone(molybdenite.attabal attabalVar) {
            Intrinsics.checkNotNullParameter(attabalVar, "<set-?>");
            this.headers = attabalVar;
        }

        public final void rotuma(Handshake handshake) {
            this.handshake = handshake;
        }

        public attabal saneness(stratoscope body) {
            adultoid(body);
            return this;
        }

        public final void sealless(long j) {
            this.sentRequestAtMillis = j;
        }

        public final void stratoscope(cuirassed cuirassedVar) {
            this.priorResponse = cuirassedVar;
        }

        /* JADX INFO: renamed from: taiyuan, reason: from getter */
        public final molybdenite.attabal getHeaders() {
            return this.headers;
        }

        public attabal triweekly(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            cord(message);
            return this;
        }

        public final void trm(Protocol protocol) {
            this.protocol = protocol;
        }

        public attabal wireman(cuirassed cacheResponse) {
            beachfront("cacheResponse", cacheResponse);
            dovishness(cacheResponse);
            return this;
        }

        public final void yemenite(preprohormone preprohormoneVar) {
            this.request = preprohormoneVar;
        }

        public attabal(cuirassed response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.code = -1;
            this.request = response.getRequest();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.handshake = response.getHandshake();
            this.headers = response.getHeaders().marial();
            this.body = response.getBody();
            this.networkResponse = response.getNetworkResponse();
            this.cacheResponse = response.getCacheResponse();
            this.priorResponse = response.getPriorResponse();
            this.sentRequestAtMillis = response.getSentRequestAtMillis();
            this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
            this.exchange = response.getExchange();
        }
    }
}
