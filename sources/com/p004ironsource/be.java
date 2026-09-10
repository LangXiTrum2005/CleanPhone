package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/be;", "", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface be {
    void a(Activity activity);

    void a(qd adUnit);

    void a(qd adUnit, IronSourceError error);

    void a(qd adUnit, LevelPlayAdInfo adInfo);

    void b(qd adUnit);

    void b(qd adUnit, IronSourceError error);

    void b(qd adUnit, LevelPlayAdInfo adInfo);

    void loadAd();
}
