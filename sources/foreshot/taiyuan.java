package foreshot;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: JvmProtoBufUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f26288attabal = new taiyuan();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront f26289saneness;

    static {
        p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront beachfrontVarWireman = p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront.wireman();
        JvmProtoBuf.attabal(beachfrontVarWireman);
        Intrinsics.checkNotNullExpressionValue(beachfrontVarWireman, "apply(...)");
        f26289saneness = beachfrontVarWireman;
    }

    public static final boolean beachfront(ProtoBuf$Property proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        genesis.saneness.C0617saneness c0617sanenessAttabal = dern.f26276attabal.attabal();
        Object extension = proto.getExtension(JvmProtoBuf.f31033marial);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        Boolean boolWireman = c0617sanenessAttabal.wireman(((Number) extension).intValue());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        return boolWireman.booleanValue();
    }

    public static final Pair<beachfront, ProtoBuf$Function> cutely(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(attabal.marial(data));
        return new Pair<>(f26288attabal.apical(byteArrayInputStream, strings), ProtoBuf$Function.parseFrom(byteArrayInputStream, f26289saneness));
    }

    public static final Pair<beachfront, ProtoBuf$Package> formularize(byte[] bytes, String[] strings) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f26288attabal.apical(byteArrayInputStream, strings), ProtoBuf$Package.parseFrom(byteArrayInputStream, f26289saneness));
    }

    public static final Pair<beachfront, ProtoBuf$Package> impassible(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bArrMarial = attabal.marial(data);
        Intrinsics.checkNotNullExpressionValue(bArrMarial, "decodeBytes(...)");
        return formularize(bArrMarial, strings);
    }

    public static final Pair<beachfront, ProtoBuf$Class> impromptu(byte[] bytes, String[] strings) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f26288attabal.apical(byteArrayInputStream, strings), ProtoBuf$Class.parseFrom(byteArrayInputStream, f26289saneness));
    }

    public static final Pair<beachfront, ProtoBuf$Class> taiyuan(String[] data, String[] strings) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        byte[] bArrMarial = attabal.marial(data);
        Intrinsics.checkNotNullExpressionValue(bArrMarial, "decodeBytes(...)");
        return impromptu(bArrMarial, strings);
    }

    public static /* synthetic */ wireman.attabal wireman(taiyuan taiyuanVar, ProtoBuf$Property protoBuf$Property, genesis.dern dernVar, genesis.competently competentlyVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return taiyuanVar.dern(protoBuf$Property, dernVar, competentlyVar, z);
    }

    public final beachfront apical(InputStream inputStream, String[] strArr) throws IOException {
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, f26289saneness);
        Intrinsics.checkNotNullExpressionValue(delimitedFrom, "parseDelimitedFrom(...)");
        return new beachfront(delimitedFrom, strArr);
    }

    public final p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront attabal() {
        return f26289saneness;
    }

    public final String competently(ProtoBuf$Type protoBuf$Type, genesis.dern dernVar) {
        if (protoBuf$Type.hasClassName()) {
            return saneness.saneness(dernVar.saneness(protoBuf$Type.getClassName()));
        }
        return null;
    }

    public final wireman.attabal dern(ProtoBuf$Property proto, genesis.dern nameResolver, genesis.competently typeTable, boolean z) {
        String strCompetently;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        GeneratedMessageLite.marial<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f31037wireman;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) genesis.marial.attabal(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? proto.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            strCompetently = competently(genesis.beachfront.triweekly(proto, typeTable), nameResolver);
            if (strCompetently == null) {
                return null;
            }
        } else {
            strCompetently = nameResolver.getString(field.getDesc());
        }
        return new wireman.attabal(nameResolver.getString(name), strCompetently);
    }

    public final wireman.saneness marial(ProtoBuf$Function proto, genesis.dern nameResolver, genesis.competently typeTable) {
        String string;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        GeneratedMessageLite.marial<ProtoBuf$Function, JvmProtoBuf.JvmMethodSignature> methodSignature = JvmProtoBuf.f31034saneness;
        Intrinsics.checkNotNullExpressionValue(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) genesis.marial.attabal(proto, methodSignature);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? proto.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List listArytenoidectomy = adultoid.arytenoidectomy(genesis.beachfront.apical(proto, typeTable));
            List<ProtoBuf$ValueParameter> valueParameterList = proto.getValueParameterList();
            Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf$ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                Intrinsics.beachfront(protoBuf$ValueParameter);
                arrayList.add(genesis.beachfront.monoploid(protoBuf$ValueParameter, typeTable));
            }
            List listUnconsolidated = CollectionsKt.unconsolidated(listArytenoidectomy, arrayList);
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(listUnconsolidated, 10));
            Iterator it = listUnconsolidated.iterator();
            while (it.hasNext()) {
                String strCompetently = f26288attabal.competently((ProtoBuf$Type) it.next(), nameResolver);
                if (strCompetently == null) {
                    return null;
                }
                arrayList2.add(strCompetently);
            }
            String strCompetently2 = competently(genesis.beachfront.impassible(proto, typeTable), nameResolver);
            if (strCompetently2 == null) {
                return null;
            }
            string = CollectionsKt.preterite(arrayList2, "", "(", ")", 0, null, null, 56, null) + strCompetently2;
        } else {
            string = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new wireman.saneness(nameResolver.getString(name), string);
    }

    public final wireman.saneness saneness(ProtoBuf$Constructor proto, genesis.dern nameResolver, genesis.competently typeTable) {
        String strPreterite;
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        GeneratedMessageLite.marial<ProtoBuf$Constructor, JvmProtoBuf.JvmMethodSignature> constructorSignature = JvmProtoBuf.f31025attabal;
        Intrinsics.checkNotNullExpressionValue(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) genesis.marial.attabal(proto, constructorSignature);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf$ValueParameter> valueParameterList = proto.getValueParameterList();
            Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
            List<ProtoBuf$ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                taiyuan taiyuanVar = f26288attabal;
                Intrinsics.beachfront(protoBuf$ValueParameter);
                String strCompetently = taiyuanVar.competently(genesis.beachfront.monoploid(protoBuf$ValueParameter, typeTable), nameResolver);
                if (strCompetently == null) {
                    return null;
                }
                arrayList.add(strCompetently);
            }
            strPreterite = CollectionsKt.preterite(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strPreterite = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new wireman.saneness(string, strPreterite);
    }
}
