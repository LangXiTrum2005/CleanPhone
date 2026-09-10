package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public interface TypeAliasExpansionReportStrategy {

    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DO_NOTHING f44528a = new DO_NOTHING();

        public final void a(TypeAliasDescriptor typeAlias, UnwrappedType substitutedArgument) {
            Intrinsics.f(typeAlias, "typeAlias");
            Intrinsics.f(substitutedArgument, "substitutedArgument");
        }
    }
}
