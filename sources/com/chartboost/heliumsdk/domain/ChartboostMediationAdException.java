package com.chartboost.heliumsdk.domain;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/domain/ChartboostMediationAdException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "chartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "(Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getChartboostMediationError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", PglCryptUtils.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationAdException extends Exception {
    private final ChartboostMediationError chartboostMediationError;

    public ChartboostMediationAdException(ChartboostMediationError chartboostMediationError) {
        Intrinsics.f(chartboostMediationError, "chartboostMediationError");
        this.chartboostMediationError = chartboostMediationError;
    }

    public final ChartboostMediationError getChartboostMediationError() {
        return this.chartboostMediationError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.chartboostMediationError.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.chartboostMediationError.toString();
    }
}
