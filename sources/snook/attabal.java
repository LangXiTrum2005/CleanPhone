package snook;

import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: AbstractReceiverValue.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class attabal implements competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final oilcan f37693attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f37694saneness;

    public attabal(oilcan oilcanVar, competently competentlyVar) {
        if (oilcanVar == null) {
            dern(0);
        }
        this.f37693attabal = oilcanVar;
        this.f37694saneness = competentlyVar == null ? this : competentlyVar;
    }

    private static /* synthetic */ void dern(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // snook.competently
    public oilcan getType() {
        oilcan oilcanVar = this.f37693attabal;
        if (oilcanVar == null) {
            dern(1);
        }
        return oilcanVar;
    }
}
