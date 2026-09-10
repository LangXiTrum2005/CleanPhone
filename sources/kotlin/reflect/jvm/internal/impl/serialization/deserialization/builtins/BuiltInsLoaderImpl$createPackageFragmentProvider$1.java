package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements Function1<String, InputStream> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(BuiltInsResourceLoader.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.f(p0, "p0");
        ((BuiltInsResourceLoader) this.receiver).getClass();
        return BuiltInsResourceLoader.a(p0);
    }
}
