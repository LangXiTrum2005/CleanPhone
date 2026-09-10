package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontResolveInterceptor.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/font/adultoid;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "attabal", "(Landroid/content/Context;)I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final adultoid f7741attabal = new adultoid();

    public final int attabal(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return dovishness.f7751attabal.attabal(context);
        }
        return 0;
    }
}
