package cl;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends im.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.e f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.e f6600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f6601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f6602e;

    public u(v vVar, om.o oVar) {
        if (oVar == null) {
            h(0);
            throw null;
        }
        this.f6602e = vVar;
        om.l lVar = (om.l) oVar;
        this.f6599b = lVar.b(new s(this, 0));
        int i10 = 1;
        this.f6600c = lVar.b(new s(this, i10));
        this.f6601d = new om.i(lVar, new h(this, i10));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void h(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = TtmlNode.TAG_P;
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i10 == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i10 == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i10 != 12) {
            switch (i10) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // im.o, im.n
    public final Collection a(yl.f fVar, hl.b bVar) {
        if (fVar != null) {
            return (Collection) this.f6599b.invoke(fVar);
        }
        h(5);
        throw null;
    }

    @Override // im.o, im.n
    public final Set b() {
        Set set = (Set) this.f6602e.f6605i.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // im.o, im.p
    public final Collection d(im.f fVar, jk.b bVar) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.f6601d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // im.o, im.n
    public final Set e() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // im.o, im.n
    public final Collection f(yl.f fVar, hl.b bVar) {
        if (fVar != null) {
            return (Collection) this.f6600c.invoke(fVar);
        }
        h(1);
        throw null;
    }

    @Override // im.o, im.n
    public final Set g() {
        Set set = (Set) this.f6602e.f6605i.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final im.n i() {
        im.n nVarA = ((pm.y) ((pm.h) this.f6602e.n()).f().iterator().next()).A();
        if (nVarA != null) {
            return nVarA;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(yl.f fVar, Collection collection) {
        if (fVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bm.l.f5737c.h(fVar, collection, Collections.EMPTY_SET, this.f6602e, new t(linkedHashSet, 0));
        return linkedHashSet;
    }
}
