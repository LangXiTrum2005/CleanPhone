package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LinkFollowing {
    static {
        LinkOption[] linkOptionArr = new LinkOption[1];
        LinkOption unused = LinkOption.NOFOLLOW_LINKS;
        LinkOption[] linkOptionArr2 = new LinkOption[0];
        SetsKt.h(FileVisitOption.FOLLOW_LINKS);
    }
}
