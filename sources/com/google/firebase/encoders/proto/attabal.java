package com.google.firebase.encoders.proto;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: AtProtobuf.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f22452attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Protobuf.IntEncoding f22453saneness = Protobuf.IntEncoding.DEFAULT;

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtProtobuf.java */
    public static final class C0322attabal implements Protobuf {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f22454attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Protobuf.IntEncoding f22455saneness;

        public C0322attabal(int i, Protobuf.IntEncoding intEncoding) {
            this.f22454attabal = i;
            this.f22455saneness = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f22454attabal == protobuf.tag() && this.f22455saneness.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f22454attabal) + (this.f22455saneness.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.f22455saneness;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.f22454attabal;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f22454attabal + "intEncoding=" + this.f22455saneness + ')';
        }
    }

    public static attabal saneness() {
        return new attabal();
    }

    public Protobuf attabal() {
        return new C0322attabal(this.f22452attabal, this.f22453saneness);
    }

    public attabal dern(int i) {
        this.f22452attabal = i;
        return this;
    }
}
