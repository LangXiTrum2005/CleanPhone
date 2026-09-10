package okio.internal;

import com.smartdigimkt.b0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", a.n0, "Lokio/internal/ZipEntry;", "invoke", "(Lokio/internal/ZipEntry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class ResourceFileSystem$toJarRoot$zip$1 extends Lambda implements Function1<ZipEntry, Boolean> {
    public static final ResourceFileSystem$toJarRoot$zip$1 X = new ResourceFileSystem$toJarRoot$zip$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ZipEntry entry = (ZipEntry) obj;
        Intrinsics.f(entry, "entry");
        Path path = ResourceFileSystem.f45178e;
        return Boolean.valueOf(ResourceFileSystem.Companion.a(entry.f45181a));
    }
}
