package com.p004ironsource;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&Jr\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&J0\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/r5;", "", "", "errorCode", "", "errorReason", "", "a", "", "Lcom/ironsource/m5;", "newWaterfall", "", "Lcom/ironsource/g0;", "adInstancePayloads", "auctionId", "genericNotifications", "Lorg/json/JSONObject;", "genericParams", "configurations", "auctionTrial", "", "elapsedTime", "troubleshootErrorCode", "troubleshootErrorMessage", "errorMessage", IronSourceConstants.AUCTION_FALLBACK, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface r5 {
    void a(int errorCode, String errorReason);

    void a(int errorCode, String errorMessage, int auctionTrial, String auctionFallback, long elapsedTime);

    void a(List<m5> newWaterfall, Map<String, C3357g0> adInstancePayloads, String auctionId, m5 genericNotifications, JSONObject genericParams, JSONObject configurations, int auctionTrial, long elapsedTime, int troubleshootErrorCode, String troubleshootErrorMessage);
}
