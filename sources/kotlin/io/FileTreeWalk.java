package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "WalkState", "DirectoryState", "FileTreeWalkIterator", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileTreeWalk implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f43304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f43305b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class DirectoryState extends WalkState {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "BottomUpDirectoryState", "TopDownDirectoryState", "SingleFileState", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FileTreeWalkIterator extends AbstractIterator<File> {
        public final ArrayDeque Z;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class BottomUpDirectoryState extends DirectoryState {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f43306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f43307c;
            public int d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f43308e;
            public final /* synthetic */ FileTreeWalkIterator f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.f(rootDir, "rootDir");
                this.f = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File a() {
                boolean z2 = this.f43308e;
                FileTreeWalkIterator fileTreeWalkIterator = this.f;
                File file = this.f43313a;
                if (!z2 && this.f43307c == null) {
                    FileTreeWalk.this.getClass();
                    File[] fileArrListFiles = file.listFiles();
                    this.f43307c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        FileTreeWalk.this.getClass();
                        this.f43308e = true;
                    }
                }
                File[] fileArr = this.f43307c;
                if (fileArr != null && this.d < fileArr.length) {
                    Intrinsics.c(fileArr);
                    int i2 = this.d;
                    this.d = i2 + 1;
                    return fileArr[i2];
                }
                if (this.f43306b) {
                    FileTreeWalk.this.getClass();
                    return null;
                }
                this.f43306b = true;
                return file;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class SingleFileState extends WalkState {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f43309b;

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File a() {
                if (this.f43309b) {
                    return null;
                }
                this.f43309b = true;
                return this.f43313a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class TopDownDirectoryState extends DirectoryState {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f43310b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public File[] f43311c;
            public int d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FileTreeWalkIterator f43312e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.f(rootDir, "rootDir");
                this.f43312e = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File a() {
                boolean z2 = this.f43310b;
                FileTreeWalkIterator fileTreeWalkIterator = this.f43312e;
                File file = this.f43313a;
                if (!z2) {
                    FileTreeWalk.this.getClass();
                    this.f43310b = true;
                    return file;
                }
                File[] fileArr = this.f43311c;
                if (fileArr != null && this.d >= fileArr.length) {
                    FileTreeWalk.this.getClass();
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f43311c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        FileTreeWalk.this.getClass();
                    }
                    File[] fileArr2 = this.f43311c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        FileTreeWalk.this.getClass();
                        return null;
                    }
                }
                File[] fileArr3 = this.f43311c;
                Intrinsics.c(fileArr3);
                int i2 = this.d;
                this.d = i2 + 1;
                return fileArr3[i2];
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    FileWalkDirection fileWalkDirection = FileWalkDirection.X;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.Z = arrayDeque;
            if (FileTreeWalk.this.f43304a.isDirectory()) {
                arrayDeque.push(c(FileTreeWalk.this.f43304a));
            } else {
                if (!FileTreeWalk.this.f43304a.isFile()) {
                    this.X = 2;
                    return;
                }
                File rootFile = FileTreeWalk.this.f43304a;
                Intrinsics.f(rootFile, "rootFile");
                arrayDeque.push(new SingleFileState(rootFile));
            }
        }

        @Override // kotlin.collections.AbstractIterator
        public final void a() {
            File file;
            while (true) {
                ArrayDeque arrayDeque = this.Z;
                WalkState walkState = (WalkState) arrayDeque.peek();
                if (walkState != null) {
                    File fileA = walkState.a();
                    if (fileA != null) {
                        if (!fileA.equals(walkState.f43313a) && fileA.isDirectory()) {
                            int size = arrayDeque.size();
                            FileTreeWalk.this.getClass();
                            if (size < Integer.MAX_VALUE) {
                                arrayDeque.push(c(fileA));
                            }
                        }
                        file = fileA;
                        break;
                    }
                    arrayDeque.pop();
                } else {
                    file = null;
                    break;
                }
            }
            if (file == null) {
                this.X = 2;
            } else {
                this.f43267Y = file;
                this.X = 1;
            }
        }

        public final DirectoryState c(File file) {
            int iOrdinal = FileTreeWalk.this.f43305b.ordinal();
            if (iOrdinal == 0) {
                return new TopDownDirectoryState(this, file);
            }
            if (iOrdinal == 1) {
                return new BottomUpDirectoryState(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class WalkState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f43313a;

        public WalkState(File root) {
            Intrinsics.f(root, "root");
            this.f43313a = root;
        }

        public abstract File a();
    }

    public FileTreeWalk(File start, FileWalkDirection direction) {
        Intrinsics.f(start, "start");
        Intrinsics.f(direction, "direction");
        this.f43304a = start;
        this.f43305b = direction;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new FileTreeWalkIterator();
    }
}
