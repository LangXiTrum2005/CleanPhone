package androidx.constraintlayout.solver;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3909a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3912e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Type f3914i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3910b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3911c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f3913h = new float[9];
    public ArrayRow[] j = new ArrayRow[16];
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3915l = 0;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.SolverVariable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3916a;

        static {
            int[] iArr = new int[Type.values().length];
            f3916a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3916a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3916a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3916a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3916a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Type f3917Y;
        public static final Type Z;
        public static final Type e0;
        public static final /* synthetic */ Type[] f0;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            X = type;
            Type type2 = new Type("CONSTANT", 1);
            Type type3 = new Type("SLACK", 2);
            f3917Y = type3;
            Type type4 = new Type("ERROR", 3);
            Z = type4;
            Type type5 = new Type("UNKNOWN", 4);
            e0 = type5;
            f0 = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f0.clone();
        }
    }

    public SolverVariable(Type type) {
        this.f3914i = type;
    }

    public final void a(ArrayRow arrayRow) {
        int i2 = 0;
        while (true) {
            int i3 = this.k;
            if (i2 >= i3) {
                ArrayRow[] arrayRowArr = this.j;
                if (i3 >= arrayRowArr.length) {
                    this.j = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.j;
                int i4 = this.k;
                arrayRowArr2[i4] = arrayRow;
                this.k = i4 + 1;
                return;
            }
            if (this.j[i2] == arrayRow) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void b(ArrayRow arrayRow) {
        int i2 = this.k;
        int i3 = 0;
        while (i3 < i2) {
            if (this.j[i3] == arrayRow) {
                while (i3 < i2 - 1) {
                    ArrayRow[] arrayRowArr = this.j;
                    int i4 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.k--;
                return;
            }
            i3++;
        }
    }

    public final void c() {
        this.f3914i = Type.e0;
        this.d = 0;
        this.f3910b = -1;
        this.f3911c = -1;
        this.f3912e = 0.0f;
        this.f = false;
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3] = null;
        }
        this.k = 0;
        this.f3915l = 0;
        this.f3909a = false;
        Arrays.fill(this.f3913h, 0.0f);
    }

    public final void d(ArrayRow arrayRow) {
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3].h(arrayRow, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.f3910b;
    }
}
