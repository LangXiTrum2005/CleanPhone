package com.vungle.ads.internal.model;

import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.ne;
import com.p004ironsource.x4;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0003HIJB\u0083\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0014J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0086\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J!\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GHÇ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010!R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010!R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001e¨\u0006K"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode;", "", "seen1", "", ne.t, "", "model", ne.f26257F, ne.O0, ne.f26256E, "w", h.f36614b, "ua", "ifa", "lmt", "ext", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "getCarrier", "()Ljava/lang/String;", "getExt", "()Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "setExt", "(Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "getH", "()I", "setH", "(I)V", "getIfa", "setIfa", "(Ljava/lang/String;)V", "getLmt", "()Ljava/lang/Integer;", "setLmt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMake", "getModel", "getOs", "getOsv", "getUa", "setUa", "getW", "setW", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)Lcom/vungle/ads/internal/model/DeviceNode;", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "VungleExt", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final /* data */ class DeviceNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String carrier;
    private VungleExt ext;
    private int h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;
    private int w;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeviceNode> serializer() {
            return DeviceNode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bm\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0094\u00012\u00020\u0001:\u0004\u0093\u0001\u0094\u0001B\u0091\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 Bý\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010!J\t\u0010p\u001a\u00020\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010s\u001a\u00020\nHÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010WJ\u000b\u0010{\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010WJ\u0010\u0010}\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010WJ\u0010\u0010~\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010WJ\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010-J\n\u0010\u0080\u0001\u001a\u00020\nHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0088\u0002\u0010\u0086\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0003\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u00020\u00052\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u008b\u0001\u001a\u00020\u0007HÖ\u0001J(\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00020\u00002\b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001HÇ\u0001R&\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R(\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u00100\u0012\u0004\b+\u0010#\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010#\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010#\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b;\u0010#\u001a\u0004\b<\u0010%\"\u0004\b=\u0010'R&\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b>\u0010#\u001a\u0004\b?\u0010%\"\u0004\b@\u0010'R&\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bA\u0010#\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R&\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bD\u0010#\u001a\u0004\bE\u0010%\"\u0004\bF\u0010'R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010#\u001a\u0004\b\u0004\u0010H\"\u0004\bI\u0010JR$\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bK\u0010#\u001a\u0004\b\u0016\u0010H\"\u0004\bL\u0010JR$\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bM\u0010#\u001a\u0004\b\u0014\u0010H\"\u0004\bN\u0010JR&\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bO\u0010#\u001a\u0004\bP\u0010%\"\u0004\bQ\u0010'R&\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bR\u0010#\u001a\u0004\bS\u0010%\"\u0004\bT\u0010'R(\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010Z\u0012\u0004\bU\u0010#\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010Z\u0012\u0004\b[\u0010#\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR(\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010Z\u0012\u0004\b^\u0010#\u001a\u0004\b_\u0010W\"\u0004\b`\u0010YR$\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\ba\u0010#\u001a\u0004\bb\u00108\"\u0004\bc\u0010:R(\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010Z\u0012\u0004\bd\u0010#\u001a\u0004\be\u0010W\"\u0004\bf\u0010YR$\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bg\u0010#\u001a\u0004\bh\u00108\"\u0004\bi\u0010:R&\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bj\u0010#\u001a\u0004\bk\u0010%\"\u0004\bl\u0010'R$\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bm\u0010#\u001a\u0004\bn\u00103\"\u0004\bo\u00105¨\u0006\u0095\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "", "seen1", "", "isGooglePlayServicesAvailable", "", "appSetId", "", "appSetIdScope", d9.i.f24746Y, "", "batteryState", "batterySaverEnabled", d9.i.t, "connectionTypeDetail", "locale", "language", "timeZone", "volumeLevel", "soundEnabled", "isTv", d9.i.i0, "isSideloadEnabled", "gaid", "amazonAdvertisingId", "sit", "", "oit", "ort", "obt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getAmazonAdvertisingId$annotations", "()V", "getAmazonAdvertisingId", "()Ljava/lang/String;", "setAmazonAdvertisingId", "(Ljava/lang/String;)V", "getAppSetId$annotations", "getAppSetId", "setAppSetId", "getAppSetIdScope$annotations", "getAppSetIdScope", "()Ljava/lang/Integer;", "setAppSetIdScope", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBatteryLevel$annotations", "getBatteryLevel", "()F", "setBatteryLevel", "(F)V", "getBatterySaverEnabled$annotations", "getBatterySaverEnabled", "()I", "setBatterySaverEnabled", "(I)V", "getBatteryState$annotations", "getBatteryState", "setBatteryState", "getConnectionType$annotations", "getConnectionType", "setConnectionType", "getConnectionTypeDetail$annotations", "getConnectionTypeDetail", "setConnectionTypeDetail", "getGaid$annotations", "getGaid", "setGaid", "isGooglePlayServicesAvailable$annotations", "()Z", "setGooglePlayServicesAvailable", "(Z)V", "isSideloadEnabled$annotations", "setSideloadEnabled", "isTv$annotations", "setTv", "getLanguage$annotations", "getLanguage", "setLanguage", "getLocale$annotations", "getLocale", "setLocale", "getObt$annotations", "getObt", "()Ljava/lang/Long;", "setObt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOit$annotations", "getOit", "setOit", "getOrt$annotations", "getOrt", "setOrt", "getSdCardAvailable$annotations", "getSdCardAvailable", "setSdCardAvailable", "getSit$annotations", "getSit", "setSit", "getSoundEnabled$annotations", "getSoundEnabled", "setSoundEnabled", "getTimeZone$annotations", "getTimeZone", "setTimeZone", "getVolumeLevel$annotations", "getVolumeLevel", "setVolumeLevel", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class VungleExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String amazonAdvertisingId;
        private String appSetId;
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private String gaid;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private Long obt;
        private Long oit;
        private Long ort;
        private int sdCardAvailable;
        private Long sit;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<VungleExt> serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ VungleExt copy$default(VungleExt vungleExt, boolean z2, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z3, int i4, boolean z4, String str8, String str9, Long l2, Long l3, Long l4, Long l5, int i5, Object obj) {
            Long l6;
            Long l7;
            boolean z5 = (i5 & 1) != 0 ? vungleExt.isGooglePlayServicesAvailable : z2;
            String str10 = (i5 & 2) != 0 ? vungleExt.appSetId : str;
            Integer num2 = (i5 & 4) != 0 ? vungleExt.appSetIdScope : num;
            float f3 = (i5 & 8) != 0 ? vungleExt.batteryLevel : f;
            String str11 = (i5 & 16) != 0 ? vungleExt.batteryState : str2;
            int i6 = (i5 & 32) != 0 ? vungleExt.batterySaverEnabled : i2;
            String str12 = (i5 & 64) != 0 ? vungleExt.connectionType : str3;
            String str13 = (i5 & 128) != 0 ? vungleExt.connectionTypeDetail : str4;
            String str14 = (i5 & 256) != 0 ? vungleExt.locale : str5;
            String str15 = (i5 & 512) != 0 ? vungleExt.language : str6;
            String str16 = (i5 & 1024) != 0 ? vungleExt.timeZone : str7;
            float f4 = (i5 & a.f25965n) != 0 ? vungleExt.volumeLevel : f2;
            int i7 = (i5 & 4096) != 0 ? vungleExt.soundEnabled : i3;
            boolean z6 = (i5 & Segment.SIZE) != 0 ? vungleExt.isTv : z3;
            boolean z7 = z5;
            int i8 = (i5 & 16384) != 0 ? vungleExt.sdCardAvailable : i4;
            boolean z8 = (i5 & 32768) != 0 ? vungleExt.isSideloadEnabled : z4;
            String str17 = (i5 & 65536) != 0 ? vungleExt.gaid : str8;
            String str18 = (i5 & 131072) != 0 ? vungleExt.amazonAdvertisingId : str9;
            Long l8 = (i5 & 262144) != 0 ? vungleExt.sit : l2;
            Long l9 = (i5 & 524288) != 0 ? vungleExt.oit : l3;
            Long l10 = (i5 & 1048576) != 0 ? vungleExt.ort : l4;
            if ((i5 & 2097152) != 0) {
                l7 = l10;
                l6 = vungleExt.obt;
            } else {
                l6 = l5;
                l7 = l10;
            }
            return vungleExt.copy(z7, str10, num2, f3, str11, i6, str12, str13, str14, str15, str16, f4, i7, z6, i8, z8, str17, str18, l8, l9, l7, l6);
        }

        @SerialName("amazon_advertising_id")
        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        @SerialName("app_set_id")
        public static /* synthetic */ void getAppSetId$annotations() {
        }

        @SerialName("app_set_id_scope")
        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        @SerialName("battery_level")
        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        @SerialName("battery_saver_enabled")
        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        @SerialName("battery_state")
        public static /* synthetic */ void getBatteryState$annotations() {
        }

        @SerialName("connection_type")
        public static /* synthetic */ void getConnectionType$annotations() {
        }

        @SerialName("connection_type_detail")
        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        @SerialName("gaid")
        public static /* synthetic */ void getGaid$annotations() {
        }

        @SerialName("language")
        public static /* synthetic */ void getLanguage$annotations() {
        }

        @SerialName("locale")
        public static /* synthetic */ void getLocale$annotations() {
        }

        @SerialName("obt")
        public static /* synthetic */ void getObt$annotations() {
        }

        @SerialName("oit")
        public static /* synthetic */ void getOit$annotations() {
        }

        @SerialName("ort")
        public static /* synthetic */ void getOrt$annotations() {
        }

        @SerialName("sd_card_available")
        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        @SerialName("sit")
        public static /* synthetic */ void getSit$annotations() {
        }

        @SerialName("sound_enabled")
        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        @SerialName("time_zone")
        public static /* synthetic */ void getTimeZone$annotations() {
        }

        @SerialName("volume_level")
        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        @SerialName("is_google_play_services_available")
        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        @SerialName("is_sideload_enabled")
        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        @SerialName("is_tv")
        public static /* synthetic */ void isTv$annotations() {
        }

        @JvmStatic
        public static final void write$Self(VungleExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.encodeBooleanElement(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.appSetId != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.appSetId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.appSetIdScope != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.appSetIdScope);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !Float.valueOf(self.batteryLevel).equals(Float.valueOf(0.0f))) {
                output.encodeFloatElement(serialDesc, 3, self.batteryLevel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.batteryState != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.batteryState);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.encodeIntElement(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.connectionType != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.connectionType);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.connectionTypeDetail);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.locale != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.locale);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.language != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.language);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.timeZone != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.timeZone);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || !Float.valueOf(self.volumeLevel).equals(Float.valueOf(0.0f))) {
                output.encodeFloatElement(serialDesc, 11, self.volumeLevel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 12) || self.soundEnabled != 1) {
                output.encodeIntElement(serialDesc, 12, self.soundEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 13) || self.isTv) {
                output.encodeBooleanElement(serialDesc, 13, self.isTv);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.encodeIntElement(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 15) || self.isSideloadEnabled) {
                output.encodeBooleanElement(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 16) || self.gaid != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.gaid);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 17) || self.amazonAdvertisingId != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.amazonAdvertisingId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 18) || self.sit != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, LongSerializer.INSTANCE, self.sit);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 19) || self.oit != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, LongSerializer.INSTANCE, self.oit);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 20) || self.ort != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, LongSerializer.INSTANCE, self.ort);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 21) && self.obt == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 21, LongSerializer.INSTANCE, self.obt);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getIsTv() {
            return this.isTv;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getIsSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getGaid() {
            return this.gaid;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Long getSit() {
            return this.sit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Long getOit() {
            return this.oit;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getOrt() {
            return this.ort;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getObt() {
            return this.obt;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBatteryState() {
            return this.batteryState;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getConnectionType() {
            return this.connectionType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        public final VungleExt copy(boolean isGooglePlayServicesAvailable, String appSetId, Integer appSetIdScope, float batteryLevel, String batteryState, int batterySaverEnabled, String connectionType, String connectionTypeDetail, String locale, String language, String timeZone, float volumeLevel, int soundEnabled, boolean isTv, int sdCardAvailable, boolean isSideloadEnabled, String gaid, String amazonAdvertisingId, Long sit, Long oit, Long ort, Long obt) {
            return new VungleExt(isGooglePlayServicesAvailable, appSetId, appSetIdScope, batteryLevel, batteryState, batterySaverEnabled, connectionType, connectionTypeDetail, locale, language, timeZone, volumeLevel, soundEnabled, isTv, sdCardAvailable, isSideloadEnabled, gaid, amazonAdvertisingId, sit, oit, ort, obt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) other;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && Intrinsics.a(this.appSetId, vungleExt.appSetId) && Intrinsics.a(this.appSetIdScope, vungleExt.appSetIdScope) && Float.valueOf(this.batteryLevel).equals(Float.valueOf(vungleExt.batteryLevel)) && Intrinsics.a(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && Intrinsics.a(this.connectionType, vungleExt.connectionType) && Intrinsics.a(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && Intrinsics.a(this.locale, vungleExt.locale) && Intrinsics.a(this.language, vungleExt.language) && Intrinsics.a(this.timeZone, vungleExt.timeZone) && Float.valueOf(this.volumeLevel).equals(Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && Intrinsics.a(this.gaid, vungleExt.gaid) && Intrinsics.a(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && Intrinsics.a(this.sit, vungleExt.sit) && Intrinsics.a(this.oit, vungleExt.oit) && Intrinsics.a(this.ort, vungleExt.ort) && Intrinsics.a(this.obt, vungleExt.obt);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Long getObt() {
            return this.obt;
        }

        public final Long getOit() {
            return this.oit;
        }

        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v24, types: [int] */
        /* JADX WARN: Type inference failed for: r0v41 */
        /* JADX WARN: Type inference failed for: r0v42 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r3v32, types: [int] */
        /* JADX WARN: Type inference failed for: r3v35 */
        /* JADX WARN: Type inference failed for: r3v43 */
        public int hashCode() {
            boolean z2 = this.isGooglePlayServicesAvailable;
            ?? r0 = z2;
            if (z2) {
                r0 = 1;
            }
            int i2 = r0 * 31;
            String str = this.appSetId;
            int iHashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (Float.hashCode(this.batteryLevel) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
            String str2 = this.batteryState;
            int iA = androidx.media3.extractor.text.ttml.a.a(this.batterySaverEnabled, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.connectionType;
            int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iA2 = androidx.media3.extractor.text.ttml.a.a(this.soundEnabled, (Float.hashCode(this.volumeLevel) + ((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31, 31);
            boolean z3 = this.isTv;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            int iA3 = androidx.media3.extractor.text.ttml.a.a(this.sdCardAvailable, (iA2 + r3) * 31, 31);
            boolean z4 = this.isSideloadEnabled;
            int i3 = (iA3 + (z4 ? 1 : z4)) * 31;
            String str8 = this.gaid;
            int iHashCode7 = (i3 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l2 = this.sit;
            int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.oit;
            int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.ort;
            int iHashCode11 = (iHashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.obt;
            return iHashCode11 + (l5 != null ? l5.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f) {
            this.batteryLevel = f;
        }

        public final void setBatterySaverEnabled(int i2) {
            this.batterySaverEnabled = i2;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z2) {
            this.isGooglePlayServicesAvailable = z2;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setObt(Long l2) {
            this.obt = l2;
        }

        public final void setOit(Long l2) {
            this.oit = l2;
        }

        public final void setOrt(Long l2) {
            this.ort = l2;
        }

        public final void setSdCardAvailable(int i2) {
            this.sdCardAvailable = i2;
        }

        public final void setSideloadEnabled(boolean z2) {
            this.isSideloadEnabled = z2;
        }

        public final void setSit(Long l2) {
            this.sit = l2;
        }

        public final void setSoundEnabled(int i2) {
            this.soundEnabled = i2;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z2) {
            this.isTv = z2;
        }

        public final void setVolumeLevel(float f) {
            this.volumeLevel = f;
        }

        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ')';
        }

        @Deprecated
        public /* synthetic */ VungleExt(int i2, @SerialName("is_google_play_services_available") boolean z2, @SerialName("app_set_id") String str, @SerialName("app_set_id_scope") Integer num, @SerialName("battery_level") float f, @SerialName("battery_state") String str2, @SerialName("battery_saver_enabled") int i3, @SerialName("connection_type") String str3, @SerialName("connection_type_detail") String str4, @SerialName("locale") String str5, @SerialName("language") String str6, @SerialName("time_zone") String str7, @SerialName("volume_level") float f2, @SerialName("sound_enabled") int i4, @SerialName("is_tv") boolean z3, @SerialName("sd_card_available") int i5, @SerialName("is_sideload_enabled") boolean z4, @SerialName("gaid") String str8, @SerialName("amazon_advertising_id") String str9, @SerialName("sit") Long l2, @SerialName("oit") Long l3, @SerialName("ort") Long l4, @SerialName("obt") Long l5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i2 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z2;
            }
            if ((i2 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i2 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i2 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f;
            }
            if ((i2 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i2 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i3;
            }
            if ((i2 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i2 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i2 & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i2 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i2 & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i2 & a.f25965n) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f2;
            }
            if ((i2 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i4;
            }
            if ((i2 & Segment.SIZE) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z3;
            }
            if ((i2 & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i5;
            }
            if ((32768 & i2) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z4;
            }
            if ((65536 & i2) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i2) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i2) == 0) {
                this.sit = null;
            } else {
                this.sit = l2;
            }
            if ((524288 & i2) == 0) {
                this.oit = null;
            } else {
                this.oit = l3;
            }
            if ((1048576 & i2) == 0) {
                this.ort = null;
            } else {
                this.ort = l4;
            }
            if ((i2 & 2097152) == 0) {
                this.obt = null;
            } else {
                this.obt = l5;
            }
        }

        public VungleExt(boolean z2, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z3, int i4, boolean z4, String str8, String str9, Long l2, Long l3, Long l4, Long l5) {
            this.isGooglePlayServicesAvailable = z2;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f;
            this.batteryState = str2;
            this.batterySaverEnabled = i2;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f2;
            this.soundEnabled = i3;
            this.isTv = z3;
            this.sdCardAvailable = i4;
            this.isSideloadEnabled = z4;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l2;
            this.oit = l3;
            this.ort = l4;
            this.obt = l5;
        }

        public /* synthetic */ VungleExt(boolean z2, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z3, int i4, boolean z4, String str8, String str9, Long l2, Long l3, Long l4, Long l5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? false : z2, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? null : num, (i5 & 8) != 0 ? 0.0f : f, (i5 & 16) != 0 ? null : str2, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? null : str3, (i5 & 128) != 0 ? null : str4, (i5 & 256) != 0 ? null : str5, (i5 & 512) != 0 ? null : str6, (i5 & 1024) != 0 ? null : str7, (i5 & a.f25965n) == 0 ? f2 : 0.0f, (i5 & 4096) != 0 ? 1 : i3, (i5 & Segment.SIZE) != 0 ? false : z3, (i5 & 16384) == 0 ? i4 : 1, (32768 & i5) != 0 ? false : z4, (i5 & 65536) != 0 ? null : str8, (i5 & 131072) != 0 ? null : str9, (i5 & 262144) != 0 ? null : l2, (i5 & 524288) != 0 ? null : l3, (i5 & 1048576) != 0 ? null : l4, (i5 & 2097152) != 0 ? null : l5);
        }
    }

    @Deprecated
    public /* synthetic */ DeviceNode(int i2, String str, String str2, String str3, String str4, String str5, int i3, int i4, String str6, String str7, Integer num, VungleExt vungleExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (119 != (i2 & 119)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 119, DeviceNode$$serializer.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i2 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i3;
        this.h = i4;
        if ((i2 & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i2 & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i2 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i2 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    public static /* synthetic */ DeviceNode copy$default(DeviceNode deviceNode, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, VungleExt vungleExt, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = deviceNode.make;
        }
        if ((i4 & 2) != 0) {
            str2 = deviceNode.model;
        }
        if ((i4 & 4) != 0) {
            str3 = deviceNode.osv;
        }
        if ((i4 & 8) != 0) {
            str4 = deviceNode.carrier;
        }
        if ((i4 & 16) != 0) {
            str5 = deviceNode.os;
        }
        if ((i4 & 32) != 0) {
            i2 = deviceNode.w;
        }
        if ((i4 & 64) != 0) {
            i3 = deviceNode.h;
        }
        if ((i4 & 128) != 0) {
            str6 = deviceNode.ua;
        }
        if ((i4 & 256) != 0) {
            str7 = deviceNode.ifa;
        }
        if ((i4 & 512) != 0) {
            num = deviceNode.lmt;
        }
        if ((i4 & 1024) != 0) {
            vungleExt = deviceNode.ext;
        }
        Integer num2 = num;
        VungleExt vungleExt2 = vungleExt;
        String str8 = str6;
        String str9 = str7;
        int i5 = i2;
        int i6 = i3;
        String str10 = str5;
        String str11 = str3;
        return deviceNode.copy(str, str2, str11, str4, str10, i5, i6, str8, str9, num2, vungleExt2);
    }

    @JvmStatic
    public static final void write$Self(DeviceNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.make);
        output.encodeStringElement(serialDesc, 1, self.model);
        output.encodeStringElement(serialDesc, 2, self.osv);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.carrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.carrier);
        }
        output.encodeStringElement(serialDesc, 4, self.os);
        output.encodeIntElement(serialDesc, 5, self.w);
        output.encodeIntElement(serialDesc, 6, self.h);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.ua != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.ua);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.ifa != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.ifa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.lmt != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.lmt);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, DeviceNode$VungleExt$$serializer.INSTANCE, self.ext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VungleExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    public final DeviceNode copy(String make, String model, String osv, String carrier, String os, int w2, int h2, String ua, String ifa, Integer lmt, VungleExt ext) {
        Intrinsics.f(make, "make");
        Intrinsics.f(model, "model");
        Intrinsics.f(osv, "osv");
        Intrinsics.f(os, "os");
        return new DeviceNode(make, model, osv, carrier, os, w2, h2, ua, ifa, lmt, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) other;
        return Intrinsics.a(this.make, deviceNode.make) && Intrinsics.a(this.model, deviceNode.model) && Intrinsics.a(this.osv, deviceNode.osv) && Intrinsics.a(this.carrier, deviceNode.carrier) && Intrinsics.a(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && Intrinsics.a(this.ua, deviceNode.ua) && Intrinsics.a(this.ifa, deviceNode.ifa) && Intrinsics.a(this.lmt, deviceNode.lmt) && Intrinsics.a(this.ext, deviceNode.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    public final String getIfa() {
        return this.ifa;
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

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.osv, androidx.datastore.preferences.protobuf.a.b(this.model, this.make.hashCode() * 31, 31), 31);
        String str = this.carrier;
        int iA = androidx.media3.extractor.text.ttml.a.a(this.h, androidx.media3.extractor.text.ttml.a.a(this.w, androidx.datastore.preferences.protobuf.a.b(this.os, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        String str2 = this.ua;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode3 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public final void setExt(VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i2) {
        this.h = i2;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public final void setW(int i2) {
        this.w = i2;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public DeviceNode(String make, String model, String osv, String str, String os, int i2, int i3, String str2, String str3, Integer num, VungleExt vungleExt) {
        Intrinsics.f(make, "make");
        Intrinsics.f(model, "model");
        Intrinsics.f(osv, "osv");
        Intrinsics.f(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.w = i2;
        this.h = i3;
        this.ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, VungleExt vungleExt, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? null : str4, str5, i2, i3, (i4 & 128) != 0 ? null : str6, (i4 & 256) != 0 ? null : str7, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : vungleExt);
    }
}
