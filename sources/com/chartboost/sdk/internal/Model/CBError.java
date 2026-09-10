package com.chartboost.sdk.internal.Model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0015\u0016\u0017\u0018B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "b", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "getType", "()Lcom/chartboost/sdk/internal/Model/CBError$Type;", "type", "", "c", "Ljava/lang/String;", "getErrorDesc", "()Ljava/lang/String;", "errorDesc", "Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "getImpressionError", "()Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "impressionError", "<init>", "(Lcom/chartboost/sdk/internal/Model/CBError$Type;Ljava/lang/String;)V", "Click", "Impression", "Internal", "Type", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class CBError extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Type type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String errorDesc;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Click;", "", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "(Ljava/lang/String;I)V", "URI_INVALID", "URI_UNRECOGNIZED", "LOAD_NOT_FINISHED", "INTERNAL", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Click implements Type {
        URI_INVALID,
        URI_UNRECOGNIZED,
        LOAD_NOT_FINISHED,
        INTERNAL;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15767c = EnumEntriesKt.a(a());

        public static EnumEntries<Click> getEntries() {
            return f15767c;
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "(Ljava/lang/String;I)V", "INTERNAL", "INTERNET_UNAVAILABLE", "TOO_MANY_CONNECTIONS", "WRONG_ORIENTATION", "FIRST_SESSION_INTERSTITIALS_DISABLED", "NETWORK_FAILURE", "NO_AD_FOUND", "SESSION_NOT_STARTED", "IMPRESSION_ALREADY_VISIBLE", "NO_HOST_ACTIVITY", "USER_CANCELLATION", "INVALID_LOCATION", "VIDEO_UNAVAILABLE", "VIDEO_ID_MISSING", "ERROR_PLAYING_VIDEO", "INVALID_RESPONSE", "ASSETS_DOWNLOAD_FAILURE", "ERROR_CREATING_VIEW", "ERROR_DISPLAYING_VIEW", "INCOMPATIBLE_API_VERSION", "ERROR_LOADING_WEB_VIEW", "ASSET_PREFETCH_IN_PROGRESS", "ACTIVITY_MISSING_IN_MANIFEST", "EMPTY_LOCAL_VIDEO_LIST", "END_POINT_DISABLED", "HARDWARE_ACCELERATION_DISABLED", "PENDING_IMPRESSION_ERROR", "VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION", "ASSET_MISSING", "WEB_VIEW_PAGE_LOAD_TIMEOUT", "WEB_VIEW_CLIENT_RECEIVED_ERROR", "INTERNET_UNAVAILABLE_AT_SHOW", "INTERNET_UNAVAILABLE_AT_CACHE", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Impression implements Type {
        INTERNAL,
        INTERNET_UNAVAILABLE,
        TOO_MANY_CONNECTIONS,
        WRONG_ORIENTATION,
        FIRST_SESSION_INTERSTITIALS_DISABLED,
        NETWORK_FAILURE,
        NO_AD_FOUND,
        SESSION_NOT_STARTED,
        IMPRESSION_ALREADY_VISIBLE,
        NO_HOST_ACTIVITY,
        USER_CANCELLATION,
        INVALID_LOCATION,
        VIDEO_UNAVAILABLE,
        VIDEO_ID_MISSING,
        ERROR_PLAYING_VIDEO,
        INVALID_RESPONSE,
        ASSETS_DOWNLOAD_FAILURE,
        ERROR_CREATING_VIEW,
        ERROR_DISPLAYING_VIEW,
        INCOMPATIBLE_API_VERSION,
        ERROR_LOADING_WEB_VIEW,
        ASSET_PREFETCH_IN_PROGRESS,
        ACTIVITY_MISSING_IN_MANIFEST,
        EMPTY_LOCAL_VIDEO_LIST,
        END_POINT_DISABLED,
        HARDWARE_ACCELERATION_DISABLED,
        PENDING_IMPRESSION_ERROR,
        VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION,
        ASSET_MISSING,
        WEB_VIEW_PAGE_LOAD_TIMEOUT,
        WEB_VIEW_CLIENT_RECEIVED_ERROR,
        INTERNET_UNAVAILABLE_AT_SHOW,
        INTERNET_UNAVAILABLE_AT_CACHE;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15769c = EnumEntriesKt.a(a());

        public static EnumEntries<Impression> getEntries() {
            return f15769c;
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Internal;", "", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "(Ljava/lang/String;I)V", "MISCELLANEOUS", "INTERNET_UNAVAILABLE", "INVALID_RESPONSE", "UNEXPECTED_RESPONSE", "NETWORK_FAILURE", "HTTP_NOT_FOUND", "HTTP_NOT_OK", "UNSUPPORTED_OS_VERSION", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Internal implements Type {
        MISCELLANEOUS,
        INTERNET_UNAVAILABLE,
        INVALID_RESPONSE,
        UNEXPECTED_RESPONSE,
        NETWORK_FAILURE,
        HTTP_NOT_FOUND,
        HTTP_NOT_OK,
        UNSUPPORTED_OS_VERSION;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15771c = EnumEntriesKt.a(a());

        public static EnumEntries<Internal> getEntries() {
            return f15771c;
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Type;", "", "name", "", "getName", "()Ljava/lang/String;", "Lcom/chartboost/sdk/internal/Model/CBError$Click;", "Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "Lcom/chartboost/sdk/internal/Model/CBError$Internal;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Type {
        String getName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBError(Type type, String errorDesc) {
        super(errorDesc);
        Intrinsics.f(type, "type");
        Intrinsics.f(errorDesc, "errorDesc");
        this.type = type;
        this.errorDesc = errorDesc;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final Impression getImpressionError() {
        Type type = this.type;
        if (type == Internal.INTERNET_UNAVAILABLE) {
            return Impression.INTERNET_UNAVAILABLE;
        }
        if (type == Internal.HTTP_NOT_FOUND) {
            return Impression.NO_AD_FOUND;
        }
        if (type == Internal.INVALID_RESPONSE) {
            return Impression.INVALID_RESPONSE;
        }
        return type == Internal.NETWORK_FAILURE ? Impression.NETWORK_FAILURE : Impression.INTERNAL;
    }

    public final Type getType() {
        return this.type;
    }
}
