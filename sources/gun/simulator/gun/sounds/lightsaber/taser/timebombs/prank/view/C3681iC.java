package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3681iC {
    public static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4492a;
    public final String b;
    public final Map c;

    public C3681iC(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str.concat("/");
        }
        this.c = map;
        if (callback instanceof View) {
            this.f4492a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f4492a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (d) {
            ((C3425fK) this.c.get(str)).f = bitmap;
        }
    }
}
