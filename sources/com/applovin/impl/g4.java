package com.applovin.impl;

import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface g4 {
    h4 getAdEventTracker();

    @Nullable
    String getOpenMeasurementContentUrl();

    String getOpenMeasurementCustomReferenceData();

    List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources();

    boolean isOpenMeasurementEnabled();
}
