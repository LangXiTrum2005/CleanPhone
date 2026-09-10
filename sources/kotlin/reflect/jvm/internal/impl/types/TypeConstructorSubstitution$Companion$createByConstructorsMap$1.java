package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeConstructorSubstitution$Companion$createByConstructorsMap$1 extends TypeConstructorSubstitution {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f44540c;

    public TypeConstructorSubstitution$Companion$createByConstructorsMap$1(Map map) {
        this.f44540c = map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean a() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean e() {
        return this.f44540c.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    public final TypeProjection g(TypeConstructor key) {
        Intrinsics.f(key, "key");
        return (TypeProjection) this.f44540c.get(key);
    }
}
