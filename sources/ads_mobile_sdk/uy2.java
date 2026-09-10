package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import saneness.weimar;

/* JADX INFO: loaded from: classes.dex */
public final class uy2 extends yj1 {
    public final saran g;
    public final weimar h;
    public final e2 i;
    public final h1 j;
    public final xl1 k;
    public boolean l;

    public uy2(saran backgroundScope, weimar nativeAdMapper, e2 adEventEmitter, h1 adConfiguration, xl1 nativeAdUtil) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        this.g = backgroundScope;
        this.h = nativeAdMapper;
        this.i = adEventEmitter;
        this.j = adConfiguration;
        this.k = nativeAdUtil;
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(View view, int i) {
    }

    @Override // ads_mobile_sdk.yj1
    public final void b(FrameLayout nativeAdView, ImageView.ScaleType mediaviewScaleType, Map assetViews) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
    }

    @Override // ads_mobile_sdk.yj1
    public final boolean d() {
        return true;
    }

    @Override // ads_mobile_sdk.yj1
    public final int e() {
        return 0;
    }

    @Override // ads_mobile_sdk.yj1
    public final boolean k() {
        return false;
    }

    @Override // ads_mobile_sdk.yj1
    public final void a() {
        this.h.destroy();
    }

    @Override // ads_mobile_sdk.yj1
    public final JsonObject b(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        return new JsonObject();
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(View clickedView, FrameLayout frameLayout, LinkedHashMap assetViews, ImageView.ScaleType mediaViewScaleType) {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        if (this.h.d()) {
            return;
        }
        this.h.a(clickedView);
        cutely.wireman(this.g, null, null, new ry2(this, null), 3, null);
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(FrameLayout nativeAdView, ImageView.ScaleType mediaviewScaleType, Map assetViews) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
        if (this.l) {
            if (this.h.b() && this.j.n0 == g1.THIRD_PARTY_SDK_CALLBACK) {
                cutely.wireman(this.g, null, null, new sy2(this, null), 3, null);
            } else {
                this.h.recordImpression();
                cutely.wireman(this.g, null, null, new ty2(this, null), 3, null);
            }
        }
    }

    @Override // ads_mobile_sdk.yj1
    public final JsonObject a(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        return new JsonObject();
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(FrameLayout frameLayout, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[Catch: RuntimeException -> 0x003d, LOOP:1: B:27:0x0092->B:29:0x0098, LOOP_END, TryCatch #1 {RuntimeException -> 0x003d, blocks: (B:26:0x0081, B:27:0x0092, B:29:0x0098, B:30:0x00a6, B:31:0x00b7, B:33:0x00bd), top: B:53:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[Catch: RuntimeException -> 0x003d, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x003d, blocks: (B:26:0x0081, B:27:0x0092, B:29:0x0098, B:30:0x00a6, B:31:0x00b7, B:33:0x00bd), top: B:53:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[EDGE_INSN: B:37:0x00d5->B:38:0x00d6 BREAK  A[LOOP:0: B:11:0x003d->B:62:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6 A[EDGE_INSN: B:60:0x00d6->B:38:0x00d6 BREAK  A[LOOP:0: B:11:0x003d->B:62:0x003d, LOOP_LABEL: LOOP:0: B:11:0x003d->B:62:0x003d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x003d A[EDGE_INSN: B:64:0x003d->B:62:0x003d BREAK  A[LOOP:2: B:31:0x00b7->B:67:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7 A[SYNTHETIC] */
    @Override // ads_mobile_sdk.yj1
    public final void a(WeakReference nativeAdViewContainer, FrameLayout frameLayout, LinkedHashMap assetViews, View.OnTouchListener touchListener, View.OnClickListener clickListener) {
        boolean z;
        View view;
        Class<?> classOfView;
        xl1 xl1Var;
        ArrayList allowedClasses;
        Iterator<JsonElement> it;
        Iterator it2;
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "nativeAdViewContainer");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(touchListener, "touchListener");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        if (this.j.j0.isEmpty()) {
            z = true;
            break;
        }
        Set<String> setKeySet = this.j.j0.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            z = true;
            break;
        }
        Iterator<T> it3 = setKeySet.iterator();
        loop0: while (true) {
            if (!it3.hasNext()) {
                z = true;
                break;
            }
            String str = (String) it3.next();
            JsonObject jsonObject = this.j.j0;
            Intrinsics.beachfront(str);
            JsonArray jsonArrayD = cb1.d(jsonObject, str);
            if (jsonArrayD != null) {
                z = false;
                if (str.equals("3010")) {
                    View viewA = this.h.a();
                    if (viewA == null) {
                        break;
                    }
                    classOfView = viewA.getClass();
                    try {
                        xl1Var = this.k;
                        allowedClasses = new ArrayList(dovishness.gintrap(jsonArrayD, 10));
                        it = jsonArrayD.iterator();
                        while (it.hasNext()) {
                            allowedClasses.add(it.next().getAsString());
                        }
                        xl1Var.getClass();
                        Intrinsics.checkNotNullParameter(classOfView, "classOfView");
                        Intrinsics.checkNotNullParameter(allowedClasses, "allowedClasses");
                        it2 = allowedClasses.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break loop0;
                            }
                            try {
                                if (Class.forName((String) it2.next(), false, xl1Var.a.getClassLoader()).isAssignableFrom(classOfView)) {
                                    break;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (RuntimeException unused2) {
                        continue;
                    }
                } else {
                    WeakReference weakReference = (WeakReference) assetViews.get(str);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        classOfView = view.getClass();
                        xl1Var = this.k;
                        allowedClasses = new ArrayList(dovishness.gintrap(jsonArrayD, 10));
                        it = jsonArrayD.iterator();
                        while (it.hasNext()) {
                            allowedClasses.add(it.next().getAsString());
                        }
                        xl1Var.getClass();
                        Intrinsics.checkNotNullParameter(classOfView, "classOfView");
                        Intrinsics.checkNotNullParameter(allowedClasses, "allowedClasses");
                        it2 = allowedClasses.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                if (Class.forName((String) it2.next(), false, xl1Var.a.getClassLoader()).isAssignableFrom(classOfView)) {
                                    break;
                                    break;
                                }
                            } else {
                                break loop0;
                                break loop0;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        this.l = z;
        weimar weimarVar = this.h;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : assetViews.entrySet()) {
            String str2 = (String) entry.getKey();
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            Pair pairAttabal = view2 != null ? formularize.attabal(str2, view2) : null;
            if (pairAttabal != null) {
                arrayList.add(pairAttabal);
            }
        }
        weimarVar.a(frameLayout, seminary.dovishness(arrayList), seminary.taiyuan());
    }

    @Override // ads_mobile_sdk.yj1
    public final void c() {
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(FrameLayout frameLayout, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        this.h.a(frameLayout);
    }
}
