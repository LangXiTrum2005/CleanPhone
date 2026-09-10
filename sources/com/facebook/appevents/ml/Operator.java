package com.facebook.appevents.ml;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\fJ\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000fH\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/appevents/ml/Operator;", "", "<init>", "()V", "Lcom/facebook/appevents/ml/MTensor;", "x", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lwj/r;", "addmv", "(Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;)V", "w", "mul", "(Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "relu", "(Lcom/facebook/appevents/ml/MTensor;)V", "", "startDim", "flatten", "(Lcom/facebook/appevents/ml/MTensor;I)V", "", "tensors", "concatenate", "([Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "softmax", "dense", "(Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "", "texts", "seqLength", "embedding", "([Ljava/lang/String;ILcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "transpose2D", "(Lcom/facebook/appevents/ml/MTensor;)Lcom/facebook/appevents/ml/MTensor;", "transpose3D", "conv1D", "poolSize", "maxPool1D", "(Lcom/facebook/appevents/ml/MTensor;I)Lcom/facebook/appevents/ml/MTensor;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Operator {
    public static final Operator INSTANCE = new Operator();

    private Operator() {
    }

    public static final void addmv(MTensor x10, MTensor b10) {
        if (a.b(Operator.class)) {
            return;
        }
        try {
            n.f(x10, "x");
            n.f(b10, "b");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            float[] data = x10.getData();
            float[] data2 = b10.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    for (int i12 = 0; i12 < shape3; i12++) {
                        int i13 = (i11 * shape3) + (i10 * shape2 * shape3) + i12;
                        data[i13] = data[i13] + data2[i12];
                    }
                }
            }
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
        }
    }

    public static final MTensor concatenate(MTensor[] tensors) {
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(tensors, "tensors");
            int shape = tensors[0].getShape(0);
            int shape2 = 0;
            for (MTensor mTensor : tensors) {
                shape2 += mTensor.getShape(1);
            }
            MTensor mTensor2 = new MTensor(new int[]{shape, shape2});
            float[] data = mTensor2.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                int i11 = i10 * shape2;
                int length = tensors.length;
                for (int i12 = 0; i12 < length; i12++) {
                    float[] data2 = tensors[i12].getData();
                    int shape3 = tensors[i12].getShape(1);
                    System.arraycopy(data2, i10 * shape3, data, i11, shape3);
                    i11 += shape3;
                }
            }
            return mTensor2;
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
            return null;
        }
    }

    public static final MTensor conv1D(MTensor x10, MTensor w3) {
        MTensor mTensor;
        MTensor mTensor2 = null;
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(x10, "x");
            n.f(w3, "w");
            int i10 = 0;
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            int shape4 = w3.getShape(0);
            int i11 = (shape2 - shape4) + 1;
            int shape5 = w3.getShape(2);
            MTensor mTensor3 = new MTensor(new int[]{shape, i11, shape5});
            float[] data = x10.getData();
            float[] data2 = mTensor3.getData();
            float[] data3 = w3.getData();
            int i12 = 0;
            while (i12 < shape) {
                int i13 = i10;
                while (i13 < shape5) {
                    int i14 = i10;
                    while (i14 < i11) {
                        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (i10 < shape4) {
                            mTensor = mTensor2;
                            for (int i15 = 0; i15 < shape3; i15++) {
                                try {
                                    f10 = (data[((i10 + i14) * shape3) + (shape2 * shape3 * i12) + i15] * data3[(((i10 * shape3) + i15) * shape5) + i13]) + f10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    a.a(Operator.class, th);
                                    return mTensor;
                                }
                            }
                            i10++;
                            mTensor2 = mTensor;
                        }
                        MTensor mTensor4 = mTensor2;
                        data2[(i14 * shape5) + (i11 * shape5 * i12) + i13] = f10;
                        i14++;
                        mTensor2 = mTensor4;
                        i10 = 0;
                    }
                    i13++;
                    i10 = 0;
                }
                i12++;
                i10 = 0;
            }
            return mTensor3;
        } catch (Throwable th3) {
            th = th3;
            mTensor = null;
        }
    }

    public static final MTensor dense(MTensor x10, MTensor w3, MTensor b10) {
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(x10, "x");
            n.f(w3, "w");
            n.f(b10, "b");
            int shape = x10.getShape(0);
            int shape2 = b10.getShape(0);
            MTensor mTensorMul = mul(x10, w3);
            float[] data = b10.getData();
            float[] data2 = mTensorMul.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    int i12 = (i10 * shape2) + i11;
                    data2[i12] = data2[i12] + data[i11];
                }
            }
            return mTensorMul;
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
            return null;
        }
    }

    public static final MTensor embedding(String[] texts, int seqLength, MTensor w3) {
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(texts, "texts");
            n.f(w3, "w");
            int length = texts.length;
            int shape = w3.getShape(1);
            MTensor mTensor = new MTensor(new int[]{length, seqLength, shape});
            float[] data = mTensor.getData();
            float[] data2 = w3.getData();
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArrVectorize = Utils.INSTANCE.vectorize(texts[i10], seqLength);
                for (int i11 = 0; i11 < seqLength; i11++) {
                    System.arraycopy(data2, iArrVectorize[i11] * shape, data, (shape * i11) + (shape * seqLength * i10), shape);
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
            return null;
        }
    }

    public static final void flatten(MTensor x10, int startDim) {
        if (a.b(Operator.class)) {
            return;
        }
        try {
            n.f(x10, "x");
            if (startDim >= x10.getShapeSize()) {
                return;
            }
            int shapeSize = x10.getShapeSize();
            int shape = 1;
            for (int i10 = startDim; i10 < shapeSize; i10++) {
                shape *= x10.getShape(i10);
            }
            int[] iArr = new int[startDim + 1];
            for (int i11 = 0; i11 < startDim; i11++) {
                iArr[i11] = x10.getShape(i11);
            }
            iArr[startDim] = shape;
            x10.reshape(iArr);
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
        }
    }

    public static final MTensor maxPool1D(MTensor x10, int poolSize) {
        MTensor mTensor;
        MTensor mTensor2 = null;
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(x10, "x");
            int i10 = 0;
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            int i11 = (shape2 - poolSize) + 1;
            MTensor mTensor3 = new MTensor(new int[]{shape, i11, shape3});
            float[] data = x10.getData();
            float[] data2 = mTensor3.getData();
            int i12 = 0;
            while (i12 < shape) {
                int i13 = i10;
                while (i13 < shape3) {
                    int i14 = i10;
                    while (i14 < i11) {
                        int i15 = i14 * shape3;
                        int i16 = (i12 * i11 * shape3) + i15 + i13;
                        int i17 = (i12 * shape2 * shape3) + i15 + i13;
                        data2[i16] = Float.MIN_VALUE;
                        int i18 = i10;
                        while (i18 < poolSize) {
                            mTensor = mTensor2;
                            try {
                                data2[i16] = Math.max(data2[i16], data[(i18 * shape3) + i17]);
                                i18++;
                                mTensor2 = mTensor;
                            } catch (Throwable th2) {
                                th = th2;
                                a.a(Operator.class, th);
                                return mTensor;
                            }
                        }
                        i14++;
                        i10 = 0;
                    }
                    i13++;
                    i10 = 0;
                }
                i12++;
                i10 = 0;
            }
            return mTensor3;
        } catch (Throwable th3) {
            th = th3;
            mTensor = mTensor2;
        }
    }

    public static final MTensor mul(MTensor x10, MTensor w3) {
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(x10, "x");
            n.f(w3, "w");
            int shape = x10.getShape(0);
            int shape2 = w3.getShape(0);
            int shape3 = w3.getShape(1);
            MTensor mTensor = new MTensor(new int[]{shape, shape3});
            float[] data = x10.getData();
            float[] data2 = w3.getData();
            float[] data3 = mTensor.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape3; i11++) {
                    int i12 = (i10 * shape3) + i11;
                    data3[i12] = 0.0f;
                    for (int i13 = 0; i13 < shape2; i13++) {
                        data3[i12] = (data[(i10 * shape2) + i13] * data2[(i13 * shape3) + i11]) + data3[i12];
                    }
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
            return null;
        }
    }

    public static final void relu(MTensor x10) {
        if (a.b(Operator.class)) {
            return;
        }
        try {
            n.f(x10, "x");
            float[] data = x10.getData();
            int length = data.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (data[i10] < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    data[i10] = 0.0f;
                }
            }
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
        }
    }

    public static final void softmax(MTensor x10) {
        if (a.b(Operator.class)) {
            return;
        }
        try {
            n.f(x10, "x");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            float[] data = x10.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                int i11 = i10 * shape2;
                int i12 = i11 + shape2;
                float f10 = Float.MIN_VALUE;
                for (int i13 = i11; i13 < i12; i13++) {
                    float f11 = data[i13];
                    if (f11 > f10) {
                        f10 = f11;
                    }
                }
                float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                for (int i14 = i11; i14 < i12; i14++) {
                    float fExp = (float) Math.exp(data[i14] - f10);
                    data[i14] = fExp;
                    f12 += fExp;
                }
                while (i11 < i12) {
                    data[i11] = data[i11] / f12;
                    i11++;
                }
            }
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
        }
    }

    public static final MTensor transpose2D(MTensor x10) {
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(x10, "x");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            MTensor mTensor = new MTensor(new int[]{shape2, shape});
            float[] data = x10.getData();
            float[] data2 = mTensor.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    data2[(i11 * shape) + i10] = data[(i10 * shape2) + i11];
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
            return null;
        }
    }

    public static final MTensor transpose3D(MTensor x10) {
        if (a.b(Operator.class)) {
            return null;
        }
        try {
            n.f(x10, "x");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            MTensor mTensor = new MTensor(new int[]{shape3, shape2, shape});
            float[] data = x10.getData();
            float[] data2 = mTensor.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    for (int i12 = 0; i12 < shape3; i12++) {
                        data2[(i11 * shape) + (i12 * shape * shape2) + i10] = data[(i11 * shape3) + (i10 * shape2 * shape3) + i12];
                    }
                }
            }
            return mTensor;
        } catch (Throwable th2) {
            a.a(Operator.class, th2);
            return null;
        }
    }
}
