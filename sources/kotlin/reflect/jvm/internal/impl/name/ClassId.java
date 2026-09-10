package kotlin.reflect.jvm.internal.impl.name;

import com.p004ironsource.a4;
import com.smartdigimkt.v0.k;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes7.dex */
public final class ClassId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f44161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FqName f44162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44163c;

    public ClassId(FqName fqName, FqName fqName2, boolean z2) {
        if (fqName == null) {
            a(1);
            throw null;
        }
        this.f44161a = fqName;
        this.f44162b = fqName2;
        this.f44163c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        if (i2 != 5 && i2 != 6 && i2 != 7 && i2 != 9) {
            switch (i2) {
                case 13:
                case 14:
                case 15:
                case 16:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 5 && i2 != 6 && i2 != 7 && i2 != 9) {
            switch (i2) {
                case 13:
                case 14:
                case 15:
                case 16:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = a4.f24258i;
                break;
            case 11:
            case 12:
                objArr[0] = k.f38992h;
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i2 == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i2 == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i2 == 7) {
            objArr[1] = "getShortClassName";
        } else if (i2 != 9) {
            switch (i2) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 5 && i2 != 6 && i2 != 7 && i2 != 9) {
            switch (i2) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static ClassId e(String str, boolean z2) {
        String str2;
        if (str == null) {
            a(12);
            throw null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new ClassId(new FqName(str2), new FqName(str), z2);
    }

    public static ClassId j(FqName fqName) {
        if (fqName != null) {
            return new ClassId(fqName.e(), fqName.f());
        }
        a(0);
        throw null;
    }

    public final FqName b() {
        FqName fqName = this.f44161a;
        boolean zD = fqName.d();
        FqName fqName2 = this.f44162b;
        if (zD) {
            if (fqName2 != null) {
                return fqName2;
            }
            a(9);
            throw null;
        }
        return new FqName(fqName.b() + mo.ono + fqName2.b());
    }

    public final String c() {
        FqName fqName = this.f44161a;
        boolean zD = fqName.d();
        FqName fqName2 = this.f44162b;
        if (zD) {
            return fqName2.b();
        }
        String str = fqName.b().replace('.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + fqName2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final ClassId d(Name name) {
        if (name != null) {
            return new ClassId(g(), this.f44162b.c(name), this.f44163c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ClassId.class == obj.getClass()) {
            ClassId classId = (ClassId) obj;
            if (this.f44161a.equals(classId.f44161a) && this.f44162b.equals(classId.f44162b) && this.f44163c == classId.f44163c) {
                return true;
            }
        }
        return false;
    }

    public final ClassId f() {
        FqName fqNameE = this.f44162b.e();
        if (fqNameE.d()) {
            return null;
        }
        return new ClassId(g(), fqNameE, this.f44163c);
    }

    public final FqName g() {
        FqName fqName = this.f44161a;
        if (fqName != null) {
            return fqName;
        }
        a(5);
        throw null;
    }

    public final FqName h() {
        FqName fqName = this.f44162b;
        if (fqName != null) {
            return fqName;
        }
        a(6);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f44163c).hashCode() + ((this.f44162b.hashCode() + (this.f44161a.hashCode() * 31)) * 31);
    }

    public final Name i() {
        Name nameF = this.f44162b.f();
        if (nameF != null) {
            return nameF;
        }
        a(7);
        throw null;
    }

    public final String toString() {
        return this.f44161a.d() ? "/".concat(c()) : c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(FqName fqName, Name name) {
        this(fqName, FqName.j(name), false);
        if (fqName == null) {
            a(3);
            throw null;
        }
        if (name != null) {
        } else {
            a(4);
            throw null;
        }
    }
}
