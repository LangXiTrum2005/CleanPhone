package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public enum UnsignedType {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(ClassId.e("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(ClassId.e("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(ClassId.e("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(ClassId.e("kotlin/ULong", false));

    public final ClassId X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Name f43510Y;
    public final ClassId Z;

    UnsignedType(ClassId classId) {
        this.X = classId;
        Name nameI = classId.i();
        Intrinsics.e(nameI, "classId.shortClassName");
        this.f43510Y = nameI;
        this.Z = new ClassId(classId.g(), Name.g(nameI.b() + "Array"));
    }
}
