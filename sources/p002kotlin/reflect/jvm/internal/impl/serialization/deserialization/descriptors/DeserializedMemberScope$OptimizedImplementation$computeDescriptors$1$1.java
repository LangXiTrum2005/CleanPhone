package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 extends Lambda implements Function0 {
    final /* synthetic */ ByteArrayInputStream $inputStream;
    final /* synthetic */ arytenoidectomy $parser;
    final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(arytenoidectomy arytenoidectomyVar, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.$parser = arytenoidectomyVar;
        this.$inputStream = byteArrayInputStream;
        this.this$0 = deserializedMemberScope;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final triweekly invoke() {
        return (triweekly) this.$parser.wireman(this.$inputStream, this.this$0.arytenoidectomy().dern().apical());
    }
}
