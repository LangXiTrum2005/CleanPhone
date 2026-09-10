package kotlinx.serialization.json.internal;

import com.charging.screenshow.battery.animations.themes.activity.f;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0000\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u001b\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0000\u001a&\u0010\u001c\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0000\u001ac\u0010\u001e\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00042!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b!\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001a0 2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0$H\u0080\bø\u0001\u0000\"&\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\" \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"JsonDeserializationNamesKey", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "", "", "", "getJsonDeserializationNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonSerializationNamesKey", "", "getJsonSerializationNamesKey", "buildDeserializationNamesMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "deserializationNamesMap", "descriptor", "serializationNamesIndices", com.smartdigimkt.m6.a.r.f36787A, "Lkotlinx/serialization/json/JsonNamingStrategy;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonNamingStrategy;)[Ljava/lang/String;", "getJsonElementName", "index", "namingStrategy", "getJsonNameIndexSlowPath", "name", "decodeCaseInsensitive", "", "getJsonNameIndex", "getJsonNameIndexOrThrow", "suffix", "tryCoerceValue", "peekNull", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "consume", "peekString", "Lkotlin/Function0;", "onEnumCoercing", "", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonNamesMapKt {
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key<>();
    private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = new DescriptorSchemaCache.Key<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor serialDescriptor, Json json) {
        String strSerialNameForJson;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zDecodeCaseInsensitive = decodeCaseInsensitive(json, serialDescriptor);
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i2 = 0; i2 < elementsCount; i2++) {
            List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementAnnotations) {
                if (obj instanceof JsonNames) {
                    arrayList.add(obj);
                }
            }
            JsonNames jsonNames = (JsonNames) CollectionsKt.Y(arrayList);
            if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                for (String lowerCase : strArrNames) {
                    if (zDecodeCaseInsensitive) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        Intrinsics.e(lowerCase, "toLowerCase(...)");
                    }
                    buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, lowerCase, i2);
                }
            }
            if (zDecodeCaseInsensitive) {
                strSerialNameForJson = serialDescriptor.getElementName(i2).toLowerCase(Locale.ROOT);
                Intrinsics.e(strSerialNameForJson, "toLowerCase(...)");
            } else {
                strSerialNameForJson = jsonNamingStrategyNamingStrategy != null ? jsonNamingStrategyNamingStrategy.serialNameForJson(serialDescriptor, i2, serialDescriptor.getElementName(i2)) : null;
            }
            if (strSerialNameForJson != null) {
                buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, strSerialNameForJson, i2);
            }
        }
        return linkedHashMap.isEmpty() ? EmptyMap.X : linkedHashMap;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i2) {
        String str2 = Intrinsics.a(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i2));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.getElementName(i2) + " is already one of the names for " + str2 + ' ' + serialDescriptor.getElementName(((Number) MapsKt.f(map, str)).intValue()) + " in " + serialDescriptor);
    }

    private static final boolean decodeCaseInsensitive(Json json, SerialDescriptor serialDescriptor) {
        return json.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.a(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE);
    }

    public static final Map<String, Integer> deserializationNamesMap(Json json, SerialDescriptor descriptor) {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(descriptor, "descriptor");
        return (Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(descriptor, JsonDeserializationNamesKey, new f(10, descriptor, json));
    }

    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    public static final String getJsonElementName(SerialDescriptor serialDescriptor, Json json, int i2) {
        Intrinsics.f(serialDescriptor, "<this>");
        Intrinsics.f(json, "json");
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        return jsonNamingStrategyNamingStrategy == null ? serialDescriptor.getElementName(i2) : serializationNamesIndices(serialDescriptor, json, jsonNamingStrategyNamingStrategy)[i2];
    }

    public static final int getJsonNameIndex(SerialDescriptor serialDescriptor, Json json, String name) {
        Intrinsics.f(serialDescriptor, "<this>");
        Intrinsics.f(json, "json");
        Intrinsics.f(name, "name");
        if (decodeCaseInsensitive(json, serialDescriptor)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "toLowerCase(...)");
            return getJsonNameIndexSlowPath(serialDescriptor, json, lowerCase);
        }
        if (namingStrategy(serialDescriptor, json) != null) {
            return getJsonNameIndexSlowPath(serialDescriptor, json, name);
        }
        int elementIndex = serialDescriptor.getElementIndex(name);
        return (elementIndex == -3 && json.getConfiguration().getUseAlternativeNames()) ? getJsonNameIndexSlowPath(serialDescriptor, json, name) : elementIndex;
    }

    public static final int getJsonNameIndexOrThrow(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        Intrinsics.f(serialDescriptor, "<this>");
        Intrinsics.f(json, "json");
        Intrinsics.f(name, "name");
        Intrinsics.f(suffix, "suffix");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, name);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    private static final int getJsonNameIndexSlowPath(SerialDescriptor serialDescriptor, Json json, String str) {
        Integer num = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    public static final JsonNamingStrategy namingStrategy(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.f(serialDescriptor, "<this>");
        Intrinsics.f(json, "json");
        if (Intrinsics.a(serialDescriptor.getKind(), StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    public static final String[] serializationNamesIndices(SerialDescriptor serialDescriptor, Json json, JsonNamingStrategy strategy) {
        Intrinsics.f(serialDescriptor, "<this>");
        Intrinsics.f(json, "json");
        Intrinsics.f(strategy, "strategy");
        return (String[]) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonSerializationNamesKey, new f(11, serialDescriptor, strategy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] serializationNamesIndices$lambda$4(SerialDescriptor serialDescriptor, JsonNamingStrategy jsonNamingStrategy) {
        int elementsCount = serialDescriptor.getElementsCount();
        String[] strArr = new String[elementsCount];
        for (int i2 = 0; i2 < elementsCount; i2++) {
            strArr[i2] = jsonNamingStrategy.serialNameForJson(serialDescriptor, i2, serialDescriptor.getElementName(i2));
        }
        return strArr;
    }

    public static final boolean tryCoerceValue(Json json, SerialDescriptor descriptor, int i2, Function1<? super Boolean, Boolean> peekNull, Function0<String> peekString, Function0<Unit> onEnumCoercing) {
        String str;
        Intrinsics.f(json, "<this>");
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(peekNull, "peekNull");
        Intrinsics.f(peekString, "peekString");
        Intrinsics.f(onEnumCoercing, "onEnumCoercing");
        boolean zIsElementOptional = descriptor.isElementOptional(i2);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i2);
        if (zIsElementOptional && !elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!Intrinsics.a(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) peekString.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        boolean z2 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z2)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor descriptor, int i2, Function1 peekNull, Function0 peekString, Function0 onEnumCoercing, int i3, Object obj) {
        String str;
        if ((i3 & 16) != 0) {
            onEnumCoercing = new Function0<Unit>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3383invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3383invoke();
                    return Unit.f43263a;
                }
            };
        }
        Intrinsics.f(json, "<this>");
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(peekNull, "peekNull");
        Intrinsics.f(peekString, "peekString");
        Intrinsics.f(onEnumCoercing, "onEnumCoercing");
        boolean zIsElementOptional = descriptor.isElementOptional(i2);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i2);
        if (zIsElementOptional && !elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!Intrinsics.a(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) peekString.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        boolean z2 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z2)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }
}
