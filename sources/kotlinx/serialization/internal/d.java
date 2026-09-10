package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.DeserializationStrategy;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ TaggedDecoder f45122Y;
    public final /* synthetic */ DeserializationStrategy Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ d(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj, int i2) {
        this.X = i2;
        this.f45122Y = taggedDecoder;
        this.Z = deserializationStrategy;
        this.e0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.X) {
            case 0:
                return this.f45122Y.decodeSerializableValue(this.Z, this.e0);
            default:
                return TaggedDecoder.decodeNullableSerializableElement$lambda$3(this.f45122Y, this.Z, this.e0);
        }
    }
}
