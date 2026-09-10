package o4;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;
import m0.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47100a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Class cls, String str) {
        super(cls, str);
        this.f47100a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f47100a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            case 6:
                WeakHashMap weakHashMap = s0.f45746a;
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f3969z);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f47100a) {
            case 0:
                f fVar = (f) obj;
                PointF pointF = (PointF) obj2;
                fVar.getClass();
                fVar.f47110a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                fVar.f47111b = iRound;
                int i10 = fVar.f47115f + 1;
                fVar.f47115f = i10;
                if (i10 == fVar.f47116g) {
                    View view = fVar.f47114e;
                    int i11 = fVar.f47110a;
                    int i12 = fVar.f47112c;
                    int i13 = fVar.f47113d;
                    c cVar = y.f47176a;
                    view.setLeftTopRightBottom(i11, iRound, i12, i13);
                    fVar.f47115f = 0;
                    fVar.f47116g = 0;
                }
                break;
            case 1:
                f fVar2 = (f) obj;
                PointF pointF2 = (PointF) obj2;
                fVar2.getClass();
                fVar2.f47112c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                fVar2.f47113d = iRound2;
                int i14 = fVar2.f47116g + 1;
                fVar2.f47116g = i14;
                if (fVar2.f47115f == i14) {
                    View view2 = fVar2.f47114e;
                    int i15 = fVar2.f47110a;
                    int i16 = fVar2.f47111b;
                    int i17 = fVar2.f47112c;
                    c cVar2 = y.f47176a;
                    view2.setLeftTopRightBottom(i15, i16, i17, iRound2);
                    fVar2.f47115f = 0;
                    fVar2.f47116g = 0;
                }
                break;
            case 2:
                View view3 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view3.getLeft();
                int top = view3.getTop();
                int iRound3 = Math.round(pointF3.x);
                int iRound4 = Math.round(pointF3.y);
                c cVar3 = y.f47176a;
                view3.setLeftTopRightBottom(left, top, iRound3, iRound4);
                break;
            case 3:
                View view4 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int iRound5 = Math.round(pointF4.x);
                int iRound6 = Math.round(pointF4.y);
                int right = view4.getRight();
                int bottom = view4.getBottom();
                c cVar4 = y.f47176a;
                view4.setLeftTopRightBottom(iRound5, iRound6, right, bottom);
                break;
            case 4:
                View view5 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound7 = Math.round(pointF5.x);
                int iRound8 = Math.round(pointF5.y);
                int width = view5.getWidth() + iRound7;
                int height = view5.getHeight() + iRound8;
                c cVar5 = y.f47176a;
                view5.setLeftTopRightBottom(iRound7, iRound8, width, height);
                break;
            case 5:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                break;
            case 6:
                WeakHashMap weakHashMap = s0.f45746a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
