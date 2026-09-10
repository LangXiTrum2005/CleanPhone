package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.gson.JsonObject;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class yj1 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public WeakReference c = new WeakReference(null);
    public WeakReference d = new WeakReference(null);
    public WeakReference e = new WeakReference(null);
    public WeakReference f = new WeakReference(null);

    public abstract JsonObject a(FrameLayout frameLayout, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap);

    public abstract void a();

    public abstract void a(View view, int i);

    public abstract void a(View view, FrameLayout frameLayout, LinkedHashMap linkedHashMap, ImageView.ScaleType scaleType);

    public abstract void a(FrameLayout frameLayout, MotionEvent motionEvent);

    public abstract void a(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map);

    public abstract void a(FrameLayout frameLayout, LinkedHashMap linkedHashMap);

    public abstract void a(String str);

    public abstract void a(WeakReference weakReference, FrameLayout frameLayout, LinkedHashMap linkedHashMap, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    public abstract JsonObject b(FrameLayout frameLayout, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap);

    public abstract void b(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map);

    public abstract void c();

    public abstract boolean d();

    public abstract int e();

    public final WeakReference g() {
        return this.c;
    }

    public final WeakReference h() {
        return this.e;
    }

    public final WeakReference i() {
        return this.d;
    }

    public abstract boolean k();
}
