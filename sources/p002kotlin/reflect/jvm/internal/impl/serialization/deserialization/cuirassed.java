package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.marial;
import genesis.beachfront;
import genesis.competently;
import genesis.dern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.gintrap;
import p002kotlin.reflect.jvm.internal.impl.descriptors.oilcan;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import patroclinal.formularize;
import presbytery.impromptu;

/* JADX INFO: compiled from: ValueClassUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cuirassed {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends impromptu> dent<T> attabal(ProtoBuf$Class protoBuf$Class, dern nameResolver, competently typeTable, Function1<? super ProtoBuf$Type, ? extends T> typeDeserializer, Function1<? super marial, ? extends T> typeOfPublicProperty) {
        T tInvoke;
        List<ProtoBuf$Type> multiFieldValueClassUnderlyingTypeList;
        Intrinsics.checkNotNullParameter(protoBuf$Class, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (protoBuf$Class.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!protoBuf$Class.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            marial marialVarSaneness = graveside.saneness(nameResolver, protoBuf$Class.getInlineClassUnderlyingPropertyName());
            ProtoBuf$Type protoBuf$TypeTaiyuan = beachfront.taiyuan(protoBuf$Class, typeTable);
            if ((protoBuf$TypeTaiyuan != null && (tInvoke = typeDeserializer.invoke(protoBuf$TypeTaiyuan)) != null) || (tInvoke = typeOfPublicProperty.invoke(marialVarSaneness)) != null) {
                return new gintrap(marialVarSaneness, tInvoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + graveside.saneness(nameResolver, protoBuf$Class.getFqName()) + " with property " + marialVarSaneness).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = protoBuf$Class.getMultiFieldValueClassUnderlyingNameList();
        Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        for (Integer num : list) {
            Intrinsics.beachfront(num);
            arrayList.add(graveside.saneness(nameResolver, num.intValue()));
        }
        Pair pairAttabal = formularize.attabal(Integer.valueOf(protoBuf$Class.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(protoBuf$Class.getMultiFieldValueClassUnderlyingTypeCount()));
        if (Intrinsics.wireman(pairAttabal, formularize.attabal(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = protoBuf$Class.getMultiFieldValueClassUnderlyingTypeIdList();
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            multiFieldValueClassUnderlyingTypeList = new ArrayList<>(dovishness.gintrap(list2, 10));
            for (Integer num2 : list2) {
                Intrinsics.beachfront(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.attabal(num2.intValue()));
            }
        } else {
            if (!Intrinsics.wireman(pairAttabal, formularize.attabal(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + graveside.saneness(nameResolver, protoBuf$Class.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = protoBuf$Class.getMultiFieldValueClassUnderlyingTypeList();
        }
        Intrinsics.beachfront(multiFieldValueClassUnderlyingTypeList);
        List<ProtoBuf$Type> list3 = multiFieldValueClassUnderlyingTypeList;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new oilcan(CollectionsKt.fastrack(arrayList, arrayList2));
    }
}
