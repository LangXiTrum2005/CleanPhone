package com.google.common.io;

import com.google.common.base.Predicate;
import com.google.common.graph.SuccessorsFunction;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Files {

    /* JADX INFO: renamed from: com.google.common.io.Files$1, reason: invalid class name */
    class AnonymousClass1 implements LineProcessor<List<String>> {
    }

    /* JADX INFO: renamed from: com.google.common.io.Files$2, reason: invalid class name */
    public class AnonymousClass2 implements SuccessorsFunction<File> {
    }

    public static final class FileByteSink extends ByteSink {
        public final String toString() {
            return "Files.asByteSink(null, null)";
        }
    }

    public static final class FileByteSource extends ByteSource {
        public final String toString() {
            return "Files.asByteSource(null)";
        }
    }

    public enum FilePredicate implements Predicate<File> {
        /* JADX INFO: Fake field, exist only in values array */
        EF2 { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((File) obj).isDirectory();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Files.isDirectory()";
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF7 { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((File) obj).isFile();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Files.isFile()";
            }
        }
    }
}
