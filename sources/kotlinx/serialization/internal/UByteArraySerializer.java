package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\t*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/serialization/internal/UByteArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UByteArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UByte;", "Lkotlinx/serialization/internal/UByteArrayBuilder;", "<init>", "()V", "collectionSize", "", "collectionSize-GBYM_sE", "([B)I", "toBuilder", "toBuilder-GBYM_sE", "([B)Lkotlinx/serialization/internal/UByteArrayBuilder;", "empty", "empty-TcUX1vc", "()[B", "readElement", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "builder", "checkIndex", "", "writeContent", "encoder", "Lkotlinx/serialization/encoding/CompositeEncoder;", "content", "size", "writeContent-Coi6ktg", "(Lkotlinx/serialization/encoding/CompositeEncoder;[BI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
public final class UByteArraySerializer extends PrimitiveArraySerializer<UByte, UByteArray, UByteArrayBuilder> implements KSerializer<UByteArray> {
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

    private UByteArraySerializer() {
        super(BuiltinSerializersKt.serializer(UByte.f43254Y));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m3348collectionSizeGBYM_sE(((UByteArray) obj).X);
    }

    /* JADX INFO: renamed from: collectionSize-GBYM_sE, reason: not valid java name */
    public int m3348collectionSizeGBYM_sE(byte[] collectionSize) {
        Intrinsics.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ UByteArray empty() {
        return new UByteArray(m3349emptyTcUX1vc());
    }

    /* JADX INFO: renamed from: empty-TcUX1vc, reason: not valid java name */
    public byte[] m3349emptyTcUX1vc() {
        return new byte[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m3350toBuilderGBYM_sE(((UByteArray) obj).X);
    }

    /* JADX INFO: renamed from: toBuilder-GBYM_sE, reason: not valid java name */
    public UByteArrayBuilder m3350toBuilderGBYM_sE(byte[] toBuilder) {
        Intrinsics.f(toBuilder, "$this$toBuilder");
        return new UByteArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, UByteArray uByteArray, int i2) {
        m3351writeContentCoi6ktg(compositeEncoder, uByteArray.X, i2);
    }

    /* JADX INFO: renamed from: writeContent-Coi6ktg, reason: not valid java name */
    public void m3351writeContentCoi6ktg(CompositeEncoder encoder, byte[] content, int size) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(content, "content");
        for (int i2 = 0; i2 < size; i2++) {
            encoder.encodeInlineElement(getDescriptor(), i2).encodeByte(content[i2]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, UByteArrayBuilder builder, boolean checkIndex) {
        Intrinsics.f(decoder, "decoder");
        Intrinsics.f(builder, "builder");
        builder.m3346append7apg3OU$kotlinx_serialization_core(decoder.decodeInlineElement(getDescriptor(), index).decodeByte());
    }
}
