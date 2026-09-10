package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ KSerializer f45120Y;
    public final /* synthetic */ KSerializer Z;

    public /* synthetic */ b(KSerializer kSerializer, KSerializer kSerializer2, int i2) {
        this.X = i2;
        this.f45120Y = kSerializer;
        this.Z = kSerializer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                return MapEntrySerializer.descriptor$lambda$0(this.f45120Y, this.Z, (ClassSerialDescriptorBuilder) obj);
            default:
                return PairSerializer.descriptor$lambda$0(this.f45120Y, this.Z, (ClassSerialDescriptorBuilder) obj);
        }
    }
}
