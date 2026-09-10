package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N80 implements Iterator {
    public String b;
    public final CharSequence c;
    public final AbstractC4678te d;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3443a = 2;
    public int f = 0;
    public final boolean e = false;

    public N80(O80 o80, CharSequence charSequence) {
        this.d = o80.f3495a;
        this.g = o80.c;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        String string;
        AbstractC4678te abstractC4678te;
        int i = this.f3443a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iD = DM.D(i);
        if (iD == 0) {
            return true;
        }
        if (iD == 2) {
            return false;
        }
        this.f3443a = 4;
        int i2 = this.f;
        while (true) {
            int i3 = this.f;
            if (i3 == -1) {
                this.f3443a = 3;
                string = null;
                break;
            }
            M80 m80 = (M80) this;
            int iA = ((AbstractC4678te) m80.h.b).a(m80.c, i3);
            CharSequence charSequence = this.c;
            if (iA == -1) {
                iA = charSequence.length();
                this.f = -1;
            } else {
                this.f = iA + 1;
            }
            int i4 = this.f;
            if (i4 == i2) {
                int i5 = i4 + 1;
                this.f = i5;
                if (i5 > charSequence.length()) {
                    this.f = -1;
                }
            } else {
                while (true) {
                    abstractC4678te = this.d;
                    if (i2 >= iA || !abstractC4678te.b(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                while (iA > i2 && abstractC4678te.b(charSequence.charAt(iA - 1))) {
                    iA--;
                }
                if (!this.e || i2 != iA) {
                    int i6 = this.g;
                    if (i6 == 1) {
                        iA = charSequence.length();
                        this.f = -1;
                        while (iA > i2 && abstractC4678te.b(charSequence.charAt(iA - 1))) {
                            iA--;
                        }
                    } else {
                        this.g = i6 - 1;
                    }
                    string = charSequence.subSequence(i2, iA).toString();
                    break;
                }
                i2 = this.f;
            }
        }
        this.b = string;
        if (this.f3443a == 3) {
            return false;
        }
        this.f3443a = 1;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3443a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
