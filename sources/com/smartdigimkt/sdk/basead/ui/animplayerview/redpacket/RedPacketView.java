package com.smartdigimkt.sdk.basead.ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.p5.a;
import com.smartdigimkt.v0.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class RedPacketView extends View {
    public static final String TAG = "RedPacketView";
    private static final int t0 = 400;
    protected double e0;
    protected double f0;
    private final Matrix g0;
    protected final List<a> h0;
    private final Map<Integer, Float> i0;
    private List<Integer> j0;
    private Paint k0;
    private int l0;
    private int m0;
    private int n0;
    private int o0;
    private int p0;
    private Bitmap q0;
    private boolean r0;
    Random s0;

    public RedPacketView(Context context) {
        this(context, null);
    }

    private void a() {
        Paint paint = new Paint();
        this.k0 = paint;
        paint.setFilterBitmap(true);
        this.k0.setDither(true);
        this.k0.setAntiAlias(true);
        setLayerType(2, null);
        this.s0 = new Random(System.currentTimeMillis());
    }

    private a b(Bitmap bitmap) {
        return new a(getContext(), bitmap, 400.0f, this.e0, this.f0, this.o0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x000f, B:10:0x0029, B:12:0x002d, B:14:0x0033, B:16:0x003a, B:18:0x003e, B:21:0x0043, B:22:0x0049, B:24:0x004d, B:25:0x005e, B:27:0x0062, B:29:0x0068, B:30:0x006e, B:32:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x0092, B:39:0x0095), top: B:45:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x000f, B:10:0x0029, B:12:0x002d, B:14:0x0033, B:16:0x003a, B:18:0x003e, B:21:0x0043, B:22:0x0049, B:24:0x004d, B:25:0x005e, B:27:0x0062, B:29:0x0068, B:30:0x006e, B:32:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x0092, B:39:0x0095), top: B:45:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[Catch: Exception -> 0x0026, LOOP:0: B:22:0x0049->B:24:0x004d, LOOP_END, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x000f, B:10:0x0029, B:12:0x002d, B:14:0x0033, B:16:0x003a, B:18:0x003e, B:21:0x0043, B:22:0x0049, B:24:0x004d, B:25:0x005e, B:27:0x0062, B:29:0x0068, B:30:0x006e, B:32:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x0092, B:39:0x0095), top: B:45:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:7:0x000f, B:10:0x0029, B:12:0x002d, B:14:0x0033, B:16:0x003a, B:18:0x003e, B:21:0x0043, B:22:0x0049, B:24:0x004d, B:25:0x005e, B:27:0x0062, B:29:0x0068, B:30:0x006e, B:32:0x0074, B:34:0x0080, B:36:0x0088, B:38:0x0092, B:39:0x0095), top: B:45:0x000f }] */
    public void initRedPacketList(Bitmap bitmap) {
        Bitmap bitmap2;
        int i2;
        List<Integer> list;
        Iterator<Integer> it;
        int iIntValue;
        this.q0 = bitmap;
        if (this.r0) {
            return;
        }
        this.r0 = true;
        if (bitmap == null) {
            try {
                this.q0 = BitmapFactory.decodeResource(getResources(), h.a(getContext(), "myoffer_icon_red_packet", k.d));
                bitmap2 = this.q0;
                if (bitmap2 == null) {
                    Log.e(TAG, "redPacketBitmap is null, decodeResource failed.");
                    return;
                }
                a(bitmap2);
                if (this.l0 <= 0 && this.n0 > 0 && this.m0 > 0) {
                    this.h0.clear();
                    for (i2 = 0; i2 < this.l0; i2++) {
                        a aVarB = b(this.q0);
                        a(aVarB, i2);
                        this.h0.add(aVarB);
                    }
                    list = this.j0;
                    if (list != null && list.size() > 0) {
                        it = this.j0.iterator();
                        while (it.hasNext()) {
                            iIntValue = it.next().intValue();
                            if (iIntValue < 0 && iIntValue < this.h0.size()) {
                                a aVar = this.h0.get(iIntValue);
                                if (aVar != null) {
                                    aVar.f();
                                }
                                this.h0.remove(iIntValue);
                            }
                        }
                    }
                }
                return;
            } catch (Exception e2) {
                Log.e(TAG, "initRedPacketList failed: " + e2.getMessage());
            }
        } else {
            bitmap2 = this.q0;
            if (bitmap2 == null) {
                Log.e(TAG, "redPacketBitmap is null, decodeResource failed.");
                return;
            }
            a(bitmap2);
            if (this.l0 <= 0) {
                return;
            }
            this.h0.clear();
            while (i2 < this.l0) {
                a aVarB2 = b(this.q0);
                a(aVarB2, i2);
                this.h0.add(aVarB2);
            }
            list = this.j0;
            if (list != null) {
                it = this.j0.iterator();
                while (it.hasNext()) {
                    iIntValue = it.next().intValue();
                    if (iIntValue < 0) {
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.o0 = getMeasuredWidth();
        this.p0 = getMeasuredHeight();
    }

    public void release() {
        this.r0 = false;
        try {
            Bitmap bitmap = this.q0;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.q0.recycle();
            }
            Iterator<a> it = this.h0.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
            this.h0.clear();
            Map<Integer, Float> map = this.i0;
            if (map != null) {
                map.clear();
            }
            List<Integer> list = this.j0;
            if (list != null) {
                list.clear();
            }
        } catch (Exception e2) {
            Log.e(TAG, "release failed: " + e2.getMessage());
        }
    }

    public RedPacketView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int b(int i2) {
        int i3 = i2 % 4;
        if (i3 == 0) {
            return (i2 / 4) * 9;
        }
        if (i3 == 1) {
            return androidx.datastore.preferences.protobuf.a.a(i2, 4, 9, 2);
        }
        if (i3 == 2) {
            return androidx.datastore.preferences.protobuf.a.a(i2, 4, 9, 4);
        }
        return i3 == 3 ? androidx.datastore.preferences.protobuf.a.a(i2, 4, 9, 8) : i3;
    }

    public RedPacketView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = 0.15d;
        this.f0 = 0.2d;
        this.g0 = new Matrix();
        this.h0 = new ArrayList();
        this.i0 = new HashMap();
        a();
    }

    private void a(Canvas canvas) {
        a next;
        Bitmap bitmapA;
        Iterator<a> it = this.h0.iterator();
        while (it.hasNext() && (bitmapA = (next = it.next()).a()) != null) {
            this.g0.setTranslate((-next.e()) >> 1, (-next.b()) >> 1);
            this.g0.postRotate(next.c());
            this.g0.postTranslate((next.e() >> 1) + next.f, (next.b() >> 1) + next.g);
            canvas.drawBitmap(bitmapA, this.g0, this.k0);
        }
    }

    private void a(Bitmap bitmap) {
        int height = (int) (((double) this.p0) / (((((double) this.o0) * this.f0) * ((double) bitmap.getHeight())) / ((double) bitmap.getWidth())));
        this.n0 = height;
        this.m0 = 3;
        this.l0 = (height * 12) / 9;
    }

    private void a(a aVar, int i2) {
        Float f;
        if (aVar.e() <= 0 || aVar.b() <= 0) {
            return;
        }
        int iB = b(i2);
        int i3 = this.m0;
        int i4 = iB / i3;
        int i5 = iB % i3;
        int i6 = this.o0 / i3;
        int i7 = this.p0 / this.n0;
        int iE = aVar.e();
        int iB2 = aVar.b();
        aVar.f = (i5 * i6) + ((i6 - iE) >> 1);
        int iNextInt = this.s0.nextInt(21) - 10;
        int i8 = iB2 / 3;
        int iNextInt2 = this.s0.nextInt(i8) + i8;
        if (i4 > 0 && (f = this.i0.get(Integer.valueOf(iB - this.m0))) != null) {
            float fFloatValue = f.floatValue() + iNextInt2 + iNextInt;
            aVar.g = fFloatValue;
            if ((this.p0 - fFloatValue) - a(5) < iB2) {
                if (this.j0 == null) {
                    this.j0 = new ArrayList();
                }
                this.j0.add(Integer.valueOf(i2));
            }
        }
        if (aVar.g == 0.0f) {
            aVar.g = (i4 * i7) + iNextInt2 + iNextInt;
        }
        float f2 = iB2;
        float f3 = aVar.g + f2;
        int i9 = this.p0;
        if (f3 > i9) {
            aVar.g = (i9 - iB2) - a(5);
        }
        if (aVar.g < 0.0f) {
            aVar.g = iB2 >> 1;
        }
        this.i0.put(Integer.valueOf(iB), Float.valueOf(aVar.g + f2));
    }

    private int a(int i2) {
        return h.a(getContext(), i2);
    }
}
