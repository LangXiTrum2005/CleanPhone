package com.google.net.cronet.okhttptransport;

import com.google.common.base.molybdenite;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.gintrap;
import com.google.common.util.concurrent.rotuma;
import com.google.common.util.concurrent.triweekly;
import com.google.common.util.concurrent.trm;
import duvetyn.wireman;
import imposure.marial;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.cord;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal implements marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f23118attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f23119saneness;

    /* JADX INFO: renamed from: com.google.net.cronet.okhttptransport.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public static /* synthetic */ class C0331attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f23120attabal;

        static {
            int[] iArr = new int[UploadBodyDataBroker.ReadResult.values().length];
            f23120attabal = iArr;
            try {
                iArr[UploadBodyDataBroker.ReadResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23120attabal[UploadBodyDataBroker.ReadResult.END_OF_BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public static final class dern implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ExecutorService f23121attabal;

        /* JADX INFO: renamed from: com.google.net.cronet.okhttptransport.attabal$dern$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
        public static class C0332attabal extends UploadDataProvider {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final UploadBodyDataBroker f23122arytenoidectomy;

            /* JADX INFO: renamed from: graveside, reason: collision with root package name */
            public long f23123graveside;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final cord f23124kowloon;

            /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
            public adultoid f23125molybdenite;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final gintrap f23126monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public final long f23127polloi;

            public /* synthetic */ C0332attabal(cord cordVar, UploadBodyDataBroker uploadBodyDataBroker, ExecutorService executorService, long j, byte[] bArr) {
                this(cordVar, uploadBodyDataBroker, executorService, j);
            }

            public static IOException formularize(long j, long j2) {
                StringBuilder sb = new StringBuilder("Expected ".length() + String.valueOf(j).length() + " bytes but got at least ".length() + String.valueOf(j2).length());
                sb.append("Expected ");
                sb.append(j);
                sb.append(" bytes but got at least ");
                sb.append(j2);
                return new IOException(sb.toString());
            }

            public final UploadBodyDataBroker.ReadResult arytenoidectomy(ByteBuffer byteBuffer) throws ExecutionException, TimeoutException {
                int iPosition = byteBuffer.position();
                UploadBodyDataBroker.ReadResult readResult = (UploadBodyDataBroker.ReadResult) trm.saneness(this.f23122arytenoidectomy.attabal(byteBuffer), this.f23127polloi, TimeUnit.MILLISECONDS);
                this.f23123graveside += (long) (byteBuffer.position() - iPosition);
                return readResult;
            }

            public final /* synthetic */ Void cutely() throws Exception {
                duvetyn.marial marialVarDern = duvetyn.adultoid.dern(this.f23122arytenoidectomy);
                this.f23124kowloon.writeTo(marialVarDern);
                marialVarDern.flush();
                this.f23122arytenoidectomy.dern();
                return null;
            }

            public final void dern() {
                if (this.f23125molybdenite == null) {
                    adultoid adultoidVarSubmit = this.f23126monoploid.submit(new Callable() { // from class: imposure.beachfront
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f28478kowloon.cutely();
                        }
                    });
                    this.f23125molybdenite = adultoidVarSubmit;
                    arytenoidectomy.attabal(adultoidVarSubmit, new C0333attabal(this), rotuma.attabal());
                }
            }

            public final void dovishness(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
                try {
                    uploadDataSink.onReadSucceeded(arytenoidectomy(byteBuffer).equals(UploadBodyDataBroker.ReadResult.END_OF_BODY));
                } catch (ExecutionException | TimeoutException e) {
                    this.f23125molybdenite.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public long getLength() throws IOException {
                return this.f23124kowloon.contentLength();
            }

            public final void marial(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws ExecutionException, TimeoutException, IOException {
                int iPosition = byteBuffer.position();
                byteBuffer.position(0);
                if (!arytenoidectomy(byteBuffer).equals(UploadBodyDataBroker.ReadResult.END_OF_BODY)) {
                    throw formularize(getLength(), this.f23123graveside);
                }
                molybdenite.attabal(byteBuffer.position() == 0, "END_OF_BODY reads shouldn't write anything to the buffer", new Object[0]);
                byteBuffer.position(iPosition);
                uploadDataSink.onReadSucceeded(false);
            }

            public final void monoploid(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                try {
                    UploadBodyDataBroker.ReadResult readResultArytenoidectomy = arytenoidectomy(byteBuffer);
                    if (this.f23123graveside > getLength()) {
                        throw formularize(getLength(), this.f23123graveside);
                    }
                    if (this.f23123graveside >= getLength()) {
                        marial(uploadDataSink, byteBuffer);
                        return;
                    }
                    int i = C0331attabal.f23120attabal[readResultArytenoidectomy.ordinal()];
                    if (i == 1) {
                        uploadDataSink.onReadSucceeded(false);
                    } else if (i == 2) {
                        throw new IOException("The source has been exhausted but we expected more data!");
                    }
                } catch (ExecutionException e) {
                    e = e;
                    this.f23125molybdenite.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                } catch (TimeoutException e2) {
                    e = e2;
                    this.f23125molybdenite.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                dern();
                if (getLength() == -1) {
                    dovishness(uploadDataSink, byteBuffer);
                } else {
                    monoploid(uploadDataSink, byteBuffer);
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public void rewind(UploadDataSink uploadDataSink) {
                uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
            }

            public /* synthetic */ UploadBodyDataBroker saneness() {
                return this.f23122arytenoidectomy;
            }

            public C0332attabal(cord cordVar, UploadBodyDataBroker uploadBodyDataBroker, ExecutorService executorService, long j) {
                this.f23124kowloon = cordVar;
                this.f23122arytenoidectomy = uploadBodyDataBroker;
                if (executorService instanceof gintrap) {
                    this.f23126monoploid = (gintrap) executorService;
                } else {
                    this.f23126monoploid = rotuma.saneness(executorService);
                }
                this.f23127polloi = j == 0 ? 2147483647L : j;
            }

            /* JADX INFO: renamed from: com.google.net.cronet.okhttptransport.attabal$dern$attabal$attabal, reason: collision with other inner class name */
            /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
            public class C0333attabal implements triweekly {

                /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                public final /* synthetic */ C0332attabal f23128attabal;

                public C0333attabal(C0332attabal c0332attabal) {
                    Objects.requireNonNull(c0332attabal);
                    this.f23128attabal = c0332attabal;
                }

                @Override // com.google.common.util.concurrent.triweekly
                public void onFailure(Throwable th) {
                    this.f23128attabal.saneness().marial(th);
                }

                @Override // com.google.common.util.concurrent.triweekly
                public void onSuccess(Object obj) {
                }
            }
        }

        public dern(ExecutorService executorService) {
            this.f23121attabal = executorService;
        }

        @Override // imposure.marial
        public UploadDataProvider attabal(cord cordVar, int i) {
            return new C0332attabal(cordVar, new UploadBodyDataBroker(), this.f23121attabal, i, null);
        }
    }

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public static final class saneness implements marial {

        /* JADX INFO: renamed from: com.google.net.cronet.okhttptransport.attabal$saneness$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
        public class C0334attabal extends UploadDataProvider {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public final wireman f23129arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public volatile boolean f23130kowloon;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public final /* synthetic */ long f23131monoploid;

            /* JADX INFO: renamed from: polloi, reason: collision with root package name */
            public final /* synthetic */ cord f23132polloi;

            public C0334attabal(saneness sanenessVar, long j, cord cordVar) {
                this.f23131monoploid = j;
                this.f23132polloi = cordVar;
                Objects.requireNonNull(sanenessVar);
                this.f23130kowloon = false;
                this.f23129arytenoidectomy = new wireman();
            }

            @Override // org.chromium.net.UploadDataProvider
            public long getLength() {
                return this.f23131monoploid;
            }

            @Override // org.chromium.net.UploadDataProvider
            public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                if (!this.f23130kowloon) {
                    this.f23132polloi.writeTo(this.f23129arytenoidectomy);
                    this.f23129arytenoidectomy.flush();
                    this.f23130kowloon = true;
                    long length = getLength();
                    long size = this.f23129arytenoidectomy.getSize();
                    if (size != length) {
                        StringBuilder sb = new StringBuilder("Expected ".length() + String.valueOf(length).length() + " bytes but got ".length() + String.valueOf(size).length());
                        sb.append("Expected ");
                        sb.append(length);
                        sb.append(" bytes but got ");
                        sb.append(size);
                        throw new IOException(sb.toString());
                    }
                }
                if (this.f23129arytenoidectomy.read(byteBuffer) == -1) {
                    throw new IllegalStateException("The source has been exhausted but we expected more!");
                }
                uploadDataSink.onReadSucceeded(false);
            }

            @Override // org.chromium.net.UploadDataProvider
            public void rewind(UploadDataSink uploadDataSink) {
                uploadDataSink.onRewindError(new UnsupportedOperationException());
            }
        }

        @Override // imposure.marial
        public UploadDataProvider attabal(cord cordVar, int i) throws IOException {
            long jContentLength = cordVar.contentLength();
            if (jContentLength >= 0 && jContentLength <= 1048576) {
                return new C0334attabal(this, jContentLength, cordVar);
            }
            StringBuilder sb = new StringBuilder("Expected definite length less than 1048576but got ".length() + String.valueOf(jContentLength).length());
            sb.append("Expected definite length less than 1048576but got ");
            sb.append(jContentLength);
            throw new IOException(sb.toString());
        }
    }

    public attabal(saneness sanenessVar, dern dernVar) {
        this.f23118attabal = sanenessVar;
        this.f23119saneness = dernVar;
    }

    public static attabal saneness(ExecutorService executorService) {
        return new attabal(new saneness(), new dern(executorService));
    }

    @Override // imposure.marial
    public UploadDataProvider attabal(cord cordVar, int i) throws IOException {
        long jContentLength = cordVar.contentLength();
        return (jContentLength == -1 || jContentLength > 1048576) ? this.f23119saneness.attabal(cordVar, i) : this.f23118attabal.attabal(cordVar, i);
    }
}
