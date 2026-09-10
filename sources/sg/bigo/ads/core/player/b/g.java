package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f48837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48839c;

    public g(Context context, int i2, int i3, int i4) {
        super(context);
        this.f48837a = i2;
        this.f48838b = i3;
        this.f48839c = i4;
        setLayoutParams((i4 == 1 || i4 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[PHI: r11 r12
  0x0082: PHI (r11v12 int) = (r11v11 int), (r11v14 int) binds: [B:37:0x0092, B:34:0x0080] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r12v7 int) = (r12v6 int), (r12v8 int) binds: [B:37:0x0092, B:34:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r12 != 4) goto L40;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r12 = r10.f48837a
            if (r12 <= 0) goto La4
            int r12 = r10.f48838b
            if (r12 > 0) goto Ld
            goto La4
        Ld:
            int r12 = android.view.View.MeasureSpec.getMode(r11)
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r0) goto L20
            if (r12 == 0) goto L20
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L20
            return
        L20:
            int r12 = r10.f48839c
            r0 = 4
            r1 = 2
            r2 = 1
            if (r12 == r2) goto L3d
            if (r12 == r1) goto L3d
            if (r12 != r0) goto L2c
            goto L3d
        L2c:
            int r12 = r10.f48838b
            float r12 = (float) r12
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r0
            float r0 = (float) r11
            float r12 = r12 * r0
            int r0 = r10.f48837a
            float r0 = (float) r0
            float r12 = r12 / r0
            int r12 = (int) r12
            r10.setMeasuredDimension(r11, r12)
            return
        L3d:
            int r11 = r10.getMeasuredWidth()
            double r3 = (double) r11
            int r11 = r10.getMeasuredHeight()
            double r5 = (double) r11
            android.content.Context r11 = r10.getContext()
            sg.bigo.ads.common.utils.e.c(r11)
            r7 = 0
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 > 0) goto L5f
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L5f
            int r11 = r10.f48837a
            double r3 = (double) r11
            int r11 = r10.f48838b
            double r5 = (double) r11
            goto L9e
        L5f:
            if (r11 <= 0) goto L95
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto L6f
            int r11 = r10.f48838b
            double r11 = (double) r11
            double r11 = r11 * r3
            int r0 = r10.f48837a
            double r0 = (double) r0
            double r5 = r11 / r0
            goto L9e
        L6f:
            if (r12 == r2) goto L88
            if (r12 == r1) goto L76
            if (r12 == r0) goto L88
            goto L9e
        L76:
            int r11 = r10.f48837a
            double r0 = (double) r11
            double r0 = r0 * r5
            int r12 = r10.f48838b
            double r7 = (double) r12
            double r7 = r7 * r3
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L95
        L82:
            double r0 = (double) r12
            double r0 = r0 * r3
            double r11 = (double) r11
            double r5 = r0 / r11
            goto L9e
        L88:
            int r11 = r10.f48837a
            double r0 = (double) r11
            double r0 = r0 * r5
            int r12 = r10.f48838b
            double r7 = (double) r12
            double r7 = r7 * r3
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L95
            goto L82
        L95:
            int r11 = r10.f48837a
            double r11 = (double) r11
            double r11 = r11 * r5
            int r0 = r10.f48838b
            double r0 = (double) r0
            double r3 = r11 / r0
        L9e:
            int r11 = (int) r3
            int r12 = (int) r5
            r10.setMeasuredDimension(r11, r12)
            return
        La4:
            java.lang.String r11 = "video width or height is invalidate"
            r12 = 0
            java.lang.String r0 = "VideoTextureView"
            sg.bigo.ads.common.t.a.a(r12, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.player.b.g.onMeasure(int, int):void");
    }
}
