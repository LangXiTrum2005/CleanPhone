package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: loaded from: classes7.dex */
public final class Name implements Comparable<Name> {
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f44171Y;

    public Name(String str, boolean z2) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.X = str;
        this.f44171Y = z2;
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? 2 : 3];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i2 == 1) {
            objArr[1] = "asString";
        } else if (i2 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i2 == 3 || i2 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static Name f(String str) {
        if (str != null) {
            return str.startsWith("<") ? i(str) : g(str);
        }
        a(8);
        throw null;
    }

    public static Name g(String str) {
        if (str != null) {
            return new Name(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean h(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static Name i(String str) {
        if (str == null) {
            a(7);
            throw null;
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public final String b() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Name name) {
        return this.X.compareTo(name.X);
    }

    public final String d() {
        if (this.f44171Y) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f44171Y == name.f44171Y && this.X.equals(name.X);
    }

    public final int hashCode() {
        return (this.X.hashCode() * 31) + (this.f44171Y ? 1 : 0);
    }

    public final String toString() {
        return this.X;
    }
}
