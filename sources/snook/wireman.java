package snook;

import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: ExtensionReceiver.java */
/* JADX INFO: loaded from: classes5.dex */
public class wireman extends attabal implements competently {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.descriptors.attabal f37702dern;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wireman(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, oilcan oilcanVar, competently competentlyVar) {
        super(oilcanVar, competentlyVar);
        if (attabalVar == null) {
            dern(0);
        }
        if (oilcanVar == null) {
            dern(1);
        }
        this.f37702dern = attabalVar;
    }

    public static /* synthetic */ void dern(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f37702dern + "}";
    }
}
