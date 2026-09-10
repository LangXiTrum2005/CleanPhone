package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J%\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\u001dR\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "baseClass", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "decodeSequentially", "compositeDecoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Ljava/lang/Object;", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/DeserializationStrategy;", "klassName", "", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T decodeSequentially(CompositeDecoder compositeDecoder) {
        return (T) CompositeDecoder.DefaultImpls.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 1, PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder, compositeDecoder.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        T t;
        Intrinsics.f(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            t = (T) decodeSequentially(compositeDecoderBeginStructure);
        } else {
            Object objDecodeSerializableElement$default = null;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement$default != null) {
                        t = (T) objDecodeSerializableElement$default;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.X)).toString());
                }
                if (iDecodeElementIndex == 0) {
                    objectRef.X = compositeDecoderBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                } else {
                    if (iDecodeElementIndex != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.X;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(iDecodeElementIndex);
                        throw new SerializationException(sb.toString());
                    }
                    Object obj = objectRef.X;
                    if (obj == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    objectRef.X = obj;
                    objDecodeSerializableElement$default = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(compositeDecoderBeginStructure, getDescriptor(), iDecodeElementIndex, PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoderBeginStructure, (String) obj), null, 8, null);
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return t;
    }

    @InternalSerializationApi
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String klassName) {
        Intrinsics.f(decoder, "decoder");
        return decoder.getSerializersModule().getPolymorphic((KClass) getBaseClass(), klassName);
    }

    public abstract KClass<T> getBaseClass();

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, T value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        SerializationStrategy<? super T> serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        compositeEncoderBeginStructure.encodeStringElement(getDescriptor(), 0, serializationStrategyFindPolymorphicSerializer.getDescriptor().getSerialName());
        compositeEncoderBeginStructure.encodeSerializableElement(getDescriptor(), 1, serializationStrategyFindPolymorphicSerializer, value);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @InternalSerializationApi
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(value, "value");
        return encoder.getSerializersModule().getPolymorphic(getBaseClass(), value);
    }
}
