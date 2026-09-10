package com.chartboost.sdk.events;

import android.support.v4.media.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.x4;
import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001bB9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u0082\u0001\u0006\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "constant", PglCryptUtils.KEY_MESSAGE, "causeDescription", "resolution", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getCauseDescription", "()Ljava/lang/String;", "getCode", "getConstant", "getMessage", "getResolution", "toString", "CBError", "Connectivity", "Initialization", "Load", "Other", "Render", "Show", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "Lcom/chartboost/sdk/events/ChartboostError$Other;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ChartboostError extends Exception {
    private final Throwable cause;
    private final String causeDescription;
    private final String code;
    private final String constant;
    private final String message;
    private final String resolution;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$CBError;", "", g.f39715A, "Ljava/lang/Exception;", "Lkotlin/Exception;", "getException", "()Ljava/lang/Exception;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CBError {
        Exception getException();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "Lcom/chartboost/sdk/events/ChartboostError;", "code", "", "constant", PglCryptUtils.KEY_MESSAGE, "causeDescription", "resolution", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Internal", "NetworkError", "NoInternet", "ServerError", "TimedOut", "Unknown", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity$NetworkError;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity$NoInternet;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity$ServerError;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity$TimedOut;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity$Unknown;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Connectivity extends ChartboostError {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Connectivity$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Internal extends Connectivity {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = internal.throwable;
                }
                return internal.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Internal copy(String customCause, Throwable throwable) {
                return new Internal(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) other;
                return Intrinsics.a(this.customCause, internal.customCause) && Intrinsics.a(this.throwable, internal.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Internal(String str, Throwable th) {
                super("CB_205", "CB_CONNECTIVITY_INTERNAL_ERROR", "Network request failed", "An internal error happened when making a network request. ".concat(str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Connectivity$NetworkError;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NetworkError extends Connectivity {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ NetworkError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ NetworkError copy$default(NetworkError networkError, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = networkError.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = networkError.throwable;
                }
                return networkError.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final NetworkError copy(String customCause, Throwable throwable) {
                return new NetworkError(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NetworkError)) {
                    return false;
                }
                NetworkError networkError = (NetworkError) other;
                return Intrinsics.a(this.customCause, networkError.customCause) && Intrinsics.a(this.throwable, networkError.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public NetworkError(String str, Throwable th) {
                super("CB_202", "CB_CONNECTIVITY_NETWORK_ERROR", "Network request failed.", "A networking error has occurred. ".concat(str == null ? "" : str), "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Connectivity$NoInternet;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoInternet extends Connectivity {
            public static final NoInternet INSTANCE = new NoInternet();

            private NoInternet() {
                super("CB_201", "CB_CONNECTIVITY_NO_INTERNET", "Network request failed.", "No Internet connectivity was available.", "Ensure there is Internet connectivity and try again.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoInternet);
            }

            public int hashCode() {
                return 1867194601;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Connectivity$ServerError;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ServerError extends Connectivity {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ ServerError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ ServerError copy$default(ServerError serverError, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = serverError.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = serverError.throwable;
                }
                return serverError.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final ServerError copy(String customCause, Throwable throwable) {
                return new ServerError(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServerError)) {
                    return false;
                }
                ServerError serverError = (ServerError) other;
                return Intrinsics.a(this.customCause, serverError.customCause) && Intrinsics.a(this.throwable, serverError.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public ServerError(String str, Throwable th) {
                super("CB_203", "CB_CONNECTIVITY_SERVER_ERROR", "Network request failed.", "Network request failed due to a server error. ".concat(str == null ? "" : str), "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Connectivity$TimedOut;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimedOut extends Connectivity {
            public static final TimedOut INSTANCE = new TimedOut();

            private TimedOut() {
                super("CB_204", "CB_CONNECTIVITY_TIMED_OUT", "Network request failed.", "Network request timed out.", "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof TimedOut);
            }

            public int hashCode() {
                return -396325090;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Connectivity$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Connectivity;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends Connectivity {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = unknown.throwable;
                }
                return unknown.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Unknown copy(String customCause, Throwable throwable) {
                return new Unknown(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return Intrinsics.a(this.customCause, unknown.customCause) && Intrinsics.a(this.throwable, unknown.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Unknown(String str, Throwable th) {
                super("CB_200", "CB_CONNECTIVITY_UNKNOWN_ERROR", "Network request failed.", "An unknown error has occurred. ".concat(str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        public /* synthetic */ Connectivity(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th);
        }

        private Connectivity(String str, String str2, String str3, String str4, String str5, Throwable th) {
            super(str, str2, str3, str4, str5, th, null);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "Lcom/chartboost/sdk/events/ChartboostError;", "code", "", "constant", PglCryptUtils.KEY_MESSAGE, "causeDescription", "resolution", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Disabled", "Internal", "InvalidConfiguration", "InvalidCredentials", "NoContext", "OsVersionNotSupported", "PermissionsNotSet", "Unknown", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$Disabled;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$InvalidConfiguration;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$InvalidCredentials;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$NoContext;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$OsVersionNotSupported;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$PermissionsNotSet;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization$Unknown;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Initialization extends ChartboostError {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$Disabled;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Disabled extends Initialization {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("CB_101", "CB_INITIALIZATION_DISABLED", "Initialization has failed.", "Initialization has been disabled by the server.", "Update to a newer Chartboost Monetization SDK version or contact Chartboost Support for assistance.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Disabled);
            }

            public int hashCode() {
                return 2053037114;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Internal extends Initialization {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = internal.throwable;
                }
                return internal.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Internal copy(String customCause, Throwable throwable) {
                return new Internal(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) other;
                return Intrinsics.a(this.customCause, internal.customCause) && Intrinsics.a(this.throwable, internal.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Internal(String str, Throwable th) {
                super("CB_105", "CB_INITIALIZATION_INTERNAL_ERROR", "Initialization has failed.", "An internal error happened during initialization. ".concat(str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$InvalidConfiguration;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidConfiguration extends Initialization {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ InvalidConfiguration(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ InvalidConfiguration copy$default(InvalidConfiguration invalidConfiguration, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = invalidConfiguration.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = invalidConfiguration.throwable;
                }
                return invalidConfiguration.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final InvalidConfiguration copy(String customCause, Throwable throwable) {
                return new InvalidConfiguration(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidConfiguration)) {
                    return false;
                }
                InvalidConfiguration invalidConfiguration = (InvalidConfiguration) other;
                return Intrinsics.a(this.customCause, invalidConfiguration.customCause) && Intrinsics.a(this.throwable, invalidConfiguration.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public InvalidConfiguration(String str, Throwable th) {
                super("CB_104", "CB_INITIALIZATION_INVALID_CONFIGURATION", "Initialization has failed.", "Invalid/malformed app configuration received from the ad server. ".concat(str == null ? "" : str), "If this problem persists, reach out to the Chartboost Support for further assistance. Forward us a copy of Chartboost network traffic.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$InvalidCredentials;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidCredentials extends Initialization {
            public static final InvalidCredentials INSTANCE = new InvalidCredentials();

            private InvalidCredentials() {
                super("CB_102", "CB_INITIALIZATION_INVALID_CREDENTIALS", "Initialization has failed.", "Invalid/empty credentials were supplied.", "Double check that the supplied information is correct.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof InvalidCredentials);
            }

            public int hashCode() {
                return 1005114563;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$NoContext;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoContext extends Initialization {
            public static final NoContext INSTANCE = new NoContext();

            private NoContext() {
                super("CB_103", "CB_INITIALIZATION_NO_CONTEXT", "Initialization has failed.", "No Context supplied.", "Ensure that a Context is provided at initialization.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoContext);
            }

            public int hashCode() {
                return 953518768;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$OsVersionNotSupported;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OsVersionNotSupported extends Initialization {
            public static final OsVersionNotSupported INSTANCE = new OsVersionNotSupported();

            private OsVersionNotSupported() {
                super("CB_106", "CB_INITIALIZATION_OS_VERSION_NOT_SUPPORTED", "Initialization has failed.", "Ad serving for the operating system version is not supported.", "N/A", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OsVersionNotSupported);
            }

            public int hashCode() {
                return -847782255;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$PermissionsNotSet;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PermissionsNotSet extends Initialization {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ PermissionsNotSet(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ PermissionsNotSet copy$default(PermissionsNotSet permissionsNotSet, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = permissionsNotSet.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = permissionsNotSet.throwable;
                }
                return permissionsNotSet.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final PermissionsNotSet copy(String customCause, Throwable throwable) {
                return new PermissionsNotSet(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PermissionsNotSet)) {
                    return false;
                }
                PermissionsNotSet permissionsNotSet = (PermissionsNotSet) other;
                return Intrinsics.a(this.customCause, permissionsNotSet.customCause) && Intrinsics.a(this.throwable, permissionsNotSet.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public PermissionsNotSet(String str, Throwable th) {
                super("CB_107", "CB_INITIALIZATION_PERMISSIONS_NOT_SET", "Initialization has failed.", "App is missing declared permissions in the Android manifest. ".concat(str == null ? "" : str), "Check your console logs for more details.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Initialization$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Initialization;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends Initialization {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = unknown.throwable;
                }
                return unknown.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Unknown copy(String customCause, Throwable throwable) {
                return new Unknown(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return Intrinsics.a(this.customCause, unknown.customCause) && Intrinsics.a(this.throwable, unknown.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Unknown(String str, Throwable th) {
                super("CB_100", "CB_INITIALIZATION_UNKNOWN_ERROR", "Initialization has failed.", "An unknown error has occurred. ".concat(str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        public /* synthetic */ Initialization(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th);
        }

        private Initialization(String str, String str2, String str3, String str4, String str5, Throwable th) {
            super(str, str2, str3, str4, str5, th, null);
        }
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0017\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u0082\u0001\u0017\"#$%&'()*+,-./012345678¨\u00069"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load;", "Lcom/chartboost/sdk/events/ChartboostError;", "code", "", "constant", PglCryptUtils.KEY_MESSAGE, "causeDescription", "resolution", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "AlreadyLoaded", "AssetUnavailable", "Disabled", "Internal", "InvalidAdm", "InvalidAssetUrl", "InvalidHtml", "InvalidPlacement", "InvalidRequest", "InvalidResponse", "LoadInProgress", "NoAd", "NoContext", "NoMraidJs", "NoStorage", "NotInitialized", "RateLimited", "TimedOut", "Unknown", "UnsupportedCodec", "VastError", "WebViewCrashed", "WebViewFailed", "Lcom/chartboost/sdk/events/ChartboostError$Load$AlreadyLoaded;", "Lcom/chartboost/sdk/events/ChartboostError$Load$AssetUnavailable;", "Lcom/chartboost/sdk/events/ChartboostError$Load$Disabled;", "Lcom/chartboost/sdk/events/ChartboostError$Load$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidAdm;", "Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidAssetUrl;", "Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidHtml;", "Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidPlacement;", "Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidRequest;", "Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidResponse;", "Lcom/chartboost/sdk/events/ChartboostError$Load$LoadInProgress;", "Lcom/chartboost/sdk/events/ChartboostError$Load$NoAd;", "Lcom/chartboost/sdk/events/ChartboostError$Load$NoContext;", "Lcom/chartboost/sdk/events/ChartboostError$Load$NoMraidJs;", "Lcom/chartboost/sdk/events/ChartboostError$Load$NoStorage;", "Lcom/chartboost/sdk/events/ChartboostError$Load$NotInitialized;", "Lcom/chartboost/sdk/events/ChartboostError$Load$RateLimited;", "Lcom/chartboost/sdk/events/ChartboostError$Load$TimedOut;", "Lcom/chartboost/sdk/events/ChartboostError$Load$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Load$UnsupportedCodec;", "Lcom/chartboost/sdk/events/ChartboostError$Load$VastError;", "Lcom/chartboost/sdk/events/ChartboostError$Load$WebViewCrashed;", "Lcom/chartboost/sdk/events/ChartboostError$Load$WebViewFailed;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Load extends ChartboostError {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$AlreadyLoaded;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AlreadyLoaded extends Load {
            public static final AlreadyLoaded INSTANCE = new AlreadyLoaded();

            private AlreadyLoaded() {
                super("CB_304", "CB_LOAD_ALREADY_LOADED", "Ad load has failed.", "Ad is already loaded.", "Show the ad before loading another.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AlreadyLoaded);
            }

            public int hashCode() {
                return 320533829;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$AssetUnavailable;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "url", "", "customCause", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AssetUnavailable extends Load {
            private final String customCause;
            private final Throwable throwable;
            private final String url;

            public /* synthetic */ AssetUnavailable(String str, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i2 & 4) != 0 ? null : th);
            }

            public static /* synthetic */ AssetUnavailable copy$default(AssetUnavailable assetUnavailable, String str, String str2, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = assetUnavailable.url;
                }
                if ((i2 & 2) != 0) {
                    str2 = assetUnavailable.customCause;
                }
                if ((i2 & 4) != 0) {
                    th = assetUnavailable.throwable;
                }
                return assetUnavailable.copy(str, str2, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final AssetUnavailable copy(String url, String customCause, Throwable throwable) {
                return new AssetUnavailable(url, customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetUnavailable)) {
                    return false;
                }
                AssetUnavailable assetUnavailable = (AssetUnavailable) other;
                return Intrinsics.a(this.url, assetUnavailable.url) && Intrinsics.a(this.customCause, assetUnavailable.customCause) && Intrinsics.a(this.throwable, assetUnavailable.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th = this.throwable;
                return iHashCode2 + (th != null ? th.hashCode() : 0);
            }

            public AssetUnavailable(String str, String str2, Throwable th) {
                super("CB_320", "CB_LOAD_ASSET_UNAVAILABLE", "Ad load has failed.", a.o("Asset is unavailable. URL: ", str == null ? "unknown" : str, ". Details: ", str2 == null ? "" : str2), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$Disabled;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Disabled extends Load {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("CB_301", "CB_LOAD_DISABLED", "Ad load has failed.", "Ad loading has been disabled by the server.", "Update to a newer Chartboost Monetization SDK version or contact Chartboost Support for assistance.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Disabled);
            }

            public int hashCode() {
                return 607244980;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Internal extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = internal.throwable;
                }
                return internal.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Internal copy(String customCause, Throwable throwable) {
                return new Internal(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) other;
                return Intrinsics.a(this.customCause, internal.customCause) && Intrinsics.a(this.throwable, internal.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Internal(String str, Throwable th) {
                super("CB_311", "CB_LOAD_INTERNAL_ERROR", "Ad load has failed.", "An internal error happened during ad load. ".concat(str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidAdm;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidAdm extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ InvalidAdm(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ InvalidAdm copy$default(InvalidAdm invalidAdm, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = invalidAdm.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = invalidAdm.throwable;
                }
                return invalidAdm.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final InvalidAdm copy(String customCause, Throwable throwable) {
                return new InvalidAdm(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidAdm)) {
                    return false;
                }
                InvalidAdm invalidAdm = (InvalidAdm) other;
                return Intrinsics.a(this.customCause, invalidAdm.customCause) && Intrinsics.a(this.throwable, invalidAdm.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public InvalidAdm(String str, Throwable th) {
                super("CB_310", "CB_LOAD_INVALID_ADM", "Ad load has failed.", "Ad markup string is invalid or empty. ".concat(str == null ? "" : str), "Contact Chartboost Support or the mediator's support and provide a copy of your network traffic logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidAssetUrl;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "url", "", "customCause", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidAssetUrl extends Load {
            private final String customCause;
            private final Throwable throwable;
            private final String url;

            public /* synthetic */ InvalidAssetUrl(String str, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i2 & 4) != 0 ? null : th);
            }

            public static /* synthetic */ InvalidAssetUrl copy$default(InvalidAssetUrl invalidAssetUrl, String str, String str2, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = invalidAssetUrl.url;
                }
                if ((i2 & 2) != 0) {
                    str2 = invalidAssetUrl.customCause;
                }
                if ((i2 & 4) != 0) {
                    th = invalidAssetUrl.throwable;
                }
                return invalidAssetUrl.copy(str, str2, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final InvalidAssetUrl copy(String url, String customCause, Throwable throwable) {
                return new InvalidAssetUrl(url, customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidAssetUrl)) {
                    return false;
                }
                InvalidAssetUrl invalidAssetUrl = (InvalidAssetUrl) other;
                return Intrinsics.a(this.url, invalidAssetUrl.url) && Intrinsics.a(this.customCause, invalidAssetUrl.customCause) && Intrinsics.a(this.throwable, invalidAssetUrl.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th = this.throwable;
                return iHashCode2 + (th != null ? th.hashCode() : 0);
            }

            public InvalidAssetUrl(String str, String str2, Throwable th) {
                super("CB_318", "CB_LOAD_INVALID_ASSET_URL", "Ad load has failed.", a.o("Invalid asset URL: ", str == null ? "unknown" : str, ". ", str2 == null ? "" : str2), "N/A", th, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidHtml;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidHtml extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ InvalidHtml(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ InvalidHtml copy$default(InvalidHtml invalidHtml, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = invalidHtml.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = invalidHtml.throwable;
                }
                return invalidHtml.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final InvalidHtml copy(String customCause, Throwable throwable) {
                return new InvalidHtml(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidHtml)) {
                    return false;
                }
                InvalidHtml invalidHtml = (InvalidHtml) other;
                return Intrinsics.a(this.customCause, invalidHtml.customCause) && Intrinsics.a(this.throwable, invalidHtml.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public InvalidHtml(String str, Throwable th) {
                super("CB_315", "CB_LOAD_INVALID_HTML", "Ad load has failed.", "Invalid HTML document or snippet. ".concat(str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidPlacement;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidPlacement extends Load {
            public static final InvalidPlacement INSTANCE = new InvalidPlacement();

            private InvalidPlacement() {
                super("CB_305", "CB_LOAD_INVALID_PLACEMENT", "Ad load has failed.", "Placement is invalid or empty.", "Ensure the Chartboost Monetization placement matches the value entered into the dashboard.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof InvalidPlacement);
            }

            public int hashCode() {
                return 648505062;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidRequest;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidRequest extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ InvalidRequest(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ InvalidRequest copy$default(InvalidRequest invalidRequest, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = invalidRequest.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = invalidRequest.throwable;
                }
                return invalidRequest.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final InvalidRequest copy(String customCause, Throwable throwable) {
                return new InvalidRequest(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidRequest)) {
                    return false;
                }
                InvalidRequest invalidRequest = (InvalidRequest) other;
                return Intrinsics.a(this.customCause, invalidRequest.customCause) && Intrinsics.a(this.throwable, invalidRequest.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public InvalidRequest(String str, Throwable th) {
                super("CB_308", "CB_LOAD_INVALID_REQUEST", "Ad load has failed.", "Ad request was invalid/malformed. ".concat(str == null ? "" : str), "Contact Chartboost Support and provide a copy of your network traffic logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$InvalidResponse;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidResponse extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ InvalidResponse(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ InvalidResponse copy$default(InvalidResponse invalidResponse, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = invalidResponse.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = invalidResponse.throwable;
                }
                return invalidResponse.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final InvalidResponse copy(String customCause, Throwable throwable) {
                return new InvalidResponse(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidResponse)) {
                    return false;
                }
                InvalidResponse invalidResponse = (InvalidResponse) other;
                return Intrinsics.a(this.customCause, invalidResponse.customCause) && Intrinsics.a(this.throwable, invalidResponse.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public InvalidResponse(String str, Throwable th) {
                super("CB_309", "CB_LOAD_INVALID_RESPONSE", "Ad load has failed.", "Ad response was invalid/malformed and could not be parsed. ".concat(str == null ? "" : str), "Contact Chartboost Support and provide a copy of your network traffic logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$LoadInProgress;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadInProgress extends Load {
            public static final LoadInProgress INSTANCE = new LoadInProgress();

            private LoadInProgress() {
                super("CB_303", "CB_LOAD_IN_PROGRESS", "Ad load has failed.", "Ad load already in progress.", "Wait until the current ad load is done before loading another ad.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof LoadInProgress);
            }

            public int hashCode() {
                return -739965392;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$NoAd;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoAd extends Load {
            public static final NoAd INSTANCE = new NoAd();

            private NoAd() {
                super("CB_313", "CB_LOAD_NO_AD", "Ad load has failed.", "No ad available.", "Try again. If the problem persists, verify dashboard settings in the Chartboost Monetization dashboard.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoAd);
            }

            public int hashCode() {
                return 1451499004;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$NoContext;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoContext extends Load {
            public static final NoContext INSTANCE = new NoContext();

            private NoContext() {
                super("CB_306", "CB_LOAD_NO_CONTEXT", "Ad load has failed.", "No Activity provided to load the ad.", "Ensure that a valid Context is provided when loading ads.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoContext);
            }

            public int hashCode() {
                return -916364426;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$NoMraidJs;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoMraidJs extends Load {
            public static final NoMraidJs INSTANCE = new NoMraidJs();

            private NoMraidJs() {
                super("CB_314", "CB_LOAD_NO_MRAID_JS", "Ad load has failed.", "Required MRAID JavaScript file is missing from the SDK bundle.", "Verify that the Chartboost Monetization integration is correct. If the issue persists, contact Chartboost Support.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoMraidJs);
            }

            public int hashCode() {
                return -557710617;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$NoStorage;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoStorage extends Load {
            public static final NoStorage INSTANCE = new NoStorage();

            private NoStorage() {
                super("CB_312", "CB_LOAD_NO_STORAGE", "Ad load has failed.", "Insufficient storage to load the ad.", "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your console logs.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoStorage);
            }

            public int hashCode() {
                return 542797890;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$NotInitialized;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NotInitialized extends Load {
            public static final NotInitialized INSTANCE = new NotInitialized();

            private NotInitialized() {
                super("CB_302", "CB_LOAD_NOT_INITIALIZED", "Ad load has failed.", "SDK initialization not started or still in progress.", "Ensure the Chartboost Monetization SDK has completed initialization before loading ads.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotInitialized);
            }

            public int hashCode() {
                return -2031534023;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$RateLimited;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RateLimited extends Load {
            public static final RateLimited INSTANCE = new RateLimited();

            private RateLimited() {
                super("CB_307", "CB_LOAD_RATE_LIMITED", "Ad load has failed.", "Too many ad requests have been made over a short amount of time.", "Avoid continually making ad requests in a short amount of time. Implementing an exponential backoff strategy will mitigate this issue.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RateLimited);
            }

            public int hashCode() {
                return 662913378;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$TimedOut;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimedOut extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ TimedOut(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ TimedOut copy$default(TimedOut timedOut, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = timedOut.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = timedOut.throwable;
                }
                return timedOut.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final TimedOut copy(String customCause, Throwable throwable) {
                return new TimedOut(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimedOut)) {
                    return false;
                }
                TimedOut timedOut = (TimedOut) other;
                return Intrinsics.a(this.customCause, timedOut.customCause) && Intrinsics.a(this.throwable, timedOut.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public TimedOut(String str, Throwable th) {
                super("CB_322", "CB_LOAD_TIMED_OUT", "Ad load has failed.", "Operation has timed out. ".concat(str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = unknown.throwable;
                }
                return unknown.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Unknown copy(String customCause, Throwable throwable) {
                return new Unknown(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return Intrinsics.a(this.customCause, unknown.customCause) && Intrinsics.a(this.throwable, unknown.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Unknown(String str, Throwable th) {
                super("CB_300", "CB_LOAD_UNKNOWN_ERROR", "Ad load has failed.", "An unknown error has occurred. ".concat(str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$UnsupportedCodec;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UnsupportedCodec extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ UnsupportedCodec(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ UnsupportedCodec copy$default(UnsupportedCodec unsupportedCodec, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = unsupportedCodec.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = unsupportedCodec.throwable;
                }
                return unsupportedCodec.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final UnsupportedCodec copy(String customCause, Throwable throwable) {
                return new UnsupportedCodec(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnsupportedCodec)) {
                    return false;
                }
                UnsupportedCodec unsupportedCodec = (UnsupportedCodec) other;
                return Intrinsics.a(this.customCause, unsupportedCodec.customCause) && Intrinsics.a(this.throwable, unsupportedCodec.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public UnsupportedCodec(String str, Throwable th) {
                super("CB_321", "CB_LOAD_UNSUPPORTED_CODEC", "Ad load has failed.", "Video codec is unsupported. ".concat(str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$VastError;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VastError extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ VastError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ VastError copy$default(VastError vastError, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = vastError.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = vastError.throwable;
                }
                return vastError.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final VastError copy(String customCause, Throwable throwable) {
                return new VastError(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VastError)) {
                    return false;
                }
                VastError vastError = (VastError) other;
                return Intrinsics.a(this.customCause, vastError.customCause) && Intrinsics.a(this.throwable, vastError.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public VastError(String str, Throwable th) {
                super("CB_319", "CB_LOAD_VAST_ERROR", "Ad load has failed.", "VAST error. ".concat(str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$WebViewCrashed;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WebViewCrashed extends Load {
            public static final WebViewCrashed INSTANCE = new WebViewCrashed();

            private WebViewCrashed() {
                super("CB_317", "CB_LOAD_WEBVIEW_CRASHED", "Ad load has failed.", "The WebView process crashed and its process was killed by the system.", "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof WebViewCrashed);
            }

            public int hashCode() {
                return -1894253979;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Load$WebViewFailed;", "Lcom/chartboost/sdk/events/ChartboostError$Load;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WebViewFailed extends Load {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ WebViewFailed(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ WebViewFailed copy$default(WebViewFailed webViewFailed, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = webViewFailed.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = webViewFailed.throwable;
                }
                return webViewFailed.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final WebViewFailed copy(String customCause, Throwable throwable) {
                return new WebViewFailed(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WebViewFailed)) {
                    return false;
                }
                WebViewFailed webViewFailed = (WebViewFailed) other;
                return Intrinsics.a(this.customCause, webViewFailed.customCause) && Intrinsics.a(this.throwable, webViewFailed.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public WebViewFailed(String str, Throwable th) {
                super("CB_316", "CB_LOAD_WEBVIEW_FAILED", "Ad load has failed.", "The WebView failed to load the creative. ".concat(str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        public /* synthetic */ Load(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th);
        }

        private Load(String str, String str2, String str3, String str4, String str5, Throwable th) {
            super(str, str2, str3, str4, str5, th, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u000bB9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Other;", "Lcom/chartboost/sdk/events/ChartboostError;", "code", "", "constant", PglCryptUtils.KEY_MESSAGE, "causeDescription", "resolution", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Unknown", "Lcom/chartboost/sdk/events/ChartboostError$Other$Unknown;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Other extends ChartboostError {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Other$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Other;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends Other {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = unknown.throwable;
                }
                return unknown.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Unknown copy(String customCause, Throwable throwable) {
                return new Unknown(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return Intrinsics.a(this.customCause, unknown.customCause) && Intrinsics.a(this.throwable, unknown.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Unknown(String str, Throwable th) {
                super("CB_900", "CB_OTHER_UNKNOWN_ERROR", "An internal error has occurred.", str == null ? "An unknown internal error has occurred." : str, "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        public /* synthetic */ Other(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th);
        }

        private Other(String str, String str2, String str3, String str4, String str5, Throwable th) {
            super(str, str2, str3, str4, str5, th, null);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render;", "Lcom/chartboost/sdk/events/ChartboostError;", "code", "", "constant", PglCryptUtils.KEY_MESSAGE, "causeDescription", "resolution", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "AssetUnavailable", "Internal", "InvalidClickthroughUrl", "MissingSkanParameters", "Unknown", "VideoPlaybackError", "WebViewMraidUnload", "WebViewTerminated", "Lcom/chartboost/sdk/events/ChartboostError$Render$AssetUnavailable;", "Lcom/chartboost/sdk/events/ChartboostError$Render$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Render$InvalidClickthroughUrl;", "Lcom/chartboost/sdk/events/ChartboostError$Render$MissingSkanParameters;", "Lcom/chartboost/sdk/events/ChartboostError$Render$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Render$VideoPlaybackError;", "Lcom/chartboost/sdk/events/ChartboostError$Render$WebViewMraidUnload;", "Lcom/chartboost/sdk/events/ChartboostError$Render$WebViewTerminated;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Render extends ChartboostError {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$AssetUnavailable;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "url", "", "customCause", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AssetUnavailable extends Render {
            private final String customCause;
            private final Throwable throwable;
            private final String url;

            public /* synthetic */ AssetUnavailable(String str, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i2 & 4) != 0 ? null : th);
            }

            public static /* synthetic */ AssetUnavailable copy$default(AssetUnavailable assetUnavailable, String str, String str2, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = assetUnavailable.url;
                }
                if ((i2 & 2) != 0) {
                    str2 = assetUnavailable.customCause;
                }
                if ((i2 & 4) != 0) {
                    th = assetUnavailable.throwable;
                }
                return assetUnavailable.copy(str, str2, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final AssetUnavailable copy(String url, String customCause, Throwable throwable) {
                return new AssetUnavailable(url, customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetUnavailable)) {
                    return false;
                }
                AssetUnavailable assetUnavailable = (AssetUnavailable) other;
                return Intrinsics.a(this.url, assetUnavailable.url) && Intrinsics.a(this.customCause, assetUnavailable.customCause) && Intrinsics.a(this.throwable, assetUnavailable.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th = this.throwable;
                return iHashCode2 + (th != null ? th.hashCode() : 0);
            }

            public AssetUnavailable(String str, String str2, Throwable th) {
                super("CB_503", "CB_RENDER_ASSET_UNAVAILABLE", "Ad rendering has failed.", a.o("Asset is unavailable. URL: ", str == null ? "unknown" : str, ". Details: ", str2 == null ? "" : str2), "N/A", th, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$Internal;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Internal extends Render {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = internal.throwable;
                }
                return internal.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Internal copy(String customCause, Throwable throwable) {
                return new Internal(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) other;
                return Intrinsics.a(this.customCause, internal.customCause) && Intrinsics.a(this.throwable, internal.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Internal(String str, Throwable th) {
                super("CB_504", "CB_RENDER_INTERNAL_ERROR", "Ad rendering has failed.", "An internal error happened during ad render. ".concat(str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$InvalidClickthroughUrl;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "url", "", "customCause", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InvalidClickthroughUrl extends Render {
            private final String customCause;
            private final Throwable throwable;
            private final String url;

            public /* synthetic */ InvalidClickthroughUrl(String str, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i2 & 4) != 0 ? null : th);
            }

            public static /* synthetic */ InvalidClickthroughUrl copy$default(InvalidClickthroughUrl invalidClickthroughUrl, String str, String str2, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = invalidClickthroughUrl.url;
                }
                if ((i2 & 2) != 0) {
                    str2 = invalidClickthroughUrl.customCause;
                }
                if ((i2 & 4) != 0) {
                    th = invalidClickthroughUrl.throwable;
                }
                return invalidClickthroughUrl.copy(str, str2, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final InvalidClickthroughUrl copy(String url, String customCause, Throwable throwable) {
                return new InvalidClickthroughUrl(url, customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidClickthroughUrl)) {
                    return false;
                }
                InvalidClickthroughUrl invalidClickthroughUrl = (InvalidClickthroughUrl) other;
                return Intrinsics.a(this.url, invalidClickthroughUrl.url) && Intrinsics.a(this.customCause, invalidClickthroughUrl.customCause) && Intrinsics.a(this.throwable, invalidClickthroughUrl.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th = this.throwable;
                return iHashCode2 + (th != null ? th.hashCode() : 0);
            }

            public InvalidClickthroughUrl(String str, String str2, Throwable th) {
                super("CB_502", "CB_RENDER_INVALID_CLICKTHROUGH_URL", "Clickthrough has failed.", a.o("Invalid or unrecognized clickthrough. URL: ", str == null ? "unknown" : str, ". Details: ", str2 == null ? "" : str2), "N/A", th, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$MissingSkanParameters;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MissingSkanParameters extends Render {
            public static final MissingSkanParameters INSTANCE = new MissingSkanParameters();

            private MissingSkanParameters() {
                super("CB_507", "CB_RENDER_MISSING_SKAN_PARAMETERS", "Ad rendering has failed.", "SKAN attribution parameters are missing for the store product view controller.", "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof MissingSkanParameters);
            }

            public int hashCode() {
                return 287695565;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends Render {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = unknown.throwable;
                }
                return unknown.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Unknown copy(String customCause, Throwable throwable) {
                return new Unknown(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return Intrinsics.a(this.customCause, unknown.customCause) && Intrinsics.a(this.throwable, unknown.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Unknown(String str, Throwable th) {
                super("CB_500", "CB_RENDER_UNKNOWN_ERROR", "Ad rendering has failed.", "An unknown error has occurred. ".concat(str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$VideoPlaybackError;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VideoPlaybackError extends Render {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ VideoPlaybackError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ VideoPlaybackError copy$default(VideoPlaybackError videoPlaybackError, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = videoPlaybackError.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = videoPlaybackError.throwable;
                }
                return videoPlaybackError.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final VideoPlaybackError copy(String customCause, Throwable throwable) {
                return new VideoPlaybackError(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoPlaybackError)) {
                    return false;
                }
                VideoPlaybackError videoPlaybackError = (VideoPlaybackError) other;
                return Intrinsics.a(this.customCause, videoPlaybackError.customCause) && Intrinsics.a(this.throwable, videoPlaybackError.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public VideoPlaybackError(String str, Throwable th) {
                super("CB_501", "CB_RENDER_VIDEO_PLAYBACK_ERROR", "Ad rendering has failed.", "There was an error with the video player. ".concat(str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$WebViewMraidUnload;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WebViewMraidUnload extends Render {
            public static final WebViewMraidUnload INSTANCE = new WebViewMraidUnload();

            private WebViewMraidUnload() {
                super("CB_505", "CB_RENDER_WEBVIEW_MRAID_UNLOAD", "Ad rendering has failed.", "MRAID requested unloading the ad.", "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof WebViewMraidUnload);
            }

            public int hashCode() {
                return 886330629;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Render$WebViewTerminated;", "Lcom/chartboost/sdk/events/ChartboostError$Render;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WebViewTerminated extends Render {
            public static final WebViewTerminated INSTANCE = new WebViewTerminated();

            private WebViewTerminated() {
                super("CB_506", "CB_RENDER_WEBVIEW_TERMINATED", "Ad rendering has failed.", "Web content process terminated.", "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof WebViewTerminated);
            }

            public int hashCode() {
                return -756667756;
            }
        }

        public /* synthetic */ Render(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th);
        }

        private Render(String str, String str2, String str3, String str4, String str5, Throwable th) {
            super(str, str2, str3, str4, str5, th, null);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n\u0082\u0001\n\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show;", "Lcom/chartboost/sdk/events/ChartboostError;", "code", "", "constant", PglCryptUtils.KEY_MESSAGE, "causeDescription", "resolution", "cause", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "AdExpired", "AdInvalidated", "AssetUnavailable", "Disabled", "FullscreenAlreadyShowing", "NoAd", "NoContext", "NotInitialized", "TimedOut", "Unknown", "Lcom/chartboost/sdk/events/ChartboostError$Show$AdExpired;", "Lcom/chartboost/sdk/events/ChartboostError$Show$AdInvalidated;", "Lcom/chartboost/sdk/events/ChartboostError$Show$AssetUnavailable;", "Lcom/chartboost/sdk/events/ChartboostError$Show$Disabled;", "Lcom/chartboost/sdk/events/ChartboostError$Show$FullscreenAlreadyShowing;", "Lcom/chartboost/sdk/events/ChartboostError$Show$NoAd;", "Lcom/chartboost/sdk/events/ChartboostError$Show$NoContext;", "Lcom/chartboost/sdk/events/ChartboostError$Show$NotInitialized;", "Lcom/chartboost/sdk/events/ChartboostError$Show$TimedOut;", "Lcom/chartboost/sdk/events/ChartboostError$Show$Unknown;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Show extends ChartboostError {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$AdExpired;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AdExpired extends Show {
            public static final AdExpired INSTANCE = new AdExpired();

            private AdExpired() {
                super("CB_402", "CB_SHOW_AD_EXPIRED", "Ad show has failed.", "Ad has expired.", "Try loading another ad and ensure it is ready before it's shown.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AdExpired);
            }

            public int hashCode() {
                return 1688594849;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$AdInvalidated;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AdInvalidated extends Show {
            public static final AdInvalidated INSTANCE = new AdInvalidated();

            private AdInvalidated() {
                super("CB_403", "CB_SHOW_AD_INVALIDATED", "Ad show has failed.", "Ad has been invalidated.", "Try loading another ad and ensure it is ready before it's shown.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AdInvalidated);
            }

            public int hashCode() {
                return 860330757;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$AssetUnavailable;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "url", "", "customCause", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AssetUnavailable extends Show {
            private final String customCause;
            private final Throwable throwable;
            private final String url;

            public /* synthetic */ AssetUnavailable(String str, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i2 & 4) != 0 ? null : th);
            }

            public static /* synthetic */ AssetUnavailable copy$default(AssetUnavailable assetUnavailable, String str, String str2, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = assetUnavailable.url;
                }
                if ((i2 & 2) != 0) {
                    str2 = assetUnavailable.customCause;
                }
                if ((i2 & 4) != 0) {
                    th = assetUnavailable.throwable;
                }
                return assetUnavailable.copy(str, str2, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final AssetUnavailable copy(String url, String customCause, Throwable throwable) {
                return new AssetUnavailable(url, customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetUnavailable)) {
                    return false;
                }
                AssetUnavailable assetUnavailable = (AssetUnavailable) other;
                return Intrinsics.a(this.url, assetUnavailable.url) && Intrinsics.a(this.customCause, assetUnavailable.customCause) && Intrinsics.a(this.throwable, assetUnavailable.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th = this.throwable;
                return iHashCode2 + (th != null ? th.hashCode() : 0);
            }

            public AssetUnavailable(String str, String str2, Throwable th) {
                super("CB_407", "CB_SHOW_ASSET_UNAVAILABLE", "Ad show has failed.", a.o("Asset is unavailable. URL: ", str == null ? "unknown" : str, ". Details: ", str2 == null ? "" : str2), "N/A", th, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$Disabled;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Disabled extends Show {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("CB_408", "CB_SHOW_DISABLED", "Ad show has failed.", "Ad showing has been disabled by the server.", "Update to a newer Chartboost Monetization SDK version or contact Chartboost Support for assistance.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Disabled);
            }

            public int hashCode() {
                return -1176459651;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$FullscreenAlreadyShowing;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FullscreenAlreadyShowing extends Show {
            public static final FullscreenAlreadyShowing INSTANCE = new FullscreenAlreadyShowing();

            private FullscreenAlreadyShowing() {
                super("CB_405", "CB_SHOW_FULLSCREEN_ALREADY_SHOWING", "Ad show has failed.", "A fullscreen ad is already showing.", "Dismiss the fullscreen ad before presenting another one.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof FullscreenAlreadyShowing);
            }

            public int hashCode() {
                return 1980416745;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$NoAd;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoAd extends Show {
            public static final NoAd INSTANCE = new NoAd();

            private NoAd() {
                super("CB_401", "CB_SHOW_NO_AD", "Ad show has failed.", "No loaded ad to show.", "Try loading another ad and ensure it is ready before it's shown.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoAd);
            }

            public int hashCode() {
                return -1841414587;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$NoContext;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NoContext extends Show {
            public static final NoContext INSTANCE = new NoContext();

            private NoContext() {
                super("CB_404", "CB_SHOW_NO_CONTEXT", "Ad show has failed.", "No Activity provided to show the ad.", "Ensure that a valid Context is provided when showing ads.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NoContext);
            }

            public int hashCode() {
                return -376633139;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$NotInitialized;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "()V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NotInitialized extends Show {
            public static final NotInitialized INSTANCE = new NotInitialized();

            private NotInitialized() {
                super("CB_409", "CB_SHOW_NOT_INITIALIZED", "Ad show has failed.", "SDK initialization not started or still in progress.", "Ensure the Chartboost Monetization SDK has completed initialization before showing ads.", null, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotInitialized);
            }

            public int hashCode() {
                return -307078846;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$TimedOut;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimedOut extends Show {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ TimedOut(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ TimedOut copy$default(TimedOut timedOut, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = timedOut.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = timedOut.throwable;
                }
                return timedOut.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final TimedOut copy(String customCause, Throwable throwable) {
                return new TimedOut(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimedOut)) {
                    return false;
                }
                TimedOut timedOut = (TimedOut) other;
                return Intrinsics.a(this.customCause, timedOut.customCause) && Intrinsics.a(this.throwable, timedOut.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public TimedOut(String str, Throwable th) {
                super("CB_406", "CB_SHOW_TIMED_OUT", "Ad show has failed.", "Operation has timed out. ".concat(str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/events/ChartboostError$Show$Unknown;", "Lcom/chartboost/sdk/events/ChartboostError$Show;", "customCause", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCustomCause", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Unknown extends Show {
            private final String customCause;
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : th);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i2 & 2) != 0) {
                    th = unknown.throwable;
                }
                return unknown.copy(str, th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCustomCause() {
                return this.customCause;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Unknown copy(String customCause, Throwable throwable) {
                return new Unknown(customCause, throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) other;
                return Intrinsics.a(this.customCause, unknown.customCause) && Intrinsics.a(this.throwable, unknown.throwable);
            }

            public final String getCustomCause() {
                return this.customCause;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th = this.throwable;
                return iHashCode + (th != null ? th.hashCode() : 0);
            }

            public Unknown(String str, Throwable th) {
                super("CB_400", "CB_SHOW_UNKNOWN_ERROR", "Ad show has failed.", "An unknown error has occurred. ".concat(str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th, null);
                this.customCause = str;
                this.throwable = th;
            }
        }

        public /* synthetic */ Show(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, th);
        }

        private Show(String str, String str2, String str3, String str4, String str5, Throwable th) {
            super(str, str2, str3, str4, str5, th, null);
        }
    }

    public /* synthetic */ ChartboostError(String str, String str2, String str3, String str4, String str5, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final String getCauseDescription() {
        return this.causeDescription;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getConstant() {
        return this.constant;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getResolution() {
        return this.resolution;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.code;
        String str2 = this.constant;
        String message = getMessage();
        String str3 = this.causeDescription;
        String str4 = this.resolution;
        Throwable cause = getCause();
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("ChartboostError(code='", str, "', constant='", str2, "', message='");
        androidx.media3.extractor.text.ttml.a.C(sbQ, message, "', causeDescription='", str3, "', resolution='");
        sbQ.append(str4);
        sbQ.append("', cause=");
        sbQ.append(cause);
        sbQ.append(")");
        return sbQ.toString();
    }

    private ChartboostError(String str, String str2, String str3, String str4, String str5, Throwable th) {
        super(str3, th);
        this.code = str;
        this.constant = str2;
        this.message = str3;
        this.causeDescription = str4;
        this.resolution = str5;
        this.cause = th;
    }
}
