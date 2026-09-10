package polyfoil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes.dex */
public class apical {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Comparator<saneness> f35556impromptu = new Comparator() { // from class: polyfoil.taiyuan
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return apical.saneness((apical.saneness) obj, (apical.saneness) obj2);
        }
    };

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final Comparator<saneness> f35557taiyuan = new Comparator() { // from class: polyfoil.cutely
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((apical.saneness) obj).value, ((apical.saneness) obj2).value);
        }
    };

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f35558attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f35559beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f35560competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f35562marial;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness[] f35561dern = new saneness[5];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<saneness> f35563saneness = new ArrayList<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f35564wireman = -1;

    /* JADX INFO: compiled from: SlidingPercentile.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f35565attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f35566saneness;
        public float value;

        public saneness() {
        }
    }

    public apical(int i) {
        this.f35558attabal = i;
    }

    public static /* synthetic */ int saneness(saneness sanenessVar, saneness sanenessVar2) {
        return sanenessVar.f35565attabal - sanenessVar2.f35565attabal;
    }

    public float beachfront(float f) {
        marial();
        float f2 = f * this.f35559beachfront;
        int i = 0;
        for (int i2 = 0; i2 < this.f35563saneness.size(); i2++) {
            saneness sanenessVar = this.f35563saneness.get(i2);
            i += sanenessVar.f35566saneness;
            if (i >= f2) {
                return sanenessVar.value;
            }
        }
        if (this.f35563saneness.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<saneness> arrayList = this.f35563saneness;
        return arrayList.get(arrayList.size() - 1).value;
    }

    public void competently() {
        this.f35563saneness.clear();
        this.f35564wireman = -1;
        this.f35562marial = 0;
        this.f35559beachfront = 0;
    }

    public void dern(int i, float f) {
        saneness sanenessVar;
        wireman();
        int i2 = this.f35560competently;
        if (i2 > 0) {
            saneness[] sanenessVarArr = this.f35561dern;
            int i3 = i2 - 1;
            this.f35560competently = i3;
            sanenessVar = sanenessVarArr[i3];
        } else {
            sanenessVar = new saneness();
        }
        int i4 = this.f35562marial;
        this.f35562marial = i4 + 1;
        sanenessVar.f35565attabal = i4;
        sanenessVar.f35566saneness = i;
        sanenessVar.value = f;
        this.f35563saneness.add(sanenessVar);
        this.f35559beachfront += i;
        while (true) {
            int i5 = this.f35559beachfront;
            int i6 = this.f35558attabal;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            saneness sanenessVar2 = this.f35563saneness.get(0);
            int i8 = sanenessVar2.f35566saneness;
            if (i8 <= i7) {
                this.f35559beachfront -= i8;
                this.f35563saneness.remove(0);
                int i9 = this.f35560competently;
                if (i9 < 5) {
                    saneness[] sanenessVarArr2 = this.f35561dern;
                    this.f35560competently = i9 + 1;
                    sanenessVarArr2[i9] = sanenessVar2;
                }
            } else {
                sanenessVar2.f35566saneness = i8 - i7;
                this.f35559beachfront -= i7;
            }
        }
    }

    public final void marial() {
        if (this.f35564wireman != 0) {
            Collections.sort(this.f35563saneness, f35557taiyuan);
            this.f35564wireman = 0;
        }
    }

    public final void wireman() {
        if (this.f35564wireman != 1) {
            Collections.sort(this.f35563saneness, f35556impromptu);
            this.f35564wireman = 1;
        }
    }
}
