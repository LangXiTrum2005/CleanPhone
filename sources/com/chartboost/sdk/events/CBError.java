package com.chartboost.sdk.events;

import com.smartdigimkt.x.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/chartboost/sdk/events/CBError;", "", g.f39715A, "Ljava/lang/Exception;", "Lkotlin/Exception;", "getException", "()Ljava/lang/Exception;", "Lcom/chartboost/sdk/events/CacheError;", "Lcom/chartboost/sdk/events/ClickError;", "Lcom/chartboost/sdk/events/ShowError;", "Lcom/chartboost/sdk/events/StartError;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CBError {
    Exception getException();
}
