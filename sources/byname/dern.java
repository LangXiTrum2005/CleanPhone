package byname;

import com.ironsource.C3414a2;
import com.ironsource.D1;
import java.util.List;

/* JADX INFO: compiled from: FqName.java */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dern f15248dern = new dern("");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f15249attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public transient dern f15250saneness;

    public dern(String str) {
        if (str == null) {
            attabal(1);
        }
        this.f15249attabal = new wireman(str, this);
    }

    public static dern apical(marial marialVar) {
        if (marialVar == null) {
            attabal(14);
        }
        return new dern(wireman.impassible(marialVar));
    }

    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        switch (i) {
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
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
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
                objArr[0] = D1.i;
                break;
            case 13:
                objArr[0] = C3414a2.d;
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
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
        switch (i) {
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
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
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

    public List<marial> beachfront() {
        List<marial> listImpromptu = this.f15249attabal.impromptu();
        if (listImpromptu == null) {
            attabal(11);
        }
        return listImpromptu;
    }

    public marial competently() {
        marial marialVarTaiyuan = this.f15249attabal.taiyuan();
        if (marialVarTaiyuan == null) {
            attabal(9);
        }
        return marialVarTaiyuan;
    }

    public wireman cutely() {
        wireman wiremanVar = this.f15249attabal;
        if (wiremanVar == null) {
            attabal(5);
        }
        return wiremanVar;
    }

    public dern dern(marial marialVar) {
        if (marialVar == null) {
            attabal(8);
        }
        return new dern(this.f15249attabal.dern(marialVar), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dern) && this.f15249attabal.equals(((dern) obj).f15249attabal);
    }

    public int hashCode() {
        return this.f15249attabal.hashCode();
    }

    public marial impromptu() {
        marial marialVarCutely = this.f15249attabal.cutely();
        if (marialVarCutely == null) {
            attabal(10);
        }
        return marialVarCutely;
    }

    public dern marial() {
        dern dernVar = this.f15250saneness;
        if (dernVar != null) {
            if (dernVar == null) {
                attabal(6);
            }
            return dernVar;
        }
        if (wireman()) {
            throw new IllegalStateException("root");
        }
        dern dernVar2 = new dern(this.f15249attabal.competently());
        this.f15250saneness = dernVar2;
        return dernVar2;
    }

    public String saneness() {
        String strSaneness = this.f15249attabal.saneness();
        if (strSaneness == null) {
            attabal(4);
        }
        return strSaneness;
    }

    public boolean taiyuan(marial marialVar) {
        if (marialVar == null) {
            attabal(12);
        }
        return this.f15249attabal.apical(marialVar);
    }

    public String toString() {
        return this.f15249attabal.toString();
    }

    public boolean wireman() {
        return this.f15249attabal.marial();
    }

    public dern(wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(2);
        }
        this.f15249attabal = wiremanVar;
    }

    public dern(wireman wiremanVar, dern dernVar) {
        if (wiremanVar == null) {
            attabal(3);
        }
        this.f15249attabal = wiremanVar;
        this.f15250saneness = dernVar;
    }
}
