package com.vungle.ads.internal.network;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Ie;
import com.vungle.ads.internal.util.arytenoidectomy;
import duvetyn.adultoid;
import duvetyn.formularize;
import java.io.IOException;
import java.util.Objects;
import okhttp3.cuirassed;
import okhttp3.dovishness;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OkHttpCall.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003#$%B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR$\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/network/wireman;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/vungle/ads/internal/network/attabal;", "Lokhttp3/marial;", "rawCall", "Lpotboil/attabal;", "Lokhttp3/stratoscope;", "responseConverter", "<init>", "(Lokhttp3/marial;Lpotboil/attabal;)V", "Lokhttp3/cuirassed;", "rawResp", "Lcom/vungle/ads/internal/network/marial;", "parseResponse", "(Lokhttp3/cuirassed;)Lcom/vungle/ads/internal/network/marial;", "body", "buffer", "(Lokhttp3/stratoscope;)Lokhttp3/stratoscope;", "Lcom/vungle/ads/internal/network/saneness;", "callback", "", "enqueue", "(Lcom/vungle/ads/internal/network/saneness;)V", "execute", "()Lcom/vungle/ads/internal/network/marial;", "cancel", "()V", "", "isCanceled", "()Z", "Lokhttp3/marial;", "Lpotboil/attabal;", "canceled", "Z", "Companion", "attabal", "saneness", "dern", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class wireman<T> implements attabal<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final okhttp3.marial rawCall;
    private final potboil.attabal<stratoscope, T> responseConverter;

    /* JADX INFO: renamed from: com.vungle.ads.internal.network.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OkHttpCall.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/network/wireman$attabal;", "", "<init>", "()V", "", "t", "", "throwIfFatal", "(Ljava/lang/Throwable;)V", "", "TAG", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable t) throws Throwable {
            if ((t instanceof ThreadDeath) || (t instanceof LinkageError)) {
                throw t;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/network/wireman$dern;", "Lokhttp3/stratoscope;", "Lokhttp3/dovishness;", "contentType", "", "contentLength", "<init>", "(Lokhttp3/dovishness;J)V", "()Lokhttp3/dovishness;", "()J", "Lduvetyn/beachfront;", "source", "()Lduvetyn/beachfront;", "Lokhttp3/dovishness;", "J", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class dern extends stratoscope {
        private final long contentLength;
        private final dovishness contentType;

        public dern(dovishness dovishnessVar, long j) {
            this.contentType = dovishnessVar;
            this.contentLength = j;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentLength, reason: from getter */
        public long getContentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentType, reason: from getter */
        public dovishness getContentType() {
            return this.contentType;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: source */
        public duvetyn.beachfront getDelegateSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/network/wireman$saneness;", "Lokhttp3/stratoscope;", "delegate", "<init>", "(Lokhttp3/stratoscope;)V", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "", "contentLength", "()J", "Lduvetyn/beachfront;", "source", "()Lduvetyn/beachfront;", "", "close", "()V", "throwIfCaught", "Lokhttp3/stratoscope;", "delegateSource", "Lduvetyn/beachfront;", "Ljava/io/IOException;", "thrownException", "Ljava/io/IOException;", "getThrownException", "()Ljava/io/IOException;", "setThrownException", "(Ljava/io/IOException;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class saneness extends stratoscope {
        private final stratoscope delegate;
        private final duvetyn.beachfront delegateSource;
        private IOException thrownException;

        /* JADX INFO: compiled from: OkHttpCall.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/vungle/ads/internal/network/wireman$saneness$attabal", "Lduvetyn/formularize;", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class attabal extends formularize {
            public attabal(duvetyn.beachfront beachfrontVar) {
                super(beachfrontVar);
            }

            @Override // duvetyn.formularize, duvetyn.supplicat
            public long read(duvetyn.wireman sink, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    return super.read(sink, byteCount);
                } catch (IOException e) {
                    saneness.this.setThrownException(e);
                    throw e;
                }
            }
        }

        public saneness(stratoscope delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = adultoid.wireman(new attabal(delegate.getDelegateSource()));
        }

        @Override // okhttp3.stratoscope, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: contentType */
        public dovishness getContentType() {
            return this.delegate.getContentType();
        }

        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // okhttp3.stratoscope
        /* JADX INFO: renamed from: source, reason: from getter */
        public duvetyn.beachfront getDelegateSource() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.network.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OkHttpCall.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/vungle/ads/internal/network/wireman$wireman", "Lokhttp3/beachfront;", "", "e", "", "callFailure", "(Ljava/lang/Throwable;)V", "Lokhttp3/marial;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/cuirassed;", Ie.n, "onResponse", "(Lokhttp3/marial;Lokhttp3/cuirassed;)V", "Ljava/io/IOException;", "onFailure", "(Lokhttp3/marial;Ljava/io/IOException;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class C0565wireman implements okhttp3.beachfront {
        final /* synthetic */ com.vungle.ads.internal.network.saneness<T> $callback;
        final /* synthetic */ wireman<T> this$0;

        public C0565wireman(wireman<T> wiremanVar, com.vungle.ads.internal.network.saneness<T> sanenessVar) {
            this.this$0 = wiremanVar;
            this.$callback = sanenessVar;
        }

        private final void callFailure(Throwable e) throws Throwable {
            try {
                this.$callback.onFailure(this.this$0, e);
            } catch (Throwable th) {
                wireman.INSTANCE.throwIfFatal(th);
                arytenoidectomy.INSTANCE.e(wireman.TAG, "Cannot pass failure to callback", th);
            }
        }

        @Override // okhttp3.beachfront
        public void onFailure(okhttp3.marial call, IOException e) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e, "e");
            callFailure(e);
        }

        @Override // okhttp3.beachfront
        public void onResponse(okhttp3.marial call, cuirassed response) throws Throwable {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                try {
                    this.$callback.onResponse(this.this$0, this.this$0.parseResponse(response));
                } catch (Throwable th) {
                    wireman.INSTANCE.throwIfFatal(th);
                    arytenoidectomy.INSTANCE.e(wireman.TAG, "Cannot pass response to callback", th);
                }
            } catch (Throwable th2) {
                arytenoidectomy.INSTANCE.e(wireman.TAG, "[enqueue] Failed to parse response: " + th2.getLocalizedMessage());
                wireman.INSTANCE.throwIfFatal(th2);
                callFailure(th2);
            }
        }
    }

    public wireman(okhttp3.marial rawCall, potboil.attabal<stratoscope, T> responseConverter) {
        Intrinsics.checkNotNullParameter(rawCall, "rawCall");
        Intrinsics.checkNotNullParameter(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final stratoscope buffer(stratoscope body) throws IOException {
        duvetyn.wireman wiremanVar = new duvetyn.wireman();
        body.getDelegateSource().clubfoot(wiremanVar);
        return stratoscope.INSTANCE.attabal(wiremanVar, body.getContentType(), body.getContentLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final marial<T> parseResponse(cuirassed rawResp) throws IOException {
        stratoscope body = rawResp.getBody();
        if (body == null) {
            return null;
        }
        cuirassed cuirassedVarDern = rawResp.polder().saneness(new dern(body.getContentType(), body.getContentLength())).dern();
        int code = cuirassedVarDern.getCode();
        if (code < 200 || code >= 300) {
            try {
                marial<T> marialVarError = marial.INSTANCE.error(buffer(body), cuirassedVarDern);
                interaction.saneness.attabal(body, null);
                return marialVarError;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(body, th);
                    throw th2;
                }
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return marial.INSTANCE.success(null, cuirassedVarDern);
        }
        saneness sanenessVar = new saneness(body);
        try {
            return marial.INSTANCE.success(this.responseConverter.convert(sanenessVar), cuirassedVarDern);
        } catch (Throwable th3) {
            sanenessVar.throwIfCaught();
            throw th3;
        }
    }

    @Override // com.vungle.ads.internal.network.attabal
    public void cancel() {
        okhttp3.marial marialVar;
        this.canceled = true;
        synchronized (this) {
            marialVar = this.rawCall;
            Unit unit = Unit.f29295attabal;
        }
        marialVar.cancel();
    }

    @Override // com.vungle.ads.internal.network.attabal
    public void enqueue(com.vungle.ads.internal.network.saneness<T> callback) {
        okhttp3.marial marialVar;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            marialVar = this.rawCall;
            Unit unit = Unit.f29295attabal;
        }
        if (this.canceled) {
            marialVar.cancel();
        }
        marialVar.privatdozent(new C0565wireman(this, callback));
    }

    @Override // com.vungle.ads.internal.network.attabal
    public marial<T> execute() {
        okhttp3.marial marialVar;
        Object objM3351constructorimpl;
        synchronized (this) {
            marialVar = this.rawCall;
            Unit unit = Unit.f29295attabal;
        }
        if (this.canceled) {
            marialVar.cancel();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(parseResponse(marialVar.execute()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "[execute] Failed to parse response:  " + thM3354exceptionOrNullimpl.getLocalizedMessage());
        }
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = null;
        }
        return (marial) objM3351constructorimpl;
    }

    @Override // com.vungle.ads.internal.network.attabal
    public boolean isCanceled() {
        boolean canceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            canceled = this.rawCall.getCanceled();
        }
        return canceled;
    }
}
