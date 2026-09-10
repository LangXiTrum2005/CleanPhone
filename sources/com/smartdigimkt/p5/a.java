package com.smartdigimkt.p5;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f37640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37642c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f37643e;
    public float f;
    public float g;

    public a(Context context, Bitmap bitmap, float f, double d, double d2, int i2) {
        i2 = i2 == 0 ? Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : i2;
        double dNextInt = ((d * 100.0d) + ((double) new Random().nextInt(6))) / 100.0d;
        if (dNextInt >= d && dNextInt <= d2) {
            d2 = dNextInt;
        }
        Log.d("RedPacketBean", "widthScale: " + d2);
        int i3 = (int) (((double) i2) * d2);
        this.f37641b = i3;
        int height = (bitmap.getHeight() * i3) / bitmap.getWidth();
        this.f37642c = height;
        try {
            this.f37640a = Bitmap.createScaledBitmap(bitmap, this.f37641b, height, true);
        } catch (Exception e2) {
            Log.e("RedPacketBean", "createScaledBitmap failed: " + e2.getMessage());
        }
        this.d = f;
        this.f37643e = (new Random().nextFloat() * 30.0f) - 15.0f;
    }

    public Bitmap a() {
        return this.f37640a;
    }

    public int b() {
        return this.f37642c;
    }

    public float c() {
        return this.f37643e;
    }

    public float d() {
        return this.d;
    }

    public int e() {
        return this.f37641b;
    }

    public void f() {
        Bitmap bitmap = this.f37640a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f37640a.recycle();
        this.f37640a = null;
    }
}
