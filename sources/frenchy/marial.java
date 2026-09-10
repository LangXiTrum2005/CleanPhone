package frenchy;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Comparator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\n\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfrenchy/marial;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "<init>", "()V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "attabal", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "reversed", "()Ljava/util/Comparator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class marial implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final marial f26535kowloon = new marial();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<Object> a, Comparable<Object> b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return b.compareTo(a);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return wireman.f26536kowloon;
    }
}
