package interaction;

import java.io.File;
import p002kotlin.Metadata;
import p002kotlin.io.FileWalkDirection;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", "direction", "Linteraction/wireman;", "kowloon", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Linteraction/wireman;", "polloi", "(Ljava/io/File;)Linteraction/wireman;", "monoploid", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class impromptu extends competently {
    public static /* synthetic */ wireman arytenoidectomy(File file, FileWalkDirection fileWalkDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return kowloon(file, fileWalkDirection);
    }

    public static final wireman kowloon(File file, FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new wireman(file, direction);
    }

    public static final wireman monoploid(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return kowloon(file, FileWalkDirection.BOTTOM_UP);
    }

    public static wireman polloi(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return kowloon(file, FileWalkDirection.TOP_DOWN);
    }
}
