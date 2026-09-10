package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public interface MemberScope extends ResolutionScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f44348a = Companion.f44349a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f44349a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Function1 f44350b = null;

        public static Function1 a() {
            return MemberScope$Companion$ALL_NAME_FILTER$1.X;
        }
    }

    public static final class DefaultImpls {
    }

    public static final class Empty extends MemberScopeImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Empty f44351b = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set a() {
            return EmptySet.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set c() {
            return EmptySet.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set e() {
            return EmptySet.X;
        }
    }

    Set a();

    Collection b(Name name, NoLookupLocation noLookupLocation);

    Set c();

    Collection d(Name name, LookupLocation lookupLocation);

    Set e();
}
