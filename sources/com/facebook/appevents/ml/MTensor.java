package com.facebook.appevents.ml;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import pk.b;
import pk.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/ml/MTensor;", "", "", "shape", "<init>", "([I)V", "", "i", "getShape", "(I)I", "Lwj/r;", "reshape", "[I", "capacity", "I", "", "<set-?>", "data", "[F", "getData", "()[F", "getShapeSize", "()I", "shapeSize", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MTensor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int capacity;
    private float[] data;
    private int[] shape;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/ml/MTensor$Companion;", "", "()V", "getCapacity", "", "shape", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getCapacity(int[] shape) {
            if (shape.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i10 = shape[0];
            b it = new c(1, shape.length - 1, 1).iterator();
            while (it.f48398c) {
                i10 *= shape[it.nextInt()];
            }
            return i10;
        }

        private Companion() {
        }
    }

    public MTensor(int[] shape) {
        n.f(shape, "shape");
        this.shape = shape;
        int capacity = INSTANCE.getCapacity(shape);
        this.capacity = capacity;
        this.data = new float[capacity];
    }

    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i10) {
        return this.shape[i10];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(int[] shape) {
        n.f(shape, "shape");
        this.shape = shape;
        int capacity = INSTANCE.getCapacity(shape);
        float[] fArr = new float[capacity];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, capacity));
        this.data = fArr;
        this.capacity = capacity;
    }
}
