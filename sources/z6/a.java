package z6;

import a7.p;
import e6.f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f54650c;

    public a(int i10, f fVar) {
        this.f54649b = i10;
        this.f54650c = fVar;
    }

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        this.f54650c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f54649b).array());
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f54649b == aVar.f54649b && this.f54650c.equals(aVar.f54650c)) {
                return true;
            }
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        return p.h(this.f54649b, this.f54650c);
    }
}
