package je;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f43828e = new e(f.f43833b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f43830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43832d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f43830b = fVar;
        this.f43829a = i10;
        this.f43831c = i11;
        this.f43832d = i12;
    }

    public final e a(int i10) {
        int i11;
        f dVar = this.f43830b;
        int i12 = this.f43829a;
        int i13 = this.f43832d;
        if (i12 == 4 || i12 == 2) {
            int[] iArr = c.f43823b[i12];
            i12 = 0;
            int i14 = iArr[0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            dVar.getClass();
            i13 += i16;
            dVar = new d(dVar, i15, i16);
        }
        int i17 = this.f43831c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        int i18 = i17 + 1;
        e eVar = new e(dVar, i12, i18, i13 + i11);
        return i18 == 2078 ? eVar.b(i10 + 1) : eVar;
    }

    public final e b(int i10) {
        int i11 = this.f43831c;
        if (i11 == 0) {
            return this;
        }
        f fVar = this.f43830b;
        fVar.getClass();
        return new e(new a(fVar, i10 - i11, i11), this.f43829a, 0, this.f43832d);
    }

    public final boolean c(e eVar) {
        int i10;
        int i11 = this.f43832d + (c.f43823b[this.f43829a][eVar.f43829a] >> 16);
        int i12 = eVar.f43831c;
        if (i12 > 0 && ((i10 = this.f43831c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= eVar.f43832d;
    }

    public final e d(int i10, int i11) {
        int i12 = this.f43832d;
        f dVar = this.f43830b;
        int i13 = this.f43829a;
        if (i10 != i13) {
            int i14 = c.f43823b[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            dVar.getClass();
            i12 += i16;
            dVar = new d(dVar, i15, i16);
        }
        int i17 = i10 == 2 ? 4 : 5;
        dVar.getClass();
        return new e(new d(dVar, i11, i17), i10, 0, i12 + i17);
    }

    public final e e(int i10, int i11) {
        int i12 = this.f43829a;
        int i13 = i12 == 2 ? 4 : 5;
        int i14 = c.f43825d[i12][i10];
        f fVar = this.f43830b;
        fVar.getClass();
        return new e(new d(new d(fVar, i14, i13), i11, 5), i12, 0, this.f43832d + i13 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", c.f43822a[this.f43829a], Integer.valueOf(this.f43832d), Integer.valueOf(this.f43831c));
    }
}
