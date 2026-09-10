package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public class JvmClassName {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44320a;

    public JvmClassName(String str) {
        if (str != null) {
            this.f44320a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 3 || i2 == 6 || i2 == 7 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 3 || i2 == 6 || i2 == 7 || i2 == 8) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i2 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i2 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i2 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i2 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i2) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 3 && i2 != 6 && i2 != 7 && i2 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static JvmClassName b(ClassId classId) {
        if (classId == null) {
            a(1);
            throw null;
        }
        FqName fqNameG = classId.g();
        String strReplace = classId.h().b().replace('.', '$');
        if (fqNameG.d()) {
            return new JvmClassName(strReplace);
        }
        return new JvmClassName(fqNameG.b().replace('.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + strReplace);
    }

    public static JvmClassName c(FqName fqName) {
        if (fqName != null) {
            return new JvmClassName(fqName.b().replace('.', IOUtils.DIR_SEPARATOR_UNIX));
        }
        a(2);
        throw null;
    }

    public static JvmClassName d(String str) {
        if (str != null) {
            return new JvmClassName(str);
        }
        a(0);
        throw null;
    }

    public final String e() {
        String str = this.f44320a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f44320a.equals(((JvmClassName) obj).f44320a);
    }

    public final int hashCode() {
        return this.f44320a.hashCode();
    }

    public final String toString() {
        return this.f44320a;
    }
}
