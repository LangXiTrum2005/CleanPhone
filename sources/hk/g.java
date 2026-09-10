package hk;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends xj.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f42392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f42393d;

    public g(i iVar) {
        this.f42393d = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f42392c = arrayDeque;
        File rootFile = (File) iVar.f42396b;
        if (rootFile.isDirectory()) {
            arrayDeque.push(b(rootFile));
        } else if (!rootFile.isFile()) {
            this.f53834a = 2;
        } else {
            n.f(rootFile, "rootFile");
            arrayDeque.push(new e(rootFile));
        }
    }

    @Override // xj.b
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f42392c;
            h hVar = (h) arrayDeque.peek();
            if (hVar == null) {
                file = null;
                break;
            }
            File fileA = hVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(hVar.f42394a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.f53834a = 2;
        } else {
            this.f53835b = file;
            this.f53834a = 1;
        }
    }

    public final c b(File rootDir) {
        int iOrdinal = ((j) this.f42393d.f42397c).ordinal();
        if (iOrdinal == 0) {
            n.f(rootDir, "rootDir");
            return new f(rootDir);
        }
        if (iOrdinal != 1) {
            throw new aa.b((byte) 0, 20);
        }
        n.f(rootDir, "rootDir");
        return new d(rootDir);
    }
}
