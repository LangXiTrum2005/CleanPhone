package com.unity3d.services.core.network.domain;

import com.ironsource.X3;
import java.io.File;
import java.util.List;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwj/f;", "", "", "Ljava/io/File;", "<name for destructuring parameter 0>", X3.i.f27782b, "invoke", "(Lwj/f;Ljava/io/File;)Lwj/f;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CleanupDirectory$invoke$additionalFiles$2 extends o implements c {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    public CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    @Override // jk.c
    public final f invoke(f fVar, File file) {
        n.f(fVar, "<name for destructuring parameter 0>");
        n.f(file, "file");
        return new f(Long.valueOf(((Number) fVar.f53283a).longValue() - file.length()), xj.n.D0((List) fVar.f53284b, file));
    }
}
