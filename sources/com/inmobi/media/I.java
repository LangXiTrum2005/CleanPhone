package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3005ec f22866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f22867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22868c;
    public final Sb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3333z5 f22869e;
    public final Context f;
    public B g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public A4 f22870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f22871i;
    public final AtomicBoolean j;
    public ScheduledFuture k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Df f22872l;
    public final H m;

    public I(GestureDetectorOnGestureListenerC3005ec adView, Set set, long j, Sb listener, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(adView, "adView");
        Intrinsics.f(listener, "listener");
        this.f22866a = adView;
        this.f22867b = set;
        this.f22868c = j;
        this.d = listener;
        this.f22869e = interfaceC3333z5;
        this.f = adView.getContext();
        this.f22871i = (ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX();
        this.j = new AtomicBoolean(false);
        this.m = new H(this);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01ac  */
    public static final void a(I i2) {
        C c2;
        float fHeight;
        ArrayList arrayList;
        A4 a4;
        Pair pair;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        i2.getClass();
        Rect rect = new Rect();
        if (i2.f22866a.getRootView() != null && i2.f22866a.getVisibility() == 0 && Uc.m() && i2.f22866a.getGlobalVisibleRect(rect)) {
            Context context = i2.f;
            Intrinsics.e(context, "context");
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
            } catch (Exception unused) {
                pair = new Pair(0, 0);
            }
            int iIntValue = ((Number) pair.X).intValue();
            int iIntValue2 = ((Number) pair.f43249Y).intValue();
            Rect rect2 = new Rect();
            if (!i2.f22866a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
                c2 = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                View rootView = i2.f22866a.getRootView();
                Set set = i2.f22867b;
                if (set == null) {
                    set = EmptySet.X;
                }
                if (rootView instanceof ViewGroup) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(rootView);
                    boolean z2 = false;
                    while (!arrayDeque.isEmpty()) {
                        View view = (View) arrayDeque.pop();
                        if (view.getVisibility() == 0) {
                            if (view.equals(i2.f22866a)) {
                                z2 = true;
                            } else if (!set.contains(view)) {
                                Rect rect3 = new Rect();
                                if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                                    Rect rect4 = new Rect();
                                    boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                                    if (view.equals(i2.f22866a) || (globalVisibleRect && rect4.intersect(rect))) {
                                        boolean z3 = !L3.f22938a.H() || view.getZ() >= i2.f22866a.getZ();
                                        if (z2 && z3) {
                                            arrayList3.add(rect4);
                                        }
                                        if (view instanceof ViewGroup) {
                                            ViewGroup viewGroup = (ViewGroup) view;
                                            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                                arrayDeque.push(viewGroup.getChildAt(childCount));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    B b2 = i2.g;
                    if (b2 != null && (rectF4 = b2.f22706b) != null) {
                        a(rect, arrayList3, rectF4);
                    }
                    B b3 = i2.g;
                    if (b3 != null && (rectF3 = b3.f22706b) != null) {
                        a(rect, arrayList3, rectF3);
                    }
                    B b4 = i2.g;
                    if (b4 != null && (rectF2 = b4.f22707c) != null) {
                        a(rect, arrayList3, rectF2);
                    }
                    B b5 = i2.g;
                    if (b5 != null && (rectF = b5.d) != null) {
                        a(rect, arrayList3, rectF);
                    }
                    if (arrayList3.size() == 1) {
                        arrayList2.add(new RectF((Rect) arrayList3.get(0)));
                    } else {
                        Region region = new Region();
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            region.op((Rect) it.next(), Region.Op.UNION);
                        }
                        RegionIterator regionIterator = new RegionIterator(region);
                        Rect rect5 = new Rect();
                        while (regionIterator.next(rect5)) {
                            arrayList2.add(new RectF(rect5));
                        }
                    }
                }
                c2 = new C(new RectF(rect2), arrayList2, iIntValue, iIntValue2);
            }
        } else {
            c2 = null;
        }
        synchronized (i2) {
            try {
                if (c2 == null) {
                    a4 = new A4(0.0f, null, null);
                } else {
                    RectF rectF5 = c2.f22731a;
                    if (rectF5.isEmpty()) {
                        a4 = new A4(0.0f, null, null);
                    } else {
                        float measuredHeight = i2.f22866a.getMeasuredHeight() * i2.f22866a.getMeasuredWidth();
                        if (measuredHeight <= 0.0f) {
                            a4 = new A4(0.0f, null, null);
                        } else {
                            ArrayList<RectF> arrayList4 = new ArrayList();
                            int[] iArr = new int[2];
                            i2.f22866a.getLocationInWindow(iArr);
                            float f = iArr[0];
                            float f2 = iArr[1];
                            Float fValueOf = Float.valueOf(f);
                            Float fValueOf2 = Float.valueOf(f2);
                            float fFloatValue = fValueOf.floatValue();
                            float fFloatValue2 = fValueOf2.floatValue();
                            for (RectF rectF6 : c2.f22732b) {
                                arrayList4.add(new RectF(rectF6.left - fFloatValue, rectF6.top - fFloatValue2, rectF6.right - fFloatValue, rectF6.bottom - fFloatValue2));
                            }
                            ArrayList<RectF> arrayList5 = c2.f22732b;
                            if (arrayList5.isEmpty()) {
                                fHeight = 0.0f;
                            } else {
                                fHeight = 0.0f;
                                for (RectF rectF7 : arrayList5) {
                                    fHeight += rectF7.height() * rectF7.width();
                                }
                            }
                            float fMin = Math.min(fHeight, measuredHeight);
                            RectF rectF8 = new RectF(rectF5);
                            float fWidth = rectF8.width();
                            float fHeight2 = rectF8.height();
                            float fA = B2.a(Math.min((Math.max(0.0f, ((fWidth <= 0.0f || fHeight2 <= 0.0f) ? 0.0f : Math.max(0.0f, fWidth * fHeight2)) - fMin) / measuredHeight) * 100.0f, 100.0f));
                            B4 b6 = new B4(Math.max(0.0f, B2.a(rectF5.left / U3.b())), Math.max(0.0f, B2.a(rectF5.top / U3.b())), Math.max(0, B2.b(rectF5.width() / U3.b())), Math.max(0, B2.b(rectF5.height() / U3.b())));
                            if (arrayList4.isEmpty()) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.n(arrayList4, 10));
                                for (RectF rectF9 : arrayList4) {
                                    arrayList6.add(new B4(Math.max(0.0f, B2.a(rectF9.left / U3.b())), Math.max(0.0f, B2.a(rectF9.top / U3.b())), Math.max(0, B2.b(rectF9.width() / U3.b())), Math.max(0, B2.b(B2.b(rectF9.height()) / U3.b()))));
                                }
                                arrayList = new ArrayList(CollectionsKt.c0(new D(), arrayList6));
                            }
                            a4 = new A4(fA, b6, arrayList);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i2.a(a4);
    }

    public final void a(A4 metrics) {
        if (Intrinsics.a(metrics, this.f22870h)) {
            return;
        }
        Sb sb = this.d;
        sb.getClass();
        Intrinsics.f(metrics, "metrics");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = sb.f23178a;
        StringBuilder sb2 = new StringBuilder("window.mraidview.broadcastEvent('exposureChange', ");
        sb2.append(metrics.f22679a);
        sb2.append(", ");
        B4 b4 = metrics.f22680b;
        Object jSONArray = AbstractJsonLexerKt.NULL;
        sb2.append(b4 != null ? C4.a(b4) : AbstractJsonLexerKt.NULL);
        sb2.append(", ");
        ArrayList arrayList = metrics.f22681c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C4.a((B4) it.next()));
            }
            jSONArray = new JSONArray((Collection) arrayList2);
        }
        sb2.append(jSONArray);
        sb2.append(");");
        gestureDetectorOnGestureListenerC3005ec.c(sb2.toString());
        this.f22870h = metrics;
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(B2.b(rectF.left), B2.b(rectF.top), B2.b(rectF.right), B2.b(rectF.bottom)));
        }
    }
}
