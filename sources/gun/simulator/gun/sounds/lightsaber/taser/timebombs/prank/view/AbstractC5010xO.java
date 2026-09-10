package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Person;
import android.graphics.drawable.AnimatedImageDrawable;
import android.media.session.MediaSessionManager;
import android.os.Parcelable;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5010xO {
    public static /* bridge */ /* synthetic */ Person g(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* bridge */ /* synthetic */ Person h(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable j(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo k(String str, int i, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder n(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText p(Spannable spannable) {
        return (PrecomputedText) spannable;
    }

    public static /* bridge */ /* synthetic */ boolean y(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
