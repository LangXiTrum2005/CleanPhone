package droppable;

import byname.dern;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: BuiltInSerializerProtocol.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends haemopoiesis.attabal {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final attabal f25374polloi = new attabal();

    /* JADX WARN: Illegal instructions before constructor call */
    public attabal() {
        beachfront beachfrontVarWireman = beachfront.wireman();
        recumbency.saneness.attabal(beachfrontVarWireman);
        Intrinsics.checkNotNullExpressionValue(beachfrontVarWireman, "apply(...)");
        GeneratedMessageLite.marial<ProtoBuf$Package, Integer> packageFqName = recumbency.saneness.f36073attabal;
        Intrinsics.checkNotNullExpressionValue(packageFqName, "packageFqName");
        GeneratedMessageLite.marial<ProtoBuf$Constructor, List<ProtoBuf$Annotation>> constructorAnnotation = recumbency.saneness.f36077dern;
        Intrinsics.checkNotNullExpressionValue(constructorAnnotation, "constructorAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$Class, List<ProtoBuf$Annotation>> classAnnotation = recumbency.saneness.f36081saneness;
        Intrinsics.checkNotNullExpressionValue(classAnnotation, "classAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$Function, List<ProtoBuf$Annotation>> functionAnnotation = recumbency.saneness.f36083wireman;
        Intrinsics.checkNotNullExpressionValue(functionAnnotation, "functionAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$Property, List<ProtoBuf$Annotation>> propertyAnnotation = recumbency.saneness.f36080marial;
        Intrinsics.checkNotNullExpressionValue(propertyAnnotation, "propertyAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$Property, List<ProtoBuf$Annotation>> propertyGetterAnnotation = recumbency.saneness.f36074beachfront;
        Intrinsics.checkNotNullExpressionValue(propertyGetterAnnotation, "propertyGetterAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$Property, List<ProtoBuf$Annotation>> propertySetterAnnotation = recumbency.saneness.f36075competently;
        Intrinsics.checkNotNullExpressionValue(propertySetterAnnotation, "propertySetterAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$EnumEntry, List<ProtoBuf$Annotation>> enumEntryAnnotation = recumbency.saneness.f36082taiyuan;
        Intrinsics.checkNotNullExpressionValue(enumEntryAnnotation, "enumEntryAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$Property, ProtoBuf$Annotation.Argument.Value> compileTimeValue = recumbency.saneness.f36079impromptu;
        Intrinsics.checkNotNullExpressionValue(compileTimeValue, "compileTimeValue");
        GeneratedMessageLite.marial<ProtoBuf$ValueParameter, List<ProtoBuf$Annotation>> parameterAnnotation = recumbency.saneness.f36076cutely;
        Intrinsics.checkNotNullExpressionValue(parameterAnnotation, "parameterAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$Type, List<ProtoBuf$Annotation>> typeAnnotation = recumbency.saneness.f36072apical;
        Intrinsics.checkNotNullExpressionValue(typeAnnotation, "typeAnnotation");
        GeneratedMessageLite.marial<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> typeParameterAnnotation = recumbency.saneness.f36078formularize;
        Intrinsics.checkNotNullExpressionValue(typeParameterAnnotation, "typeParameterAnnotation");
        super(beachfrontVarWireman, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, null, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, null, null, null, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public final String molybdenite(dern dernVar) {
        if (dernVar.wireman()) {
            return "default-package";
        }
        String strDern = dernVar.competently().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return strDern;
    }

    public final String monoploid(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return molybdenite(fqName) + ".kotlin_builtins";
    }

    public final String polloi(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        String strSaneness = fqName.saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        sb.append(dovishness.merc(strSaneness, '.', '/', false, 4, null));
        sb.append('/');
        sb.append(monoploid(fqName));
        return sb.toString();
    }
}
