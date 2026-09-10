package androidx.activity;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/Api26Impl;", "", "activity-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Api26Impl {
    public static void a(Rect rect) {
        new PictureInPictureParams.Builder().setSourceRectHint(rect).build();
        throw null;
    }
}
