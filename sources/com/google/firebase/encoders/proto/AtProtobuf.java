package com.google.firebase.encoders.proto;

/* JADX INFO: loaded from: classes4.dex */
public final class AtProtobuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20798a;

    public static final class ProtobufImpl implements Protobuf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20799a;

        public ProtobufImpl(int i2) {
            this.f20799a = i2;
        }

        @Override // java.lang.annotation.Annotation
        public final Class annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f20799a == protobuf.tag() && Protobuf.IntEncoding.X.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.f20799a) + (Protobuf.IntEncoding.X.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final Protobuf.IntEncoding intEncoding() {
            return Protobuf.IntEncoding.X;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final int tag() {
            return this.f20799a;
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f20799a + "intEncoding=" + Protobuf.IntEncoding.X + ')';
        }
    }

    public final Protobuf a() {
        return new ProtobufImpl(this.f20798a);
    }
}
