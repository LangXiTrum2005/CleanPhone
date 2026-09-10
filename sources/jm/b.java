package jm;

import pm.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk.b f43989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zk.b bVar, y yVar) {
        super(yVar);
        if (bVar == null) {
            z0(0);
            throw null;
        }
        if (yVar == null) {
            z0(1);
            throw null;
        }
        this.f43989b = bVar;
    }

    public static /* synthetic */ void z0(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f43989b + "}";
    }
}
