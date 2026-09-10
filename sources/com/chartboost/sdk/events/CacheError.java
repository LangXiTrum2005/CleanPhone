package com.chartboost.sdk.events;

import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/chartboost/sdk/events/CacheError;", "Lcom/chartboost/sdk/events/CBError;", "code", "Lcom/chartboost/sdk/events/CacheError$Code;", g.f39715A, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/chartboost/sdk/events/CacheError$Code;Ljava/lang/Exception;)V", "getCode", "()Lcom/chartboost/sdk/events/CacheError$Code;", "getException", "()Ljava/lang/Exception;", "toString", "", "Code", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CacheError implements CBError {
    private final Code code;
    private final Exception exception;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/chartboost/sdk/events/CacheError$Code;", "", "errorCode", "", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "INTERNAL", "INTERNET_UNAVAILABLE", "NETWORK_FAILURE", "NO_AD_FOUND", "SESSION_NOT_STARTED", "SERVER_ERROR", "ASSET_DOWNLOAD_FAILURE", "BANNER_DISABLED", "BANNER_VIEW_IS_DETACHED", "TIMEOUT", "DISABLED", "LOAD_IN_PROGRESS", "ALREADY_LOADED", "INVALID_PLACEMENT", "RATE_LIMITED", "INVALID_REQUEST", "INVALID_RESPONSE", "INVALID_ADM", "NO_STORAGE", "NO_MRAID_JS", "INVALID_HTML", "WEBVIEW_FAILED", "WEBVIEW_CRASHED", "INVALID_ASSET_URL", "VAST_ERROR", "UNSUPPORTED_CODEC", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Code {
        INTERNAL(0),
        INTERNET_UNAVAILABLE(1),
        NETWORK_FAILURE(5),
        NO_AD_FOUND(6),
        SESSION_NOT_STARTED(7),
        SERVER_ERROR(8),
        ASSET_DOWNLOAD_FAILURE(16),
        BANNER_DISABLED(36),
        BANNER_VIEW_IS_DETACHED(37),
        TIMEOUT(38),
        DISABLED(39),
        LOAD_IN_PROGRESS(40),
        ALREADY_LOADED(41),
        INVALID_PLACEMENT(42),
        RATE_LIMITED(43),
        INVALID_REQUEST(44),
        INVALID_RESPONSE(45),
        INVALID_ADM(46),
        NO_STORAGE(47),
        NO_MRAID_JS(48),
        INVALID_HTML(49),
        WEBVIEW_FAILED(50),
        WEBVIEW_CRASHED(51),
        INVALID_ASSET_URL(52),
        VAST_ERROR(53),
        UNSUPPORTED_CODEC(54);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
        private final int errorCode;

        Code(int i2) {
            this.errorCode = i2;
        }

        public static EnumEntries<Code> getEntries() {
            return $ENTRIES;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public CacheError(Code code, Exception exc) {
        Intrinsics.f(code, "code");
        this.code = code;
        this.exception = exc;
    }

    public final Code getCode() {
        return this.code;
    }

    @Override // com.chartboost.sdk.events.CBError
    public Exception getException() {
        return this.exception;
    }

    public String toString() {
        return "Chartboost CacheError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ CacheError(Code code, Exception exc, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i2 & 2) != 0 ? null : exc);
    }
}
