package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class coi extends oilcan {
    public coi() {
        super(null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public List<timberyard> dhss() {
        return lampshade().dhss();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public MemberScope formularize() {
        return lampshade().formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public final empress homozygous() {
        oilcan oilcanVarLampshade = lampshade();
        while (oilcanVarLampshade instanceof coi) {
            oilcanVarLampshade = ((coi) oilcanVarLampshade).lampshade();
        }
        Intrinsics.competently(oilcanVarLampshade, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (empress) oilcanVarLampshade;
    }

    public abstract oilcan lampshade();

    public abstract boolean libyan();

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return lampshade().mastfed();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public permissivist setterwort() {
        return lampshade().setterwort();
    }

    public String toString() {
        return libyan() ? lampshade().toString() : "<Not computed yet>";
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public overspeculate vesuvio() {
        return lampshade().vesuvio();
    }
}
