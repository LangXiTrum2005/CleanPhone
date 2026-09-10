package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class V7 extends AbstractC4944wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC4856vf f3861a;
    public final AbstractC4281p4 b;

    public V7(EnumC4856vf enumC4856vf, AbstractC4281p4 abstractC4281p4) {
        this.f3861a = enumC4856vf;
        this.b = abstractC4281p4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4944wf)) {
            return false;
        }
        AbstractC4944wf abstractC4944wf = (AbstractC4944wf) obj;
        EnumC4856vf enumC4856vf = this.f3861a;
        if (enumC4856vf != null ? enumC4856vf.equals(((V7) abstractC4944wf).f3861a) : ((V7) abstractC4944wf).f3861a == null) {
            AbstractC4281p4 abstractC4281p4 = this.b;
            if (abstractC4281p4 == null) {
                if (((V7) abstractC4944wf).b == null) {
                    return true;
                }
            } else if (abstractC4281p4.equals(((V7) abstractC4944wf).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC4856vf enumC4856vf = this.f3861a;
        int iHashCode = ((enumC4856vf == null ? 0 : enumC4856vf.hashCode()) ^ 1000003) * 1000003;
        AbstractC4281p4 abstractC4281p4 = this.b;
        return (abstractC4281p4 != null ? abstractC4281p4.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f3861a + ", androidClientInfo=" + this.b + "}";
    }
}
