package paddywack;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.util.List;
import okhttp3.adultoid;
import okhttp3.cuirassed;
import okhttp3.preprohormone;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0017J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0003\u0010\u0019J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b*\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b+\u0010\u0017R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010#¨\u0006-"}, d2 = {"Lpaddywack/competently;", "Lokhttp3/adultoid$attabal;", "Lokhttp3/internal/connection/marial;", NotificationCompat.CATEGORY_CALL, "", "Lokhttp3/adultoid;", "interceptors", "", "index", "Lokhttp3/internal/connection/dern;", "exchange", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lokhttp3/internal/connection/marial;Ljava/util/List;ILokhttp3/internal/connection/dern;Lokhttp3/preprohormone;III)V", "saneness", "(ILokhttp3/internal/connection/dern;Lokhttp3/preprohormone;III)Lpaddywack/competently;", "Lokhttp3/taiyuan;", "connection", "()Lokhttp3/taiyuan;", "()I", "Lokhttp3/marial;", "()Lokhttp3/marial;", "()Lokhttp3/preprohormone;", "Lokhttp3/cuirassed;", "attabal", "(Lokhttp3/preprohormone;)Lokhttp3/cuirassed;", "Lokhttp3/internal/connection/marial;", "wireman", "()Lokhttp3/internal/connection/marial;", "Ljava/util/List;", "dern", "I", "Lokhttp3/internal/connection/dern;", "beachfront", "()Lokhttp3/internal/connection/dern;", "marial", "Lokhttp3/preprohormone;", "impromptu", "competently", "taiyuan", "calls", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class competently implements adultoid.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.internal.connection.marial call;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final int connectTimeoutMillis;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final int readTimeoutMillis;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final int writeTimeoutMillis;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final preprohormone request;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final List<adultoid> interceptors;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public int calls;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.internal.connection.dern exchange;

    /* JADX WARN: Multi-variable type inference failed */
    public competently(okhttp3.internal.connection.marial call, List<? extends adultoid> interceptors, int i, okhttp3.internal.connection.dern dernVar, preprohormone request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i;
        this.exchange = dernVar;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
    }

    public static /* synthetic */ competently dern(competently competentlyVar, int i, okhttp3.internal.connection.dern dernVar, preprohormone preprohormoneVar, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = competentlyVar.index;
        }
        if ((i5 & 2) != 0) {
            dernVar = competentlyVar.exchange;
        }
        if ((i5 & 4) != 0) {
            preprohormoneVar = competentlyVar.request;
        }
        if ((i5 & 8) != 0) {
            i2 = competentlyVar.connectTimeoutMillis;
        }
        if ((i5 & 16) != 0) {
            i3 = competentlyVar.readTimeoutMillis;
        }
        if ((i5 & 32) != 0) {
            i4 = competentlyVar.writeTimeoutMillis;
        }
        int i6 = i3;
        int i7 = i4;
        return competentlyVar.saneness(i, dernVar, preprohormoneVar, i2, i6, i7);
    }

    @Override // okhttp3.adultoid.attabal
    public cuirassed attabal(preprohormone request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.calls++;
        okhttp3.internal.connection.dern dernVar = this.exchange;
        if (dernVar != null) {
            if (!dernVar.getFinder().competently(request.getUrl())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        competently competentlyVarDern = dern(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        adultoid adultoidVar = this.interceptors.get(this.index);
        cuirassed cuirassedVarIntercept = adultoidVar.intercept(competentlyVarDern);
        if (cuirassedVarIntercept == null) {
            throw new NullPointerException("interceptor " + adultoidVar + " returned null");
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size() && competentlyVarDern.calls != 1) {
            throw new IllegalStateException(("network interceptor " + adultoidVar + " must call proceed() exactly once").toString());
        }
        if (cuirassedVarIntercept.getBody() != null) {
            return cuirassedVarIntercept;
        }
        throw new IllegalStateException(("interceptor " + adultoidVar + " returned a response with no body").toString());
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final okhttp3.internal.connection.dern getExchange() {
        return this.exchange;
    }

    @Override // okhttp3.adultoid.attabal
    public okhttp3.marial call() {
        return this.call;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.adultoid.attabal
    public okhttp3.taiyuan connection() {
        okhttp3.internal.connection.dern dernVar = this.exchange;
        if (dernVar == null) {
            return null;
        }
        return dernVar.getConnection();
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final preprohormone getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.adultoid.attabal
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.adultoid.attabal
    public preprohormone request() {
        return this.request;
    }

    public final competently saneness(int index, okhttp3.internal.connection.dern exchange, preprohormone request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new competently(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final okhttp3.internal.connection.marial getCall() {
        return this.call;
    }

    @Override // okhttp3.adultoid.attabal
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
