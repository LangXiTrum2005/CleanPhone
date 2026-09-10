package com.chartboost.sdk.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15304c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15305e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f15306h;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\b\u0017B\u001f\u0012\n\u0010\u0016\u001a\u00060\rj\u0002`\u0014\u0012\n\u0010\u0018\u001a\u00060\rj\u0002`\u0014¢\u0006\u0004\b\u0019\u0010\u001aB3\b\u0011\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\n\u0010\u0016\u001a\u00060\rj\u0002`\u0014\u0012\n\u0010\u0018\u001a\u00060\rj\u0002`\u0014\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00060\rj\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u000fR\u001b\u0010\u0018\u001a\u00060\rj\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000f¨\u0006 "}, d2 = {"Lcom/chartboost/sdk/impl/ug$a;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/ug$a;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", com.p004ironsource.x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/chartboost/sdk/tracking/Pixels;", "I", "height", "b", "width", "<init>", "(II)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
    @Serializable
    public static final /* data */ class a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int height;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int width;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.ug$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<a> serializer() {
                return C0176a.f15309a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(int i2, int i3) {
            this.height = i2;
            this.width = i3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.height == aVar.height && this.width == aVar.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.width) + (Integer.hashCode(this.height) * 31);
        }

        public String toString() {
            return androidx.datastore.preferences.protobuf.a.e(this.height, this.width, "AdSize(height=", ", width=", ")");
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.ug$a$a, reason: collision with other inner class name */
        public static final class C0176a implements GeneratedSerializer {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0176a f15309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f15310b;

            static {
                C0176a c0176a = new C0176a();
                f15309a = c0176a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.tracking.TrackAd.AdSize", c0176a, 2);
                pluginGeneratedSerialDescriptor.addElement("height", false);
                pluginGeneratedSerialDescriptor.addElement("width", false);
                f15310b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a deserialize(Decoder decoder) {
                int iDecodeIntElement;
                int iDecodeIntElement2;
                int i2;
                Intrinsics.f(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
                if (compositeDecoderBeginStructure.decodeSequentially()) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                    i2 = 3;
                } else {
                    boolean z2 = true;
                    iDecodeIntElement = 0;
                    int iDecodeIntElement3 = 0;
                    int i3 = 0;
                    while (z2) {
                        int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                        if (iDecodeElementIndex == -1) {
                            z2 = false;
                        } else if (iDecodeElementIndex == 0) {
                            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                            i3 |= 1;
                        } else {
                            if (iDecodeElementIndex != 1) {
                                throw new UnknownFieldException(iDecodeElementIndex);
                            }
                            iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                            i3 |= 2;
                        }
                    }
                    iDecodeIntElement2 = iDecodeIntElement3;
                    i2 = i3;
                }
                compositeDecoderBeginStructure.endStructure(descriptor);
                return new a(i2, iDecodeIntElement, iDecodeIntElement2, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] childSerializers() {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{intSerializer, intSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public SerialDescriptor getDescriptor() {
                return f15310b;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(Encoder encoder, a value) {
                Intrinsics.f(encoder, "encoder");
                Intrinsics.f(value, "value");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
                a.a(value, compositeEncoderBeginStructure, descriptor);
                compositeEncoderBeginStructure.endStructure(descriptor);
            }
        }

        public static final /* synthetic */ void a(a self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.height);
            output.encodeIntElement(serialDesc, 1, self.width);
        }

        public /* synthetic */ a(int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i2 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i2, 3, C0176a.f15309a.getDescriptor());
            }
            this.height = i3;
            this.width = i4;
        }
    }

    public ug(String location, String adType, String str, String adCreativeId, String adCreativeType, String adMarkup, String templateUrl, a aVar) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(adCreativeId, "adCreativeId");
        Intrinsics.f(adCreativeType, "adCreativeType");
        Intrinsics.f(adMarkup, "adMarkup");
        Intrinsics.f(templateUrl, "templateUrl");
        this.f15302a = location;
        this.f15303b = adType;
        this.f15304c = str;
        this.d = adCreativeId;
        this.f15305e = adCreativeType;
        this.f = adMarkup;
        this.g = templateUrl;
        this.f15306h = aVar;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f15304c;
    }

    public final a c() {
        return this.f15306h;
    }

    public final String d() {
        return this.f15303b;
    }

    public final String e() {
        return this.f15302a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return Intrinsics.a(this.f15302a, ugVar.f15302a) && Intrinsics.a(this.f15303b, ugVar.f15303b) && Intrinsics.a(this.f15304c, ugVar.f15304c) && Intrinsics.a(this.d, ugVar.d) && Intrinsics.a(this.f15305e, ugVar.f15305e) && Intrinsics.a(this.f, ugVar.f) && Intrinsics.a(this.g, ugVar.g) && Intrinsics.a(this.f15306h, ugVar.f15306h);
    }

    public final String f() {
        String str = this.f15304c;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length > 20) {
            length = 20;
        }
        String strSubstring = str.substring(0, length);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String g() {
        return this.g;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f15303b, this.f15302a.hashCode() * 31, 31);
        String str = this.f15304c;
        int iB2 = androidx.datastore.preferences.protobuf.a.b(this.g, androidx.datastore.preferences.protobuf.a.b(this.f, androidx.datastore.preferences.protobuf.a.b(this.f15305e, androidx.datastore.preferences.protobuf.a.b(this.d, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
        a aVar = this.f15306h;
        return iB2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.f15302a;
        String str2 = this.f15303b;
        String strF = f();
        String str3 = this.d;
        String str4 = this.f15305e;
        String str5 = this.f;
        String str6 = this.g;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("TrackAd: location: ", str, " adType: ", str2, " adImpressionId: ");
        androidx.media3.extractor.text.ttml.a.C(sbQ, strF, " adCreativeId: ", str3, " adCreativeType: ");
        androidx.media3.extractor.text.ttml.a.C(sbQ, str4, " adMarkup: ", str5, " templateUrl: ");
        sbQ.append(str6);
        return sbQ.toString();
    }

    public /* synthetic */ ug(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? null : aVar);
    }
}
