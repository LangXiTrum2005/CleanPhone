package kotlinx.serialization;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ KSerializer f45115Y;

    public /* synthetic */ a(KSerializer kSerializer, int i2) {
        this.X = i2;
        this.f45115Y = kSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                return ContextualSerializer.descriptor$lambda$0((ContextualSerializer) this.f45115Y, (ClassSerialDescriptorBuilder) obj);
            default:
                return PolymorphicSerializer.descriptor_delegate$lambda$1$lambda$0((PolymorphicSerializer) this.f45115Y, (ClassSerialDescriptorBuilder) obj);
        }
    }
}
