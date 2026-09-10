package kotlinx.serialization;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SealedClassSerializer f45116Y;

    public /* synthetic */ b(SealedClassSerializer sealedClassSerializer, int i2) {
        this.X = i2;
        this.f45116Y = sealedClassSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                return SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2(this.f45116Y, (ClassSerialDescriptorBuilder) obj);
            default:
                return SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2$lambda$1(this.f45116Y, (ClassSerialDescriptorBuilder) obj);
        }
    }
}
