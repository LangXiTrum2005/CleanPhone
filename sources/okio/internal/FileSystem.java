package okio.internal;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import okio.FileMetadata;
import okio.Path;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FileSystem {
    /* JADX WARN: Code duplicated, block: B:47:0x00c9 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:45:0x00c3, B:47:0x00c9), top: B:66:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea A[LOOP:0: B:66:0x00c3->B:50:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object a(SequenceScope sequenceScope, okio.FileSystem fileSystem, ArrayDeque arrayDeque, Path path, boolean z2, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$1;
        okio.FileSystem fileSystem2;
        SequenceScope sequenceScope2;
        boolean z3;
        ArrayDeque arrayDeque2;
        Path pathB;
        ArrayDeque arrayDeque3;
        ArrayDeque arrayDeque4;
        okio.FileSystem fileSystem3;
        SequenceScope sequenceScope3;
        Path path2;
        Iterator it;
        Path path3;
        boolean z4;
        FileSystem$collectRecursively$1 fileSystem$collectRecursively$2;
        Path path4 = path;
        if (baseContinuationImpl instanceof FileSystem$collectRecursively$1) {
            fileSystem$collectRecursively$1 = (FileSystem$collectRecursively$1) baseContinuationImpl;
            int i2 = fileSystem$collectRecursively$1.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fileSystem$collectRecursively$1.i0 = i2 - Integer.MIN_VALUE;
            } else {
                fileSystem$collectRecursively$1 = new FileSystem$collectRecursively$1(baseContinuationImpl);
            }
        } else {
            fileSystem$collectRecursively$1 = new FileSystem$collectRecursively$1(baseContinuationImpl);
        }
        Object obj = fileSystem$collectRecursively$1.h0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = fileSystem$collectRecursively$1.i0;
        Unit unit = Unit.f43263a;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (!z2) {
                fileSystem$collectRecursively$1.X = sequenceScope;
                fileSystem$collectRecursively$1.f45170Y = fileSystem;
                fileSystem$collectRecursively$1.Z = arrayDeque;
                fileSystem$collectRecursively$1.e0 = path4;
                fileSystem$collectRecursively$1.g0 = z2;
                fileSystem$collectRecursively$1.i0 = 1;
                sequenceScope.a(path4, fileSystem$collectRecursively$1);
                return coroutineSingletons;
            }
            fileSystem2 = fileSystem;
            sequenceScope2 = sequenceScope;
            z3 = z2;
            arrayDeque2 = arrayDeque;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                z3 = fileSystem$collectRecursively$1.g0;
                it = fileSystem$collectRecursively$1.f0;
                path2 = fileSystem$collectRecursively$1.e0;
                arrayDeque3 = fileSystem$collectRecursively$1.Z;
                okio.FileSystem fileSystem4 = fileSystem$collectRecursively$1.f45170Y;
                SequenceScope sequenceScope4 = fileSystem$collectRecursively$1.X;
                try {
                    ResultKt.b(obj);
                    arrayDeque4 = arrayDeque3;
                    fileSystem3 = fileSystem4;
                    sequenceScope3 = sequenceScope4;
                    while (it.hasNext()) {
                        try {
                            path3 = (Path) it.next();
                            fileSystem$collectRecursively$1.X = sequenceScope3;
                            fileSystem$collectRecursively$1.f45170Y = fileSystem3;
                            fileSystem$collectRecursively$1.Z = arrayDeque4;
                            fileSystem$collectRecursively$1.e0 = path2;
                            fileSystem$collectRecursively$1.f0 = it;
                            fileSystem$collectRecursively$1.g0 = z3;
                            fileSystem$collectRecursively$1.i0 = 2;
                            z4 = z3;
                            fileSystem$collectRecursively$2 = fileSystem$collectRecursively$1;
                            if (a(sequenceScope3, fileSystem3, arrayDeque4, path3, z4, fileSystem$collectRecursively$2) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z3 = z4;
                            fileSystem$collectRecursively$1 = fileSystem$collectRecursively$2;
                        } catch (Throwable th) {
                            th = th;
                            arrayDeque3 = arrayDeque4;
                            arrayDeque3.removeLast();
                            throw th;
                        }
                    }
                    arrayDeque4.removeLast();
                    path4 = path2;
                    sequenceScope2 = sequenceScope3;
                    if (z3) {
                        return unit;
                    }
                    fileSystem$collectRecursively$1.X = null;
                    fileSystem$collectRecursively$1.f45170Y = null;
                    fileSystem$collectRecursively$1.Z = null;
                    fileSystem$collectRecursively$1.e0 = null;
                    fileSystem$collectRecursively$1.f0 = null;
                    fileSystem$collectRecursively$1.i0 = 3;
                    sequenceScope2.a(path4, fileSystem$collectRecursively$1);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.X;
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    arrayDeque3.removeLast();
                    throw th;
                }
            }
            z3 = fileSystem$collectRecursively$1.g0;
            path4 = fileSystem$collectRecursively$1.e0;
            arrayDeque2 = fileSystem$collectRecursively$1.Z;
            okio.FileSystem fileSystem5 = fileSystem$collectRecursively$1.f45170Y;
            sequenceScope2 = fileSystem$collectRecursively$1.X;
            ResultKt.b(obj);
            fileSystem2 = fileSystem5;
        }
        List listA = fileSystem2.a(path4);
        if (listA == null) {
            listA = EmptyList.X;
        }
        if (!listA.isEmpty()) {
            Path path5 = path4;
            int i4 = 0;
            while (true) {
                FileMetadata fileMetadataB = fileSystem2.b(path5);
                if (fileMetadataB == null) {
                    throw new FileNotFoundException("no such file: " + path5);
                }
                Path path6 = fileMetadataB.f45141c;
                if (path6 == null) {
                    pathB = null;
                } else {
                    Path pathB2 = path5.b();
                    Intrinsics.c(pathB2);
                    pathB = Path.b(pathB2, path6, false);
                }
                if (pathB != null) {
                    i4++;
                    path5 = pathB;
                } else if (i4 == 0) {
                    arrayDeque2.addLast(path5);
                    try {
                        arrayDeque4 = arrayDeque2;
                        fileSystem3 = fileSystem2;
                        sequenceScope3 = sequenceScope2;
                        path2 = path4;
                        it = listA.iterator();
                        while (it.hasNext()) {
                            path3 = (Path) it.next();
                            fileSystem$collectRecursively$1.X = sequenceScope3;
                            fileSystem$collectRecursively$1.f45170Y = fileSystem3;
                            fileSystem$collectRecursively$1.Z = arrayDeque4;
                            fileSystem$collectRecursively$1.e0 = path2;
                            fileSystem$collectRecursively$1.f0 = it;
                            fileSystem$collectRecursively$1.g0 = z3;
                            fileSystem$collectRecursively$1.i0 = 2;
                            z4 = z3;
                            fileSystem$collectRecursively$2 = fileSystem$collectRecursively$1;
                            if (a(sequenceScope3, fileSystem3, arrayDeque4, path3, z4, fileSystem$collectRecursively$2) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z3 = z4;
                            fileSystem$collectRecursively$1 = fileSystem$collectRecursively$2;
                        }
                        arrayDeque4.removeLast();
                        path4 = path2;
                        sequenceScope2 = sequenceScope3;
                    } catch (Throwable th3) {
                        th = th3;
                        arrayDeque3 = arrayDeque2;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                }
            }
        }
        if (z3) {
            return unit;
        }
        fileSystem$collectRecursively$1.X = null;
        fileSystem$collectRecursively$1.f45170Y = null;
        fileSystem$collectRecursively$1.Z = null;
        fileSystem$collectRecursively$1.e0 = null;
        fileSystem$collectRecursively$1.f0 = null;
        fileSystem$collectRecursively$1.i0 = 3;
        sequenceScope2.a(path4, fileSystem$collectRecursively$1);
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.X;
        return coroutineSingletons;
    }
}
