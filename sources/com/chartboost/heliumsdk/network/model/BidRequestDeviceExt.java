package com.chartboost.heliumsdk.network.model;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB+\b\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017HÇ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceExt;", "", "()V", "seen1", "", "mCCMNC", "", "ifv", "appsetidscope", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAppsetidscope$annotations", "Ljava/lang/Integer;", "getIfv$annotations", "getMCCMNC$annotations", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestDeviceExt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer appsetidscope;
    private final String ifv;
    private final String mCCMNC;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestDeviceExt;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestDeviceExt> serializer() {
            return BidRequestDeviceExt$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestDeviceExt(int i2, @SerialName("mccmnc") String str, @SerialName("ifv") String str2, @SerialName("appsetidscope") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.mCCMNC = (i2 & 1) == 0 ? Environment.INSTANCE.getMccmnc() : str;
        if ((i2 & 2) == 0) {
            this.ifv = null;
        } else {
            this.ifv = str2;
        }
        if ((i2 & 4) == 0) {
            this.appsetidscope = Integer.valueOf(Environment.INSTANCE.getAppSetIdScope());
        } else {
            this.appsetidscope = num;
        }
    }

    @SerialName("appsetidscope")
    private static /* synthetic */ void getAppsetidscope$annotations() {
    }

    @SerialName("ifv")
    private static /* synthetic */ void getIfv$annotations() {
    }

    @SerialName("mccmnc")
    private static /* synthetic */ void getMCCMNC$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestDeviceExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.a(self.mCCMNC, Environment.INSTANCE.getMccmnc())) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.mCCMNC);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ifv != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ifv);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2)) {
            Integer num = self.appsetidscope;
            int appSetIdScope = Environment.INSTANCE.getAppSetIdScope();
            if (num != null && num.intValue() == appSetIdScope) {
                return;
            }
        }
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.appsetidscope);
    }

    private BidRequestDeviceExt(String str, String str2, Integer num) {
        this.mCCMNC = str;
        this.ifv = str2;
        this.appsetidscope = num;
    }

    public /* synthetic */ BidRequestDeviceExt(String str, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Environment.INSTANCE.getMccmnc() : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? Integer.valueOf(Environment.INSTANCE.getAppSetIdScope()) : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BidRequestDeviceExt() {
        Environment environment = Environment.INSTANCE;
        this((String) null, environment.getAppSetId(), Integer.valueOf(environment.getAppSetIdScope()), 1, (DefaultConstructorMarker) null);
    }
}
