package com.applovin.mediation.adapter.parameters;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MaxAdapterParameters {
    String getAdUnitId();

    @Nullable
    String getConsentString();

    Bundle getCustomParameters();

    Map<String, Object> getLocalExtraParameters();

    Bundle getServerParameters();

    @Nullable
    Boolean hasUserConsent();

    @Nullable
    @Deprecated
    Boolean isAgeRestrictedUser();

    @Nullable
    Boolean isDoNotSell();

    boolean isTesting();
}
