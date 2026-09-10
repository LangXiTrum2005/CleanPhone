package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Name f43610a = Name.g(PglCryptUtils.KEY_MESSAGE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Name f43611b = Name.g("replaceWith");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Name f43612c = Name.g(AppLovinEventTypes.USER_COMPLETED_LEVEL);
    public static final Name d = Name.g("expression");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Name f43613e = Name.g("imports");

    public static BuiltInAnnotationDescriptor a(final KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.f(kotlinBuiltIns, "<this>");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.o, MapsKt.j(new Pair(d, new StringValue("")), new Pair(f43613e, new ArrayValue(EmptyList.X, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModuleDescriptor module = (ModuleDescriptor) obj;
                Intrinsics.f(module, "module");
                return module.k().g(kotlinBuiltIns.t());
            }
        }))));
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.m, MapsKt.j(new Pair(f43610a, new StringValue("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new Pair(f43611b, new AnnotationValue((Object) builtInAnnotationDescriptor)), new Pair(f43612c, new EnumValue(ClassId.j(StandardNames.FqNames.f43503n), Name.g("WARNING")))));
    }
}
