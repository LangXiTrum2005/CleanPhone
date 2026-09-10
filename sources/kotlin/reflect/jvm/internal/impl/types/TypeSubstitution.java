package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TypeSubstitution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypeSubstitution$Companion$EMPTY$1 f44548a = new TypeSubstitution$Companion$EMPTY$1();

    public static final class Companion {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public Annotations c(Annotations annotations) {
        Intrinsics.f(annotations, "annotations");
        return annotations;
    }

    public abstract TypeProjection d(KotlinType kotlinType);

    public boolean e() {
        return this instanceof TypeSubstitution$Companion$EMPTY$1;
    }

    public KotlinType f(KotlinType topLevelType, Variance position) {
        Intrinsics.f(topLevelType, "topLevelType");
        Intrinsics.f(position, "position");
        return topLevelType;
    }
}
