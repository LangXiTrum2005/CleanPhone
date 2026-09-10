package kotlin.reflect.jvm.internal.impl.name;

import com.p004ironsource.a4;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class FqNameUnsafe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Name f44167e = Name.i("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final Function1 g = new AnonymousClass1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient FqName f44169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient FqNameUnsafe f44170c;
    public transient Name d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe$1, reason: invalid class name */
    public static class AnonymousClass1 implements Function1<String, Name> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Name.f((String) obj);
        }
    }

    public FqNameUnsafe(String str, FqName fqName) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (fqName == null) {
            a(1);
            throw null;
        }
        this.f44168a = str;
        this.f44169b = fqName;
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
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
        switch (i2) {
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
                i3 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        if (i2 != 1) {
            switch (i2) {
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
                    objArr[0] = a4.f24258i;
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
        switch (i2) {
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
                objArr[1] = "toString";
                break;
        }
        switch (i2) {
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
        switch (i2) {
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

    public final FqNameUnsafe b(Name name) {
        String strB;
        if (name == null) {
            a(9);
            throw null;
        }
        String str = this.f44168a;
        if (str.isEmpty()) {
            strB = name.b();
        } else {
            strB = str + mo.ono + name.b();
        }
        return new FqNameUnsafe(strB, this, name);
    }

    public final void c() {
        String str = this.f44168a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.d = Name.f(str.substring(iLastIndexOf + 1));
            this.f44170c = new FqNameUnsafe(str.substring(0, iLastIndexOf));
        } else {
            this.d = Name.f(str);
            this.f44170c = FqName.f44164c.i();
        }
    }

    public final boolean d() {
        if (this.f44169b != null) {
            return true;
        }
        String str = this.f44168a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        a(4);
        throw null;
    }

    public final List e() {
        List list;
        String str = this.f44168a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f.split(str);
            Function1 transform = g;
            Intrinsics.f(strArrSplit, "<this>");
            Intrinsics.f(transform, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(((AnonymousClass1) transform).invoke(str2));
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
        return (obj instanceof FqNameUnsafe) && this.f44168a.equals(((FqNameUnsafe) obj).f44168a);
    }

    public final Name f() {
        Name name = this.d;
        if (name != null) {
            if (name != null) {
                return name;
            }
            a(10);
            throw null;
        }
        if (this.f44168a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        Name name2 = this.d;
        if (name2 != null) {
            return name2;
        }
        a(11);
        throw null;
    }

    public final FqName g() {
        FqName fqName = this.f44169b;
        if (fqName == null) {
            FqName fqName2 = new FqName(this);
            this.f44169b = fqName2;
            return fqName2;
        }
        if (fqName != null) {
            return fqName;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        return this.f44168a.hashCode();
    }

    public final String toString() {
        String strB = this.f44168a;
        if (strB.isEmpty()) {
            strB = f44167e.b();
        }
        if (strB != null) {
            return strB;
        }
        a(17);
        throw null;
    }

    public FqNameUnsafe(String str) {
        if (str != null) {
            this.f44168a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        if (str != null) {
            this.f44168a = str;
            this.f44170c = fqNameUnsafe;
            this.d = name;
            return;
        }
        a(3);
        throw null;
    }
}
