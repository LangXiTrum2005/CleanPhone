package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lyreflower.marial;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import yeast.formularize;

/* JADX INFO: compiled from: AbstractClassTypeConstructor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class saneness extends AbstractTypeConstructor implements permissivist {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(formularize formularizeVar) {
        super(formularizeVar);
        if (formularizeVar == null) {
            dovishness(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    private static /* synthetic */ void dovishness(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.permissivist
    public beachfront apical() {
        beachfront beachfrontVarCutely = DescriptorUtilsKt.cutely(wireman());
        if (beachfrontVarCutely == null) {
            dovishness(1);
        }
        return beachfrontVarCutely;
    }

    /* JADX INFO: renamed from: gintrap */
    public abstract wireman wireman();

    @Override // p002kotlin.reflect.jvm.internal.impl.types.apical
    public boolean impromptu(p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVar) {
        if (beachfrontVar == null) {
            dovishness(2);
        }
        return (beachfrontVar instanceof wireman) && beachfront(wireman(), beachfrontVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public Collection<oilcan> kowloon(boolean z) {
        apical apicalVarSaneness = wireman().saneness();
        if (!(apicalVarSaneness instanceof wireman)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                dovishness(3);
            }
            return list;
        }
        marial marialVar = new marial();
        wireman wiremanVar = (wireman) apicalVarSaneness;
        marialVar.add(wiremanVar.impassible());
        wireman wiremanVarNosophobia = wiremanVar.nosophobia();
        if (z && wiremanVarNosophobia != null) {
            marialVar.add(wiremanVarNosophobia.impassible());
        }
        return marialVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public oilcan triweekly() {
        if (beachfront.picketboat(wireman())) {
            return null;
        }
        return apical().taiyuan();
    }
}
