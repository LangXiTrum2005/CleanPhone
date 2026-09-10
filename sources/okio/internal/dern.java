package okio.internal;

import duvetyn.cord;
import duvetyn.cutely;
import java.io.IOException;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.collections.impassible;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lduvetyn/cutely;", "Lduvetyn/cord;", "path", "", "saneness", "(Lduvetyn/cutely;Lduvetyn/cord;)Z", "dir", "mustCreate", "", "attabal", "(Lduvetyn/cutely;Lduvetyn/cord;Z)V", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class dern {
    public static final void attabal(cutely cutelyVar, cord dir, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(cutelyVar, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        impassible impassibleVar = new impassible();
        for (cord cordVarApical = dir; cordVarApical != null && !cutelyVar.competently(cordVarApical); cordVarApical = cordVarApical.apical()) {
            impassibleVar.addFirst(cordVarApical);
        }
        if (z && impassibleVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = impassibleVar.iterator();
        while (it.hasNext()) {
            cutelyVar.dern((cord) it.next());
        }
    }

    public static final boolean saneness(cutely cutelyVar, cord path) throws IOException {
        Intrinsics.checkNotNullParameter(cutelyVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return cutelyVar.impromptu(path) != null;
    }
}
