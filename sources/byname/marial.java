package byname;

/* JADX INFO: compiled from: Name.java */
/* JADX INFO: loaded from: classes5.dex */
public final class marial implements Comparable<marial> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final boolean f15337kowloon;
    private final String name;

    public marial(String str, boolean z) {
        if (str == null) {
            attabal(0);
        }
        this.name = str;
        this.f15337kowloon = z;
    }

    public static /* synthetic */ void attabal(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
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
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static marial cutely(String str) {
        if (str == null) {
            attabal(5);
        }
        return new marial(str, false);
    }

    public static boolean formularize(String str) {
        if (str == null) {
            attabal(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static marial impassible(String str) {
        if (str == null) {
            attabal(8);
        }
        if (str.startsWith("<")) {
            return new marial(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public static marial taiyuan(String str) {
        if (str == null) {
            attabal(9);
        }
        return str.startsWith("<") ? impassible(str) : cutely(str);
    }

    public boolean apical() {
        return this.f15337kowloon;
    }

    public String dern() {
        String str = this.name;
        if (str == null) {
            attabal(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof marial)) {
            return false;
        }
        marial marialVar = (marial) obj;
        return this.f15337kowloon == marialVar.f15337kowloon && this.name.equals(marialVar.name);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.f15337kowloon ? 1 : 0);
    }

    public String marial() {
        if (this.f15337kowloon) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strDern = dern();
        if (strDern == null) {
            attabal(2);
        }
        return strDern;
    }

    public String toString() {
        return this.name;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public int compareTo(marial marialVar) {
        return this.name.compareTo(marialVar.name);
    }
}
