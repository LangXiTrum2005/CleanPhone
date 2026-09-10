package com.startapp.sdk.internal;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.thinkup.core.common.n.mo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f41069a = new LruCache(100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f41070b = new HashSet(Arrays.asList(NotDisplayedReason.AD_CLIPPED, NotDisplayedReason.AD_WAS_COVERED));

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v27 */
    public static lk a(View view, Point point, BannerOptions bannerOptions, AtomicReference atomicReference, boolean z2) {
        NotDisplayedReason notDisplayedReason;
        int iApplyDimension;
        JSONArray jSONArray;
        ?? r21;
        ?? r24;
        View view2 = view;
        AtomicReference atomicReference2 = atomicReference;
        lk lkVar = new lk();
        float f = 0.0f;
        Rect rect = null;
        if (view2 == null) {
            return new lk(NotDisplayedReason.INTERNAL_ERROR, 0.0f, null, null);
        }
        int width = view2.getWidth();
        if (width <= 0) {
            return new lk(NotDisplayedReason.VIEW_INVALID_SIZE, 0.0f, null, null);
        }
        int height = view2.getHeight();
        if (height <= 0) {
            return new lk(NotDisplayedReason.VIEW_INVALID_SIZE, 0.0f, null, null);
        }
        boolean z3 = true;
        if (bannerOptions.u()) {
            if (view2.getParent() == null || view2.getRootView() == null || view2.getRootView().getParent() == null) {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_ATTACHED;
            } else if (view2.isShown()) {
                notDisplayedReason = (view2.getWidth() < 1 || view2.getHeight() < 1) ? NotDisplayedReason.VIEW_INVALID_SIZE : null;
            } else {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_VISIBLE;
            }
            if (notDisplayedReason == null) {
                notDisplayedReason = null;
            }
        } else {
            notDisplayedReason = null;
        }
        if (bannerOptions.s() && notDisplayedReason == null && !view2.hasWindowFocus()) {
            notDisplayedReason = NotDisplayedReason.WINDOW_NOT_FOCUSED;
        }
        boolean zR = bannerOptions.r();
        if (!zR && !z2) {
            return lkVar;
        }
        if (point != null) {
            DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
            iApplyDimension = ((int) TypedValue.applyDimension(1, point.x, displayMetrics)) * ((int) TypedValue.applyDimension(1, point.y, displayMetrics));
        } else {
            iApplyDimension = width * height;
        }
        int iMin = (Math.min(Math.max(1, bannerOptions.h()), 100) * iApplyDimension) / 100;
        Rect rect2 = new Rect();
        if (!view2.getGlobalVisibleRect(rect2) && zR && notDisplayedReason == null) {
            notDisplayedReason = NotDisplayedReason.AD_CLIPPED;
        }
        if (rect2.isEmpty() && zR && notDisplayedReason == null) {
            notDisplayedReason = NotDisplayedReason.AD_CLIPPED;
        }
        LinkedList linkedList = new LinkedList();
        NotDisplayedReason notDisplayedReason2 = notDisplayedReason == null ? NotDisplayedReason.AD_CLIPPED : notDisplayedReason;
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        view2.getGlobalVisibleRect(rect3);
        Region region = new Region(rect3);
        atomicReference2.set(a(view2, rect2, true));
        ?? r0 = view2;
        while (true) {
            int i2 = 0;
            if (!(r0.getParent() instanceof ViewGroup)) {
                break;
            }
            if (bannerOptions.t() && r0.getVisibility() != 0 && notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED) {
                notDisplayedReason2 = NotDisplayedReason.VIEW_NOT_VISIBLE;
            }
            if (bannerOptions.q() && r0.getAlpha() < 1.0f && notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED) {
                notDisplayedReason2 = NotDisplayedReason.VIEW_TRANSPARENT;
            }
            ?? r3 = (ViewGroup) r0.getParent();
            JSONObject jSONObjectA = a(r3, ((r3.getParent() instanceof ViewGroup) || !r3.getGlobalVisibleRect(rect4)) ? rect : rect4, false);
            float f2 = f;
            JSONObject jSONObject = (JSONObject) atomicReference2.get();
            JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("children");
            boolean z4 = z3;
            if (jSONArrayOptJSONArray == null) {
                jSONArray = new JSONArray();
                try {
                    jSONObjectA.put("children", jSONArray);
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                jSONArray = jSONArrayOptJSONArray;
            }
            jSONArray.put(jSONObject);
            atomicReference2.set(jSONObjectA);
            int iIndexOfChild = r3.indexOfChild(r0);
            int childCount = r3.getChildCount();
            ?? r1 = r0;
            ?? r4 = r3;
            while (i2 < childCount) {
                View childAt = r4.getChildAt(i2);
                if (childAt == r1) {
                    r21 = r1;
                    r24 = r4;
                } else {
                    r21 = r1;
                    r24 = r4;
                    int iCompare = Float.compare(childAt.getZ(), r21.getZ());
                    if (iCompare >= 0 && ((iCompare != 0 || i2 > iIndexOfChild) && childAt.getVisibility() == 0 && childAt.getAlpha() > f2 && childAt.getGlobalVisibleRect(rect4) && Rect.intersects(rect3, rect4))) {
                        region.op(rect4, Region.Op.DIFFERENCE);
                        linkedList.add(new Rect(rect4));
                        JSONObject jSONObjectA2 = a(childAt, rect4, false);
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectA.optJSONArray("children");
                        if (jSONArrayOptJSONArray2 == null) {
                            jSONArrayOptJSONArray2 = new JSONArray();
                            try {
                                jSONObjectA.put("children", jSONArrayOptJSONArray2);
                            } catch (JSONException e3) {
                                throw new RuntimeException(e3);
                            }
                        }
                        jSONArrayOptJSONArray2.put(jSONObjectA2);
                        if (notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED && notDisplayedReason != null) {
                            notDisplayedReason2 = NotDisplayedReason.AD_WAS_COVERED;
                        }
                    }
                }
                i2++;
                r1 = r21;
                r4 = r24;
            }
            atomicReference2 = atomicReference;
            r0 = r4;
            f = f2;
            z3 = z4;
            rect = null;
        }
        RegionIterator regionIterator = new RegionIterator(region);
        int iHeight = 0;
        while (regionIterator.next(rect4)) {
            iHeight += (rect4.height() + 1) * (rect4.width() + 1);
        }
        return new lk((iHeight >= iMin && f41070b.contains(notDisplayedReason2) && notDisplayedReason == null) ? null : notDisplayedReason2, iHeight / iApplyDimension, region.getBounds(), (Rect[]) linkedList.toArray(new Rect[0]));
    }

    public static String b(View view) {
        String name = view.getClass().getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("com.android.")) {
            return view.getClass().getSimpleName();
        }
        String packageName = view.getContext().getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(mo.ono);
        return name.startsWith(sb.toString()) ? name.substring(packageName.length()) : name;
    }

    public static JSONObject a(View view, Rect rect, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", b(view));
            String strA = a(view);
            if (strA != null) {
                jSONObject.put("id", strA);
            }
            if (z2) {
                jSONObject.put("target", true);
            }
            if (view.getAlpha() < 1.0f) {
                jSONObject.put("alpha", view.getAlpha());
            }
            if (rect != null) {
                jSONObject.put(TtmlNode.LEFT, rect.left);
                jSONObject.put("top", rect.top);
                jSONObject.put(TtmlNode.RIGHT, rect.right);
                jSONObject.put("bottom", rect.bottom);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String a(View view) {
        int id = view.getId();
        if (id == -1 || id == 0) {
            return null;
        }
        LruCache lruCache = f41069a;
        synchronized (lruCache) {
            try {
                String str = (String) lruCache.get(Integer.valueOf(id));
                if (str != null) {
                    return str;
                }
                try {
                    return view.getContext().getResources().getResourceName(id);
                } catch (Resources.NotFoundException unused) {
                    String strH = androidx.datastore.preferences.protobuf.a.h(id, new StringBuilder("0x"));
                    LruCache lruCache2 = f41069a;
                    synchronized (lruCache2) {
                        lruCache2.put(Integer.valueOf(id), strH);
                        return strH;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
