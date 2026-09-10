package yl;

import com.ironsource.D1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f54504c = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f54505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f54506b;

    public c(String str) {
        if (str != null) {
            this.f54505a = new e(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
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
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
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
                objArr[0] = D1.f25924i;
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
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
        switch (i10) {
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
        switch (i10) {
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

    public static c j(f fVar) {
        if (fVar != null) {
            return new c(new e(fVar.b(), f54504c.i(), fVar));
        }
        a(13);
        throw null;
    }

    public final String b() {
        String str = this.f54505a.f54510a;
        if (str != null) {
            return str;
        }
        e.a(4);
        throw null;
    }

    public final c c(f fVar) {
        if (fVar != null) {
            return new c(this.f54505a.b(fVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f54505a.f54510a.isEmpty();
    }

    public final c e() {
        c cVar = this.f54506b;
        if (cVar != null) {
            return cVar;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        e eVar = this.f54505a;
        e eVar2 = eVar.f54512c;
        if (eVar2 == null) {
            if (eVar.f54510a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            eVar.c();
            eVar2 = eVar.f54512c;
            if (eVar2 == null) {
                e.a(8);
                throw null;
            }
        }
        c cVar2 = new c(eVar2);
        this.f54506b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f54505a.equals(((c) obj).f54505a);
    }

    public final f f() {
        f fVarF = this.f54505a.f();
        if (fVarF != null) {
            return fVarF;
        }
        a(9);
        throw null;
    }

    public final f g() {
        e eVar = this.f54505a;
        if (eVar.f54510a.isEmpty()) {
            f fVar = e.f54507e;
            if (fVar != null) {
                return fVar;
            }
            e.a(12);
            throw null;
        }
        f fVarF = eVar.f();
        if (fVarF != null) {
            return fVarF;
        }
        e.a(13);
        throw null;
    }

    public final boolean h(f fVar) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        String str = this.f54505a.f54510a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strB = fVar.b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strB.length());
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.f54505a.f54510a.hashCode();
    }

    public final e i() {
        e eVar = this.f54505a;
        if (eVar != null) {
            return eVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f54505a.toString();
    }

    public c(e eVar) {
        this.f54505a = eVar;
    }

    public c(e eVar, c cVar) {
        this.f54505a = eVar;
        this.f54506b = cVar;
    }
}
