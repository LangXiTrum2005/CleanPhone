package yl;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.D1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f54507e = f.g("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f54508f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f54509g = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f54511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient e f54512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient f f54513d;

    public e(String str, c cVar) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f54510a = str;
        this.f54511b = cVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
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
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
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
            case 17:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
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
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = D1.f25924i;
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
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
            case 17:
                objArr[1] = InAppPurchaseConstants.METHOD_TO_STRING;
                break;
        }
        switch (i10) {
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
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
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
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final e b(f fVar) {
        String strB;
        if (fVar == null) {
            a(9);
            throw null;
        }
        String str = this.f54510a;
        if (str.isEmpty()) {
            strB = fVar.b();
        } else {
            strB = str + "." + fVar.b();
        }
        return new e(strB, this, fVar);
    }

    public final void c() {
        String str = this.f54510a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f54513d = f.d(str.substring(iLastIndexOf + 1));
            this.f54512c = new e(str.substring(0, iLastIndexOf));
        } else {
            this.f54513d = f.d(str);
            this.f54512c = c.f54504c.i();
        }
    }

    public final boolean d() {
        if (this.f54511b != null) {
            return true;
        }
        String str = this.f54510a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        a(4);
        throw null;
    }

    public final List e() {
        List list;
        String str = this.f54510a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f54508f.split(str);
            n.f(strArrSplit, "<this>");
            d transform = f54509g;
            n.f(transform, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(f.d(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f54510a.equals(((e) obj).f54510a);
    }

    public final f f() {
        f fVar = this.f54513d;
        if (fVar != null) {
            if (fVar != null) {
                return fVar;
            }
            a(10);
            throw null;
        }
        if (this.f54510a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        f fVar2 = this.f54513d;
        if (fVar2 != null) {
            return fVar2;
        }
        a(11);
        throw null;
    }

    public final c g() {
        c cVar = this.f54511b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f54511b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.f54510a.hashCode();
    }

    public final String toString() {
        String strB = this.f54510a;
        if (strB.isEmpty()) {
            strB = f54507e.b();
        }
        if (strB != null) {
            return strB;
        }
        a(17);
        throw null;
    }

    public e(String str) {
        if (str != null) {
            this.f54510a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public e(String str, e eVar, f fVar) {
        if (str != null) {
            this.f54510a = str;
            this.f54512c = eVar;
            this.f54513d = fVar;
            return;
        }
        a(3);
        throw null;
    }
}
