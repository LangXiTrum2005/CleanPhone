package snook;

import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: TransientReceiver.java */
/* JADX INFO: loaded from: classes5.dex */
public class cutely extends attabal {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cutely(oilcan oilcanVar) {
        this(oilcanVar, null);
        if (oilcanVar == null) {
            dern(0);
        }
    }

    private static /* synthetic */ void dern(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutely(oilcan oilcanVar, competently competentlyVar) {
        super(oilcanVar, competentlyVar);
        if (oilcanVar == null) {
            dern(1);
        }
    }
}
