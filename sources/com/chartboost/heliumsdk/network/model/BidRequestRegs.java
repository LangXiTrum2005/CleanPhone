package com.chartboost.heliumsdk.network.model;

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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB\u0017\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestRegs;", "", "isCoppa", "", "gdpr", "", "ccpaConsent", "(Ljava/lang/Boolean;ILjava/lang/Boolean;)V", "seen1", "coppa", "ext", "Lcom/chartboost/heliumsdk/network/model/BidRequestRegsExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/chartboost/heliumsdk/network/model/BidRequestRegsExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/chartboost/heliumsdk/network/model/BidRequestRegsExt;)V", "getCoppa$annotations", "()V", "getCoppa", "()I", "getExt$annotations", "getExt", "()Lcom/chartboost/heliumsdk/network/model/BidRequestRegsExt;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestRegs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int coppa;
    private final BidRequestRegsExt ext;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestRegs$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestRegs;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestRegs> serializer() {
            return BidRequestRegs$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestRegs(int i2, @SerialName("coppa") int i3, @SerialName("ext") BidRequestRegsExt bidRequestRegsExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 3, BidRequestRegs$$serializer.INSTANCE.getDescriptor());
        }
        this.coppa = i3;
        this.ext = bidRequestRegsExt;
    }

    @SerialName("coppa")
    public static /* synthetic */ void getCoppa$annotations() {
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestRegs self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.coppa);
        output.encodeSerializableElement(serialDesc, 1, BidRequestRegsExt$$serializer.INSTANCE, self.ext);
    }

    public final int getCoppa() {
        return this.coppa;
    }

    public final BidRequestRegsExt getExt() {
        return this.ext;
    }

    private BidRequestRegs(int i2, BidRequestRegsExt bidRequestRegsExt) {
        this.coppa = i2;
        this.ext = bidRequestRegsExt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BidRequestRegs(Boolean bool, int i2, Boolean bool2) {
        boolean zA = Intrinsics.a(bool, Boolean.TRUE);
        this(zA ? 1 : 0, new BidRequestRegsExt(i2, bool2));
    }
}
