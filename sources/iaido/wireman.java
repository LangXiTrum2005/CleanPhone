package iaido;

/* JADX INFO: compiled from: JvmClassName.java */
/* JADX INFO: loaded from: classes5.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f28349attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public byname.dern f28350saneness;

    public wireman(String str) {
        if (str == null) {
            attabal(5);
        }
        this.f28349attabal = str;
    }

    public static /* synthetic */ void attabal(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
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
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
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
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static wireman dern(byname.dern dernVar) {
        if (dernVar == null) {
            attabal(2);
        }
        wireman wiremanVar = new wireman(dernVar.saneness().replace('.', '/'));
        wiremanVar.f28350saneness = dernVar;
        return wiremanVar;
    }

    public static wireman saneness(byname.saneness sanenessVar) {
        if (sanenessVar == null) {
            attabal(1);
        }
        byname.dern dernVarImpromptu = sanenessVar.impromptu();
        String strReplace = sanenessVar.taiyuan().saneness().replace('.', '$');
        if (dernVarImpromptu.wireman()) {
            return new wireman(strReplace);
        }
        return new wireman(dernVarImpromptu.saneness().replace('.', '/') + "/" + strReplace);
    }

    public static wireman wireman(String str) {
        if (str == null) {
            attabal(0);
        }
        return new wireman(str);
    }

    public String beachfront() {
        String str = this.f28349attabal;
        if (str == null) {
            attabal(8);
        }
        return str;
    }

    public byname.dern competently() {
        int iLastIndexOf = this.f28349attabal.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new byname.dern(this.f28349attabal.substring(0, iLastIndexOf).replace('/', '.'));
        }
        byname.dern dernVar = byname.dern.f15248dern;
        if (dernVar == null) {
            attabal(7);
        }
        return dernVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f28349attabal.equals(((wireman) obj).f28349attabal);
    }

    public int hashCode() {
        return this.f28349attabal.hashCode();
    }

    public byname.dern marial() {
        return new byname.dern(this.f28349attabal.replace('/', '.'));
    }

    public String toString() {
        return this.f28349attabal;
    }
}
