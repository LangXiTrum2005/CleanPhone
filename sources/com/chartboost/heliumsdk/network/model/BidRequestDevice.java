package com.chartboost.heliumsdk.network.model;

import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.utils.Environment;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.ne;
import com.smartdigimkt.m3.h;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 P2\u00020\u0001:\u0002OPB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004BÓ\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dB¯\u0001\b\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001eJ!\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NHÇ\u0001R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010%R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b&\u0010 \u001a\u0004\b'\u0010(R\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010 \u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010 \u001a\u0004\b1\u0010%R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010 \u001a\u0004\b3\u0010\"R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010 \u001a\u0004\b5\u0010\"R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b6\u0010 \u001a\u0004\b7\u0010(R\u001c\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010 \u001a\u0004\b9\u0010\"R\u001c\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010 \u001a\u0004\b;\u0010\"R\u001c\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010 \u001a\u0004\b=\u0010\"R\u001c\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010 \u001a\u0004\b?\u0010\"R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010C\u0012\u0004\b@\u0010 \u001a\u0004\bA\u0010BR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010 \u001a\u0004\bE\u0010\"R\u001c\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010 \u001a\u0004\bG\u0010%¨\u0006Q"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestDevice;", "", "size", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "(Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;)V", "seen1", "", "userAgent", "", "lmt", "deviceType", ne.t, "model", "operatingSystem", "operatingSystemVersion", "height", "width", "pxRatio", "", "language", ne.O0, d9.i.t, "ifa", "geo", "Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceGeo;", "ext", "Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceGeo;Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceGeo;Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceExt;)V", "getCarrier$annotations", "()V", "getCarrier", "()Ljava/lang/String;", "getConnectionType$annotations", "getConnectionType", "()I", "getDeviceType$annotations", "getDeviceType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExt$annotations", "getExt", "()Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceExt;", "getGeo$annotations", "getGeo", "()Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceGeo;", "getHeight$annotations", "getHeight", "getIfa$annotations", "getIfa", "getLanguage$annotations", "getLanguage", "getLmt$annotations", "getLmt", "getMake$annotations", "getMake", "getModel$annotations", "getModel", "getOperatingSystem$annotations", "getOperatingSystem", "getOperatingSystemVersion$annotations", "getOperatingSystemVersion", "getPxRatio$annotations", "getPxRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getUserAgent$annotations", "getUserAgent", "getWidth$annotations", "getWidth", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestDevice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String carrier;
    private final int connectionType;
    private final Integer deviceType;
    private final BidRequestDeviceExt ext;
    private final BidRequestDeviceGeo geo;
    private final int height;
    private final String ifa;
    private final String language;
    private final Integer lmt;
    private final String make;
    private final String model;
    private final String operatingSystem;
    private final String operatingSystemVersion;
    private final Float pxRatio;
    private final String userAgent;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestDevice$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestDevice;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestDevice> serializer() {
            return BidRequestDevice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestDevice(int i2, @SerialName("ua") String str, @SerialName("lmt") Integer num, @SerialName("devicetype") Integer num2, @SerialName(ne.t) String str2, @SerialName("model") String str3, @SerialName(ne.f26256E) String str4, @SerialName(ne.f26257F) String str5, @SerialName(h.f36614b) int i3, @SerialName("w") int i4, @SerialName("pxratio") Float f, @SerialName("language") String str6, @SerialName(ne.O0) String str7, @SerialName(dc.f24783e) int i5, @SerialName("ifa") String str8, @SerialName("geo") BidRequestDeviceGeo bidRequestDeviceGeo, @SerialName("ext") BidRequestDeviceExt bidRequestDeviceExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (384 != (i2 & 384)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 384, BidRequestDevice$$serializer.INSTANCE.getDescriptor());
        }
        this.userAgent = (i2 & 1) == 0 ? Environment.INSTANCE.getUserAgent() : str;
        if ((i2 & 2) == 0) {
            this.lmt = Environment.INSTANCE.getLmt();
        } else {
            this.lmt = num;
        }
        if ((i2 & 4) == 0) {
            this.deviceType = Environment.INSTANCE.getDeviceType();
        } else {
            this.deviceType = num2;
        }
        if ((i2 & 8) == 0) {
            this.make = Environment.INSTANCE.getManufacturer();
        } else {
            this.make = str2;
        }
        if ((i2 & 16) == 0) {
            this.model = Environment.INSTANCE.getModel();
        } else {
            this.model = str3;
        }
        if ((i2 & 32) == 0) {
            this.operatingSystem = Environment.INSTANCE.getOperatingSystem();
        } else {
            this.operatingSystem = str4;
        }
        if ((i2 & 64) == 0) {
            this.operatingSystemVersion = Environment.INSTANCE.getOperatingSystemVersion();
        } else {
            this.operatingSystemVersion = str5;
        }
        this.height = i3;
        this.width = i4;
        if ((i2 & 512) == 0) {
            this.pxRatio = Environment.INSTANCE.getPxRatio();
        } else {
            this.pxRatio = f;
        }
        if ((i2 & 1024) == 0) {
            this.language = Environment.INSTANCE.getLanguage();
        } else {
            this.language = str6;
        }
        if ((i2 & a.f25965n) == 0) {
            this.carrier = Environment.INSTANCE.getCarrierName();
        } else {
            this.carrier = str7;
        }
        this.connectionType = (i2 & 4096) == 0 ? Environment.INSTANCE.getConnectionType() : i5;
        this.ifa = (i2 & Segment.SIZE) == 0 ? Environment.INSTANCE.getIfa() : str8;
        this.geo = (i2 & 16384) == 0 ? new BidRequestDeviceGeo(0, 1, (DefaultConstructorMarker) null) : bidRequestDeviceGeo;
        this.ext = (i2 & 32768) == 0 ? new BidRequestDeviceExt() : bidRequestDeviceExt;
    }

    @SerialName(ne.O0)
    public static /* synthetic */ void getCarrier$annotations() {
    }

    @SerialName(dc.f24783e)
    public static /* synthetic */ void getConnectionType$annotations() {
    }

    @SerialName("devicetype")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("geo")
    public static /* synthetic */ void getGeo$annotations() {
    }

    @SerialName(h.f36614b)
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("ifa")
    public static /* synthetic */ void getIfa$annotations() {
    }

    @SerialName("language")
    public static /* synthetic */ void getLanguage$annotations() {
    }

    @SerialName("lmt")
    public static /* synthetic */ void getLmt$annotations() {
    }

    @SerialName(ne.t)
    public static /* synthetic */ void getMake$annotations() {
    }

    @SerialName("model")
    public static /* synthetic */ void getModel$annotations() {
    }

    @SerialName(ne.f26256E)
    public static /* synthetic */ void getOperatingSystem$annotations() {
    }

    @SerialName(ne.f26257F)
    public static /* synthetic */ void getOperatingSystemVersion$annotations() {
    }

    @SerialName("pxratio")
    public static /* synthetic */ void getPxRatio$annotations() {
    }

    @SerialName("ua")
    public static /* synthetic */ void getUserAgent$annotations() {
    }

    @SerialName("w")
    public static /* synthetic */ void getWidth$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestDevice self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.a(self.userAgent, Environment.INSTANCE.getUserAgent())) {
            output.encodeStringElement(serialDesc, 0, self.userAgent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.a(self.lmt, Environment.INSTANCE.getLmt())) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.lmt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.a(self.deviceType, Environment.INSTANCE.getDeviceType())) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.deviceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.a(self.make, Environment.INSTANCE.getManufacturer())) {
            output.encodeStringElement(serialDesc, 3, self.make);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.a(self.model, Environment.INSTANCE.getModel())) {
            output.encodeStringElement(serialDesc, 4, self.model);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.a(self.operatingSystem, Environment.INSTANCE.getOperatingSystem())) {
            output.encodeStringElement(serialDesc, 5, self.operatingSystem);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.a(self.operatingSystemVersion, Environment.INSTANCE.getOperatingSystemVersion())) {
            output.encodeStringElement(serialDesc, 6, self.operatingSystemVersion);
        }
        output.encodeIntElement(serialDesc, 7, self.height);
        output.encodeIntElement(serialDesc, 8, self.width);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.a(self.pxRatio, Environment.INSTANCE.getPxRatio())) {
            output.encodeNullableSerializableElement(serialDesc, 9, FloatSerializer.INSTANCE, self.pxRatio);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !Intrinsics.a(self.language, Environment.INSTANCE.getLanguage())) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.a(self.carrier, Environment.INSTANCE.getCarrierName())) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.carrier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.connectionType != Environment.INSTANCE.getConnectionType()) {
            output.encodeIntElement(serialDesc, 12, self.connectionType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || !Intrinsics.a(self.ifa, Environment.INSTANCE.getIfa())) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.ifa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || !Intrinsics.a(self.geo, new BidRequestDeviceGeo(0, 1, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 14, BidRequestDeviceGeo$$serializer.INSTANCE, self.geo);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && Intrinsics.a(self.ext, new BidRequestDeviceExt())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 15, BidRequestDeviceExt$$serializer.INSTANCE, self.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final int getConnectionType() {
        return this.connectionType;
    }

    public final Integer getDeviceType() {
        return this.deviceType;
    }

    public final BidRequestDeviceExt getExt() {
        return this.ext;
    }

    public final BidRequestDeviceGeo getGeo() {
        return this.geo;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public final String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    public final Float getPxRatio() {
        return this.pxRatio;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final int getWidth() {
        return this.width;
    }

    private BidRequestDevice(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, int i2, int i3, Float f, String str6, String str7, int i4, String str8, BidRequestDeviceGeo bidRequestDeviceGeo, BidRequestDeviceExt bidRequestDeviceExt) {
        this.userAgent = str;
        this.lmt = num;
        this.deviceType = num2;
        this.make = str2;
        this.model = str3;
        this.operatingSystem = str4;
        this.operatingSystemVersion = str5;
        this.height = i2;
        this.width = i3;
        this.pxRatio = f;
        this.language = str6;
        this.carrier = str7;
        this.connectionType = i4;
        this.ifa = str8;
        this.geo = bidRequestDeviceGeo;
        this.ext = bidRequestDeviceExt;
    }

    public /* synthetic */ BidRequestDevice(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, int i2, int i3, Float f, String str6, String str7, int i4, String str8, BidRequestDeviceGeo bidRequestDeviceGeo, BidRequestDeviceExt bidRequestDeviceExt, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? Environment.INSTANCE.getUserAgent() : str, (i5 & 2) != 0 ? Environment.INSTANCE.getLmt() : num, (i5 & 4) != 0 ? Environment.INSTANCE.getDeviceType() : num2, (i5 & 8) != 0 ? Environment.INSTANCE.getManufacturer() : str2, (i5 & 16) != 0 ? Environment.INSTANCE.getModel() : str3, (i5 & 32) != 0 ? Environment.INSTANCE.getOperatingSystem() : str4, (i5 & 64) != 0 ? Environment.INSTANCE.getOperatingSystemVersion() : str5, i2, i3, (i5 & 512) != 0 ? Environment.INSTANCE.getPxRatio() : f, (i5 & 1024) != 0 ? Environment.INSTANCE.getLanguage() : str6, (i5 & a.f25965n) != 0 ? Environment.INSTANCE.getCarrierName() : str7, (i5 & 4096) != 0 ? Environment.INSTANCE.getConnectionType() : i4, (i5 & Segment.SIZE) != 0 ? Environment.INSTANCE.getIfa() : str8, (i5 & 16384) != 0 ? new BidRequestDeviceGeo(0, 1, (DefaultConstructorMarker) null) : bidRequestDeviceGeo, (i5 & 32768) != 0 ? new BidRequestDeviceExt() : bidRequestDeviceExt);
    }

    public BidRequestDevice(HeliumBannerAd.HeliumBannerSize heliumBannerSize) {
        this((String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, heliumBannerSize != null ? heliumBannerSize.getHeight() : Environment.INSTANCE.getDisplayHeight(), heliumBannerSize != null ? heliumBannerSize.getWidth() : Environment.INSTANCE.getDisplayWidth(), (Float) null, (String) null, (String) null, 0, Environment.INSTANCE.getIfa(), (BidRequestDeviceGeo) null, (BidRequestDeviceExt) null, 56959, (DefaultConstructorMarker) null);
    }
}
