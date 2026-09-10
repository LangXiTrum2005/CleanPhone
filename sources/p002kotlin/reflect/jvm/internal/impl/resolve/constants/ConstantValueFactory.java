package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: ConstantValueFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ConstantValueFactory {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ConstantValueFactory f31314attabal = new ConstantValueFactory();

    public static /* synthetic */ competently wireman(ConstantValueFactory constantValueFactory, Object obj, trm trmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            trmVar = null;
        }
        return constantValueFactory.dern(obj, trmVar);
    }

    public final saneness attabal(List<?> list, trm trmVar, final PrimitiveType primitiveType) {
        List listMolet = CollectionsKt.molet(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listMolet.iterator();
        while (it.hasNext()) {
            competently competentlyVarWireman = wireman(this, it.next(), null, 2, null);
            if (competentlyVarWireman != null) {
                arrayList.add(competentlyVarWireman);
            }
        }
        if (trmVar == null) {
            return new saneness(arrayList, new Function1<trm, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final oilcan invoke(trm it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    merc mercVarPrivatdozent = it2.apical().privatdozent(primitiveType);
                    Intrinsics.checkNotNullExpressionValue(mercVarPrivatdozent, "getPrimitiveArrayKotlinType(...)");
                    return mercVarPrivatdozent;
                }
            });
        }
        merc mercVarPrivatdozent = trmVar.apical().privatdozent(primitiveType);
        Intrinsics.checkNotNullExpressionValue(mercVarPrivatdozent, "getPrimitiveArrayKotlinType(...)");
        return new TypedArrayValue(arrayList, mercVarPrivatdozent);
    }

    public final competently<?> dern(Object obj, trm trmVar) {
        if (obj instanceof Byte) {
            return new wireman(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new molybdenite(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new formularize(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new arytenoidectomy(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new marial(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new apical(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new impromptu(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new dern(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new graveside((String) obj);
        }
        if (obj instanceof byte[]) {
            return attabal(polloi.picketboat((byte[]) obj), trmVar, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return attabal(polloi.claque((short[]) obj), trmVar, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return attabal(polloi.julian((int[]) obj), trmVar, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return attabal(polloi.achondroplasia((long[]) obj), trmVar, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return attabal(polloi.palmyra((char[]) obj), trmVar, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return attabal(polloi.monroe((float[]) obj), trmVar, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return attabal(polloi.lightstruck((double[]) obj), trmVar, PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return attabal(polloi.hardpan((boolean[]) obj), trmVar, PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new monoploid();
        }
        return null;
    }

    public final saneness saneness(List<? extends competently<?>> value, oilcan type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TypedArrayValue(value, type);
    }
}
