package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.polloi;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleJobCreator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/task/taiyuan;", "Lcom/vungle/ads/internal/task/saneness;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/util/polloi;", "pathProvider", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/polloi;)V", "", "tag", "Lcom/vungle/ads/internal/task/attabal;", "create", "(Ljava/lang/String;)Lcom/vungle/ads/internal/task/attabal;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/vungle/ads/internal/util/polloi;", "getPathProvider", "()Lcom/vungle/ads/internal/util/polloi;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class taiyuan implements saneness {
    private final Context context;
    private final polloi pathProvider;

    public taiyuan(Context context, polloi pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.saneness
    public attabal create(String tag) throws UnknownTagException {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag.length() == 0) {
            throw new UnknownTagException("Job tag is null");
        }
        if (Intrinsics.wireman(tag, CleanupJob.TAG)) {
            return new CleanupJob(this.context, this.pathProvider);
        }
        if (Intrinsics.wireman(tag, ResendTpatJob.TAG)) {
            return new ResendTpatJob(this.context, this.pathProvider);
        }
        throw new UnknownTagException("Unknown Job Type " + tag);
    }

    public final Context getContext() {
        return this.context;
    }

    public final polloi getPathProvider() {
        return this.pathProvider;
    }
}
