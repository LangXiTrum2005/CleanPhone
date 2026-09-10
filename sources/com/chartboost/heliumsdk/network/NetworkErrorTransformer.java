package com.chartboost.heliumsdk.network;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.qt;
import kotlin.Metadata;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/chartboost/heliumsdk/network/NetworkErrorTransformer;", "", "()V", "HTTP_NO_RESPONSE", "", "transform", "Lcom/chartboost/heliumsdk/network/NetworkError;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, qt.f26623n, "Lretrofit2/Response;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NetworkErrorTransformer {
    private static final int HTTP_NO_RESPONSE = -1;
    public static final NetworkErrorTransformer INSTANCE = new NetworkErrorTransformer();

    private NetworkErrorTransformer() {
    }

    public final <T> NetworkError transform(Response<T> response) {
        ChartboostMediationError chartboostMediationError;
        if (response == null) {
            return new NetworkError(-1, ChartboostMediationError.CM_INTERNAL_ERROR);
        }
        int iCode = response.code();
        T tBody = response.body();
        if (iCode == 200 || iCode == 204) {
            chartboostMediationError = null;
        } else if (iCode == -1) {
            chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_INVALID_BID_RESPONSE;
        } else {
            chartboostMediationError = ((iCode < 200 || iCode >= 300) && tBody != null) ? ChartboostMediationError.CM_AD_SERVER_ERROR : ChartboostMediationError.CM_LOAD_FAILURE_INVALID_BID_RESPONSE;
        }
        if (chartboostMediationError != null) {
            return new NetworkError(iCode, chartboostMediationError);
        }
        return null;
    }
}
