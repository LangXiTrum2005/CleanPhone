package p002kotlin.reflect.jvm.internal.impl.types;

import bren.dern;
import kurbash.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: AnnotationsTypeAttribute.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f31811attabal = {polloi.cutely(new PropertyReference1Impl(polloi.wireman(taiyuan.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern f31812saneness;

    static {
        dern dernVarDern = overspeculate.f31797arytenoidectomy.dern(polloi.saneness(impromptu.class));
        Intrinsics.competently(dernVarDern, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f31812saneness = dernVarDern;
    }

    public static final marial attabal(overspeculate overspeculateVar) {
        marial marialVarMarial;
        Intrinsics.checkNotNullParameter(overspeculateVar, "<this>");
        impromptu impromptuVarSaneness = saneness(overspeculateVar);
        return (impromptuVarSaneness == null || (marialVarMarial = impromptuVarSaneness.marial()) == null) ? marial.f29950impromptu.saneness() : marialVarMarial;
    }

    public static final impromptu saneness(overspeculate overspeculateVar) {
        Intrinsics.checkNotNullParameter(overspeculateVar, "<this>");
        return (impromptu) f31812saneness.getValue(overspeculateVar, f31811attabal[0]);
    }
}
