package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
public final class ClassLiteralValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassId f44300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44301b;

    public ClassLiteralValue(ClassId classId, int i2) {
        this.f44300a = classId;
        this.f44301b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.a(this.f44300a, classLiteralValue.f44300a) && this.f44301b == classLiteralValue.f44301b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44301b) + (this.f44300a.hashCode() * 31);
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            i2 = this.f44301b;
            if (i3 >= i2) {
                break;
            }
            sb.append("kotlin/Array<");
            i3++;
        }
        sb.append(this.f44300a);
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(">");
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
