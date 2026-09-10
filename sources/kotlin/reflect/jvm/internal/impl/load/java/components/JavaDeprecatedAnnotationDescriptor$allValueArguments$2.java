package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

/* JADX INFO: loaded from: classes7.dex */
final class JavaDeprecatedAnnotationDescriptor$allValueArguments$2 extends Lambda implements Function0<Map<Name, ? extends StringValue>> {
    public static final JavaDeprecatedAnnotationDescriptor$allValueArguments$2 X = new JavaDeprecatedAnnotationDescriptor$allValueArguments$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.i(new Pair(JavaAnnotationMapper.f43807a, new StringValue("Deprecated in Java")));
    }
}
