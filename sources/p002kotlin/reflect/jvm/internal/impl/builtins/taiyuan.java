package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.marial;
import byname.saneness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import patroclinal.formularize;

/* JADX INFO: compiled from: UnsignedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f29885attabal = new taiyuan();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final HashMap<UnsignedArrayType, marial> f29886beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Set<marial> f29887competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Set<marial> f29888dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final HashMap<saneness, saneness> f29889marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Set<marial> f29890saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final HashMap<saneness, saneness> f29891wireman;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f29890saneness = CollectionsKt.prefect(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        f29888dern = CollectionsKt.prefect(arrayList2);
        f29891wireman = new HashMap<>();
        f29889marial = new HashMap<>();
        f29886beachfront = seminary.apical(formularize.attabal(UnsignedArrayType.UBYTEARRAY, marial.cutely("ubyteArrayOf")), formularize.attabal(UnsignedArrayType.USHORTARRAY, marial.cutely("ushortArrayOf")), formularize.attabal(UnsignedArrayType.UINTARRAY, marial.cutely("uintArrayOf")), formularize.attabal(UnsignedArrayType.ULONGARRAY, marial.cutely("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().cutely());
        }
        f29887competently = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f29891wireman.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f29889marial.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    public static final boolean wireman(oilcan type) {
        beachfront beachfrontVarWireman;
        Intrinsics.checkNotNullParameter(type, "type");
        if (nosophobia.gintrap(type) || (beachfrontVarWireman = type.setterwort().wireman()) == null) {
            return false;
        }
        return f29885attabal.dern(beachfrontVarWireman);
    }

    public final saneness attabal(saneness arrayClassId) {
        Intrinsics.checkNotNullParameter(arrayClassId, "arrayClassId");
        return f29891wireman.get(arrayClassId);
    }

    public final boolean dern(apical descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        apical apicalVarSaneness = descriptor.saneness();
        return (apicalVarSaneness instanceof sealless) && Intrinsics.wireman(((sealless) apicalVarSaneness).marial(), competently.f29682preprohormone) && f29890saneness.contains(descriptor.getName());
    }

    public final boolean saneness(marial name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f29887competently.contains(name);
    }
}
