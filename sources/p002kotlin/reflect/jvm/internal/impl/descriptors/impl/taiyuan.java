package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.marial;
import com.ironsource.X3;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.saneness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: compiled from: DeclarationDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class taiyuan extends saneness implements apical {
    private final marial name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taiyuan(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, marial marialVar2) {
        super(marialVar);
        if (marialVar == null) {
            timberyard(0);
        }
        if (marialVar2 == null) {
            timberyard(1);
        }
        this.name = marialVar2;
    }

    public static String itchy(apical apicalVar) {
        if (apicalVar == null) {
            timberyard(4);
        }
        try {
            String str = DescriptorRenderer.f31199cutely.kowloon(apicalVar) + X3.j.d + apicalVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(apicalVar)) + X3.j.e;
            if (str == null) {
                timberyard(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = apicalVar.getClass().getSimpleName() + " " + apicalVar.getName();
            if (str2 == null) {
                timberyard(6);
            }
            return str2;
        }
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.yemenite
    public marial getName() {
        marial marialVar = this.name;
        if (marialVar == null) {
            timberyard(2);
        }
        return marialVar;
    }

    public String toString() {
        return itchy(this);
    }

    public apical attabal() {
        return this;
    }
}
