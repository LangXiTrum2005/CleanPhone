package ads_mobile_sdk;

import ads_mobile_sdk.cm1;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.fooster;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class cm1 implements technofreak {
    public FrameLayout b;
    public FrameLayout c;
    public final AtomicBoolean d;
    public View e;
    public ImageView.ScaleType f;
    public GestureDetector g;
    public final LinkedHashMap h;
    public InternalNativeAd i;

    public cm1(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.b = frameLayout;
        this.c = frameLayout2;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        FrameLayout frameLayout3 = this.b;
        if (frameLayout3 != null) {
            frameLayout3.setOnTouchListener(this);
        }
        this.d = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
    }

    public static final void a(cm1 this$0, String watermark) {
        Context context;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(watermark, "$watermark");
        synchronized (this$0) {
            try {
                if (this$0.d.get()) {
                    return;
                }
                FrameLayout frameLayout = this$0.c;
                if (frameLayout != null && (context = frameLayout.getContext()) != null) {
                    Intrinsics.beachfront(context);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    fooster.attabal(context, frameLayout2, watermark);
                    frameLayout.addView(frameLayout2);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final View b(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.h.get(assetName);
            return weakReference != null ? (View) weakReference.get() : null;
        }
    }

    public final FrameLayout c() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.b;
        }
    }

    public final FrameLayout d() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.c;
        }
    }

    public final ImageView.ScaleType e() {
        synchronized (this) {
            if (this.d.get()) {
                return null;
            }
            return this.f;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yj1 yj1VarMarial;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (this) {
            try {
                if (!this.d.get() && this.g == null) {
                    InternalNativeAd internalNativeAd = this.i;
                    if (internalNativeAd != null && (yj1VarMarial = internalNativeAd.getF19434dern()) != null) {
                        FrameLayout frameLayout = this.b;
                        LinkedHashMap linkedHashMap = this.h;
                        ImageView.ScaleType scaleType = this.f;
                        if (scaleType == null) {
                            scaleType = gm1.i;
                        }
                        yj1VarMarial.a(view, frameLayout, linkedHashMap, scaleType);
                        Unit unit = Unit.f29295attabal;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        yj1 yj1VarMarial;
        yj1 yj1VarMarial2;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return false;
                }
                InternalNativeAd internalNativeAd = this.i;
                if (internalNativeAd != null && (yj1VarMarial2 = internalNativeAd.getF19434dern()) != null) {
                    yj1VarMarial2.a(this.b, motionEvent);
                }
                InternalNativeAd internalNativeAd2 = this.i;
                if (internalNativeAd2 == null || (yj1VarMarial = internalNativeAd2.getF19434dern()) == null || yj1VarMarial.e() != 0) {
                    InternalNativeAd internalNativeAd3 = this.i;
                    yj1 yj1VarMarial3 = internalNativeAd3 != null ? internalNativeAd3.getF19434dern() : null;
                    if (yj1VarMarial3 != null) {
                        WeakReference weakReference = new WeakReference(view);
                        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
                        yj1VarMarial3.f = weakReference;
                    }
                    GestureDetector gestureDetector = this.g;
                    if (gestureDetector != null) {
                        gestureDetector.onTouchEvent(motionEvent);
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InternalNativeAd internalNativeAd) {
        synchronized (this) {
            try {
                FrameLayout frameLayout = this.c;
                if (frameLayout != null) {
                    frameLayout.setClickable(false);
                }
                FrameLayout frameLayout2 = this.c;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                }
                internalNativeAd.getF19436marial().a.a();
                internalNativeAd.getF19434dern().a(this.b, this.h);
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map b() {
        synchronized (this) {
            if (this.d.get()) {
                return seminary.taiyuan();
            }
            return seminary.rotuma(this.h);
        }
    }

    public final void b(InternalNativeAd internalNativeAd) throws Throwable {
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return;
                }
                internalNativeAd.getF19436marial().a(this);
                gm1 gm1VarBeachfront = internalNativeAd.getF19438wireman();
                gm1VarBeachfront.getClass();
                Intrinsics.checkNotNullParameter(this, "nativeAdViewContainer");
                cutely.wireman(gm1VarBeachfront.a, null, null, new fm1(gm1VarBeachfront, this, null), 3, null);
                try {
                    internalNativeAd.getF19434dern().a(new WeakReference(this), this.b, this.h, this, this);
                    Unit unit = Unit.f29295attabal;
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
        }
    }

    public static final void a(cm1 this$0) {
        Context context;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0) {
            try {
                if (this$0.d.get()) {
                    return;
                }
                FrameLayout frameLayout2 = this$0.b;
                if (frameLayout2 != null && (context = frameLayout2.getContext()) != null) {
                    Intrinsics.beachfront(context);
                    if (this$0.e == null) {
                        View view = new View(context);
                        view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        this$0.e = view;
                    }
                    FrameLayout frameLayout3 = this$0.b;
                    View view2 = this$0.e;
                    if (!Intrinsics.wireman(frameLayout3, view2 != null ? view2.getParent() : null) && (frameLayout = this$0.b) != null) {
                        frameLayout.addView(this$0.e);
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InternalNativeAd newNativeAd) {
        Context context;
        Intrinsics.checkNotNullParameter(newNativeAd, "newNativeAd");
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return;
                }
                InternalNativeAd internalNativeAd = this.i;
                if (internalNativeAd != null) {
                    c(internalNativeAd);
                }
                a();
                b(newNativeAd);
                String str = newNativeAd.getF19437saneness().v;
                if (str != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        a(str);
                    }
                }
                FrameLayout frameLayout = this.b;
                if (frameLayout != null && (context = frameLayout.getContext()) != null) {
                    Intrinsics.beachfront(context);
                    this.g = newNativeAd.getF19434dern().e() != 0 ? new GestureDetector(context, new un1(newNativeAd.getF19434dern(), new WeakReference(this.b))) : null;
                }
                this.i = newNativeAd;
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(View view, String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        synchronized (this) {
            try {
                if (this.d.get()) {
                    return;
                }
                if (view != null) {
                    this.h.put(assetName, new WeakReference(view));
                } else {
                    this.h.remove(assetName);
                }
                if (Intrinsics.wireman("3011", assetName)) {
                    return;
                }
                if (view != null) {
                    view.setOnTouchListener(this);
                }
                if (view != null) {
                    view.setClickable(true);
                }
                if (view != null) {
                    view.setOnClickListener(this);
                    Unit unit = Unit.f29295attabal;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        technofreak.f37332impassible.getClass();
        am1.b.post(new Runnable() { // from class: saneness.liable
            @Override // java.lang.Runnable
            public final void run() {
                cm1.a(this.f37189kowloon);
            }
        });
    }

    public final void a(final String str) {
        technofreak.f37332impassible.getClass();
        am1.b.post(new Runnable() { // from class: saneness.tailoring
            @Override // java.lang.Runnable
            public final void run() {
                cm1.a(this.f37326kowloon, str);
            }
        });
    }
}
