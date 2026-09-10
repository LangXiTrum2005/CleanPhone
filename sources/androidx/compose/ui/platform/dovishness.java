package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Comparator;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class dovishness<T> implements Comparator {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ Comparator f7432kowloon;

    public dovishness(Comparator comparator) {
        this.f7432kowloon = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.f7432kowloon.compare(t, t2);
        return iCompare != 0 ? iCompare : frenchy.saneness.wireman(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
    }
}
