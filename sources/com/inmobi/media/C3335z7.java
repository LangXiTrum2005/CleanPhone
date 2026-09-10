package com.inmobi.media;

import android.view.MotionEvent;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3335z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3005ec f24149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24151c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24152e;
    public float f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24154i;
    public JSONArray j;
    public MotionEvent k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24155l;

    public C3335z7(GestureDetectorOnGestureListenerC3005ec mListener) {
        Intrinsics.f(mListener, "mListener");
        this.f24149a = mListener;
        this.f24150b = "z7";
        this.f24155l = Integer.MAX_VALUE;
        this.g = -1;
        this.f24153h = -1;
    }

    public final void a(MotionEvent event) {
        float y;
        float x;
        float f;
        Intrinsics.f(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            String TAG = this.f24150b;
            Intrinsics.e(TAG, "TAG");
            event.toString();
            this.g = event.getPointerId(event.getActionIndex());
            this.j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(event.getX())), Integer.valueOf(B2.c(event.getY()))));
            JSONArray jSONArray2 = this.j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            String TAG2 = this.f24150b;
            Intrinsics.e(TAG2, "TAG");
            event.toString();
            this.g = -1;
            JSONArray jSONArray3 = this.j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24149a;
            if (gestureDetectorOnGestureListenerC3005ec.f23585e || !gestureDetectorOnGestureListenerC3005ec.getRenderingConfig().getSupportedGestures().contains(2)) {
                InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                if (interfaceC3333z5 != null) {
                    String TAG3 = GestureDetectorOnGestureListenerC3005ec.a1;
                    Intrinsics.e(TAG3, "TAG");
                    ((A5) interfaceC3333z5).c(TAG3, "Pan gesture is disabled from config");
                }
            } else {
                InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                if (interfaceC3333z6 != null) {
                    String str = GestureDetectorOnGestureListenerC3005ec.a1;
                    StringBuilder sbA = H6.a(str, "TAG", "onPanDetected\n ");
                    JSONArray jSONArray4 = this.j;
                    sbA.append(jSONArray4 != null ? Integer.valueOf(jSONArray4.length()) : null);
                    sbA.append(" \n ");
                    sbA.append(this.j);
                    ((A5) interfaceC3333z6).a(str, StringsKt.c0(sbA.toString()));
                }
                gestureDetectorOnGestureListenerC3005ec.c("window.imraidview.onGestureDetected('2', '" + this.j + "');");
            }
            this.j = new JSONArray();
            return;
        }
        float y2 = 0.0f;
        if (actionMasked == 2) {
            JSONArray jSONArray5 = this.j;
            int i2 = this.g;
            if (i2 == -1 || this.f24153h == -1) {
                if (i2 == -1 || jSONArray5 == null || jSONArray5.length() <= 0 || jSONArray5.length() >= 50) {
                    return;
                }
                try {
                    int iC = B2.c(event.getX());
                    int iC2 = B2.c(event.getY());
                    JSONArray jSONArray6 = jSONArray5.getJSONArray(jSONArray5.length() - 1);
                    JSONArray jSONArray7 = new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(iC), Integer.valueOf(iC2)));
                    float f2 = jSONArray6.getInt(0) - jSONArray7.getInt(0);
                    float f3 = jSONArray6.getInt(1) - jSONArray7.getInt(1);
                    if (((int) Math.sqrt((f3 * f3) + (f2 * f2))) > 100) {
                        jSONArray5.put(jSONArray7);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int iFindPointerIndex = event.findPointerIndex(i2);
            int iFindPointerIndex2 = event.findPointerIndex(this.f24153h);
            if (iFindPointerIndex >= 0) {
                x = event.getX(iFindPointerIndex);
                y = event.getY(iFindPointerIndex);
            } else {
                S5 s5 = S5.f23167a;
                StringBuilder sb = new StringBuilder("Index for mPtrID1=");
                androidx.datastore.preferences.protobuf.a.y(sb, this.g, " is ", iFindPointerIndex, " | Pointer count=");
                sb.append(event.getPointerCount());
                S5.d.a(new C3011f2(new IllegalArgumentException(sb.toString())));
                y = 0.0f;
                x = 0.0f;
            }
            if (iFindPointerIndex2 >= 0) {
                float x2 = event.getX(iFindPointerIndex2);
                y2 = event.getY(iFindPointerIndex2);
                f = x2;
            } else {
                S5 s6 = S5.f23167a;
                StringBuilder sb2 = new StringBuilder("Index for mPtrID1=");
                androidx.datastore.preferences.protobuf.a.y(sb2, this.f24153h, " is ", iFindPointerIndex2, " | Pointer count=");
                sb2.append(event.getPointerCount());
                S5.d.a(new C3011f2(new IllegalArgumentException(sb2.toString())));
                f = 0.0f;
            }
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.d - this.f, this.f24151c - this.f24152e)) - ((float) Math.atan2(y2 - y, f - x)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.f24154i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            String TAG4 = this.f24150b;
            Intrinsics.e(TAG4, "TAG");
            event.toString();
            this.g = -1;
            this.f24153h = -1;
            return;
        }
        if (actionMasked == 5) {
            String TAG5 = this.f24150b;
            Intrinsics.e(TAG5, "TAG");
            event.toString();
            this.f24153h = event.getPointerId(event.getActionIndex());
            this.k = MotionEvent.obtain(event);
            int iFindPointerIndex3 = event.findPointerIndex(this.g);
            int iFindPointerIndex4 = event.findPointerIndex(this.f24153h);
            if (iFindPointerIndex3 >= 0) {
                this.f24152e = event.getX(iFindPointerIndex3);
                this.f = event.getY(iFindPointerIndex3);
            } else {
                S5 s7 = S5.f23167a;
                StringBuilder sb3 = new StringBuilder("Index for mPtrID1=");
                androidx.datastore.preferences.protobuf.a.y(sb3, this.g, " is ", iFindPointerIndex3, " | Pointer count=");
                sb3.append(event.getPointerCount());
                S5.d.a(new C3011f2(new IllegalArgumentException(sb3.toString())));
            }
            if (iFindPointerIndex4 >= 0) {
                this.f24151c = event.getX(iFindPointerIndex4);
                this.d = event.getY(iFindPointerIndex4);
            } else {
                S5 s8 = S5.f23167a;
                StringBuilder sb4 = new StringBuilder("Index for mPtrID2=");
                androidx.datastore.preferences.protobuf.a.y(sb4, this.f24153h, " is ", iFindPointerIndex4, " | Pointer count=");
                sb4.append(event.getPointerCount());
                S5.d.a(new C3011f2(new IllegalArgumentException(sb4.toString())));
            }
            float f4 = this.f24152e - this.f24151c;
            float f5 = this.f - this.d;
            this.f24155l = (int) Math.sqrt((f5 * f5) + (f4 * f4));
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        String TAG6 = this.f24150b;
        Intrinsics.e(TAG6, "TAG");
        event.toString();
        this.f24153h = -1;
        if (this.f24154i > 30.0f) {
            MotionEvent motionEvent = this.k;
            if (motionEvent != null) {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f24149a;
                if (gestureDetectorOnGestureListenerC3005ec2.f23585e || !gestureDetectorOnGestureListenerC3005ec2.getRenderingConfig().getSupportedGestures().contains(3)) {
                    InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec2.f23587i;
                    if (interfaceC3333z7 != null) {
                        String TAG7 = GestureDetectorOnGestureListenerC3005ec.a1;
                        Intrinsics.e(TAG7, "TAG");
                        ((A5) interfaceC3333z7).c(TAG7, "Rotation gesture is disabled from config");
                    }
                } else {
                    InterfaceC3333z5 interfaceC3333z8 = gestureDetectorOnGestureListenerC3005ec2.f23587i;
                    if (interfaceC3333z8 != null) {
                        String str2 = GestureDetectorOnGestureListenerC3005ec.a1;
                        StringBuilder sbA2 = H6.a(str2, "TAG", " Rotation detected ");
                        sbA2.append(this.f24154i);
                        sbA2.append(" \n ");
                        sbA2.append(motionEvent);
                        sbA2.append(" \n ");
                        sbA2.append(event);
                        ((A5) interfaceC3333z8).a(str2, StringsKt.c0(sbA2.toString()));
                    }
                    JSONArray jSONArray8 = new JSONArray();
                    jSONArray8.put(new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(motionEvent.getX())), Integer.valueOf(B2.c(motionEvent.getY())))));
                    jSONArray8.put(new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(motionEvent.getX(1))), Integer.valueOf(B2.c(motionEvent.getY(1))))));
                    jSONArray8.put(new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(event.getX())), Integer.valueOf(B2.c(event.getY())))));
                    jSONArray8.put(new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c(event.getX(1))), Integer.valueOf(B2.c(event.getY(1))))));
                    gestureDetectorOnGestureListenerC3005ec2.c("window.imraidview.onGestureDetected('3', '" + jSONArray8 + "');");
                }
            }
            this.f24154i = 0.0f;
        }
        float x3 = event.getX() - event.getX(1);
        float y3 = event.getY() - event.getY(1);
        if (Math.abs(((int) Math.sqrt((y3 * y3) + (x3 * x3))) - this.f24155l) > 500) {
            MotionEvent motionEvent2 = this.k;
            if (motionEvent2 != null) {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec3 = this.f24149a;
                if (gestureDetectorOnGestureListenerC3005ec3.f23585e || !gestureDetectorOnGestureListenerC3005ec3.getRenderingConfig().getSupportedGestures().contains(4)) {
                    InterfaceC3333z5 interfaceC3333z9 = gestureDetectorOnGestureListenerC3005ec3.f23587i;
                    if (interfaceC3333z9 != null) {
                        String TAG8 = GestureDetectorOnGestureListenerC3005ec.a1;
                        Intrinsics.e(TAG8, "TAG");
                        ((A5) interfaceC3333z9).c(TAG8, "Pinch gesture is disabled from config");
                    }
                } else {
                    InterfaceC3333z5 interfaceC3333z10 = gestureDetectorOnGestureListenerC3005ec3.f23587i;
                    if (interfaceC3333z10 != null) {
                        String TAG9 = GestureDetectorOnGestureListenerC3005ec.a1;
                        Intrinsics.e(TAG9, "TAG");
                        ((A5) interfaceC3333z10).a(TAG9, StringsKt.c0(" onScaleDetected\n " + motionEvent2 + " \n " + event));
                    }
                    JSONArray jSONArray9 = new JSONArray();
                    float f6 = 2;
                    jSONArray9.put(new JSONArray((Collection) CollectionsKt.I(Integer.valueOf(B2.c((event.getX(1) + event.getX()) / f6)), Integer.valueOf(B2.c((event.getY(1) + event.getY()) / f6)))));
                    gestureDetectorOnGestureListenerC3005ec3.c("window.imraidview.onGestureDetected('4', '" + jSONArray9 + "');");
                }
            }
            this.f24155l = Integer.MAX_VALUE;
        }
    }
}
