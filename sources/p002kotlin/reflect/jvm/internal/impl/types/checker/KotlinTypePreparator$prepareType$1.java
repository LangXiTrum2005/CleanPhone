package p002kotlin.reflect.jvm.internal.impl.types.checker;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import presbytery.competently;

/* JADX INFO: compiled from: KotlinTypePreparator.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReference implements Function1<competently, empress> {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "prepareType";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final kurbash.competently getOwner() {
        return polloi.saneness(KotlinTypePreparator.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final empress invoke(competently p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((KotlinTypePreparator) this.receiver).attabal(p0);
    }
}
