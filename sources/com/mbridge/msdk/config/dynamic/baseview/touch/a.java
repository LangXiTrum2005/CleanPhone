package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f32643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f32644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f32645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f32646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f32647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f32648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f32651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f32652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f32653k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f32656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<C0109a> f32657p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32658q = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0109a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f32660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f32661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f32662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f32663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f32664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f32665g;

        public C0109a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f32659a = i10;
            this.f32660b = f10;
            this.f32661c = f11;
            this.f32662d = f12;
            this.f32663e = f13;
            this.f32664f = f14;
            this.f32665g = i11;
        }
    }

    private float a(MotionEvent motionEvent) {
        return motionEvent.getRawX(motionEvent.getActionIndex());
    }

    private float b(MotionEvent motionEvent) {
        return motionEvent.getRawY(motionEvent.getActionIndex());
    }

    private void g(MotionEvent motionEvent) {
        this.f32657p.clear();
        this.f32658q = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < this.f32658q; i10++) {
            this.f32657p.add(new C0109a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
        }
    }

    private void h(MotionEvent motionEvent) {
        this.f32651i = motionEvent.getPressure();
        this.f32652j = motionEvent.getSize();
        this.f32653k = motionEvent.getOrientation();
        this.l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f32643a = a(motionEvent);
        this.f32644b = b(motionEvent);
        this.f32649g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.f32645c = a(motionEvent);
        this.f32646d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f32647e = a(motionEvent);
        this.f32648f = b(motionEvent);
        this.f32650h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0109a c0109a : this.f32657p) {
            HashMap map2 = new HashMap();
            map2.put("x", String.valueOf(c0109a.f32660b));
            map2.put("y", String.valueOf(c0109a.f32661c));
            map2.put("pressure", String.valueOf(c0109a.f32662d));
            map2.put("size", String.valueOf(c0109a.f32663e));
            map2.put("id", Integer.valueOf(c0109a.f32659a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    public void c(View view) {
        this.f32656o = view;
        this.f32654m = view.getWidth();
        this.f32655n = view.getHeight();
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f32643a));
        map.put("down_y", Float.valueOf(this.f32644b));
        map.put("down_time", Long.valueOf(this.f32649g));
        map.put("up_x", Float.valueOf(this.f32647e));
        map.put("up_y", Float.valueOf(this.f32648f));
        map.put("up_time", Long.valueOf(this.f32650h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f32656o;
        if (view != null) {
            map.put("class_name", view.getClass().getSimpleName());
            String strB = b(this.f32656o);
            map.put("resource_id", strB);
            String strA = a(this.f32656o);
            map.put("content_desc", strA);
            map.put("view_format", this.f32656o.getClass().getSimpleName() + "#" + strB + "(" + strA + ")");
        }
    }

    private void a(HashMap<String, Object> map) {
        map.put("event_name", "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f32649g));
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    public void c() {
        this.f32648f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32647e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32646d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32645c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32644b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32643a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32650h = 0L;
        this.f32649g = 0L;
        this.f32653k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32652j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f32651i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = 0;
        this.f32655n = 0;
        this.f32654m = 0;
        this.f32656o = null;
        this.f32658q = 0;
        this.f32657p.clear();
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    public C0109a b() {
        if (this.f32657p.isEmpty()) {
            return null;
        }
        return this.f32657p.get(0);
    }
}
