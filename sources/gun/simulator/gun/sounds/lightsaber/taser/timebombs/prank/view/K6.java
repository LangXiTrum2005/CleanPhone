package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class K6 implements InterfaceC4842vW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3301a;
    public final EnumC4666tW b;

    public K6(int i, EnumC4666tW enumC4666tW) {
        this.f3301a = i;
        this.b = enumC4666tW;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC4842vW.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4842vW)) {
            return false;
        }
        InterfaceC4842vW interfaceC4842vW = (InterfaceC4842vW) obj;
        return this.f3301a == ((K6) interfaceC4842vW).f3301a && this.b.equals(((K6) interfaceC4842vW).b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f3301a) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3301a + "intEncoding=" + this.b + ')';
    }
}
