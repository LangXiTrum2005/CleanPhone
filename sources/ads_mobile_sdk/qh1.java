package ads_mobile_sdk;

import ads_mobile_sdk.qh1;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.unity3d.ads.BuildConfig;
import formularization.beachfront;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import patroclinal.formularize;
import saneness.delouse;
import saneness.imari;

/* JADX INFO: loaded from: classes.dex */
public final class qh1 {
    public final ag1 a;
    public final saran b;
    public final saran c;
    public final ii1 d;
    public final x e;
    public final delouse f;
    public final xq0 g;
    public final gq0 h;
    public final formularization.attabal i;
    public PopupWindow j;
    public ImageView k;
    public ViewGroup.LayoutParams l;
    public ia3 m;
    public ViewGroup n;

    public qh1(ag1 mraidAfmaDispatcher, saran uiScope, saran backgroundScope, ii1 mraidViewabilityEventListener, Optional optionalGmaWebViewContainer, x activityTracker, delouse mraidEventEmitter) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(mraidViewabilityEventListener, "mraidViewabilityEventListener");
        Intrinsics.checkNotNullParameter(optionalGmaWebViewContainer, "optionalGmaWebViewContainer");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(mraidEventEmitter, "mraidEventEmitter");
        this.a = mraidAfmaDispatcher;
        this.b = uiScope;
        this.c = backgroundScope;
        this.d = mraidViewabilityEventListener;
        this.e = activityTracker;
        this.f = mraidEventEmitter;
        xq0 xq0Var = (xq0) monocoque.attabal.saneness(optionalGmaWebViewContainer);
        this.g = xq0Var;
        this.h = xq0Var != null ? xq0Var.a() : null;
        this.i = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(qh1 qh1Var, boolean z, wretchedly.dern dernVar) throws Throwable {
        jh1 jh1Var;
        formularization.attabal attabalVar;
        PopupWindow popupWindow;
        qh1 qh1Var2;
        formularization.attabal attabalVar2;
        ImageView imageView;
        Throwable th;
        qh1Var.getClass();
        if (dernVar instanceof jh1) {
            jh1Var = (jh1) dernVar;
            int i = jh1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jh1Var.f = i - Integer.MIN_VALUE;
            } else {
                jh1Var = new jh1(qh1Var, dernVar);
            }
        } else {
            jh1Var = new jh1(qh1Var, dernVar);
        }
        Object obj = jh1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jh1Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = qh1Var.i;
                jh1Var.a = qh1Var;
                jh1Var.b = attabalVar;
                jh1Var.c = z;
                jh1Var.f = 1;
                if (attabalVar.attabal(null, jh1Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = jh1Var.b;
                qh1Var2 = jh1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    cutely.wireman(qh1Var2.c, null, null, new kh1(qh1Var2, null), 3, null);
                    attabalVar = attabalVar2;
                    qh1Var = qh1Var2;
                    qh1Var.j = null;
                    qh1Var.n = null;
                    qh1Var.k = null;
                    qh1Var.m = null;
                    attabalVar2 = attabalVar;
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            z = jh1Var.c;
            formularization.attabal attabalVar3 = jh1Var.b;
            qh1 qh1Var3 = jh1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            qh1Var = qh1Var3;
            if (qh1Var.h != null && qh1Var.g != null && (popupWindow = qh1Var.j) != null) {
                popupWindow.dismiss();
                ViewGroup viewGroup = qh1Var.n;
                if (viewGroup != null && (imageView = qh1Var.k) != null) {
                    viewGroup.removeView(imageView);
                    ViewParent parent = qh1Var.g.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(qh1Var.g);
                    }
                    ia3 ia3Var = qh1Var.m;
                    if (ia3Var != null) {
                        qh1Var.h.a(ia3Var);
                    }
                    qh1Var.g.setLayoutParams(qh1Var.l);
                    viewGroup.addView(qh1Var.g);
                }
                if (z) {
                    ag1 ag1Var = qh1Var.a;
                    gq0 gq0Var = qh1Var.h;
                    jh1Var.a = qh1Var;
                    jh1Var.b = attabalVar;
                    jh1Var.f = 2;
                    ag1Var.getClass();
                    if (ag1.a(gq0Var, BuildConfig.FLAVOR, jh1Var) != objBeachfront) {
                        qh1Var2 = qh1Var;
                        attabalVar2 = attabalVar;
                        cutely.wireman(qh1Var2.c, null, null, new kh1(qh1Var2, null), 3, null);
                        attabalVar = attabalVar2;
                        qh1Var = qh1Var2;
                    }
                    return objBeachfront;
                }
                qh1Var.j = null;
                qh1Var.n = null;
                qh1Var.k = null;
                qh1Var.m = null;
            }
            attabalVar2 = attabalVar;
            Unit unit2 = Unit.f29295attabal;
            attabalVar2.wireman(null);
            return unit2;
        } catch (Throwable th3) {
            th = th3;
            attabalVar2 = attabalVar;
            attabalVar2.wireman(null);
            throw th;
        }
    }

    public final void a(boolean z) {
        cutely.wireman(this.b, null, null, new ih1(this, z, null), 3, null);
    }

    public final PopupWindow a(bg2 bg2Var, Activity activity, gq0 gq0Var) {
        String string;
        int i = bg2Var.a;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int iApplyDimension = (int) TypedValue.applyDimension(1, i, displayMetrics);
        int i2 = bg2Var.b;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, i2, displayMetrics2);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(iApplyDimension, iApplyDimension2));
        relativeLayout.addView(this.g, -1, -1);
        gq0Var.a(new ia3(ha3.FIXED_RECTANGLE, iApplyDimension, iApplyDimension2, 8));
        LinearLayout linearLayout = new LinearLayout(activity);
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        DisplayMetrics displayMetrics3 = activity.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, 50, displayMetrics3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iApplyDimension3, iApplyDimension3);
        Iterator<E> it = bg2Var.f.a.iterator();
        while (it.hasNext()) {
            layoutParams.addRule(((Number) it.next()).intValue());
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: saneness.fastidiously
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qh1.a(this.f37148kowloon, view);
            }
        });
        Resources resources = activity.getResources();
        if (resources == null || (string = resources.getString(danae.dern.close_button)) == null) {
            string = "Close button";
        }
        linearLayout.setContentDescription(string);
        relativeLayout.addView(linearLayout, layoutParams);
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, iApplyDimension, iApplyDimension2, false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setTouchable(true);
        popupWindow.setClippingEnabled(!bg2Var.e);
        return popupWindow;
    }

    public static final void a(qh1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(true);
    }

    public final void a(gq0 gq0Var, String str) {
        cutely.wireman(this.b, null, null, new lh1(str, this, gq0Var, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2 A[Catch: all -> 0x010c, TryCatch #4 {all -> 0x010c, blocks: (B:14:0x0042, B:58:0x01b4, B:81:0x0202, B:66:0x01c2, B:68:0x01e2, B:71:0x01e8, B:72:0x01eb, B:74:0x01ef, B:75:0x01f4, B:77:0x01f8, B:78:0x01fb, B:80:0x01ff, B:54:0x0197, B:32:0x00cb, B:34:0x00cf, B:35:0x00e4, B:36:0x00f2, B:41:0x0112, B:42:0x0119, B:43:0x011d, B:45:0x0124, B:46:0x0127, B:47:0x012f, B:49:0x018a), top: B:94:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e8 A[Catch: all -> 0x010c, TryCatch #4 {all -> 0x010c, blocks: (B:14:0x0042, B:58:0x01b4, B:81:0x0202, B:66:0x01c2, B:68:0x01e2, B:71:0x01e8, B:72:0x01eb, B:74:0x01ef, B:75:0x01f4, B:77:0x01f8, B:78:0x01fb, B:80:0x01ff, B:54:0x0197, B:32:0x00cb, B:34:0x00cf, B:35:0x00e4, B:36:0x00f2, B:41:0x0112, B:42:0x0119, B:43:0x011d, B:45:0x0124, B:46:0x0127, B:47:0x012f, B:49:0x018a), top: B:94:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ef A[Catch: all -> 0x010c, TryCatch #4 {all -> 0x010c, blocks: (B:14:0x0042, B:58:0x01b4, B:81:0x0202, B:66:0x01c2, B:68:0x01e2, B:71:0x01e8, B:72:0x01eb, B:74:0x01ef, B:75:0x01f4, B:77:0x01f8, B:78:0x01fb, B:80:0x01ff, B:54:0x0197, B:32:0x00cb, B:34:0x00cf, B:35:0x00e4, B:36:0x00f2, B:41:0x0112, B:42:0x0119, B:43:0x011d, B:45:0x0124, B:46:0x0127, B:47:0x012f, B:49:0x018a), top: B:94:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f8 A[Catch: all -> 0x010c, TryCatch #4 {all -> 0x010c, blocks: (B:14:0x0042, B:58:0x01b4, B:81:0x0202, B:66:0x01c2, B:68:0x01e2, B:71:0x01e8, B:72:0x01eb, B:74:0x01ef, B:75:0x01f4, B:77:0x01f8, B:78:0x01fb, B:80:0x01ff, B:54:0x0197, B:32:0x00cb, B:34:0x00cf, B:35:0x00e4, B:36:0x00f2, B:41:0x0112, B:42:0x0119, B:43:0x011d, B:45:0x0124, B:46:0x0127, B:47:0x012f, B:49:0x018a), top: B:94:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ff A[Catch: all -> 0x010c, TryCatch #4 {all -> 0x010c, blocks: (B:14:0x0042, B:58:0x01b4, B:81:0x0202, B:66:0x01c2, B:68:0x01e2, B:71:0x01e8, B:72:0x01eb, B:74:0x01ef, B:75:0x01f4, B:77:0x01f8, B:78:0x01fb, B:80:0x01ff, B:54:0x0197, B:32:0x00cb, B:34:0x00cf, B:35:0x00e4, B:36:0x00f2, B:41:0x0112, B:42:0x0119, B:43:0x011d, B:45:0x0124, B:46:0x0127, B:47:0x012f, B:49:0x018a), top: B:94:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v9, types: [formularization.attabal] */
    public final Object a(ViewGroup viewGroup, bg2 bg2Var, Activity activity, Window window, gq0 gq0Var, xq0 xq0Var, wretchedly.dern dernVar) throws Throwable {
        mh1 mh1Var;
        ?? r4;
        bg2 bg2Var2;
        Activity activity2;
        Window window2;
        gq0 gq0Var2;
        qh1 qh1Var;
        xq0 xq0Var2;
        ViewGroup viewGroup2;
        formularization.attabal attabalVar;
        PopupWindow popupWindowA;
        Point pointA;
        int i;
        int i2;
        int i3;
        int i4;
        mh1 mh1Var2;
        gq0 gq0Var3;
        mh1 mh1Var3;
        gq0 gq0Var4;
        qh1 qh1Var2;
        ImageView imageView;
        xq0 xq0Var3;
        PopupWindow popupWindow;
        ViewParent parent;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        ia3 ia3Var;
        if (dernVar instanceof mh1) {
            mh1Var = (mh1) dernVar;
            int i5 = mh1Var.k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mh1Var.k = i5 - Integer.MIN_VALUE;
            } else {
                mh1Var = new mh1(this, dernVar);
            }
        } else {
            mh1Var = new mh1(this, dernVar);
        }
        Object obj = mh1Var.i;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r5 = mh1Var.k;
        try {
            try {
                try {
                    if (r5 == 0) {
                        p002kotlin.dern.saneness(obj);
                        formularization.attabal attabalVar2 = this.i;
                        mh1Var.a = this;
                        mh1Var.b = viewGroup;
                        bg2Var2 = bg2Var;
                        mh1Var.c = bg2Var2;
                        activity2 = activity;
                        mh1Var.d = activity2;
                        window2 = window;
                        mh1Var.e = window2;
                        gq0Var2 = gq0Var;
                        mh1Var.f = gq0Var2;
                        mh1Var.g = xq0Var;
                        mh1Var.h = attabalVar2;
                        mh1Var.k = 1;
                        if (attabalVar2.attabal(null, mh1Var) != objBeachfront) {
                            qh1Var = this;
                            xq0Var2 = xq0Var;
                            viewGroup2 = viewGroup;
                            attabalVar = attabalVar2;
                        }
                        return objBeachfront;
                    }
                    if (r5 == 1) {
                        formularization.attabal attabalVar3 = mh1Var.h;
                        xq0Var2 = mh1Var.g;
                        gq0 gq0Var5 = mh1Var.f;
                        Window window3 = (Window) mh1Var.e;
                        Activity activity3 = (Activity) mh1Var.d;
                        bg2 bg2Var3 = (bg2) mh1Var.c;
                        viewGroup2 = mh1Var.b;
                        qh1Var = mh1Var.a;
                        p002kotlin.dern.saneness(obj);
                        gq0Var2 = gq0Var5;
                        bg2Var2 = bg2Var3;
                        window2 = window3;
                        activity2 = activity3;
                        attabalVar = attabalVar3;
                    } else {
                        if (r5 != 2) {
                            if (r5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            popupWindow = (PopupWindow) mh1Var.e;
                            attabalVar = (formularization.attabal) mh1Var.d;
                            xq0Var3 = (xq0) mh1Var.c;
                            gq0Var4 = (gq0) mh1Var.b;
                            qh1Var2 = mh1Var.a;
                            try {
                                p002kotlin.dern.saneness(obj);
                                attabalVar = attabalVar;
                                qh1Var2.j = popupWindow;
                                r5 = attabalVar;
                            } catch (Exception e) {
                                e = e;
                                qh1Var = qh1Var2;
                                xq0Var2 = xq0Var3;
                                gq0Var2 = gq0Var4;
                                qh1Var.a(gq0Var2, "Cannot show popup window: " + e.getMessage());
                                parent = xq0Var2.getParent();
                                if (parent instanceof ViewGroup) {
                                    viewGroup3 = (ViewGroup) parent;
                                } else {
                                    viewGroup3 = null;
                                }
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(xq0Var2);
                                }
                                viewGroup4 = qh1Var.n;
                                if (viewGroup4 != null) {
                                    viewGroup4.removeView(qh1Var.k);
                                }
                                viewGroup5 = qh1Var.n;
                                if (viewGroup5 != null) {
                                    viewGroup5.addView(xq0Var2);
                                }
                                ia3Var = qh1Var.m;
                                r5 = attabalVar;
                                if (ia3Var != null) {
                                    gq0Var2.a(ia3Var);
                                    r5 = attabalVar;
                                }
                            }
                            Unit unit = Unit.f29295attabal;
                            r5.wireman(null);
                            return unit;
                        }
                        PopupWindow popupWindow2 = (PopupWindow) mh1Var.e;
                        formularization.attabal attabalVar4 = (formularization.attabal) mh1Var.d;
                        xq0Var2 = (xq0) mh1Var.c;
                        gq0 gq0Var6 = (gq0) mh1Var.b;
                        qh1 qh1Var3 = mh1Var.a;
                        try {
                            p002kotlin.dern.saneness(obj);
                            mh1Var3 = mh1Var;
                            popupWindowA = popupWindow2;
                            attabalVar = attabalVar4;
                            gq0Var4 = gq0Var6;
                            qh1Var2 = qh1Var3;
                            try {
                                ag1 ag1Var = qh1Var2.a;
                                mh1Var3.a = qh1Var2;
                                mh1Var3.b = gq0Var4;
                                mh1Var3.c = xq0Var2;
                                mh1Var3.d = attabalVar;
                                mh1Var3.e = popupWindowA;
                                mh1Var3.k = 3;
                                ag1Var.getClass();
                                if (ag1.a(gq0Var4, "resized", mh1Var3) != objBeachfront) {
                                    popupWindow = popupWindowA;
                                    xq0Var3 = xq0Var2;
                                    attabalVar = attabalVar;
                                    qh1Var2.j = popupWindow;
                                    r5 = attabalVar;
                                    Unit unit2 = Unit.f29295attabal;
                                    r5.wireman(null);
                                    return unit2;
                                }
                                return objBeachfront;
                            } catch (Exception e2) {
                                e = e2;
                                xq0Var3 = xq0Var2;
                                qh1Var = qh1Var2;
                                xq0Var2 = xq0Var3;
                                gq0Var2 = gq0Var4;
                                qh1Var.a(gq0Var2, "Cannot show popup window: " + e.getMessage());
                                parent = xq0Var2.getParent();
                                if (parent instanceof ViewGroup) {
                                    viewGroup3 = (ViewGroup) parent;
                                } else {
                                    viewGroup3 = null;
                                }
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(xq0Var2);
                                }
                                viewGroup4 = qh1Var.n;
                                if (viewGroup4 != null) {
                                    viewGroup4.removeView(qh1Var.k);
                                }
                                viewGroup5 = qh1Var.n;
                                if (viewGroup5 != null) {
                                    viewGroup5.addView(xq0Var2);
                                }
                                ia3Var = qh1Var.m;
                                r5 = attabalVar;
                                if (ia3Var != null) {
                                    gq0Var2.a(ia3Var);
                                    r5 = attabalVar;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            attabalVar = attabalVar4;
                            xq0Var3 = xq0Var2;
                            gq0Var4 = gq0Var6;
                            qh1Var2 = qh1Var3;
                            qh1Var = qh1Var2;
                            xq0Var2 = xq0Var3;
                            gq0Var2 = gq0Var4;
                            qh1Var.a(gq0Var2, "Cannot show popup window: " + e.getMessage());
                            parent = xq0Var2.getParent();
                            if (parent instanceof ViewGroup) {
                                viewGroup3 = (ViewGroup) parent;
                            } else {
                                viewGroup3 = null;
                            }
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(xq0Var2);
                            }
                            viewGroup4 = qh1Var.n;
                            if (viewGroup4 != null) {
                                viewGroup4.removeView(qh1Var.k);
                            }
                            viewGroup5 = qh1Var.n;
                            if (viewGroup5 != null) {
                                viewGroup5.addView(xq0Var2);
                            }
                            ia3Var = qh1Var.m;
                            r5 = attabalVar;
                            if (ia3Var != null) {
                                gq0Var2.a(ia3Var);
                                r5 = attabalVar;
                            }
                            Unit unit3 = Unit.f29295attabal;
                            r5.wireman(null);
                            return unit3;
                        } catch (Throwable th) {
                            th = th;
                            r4 = attabalVar4;
                            r4.wireman(null);
                            throw th;
                        }
                    }
                    if (qh1Var.j == null) {
                        qh1Var.m = gq0Var2.e();
                        qh1Var.l = xq0Var2.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams = xq0Var2.getLayoutParams();
                        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
                        try {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(xq0Var2.getWidth(), xq0Var2.getHeight(), Bitmap.Config.ARGB_8888);
                            Intrinsics.beachfront(bitmapCreateBitmap);
                            xq0Var2.draw(new Canvas(bitmapCreateBitmap));
                            imageView = new ImageView(activity2);
                            imageView.setLayoutParams(layoutParams);
                            imageView.setImageBitmap(bitmapCreateBitmap);
                            viewGroup2.addView(imageView);
                        } catch (Exception unused) {
                            imageView = null;
                        }
                        if (imageView == null) {
                            qh1Var.a(gq0Var2, "Unable to create snapshot of webview.");
                            r5 = attabalVar;
                        } else {
                            qh1Var.k = imageView;
                            qh1Var.n = viewGroup2;
                        }
                        Unit unit4 = Unit.f29295attabal;
                        r5.wireman(null);
                        return unit4;
                    }
                    Object objA = ag1.a(gq0Var3, i, i2, i3, i4, mh1Var2);
                    mh1Var3 = mh1Var2;
                    if (objA != objBeachfront) {
                        gq0Var4 = gq0Var3;
                        qh1Var2 = qh1Var;
                        attabalVar = attabalVar;
                        ag1 ag1Var2 = qh1Var2.a;
                        mh1Var3.a = qh1Var2;
                        mh1Var3.b = gq0Var4;
                        mh1Var3.c = xq0Var2;
                        mh1Var3.d = attabalVar;
                        mh1Var3.e = popupWindowA;
                        mh1Var3.k = 3;
                        ag1Var2.getClass();
                        if (ag1.a(gq0Var4, "resized", mh1Var3) != objBeachfront) {
                            popupWindow = popupWindowA;
                            xq0Var3 = xq0Var2;
                            attabalVar = attabalVar;
                            qh1Var2.j = popupWindow;
                            r5 = attabalVar;
                            Unit unit5 = Unit.f29295attabal;
                            r5.wireman(null);
                            return unit5;
                        }
                    }
                    return objBeachfront;
                } catch (Exception e4) {
                    e = e4;
                    gq0Var2 = gq0Var3;
                    qh1Var.a(gq0Var2, "Cannot show popup window: " + e.getMessage());
                    parent = xq0Var2.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup3 = (ViewGroup) parent;
                    } else {
                        viewGroup3 = null;
                    }
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(xq0Var2);
                    }
                    viewGroup4 = qh1Var.n;
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(qh1Var.k);
                    }
                    viewGroup5 = qh1Var.n;
                    if (viewGroup5 != null) {
                        viewGroup5.addView(xq0Var2);
                    }
                    ia3Var = qh1Var.m;
                    r5 = attabalVar;
                    if (ia3Var != null) {
                        gq0Var2.a(ia3Var);
                        r5 = attabalVar;
                    }
                }
                popupWindowA.showAtLocation(window2.getDecorView(), 0, imari.attabal(activity2, pointA.x), imari.attabal(activity2, pointA.y));
                cutely.wireman(qh1Var.c, null, null, new nh1(qh1Var, null), 3, null);
                ag1 ag1Var3 = qh1Var.a;
                i = pointA.x;
                i2 = pointA.y;
                i3 = bg2Var2.a;
                i4 = bg2Var2.b;
                mh1Var.a = qh1Var;
                mh1Var.b = gq0Var2;
                mh1Var.c = xq0Var2;
                mh1Var.d = attabalVar;
                mh1Var.e = popupWindowA;
                mh1Var.f = null;
                mh1Var.g = null;
                mh1Var.h = null;
                mh1Var.k = 2;
                ag1Var3.getClass();
                mh1Var2 = mh1Var;
                gq0Var3 = gq0Var2;
            } catch (Exception e5) {
                e = e5;
            }
            viewGroup2.removeView(xq0Var2);
            PopupWindow popupWindow3 = qh1Var.j;
            if (popupWindow3 != null) {
                popupWindow3.dismiss();
            }
            popupWindowA = qh1Var.a(bg2Var2, activity2, gq0Var2);
            pointA = bg2Var2.a();
        } catch (Throwable th2) {
            th = th2;
            r4 = r5;
        }
    }

    public final Object a(Map map, qg1 qg1Var) {
        return a(this, map, qg1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static Object a(qh1 qh1Var, Map map, wretchedly.dern dernVar) {
        oh1 oh1Var;
        Activity activityB;
        Window window;
        ViewGroup viewGroup;
        int iIntValue;
        int iIntValue2;
        yq yqVar;
        qh1 qh1Var2;
        yq yqVar2;
        int i;
        int i2;
        ?? r0;
        Boolean boolLinendraper;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        Integer intOrNull4;
        Pair pairAttabal;
        Point point;
        Point point2;
        int i3;
        int i4;
        if (dernVar instanceof oh1) {
            oh1Var = (oh1) dernVar;
            int i5 = oh1Var.m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oh1Var.m = i5 - Integer.MIN_VALUE;
            } else {
                oh1Var = new oh1(qh1Var, dernVar);
            }
        } else {
            oh1Var = new oh1(qh1Var, dernVar);
        }
        Object obj = oh1Var.k;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i6 = oh1Var.m;
        if (i6 == 0) {
            p002kotlin.dern.saneness(obj);
            if (qh1Var.h != null && qh1Var.g != null) {
                activityB = qh1Var.e.b();
                if (activityB == null) {
                    qh1Var.a(qh1Var.h, "There is no active activity, cannot resize.");
                    return Unit.f29295attabal;
                }
                if (qh1Var.h.e().a == ha3.FULLSCREEN) {
                    qh1Var.a(qh1Var.h, "Cannot resize full screen webview.");
                    return Unit.f29295attabal;
                }
                if (qh1Var.h.l.get()) {
                    qh1Var.a(qh1Var.h, "Cannot resize expanded webview.");
                    return Unit.f29295attabal;
                }
                window = activityB.getWindow();
                if (window == null) {
                    qh1Var.a(qh1Var.h, "Activity does not have window, cannot resize.");
                    return Unit.f29295attabal;
                }
                ViewParent parent = qh1Var.g.getParent();
                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    qh1Var.a(qh1Var.h, "Cannot resize webview that has no parent.");
                    return Unit.f29295attabal;
                }
                String str = (String) map.get("width");
                iIntValue = -1;
                iIntValue2 = (str == null || (intOrNull4 = StringsKt.toIntOrNull(str)) == null) ? -1 : intOrNull4.intValue();
                String str2 = (String) map.get("height");
                if (str2 != null && (intOrNull3 = StringsKt.toIntOrNull(str2)) != null) {
                    iIntValue = intOrNull3.intValue();
                }
                String str3 = (String) map.get("offsetX");
                int iIntValue3 = (str3 == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue();
                String str4 = (String) map.get("offsetY");
                int iIntValue4 = (str4 == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull.intValue();
                String str5 = (String) map.get("allowOffscreen");
                ?? BooleanValue = (str5 == null || (boolLinendraper = StringsKt.linendraper(str5)) == null) ? 1 : boolLinendraper.booleanValue();
                String str6 = (String) map.get("customClosePosition");
                yq.b.getClass();
                if (str6 != null) {
                    switch (str6) {
                        case "center":
                            yqVar = yq.f;
                            break;
                        case "top-right":
                            yqVar = yq.e;
                            break;
                        case "top-left":
                            yqVar = yq.c;
                            break;
                        case "bottom-left":
                            yqVar = yq.g;
                            break;
                        case "bottom-right":
                            yqVar = yq.i;
                            break;
                        case "bottom-center":
                            yqVar = yq.h;
                            break;
                        case "top-center":
                            yqVar = yq.d;
                            break;
                        default:
                            yqVar = yq.e;
                            break;
                    }
                } else {
                    yqVar = yq.e;
                }
                ii1 ii1Var = qh1Var.d;
                oh1Var.a = qh1Var;
                oh1Var.b = activityB;
                oh1Var.c = window;
                oh1Var.d = viewGroup;
                oh1Var.e = yqVar;
                oh1Var.f = iIntValue2;
                oh1Var.g = iIntValue;
                oh1Var.h = iIntValue3;
                oh1Var.i = iIntValue4;
                oh1Var.j = BooleanValue;
                oh1Var.m = 1;
                ii1Var.getClass();
                Object objA = ii1.a(ii1Var, oh1Var);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
                qh1Var2 = qh1Var;
                yqVar2 = yqVar;
                i = iIntValue3;
                obj = objA;
                i2 = iIntValue4;
                r0 = BooleanValue;
            } else {
                return Unit.f29295attabal;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = oh1Var.j;
            int i8 = oh1Var.i;
            int i9 = oh1Var.h;
            iIntValue = oh1Var.g;
            iIntValue2 = oh1Var.f;
            yq yqVar3 = oh1Var.e;
            viewGroup = oh1Var.d;
            window = oh1Var.c;
            activityB = oh1Var.b;
            qh1 qh1Var3 = oh1Var.a;
            p002kotlin.dern.saneness(obj);
            i2 = i8;
            qh1Var2 = qh1Var3;
            i = i9;
            yqVar2 = yqVar3;
            r0 = i7;
        }
        int i10 = iIntValue;
        int i11 = iIntValue2;
        Rect rect = (Rect) obj;
        if (rect == null) {
            rect = new Rect();
        }
        Rect rect2 = rect;
        Pair pairCompetently = imari.competently(activityB);
        Pair pairWireman = imari.wireman(activityB);
        boolean z = r0 != 0;
        bg2 bg2Var = new bg2(i11, i10, i, i2, z, yqVar2, rect2, pairCompetently, pairWireman);
        boolean z2 = z;
        int iIntValue5 = ((Number) pairCompetently.component1()).intValue();
        int iIntValue6 = ((Number) pairCompetently.component2()).intValue();
        if (i11 < 50 || i11 > iIntValue5) {
            pairAttabal = formularize.attabal(Boolean.FALSE, "Invalid width. Cannot resize.");
        } else if (i10 < 50 || i10 > iIntValue6) {
            pairAttabal = formularize.attabal(Boolean.FALSE, "Invalid height. Cannot resize.");
        } else if (i10 >= iIntValue6 && i11 >= iIntValue5) {
            pairAttabal = formularize.attabal(Boolean.FALSE, "Resize cannot be used to resize to full screen.");
        } else if (z2) {
            int iIntValue7 = ((Number) pairWireman.component1()).intValue();
            int iIntValue8 = ((Number) pairWireman.component2()).intValue();
            int iIntValue9 = ((Number) pairCompetently.component1()).intValue();
            int i12 = rect2.left + i;
            int i13 = i12 + i11;
            int i14 = (i11 / 2) + i12;
            int i15 = rect2.top + i2;
            int i16 = i15 + i10;
            int i17 = (i10 / 2) + i15;
            switch (yqVar2.ordinal()) {
                case 0:
                    point = new Point(i12, i15);
                    point2 = point;
                    i3 = point2.x;
                    if (i3 >= 0 || i3 + 50 > iIntValue9 || (i4 = point2.y) < iIntValue7 || i4 + 50 > iIntValue8) {
                        pairAttabal = formularize.attabal(Boolean.FALSE, "Close button is not visible.");
                    } else {
                        pairAttabal = formularize.attabal(Boolean.TRUE, "");
                    }
                    break;
                case 1:
                    point = new Point(i14 - 25, i15);
                    point2 = point;
                    i3 = point2.x;
                    if (i3 >= 0) {
                    }
                    pairAttabal = formularize.attabal(Boolean.FALSE, "Close button is not visible.");
                    break;
                case 2:
                    point = new Point(i13 - 50, i15);
                    point2 = point;
                    i3 = point2.x;
                    if (i3 >= 0) {
                    }
                    pairAttabal = formularize.attabal(Boolean.FALSE, "Close button is not visible.");
                    break;
                case 3:
                    point2 = new Point(i14 - 25, i17 - 25);
                    i3 = point2.x;
                    if (i3 >= 0) {
                    }
                    pairAttabal = formularize.attabal(Boolean.FALSE, "Close button is not visible.");
                    break;
                case 4:
                    point2 = new Point(i12, i16 - 50);
                    i3 = point2.x;
                    if (i3 >= 0) {
                    }
                    pairAttabal = formularize.attabal(Boolean.FALSE, "Close button is not visible.");
                    break;
                case 5:
                    point2 = new Point(i14 - 25, i16 - 50);
                    i3 = point2.x;
                    if (i3 >= 0) {
                    }
                    pairAttabal = formularize.attabal(Boolean.FALSE, "Close button is not visible.");
                    break;
                case 6:
                    point2 = new Point(i13 - 50, i16 - 50);
                    i3 = point2.x;
                    if (i3 >= 0) {
                    }
                    pairAttabal = formularize.attabal(Boolean.FALSE, "Close button is not visible.");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            pairAttabal = formularize.attabal(Boolean.TRUE, "");
        }
        boolean zBooleanValue = ((Boolean) pairAttabal.component1()).booleanValue();
        String str7 = (String) pairAttabal.component2();
        if (zBooleanValue) {
            cutely.wireman(qh1Var2.b, null, null, new ph1(qh1Var2, viewGroup, bg2Var, activityB, window, null), 3, null);
            return Unit.f29295attabal;
        }
        qh1Var2.a(qh1Var2.h, str7);
        return Unit.f29295attabal;
    }
}
