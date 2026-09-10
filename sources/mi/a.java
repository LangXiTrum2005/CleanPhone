package mi;

import android.content.Context;
import android.graphics.Matrix;
import android.util.LongSparseArray;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.PriorityQueue;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Matrix f45970e = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f45971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f45972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f45974d = new HashMap();

    public a(io.flutter.embedding.engine.renderer.h hVar, boolean z10) {
        this.f45971a = hVar;
        if (s1.f45749d == null) {
            s1.f45749d = new s1(5);
        }
        this.f45972b = s1.f45749d;
        this.f45973c = z10;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                return 4;
            }
            if (i10 != 6) {
                if (i10 == 2) {
                    return 5;
                }
                if (i10 != 7) {
                    if (i10 == 3) {
                        return 0;
                    }
                    if (i10 != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    public final void a(MotionEvent motionEvent, int i10, int i11, int i12, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i13;
        int i14;
        long buttonState;
        int i15;
        long jIncrementAndGet;
        int i16;
        double max;
        double min;
        double d10;
        double d11;
        double scaledHorizontalScrollFactor;
        double scaledVerticalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i11 == -1) {
            return;
        }
        int i17 = 3;
        int pointerId = (motionEvent.getPointerId(i10) << 3) | (motionEvent.getToolType(i10) & 7);
        int toolType = motionEvent.getToolType(i10);
        if (toolType == 1) {
            i17 = 0;
        } else if (toolType == 2) {
            i17 = 2;
        } else if (toolType == 3) {
            i17 = 1;
        } else if (toolType != 4) {
            i17 = 5;
        }
        float[] fArr = {motionEvent.getX(i10), motionEvent.getY(i10)};
        matrix.mapPoints(fArr);
        HashMap map = this.f45974d;
        if (i17 == 1) {
            i13 = 0;
            i14 = 1;
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194 && i11 == 4) {
                map.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            i13 = 0;
            i14 = 1;
            buttonState = i17 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = map.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            if (i11 == 4) {
                i15 = 7;
            } else if (i11 == 5) {
                i15 = 8;
            } else {
                i15 = (i11 == 6 || i11 == 0) ? 9 : -1;
            }
            if (i15 == -1) {
                return;
            }
        } else {
            i15 = -1;
        }
        if (this.f45973c) {
            s1 s1Var = this.f45972b;
            s1Var.getClass();
            jIncrementAndGet = e0.f45994b.incrementAndGet();
            ((LongSparseArray) s1Var.f45751b).put(jIncrementAndGet, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) s1Var.f45752c).add(Long.valueOf(jIncrementAndGet));
        } else {
            jIncrementAndGet = 0;
        }
        int i18 = motionEvent.getActionMasked() == 8 ? i14 : i13;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(jIncrementAndGet);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            byteBuffer.putLong(i15);
            byteBuffer.putLong(4L);
            i16 = i17;
        } else {
            byteBuffer.putLong(i11);
            i16 = i17;
            byteBuffer.putLong(i16);
        }
        byteBuffer.putLong(i18);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[i13]);
            byteBuffer.putDouble(fArr2[i14]);
        } else {
            byteBuffer.putDouble(fArr[i13]);
            byteBuffer.putDouble(fArr[i14]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i10));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            max = 1.0d;
            min = 0.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (i16 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i10));
            d10 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d10 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i10));
        byteBuffer.putDouble(motionEvent.getToolMajor(i10));
        byteBuffer.putDouble(motionEvent.getToolMinor(i10));
        byteBuffer.putDouble(d10);
        byteBuffer.putDouble(d10);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i10));
        if (i16 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i10));
        } else {
            byteBuffer.putDouble(d10);
        }
        byteBuffer.putLong(i12);
        if (i18 == i14) {
            if (context != null) {
                scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                scaledVerticalScrollFactor = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
            } else {
                scaledHorizontalScrollFactor = 48.0d;
                scaledVerticalScrollFactor = 48.0d;
            }
            double d12 = scaledHorizontalScrollFactor * ((double) (-motionEvent.getAxisValue(10, i10)));
            double d13 = scaledVerticalScrollFactor * ((double) (-motionEvent.getAxisValue(9, i10)));
            byteBuffer.putDouble(d12);
            byteBuffer.putDouble(d13);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[i13] - fArr3[i13]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d11 = 0.0d;
        } else {
            d11 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d11);
        byteBuffer.putLong(0L);
        if (zContainsKey && i15 == 9) {
            map.remove(Integer.valueOf(pointerId));
        }
    }

    public final void c(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int iB = b(motionEvent.getActionMasked());
        char c4 = 5;
        boolean z10 = actionMasked == 0 || actionMasked == 5;
        boolean z11 = !z10 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c4 = 0;
        } else if (toolType == 2) {
            c4 = 2;
        } else if (toolType == 3) {
            c4 = 1;
        } else if (toolType == 4) {
            c4 = 3;
        }
        int i10 = (z11 && c4 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i10) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z10) {
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
        } else if (z11) {
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (i11 != motionEvent.getActionIndex() && motionEvent.getToolType(i11) == 1) {
                    a(motionEvent, i11, 5, 1, matrix, byteBufferAllocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
            if (i10 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect, null);
            }
        } else {
            for (int i12 = 0; i12 < pointerCount; i12++) {
                a(motionEvent, i12, iB, (pointerCount << 8) | 2, matrix, byteBufferAllocateDirect, null);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f45971a.f43247a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
    }
}
