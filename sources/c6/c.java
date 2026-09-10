package c6;

import bc.s;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f5928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File[] f5929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File[] f5930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f5932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f5933g;

    public c(d dVar, String str) {
        this.f5933g = dVar;
        this.f5927a = str;
        int i10 = dVar.f5940g;
        File file = dVar.f5934a;
        this.f5928b = new long[i10];
        this.f5929c = new File[i10];
        this.f5930d = new File[i10];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(i11);
            this.f5929c[i11] = new File(file, sb2.toString());
            sb2.append(".tmp");
            this.f5930d[i11] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j10 : this.f5928b) {
            sb2.append(' ');
            sb2.append(j10);
        }
        return sb2.toString();
    }
}
