package formularism;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.ironsource.Ie;
import com.vungle.ads.internal.ui.AdActivity;
import duvetyn.restrictive;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.cuirassed;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.molybdenite;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lformularism/marial;", "Lpaddywack/wireman;", "Lokhttp3/rotuma;", "client", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lpaddywack/competently;", "chain", "Lformularism/wireman;", "http2Connection", "<init>", "(Lokhttp3/rotuma;Lokhttp3/internal/connection/RealConnection;Lpaddywack/competently;Lformularism/wireman;)V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "", "contentLength", "Lduvetyn/sealless;", "dern", "(Lokhttp3/preprohormone;J)Lduvetyn/sealless;", "", "wireman", "(Lokhttp3/preprohormone;)V", "flushRequest", "()V", "finishRequest", "", "expectContinue", "Lokhttp3/cuirassed$attabal;", "readResponseHeaders", "(Z)Lokhttp3/cuirassed$attabal;", "Lokhttp3/cuirassed;", Ie.n, "saneness", "(Lokhttp3/cuirassed;)J", "Lduvetyn/supplicat;", "attabal", "(Lokhttp3/cuirassed;)Lduvetyn/supplicat;", "cancel", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lpaddywack/competently;", "Lformularism/wireman;", "Lformularism/competently;", "Lformularism/competently;", "stream", "Lokhttp3/Protocol;", "marial", "Lokhttp3/Protocol;", "protocol", "beachfront", "Z", "canceled", "competently", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class marial implements paddywack.wireman {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final List<String> f26370impromptu = hereditist.wireman.gintrap("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final List<String> f26371taiyuan = hereditist.wireman.gintrap("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final RealConnection connection;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public volatile boolean canceled;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final wireman http2Connection;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Protocol protocol;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final paddywack.competently chain;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public volatile competently stream;

    /* JADX INFO: renamed from: formularism.marial$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lformularism/marial$attabal;", "", "<init>", "()V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "", "Lformularism/attabal;", "attabal", "(Lokhttp3/preprohormone;)Ljava/util/List;", "Lokhttp3/molybdenite;", "headerBlock", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/cuirassed$attabal;", "saneness", "(Lokhttp3/molybdenite;Lokhttp3/Protocol;)Lokhttp3/cuirassed$attabal;", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<attabal> attabal(preprohormone request) {
            Intrinsics.checkNotNullParameter(request, "request");
            molybdenite headers = request.getHeaders();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new attabal(attabal.f26309marial, request.getMethod()));
            arrayList.add(new attabal(attabal.f26305beachfront, paddywack.taiyuan.f35015attabal.dern(request.getUrl())));
            String strWireman = request.wireman("Host");
            if (strWireman != null) {
                arrayList.add(new attabal(attabal.f26308impromptu, strWireman));
            }
            arrayList.add(new attabal(attabal.f26306competently, request.getUrl().getScheme()));
            int size = headers.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String strWireman2 = headers.wireman(i);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strWireman2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!marial.f26370impromptu.contains(lowerCase) || (Intrinsics.wireman(lowerCase, "te") && Intrinsics.wireman(headers.impromptu(i), "trailers"))) {
                    arrayList.add(new attabal(lowerCase, headers.impromptu(i)));
                }
                i = i2;
            }
            return arrayList;
        }

        public final cuirassed.attabal saneness(molybdenite headerBlock, Protocol protocol) throws IOException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            molybdenite.attabal attabalVar = new molybdenite.attabal();
            int size = headerBlock.size();
            paddywack.apical apicalVarAttabal = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String strWireman = headerBlock.wireman(i);
                String strImpromptu = headerBlock.impromptu(i);
                if (Intrinsics.wireman(strWireman, Header.RESPONSE_STATUS_UTF8)) {
                    apicalVarAttabal = paddywack.apical.INSTANCE.attabal(Intrinsics.arytenoidectomy("HTTP/1.1 ", strImpromptu));
                } else if (!marial.f26371taiyuan.contains(strWireman)) {
                    attabalVar.wireman(strWireman, strImpromptu);
                }
                i = i2;
            }
            if (apicalVarAttabal != null) {
                return new cuirassed.attabal().monoploid(protocol).competently(apicalVarAttabal.code).triweekly(apicalVarAttabal.com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String).formularize(attabalVar.marial());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public Companion() {
        }
    }

    public marial(rotuma client, RealConnection connection, paddywack.competently chain, wireman http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<Protocol> listTrm = client.trm();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = listTrm.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // paddywack.wireman
    public supplicat attabal(cuirassed response) {
        Intrinsics.checkNotNullParameter(response, "response");
        competently competentlyVar = this.stream;
        Intrinsics.beachfront(competentlyVar);
        return competentlyVar.getSource();
    }

    @Override // paddywack.wireman
    public void cancel() {
        this.canceled = true;
        competently competentlyVar = this.stream;
        if (competentlyVar == null) {
            return;
        }
        competentlyVar.beachfront(ErrorCode.CANCEL);
    }

    @Override // paddywack.wireman
    public sealless dern(preprohormone request, long contentLength) {
        Intrinsics.checkNotNullParameter(request, "request");
        competently competentlyVar = this.stream;
        Intrinsics.beachfront(competentlyVar);
        return competentlyVar.triweekly();
    }

    @Override // paddywack.wireman
    public void finishRequest() throws IOException {
        competently competentlyVar = this.stream;
        Intrinsics.beachfront(competentlyVar);
        competentlyVar.triweekly().close();
    }

    @Override // paddywack.wireman
    public void flushRequest() throws IOException {
        this.http2Connection.flush();
    }

    @Override // paddywack.wireman
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // paddywack.wireman
    public cuirassed.attabal readResponseHeaders(boolean expectContinue) throws IOException {
        competently competentlyVar = this.stream;
        if (competentlyVar == null) {
            throw new IOException("stream wasn't created");
        }
        cuirassed.attabal attabalVarSaneness = INSTANCE.saneness(competentlyVar.yemenite(), this.protocol);
        if (expectContinue && attabalVarSaneness.getCode() == 100) {
            return null;
        }
        return attabalVarSaneness;
    }

    @Override // paddywack.wireman
    public long saneness(cuirassed response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (paddywack.marial.saneness(response)) {
            return hereditist.wireman.dovishness(response);
        }
        return 0L;
    }

    @Override // paddywack.wireman
    public void wireman(preprohormone request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.palmyra(INSTANCE.attabal(request), request.getBody() != null);
        if (this.canceled) {
            competently competentlyVar = this.stream;
            Intrinsics.beachfront(competentlyVar);
            competentlyVar.beachfront(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        competently competentlyVar2 = this.stream;
        Intrinsics.beachfront(competentlyVar2);
        restrictive restrictiveVarDovishness = competentlyVar2.dovishness();
        long jCompetently = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        restrictiveVarDovishness.competently(jCompetently, timeUnit);
        competently competentlyVar3 = this.stream;
        Intrinsics.beachfront(competentlyVar3);
        competentlyVar3.kattegat().competently(this.chain.getWriteTimeoutMillis(), timeUnit);
    }
}
