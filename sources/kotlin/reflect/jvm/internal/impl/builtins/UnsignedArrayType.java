package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public enum UnsignedArrayType {
    UBYTEARRAY(ClassId.e("kotlin/UByteArray", false)),
    USHORTARRAY(ClassId.e("kotlin/UShortArray", false)),
    UINTARRAY(ClassId.e("kotlin/UIntArray", false)),
    ULONGARRAY(ClassId.e("kotlin/ULongArray", false));

    public final Name X;

    UnsignedArrayType(ClassId classId) {
        Name nameI = classId.i();
        Intrinsics.e(nameI, "classId.shortClassName");
        this.X = nameI;
    }
}
