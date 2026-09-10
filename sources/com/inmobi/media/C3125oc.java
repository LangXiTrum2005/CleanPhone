package com.inmobi.media;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3125oc {
    public final GestureDetectorOnGestureListenerC2829ci a;
    public final String b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public float i;
    public JSONArray j;
    public MotionEvent k;
    public int l;

    public C3125oc(GestureDetectorOnGestureListenerC2829ci mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.a = mListener;
        this.b = C3125oc.class.getSimpleName();
        this.l = Integer.MAX_VALUE;
        this.g = -1;
        this.h = -1;
    }

    public final void a(MotionEvent event) {
        float y;
        float x;
        float f;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            String TAG = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            event.toString();
            this.g = event.getPointerId(event.getActionIndex());
            this.j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(F3.c(event.getX())), Integer.valueOf(F3.c(event.getY()))));
            JSONArray jSONArray2 = this.j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            String TAG2 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            event.toString();
            this.g = -1;
            JSONArray jSONArray3 = this.j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.a.a(this);
            this.j = new JSONArray();
            return;
        }
        float y2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (actionMasked == 2) {
            JSONArray jSONArray4 = this.j;
            int i = this.g;
            if (i == -1 || this.h == -1) {
                if (i == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int iC = F3.c(event.getX());
                    int iC2 = F3.c(event.getY());
                    JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    JSONArray jSONArray6 = new JSONArray((Collection) adultoid.kowloon(Integer.valueOf(iC), Integer.valueOf(iC2)));
                    float f2 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f3 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) Math.sqrt((f3 * f3) + (f2 * f2))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int iFindPointerIndex = event.findPointerIndex(i);
            int iFindPointerIndex2 = event.findPointerIndex(this.h);
            if (iFindPointerIndex >= 0) {
                x = event.getX(iFindPointerIndex);
                y = event.getY(iFindPointerIndex);
            } else {
                taiyuan taiyuanVar = P9.a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.g + " is " + iFindPointerIndex + " | Pointer count=" + event.getPointerCount())));
                y = 0.0f;
                x = 0.0f;
            }
            if (iFindPointerIndex2 >= 0) {
                float x2 = event.getX(iFindPointerIndex2);
                y2 = event.getY(iFindPointerIndex2);
                f = x2;
            } else {
                taiyuan taiyuanVar2 = P9.a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.h + " is " + iFindPointerIndex2 + " | Pointer count=" + event.getPointerCount())));
                f = 0.0f;
            }
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.d - this.f, this.c - this.e)) - ((float) Math.atan2(y2 - y, f - x)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            String TAG3 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            event.toString();
            this.g = -1;
            this.h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            String TAG4 = this.b;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            event.toString();
            this.h = -1;
            if (this.i > 30.0f) {
                MotionEvent motionEvent = this.k;
                if (motionEvent != null) {
                    this.a.b(this, motionEvent, event);
                }
                this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float x3 = event.getX() - event.getX(1);
            float y3 = event.getY() - event.getY(1);
            if (Math.abs(((int) Math.sqrt((y3 * y3) + (x3 * x3))) - this.l) > 500) {
                MotionEvent motionEvent2 = this.k;
                if (motionEvent2 != null) {
                    this.a.a(this, motionEvent2, event);
                }
                this.l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        String TAG5 = this.b;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        event.toString();
        this.h = event.getPointerId(event.getActionIndex());
        this.k = MotionEvent.obtain(event);
        int iFindPointerIndex3 = event.findPointerIndex(this.g);
        int iFindPointerIndex4 = event.findPointerIndex(this.h);
        if (iFindPointerIndex3 >= 0) {
            this.e = event.getX(iFindPointerIndex3);
            this.f = event.getY(iFindPointerIndex3);
        } else {
            taiyuan taiyuanVar3 = P9.a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.g + " is " + iFindPointerIndex3 + " | Pointer count=" + event.getPointerCount())));
        }
        if (iFindPointerIndex4 >= 0) {
            this.c = event.getX(iFindPointerIndex4);
            this.d = event.getY(iFindPointerIndex4);
        } else {
            taiyuan taiyuanVar4 = P9.a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID2=" + this.h + " is " + iFindPointerIndex4 + " | Pointer count=" + event.getPointerCount())));
        }
        float f4 = this.e - this.c;
        float f5 = this.f - this.d;
        this.l = (int) Math.sqrt((f5 * f5) + (f4 * f4));
    }
}
