package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ShapeData f9666i;
    public final Path j;
    public ArrayList k;

    public ShapeKeyframeAnimation(List list) {
        super(list);
        this.f9666i = new ShapeData();
        this.j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        ShapeData shapeData = (ShapeData) keyframe.f9951b;
        ShapeData shapeData2 = (ShapeData) keyframe.f9952c;
        ShapeData shapeDataC = this.f9666i;
        if (shapeDataC.f9794b == null) {
            shapeDataC.f9794b = new PointF();
        }
        int i2 = 0;
        shapeDataC.f9795c = shapeData.f9795c || shapeData2.f9795c;
        ArrayList arrayList = shapeData.f9793a;
        int size = arrayList.size();
        int size2 = shapeData2.f9793a.size();
        ArrayList arrayList2 = shapeData2.f9793a;
        if (size != size2) {
            Logger.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = shapeDataC.f9793a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new CubicCurveData());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = shapeData.f9794b;
        PointF pointF2 = shapeData2.f9794b;
        shapeDataC.a(MiscUtils.d(pointF.x, pointF2.x, f), MiscUtils.d(pointF.y, pointF2.y, f));
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            CubicCurveData cubicCurveData = (CubicCurveData) arrayList.get(size5);
            CubicCurveData cubicCurveData2 = (CubicCurveData) arrayList2.get(size5);
            PointF pointF3 = cubicCurveData.f9711a;
            PointF pointF4 = cubicCurveData2.f9711a;
            ((CubicCurveData) arrayList3.get(size5)).f9711a.set(MiscUtils.d(pointF3.x, pointF4.x, f), MiscUtils.d(pointF3.y, pointF4.y, f));
            CubicCurveData cubicCurveData3 = (CubicCurveData) arrayList3.get(size5);
            PointF pointF5 = cubicCurveData.f9712b;
            float f2 = pointF5.x;
            PointF pointF6 = cubicCurveData2.f9712b;
            cubicCurveData3.f9712b.set(MiscUtils.d(f2, pointF6.x, f), MiscUtils.d(pointF5.y, pointF6.y, f));
            CubicCurveData cubicCurveData4 = (CubicCurveData) arrayList3.get(size5);
            PointF pointF7 = cubicCurveData.f9713c;
            float f3 = pointF7.x;
            PointF pointF8 = cubicCurveData2.f9713c;
            cubicCurveData4.f9713c.set(MiscUtils.d(f3, pointF8.x, f), MiscUtils.d(pointF7.y, pointF8.y, f));
        }
        ArrayList arrayList4 = this.k;
        if (arrayList4 != null) {
            for (int size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                shapeDataC = ((ShapeModifierContent) this.k.get(size6)).c(shapeDataC);
            }
        }
        Path path = this.j;
        path.reset();
        PointF pointF9 = shapeDataC.f9794b;
        path.moveTo(pointF9.x, pointF9.y);
        PointF pointF10 = MiscUtils.f9945a;
        pointF10.set(pointF9.x, pointF9.y);
        while (true) {
            ArrayList arrayList5 = shapeDataC.f9793a;
            if (i2 >= arrayList5.size()) {
                break;
            }
            CubicCurveData cubicCurveData5 = (CubicCurveData) arrayList5.get(i2);
            PointF pointF11 = cubicCurveData5.f9711a;
            boolean zEquals = pointF11.equals(pointF10);
            PointF pointF12 = cubicCurveData5.f9712b;
            PointF pointF13 = cubicCurveData5.f9713c;
            if (zEquals && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF10.set(pointF13.x, pointF13.y);
            i2++;
        }
        if (shapeDataC.f9795c) {
            path.close();
        }
        return path;
    }
}
