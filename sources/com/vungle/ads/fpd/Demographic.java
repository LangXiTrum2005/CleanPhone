package com.vungle.ads.fpd;

import com.thinkup.core.api.TUCustomRuleKeys;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0005¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003H\u0007J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0007J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\n\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\f\u0010\t¨\u0006 "}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "seen1", "", "ageRange", TUCustomRuleKeys.GENDER, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getAgeRange$annotations", "Ljava/lang/Integer;", "getGender$annotations", "setAgeRange", "age", "setGender", "Lcom/vungle/ads/fpd/LiftoffGender;", "setLengthOfResidence", "lengthOfResidence", "setMedianHomeValueUSD", "homeValue", "setMonthlyHousingCosts", "housingCost", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final class Demographic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer ageRange;
    private Integer gender;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Demographic;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Demographic> serializer() {
            return Demographic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Demographic() {
    }

    @SerialName("age_range")
    private static /* synthetic */ void getAgeRange$annotations() {
    }

    @SerialName(TUCustomRuleKeys.GENDER)
    private static /* synthetic */ void getGender$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Demographic self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ageRange != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.ageRange);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.gender == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.gender);
    }

    public final Demographic setAgeRange(int age) {
        this.ageRange = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    public final Demographic setGender(LiftoffGender gender) {
        Intrinsics.f(gender, "gender");
        this.gender = Integer.valueOf(gender.getValue());
        return this;
    }

    @Deprecated
    public final Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @Deprecated
    public final Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @Deprecated
    public final Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }

    @Deprecated
    public /* synthetic */ Demographic(int i2, @SerialName("age_range") Integer num, @SerialName(TUCustomRuleKeys.GENDER) Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i2 & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }
}
