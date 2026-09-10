package androidx.emoji2.text;

import android.graphics.ImageDecoder;
import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source d(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* synthetic */ void n(int i2, int i3, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i2, i3);
    }

    public static /* bridge */ /* synthetic */ void v(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean y(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
