package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
final class SubtypePathNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinType f44577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubtypePathNode f44578b;

    public SubtypePathNode(KotlinType type, SubtypePathNode subtypePathNode) {
        Intrinsics.f(type, "type");
        this.f44577a = type;
        this.f44578b = subtypePathNode;
    }
}
