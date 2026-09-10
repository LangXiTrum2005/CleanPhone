package okio.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
final class FileSystem$collectRecursively$1 extends ContinuationImpl {
    public SequenceScope X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public FileSystem f45170Y;
    public ArrayDeque Z;
    public Path e0;
    public Iterator f0;
    public boolean g0;
    public /* synthetic */ Object h0;
    public int i0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h0 = obj;
        this.i0 |= Integer.MIN_VALUE;
        return FileSystem.a(null, null, null, null, false, this);
    }
}
