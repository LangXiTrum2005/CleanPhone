package byname;

import com.ironsource.D1;

/* JADX INFO: compiled from: ClassId.java */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f15338attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f15339dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f15340saneness;

    public saneness(dern dernVar, dern dernVar2, boolean z) {
        if (dernVar == null) {
            attabal(1);
        }
        if (dernVar2 == null) {
            attabal(2);
        }
        this.f15338attabal = dernVar;
        this.f15340saneness = dernVar2;
        this.f15339dern = z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
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
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
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
                objArr[0] = D1.i;
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i != 9) {
            switch (i) {
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
        switch (i) {
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
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
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

    public static saneness beachfront(String str, boolean z) {
        String str2;
        if (str == null) {
            attabal(12);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new saneness(new dern(str2), new dern(str), z);
    }

    public static saneness impassible(dern dernVar) {
        if (dernVar == null) {
            attabal(0);
        }
        return new saneness(dernVar.marial(), dernVar.competently());
    }

    public static saneness marial(String str) {
        if (str == null) {
            attabal(11);
        }
        return beachfront(str, false);
    }

    public boolean apical() {
        return this.f15339dern;
    }

    public saneness competently() {
        dern dernVarMarial = this.f15340saneness.marial();
        if (dernVarMarial.wireman()) {
            return null;
        }
        return new saneness(impromptu(), dernVarMarial, this.f15339dern);
    }

    public marial cutely() {
        marial marialVarCompetently = this.f15340saneness.competently();
        if (marialVarCompetently == null) {
            attabal(7);
        }
        return marialVarCompetently;
    }

    public String dern() {
        if (this.f15338attabal.wireman()) {
            String strSaneness = this.f15340saneness.saneness();
            if (strSaneness == null) {
                attabal(13);
            }
            return strSaneness;
        }
        String str = this.f15338attabal.saneness().replace('.', '/') + "/" + this.f15340saneness.saneness();
        if (str == null) {
            attabal(14);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && saneness.class == obj.getClass()) {
            saneness sanenessVar = (saneness) obj;
            if (this.f15338attabal.equals(sanenessVar.f15338attabal) && this.f15340saneness.equals(sanenessVar.f15340saneness) && this.f15339dern == sanenessVar.f15339dern) {
                return true;
            }
        }
        return false;
    }

    public boolean formularize() {
        return !this.f15340saneness.marial().wireman();
    }

    public int hashCode() {
        return (((this.f15338attabal.hashCode() * 31) + this.f15340saneness.hashCode()) * 31) + Boolean.valueOf(this.f15339dern).hashCode();
    }

    public dern impromptu() {
        dern dernVar = this.f15338attabal;
        if (dernVar == null) {
            attabal(5);
        }
        return dernVar;
    }

    public dern saneness() {
        if (this.f15338attabal.wireman()) {
            dern dernVar = this.f15340saneness;
            if (dernVar == null) {
                attabal(9);
            }
            return dernVar;
        }
        return new dern(this.f15338attabal.saneness() + "." + this.f15340saneness.saneness());
    }

    public dern taiyuan() {
        dern dernVar = this.f15340saneness;
        if (dernVar == null) {
            attabal(6);
        }
        return dernVar;
    }

    public String toString() {
        if (!this.f15338attabal.wireman()) {
            return dern();
        }
        return "/" + dern();
    }

    public saneness wireman(marial marialVar) {
        if (marialVar == null) {
            attabal(8);
        }
        return new saneness(impromptu(), this.f15340saneness.dern(marialVar), this.f15339dern);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public saneness(dern dernVar, marial marialVar) {
        this(dernVar, dern.apical(marialVar), false);
        if (dernVar == null) {
            attabal(3);
        }
        if (marialVar == null) {
            attabal(4);
        }
    }
}
