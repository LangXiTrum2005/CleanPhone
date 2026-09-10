package com.chartboost.sdk.events;

import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/chartboost/sdk/events/ShowError;", "Lcom/chartboost/sdk/events/CBError;", "code", "Lcom/chartboost/sdk/events/ShowError$Code;", g.f39715A, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/chartboost/sdk/events/ShowError$Code;Ljava/lang/Exception;)V", "getCode", "()Lcom/chartboost/sdk/events/ShowError$Code;", "getException", "()Ljava/lang/Exception;", "toString", "", "Code", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ShowError implements CBError {
    private final Code code;
    private final Exception exception;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/chartboost/sdk/events/ShowError$Code;", "", "errorCode", "", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "INTERNAL", "SESSION_NOT_STARTED", "AD_ALREADY_VISIBLE", "INTERNET_UNAVAILABLE", "PRESENTATION_FAILURE", "NO_CACHED_AD", "BANNER_DISABLED", "BANNER_VIEW_IS_DETACHED", "TIMEOUT", "AD_EXPIRED", "AD_INVALIDATED", "NO_CONTEXT", "VIDEO_PLAYBACK_ERROR", "INVALID_CLICKTHROUGH_URL", "ASSET_UNAVAILABLE", "DISABLED", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Code {
        INTERNAL(0),
        SESSION_NOT_STARTED(7),
        AD_ALREADY_VISIBLE(8),
        INTERNET_UNAVAILABLE(25),
        PRESENTATION_FAILURE(33),
        NO_CACHED_AD(34),
        BANNER_DISABLED(36),
        BANNER_VIEW_IS_DETACHED(37),
        TIMEOUT(38),
        AD_EXPIRED(39),
        AD_INVALIDATED(40),
        NO_CONTEXT(41),
        VIDEO_PLAYBACK_ERROR(42),
        INVALID_CLICKTHROUGH_URL(43),
        ASSET_UNAVAILABLE(44),
        DISABLED(45);

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

    public ShowError(Code code, Exception exc) {
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
        return "Chartboost ShowError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ ShowError(Code code, Exception exc, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i2 & 2) != 0 ? null : exc);
    }
}
