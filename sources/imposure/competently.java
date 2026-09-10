package imposure;

import com.google.common.util.concurrent.rotuma;
import com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.dovishness;
import okhttp3.preprohormone;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CronetEngine f28479attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan f28480dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final wireman f28481marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f28482saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final marial f28483wireman;

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public class attabal implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ preprohormone f28484attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ competently f28485dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ OkHttpBridgeRequestCallback f28486saneness;

        public attabal(competently competentlyVar, preprohormone preprohormoneVar, OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
            this.f28484attabal = preprohormoneVar;
            this.f28486saneness = okHttpBridgeRequestCallback;
            Objects.requireNonNull(competentlyVar);
            this.f28485dern = competentlyVar;
        }

        @Override // imposure.competently.dern
        public cuirassed attabal() throws IOException {
            return this.f28485dern.attabal().competently(this.f28484attabal, this.f28486saneness);
        }
    }

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public interface dern {
        cuirassed attabal() throws IOException;
    }

    /* JADX INFO: compiled from: com.google.net.cronet:cronet-okhttp@@0.1.1 */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final UrlRequest f28487attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final dern f28488saneness;

        public saneness(UrlRequest urlRequest, dern dernVar) {
            this.f28487attabal = urlRequest;
            this.f28488saneness = dernVar;
        }

        public UrlRequest attabal() {
            return this.f28487attabal;
        }

        public cuirassed saneness() throws IOException {
            return this.f28488saneness.attabal();
        }
    }

    public competently(CronetEngine cronetEngine, Executor executor, marial marialVar, taiyuan taiyuanVar, wireman wiremanVar) {
        this.f28479attabal = cronetEngine;
        this.f28482saneness = executor;
        this.f28483wireman = marialVar;
        this.f28480dern = taiyuanVar;
        this.f28481marial = wiremanVar;
    }

    public /* synthetic */ taiyuan attabal() {
        return this.f28480dern;
    }

    public final dern dern(preprohormone preprohormoneVar, OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
        return new attabal(this, preprohormoneVar, okHttpBridgeRequestCallback);
    }

    public saneness saneness(preprohormone preprohormoneVar, int i, int i2) throws IOException {
        OkHttpBridgeRequestCallback okHttpBridgeRequestCallback = new OkHttpBridgeRequestCallback(i, this.f28481marial);
        UrlRequest.Builder builderAllowDirectExecutor = this.f28479attabal.newUrlRequestBuilder(preprohormoneVar.getUrl().getUrl(), okHttpBridgeRequestCallback, rotuma.attabal()).allowDirectExecutor();
        builderAllowDirectExecutor.setHttpMethod(preprohormoneVar.getMethod());
        for (int i3 = 0; i3 < preprohormoneVar.getHeaders().size(); i3++) {
            builderAllowDirectExecutor.addHeader(preprohormoneVar.getHeaders().wireman(i3), preprohormoneVar.getHeaders().impromptu(i3));
        }
        cord body = preprohormoneVar.getBody();
        if (body != null) {
            dovishness contentType = body.getContentType();
            if (contentType != null) {
                builderAllowDirectExecutor.addHeader("Content-Type", contentType.getMediaType());
            }
            if (preprohormoneVar.wireman("Content-Length") == null && body.contentLength() != -1) {
                builderAllowDirectExecutor.addHeader("Content-Length", String.valueOf(body.contentLength()));
            }
            if (body.contentLength() != 0) {
                String strWireman = preprohormoneVar.wireman("Content-Type");
                if (contentType == null && (strWireman == null || strWireman.trim().isEmpty())) {
                    new Exception();
                    builderAllowDirectExecutor.addHeader("Content-Type", "application/octet-stream");
                }
                builderAllowDirectExecutor.setUploadDataProvider(this.f28483wireman.attabal(body, i2), this.f28482saneness);
            }
        }
        return new saneness(builderAllowDirectExecutor.build(), dern(preprohormoneVar, okHttpBridgeRequestCallback));
    }
}
