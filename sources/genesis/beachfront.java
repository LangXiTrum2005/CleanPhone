package genesis;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;

/* JADX INFO: compiled from: protoTypeTableUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {
    public static final ProtoBuf$Type apical(ProtoBuf$Function protoBuf$Function, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Function.hasReceiverType()) {
            return protoBuf$Function.getReceiverType();
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            return typeTable.attabal(protoBuf$Function.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf$Type arytenoidectomy(ProtoBuf$Type.Argument argument, competently typeTable) {
        Intrinsics.checkNotNullParameter(argument, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.attabal(argument.getTypeId());
        }
        return null;
    }

    public static final ProtoBuf$Type attabal(ProtoBuf$Type protoBuf$Type, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Type.hasAbbreviatedType()) {
            return protoBuf$Type.getAbbreviatedType();
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            return typeTable.attabal(protoBuf$Type.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final ProtoBuf$Type beachfront(ProtoBuf$Type protoBuf$Type, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            return protoBuf$Type.getFlexibleUpperBound();
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            return typeTable.attabal(protoBuf$Type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean competently(ProtoBuf$Function protoBuf$Function) {
        Intrinsics.checkNotNullParameter(protoBuf$Function, "<this>");
        return protoBuf$Function.hasReceiverType() || protoBuf$Function.hasReceiverTypeId();
    }

    public static final ProtoBuf$Type cutely(ProtoBuf$Type protoBuf$Type, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Type.hasOuterType()) {
            return protoBuf$Type.getOuterType();
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            return typeTable.attabal(protoBuf$Type.getOuterTypeId());
        }
        return null;
    }

    public static final List<ProtoBuf$Type> dern(ProtoBuf$Function protoBuf$Function, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Function.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(dovishness.gintrap(list, 10));
            for (Integer num : list) {
                Intrinsics.beachfront(num);
                contextReceiverTypeList.add(typeTable.attabal(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final ProtoBuf$Type formularize(ProtoBuf$Property protoBuf$Property, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Property.hasReceiverType()) {
            return protoBuf$Property.getReceiverType();
        }
        if (protoBuf$Property.hasReceiverTypeId()) {
            return typeTable.attabal(protoBuf$Property.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf$Type graveside(ProtoBuf$ValueParameter protoBuf$ValueParameter, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$ValueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            return protoBuf$ValueParameter.getVarargElementType();
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            return typeTable.attabal(protoBuf$ValueParameter.getVarargElementTypeId());
        }
        return null;
    }

    public static final ProtoBuf$Type impassible(ProtoBuf$Function protoBuf$Function, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }
        if (protoBuf$Function.hasReturnTypeId()) {
            return typeTable.attabal(protoBuf$Function.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final boolean impromptu(ProtoBuf$Property protoBuf$Property) {
        Intrinsics.checkNotNullParameter(protoBuf$Property, "<this>");
        return protoBuf$Property.hasReceiverType() || protoBuf$Property.hasReceiverTypeId();
    }

    public static final List<ProtoBuf$Type> kowloon(ProtoBuf$Class protoBuf$Class, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Class, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf$Type> supertypeList = protoBuf$Class.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = protoBuf$Class.getSupertypeIdList();
            Intrinsics.checkNotNullExpressionValue(supertypeIdList, "getSupertypeIdList(...)");
            List<Integer> list = supertypeIdList;
            supertypeList = new ArrayList<>(dovishness.gintrap(list, 10));
            for (Integer num : list) {
                Intrinsics.beachfront(num);
                supertypeList.add(typeTable.attabal(num.intValue()));
            }
        }
        return supertypeList;
    }

    public static final ProtoBuf$Type marial(ProtoBuf$TypeAlias protoBuf$TypeAlias, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            Intrinsics.checkNotNullExpressionValue(expandedType, "getExpandedType(...)");
            return expandedType;
        }
        if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            return typeTable.attabal(protoBuf$TypeAlias.getExpandedTypeId());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final List<ProtoBuf$Type> molybdenite(ProtoBuf$TypeParameter protoBuf$TypeParameter, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf$Type> upperBoundList = protoBuf$TypeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = protoBuf$TypeParameter.getUpperBoundIdList();
            Intrinsics.checkNotNullExpressionValue(upperBoundIdList, "getUpperBoundIdList(...)");
            List<Integer> list = upperBoundIdList;
            upperBoundList = new ArrayList<>(dovishness.gintrap(list, 10));
            for (Integer num : list) {
                Intrinsics.beachfront(num);
                upperBoundList.add(typeTable.attabal(num.intValue()));
            }
        }
        return upperBoundList;
    }

    public static final ProtoBuf$Type monoploid(ProtoBuf$ValueParameter protoBuf$ValueParameter, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$ValueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }
        if (protoBuf$ValueParameter.hasTypeId()) {
            return typeTable.attabal(protoBuf$ValueParameter.getTypeId());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final ProtoBuf$Type polloi(ProtoBuf$TypeAlias protoBuf$TypeAlias, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            Intrinsics.checkNotNullExpressionValue(underlyingType, "getUnderlyingType(...)");
            return underlyingType;
        }
        if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            return typeTable.attabal(protoBuf$TypeAlias.getUnderlyingTypeId());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List<ProtoBuf$Type> saneness(ProtoBuf$Class protoBuf$Class, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Class, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Class.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Class.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(dovishness.gintrap(list, 10));
            for (Integer num : list) {
                Intrinsics.beachfront(num);
                contextReceiverTypeList.add(typeTable.attabal(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    public static final ProtoBuf$Type taiyuan(ProtoBuf$Class protoBuf$Class, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Class, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Class.hasInlineClassUnderlyingType()) {
            return protoBuf$Class.getInlineClassUnderlyingType();
        }
        if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
            return typeTable.attabal(protoBuf$Class.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final ProtoBuf$Type triweekly(ProtoBuf$Property protoBuf$Property, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (protoBuf$Property.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Property.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }
        if (protoBuf$Property.hasReturnTypeId()) {
            return typeTable.attabal(protoBuf$Property.getReturnTypeId());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List<ProtoBuf$Type> wireman(ProtoBuf$Property protoBuf$Property, competently typeTable) {
        Intrinsics.checkNotNullParameter(protoBuf$Property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Property.getContextReceiverTypeIdList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeIdList, "getContextReceiverTypeIdList(...)");
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(dovishness.gintrap(list, 10));
            for (Integer num : list) {
                Intrinsics.beachfront(num);
                contextReceiverTypeList.add(typeTable.attabal(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }
}
