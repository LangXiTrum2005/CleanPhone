package microchemistry;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Cubic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmicrochemistry/kowloon;", "Lmicrochemistry/wireman;", "<init>", "()V", "Lmicrochemistry/monoploid;", "f", "", "monoploid", "(Lmicrochemistry/monoploid;)V", "", "ix", "polloi", "(Lmicrochemistry/monoploid;I)V", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class kowloon extends wireman {
    public kowloon() {
        super(null, 1, null);
    }

    public final void monoploid(monoploid f) {
        Intrinsics.checkNotNullParameter(f, "f");
        polloi(f, 0);
        polloi(f, 2);
        polloi(f, 4);
        polloi(f, 6);
    }

    public final void polloi(monoploid f, int ix) {
        int i = ix + 1;
        long jAttabal = f.attabal(getPoints()[ix], getPoints()[i]);
        getPoints()[ix] = Float.intBitsToFloat((int) (jAttabal >> 32));
        getPoints()[i] = Float.intBitsToFloat((int) (jAttabal & 4294967295L));
    }
}
