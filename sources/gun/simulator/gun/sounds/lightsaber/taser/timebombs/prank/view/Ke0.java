package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleArrayMap f3321a = new SimpleArrayMap();

    public static Typeface a(Context context, String str) {
        SimpleArrayMap simpleArrayMap = f3321a;
        synchronized (simpleArrayMap) {
            try {
                if (simpleArrayMap.containsKey(str)) {
                    return (Typeface) simpleArrayMap.get(str);
                }
                try {
                    Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/" + str);
                    simpleArrayMap.put(str, typefaceCreateFromAsset);
                    return typefaceCreateFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
