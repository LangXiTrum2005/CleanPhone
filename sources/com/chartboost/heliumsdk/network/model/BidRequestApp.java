package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.utils.Environment;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BI\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB1\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0011¨\u0006\""}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestApp;", "", "()V", "seen1", "", "id", "", "bundle", "ver", "ext", "Lcom/chartboost/heliumsdk/network/model/BidRequestAppExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/BidRequestAppExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/BidRequestAppExt;)V", "getBundle$annotations", "getBundle", "()Ljava/lang/String;", "getExt$annotations", "getExt", "()Lcom/chartboost/heliumsdk/network/model/BidRequestAppExt;", "getId$annotations", "getId", "getVer$annotations", "getVer", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestApp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bundle;
    private final BidRequestAppExt ext;
    private final String id;
    private final String ver;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestApp$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestApp;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestApp> serializer() {
            return BidRequestApp$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestApp(int i2, @SerialName("id") String str, @SerialName("bundle") String str2, @SerialName("ver") String str3, @SerialName("ext") BidRequestAppExt bidRequestAppExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 7, BidRequestApp$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.bundle = str2;
        this.ver = str3;
        if ((i2 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = bidRequestAppExt;
        }
    }

    @SerialName("bundle")
    public static /* synthetic */ void getBundle$annotations() {
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("ver")
    public static /* synthetic */ void getVer$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestApp self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.bundle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.ver);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, BidRequestAppExt$$serializer.INSTANCE, self.ext);
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final BidRequestAppExt getExt() {
        return this.ext;
    }

    public final String getId() {
        return this.id;
    }

    public final String getVer() {
        return this.ver;
    }

    private BidRequestApp(String str, String str2, String str3, BidRequestAppExt bidRequestAppExt) {
        this.id = str;
        this.bundle = str2;
        this.ver = str3;
        this.ext = bidRequestAppExt;
    }

    public /* synthetic */ BidRequestApp(String str, String str2, String str3, BidRequestAppExt bidRequestAppExt, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : bidRequestAppExt);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BidRequestApp() {
        HeliumSdk.Companion companion = HeliumSdk.INSTANCE;
        String appId = companion.getAppId();
        Environment environment = Environment.INSTANCE;
        this(appId, environment.getAppBundle(), environment.getAppVersionName(), (companion.getGameEngineName() == null && companion.getGameEngineVersion() == null) ? null : new BidRequestAppExt());
    }
}
