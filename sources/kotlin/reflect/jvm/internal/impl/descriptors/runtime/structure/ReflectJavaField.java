package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f43709a;

    public ReflectJavaField(Field member) {
        Intrinsics.f(member, "member");
        this.f43709a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final boolean B() {
        return this.f43709a.isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member F() {
        return this.f43709a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final JavaType getType() {
        Type genericType = this.f43709a.getGenericType();
        Intrinsics.e(genericType, "member.genericType");
        return ReflectJavaType.Factory.a(genericType);
    }
}
