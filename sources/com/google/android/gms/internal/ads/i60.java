package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i60 implements z50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceTierManager f15627a;

    public i60(DeviceTierManager deviceTierManager) {
        this.f15627a = deviceTierManager;
    }

    @Override // com.google.android.gms.internal.ads.z50
    public final void c(JSONObject jSONObject) {
        DeviceTierManager.AdvertisedMemoryTier advertisedMemoryTierFromValue;
        DeviceTierManager.AvailableProcessorTier availableProcessorTierFromValue;
        DeviceTierManager.AvailableMemoryTier availableMemoryTierFromValue;
        boolean zHas = jSONObject.has("AvailableMemoryTier");
        DeviceTierManager deviceTierManager = this.f15627a;
        if (zHas && (availableMemoryTierFromValue = DeviceTierManager.AvailableMemoryTier.fromValue(jSONObject.optInt("AvailableMemoryTier", -1))) != null) {
            deviceTierManager.setAvailableMemoryTier(availableMemoryTierFromValue);
        }
        if (jSONObject.has("AvailableProcessorTier") && (availableProcessorTierFromValue = DeviceTierManager.AvailableProcessorTier.fromValue(jSONObject.optInt("AvailableProcessorTier", -1))) != null) {
            deviceTierManager.setAvailableProcessorTier(availableProcessorTierFromValue);
        }
        if (!jSONObject.has("AdvertisedMemoryTier") || (advertisedMemoryTierFromValue = DeviceTierManager.AdvertisedMemoryTier.fromValue(jSONObject.optInt("AdvertisedMemoryTier", -1))) == null) {
            return;
        }
        deviceTierManager.setAdvertisedMemoryTier(advertisedMemoryTierFromValue);
    }
}
