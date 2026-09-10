package methylmercury;

import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cuirassed;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impromptu;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.formularize;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.taiyuan;

/* JADX INFO: compiled from: JavaPropertyDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class marial extends cord implements attabal {

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public final boolean f33311creditor;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public oilcan f33312hydrovane;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public final Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> f33313starveling;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public marial(apical apicalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, Modality modality, molybdenite molybdeniteVar, boolean z, byname.marial marialVar2, walach walachVar, saran saranVar, CallableMemberDescriptor.Kind kind, boolean z2, Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> pair) {
        super(apicalVar, saranVar, marialVar, modality, molybdeniteVar, z, marialVar2, kind, walachVar, false, false, false, false, false, false);
        if (apicalVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (modality == null) {
            timberyard(2);
        }
        if (molybdeniteVar == null) {
            timberyard(3);
        }
        if (marialVar2 == null) {
            timberyard(4);
        }
        if (walachVar == null) {
            timberyard(5);
        }
        if (kind == null) {
            timberyard(6);
        }
        this.f33312hydrovane = null;
        this.f33311creditor = z2;
        this.f33313starveling = pair;
    }

    public static marial cig(apical apicalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, Modality modality, molybdenite molybdeniteVar, boolean z, byname.marial marialVar2, walach walachVar, boolean z2) {
        if (apicalVar == null) {
            timberyard(7);
        }
        if (marialVar == null) {
            timberyard(8);
        }
        if (modality == null) {
            timberyard(9);
        }
        if (molybdeniteVar == null) {
            timberyard(10);
        }
        if (marialVar2 == null) {
            timberyard(11);
        }
        if (walachVar == null) {
            timberyard(12);
        }
        return new marial(apicalVar, marialVar, modality, molybdeniteVar, z, marialVar2, walachVar, null, CallableMemberDescriptor.Kind.DECLARATION, z2, null);
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord, p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic
    public boolean isConst() {
        oilcan type = getType();
        if (this.f33311creditor && impromptu.attabal(type)) {
            return !formularize.taiyuan(type) || p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.palmyra(type);
        }
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord
    public cord lampshade(apical apicalVar, Modality modality, molybdenite molybdeniteVar, saran saranVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, walach walachVar) {
        if (apicalVar == null) {
            timberyard(13);
        }
        if (modality == null) {
            timberyard(14);
        }
        if (molybdeniteVar == null) {
            timberyard(15);
        }
        if (kind == null) {
            timberyard(16);
        }
        if (marialVar == null) {
            timberyard(17);
        }
        if (walachVar == null) {
            timberyard(18);
        }
        return new marial(apicalVar, getAnnotations(), modality, molybdeniteVar, restrictive(), marialVar, walachVar, saranVar, kind, this.f33311creditor, this.f33313starveling);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord
    public void licking(oilcan oilcanVar) {
        if (oilcanVar == null) {
            timberyard(22);
        }
        this.f33312hydrovane = oilcanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.supplicat, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public boolean premeiotic() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public <V> V preterite(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<V> interfaceC0672attabal) {
        Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> pair = this.f33313starveling;
        if (pair == null || !pair.getFirst().equals(interfaceC0672attabal)) {
            return null;
        }
        return (V) this.f33313starveling.getSecond();
    }

    @Override // methylmercury.attabal
    public attabal splinterproof(oilcan oilcanVar, List<oilcan> list, oilcan oilcanVar2, Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> pair) {
        cuirassed cuirassedVar;
        stratoscope stratoscopeVar;
        if (list == null) {
            timberyard(19);
        }
        if (oilcanVar2 == null) {
            timberyard(20);
        }
        saran saranVarAttabal = attabal() == this ? null : attabal();
        marial marialVar = new marial(saneness(), getAnnotations(), kowloon(), getVisibility(), restrictive(), getName(), competently(), saranVarAttabal, getKind(), this.f33311creditor, pair);
        cuirassed getter = getGetter();
        if (getter != null) {
            cuirassed cuirassedVar2 = new cuirassed(marialVar, getter.getAnnotations(), getter.kowloon(), getter.getVisibility(), getter.stratoscope(), getter.isExternal(), getter.isInline(), getKind(), saranVarAttabal == null ? null : saranVarAttabal.getGetter(), getter.competently());
            cuirassedVar2.mastfed(getter.sensatory());
            cuirassedVar2.lampshade(oilcanVar2);
            cuirassedVar = cuirassedVar2;
        } else {
            cuirassedVar = null;
        }
        creditor setter = getSetter();
        if (setter != null) {
            stratoscopeVar = new stratoscope(marialVar, setter.getAnnotations(), setter.kowloon(), setter.getVisibility(), setter.stratoscope(), setter.isExternal(), setter.isInline(), getKind(), saranVarAttabal == null ? null : saranVarAttabal.getSetter(), setter.competently());
            stratoscopeVar.mastfed(stratoscopeVar.sensatory());
            stratoscopeVar.libyan(setter.beachfront().get(0));
        } else {
            stratoscopeVar = null;
        }
        marialVar.basify(cuirassedVar, stratoscopeVar, igbo(), seminary());
        marialVar.microchemistry(tectonization());
        Function0<taiyuan<p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>> function0 = this.f30157adultoid;
        if (function0 != null) {
            marialVar.vesuvio(this.f30158graveside, function0);
        }
        marialVar.achondroplasia(wireman());
        marialVar.fastrack(oilcanVar2, getTypeParameters(), kattegat(), oilcanVar != null ? p002kotlin.reflect.jvm.internal.impl.resolve.wireman.taiyuan(this, oilcanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness()) : null, adultoid.formularize());
        return marialVar;
    }
}
