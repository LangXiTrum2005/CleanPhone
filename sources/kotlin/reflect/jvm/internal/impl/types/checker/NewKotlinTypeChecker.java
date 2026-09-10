package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: loaded from: classes7.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f44572b = Companion.f44573a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f44573a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NewKotlinTypeCheckerImpl f44574b = new NewKotlinTypeCheckerImpl();
    }

    OverridingUtil a();

    KotlinTypeRefiner b();
}
