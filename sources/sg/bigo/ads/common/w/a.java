package sg.bigo.ads.common.w;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes7.dex */
final class a {
    private static final Comparator<C0854a> g = new Comparator<C0854a>() { // from class: sg.bigo.ads.common.w.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C0854a c0854a, C0854a c0854a2) {
            return c0854a2.a() - c0854a.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f47691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f47692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<c.C0856c> f47693c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final c.b[] f47694e;
    private final float[] f = new float[3];
    final TimingLogger d = null;

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.a$a, reason: collision with other inner class name */
    public class C0854a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f47695a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47697c;
        private int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47698e;
        private int f;
        private int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f47699h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f47700i;
        private int j;

        public C0854a(int i2, int i3) {
            this.f47697c = i2;
            this.f47695a = i3;
            c();
        }

        private int f() {
            return (this.f47695a + 1) - this.f47697c;
        }

        public final int a() {
            return ((this.j - this.f47700i) + 1) * ((this.f47699h - this.g) + 1) * ((this.f - this.f47698e) + 1);
        }

        public final boolean b() {
            return f() > 1;
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f47691a;
            int[] iArr2 = aVar.f47692b;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = 0;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = this.f47697c; i9 <= this.f47695a; i9++) {
                int i10 = iArr[i9];
                i6 += iArr2[i10];
                int iA = a.a(i10);
                int iB = a.b(i10);
                int iC = a.c(i10);
                if (iA > i3) {
                    i3 = iA;
                }
                if (iA < i2) {
                    i2 = iA;
                }
                if (iB > i4) {
                    i4 = iB;
                }
                if (iB < i7) {
                    i7 = iB;
                }
                if (iC > i5) {
                    i5 = iC;
                }
                if (iC < i8) {
                    i8 = iC;
                }
            }
            this.f47698e = i2;
            this.f = i3;
            this.g = i7;
            this.f47699h = i4;
            this.f47700i = i8;
            this.j = i5;
            this.d = i6;
        }

        public final int d() {
            int i2;
            int i3 = this.f - this.f47698e;
            int i4 = this.f47699h - this.g;
            int i5 = this.j - this.f47700i;
            if (i3 < i4 || i3 < i5) {
                i2 = (i4 < i3 || i4 < i5) ? -1 : -2;
            } else {
                i2 = -3;
            }
            a aVar = a.this;
            int[] iArr = aVar.f47691a;
            int[] iArr2 = aVar.f47692b;
            a.a(iArr, i2, this.f47697c, this.f47695a);
            Arrays.sort(iArr, this.f47697c, this.f47695a + 1);
            a.a(iArr, i2, this.f47697c, this.f47695a);
            int i6 = this.d / 2;
            int i7 = this.f47697c;
            int i8 = 0;
            while (true) {
                int i9 = this.f47695a;
                if (i7 > i9) {
                    return this.f47697c;
                }
                i8 += iArr2[iArr[i7]];
                if (i8 >= i6) {
                    return Math.min(i9 - 1, i7);
                }
                i7++;
            }
        }

        public final c.C0856c e() {
            a aVar = a.this;
            int[] iArr = aVar.f47691a;
            int[] iArr2 = aVar.f47692b;
            int i2 = 0;
            int iA = 0;
            int iB = 0;
            int iC = 0;
            for (int i3 = this.f47697c; i3 <= this.f47695a; i3++) {
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                i2 += i5;
                iA += a.a(i4) * i5;
                iB += a.b(i4) * i5;
                iC += i5 * a.c(i4);
            }
            if (i2 == 0) {
                return new c.C0856c(a.a(0, 0, 0), i2);
            }
            float f = i2;
            return new c.C0856c(a.a(Math.round(iA / f), Math.round(iB / f), Math.round(iC / f)), i2);
        }
    }

    public a(int[] iArr, int i2, c.b[] bVarArr) {
        this.f47694e = bVarArr;
        int[] iArr2 = new int[32768];
        this.f47692b = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int iB = b(Color.blue(i4), 8, 5) | (b(Color.red(i4), 8, 5) << 10) | (b(Color.green(i4), 8, 5) << 5);
            iArr[i3] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                b.a(d(i6), this.f);
                if (a(this.f)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.f47691a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 > i2) {
            PriorityQueue priorityQueue = new PriorityQueue(i2, g);
            priorityQueue.offer(new C0854a(0, this.f47691a.length - 1));
            a(priorityQueue, i2);
            this.f47693c = a(priorityQueue);
            return;
        }
        this.f47693c = new ArrayList();
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = iArr3[i9];
            this.f47693c.add(new c.C0856c(d(i10), iArr2[i10]));
        }
    }

    public static int a(int i2) {
        return (i2 >> 10) & 31;
    }

    public static int b(int i2) {
        return (i2 >> 5) & 31;
    }

    public static int c(int i2) {
        return i2 & 31;
    }

    private static int d(int i2) {
        return a((i2 >> 10) & 31, (i2 >> 5) & 31, i2 & 31);
    }

    public static int a(int i2, int i3, int i4) {
        return Color.rgb(b(i2, 5, 8), b(i3, 5, 8), b(i4, 5, 8));
    }

    private static int b(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    private List<c.C0856c> a(Collection<C0854a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C0854a> it = collection.iterator();
        while (it.hasNext()) {
            c.C0856c c0856cE = it.next().e();
            if (!a(c0856cE.a())) {
                arrayList.add(c0856cE);
            }
        }
        return arrayList;
    }

    private static void a(PriorityQueue<C0854a> priorityQueue, int i2) {
        C0854a c0854aPoll;
        while (priorityQueue.size() < i2 && (c0854aPoll = priorityQueue.poll()) != null && c0854aPoll.b()) {
            if (!c0854aPoll.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iD = c0854aPoll.d();
            C0854a c0854a = a.this.new C0854a(iD + 1, c0854aPoll.f47695a);
            c0854aPoll.f47695a = iD;
            c0854aPoll.c();
            priorityQueue.offer(c0854a);
            priorityQueue.offer(c0854aPoll);
        }
    }

    public static void a(int[] iArr, int i2, int i3, int i4) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
                i3++;
            }
            return;
        }
        if (i2 != -1) {
            return;
        }
        while (i3 <= i4) {
            int i6 = iArr[i3];
            iArr[i3] = ((i6 >> 10) & 31) | ((i6 & 31) << 10) | (((i6 >> 5) & 31) << 5);
            i3++;
        }
    }

    private boolean a(float[] fArr) {
        c.b[] bVarArr = this.f47694e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f47694e[i2].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
