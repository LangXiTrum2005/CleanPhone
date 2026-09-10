package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DescriptorRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DescriptorRendererImpl f44237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DescriptorRendererImpl f44238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DescriptorRendererImpl f44239c;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[5] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[3] = 6;
                } catch (NoSuchFieldError unused6) {
                }
            }
        }

        public static DescriptorRendererImpl a(Function1 function1) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            function1.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.f44256a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    public interface ValueParametersHandler {

        public static final class DEFAULT implements ValueParametersHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DEFAULT f44240a = new DEFAULT();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void a(StringBuilder builder) {
                Intrinsics.f(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void b(ValueParameterDescriptor parameter, StringBuilder builder) {
                Intrinsics.f(parameter, "parameter");
                Intrinsics.f(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void c(ValueParameterDescriptor valueParameterDescriptor, int i2, int i3, StringBuilder builder) {
                Intrinsics.f(builder, "builder");
                if (i2 != i3 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void d(StringBuilder builder) {
                Intrinsics.f(builder, "builder");
                builder.append(")");
            }
        }

        void a(StringBuilder sb);

        void b(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb);

        void c(ValueParameterDescriptor valueParameterDescriptor, int i2, int i3, StringBuilder sb);

        void d(StringBuilder sb);
    }

    static {
        Companion.a(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.X);
        Companion.a(DescriptorRenderer$Companion$COMPACT$1.X);
        Companion.a(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.X);
        Companion.a(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.X);
        Companion.a(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.X);
        f44237a = Companion.a(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.X);
        Companion.a(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1.X);
        f44238b = Companion.a(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.X);
        f44239c = Companion.a(DescriptorRenderer$Companion$DEBUG_TEXT$1.X);
        Companion.a(DescriptorRenderer$Companion$HTML$1.X);
    }
}
