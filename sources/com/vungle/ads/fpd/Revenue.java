package com.vungle.ads.fpd;

import com.vungle.ads.internal.util.RangeUtil;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 B2\u00020\u0001:\u0002ABBI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0005¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005H\u0007J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0005H\u0007J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0005H\u0007J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0005H\u0007J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0005H\u0007J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0005H\u0007J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0005H\u0007J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0005H\u0007J\u0010\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0005H\u0007J\u0010\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0005H\u0007J\u0018\u00103\u001a\u00020\u00002\u000e\u00104\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0007J\u0010\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0005H\u0007J\u000e\u00109\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J!\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@HÇ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000f\u0012\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000f\u0012\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u0012\u0012\u0004\b\u0011\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000f\u0012\u0004\b\u0013\u0010\r¨\u0006C"}, d2 = {"Lcom/vungle/ads/fpd/Revenue;", "", "seen1", "", "iaaRevenueUSD", "", "iapRevenueUSD", "totalRevenueUSD", "isUserAPurchaser", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getIaaRevenueUSD$annotations", "Ljava/lang/Float;", "getIapRevenueUSD$annotations", "isUserAPurchaser$annotations", "Ljava/lang/Boolean;", "getTotalRevenueUSD$annotations", "setEarningsByPlacement", "earningsByPlacement", "setIAARevenueUSD", "setIAPRevenueUSD", "setIsUserAPurchaser", "setIsUserASubscriber", "isUserASubscriber", "setLast30DaysMeanSpendUsd", "last30DaysMeanSpendUsd", "setLast30DaysMedianSpendUsd", "last30DaysMedianSpendUsd", "setLast30DaysPlacementFillRate", "last30DaysPlacementFillRate", "setLast30DaysTotalSpendUsd", "last30DaysTotalSpendUsd", "setLast30DaysUserLtvUsd", "last30DaysUserLtvUsd", "setLast30DaysUserPltvUsd", "last30DaysUserPltvUsd", "setLast7DaysMeanSpendUsd", "last7DaysMeanSpendUsd", "setLast7DaysMedianSpendUsd", "last7DaysMedianSpendUsd", "setLast7DaysPlacementFillRate", "last7DaysPlacementFillRate", "setLast7DaysTotalSpendUsd", "last7DaysTotalSpendUsd", "setLast7DaysUserLtvUsd", "last7DaysUserLtvUsd", "setLast7DaysUserPltvUsd", "last7DaysUserPltvUsd", "setTopNAdomain", "topNAdomain", "", "", "setTotalEarningsUsd", "totalEarningsUsd", "setTotalRevenueUSD", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final class Revenue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float iaaRevenueUSD;
    private Float iapRevenueUSD;
    private Boolean isUserAPurchaser;
    private Float totalRevenueUSD;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/Revenue$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Revenue;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Revenue> serializer() {
            return Revenue$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Revenue() {
    }

    @SerialName("iaa_revenue_usd")
    private static /* synthetic */ void getIaaRevenueUSD$annotations() {
    }

    @SerialName("iap_revenue_usd")
    private static /* synthetic */ void getIapRevenueUSD$annotations() {
    }

    @SerialName("total_revenue_usd")
    private static /* synthetic */ void getTotalRevenueUSD$annotations() {
    }

    @SerialName("is_user_a_purchaser")
    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Revenue self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.iaaRevenueUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.iaaRevenueUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iapRevenueUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, FloatSerializer.INSTANCE, self.iapRevenueUSD);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.totalRevenueUSD != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.totalRevenueUSD);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.isUserAPurchaser == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.isUserAPurchaser);
    }

    @Deprecated
    public final Revenue setEarningsByPlacement(float earningsByPlacement) {
        return this;
    }

    public final Revenue setIAARevenueUSD(float iaaRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, iaaRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iaaRevenueUSD = Float.valueOf(iaaRevenueUSD);
        }
        return this;
    }

    public final Revenue setIAPRevenueUSD(float iapRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, iapRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iapRevenueUSD = Float.valueOf(iapRevenueUSD);
        }
        return this;
    }

    public final Revenue setIsUserAPurchaser(boolean isUserAPurchaser) {
        this.isUserAPurchaser = Boolean.valueOf(isUserAPurchaser);
        return this;
    }

    @Deprecated
    public final Revenue setIsUserASubscriber(boolean isUserASubscriber) {
        return this;
    }

    @Deprecated
    public final Revenue setLast30DaysMeanSpendUsd(float last30DaysMeanSpendUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast30DaysMedianSpendUsd(float last30DaysMedianSpendUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast30DaysPlacementFillRate(float last30DaysPlacementFillRate) {
        return this;
    }

    @Deprecated
    public final Revenue setLast30DaysTotalSpendUsd(float last30DaysTotalSpendUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast30DaysUserLtvUsd(float last30DaysUserLtvUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast30DaysUserPltvUsd(float last30DaysUserPltvUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast7DaysMeanSpendUsd(float last7DaysMeanSpendUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast7DaysMedianSpendUsd(float last7DaysMedianSpendUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast7DaysPlacementFillRate(float last7DaysPlacementFillRate) {
        return this;
    }

    @Deprecated
    public final Revenue setLast7DaysTotalSpendUsd(float last7DaysTotalSpendUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast7DaysUserLtvUsd(float last7DaysUserLtvUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setLast7DaysUserPltvUsd(float last7DaysUserPltvUsd) {
        return this;
    }

    @Deprecated
    public final Revenue setTopNAdomain(List<String> topNAdomain) {
        return this;
    }

    @Deprecated
    public final Revenue setTotalEarningsUsd(float totalEarningsUsd) {
        return this;
    }

    public final Revenue setTotalRevenueUSD(float totalRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, totalRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalRevenueUSD = Float.valueOf(totalRevenueUSD);
        }
        return this;
    }

    @Deprecated
    public /* synthetic */ Revenue(int i2, @SerialName("iaa_revenue_usd") Float f, @SerialName("iap_revenue_usd") Float f2, @SerialName("total_revenue_usd") Float f3, @SerialName("is_user_a_purchaser") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.iaaRevenueUSD = null;
        } else {
            this.iaaRevenueUSD = f;
        }
        if ((i2 & 2) == 0) {
            this.iapRevenueUSD = null;
        } else {
            this.iapRevenueUSD = f2;
        }
        if ((i2 & 4) == 0) {
            this.totalRevenueUSD = null;
        } else {
            this.totalRevenueUSD = f3;
        }
        if ((i2 & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
    }
}
