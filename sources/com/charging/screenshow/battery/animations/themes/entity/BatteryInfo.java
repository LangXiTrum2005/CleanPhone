package com.charging.screenshow.battery.animations.themes.entity;

import com.applovin.impl.Z;
import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.metadata.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u0017\u0010#\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000bR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006¨\u0006'"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/entity/BatteryInfo;", "", "", "health", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "", "temperature", "F", h.f36614b, "()F", "voltage", i.f37957c, "chargeType", "c", "", "chargeTimeRemaining", "J", "getChargeTimeRemaining", "()J", "", "capacity", "I", "b", "()I", "status", g.f40227p, AppLovinEventTypes.USER_COMPLETED_LEVEL, f.j, "", d9.i.k0, "Z", "()Z", "isBatteryPresent", "chargingSpeed", "getChargingSpeed", "estimatedTimeText", "d", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BatteryInfo {
    private final int capacity;
    private final long chargeTimeRemaining;
    private final String chargeType;
    private final float chargingSpeed;
    private final String estimatedTimeText;
    private final String health;
    private final boolean isBatteryPresent;
    private final boolean isCharging;
    private final int level;
    private final String status;
    private final float temperature;
    private final float voltage;

    public BatteryInfo(String str, float f, float f2, String str2, long j, int i2, String str3, int i3, boolean z2, boolean z3, float f3, String str4) {
        this.health = str;
        this.temperature = f;
        this.voltage = f2;
        this.chargeType = str2;
        this.chargeTimeRemaining = j;
        this.capacity = i2;
        this.status = str3;
        this.level = i3;
        this.isCharging = z2;
        this.isBatteryPresent = z3;
        this.chargingSpeed = f3;
        this.estimatedTimeText = str4;
    }

    public static BatteryInfo a(BatteryInfo batteryInfo, String str, float f, float f2, String str2, long j, int i2, String str3, int i3, boolean z2, boolean z3, float f3, String str4, int i4) {
        if ((i4 & 1) != 0) {
            str = batteryInfo.health;
        }
        String health = str;
        float f4 = (i4 & 2) != 0 ? batteryInfo.temperature : f;
        float f5 = (i4 & 4) != 0 ? batteryInfo.voltage : f2;
        String chargeType = (i4 & 8) != 0 ? batteryInfo.chargeType : str2;
        long j2 = (i4 & 16) != 0 ? batteryInfo.chargeTimeRemaining : j;
        int i5 = (i4 & 32) != 0 ? batteryInfo.capacity : i2;
        String status = (i4 & 64) != 0 ? batteryInfo.status : str3;
        int i6 = (i4 & 128) != 0 ? batteryInfo.level : i3;
        boolean z4 = (i4 & 256) != 0 ? batteryInfo.isCharging : z2;
        boolean z5 = (i4 & 512) != 0 ? batteryInfo.isBatteryPresent : z3;
        float f6 = (i4 & 1024) != 0 ? batteryInfo.chargingSpeed : f3;
        String estimatedTimeText = (i4 & a.f25965n) != 0 ? batteryInfo.estimatedTimeText : str4;
        batteryInfo.getClass();
        Intrinsics.f(health, "health");
        Intrinsics.f(chargeType, "chargeType");
        Intrinsics.f(status, "status");
        Intrinsics.f(estimatedTimeText, "estimatedTimeText");
        return new BatteryInfo(health, f4, f5, chargeType, j2, i5, status, i6, z4, z5, f6, estimatedTimeText);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getChargeType() {
        return this.chargeType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEstimatedTimeText() {
        return this.estimatedTimeText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHealth() {
        return this.health;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatteryInfo)) {
            return false;
        }
        BatteryInfo batteryInfo = (BatteryInfo) obj;
        return Intrinsics.a(this.health, batteryInfo.health) && Float.compare(this.temperature, batteryInfo.temperature) == 0 && Float.compare(this.voltage, batteryInfo.voltage) == 0 && Intrinsics.a(this.chargeType, batteryInfo.chargeType) && this.chargeTimeRemaining == batteryInfo.chargeTimeRemaining && this.capacity == batteryInfo.capacity && Intrinsics.a(this.status, batteryInfo.status) && this.level == batteryInfo.level && this.isCharging == batteryInfo.isCharging && this.isBatteryPresent == batteryInfo.isBatteryPresent && Float.compare(this.chargingSpeed, batteryInfo.chargingSpeed) == 0 && Intrinsics.a(this.estimatedTimeText, batteryInfo.estimatedTimeText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getTemperature() {
        return this.temperature;
    }

    public final int hashCode() {
        return this.estimatedTimeText.hashCode() + ((Float.hashCode(this.chargingSpeed) + Z.e(this.isBatteryPresent, Z.e(this.isCharging, androidx.media3.extractor.text.ttml.a.a(this.level, androidx.datastore.preferences.protobuf.a.b(this.status, androidx.media3.extractor.text.ttml.a.a(this.capacity, androidx.media3.extractor.text.ttml.a.b(androidx.datastore.preferences.protobuf.a.b(this.chargeType, (Float.hashCode(this.voltage) + ((Float.hashCode(this.temperature) + (this.health.hashCode() * 31)) * 31)) * 31, 31), 31, this.chargeTimeRemaining), 31), 31), 31), 31), 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getVoltage() {
        return this.voltage;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatteryInfo(health=");
        sb.append(this.health);
        sb.append(", temperature=");
        sb.append(this.temperature);
        sb.append(", voltage=");
        sb.append(this.voltage);
        sb.append(", chargeType=");
        sb.append(this.chargeType);
        sb.append(", chargeTimeRemaining=");
        sb.append(this.chargeTimeRemaining);
        sb.append(", capacity=");
        sb.append(this.capacity);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", isCharging=");
        sb.append(this.isCharging);
        sb.append(", isBatteryPresent=");
        sb.append(this.isBatteryPresent);
        sb.append(", chargingSpeed=");
        sb.append(this.chargingSpeed);
        sb.append(", estimatedTimeText=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.estimatedTimeText, ')');
    }
}
