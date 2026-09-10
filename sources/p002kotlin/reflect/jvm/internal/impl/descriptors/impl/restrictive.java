package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.taiyuan;

/* JADX INFO: compiled from: VariableDescriptorWithInitializerImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class restrictive extends supplicat {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public Function0<taiyuan<competently<?>>> f30157adultoid;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public taiyuan<competently<?>> f30158graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final boolean f30159molybdenite;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public restrictive(apical apicalVar, marial marialVar, byname.marial marialVar2, oilcan oilcanVar, boolean z, walach walachVar) {
        super(apicalVar, marialVar, marialVar2, oilcanVar, walachVar);
        if (apicalVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (marialVar2 == null) {
            timberyard(2);
        }
        if (walachVar == null) {
            timberyard(3);
        }
        this.f30159molybdenite = z;
    }

    private static /* synthetic */ void timberyard(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic
    public competently<?> lotta() {
        taiyuan<competently<?>> taiyuanVar = this.f30158graveside;
        if (taiyuanVar != null) {
            return taiyuanVar.invoke();
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic
    public boolean restrictive() {
        return this.f30159molybdenite;
    }

    public void setterwort(Function0<taiyuan<competently<?>>> function0) {
        if (function0 == null) {
            timberyard(4);
        }
        vesuvio(null, function0);
    }

    public void vesuvio(taiyuan<competently<?>> taiyuanVar, Function0<taiyuan<competently<?>>> function0) {
        if (function0 == null) {
            timberyard(5);
        }
        this.f30157adultoid = function0;
        if (taiyuanVar == null) {
            taiyuanVar = function0.invoke();
        }
        this.f30158graveside = taiyuanVar;
    }
}
