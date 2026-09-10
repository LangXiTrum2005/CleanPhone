package hk;

import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f42385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42387e;

    @Override // hk.h
    public final File a() {
        boolean z10 = this.f42387e;
        File file = this.f42394a;
        if (!z10 && this.f42385c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f42385c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f42387e = true;
            }
        }
        File[] fileArr = this.f42385c;
        if (fileArr == null || this.f42386d >= fileArr.length) {
            if (this.f42384b) {
                return null;
            }
            this.f42384b = true;
            return file;
        }
        n.c(fileArr);
        int i10 = this.f42386d;
        this.f42386d = i10 + 1;
        return fileArr[i10];
    }
}
