package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import droppable.saneness;
import java.io.InputStream;
import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements Function1<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(Object obj) {
        super(1, obj);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "loadResource";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(saneness.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final InputStream invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((saneness) this.receiver).attabal(p0);
    }
}
