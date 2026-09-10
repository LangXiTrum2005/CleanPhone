package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

/* JADX INFO: loaded from: classes7.dex */
public interface TypeProjection extends TypeArgumentMarker {
    boolean a();

    Variance b();

    TypeProjection c(KotlinTypeRefiner kotlinTypeRefiner);

    KotlinType getType();
}
