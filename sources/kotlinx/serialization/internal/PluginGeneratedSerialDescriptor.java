package kotlinx.serialization.internal;

import com.p004ironsource.x4;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\u0015J\u000e\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020\u0015J\u0010\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u0002092\u0006\u0010?\u001a\u00020\bH\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010C\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0004H\u0016J\u0014\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0'H\u0002J\u0013\u0010E\u001a\u0002092\b\u0010F\u001a\u0004\u0018\u00010GH\u0096\u0002J\b\u0010H\u001a\u00020\bH\u0016J\b\u0010I\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u001e\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d0\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0'X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b3\u0010\u000e¨\u0006J"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "serialName", "", "generatedSerializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "elementsCount", "", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "getSerialName", "()Ljava/lang/String;", "getElementsCount", "()I", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "added", "names", "", "[Ljava/lang/String;", "propertiesAnnotations", "", "[Ljava/util/List;", "classAnnotations", "elementsOptionality", "", "serialNames", "", "getSerialNames", "()Ljava/util/Set;", "indices", "", "childSerializers", "Lkotlinx/serialization/KSerializer;", "getChildSerializers", "()[Lkotlinx/serialization/KSerializer;", "childSerializers$delegate", "Lkotlin/Lazy;", "typeParameterDescriptors", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors$delegate", "_hashCode", "get_hashCode", "_hashCode$delegate", "addElement", "", "name", "isOptional", "", "pushAnnotation", "annotation", "pushClassAnnotation", "a", "getElementDescriptor", "index", "isElementOptional", "getElementAnnotations", "getElementName", "getElementIndex", "buildIndices", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "toString", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: _hashCode$delegate, reason: from kotlin metadata */
    private final Lazy _hashCode;
    private int added;

    /* JADX INFO: renamed from: childSerializers$delegate, reason: from kotlin metadata */
    private final Lazy childSerializers;
    private List<Annotation> classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    private final GeneratedSerializer<?> generatedSerializer;
    private Map<String, Integer> indices;
    private final String[] names;
    private final List<Annotation>[] propertiesAnnotations;
    private final String serialName;

    /* JADX INFO: renamed from: typeParameterDescriptors$delegate, reason: from kotlin metadata */
    private final Lazy typeParameterDescriptors;

    public PluginGeneratedSerialDescriptor(String serialName, GeneratedSerializer<?> generatedSerializer, int i2) {
        Intrinsics.f(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = i2;
        this.added = -1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i4 = this.elementsCount;
        this.propertiesAnnotations = new List[i4];
        this.elementsOptionality = new boolean[i4];
        this.indices = EmptyMap.X;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        final int i5 = 0;
        this.childSerializers = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlinx.serialization.internal.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f45121Y;

            {
                this.f45121Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f45121Y);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f45121Y);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f45121Y));
                }
            }
        });
        final int i6 = 1;
        this.typeParameterDescriptors = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlinx.serialization.internal.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f45121Y;

            {
                this.f45121Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f45121Y);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f45121Y);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f45121Y));
                }
            }
        });
        final int i7 = 2;
        this._hashCode = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlinx.serialization.internal.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f45121Y;

            {
                this.f45121Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f45121Y);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f45121Y);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f45121Y));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z2);
    }

    private final Map<String, Integer> buildIndices() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i2 = 0; i2 < length; i2++) {
            map.put(this.names[i2], Integer.valueOf(i2));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<?>[] kSerializerArrChildSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        return (generatedSerializer == null || (kSerializerArrChildSerializers = generatedSerializer.childSerializers()) == null) ? PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : kSerializerArrChildSerializers;
    }

    private final KSerializer<?>[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers.getX();
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode.getX()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$6(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i2) {
        return pluginGeneratedSerialDescriptor.getElementName(i2) + ": " + pluginGeneratedSerialDescriptor.getElementDescriptor(i2).getSerialName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        if (generatedSerializer == null || (kSerializerArrTypeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return Platform_commonKt.compactArray(arrayList);
    }

    public final void addElement(String name, boolean isOptional) {
        Intrinsics.f(name, "name");
        String[] strArr = this.names;
        int i2 = this.added + 1;
        this.added = i2;
        strArr[i2] = name;
        this.elementsOptionality[i2] = isOptional;
        this.propertiesAnnotations[i2] = null;
        if (i2 == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginGeneratedSerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        if (!Intrinsics.a(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) other).getTypeParameterDescriptors$kotlinx_serialization_core()) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i2 = 0; i2 < elementsCount; i2++) {
            if (!Intrinsics.a(getElementDescriptor(i2).getSerialName(), serialDescriptor.getElementDescriptor(i2).getSerialName()) || !Intrinsics.a(getElementDescriptor(i2).getKind(), serialDescriptor.getElementDescriptor(i2).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? EmptyList.X : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? EmptyList.X : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        return getChildSerializers()[index].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.f(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int index) {
        return this.names[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors.getX();
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.elementsOptionality[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    public final void pushAnnotation(Annotation annotation) {
        Intrinsics.f(annotation, "annotation");
        List<Annotation> arrayList = this.propertiesAnnotations[this.added];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.propertiesAnnotations[this.added] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(Annotation a2) {
        Intrinsics.f(a2, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        Intrinsics.c(list);
        list.add(a2);
    }

    public String toString() {
        return CollectionsKt.D(RangesKt.e(0, this.elementsCount), ", ", getSerialName() + '(', ")", new androidx.room.b(this, 21), 24);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : generatedSerializer, i2);
    }
}
