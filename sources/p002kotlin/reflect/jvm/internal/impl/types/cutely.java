package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import yeast.formularize;

/* JADX INFO: compiled from: ClassTypeConstructorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class cutely extends saneness implements permissivist {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Collection<oilcan> f31748beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<clubfoot> f31749marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final wireman f31750wireman;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutely(wireman wiremanVar, List<? extends clubfoot> list, Collection<oilcan> collection2, formularize formularizeVar) {
        super(formularizeVar);
        if (wiremanVar == null) {
            dovishness(0);
        }
        if (list == null) {
            dovishness(1);
        }
        if (collection2 == null) {
            dovishness(2);
        }
        if (formularizeVar == null) {
            dovishness(3);
        }
        this.f31750wireman = wiremanVar;
        this.f31749marial = Collections.unmodifiableList(new ArrayList(list));
        this.f31748beachfront = Collections.unmodifiableCollection(collection2);
    }

    public static /* synthetic */ void dovishness(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public List<clubfoot> getParameters() {
        List<clubfoot> list = this.f31749marial;
        if (list == null) {
            dovishness(4);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.apical, p002kotlin.reflect.jvm.internal.impl.types.permissivist
    /* JADX INFO: renamed from: gintrap */
    public wireman wireman() {
        wireman wiremanVar = this.f31750wireman;
        if (wiremanVar == null) {
            dovishness(5);
        }
        return wiremanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public Collection<oilcan> impassible() {
        Collection<oilcan> collection2 = this.f31748beachfront;
        if (collection2 == null) {
            dovishness(6);
        }
        return collection2;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public boolean marial() {
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public splinterproof monoploid() {
        splinterproof.attabal attabalVar = splinterproof.attabal.f30272attabal;
        if (attabalVar == null) {
            dovishness(7);
        }
        return attabalVar;
    }

    public String toString() {
        return marial.impassible(this.f31750wireman).saneness();
    }
}
