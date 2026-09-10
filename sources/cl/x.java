package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements zk.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pm.t0 f6608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zk.j f6609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public il.o f6611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk.s f6612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f6614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f6616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f6617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public pm.y f6618k;
    public yl.f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public xj.v f6624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public al.j f6625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6626t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f6627u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f6628v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f6630x;

    public x(y yVar, pm.t0 t0Var, zk.j jVar, int i10, il.o oVar, int i11, List list, List list2, z zVar, pm.y yVar2) {
        if (t0Var == null) {
            a(0);
            throw null;
        }
        if (jVar == null) {
            a(1);
            throw null;
        }
        if (i10 == 0) {
            a(2);
            throw null;
        }
        if (oVar == null) {
            a(3);
            throw null;
        }
        if (i11 == 0) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (yVar2 == null) {
            a(7);
            throw null;
        }
        this.f6630x = yVar;
        this.f6612e = null;
        this.f6617j = yVar.f6642j;
        this.f6619m = true;
        this.f6620n = false;
        this.f6621o = false;
        this.f6622p = false;
        this.f6623q = yVar.f6650s;
        this.f6624r = null;
        this.f6625s = null;
        this.f6626t = yVar.f6651t;
        this.f6627u = new LinkedHashMap();
        this.f6628v = null;
        this.f6629w = false;
        this.f6608a = t0Var;
        this.f6609b = jVar;
        this.f6610c = i10;
        this.f6611d = oVar;
        this.f6613f = i11;
        this.f6614g = list;
        this.f6615h = list2;
        this.f6616i = zVar;
        this.f6618k = yVar2;
        this.l = null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 40:
            case 41:
            case 42:
                i11 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 37:
            case 39:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[1] = "setOriginal";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i10) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // zk.r
    public final zk.r B() {
        this.f6620n = true;
        return this;
    }

    @Override // zk.r
    public final zk.r b(al.j jVar) {
        if (jVar != null) {
            this.f6625s = jVar;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // zk.r
    public final zk.s build() {
        return this.f6630x.M0(this);
    }

    @Override // zk.r
    public final zk.r c(List list) {
        this.f6614g = list;
        return this;
    }

    @Override // zk.r
    public final zk.r d(yl.f fVar) {
        if (fVar != null) {
            this.l = fVar;
            return this;
        }
        a(17);
        throw null;
    }

    @Override // zk.r
    public final zk.r e(int i10) {
        if (i10 != 0) {
            this.f6613f = i10;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // zk.r
    public final zk.r f(z zVar) {
        this.f6617j = zVar;
        return this;
    }

    @Override // zk.r
    public final zk.r h() {
        this.f6626t = true;
        return this;
    }

    @Override // zk.r
    public final zk.r i(zk.j jVar) {
        if (jVar != null) {
            this.f6609b = jVar;
            return this;
        }
        a(8);
        throw null;
    }

    @Override // zk.r
    public final zk.r j() {
        this.f6619m = false;
        return this;
    }

    @Override // zk.r
    public final zk.r m() {
        this.f6624r = xj.v.f53866a;
        return this;
    }

    @Override // zk.r
    public final zk.r n() {
        this.f6623q = true;
        return this;
    }

    @Override // zk.r
    public final zk.r o(pm.y yVar) {
        if (yVar != null) {
            this.f6618k = yVar;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // zk.r
    public final zk.r q(int i10) {
        if (i10 != 0) {
            this.f6610c = i10;
            return this;
        }
        a(10);
        throw null;
    }

    @Override // zk.r
    public final zk.r s() {
        this.f6621o = true;
        return this;
    }

    @Override // zk.r
    public final zk.r v() {
        this.f6627u.put(kl.e.G, Boolean.TRUE);
        return this;
    }

    @Override // zk.r
    public final zk.r y(il.o oVar) {
        if (oVar != null) {
            this.f6611d = oVar;
            return this;
        }
        a(12);
        throw null;
    }
}
