package com.google.android.gms.ads.nonagon.devicetier;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class DeviceTierManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11341b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f11342c = new AtomicReference(AdvertisedMemoryTier.UNKNOWN);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f11343d = new AtomicReference(AvailableMemoryTier.UNKNOWN);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f11344e = new AtomicReference(AvailableProcessorTier.UNKNOWN);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AdvertisedMemoryTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        VERY_LOW(3),
        LOW(4),
        MID(5),
        MID_PLUS(6),
        HIGH(7),
        VERY_HIGH(8),
        EXTREME_HIGH(9);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11346a;

        AdvertisedMemoryTier(int i10) {
            this.f11346a = i10;
        }

        @Nullable
        public static AdvertisedMemoryTier fromValue(int i10) {
            for (AdvertisedMemoryTier advertisedMemoryTier : values()) {
                if (advertisedMemoryTier.f11346a == i10) {
                    return advertisedMemoryTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.f11346a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AvailableMemoryTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        VERY_LOW(3),
        LOW(4),
        MID(5),
        MID_PLUS(6),
        HIGH(7),
        VERY_HIGH(8),
        EXTREME_HIGH(9);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11348a;

        AvailableMemoryTier(int i10) {
            this.f11348a = i10;
        }

        @Nullable
        public static AvailableMemoryTier fromValue(int i10) {
            for (AvailableMemoryTier availableMemoryTier : values()) {
                if (availableMemoryTier.f11348a == i10) {
                    return availableMemoryTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.f11348a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AvailableProcessorTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        LOW(3),
        MID(4),
        MID_PLUS(5),
        HIGH(6),
        EXTREME_HIGH(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11350a;

        AvailableProcessorTier(int i10) {
            this.f11350a = i10;
        }

        @Nullable
        public static AvailableProcessorTier fromValue(int i10) {
            for (AvailableProcessorTier availableProcessorTier : values()) {
                if (availableProcessorTier.f11350a == i10) {
                    return availableProcessorTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.f11350a;
        }
    }

    public DeviceTierManager(Context context) {
        this.f11340a = context;
    }

    @NonNull
    public AdvertisedMemoryTier getAdvertisedMemoryTier() {
        return (AdvertisedMemoryTier) this.f11342c.get();
    }

    @NonNull
    public AvailableMemoryTier getAvailableMemoryTier() {
        return (AvailableMemoryTier) this.f11343d.get();
    }

    @NonNull
    public AvailableProcessorTier getAvailableProcessorTier() {
        return (AvailableProcessorTier) this.f11344e.get();
    }

    public void initialize() {
        AtomicBoolean atomicBoolean = this.f11341b;
        if (atomicBoolean.get()) {
            return;
        }
        AdvertisedMemoryTier advertisedMemoryTierFromValue = AdvertisedMemoryTier.fromValue(this.f11340a.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0).getInt("advertised_memory_tier", AdvertisedMemoryTier.UNKNOWN.getValue()));
        if (advertisedMemoryTierFromValue != null) {
            this.f11342c.set(advertisedMemoryTierFromValue);
        }
        atomicBoolean.set(true);
    }

    public synchronized void setAdvertisedMemoryTier(@NonNull AdvertisedMemoryTier advertisedMemoryTier) {
        if (advertisedMemoryTier == null) {
            return;
        }
        this.f11342c.set(advertisedMemoryTier);
        this.f11340a.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0).edit().putInt("advertised_memory_tier", advertisedMemoryTier.getValue()).apply();
    }

    public void setAvailableMemoryTier(@NonNull AvailableMemoryTier availableMemoryTier) {
        if (availableMemoryTier != null) {
            this.f11343d.set(availableMemoryTier);
        }
    }

    public void setAvailableProcessorTier(@NonNull AvailableProcessorTier availableProcessorTier) {
        if (availableProcessorTier != null) {
            this.f11344e.set(availableProcessorTier);
        }
    }
}
