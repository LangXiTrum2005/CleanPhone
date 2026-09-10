package immediately;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Table.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f28451attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f28452dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public wireman f28453marial = wireman.attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ByteBuffer f28454saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f28455wireman;

    public int attabal(int i) {
        return i + this.f28454saneness.getInt(i);
    }

    public void dern(int i, ByteBuffer byteBuffer) {
        this.f28454saneness = byteBuffer;
        if (byteBuffer == null) {
            this.f28451attabal = 0;
            this.f28452dern = 0;
            this.f28455wireman = 0;
        } else {
            this.f28451attabal = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f28452dern = i2;
            this.f28455wireman = this.f28454saneness.getShort(i2);
        }
    }

    public int marial(int i) {
        int i2 = i + this.f28451attabal;
        return this.f28454saneness.getInt(i2 + this.f28454saneness.getInt(i2));
    }

    public int saneness(int i) {
        if (i < this.f28455wireman) {
            return this.f28454saneness.getShort(this.f28452dern + i);
        }
        return 0;
    }

    public int wireman(int i) {
        int i2 = i + this.f28451attabal;
        return i2 + this.f28454saneness.getInt(i2) + 4;
    }
}
