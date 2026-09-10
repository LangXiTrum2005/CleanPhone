package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class SE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3709a;
    public final String b;

    public SE(String str, int i) {
        this.f3709a = i;
        if (i == 1) {
            this.b = str;
        } else {
            str.getClass();
            this.b = str;
        }
    }

    public static SE c(String str) {
        return new SE(str, 0);
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String b(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public final String toString() {
        switch (this.f3709a) {
            case 1:
                return DM.l(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }
}
