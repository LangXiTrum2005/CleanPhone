package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import genesis.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.kattegat;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.adultoid;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.apical;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.cutely;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.formularize;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.gintrap;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.graveside;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.impromptu;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.kowloon;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.rotuma;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import prescient.competently;

/* JADX INFO: compiled from: AnnotationDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trm f31469attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final NotFoundClasses f31470saneness;

    /* JADX INFO: compiled from: AnnotationDeserializer.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31471attabal;

        static {
            int[] iArr = new int[ProtoBuf$Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf$Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f31471attabal = iArr;
        }
    }

    public dern(trm module, NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f31469attabal = module;
        this.f31470saneness = notFoundClasses;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern attabal(ProtoBuf$Annotation proto, genesis.dern nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        wireman wiremanVarMarial = marial(graveside.attabal(nameResolver, proto.getId()));
        Map mapTaiyuan = seminary.taiyuan();
        if (proto.getArgumentCount() != 0 && !competently.impassible(wiremanVarMarial) && marial.graveside(wiremanVarMarial)) {
            Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.dern> collectionTaiyuan = wiremanVarMarial.taiyuan();
            Intrinsics.checkNotNullExpressionValue(collectionTaiyuan, "getConstructors(...)");
            p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVar = (p002kotlin.reflect.jvm.internal.impl.descriptors.dern) CollectionsKt.technofreak(collectionTaiyuan);
            if (dernVar != null) {
                List<cultivated> listBeachfront = dernVar.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                List<cultivated> list = listBeachfront;
                LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(dovishness.gintrap(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((cultivated) obj).getName(), obj);
                }
                List<ProtoBuf$Annotation.Argument> argumentList = proto.getArgumentList();
                Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf$Annotation.Argument argument : argumentList) {
                    Intrinsics.beachfront(argument);
                    Pair<byname.marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> pairWireman = wireman(argument, linkedHashMap, nameResolver);
                    if (pairWireman != null) {
                        arrayList.add(pairWireman);
                    }
                }
                mapTaiyuan = seminary.dovishness(arrayList);
            }
        }
        return new p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.wireman(wiremanVarMarial.impassible(), mapTaiyuan, walach.f30274attabal);
    }

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> beachfront(oilcan expectedType, ProtoBuf$Annotation.Argument.Value value, genesis.dern nameResolver) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Boolean boolWireman = saneness.f26679creditor.wireman(value.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        boolean zBooleanValue = boolWireman.booleanValue();
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : attabal.f31471attabal[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return zBooleanValue ? new adultoid(intValue) : new p002kotlin.reflect.jvm.internal.impl.resolve.constants.wireman(intValue);
            case 2:
                return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.marial((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                return zBooleanValue ? new rotuma(intValue2) : new molybdenite(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return zBooleanValue ? new p002kotlin.reflect.jvm.internal.impl.resolve.constants.dovishness(intValue3) : new formularize(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new gintrap(intValue4) : new arytenoidectomy(intValue4);
            case 6:
                return new apical(value.getFloatValue());
            case 7:
                return new impromptu(value.getDoubleValue());
            case 8:
                return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.dern(value.getIntValue() != 0);
            case 9:
                return new graveside(nameResolver.getString(value.getStringValue()));
            case 10:
                return new kowloon(graveside.attabal(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new taiyuan(graveside.attabal(nameResolver, value.getClassId()), graveside.saneness(nameResolver, value.getEnumValueId()));
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                Intrinsics.checkNotNullExpressionValue(annotation, "getAnnotation(...)");
                return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.attabal(attabal(annotation, nameResolver));
            case 13:
                ConstantValueFactory constantValueFactory = ConstantValueFactory.f31314attabal;
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                Intrinsics.checkNotNullExpressionValue(arrayElementList, "getArrayElementList(...)");
                List<ProtoBuf$Annotation.Argument.Value> list = arrayElementList;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : list) {
                    merc mercVarTaiyuan = dern().taiyuan();
                    Intrinsics.checkNotNullExpressionValue(mercVarTaiyuan, "getAnyType(...)");
                    Intrinsics.beachfront(value2);
                    arrayList.add(beachfront(mercVarTaiyuan, value2, nameResolver));
                }
                return constantValueFactory.saneness(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + expectedType + ')').toString());
        }
    }

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competently(oilcan oilcanVar, ProtoBuf$Annotation.Argument.Value value, genesis.dern dernVar) {
        p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVarBeachfront = beachfront(oilcanVar, value, dernVar);
        if (!saneness(competentlyVarBeachfront, oilcanVar, value)) {
            competentlyVarBeachfront = null;
        }
        if (competentlyVarBeachfront != null) {
            return competentlyVarBeachfront;
        }
        return cutely.f31326attabal.attabal("Unexpected argument value: actual type " + value.getType() + " != expected type " + oilcanVar);
    }

    public final beachfront dern() {
        return this.f31469attabal.apical();
    }

    public final wireman marial(byname.saneness sanenessVar) {
        return FindClassInModuleKt.dern(this.f31469attabal, sanenessVar, this.f31470saneness);
    }

    public final boolean saneness(p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVar, oilcan oilcanVar, ProtoBuf$Annotation.Argument.Value value) {
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : attabal.f31471attabal[type.ordinal()];
        if (i == 10) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
            wireman wiremanVar = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
            return wiremanVar == null || beachfront.empress(wiremanVar);
        }
        if (i != 13) {
            return Intrinsics.wireman(competentlyVar.attabal(this.f31469attabal), oilcanVar);
        }
        if (!(competentlyVar instanceof p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness) || ((p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness) competentlyVar).saneness().size() != value.getArrayElementList().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + competentlyVar).toString());
        }
        oilcan oilcanVarApical = dern().apical(oilcanVar);
        Intrinsics.checkNotNullExpressionValue(oilcanVarApical, "getArrayElementType(...)");
        p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness sanenessVar = (p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness) competentlyVar;
        Iterable iterableImpassible = p002kotlin.collections.adultoid.impassible(sanenessVar.saneness());
        if ((iterableImpassible instanceof Collection) && ((Collection) iterableImpassible).isEmpty()) {
            return true;
        }
        Iterator it = iterableImpassible.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kattegat) it).nextInt();
            p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVar2 = sanenessVar.saneness().get(iNextInt);
            ProtoBuf$Annotation.Argument.Value arrayElement = value.getArrayElement(iNextInt);
            Intrinsics.checkNotNullExpressionValue(arrayElement, "getArrayElement(...)");
            if (!saneness(competentlyVar2, oilcanVarApical, arrayElement)) {
                return false;
            }
        }
        return true;
    }

    public final Pair<byname.marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> wireman(ProtoBuf$Annotation.Argument argument, Map<byname.marial, ? extends cultivated> map, genesis.dern dernVar) {
        cultivated cultivatedVar = map.get(graveside.saneness(dernVar, argument.getNameId()));
        if (cultivatedVar == null) {
            return null;
        }
        byname.marial marialVarSaneness = graveside.saneness(dernVar, argument.getNameId());
        oilcan type = cultivatedVar.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        ProtoBuf$Annotation.Argument.Value value = argument.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return new Pair<>(marialVarSaneness, competently(type, value, dernVar));
    }
}
