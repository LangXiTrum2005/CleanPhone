package kotlinx.serialization;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f45118Y;

    public /* synthetic */ g(Object obj, int i2) {
        this.X = i2;
        this.f45118Y = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.X) {
            case 0:
                return SerializersKt__SerializersKt.serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt((ArrayList) this.f45118Y);
            default:
                return PolymorphicSerializer.descriptor_delegate$lambda$1((PolymorphicSerializer) this.f45118Y);
        }
    }
}
