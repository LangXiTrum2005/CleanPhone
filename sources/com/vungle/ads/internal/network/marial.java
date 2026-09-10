package com.vungle.ads.internal.network;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.RequestConfiguration;
import okhttp3.cuirassed;
import okhttp3.molybdenite;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001fB%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0015J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/network/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lokhttp3/cuirassed;", "rawResponse", "body", "Lokhttp3/stratoscope;", "errorBody", "<init>", "(Lokhttp3/cuirassed;Ljava/lang/Object;Lokhttp3/stratoscope;)V", "raw", "()Lokhttp3/cuirassed;", "", "code", "()I", "", PglCryptUtils.KEY_MESSAGE, "()Ljava/lang/String;", "Lokhttp3/molybdenite;", "headers", "()Lokhttp3/molybdenite;", "()Ljava/lang/Object;", "()Lokhttp3/stratoscope;", "toString", "Lokhttp3/cuirassed;", "Ljava/lang/Object;", "Lokhttp3/stratoscope;", "", "isSuccessful", "()Z", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class marial<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final T body;
    private final stratoscope errorBody;
    private final cuirassed rawResponse;

    /* JADX INFO: renamed from: com.vungle.ads.internal.network.marial$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Response.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/network/marial$attabal;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "body", "Lokhttp3/cuirassed;", "rawResponse", "Lcom/vungle/ads/internal/network/marial;", "success", "(Ljava/lang/Object;Lokhttp3/cuirassed;)Lcom/vungle/ads/internal/network/marial;", "Lokhttp3/stratoscope;", "error", "(Lokhttp3/stratoscope;Lokhttp3/cuirassed;)Lcom/vungle/ads/internal/network/marial;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> marial<T> error(stratoscope body, cuirassed rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new marial<>(rawResponse, defaultConstructorMarker, body, defaultConstructorMarker);
        }

        public final <T> marial<T> success(T body, cuirassed rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                return new marial<>(rawResponse, body, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }

        private Companion() {
        }
    }

    public /* synthetic */ marial(cuirassed cuirassedVar, Object obj, stratoscope stratoscopeVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cuirassedVar, obj, stratoscopeVar);
    }

    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.getCode();
    }

    /* JADX INFO: renamed from: errorBody, reason: from getter */
    public final stratoscope getErrorBody() {
        return this.errorBody;
    }

    public final molybdenite headers() {
        return this.rawResponse.getHeaders();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public final String message() {
        return this.rawResponse.getMessage();
    }

    /* JADX INFO: renamed from: raw, reason: from getter */
    public final cuirassed getRawResponse() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private marial(cuirassed cuirassedVar, T t, stratoscope stratoscopeVar) {
        this.rawResponse = cuirassedVar;
        this.body = t;
        this.errorBody = stratoscopeVar;
    }
}
