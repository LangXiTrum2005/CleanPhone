package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.impromptu, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lsvd/impromptu;", "", "Lsvd/marial;", "attabal", "Lsvd/marial;", "batterySignals", "Lsvd/beachfront;", "saneness", "Lsvd/beachfront;", "browserSignals", "Lsvd/cutely;", "dern", "Lsvd/cutely;", "memorySignals", "Lsvd/taiyuan;", "wireman", "Lsvd/taiyuan;", "deviceTierSignals", "Lsvd/apical;", "marial", "Lsvd/apical;", "networkSignals", "Lsvd/impassible;", "beachfront", "Lsvd/impassible;", "playStoreSignals", "", "competently", "Ljava/lang/String;", "buildName", "", "impromptu", "Ljava/lang/Long;", "remainingDataPartitionSpaceKilobytes", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DeviceSignals {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("battery")
    public final BatterySignals batterySignals;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("play_store")
    public final PlayStoreSignals playStoreSignals;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("build")
    public String buildName;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("android_mem_info")
    public MemorySignals memorySignals;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("remaining_data_partition_space")
    public Long remainingDataPartitionSpaceKilobytes;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("network")
    public final NetworkSignals networkSignals;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("browser")
    public final BrowserSignals browserSignals;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("device_tier")
    public final DeviceTierSignals deviceTierSignals;

    public DeviceSignals() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceSignals)) {
            return false;
        }
        DeviceSignals deviceSignals = (DeviceSignals) obj;
        return Intrinsics.wireman(this.batterySignals, deviceSignals.batterySignals) && Intrinsics.wireman(this.browserSignals, deviceSignals.browserSignals) && Intrinsics.wireman(this.memorySignals, deviceSignals.memorySignals) && Intrinsics.wireman(this.deviceTierSignals, deviceSignals.deviceTierSignals) && Intrinsics.wireman(this.networkSignals, deviceSignals.networkSignals) && Intrinsics.wireman(this.playStoreSignals, deviceSignals.playStoreSignals) && Intrinsics.wireman(this.buildName, deviceSignals.buildName) && Intrinsics.wireman(this.remainingDataPartitionSpaceKilobytes, deviceSignals.remainingDataPartitionSpaceKilobytes);
    }

    public final int hashCode() {
        int iHashCode = (this.playStoreSignals.hashCode() + ((this.networkSignals.hashCode() + ((this.deviceTierSignals.hashCode() + ((this.memorySignals.hashCode() + ((this.browserSignals.hashCode() + (this.batterySignals.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.buildName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.remainingDataPartitionSpaceKilobytes;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSignals(batterySignals=" + this.batterySignals + ", browserSignals=" + this.browserSignals + ", memorySignals=" + this.memorySignals + ", deviceTierSignals=" + this.deviceTierSignals + ", networkSignals=" + this.networkSignals + ", playStoreSignals=" + this.playStoreSignals + ", buildName=" + this.buildName + ", remainingDataPartitionSpaceKilobytes=" + this.remainingDataPartitionSpaceKilobytes + ")";
    }

    public DeviceSignals(BatterySignals batterySignals, BrowserSignals browserSignals, MemorySignals memorySignals, DeviceTierSignals deviceTierSignals, NetworkSignals networkSignals, PlayStoreSignals playStoreSignals, String str, Long l) {
        Intrinsics.checkNotNullParameter(batterySignals, "batterySignals");
        Intrinsics.checkNotNullParameter(browserSignals, "browserSignals");
        Intrinsics.checkNotNullParameter(memorySignals, "memorySignals");
        Intrinsics.checkNotNullParameter(deviceTierSignals, "deviceTierSignals");
        Intrinsics.checkNotNullParameter(networkSignals, "networkSignals");
        Intrinsics.checkNotNullParameter(playStoreSignals, "playStoreSignals");
        this.batterySignals = batterySignals;
        this.browserSignals = browserSignals;
        this.memorySignals = memorySignals;
        this.deviceTierSignals = deviceTierSignals;
        this.networkSignals = networkSignals;
        this.playStoreSignals = playStoreSignals;
        this.buildName = str;
        this.remainingDataPartitionSpaceKilobytes = l;
    }

    public /* synthetic */ DeviceSignals(int i) {
        this(new BatterySignals(0), new BrowserSignals(0), new MemorySignals(0), new DeviceTierSignals(0), new NetworkSignals(0), new PlayStoreSignals(0), null, null);
    }
}
