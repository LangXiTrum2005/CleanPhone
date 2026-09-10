package com.google.net.cronet.okhttptransport;

import com.google.common.base.formularize;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.stratoscope;
import duvetyn.restrictive;
import duvetyn.supplicat;
import imposure.wireman;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public class OkHttpBridgeRequestCallback extends UrlRequest.Callback {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f23100beachfront;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final wireman f23103impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public volatile UrlRequest f23106taiyuan;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f23099attabal = stratoscope.kattegat();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AtomicBoolean f23105saneness = new AtomicBoolean(false);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AtomicBoolean f23102dern = new AtomicBoolean(false);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final BlockingQueue f23107wireman = new ArrayBlockingQueue(2);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final stratoscope f23104marial = stratoscope.kattegat();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final List f23101competently = new ArrayList();

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public enum CallbackStep {
        ON_READ_COMPLETED,
        ON_SUCCESS,
        ON_FAILED,
        ON_CANCELED
    }

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final CallbackStep f23109attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public final CronetException f23110saneness;

        public /* synthetic */ attabal(CallbackStep callbackStep, CronetException cronetException, byte[] bArr) {
            this(callbackStep, cronetException);
        }

        public /* synthetic */ CallbackStep attabal() {
            return this.f23109attabal;
        }

        public /* synthetic */ CronetException saneness() {
            return this.f23110saneness;
        }

        public attabal(CallbackStep callbackStep, @Nullable CronetException cronetException) {
            this.f23109attabal = callbackStep;
            this.f23110saneness = cronetException;
        }
    }

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public class saneness implements supplicat {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public volatile boolean f23111arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public ByteBuffer f23112kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ OkHttpBridgeRequestCallback f23113monoploid;

        public /* synthetic */ saneness(OkHttpBridgeRequestCallback okHttpBridgeRequestCallback, byte[] bArr) {
            this(okHttpBridgeRequestCallback);
        }

        public static int attabal(ByteBuffer byteBuffer, duvetyn.wireman wiremanVar, long j) throws IOException {
            if (byteBuffer.remaining() <= j) {
                return wiremanVar.write(byteBuffer);
            }
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + ((int) j));
                return wiremanVar.write(byteBuffer);
            } finally {
                byteBuffer.limit(iLimit);
            }
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f23111arytenoidectomy) {
                return;
            }
            this.f23111arytenoidectomy = true;
            if (this.f23113monoploid.dern().get()) {
                return;
            }
            this.f23113monoploid.marial().cancel();
        }

        @Override // duvetyn.supplicat
        public long read(duvetyn.wireman wiremanVar, long j) throws IOException {
            if (this.f23113monoploid.saneness().get()) {
                throw new IOException("The request was canceled!");
            }
            formularize.marial(wiremanVar != null, "sink == null");
            formularize.taiyuan(j >= 0, "byteCount < 0: %s", j);
            formularize.adultoid(!this.f23111arytenoidectomy, "closed");
            if (this.f23113monoploid.dern().get()) {
                return -1L;
            }
            if (j == 0) {
                return 0L;
            }
            if (this.f23112kowloon.position() == 0) {
                if (!saneness()) {
                    return -1L;
                }
                this.f23112kowloon.flip();
                formularize.adultoid(this.f23112kowloon.hasRemaining(), "Buffer should have remaining bytes after flip");
            }
            int iAttabal = attabal(this.f23112kowloon, wiremanVar, j);
            formularize.adultoid(iAttabal > 0, "Bytes written should be positive");
            if (!this.f23112kowloon.hasRemaining()) {
                this.f23112kowloon.clear();
            }
            return iAttabal;
        }

        public final boolean saneness() throws IOException {
            attabal attabalVar;
            formularize.adultoid(this.f23112kowloon.position() == 0, "Buffer position is not 0");
            formularize.adultoid(this.f23112kowloon.limit() == this.f23112kowloon.capacity(), "Buffer limit is not capacity");
            this.f23113monoploid.marial().read(this.f23112kowloon);
            try {
                attabalVar = (attabal) this.f23113monoploid.attabal().poll(this.f23113monoploid.wireman(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                attabalVar = null;
            }
            if (attabalVar == null) {
                this.f23113monoploid.marial().cancel();
                throw new CronetTimeoutException();
            }
            int iOrdinal = attabalVar.attabal().ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal == 1) {
                this.f23113monoploid.dern().set(true);
                this.f23112kowloon = null;
                return false;
            }
            if (iOrdinal == 2) {
                this.f23113monoploid.dern().set(true);
                this.f23112kowloon = null;
                throw new IOException(attabalVar.saneness());
            }
            if (iOrdinal != 3) {
                throw new AssertionError("The switch block above is exhaustive!");
            }
            this.f23112kowloon = null;
            throw new IOException("The request was canceled!");
        }

        @Override // duvetyn.supplicat
        /* JADX INFO: renamed from: timeout */
        public restrictive getF25466kowloon() {
            return restrictive.f25446marial;
        }

        public saneness(OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
            Objects.requireNonNull(okHttpBridgeRequestCallback);
            this.f23113monoploid = okHttpBridgeRequestCallback;
            this.f23112kowloon = ByteBuffer.allocateDirect(32768);
            this.f23111arytenoidectomy = false;
        }
    }

    public OkHttpBridgeRequestCallback(long j, wireman wiremanVar) {
        formularize.wireman(j >= 0);
        if (j == 0) {
            this.f23100beachfront = 2147483647L;
        } else {
            this.f23100beachfront = j;
        }
        this.f23103impromptu = wiremanVar;
    }

    public /* synthetic */ BlockingQueue attabal() {
        return this.f23107wireman;
    }

    public adultoid beachfront() {
        return this.f23099attabal;
    }

    public adultoid competently() {
        return this.f23104marial;
    }

    public /* synthetic */ AtomicBoolean dern() {
        return this.f23105saneness;
    }

    public List impromptu() {
        return Collections.unmodifiableList(this.f23101competently);
    }

    public /* synthetic */ UrlRequest marial() {
        return this.f23106taiyuan;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f23102dern.set(true);
        this.f23107wireman.add(new attabal(CallbackStep.ON_CANCELED, null, 0 == true ? 1 : 0));
        IOException iOException = new IOException("The request was canceled!");
        this.f23104marial.oilcan(iOException);
        this.f23099attabal.oilcan(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.f23104marial.oilcan(cronetException) && this.f23099attabal.oilcan(cronetException)) {
            return;
        }
        this.f23107wireman.add(new attabal(CallbackStep.ON_FAILED, cronetException, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f23107wireman.add(new attabal(CallbackStep.ON_READ_COMPLETED, null, 0 == true ? 1 : 0));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (!this.f23103impromptu.saneness()) {
            formularize.graveside(this.f23104marial.trm(urlResponseInfo));
            formularize.graveside(this.f23099attabal.trm(new duvetyn.wireman()));
            urlRequest.cancel();
            return;
        }
        this.f23101competently.add(urlResponseInfo);
        if (urlResponseInfo.getUrlChain().size() <= this.f23103impromptu.dern()) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        int iDern = this.f23103impromptu.dern() + 1;
        StringBuilder sb = new StringBuilder("Too many follow-up requests: ".length() + String.valueOf(iDern).length());
        sb.append("Too many follow-up requests: ");
        sb.append(iDern);
        ProtocolException protocolException = new ProtocolException(sb.toString());
        this.f23104marial.oilcan(protocolException);
        this.f23099attabal.oilcan(protocolException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f23106taiyuan = urlRequest;
        formularize.graveside(this.f23104marial.trm(urlResponseInfo));
        formularize.graveside(this.f23099attabal.trm(new saneness(this, null)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f23107wireman.add(new attabal(CallbackStep.ON_SUCCESS, null, 0 == true ? 1 : 0));
    }

    public /* synthetic */ AtomicBoolean saneness() {
        return this.f23102dern;
    }

    public /* synthetic */ long wireman() {
        return this.f23100beachfront;
    }
}
