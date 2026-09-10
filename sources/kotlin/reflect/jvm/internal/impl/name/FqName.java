package kotlin.reflect.jvm.internal.impl.name;

import com.p004ironsource.a4;

/* JADX INFO: loaded from: classes7.dex */
public final class FqName {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FqName f44164c = new FqName("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqNameUnsafe f44165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient FqName f44166b;

    public FqName(String str) {
        if (str != null) {
            this.f44165a = new FqNameUnsafe(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i3 = 2;
                break;
            case 8:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = a4.f24258i;
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static FqName j(Name name) {
        if (name == null) {
            a(13);
            throw null;
        }
        if (name != null) {
            return new FqName(new FqNameUnsafe(name.b(), f44164c.i(), name));
        }
        FqNameUnsafe.a(16);
        throw null;
    }

    public final String b() {
        String str = this.f44165a.f44168a;
        if (str != null) {
            return str;
        }
        FqNameUnsafe.a(4);
        throw null;
    }

    public final FqName c(Name name) {
        if (name != null) {
            return new FqName(this.f44165a.b(name), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f44165a.f44168a.isEmpty();
    }

    public final FqName e() {
        FqName fqName = this.f44166b;
        if (fqName != null) {
            if (fqName != null) {
                return fqName;
            }
            a(6);
            throw null;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        FqNameUnsafe fqNameUnsafe = this.f44165a;
        FqNameUnsafe fqNameUnsafe2 = fqNameUnsafe.f44170c;
        if (fqNameUnsafe2 == null) {
            if (fqNameUnsafe.f44168a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            fqNameUnsafe.c();
            fqNameUnsafe2 = fqNameUnsafe.f44170c;
            if (fqNameUnsafe2 == null) {
                FqNameUnsafe.a(8);
                throw null;
            }
        }
        FqName fqName2 = new FqName(fqNameUnsafe2);
        this.f44166b = fqName2;
        return fqName2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && this.f44165a.equals(((FqName) obj).f44165a);
    }

    public final Name f() {
        Name nameF = this.f44165a.f();
        if (nameF != null) {
            return nameF;
        }
        a(9);
        throw null;
    }

    public final Name g() {
        FqNameUnsafe fqNameUnsafe = this.f44165a;
        if (fqNameUnsafe.f44168a.isEmpty()) {
            Name name = FqNameUnsafe.f44167e;
            if (name != null) {
                return name;
            }
            FqNameUnsafe.a(12);
            throw null;
        }
        Name nameF = fqNameUnsafe.f();
        if (nameF != null) {
            return nameF;
        }
        FqNameUnsafe.a(13);
        throw null;
    }

    public final boolean h(Name name) {
        if (name == null) {
            a(12);
            throw null;
        }
        String str = this.f44165a.f44168a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strB = name.b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strB.length());
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.f44165a.f44168a.hashCode();
    }

    public final FqNameUnsafe i() {
        FqNameUnsafe fqNameUnsafe = this.f44165a;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f44165a.toString();
    }

    public FqName(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe != null) {
            this.f44165a = fqNameUnsafe;
        } else {
            a(2);
            throw null;
        }
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f44165a = fqNameUnsafe;
        this.f44166b = fqName;
    }
}
