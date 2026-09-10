package hk;

import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f42390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42391d;

    @Override // hk.h
    public final File a() {
        boolean z10 = this.f42389b;
        File file = this.f42394a;
        if (!z10) {
            this.f42389b = true;
            return file;
        }
        File[] fileArr = this.f42390c;
        if (fileArr != null && this.f42391d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f42390c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f42390c;
        n.c(fileArr2);
        int i10 = this.f42391d;
        this.f42391d = i10 + 1;
        return fileArr2[i10];
    }
}
