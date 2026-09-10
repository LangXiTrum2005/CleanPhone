package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void a(Object obj, int i2, int i3) {
        ((UnknownFieldSetLite) obj).d((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void b(Object obj, int i2, long j) {
        ((UnknownFieldSetLite) obj).d((i2 << 3) | 1, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void c(Object obj, int i2, Object obj2) {
        ((UnknownFieldSetLite) obj).d((i2 << 3) | 3, (UnknownFieldSetLite) obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void d(Object obj, int i2, ByteString byteString) {
        ((UnknownFieldSetLite) obj).d((i2 << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void e(Object obj, int i2, long j) {
        ((UnknownFieldSetLite) obj).d(i2 << 3, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteC = UnknownFieldSetLite.c();
        generatedMessageLite.unknownFields = unknownFieldSetLiteC;
        return unknownFieldSetLiteC;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final int h(Object obj) {
        return ((UnknownFieldSetLite) obj).b();
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final int i(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = unknownFieldSetLite.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < unknownFieldSetLite.f4932a; i4++) {
            int i5 = unknownFieldSetLite.f4933b[i4] >>> 3;
            i3 += CodedOutputStream.i(3, (ByteString) unknownFieldSetLite.f4934c[i4]) + CodedOutputStream.p(i5) + CodedOutputStream.o(2) + (CodedOutputStream.o(1) * 2);
        }
        unknownFieldSetLite.d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void j(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj).unknownFields;
        if (unknownFieldSetLite.f4935e) {
            unknownFieldSetLite.f4935e = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        UnknownFieldSetLite unknownFieldSetLite3 = UnknownFieldSetLite.f;
        if (unknownFieldSetLite3.equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (unknownFieldSetLite3.equals(unknownFieldSetLite)) {
            int i2 = unknownFieldSetLite.f4932a + unknownFieldSetLite2.f4932a;
            int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f4933b, i2);
            System.arraycopy(unknownFieldSetLite2.f4933b, 0, iArrCopyOf, unknownFieldSetLite.f4932a, unknownFieldSetLite2.f4932a);
            Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f4934c, i2);
            System.arraycopy(unknownFieldSetLite2.f4934c, 0, objArrCopyOf, unknownFieldSetLite.f4932a, unknownFieldSetLite2.f4932a);
            return new UnknownFieldSetLite(i2, iArrCopyOf, objArrCopyOf, true);
        }
        unknownFieldSetLite.getClass();
        if (unknownFieldSetLite2.equals(unknownFieldSetLite3)) {
            return unknownFieldSetLite;
        }
        if (!unknownFieldSetLite.f4935e) {
            throw new UnsupportedOperationException();
        }
        int i3 = unknownFieldSetLite.f4932a + unknownFieldSetLite2.f4932a;
        unknownFieldSetLite.a(i3);
        System.arraycopy(unknownFieldSetLite2.f4933b, 0, unknownFieldSetLite.f4933b, unknownFieldSetLite.f4932a, unknownFieldSetLite2.f4932a);
        System.arraycopy(unknownFieldSetLite2.f4934c, 0, unknownFieldSetLite.f4934c, unknownFieldSetLite.f4932a, unknownFieldSetLite2.f4932a);
        unknownFieldSetLite.f4932a = i3;
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite m() {
        return UnknownFieldSetLite.c();
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void n(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void o(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (UnknownFieldSetLite) obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final UnknownFieldSetLite p(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        if (unknownFieldSetLite.f4935e) {
            unknownFieldSetLite.f4935e = false;
        }
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void q(Object obj, Writer writer) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.getClass();
        if (writer.fieldOrder() == Writer.FieldOrder.f4947Y) {
            for (int i2 = unknownFieldSetLite.f4932a - 1; i2 >= 0; i2--) {
                writer.writeMessageSetItem(unknownFieldSetLite.f4933b[i2] >>> 3, unknownFieldSetLite.f4934c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < unknownFieldSetLite.f4932a; i3++) {
            writer.writeMessageSetItem(unknownFieldSetLite.f4933b[i3] >>> 3, unknownFieldSetLite.f4934c[i3]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.UnknownFieldSchema
    public final void r(Object obj, Writer writer) {
        ((UnknownFieldSetLite) obj).f(writer);
    }
}
