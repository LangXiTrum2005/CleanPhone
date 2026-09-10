package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\t*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/serialization/internal/UIntArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UIntArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UInt;", "Lkotlinx/serialization/internal/UIntArrayBuilder;", "<init>", "()V", "collectionSize", "", "collectionSize--ajY-9A", "([I)I", "toBuilder", "toBuilder--ajY-9A", "([I)Lkotlinx/serialization/internal/UIntArrayBuilder;", "empty", "empty--hP7Qyg", "()[I", "readElement", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "builder", "checkIndex", "", "writeContent", "encoder", "Lkotlinx/serialization/encoding/CompositeEncoder;", "content", "size", "writeContent-CPlH8fI", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
public final class UIntArraySerializer extends PrimitiveArraySerializer<UInt, UIntArray, UIntArrayBuilder> implements KSerializer<UIntArray> {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    private UIntArraySerializer() {
        super(BuiltinSerializersKt.serializer(UInt.f43256Y));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ int collectionSize(Object obj) {
        return m3356collectionSizeajY9A(((UIntArray) obj).X);
    }

    /* JADX INFO: renamed from: collectionSize--ajY-9A, reason: not valid java name */
    public int m3356collectionSizeajY9A(int[] collectionSize) {
        Intrinsics.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ UIntArray empty() {
        return new UIntArray(m3357emptyhP7Qyg());
    }

    /* JADX INFO: renamed from: empty--hP7Qyg, reason: not valid java name */
    public int[] m3357emptyhP7Qyg() {
        return new int[0];
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* synthetic */ Object toBuilder(Object obj) {
        return m3358toBuilderajY9A(((UIntArray) obj).X);
    }

    /* JADX INFO: renamed from: toBuilder--ajY-9A, reason: not valid java name */
    public UIntArrayBuilder m3358toBuilderajY9A(int[] toBuilder) {
        Intrinsics.f(toBuilder, "$this$toBuilder");
        return new UIntArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, UIntArray uIntArray, int i2) {
        m3359writeContentCPlH8fI(compositeEncoder, uIntArray.X, i2);
    }

    /* JADX INFO: renamed from: writeContent-CPlH8fI, reason: not valid java name */
    public void m3359writeContentCPlH8fI(CompositeEncoder encoder, int[] content, int size) {
        Intrinsics.f(encoder, "encoder");
        Intrinsics.f(content, "content");
        for (int i2 = 0; i2 < size; i2++) {
            encoder.encodeInlineElement(getDescriptor(), i2).encodeInt(content[i2]);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int index, UIntArrayBuilder builder, boolean checkIndex) {
        Intrinsics.f(decoder, "decoder");
        Intrinsics.f(builder, "builder");
        builder.m3354appendWZ4Q5Ns$kotlinx_serialization_core(decoder.decodeInlineElement(getDescriptor(), index).decodeInt());
    }
}
