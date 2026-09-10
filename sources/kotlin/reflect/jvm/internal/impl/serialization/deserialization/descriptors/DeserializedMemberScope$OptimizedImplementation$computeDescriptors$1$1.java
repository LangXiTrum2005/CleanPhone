package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ AbstractParser X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ByteArrayInputStream f44466Y;
    public final /* synthetic */ DeserializedMemberScope Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(AbstractParser abstractParser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.X = abstractParser;
        this.f44466Y = byteArrayInputStream;
        this.Z = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ExtensionRegistryLite extensionRegistryLite = this.Z.f44456b.f44401a.f44399p;
        return this.X.c(this.f44466Y, extensionRegistryLite);
    }
}
