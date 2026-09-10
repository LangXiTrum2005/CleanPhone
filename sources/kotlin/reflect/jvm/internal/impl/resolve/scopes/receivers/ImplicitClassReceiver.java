package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassDescriptor f44364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassDescriptor f44365b;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor) {
        Intrinsics.f(classDescriptor, "classDescriptor");
        this.f44364a = classDescriptor;
        this.f44365b = classDescriptor;
    }

    public final boolean equals(Object obj) {
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.a(this.f44364a, implicitClassReceiver != null ? implicitClassReceiver.f44364a : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public final KotlinType getType() {
        SimpleType simpleTypeO = this.f44364a.o();
        Intrinsics.e(simpleTypeO, "classDescriptor.defaultType");
        return simpleTypeO;
    }

    public final int hashCode() {
        return this.f44364a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor r() {
        return this.f44364a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        SimpleType simpleTypeO = this.f44364a.o();
        Intrinsics.e(simpleTypeO, "classDescriptor.defaultType");
        sb.append(simpleTypeO);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
