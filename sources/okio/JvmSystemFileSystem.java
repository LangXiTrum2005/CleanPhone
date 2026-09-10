package okio;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JvmSystemFileSystem extends FileSystem {
    @Override // okio.FileSystem
    public List a(Path dir) {
        Intrinsics.f(dir, "dir");
        String[] list = dir.f().list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.c(str);
            arrayList.add(dir.d(str));
        }
        CollectionsKt.Z(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public FileMetadata b(Path path) {
        Intrinsics.f(path, "path");
        File fileF = path.f();
        boolean zIsFile = fileF.isFile();
        boolean zIsDirectory = fileF.isDirectory();
        long jLastModified = fileF.lastModified();
        long length = fileF.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileF.exists()) {
            return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle c(Path path) {
        return new JvmFileHandle(false, new RandomAccessFile(path.f(), "r"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
