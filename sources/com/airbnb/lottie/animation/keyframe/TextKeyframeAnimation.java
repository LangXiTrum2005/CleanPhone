package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes.dex */
public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        Object obj;
        LottieValueCallback lottieValueCallback = this.f9646e;
        Object obj2 = keyframe.f9951b;
        if (lottieValueCallback == null) {
            return (f != 1.0f || (obj = keyframe.f9952c) == null) ? (DocumentData) obj2 : (DocumentData) obj;
        }
        Float f2 = keyframe.f9954h;
        float fFloatValue = f2 == null ? Float.MAX_VALUE : f2.floatValue();
        DocumentData documentData = (DocumentData) obj2;
        Object obj3 = keyframe.f9952c;
        return (DocumentData) lottieValueCallback.b(keyframe.g, fFloatValue, documentData, obj3 == null ? documentData : (DocumentData) obj3, f, d(), this.d);
    }

    public final void l(final LottieValueCallback lottieValueCallback) {
        final LottieFrameInfo lottieFrameInfo = new LottieFrameInfo();
        final DocumentData documentData = new DocumentData();
        k(new LottieValueCallback<DocumentData>() { // from class: com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final Object a(LottieFrameInfo lottieFrameInfo2) {
                float f = lottieFrameInfo2.f9959a;
                float f2 = lottieFrameInfo2.f9960b;
                String str = ((DocumentData) lottieFrameInfo2.f9961c).f9714a;
                String str2 = ((DocumentData) lottieFrameInfo2.d).f9714a;
                float f3 = lottieFrameInfo2.f9962e;
                float f4 = lottieFrameInfo2.f;
                float f5 = lottieFrameInfo2.g;
                LottieFrameInfo lottieFrameInfo3 = lottieFrameInfo;
                lottieFrameInfo3.f9959a = f;
                lottieFrameInfo3.f9960b = f2;
                lottieFrameInfo3.f9961c = str;
                lottieFrameInfo3.d = str2;
                lottieFrameInfo3.f9962e = f3;
                lottieFrameInfo3.f = f4;
                lottieFrameInfo3.g = f5;
                String str3 = (String) lottieValueCallback.f9964b;
                DocumentData documentData2 = (DocumentData) (lottieFrameInfo2.f == 1.0f ? lottieFrameInfo2.d : lottieFrameInfo2.f9961c);
                String str4 = documentData2.f9715b;
                float f6 = documentData2.f9716c;
                DocumentData.Justification justification = documentData2.d;
                int i2 = documentData2.f9717e;
                float f7 = documentData2.f;
                float f8 = documentData2.g;
                int i3 = documentData2.f9718h;
                int i4 = documentData2.f9719i;
                float f9 = documentData2.j;
                boolean z2 = documentData2.k;
                DocumentData documentData3 = documentData;
                documentData3.f9714a = str3;
                documentData3.f9715b = str4;
                documentData3.f9716c = f6;
                documentData3.d = justification;
                documentData3.f9717e = i2;
                documentData3.f = f7;
                documentData3.g = f8;
                documentData3.f9718h = i3;
                documentData3.f9719i = i4;
                documentData3.j = f9;
                documentData3.k = z2;
                return documentData3;
            }
        });
    }
}
