package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class D70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2957a;
    public I70 e;
    public final Array b = new Array();
    public final Array c = new Array();
    public final Array d = new Array();
    public final Array f = new Array();
    public final Array g = new Array();
    public final Array h = new Array();
    public final Array i = new Array();
    public final Array j = new Array();
    public final Array k = new Array();
    public float l = 100.0f;

    public final C3493g5 a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("animationName cannot be null.");
        }
        Array array = this.g;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C3493g5 c3493g5 = (C3493g5) objArr[i2];
            if (c3493g5.f4402a.equals(str)) {
                return c3493g5;
            }
        }
        return null;
    }

    public final C3619hb b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("boneName cannot be null.");
        }
        Array array = this.b;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C3619hb c3619hb = (C3619hb) objArr[i2];
            if (c3619hb.b.equals(str)) {
                return c3619hb;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C2735Rr c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("eventDataName cannot be null.");
        }
        Array.ArrayIterator it = this.f.iterator();
        while (it.hasNext()) {
            C2735Rr c2735Rr = (C2735Rr) it.next();
            if (c2735Rr.f3685a.equals(str)) {
                return c2735Rr;
            }
        }
        return null;
    }

    public final C3505gC d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        Array array = this.h;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C3505gC c3505gC = (C3505gC) objArr[i2];
            if (c3505gC.f3179a.equals(str)) {
                return c3505gC;
            }
        }
        return null;
    }

    public final TT e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        Array array = this.j;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            TT tt = (TT) objArr[i2];
            if (tt.f3179a.equals(str)) {
                return tt;
            }
        }
        return null;
    }

    public final C4137nU f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        Array array = this.k;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            C4137nU c4137nU = (C4137nU) objArr[i2];
            if (c4137nU.f3179a.equals(str)) {
                return c4137nU;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final I70 g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("skinName cannot be null.");
        }
        Array.ArrayIterator it = this.d.iterator();
        while (it.hasNext()) {
            I70 i70 = (I70) it.next();
            if (i70.f3204a.equals(str)) {
                return i70;
            }
        }
        return null;
    }

    public final O70 h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("slotName cannot be null.");
        }
        Array array = this.c;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            O70 o70 = (O70) objArr[i2];
            if (o70.b.equals(str)) {
                return o70;
            }
        }
        return null;
    }

    public final Ed0 i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("constraintName cannot be null.");
        }
        Array array = this.i;
        Object[] objArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            Ed0 ed0 = (Ed0) objArr[i2];
            if (ed0.f3179a.equals(str)) {
                return ed0;
            }
        }
        return null;
    }

    public final String toString() {
        String str = this.f2957a;
        return str != null ? str : super.toString();
    }
}
