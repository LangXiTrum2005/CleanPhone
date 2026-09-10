package com.applovin.shadow.okio.internal;

import ak.f;
import bk.a;
import ck.e;
import ck.h;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import jk.c;
import kotlin.Metadata;
import wj.r;
import xj.j;
import zm.k;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzm/k;", "Lcom/applovin/shadow/okio/Path;", "Lwj/r;", "<anonymous>", "(Lzm/k;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
public final class FileSystem$commonDeleteRecursively$sequence$1 extends h implements c {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, f fVar) {
        super(2, fVar);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, fVar);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            k kVar = (k) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            j jVar = new j();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            Object objCollectRecursively = FileSystem.collectRecursively(kVar, fileSystem, jVar, path, false, true, this);
            a aVar = a.f5708a;
            if (objCollectRecursively == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return r.f53297a;
    }

    @Override // jk.c
    public final Object invoke(k kVar, f fVar) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(kVar, fVar)).invokeSuspend(r.f53297a);
    }
}
