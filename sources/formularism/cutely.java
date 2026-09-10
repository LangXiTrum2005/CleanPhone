package formularism;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lformularism/cutely;", "", "", "streamId", "", "Lformularism/attabal;", "requestHeaders", "", "onRequest", "(ILjava/util/List;)Z", "responseHeaders", "last", "onHeaders", "(ILjava/util/List;Z)Z", "Lduvetyn/beachfront;", "source", "byteCount", "attabal", "(ILduvetyn/beachfront;IZ)Z", "Lokhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "", "saneness", "(ILokhttp3/internal/http2/ErrorCode;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f26355attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final cutely f26354saneness = new Companion.C0609attabal();

    /* JADX INFO: renamed from: formularism.cutely$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PushObserver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Lformularism/cutely$attabal;", "", "<init>", "()V", "Lformularism/cutely;", "CANCEL", "Lformularism/cutely;", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f26355attabal = new Companion();

        /* JADX INFO: renamed from: formularism.cutely$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PushObserver.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lformularism/cutely$attabal$attabal;", "Lformularism/cutely;", "<init>", "()V", "", "streamId", "", "Lformularism/attabal;", "requestHeaders", "", "onRequest", "(ILjava/util/List;)Z", "responseHeaders", "last", "onHeaders", "(ILjava/util/List;Z)Z", "Lduvetyn/beachfront;", "source", "byteCount", "attabal", "(ILduvetyn/beachfront;IZ)Z", "Lokhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "", "saneness", "(ILokhttp3/internal/http2/ErrorCode;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0609attabal implements cutely {
            @Override // formularism.cutely
            public boolean attabal(int streamId, duvetyn.beachfront source, int byteCount, boolean last) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(byteCount);
                return true;
            }

            @Override // formularism.cutely
            public boolean onHeaders(int streamId, List<attabal> responseHeaders, boolean last) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // formularism.cutely
            public boolean onRequest(int streamId, List<attabal> requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // formularism.cutely
            public void saneness(int streamId, ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }
        }
    }

    boolean attabal(int streamId, duvetyn.beachfront source, int byteCount, boolean last) throws IOException;

    boolean onHeaders(int streamId, List<attabal> responseHeaders, boolean last);

    boolean onRequest(int streamId, List<attabal> requestHeaders);

    void saneness(int streamId, ErrorCode errorCode);
}
