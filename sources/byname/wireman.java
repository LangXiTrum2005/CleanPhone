package byname;

import com.ironsource.C3414a2;
import com.ironsource.D1;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FqNameUnsafe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f15346attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public transient wireman f15347dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public transient dern f15348saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public transient marial f15349wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final marial f15345marial = marial.impassible("<root>");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Pattern f15343beachfront = Pattern.compile("\\.");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Function1<String, marial> f15344competently = new attabal();

    /* JADX INFO: compiled from: FqNameUnsafe.java */
    public static class attabal implements Function1<String, marial> {
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public marial invoke(String str) {
            return marial.taiyuan(str);
        }
    }

    public wireman(String str, dern dernVar) {
        if (str == null) {
            attabal(0);
        }
        if (dernVar == null) {
            attabal(1);
        }
        this.f15346attabal = str;
        this.f15348saneness = dernVar;
    }

    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = D1.i;
                    break;
                case 16:
                    objArr[0] = C3414a2.d;
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static wireman impassible(marial marialVar) {
        if (marialVar == null) {
            attabal(17);
        }
        return new wireman(marialVar.dern(), dern.f15248dern.cutely(), marialVar);
    }

    public boolean apical(marial marialVar) {
        if (marialVar == null) {
            attabal(15);
        }
        if (marial()) {
            return false;
        }
        int iIndexOf = this.f15346attabal.indexOf(46);
        String strDern = marialVar.dern();
        String str = this.f15346attabal;
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strDern.length());
        }
        return str.regionMatches(0, strDern, 0, iIndexOf);
    }

    public boolean beachfront() {
        return this.f15348saneness != null || saneness().indexOf(60) < 0;
    }

    public wireman competently() {
        wireman wiremanVar = this.f15347dern;
        if (wiremanVar != null) {
            if (wiremanVar == null) {
                attabal(7);
            }
            return wiremanVar;
        }
        if (marial()) {
            throw new IllegalStateException("root");
        }
        wireman();
        wireman wiremanVar2 = this.f15347dern;
        if (wiremanVar2 == null) {
            attabal(8);
        }
        return wiremanVar2;
    }

    public marial cutely() {
        if (marial()) {
            marial marialVar = f15345marial;
            if (marialVar == null) {
                attabal(12);
            }
            return marialVar;
        }
        marial marialVarTaiyuan = taiyuan();
        if (marialVarTaiyuan == null) {
            attabal(13);
        }
        return marialVarTaiyuan;
    }

    public wireman dern(marial marialVar) {
        String strDern;
        if (marialVar == null) {
            attabal(9);
        }
        if (marial()) {
            strDern = marialVar.dern();
        } else {
            strDern = this.f15346attabal + "." + marialVar.dern();
        }
        return new wireman(strDern, this, marialVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wireman) && this.f15346attabal.equals(((wireman) obj).f15346attabal);
    }

    public dern formularize() {
        dern dernVar = this.f15348saneness;
        if (dernVar != null) {
            if (dernVar == null) {
                attabal(5);
            }
            return dernVar;
        }
        dern dernVar2 = new dern(this);
        this.f15348saneness = dernVar2;
        return dernVar2;
    }

    public int hashCode() {
        return this.f15346attabal.hashCode();
    }

    public List<marial> impromptu() {
        List<marial> listEmpress = marial() ? Collections.EMPTY_LIST : polloi.empress(f15343beachfront.split(this.f15346attabal), f15344competently);
        if (listEmpress == null) {
            attabal(14);
        }
        return listEmpress;
    }

    public boolean marial() {
        return this.f15346attabal.isEmpty();
    }

    public String saneness() {
        String str = this.f15346attabal;
        if (str == null) {
            attabal(4);
        }
        return str;
    }

    public marial taiyuan() {
        marial marialVar = this.f15349wireman;
        if (marialVar != null) {
            if (marialVar == null) {
                attabal(10);
            }
            return marialVar;
        }
        if (marial()) {
            throw new IllegalStateException("root");
        }
        wireman();
        marial marialVar2 = this.f15349wireman;
        if (marialVar2 == null) {
            attabal(11);
        }
        return marialVar2;
    }

    public String toString() {
        String strDern = marial() ? f15345marial.dern() : this.f15346attabal;
        if (strDern == null) {
            attabal(18);
        }
        return strDern;
    }

    public final void wireman() {
        int iLastIndexOf = this.f15346attabal.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f15349wireman = marial.taiyuan(this.f15346attabal.substring(iLastIndexOf + 1));
            this.f15347dern = new wireman(this.f15346attabal.substring(0, iLastIndexOf));
        } else {
            this.f15349wireman = marial.taiyuan(this.f15346attabal);
            this.f15347dern = dern.f15248dern.cutely();
        }
    }

    public wireman(String str) {
        if (str == null) {
            attabal(2);
        }
        this.f15346attabal = str;
    }

    public wireman(String str, wireman wiremanVar, marial marialVar) {
        if (str == null) {
            attabal(3);
        }
        this.f15346attabal = str;
        this.f15347dern = wiremanVar;
        this.f15349wireman = marialVar;
    }
}
