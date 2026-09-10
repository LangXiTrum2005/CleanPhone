package com.chartboost.heliumsdk.network;

import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints;", "", "()V", "BASE_DOMAIN", "", "<set-?>", "RTB_DOMAIN", "getRTB_DOMAIN", "()Ljava/lang/String;", "setRTB_DOMAIN$Helium_release", "(Ljava/lang/String;)V", "SDK_DOMAIN", "getSDK_DOMAIN", "setSDK_DOMAIN$Helium_release", "Rtb", "Sdk", "Version", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Endpoints {
    public static final String BASE_DOMAIN = "https://chartboost.com";
    public static final Endpoints INSTANCE = new Endpoints();
    private static String SDK_DOMAIN = "https://helium-sdk.chartboost.com";
    private static String RTB_DOMAIN = "https://helium-rtb.chartboost.com";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints$Rtb;", "", "version", "Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "(Ljava/lang/String;ILcom/chartboost/heliumsdk/network/Endpoints$Version;)V", dc.r, "", "getEndpoint", "()Ljava/lang/String;", "getVersion", "()Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "AUCTIONS", "Config", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Rtb {
        AUCTIONS(Version.V3);

        private final Version version;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints$Rtb$Config;", "", "version", "Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "(Ljava/lang/String;ILcom/chartboost/heliumsdk/network/Endpoints$Version;)V", dc.r, "", "getEndpoint", "()Ljava/lang/String;", "getVersion", "()Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "PLACEMENTS", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum Config {
            PLACEMENTS(Version.V4);

            private final Version version;

            Config(Version version) {
                this.version = version;
            }

            public final String getEndpoint() {
                StringBuilder sb = new StringBuilder();
                sb.append(Endpoints.INSTANCE.getRTB_DOMAIN());
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(this.version);
                sb.append("/config/");
                String lowerCase = name().toLowerCase(Locale.ROOT);
                Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
                return sb.toString();
            }

            public final Version getVersion() {
                return this.version;
            }
        }

        Rtb(Version version) {
            this.version = version;
        }

        public final String getEndpoint() {
            StringBuilder sb = new StringBuilder();
            sb.append(Endpoints.INSTANCE.getRTB_DOMAIN());
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(this.version);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            String lowerCase = name().toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            sb.append(lowerCase);
            return sb.toString();
        }

        public final Version getVersion() {
            return this.version;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints$Sdk;", "", "version", "Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "(Ljava/lang/String;ILcom/chartboost/heliumsdk/network/Endpoints$Version;)V", dc.r, "", "getEndpoint", "()Ljava/lang/String;", "getVersion", "()Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "SDK_INIT", "Event", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Sdk {
        SDK_INIT(Version.V1);

        private final Version version;

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BANNER_SIZE' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0019\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001b"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "", "version", "Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "(Ljava/lang/String;ILcom/chartboost/heliumsdk/network/Endpoints$Version;)V", dc.r, "", "getEndpoint", "()Ljava/lang/String;", "getVersion", "()Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "BANNER_SIZE", "ADLOAD", "CLICK", "EXPIRATION", "HELIUM_IMPRESSION", "INITIALIZATION", "LOAD", "PARTNER_IMPRESSION", "PREBID", "REWARD", "START_QUEUE", "END_QUEUE", "SHOW", "WINNER", "Companion", "EventEnumSetSerializer", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public static final class Event {
            private static final /* synthetic */ Event[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final Event ADLOAD;
            public static final Event BANNER_SIZE;
            public static final Event CLICK;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Event END_QUEUE;
            public static final Event EXPIRATION;
            public static final Event HELIUM_IMPRESSION;
            public static final Event INITIALIZATION;
            public static final Event LOAD;
            public static final Event PARTNER_IMPRESSION;
            public static final Event PREBID;
            public static final Event REWARD;
            public static final Event SHOW;
            public static final Event START_QUEUE;
            public static final Event WINNER;
            private final Version version;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
                    return Event.$cachedSerializer$delegate;
                }

                public final KSerializer<Event> serializer() {
                    return (KSerializer) get$cachedSerializer$delegate().getX();
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event$EventEnumSetSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/util/EnumSet;", "Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class EventEnumSetSerializer implements KSerializer<EnumSet<Event>> {
                public static final EventEnumSetSerializer INSTANCE = new EventEnumSetSerializer();
                private static final SerialDescriptor descriptor = JsonArray.INSTANCE.serializer().getDescriptor();

                private EventEnumSetSerializer() {
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.DeserializationStrategy
                public EnumSet<Event> deserialize(Decoder decoder) {
                    Intrinsics.f(decoder, "decoder");
                    JsonArray jsonArray = (JsonArray) decoder.decodeSerializableValue(JsonArray.INSTANCE.serializer());
                    ArrayList arrayList = new ArrayList(CollectionsKt.n(jsonArray, 10));
                    Iterator<JsonElement> it = jsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Event.valueOf(JsonElementKt.getJsonPrimitive(it.next()).getContent()));
                    }
                    EnumSet<Event> enumSetNoneOf = EnumSet.noneOf(Event.class);
                    CollectionsKt.g0(arrayList, enumSetNoneOf);
                    return enumSetNoneOf;
                }

                @Override // kotlinx.serialization.SerializationStrategy
                public void serialize(Encoder encoder, EnumSet<Event> value) {
                    Intrinsics.f(encoder, "encoder");
                    Intrinsics.f(value, "value");
                    ArrayList arrayList = new ArrayList(CollectionsKt.n(value, 10));
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList.add(JsonElementKt.JsonPrimitive(((Event) it.next()).name()));
                    }
                    encoder.encodeSerializableValue(JsonArray.INSTANCE.serializer(), new JsonArray(arrayList));
                }
            }

            private static final /* synthetic */ Event[] $values() {
                return new Event[]{BANNER_SIZE, ADLOAD, CLICK, EXPIRATION, HELIUM_IMPRESSION, INITIALIZATION, LOAD, PARTNER_IMPRESSION, PREBID, REWARD, START_QUEUE, END_QUEUE, SHOW, WINNER};
            }

            static {
                Version version = Version.V1;
                BANNER_SIZE = new Event("BANNER_SIZE", 0, version);
                Version version2 = Version.V2;
                ADLOAD = new Event("ADLOAD", 1, version2);
                CLICK = new Event("CLICK", 2, version2);
                EXPIRATION = new Event("EXPIRATION", 3, version);
                HELIUM_IMPRESSION = new Event("HELIUM_IMPRESSION", 4, version);
                INITIALIZATION = new Event("INITIALIZATION", 5, version);
                LOAD = new Event("LOAD", 6, version2);
                PARTNER_IMPRESSION = new Event("PARTNER_IMPRESSION", 7, version);
                PREBID = new Event("PREBID", 8, version);
                REWARD = new Event("REWARD", 9, version2);
                START_QUEUE = new Event("START_QUEUE", 10, version);
                END_QUEUE = new Event("END_QUEUE", 11, version);
                SHOW = new Event("SHOW", 12, version);
                WINNER = new Event("WINNER", 13, Version.V3);
                $VALUES = $values();
                INSTANCE = new Companion(null);
                $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<KSerializer<Object>>() { // from class: com.chartboost.heliumsdk.network.Endpoints$Sdk$Event$Companion$$cachedSerializer$delegate$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KSerializer<Object> invoke() {
                        return EnumsKt.createSimpleEnumSerializer("com.chartboost.heliumsdk.network.Endpoints.Sdk.Event", Endpoints.Sdk.Event.values());
                    }
                });
            }

            private Event(String str, int i2, Version version) {
                super(str, i2);
                this.version = version;
            }

            public static Event valueOf(String str) {
                return (Event) Enum.valueOf(Event.class, str);
            }

            public static Event[] values() {
                return (Event[]) $VALUES.clone();
            }

            public final String getEndpoint() {
                StringBuilder sb = new StringBuilder();
                sb.append(Endpoints.INSTANCE.getSDK_DOMAIN());
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(this.version);
                sb.append("/event/");
                String lowerCase = name().toLowerCase(Locale.ROOT);
                Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
                return sb.toString();
            }

            public final Version getVersion() {
                return this.version;
            }
        }

        Sdk(Version version) {
            this.version = version;
        }

        public final String getEndpoint() {
            StringBuilder sb = new StringBuilder();
            sb.append(Endpoints.INSTANCE.getSDK_DOMAIN());
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(this.version);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            String lowerCase = name().toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            sb.append(lowerCase);
            return sb.toString();
        }

        public final Version getVersion() {
            return this.version;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/chartboost/heliumsdk/network/Endpoints$Version;", "", "(Ljava/lang/String;I)V", "toString", "", "V0", "V1", "V2", "V3", "V4", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Version {
        V0,
        V1,
        V2,
        V3,
        V4;

        @Override // java.lang.Enum
        public String toString() {
            String lowerCase = name().toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return lowerCase;
        }
    }

    private Endpoints() {
    }

    public final String getRTB_DOMAIN() {
        return RTB_DOMAIN;
    }

    public final String getSDK_DOMAIN() {
        return SDK_DOMAIN;
    }

    public final void setRTB_DOMAIN$Helium_release(String str) {
        Intrinsics.f(str, "<set-?>");
        RTB_DOMAIN = str;
    }

    public final void setSDK_DOMAIN$Helium_release(String str) {
        Intrinsics.f(str, "<set-?>");
        SDK_DOMAIN = str;
    }
}
