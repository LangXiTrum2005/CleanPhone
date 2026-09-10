package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import sensatory.wireman;

/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final int f8378cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public boolean f8379creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final int f8380cuirassed;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public float f8381grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public boolean[][] f8382hydrovane;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public int f8383kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public String f8384merc;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f8385oilcan;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public int[] f8386peridotite;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public String f8387polder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public int f8388privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public String f8389restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public int f8390saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f8391sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public float f8392seminary;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public boolean f8393starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public View[] f8394stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public String f8395supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public ConstraintLayout f8396trm;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public Set<Integer> f8397walach;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f8398yemenite;

    public Grid(Context context) {
        super(context);
        this.f8378cord = 50;
        this.f8380cuirassed = 50;
        this.f8388privatdozent = 0;
        this.f8397walach = new HashSet();
    }

    private int getNextPosition() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.f8388privatdozent;
            if (i >= this.f8385oilcan * this.f8391sealless) {
                return -1;
            }
            int iSealless = sealless(i);
            int iYemenite = yemenite(this.f8388privatdozent);
            boolean[] zArr = this.f8382hydrovane[iSealless];
            if (zArr[iYemenite]) {
                zArr[iYemenite] = false;
                z = true;
            }
            this.f8388privatdozent++;
        }
        return i;
    }

    public final void cord() {
        int iMax = Math.max(this.f8385oilcan, this.f8391sealless);
        View[] viewArr = this.f8394stratoscope;
        int i = 0;
        if (viewArr == null) {
            this.f8394stratoscope = new View[iMax];
            int i2 = 0;
            while (true) {
                View[] viewArr2 = this.f8394stratoscope;
                if (i2 >= viewArr2.length) {
                    break;
                }
                viewArr2[i2] = grimness();
                i2++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i3 = 0; i3 < iMax; i3++) {
                View[] viewArr4 = this.f8394stratoscope;
                if (i3 < viewArr4.length) {
                    viewArr3[i3] = viewArr4[i3];
                } else {
                    viewArr3[i3] = grimness();
                }
            }
            int i4 = iMax;
            while (true) {
                View[] viewArr5 = this.f8394stratoscope;
                if (i4 >= viewArr5.length) {
                    break;
                }
                this.f8396trm.removeView(viewArr5[i4]);
                i4++;
            }
            this.f8394stratoscope = viewArr3;
        }
        this.f8386peridotite = new int[iMax];
        while (true) {
            View[] viewArr6 = this.f8394stratoscope;
            if (i >= viewArr6.length) {
                hydrovane();
                starveling();
                return;
            } else {
                this.f8386peridotite[i] = viewArr6[i].getId();
                i++;
            }
        }
    }

    public final float[] creditor(int i, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != i) {
                return null;
            }
            fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
            }
        }
        return fArr;
    }

    public final void cuirassed(View view) {
        ConstraintLayout.LayoutParams layoutParamsSaran = saran(view);
        layoutParamsSaran.f8871seminary = -1.0f;
        layoutParamsSaran.f8816beachfront = -1;
        layoutParamsSaran.f8846marial = -1;
        layoutParamsSaran.f8820competently = -1;
        layoutParamsSaran.f8839impromptu = -1;
        ((ViewGroup.MarginLayoutParams) layoutParamsSaran).leftMargin = -1;
        view.setLayoutParams(layoutParamsSaran);
    }

    public String getColumnWeights() {
        return this.f8387polder;
    }

    public int getColumns() {
        return this.f8383kattegat;
    }

    public float getHorizontalGaps() {
        return this.f8392seminary;
    }

    public int getOrientation() {
        return this.f8390saran;
    }

    public String getRowWeights() {
        return this.f8384merc;
    }

    public int getRows() {
        return this.f8398yemenite;
    }

    public String getSkips() {
        return this.f8389restrictive;
    }

    public String getSpans() {
        return this.f8395supplicat;
    }

    public float getVerticalGaps() {
        return this.f8381grimness;
    }

    public final View grimness() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.f8396trm.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    public final void hydrovane() {
        int i;
        int id = getId();
        int iMax = Math.max(this.f8385oilcan, this.f8391sealless);
        float[] fArrCreditor = creditor(this.f8385oilcan, this.f8384merc);
        int i2 = 0;
        if (this.f8385oilcan == 1) {
            ConstraintLayout.LayoutParams layoutParamsSaran = saran(this.f8394stratoscope[0]);
            stratoscope(this.f8394stratoscope[0]);
            layoutParamsSaran.f8877taiyuan = id;
            layoutParamsSaran.f8831formularize = id;
            this.f8394stratoscope[0].setLayoutParams(layoutParamsSaran);
            return;
        }
        while (true) {
            i = this.f8385oilcan;
            if (i2 >= i) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsSaran2 = saran(this.f8394stratoscope[i2]);
            stratoscope(this.f8394stratoscope[i2]);
            if (fArrCreditor != null) {
                layoutParamsSaran2.f8834grimness = fArrCreditor[i2];
            }
            if (i2 > 0) {
                layoutParamsSaran2.f8825cutely = this.f8386peridotite[i2 - 1];
            } else {
                layoutParamsSaran2.f8877taiyuan = id;
            }
            if (i2 < this.f8385oilcan - 1) {
                layoutParamsSaran2.f8813apical = this.f8386peridotite[i2 + 1];
            } else {
                layoutParamsSaran2.f8831formularize = id;
            }
            if (i2 > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParamsSaran2).topMargin = (int) this.f8392seminary;
            }
            this.f8394stratoscope[i2].setLayoutParams(layoutParamsSaran2);
            i2++;
        }
        while (i < iMax) {
            ConstraintLayout.LayoutParams layoutParamsSaran3 = saran(this.f8394stratoscope[i]);
            stratoscope(this.f8394stratoscope[i]);
            layoutParamsSaran3.f8877taiyuan = id;
            layoutParamsSaran3.f8831formularize = id;
            this.f8394stratoscope[i].setLayoutParams(layoutParamsSaran3);
            i++;
        }
    }

    public final boolean kattegat(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int iSealless = sealless(iArr[i][0]);
            int iYemenite = yemenite(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!merc(iSealless, iYemenite, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void kowloon(AttributeSet attributeSet) {
        super.kowloon(attributeSet);
        this.f8784molybdenite = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wireman.Grid);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.Grid_grid_rows) {
                    this.f8398yemenite = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == wireman.Grid_grid_columns) {
                    this.f8383kattegat = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == wireman.Grid_grid_spans) {
                    this.f8395supplicat = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == wireman.Grid_grid_skips) {
                    this.f8389restrictive = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == wireman.Grid_grid_rowWeights) {
                    this.f8384merc = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == wireman.Grid_grid_columnWeights) {
                    this.f8387polder = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == wireman.Grid_grid_orientation) {
                    this.f8390saran = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == wireman.Grid_grid_horizontalGaps) {
                    this.f8392seminary = typedArrayObtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else if (index == wireman.Grid_grid_verticalGaps) {
                    this.f8381grimness = typedArrayObtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else if (index == wireman.Grid_grid_validateInputs) {
                    this.f8379creditor = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == wireman.Grid_grid_useRtl) {
                    this.f8393starveling = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            walach();
            restrictive();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean merc(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.f8382hydrovane;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean oilcan(boolean z) {
        int[][] iArrPrivatdozent;
        int[][] iArrPrivatdozent2;
        if (this.f8396trm == null || this.f8385oilcan < 1 || this.f8391sealless < 1) {
            return false;
        }
        if (z) {
            for (int i = 0; i < this.f8382hydrovane.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.f8382hydrovane;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            this.f8397walach.clear();
        }
        this.f8388privatdozent = 0;
        cord();
        String str = this.f8389restrictive;
        boolean zKattegat = (str == null || str.trim().isEmpty() || (iArrPrivatdozent2 = privatdozent(this.f8389restrictive)) == null) ? true : kattegat(iArrPrivatdozent2);
        String str2 = this.f8395supplicat;
        if (str2 != null && !str2.trim().isEmpty() && (iArrPrivatdozent = privatdozent(this.f8395supplicat)) != null) {
            zKattegat &= supplicat(this.f8783kowloon, iArrPrivatdozent);
        }
        return (zKattegat && preprohormone()) || !this.f8379creditor;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8396trm = (ConstraintLayout) getParent();
        oilcan(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(Opcodes.V_PREVIEW);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.f8394stratoscope) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, right2, bottom - top, paint);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, top2, right - left, bottom2, paint);
            }
        }
    }

    public final boolean polder(CharSequence charSequence) {
        return true;
    }

    public final boolean preprohormone() {
        View[] viewArrTriweekly = triweekly(this.f8396trm);
        for (int i = 0; i < this.f8779arytenoidectomy; i++) {
            if (!this.f8397walach.contains(Integer.valueOf(this.f8783kowloon[i]))) {
                int nextPosition = getNextPosition();
                int iSealless = sealless(nextPosition);
                int iYemenite = yemenite(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                trm(viewArrTriweekly[i], iSealless, iYemenite, 1, 1);
            }
        }
        return true;
    }

    public final int[][] privatdozent(String str) {
        if (!polder(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public final void restrictive() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f8385oilcan, this.f8391sealless);
        this.f8382hydrovane = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final ConstraintLayout.LayoutParams saran(View view) {
        return (ConstraintLayout.LayoutParams) view.getLayoutParams();
    }

    public final int sealless(int i) {
        return this.f8390saran == 1 ? i % this.f8385oilcan : i / this.f8391sealless;
    }

    public final boolean seminary(String str) {
        return true;
    }

    public void setColumnWeights(String str) {
        if (seminary(str)) {
            String str2 = this.f8387polder;
            if (str2 == null || !str2.equals(str)) {
                this.f8387polder = str;
                oilcan(true);
                invalidate();
            }
        }
    }

    public void setColumns(int i) {
        if (i <= 50 && this.f8383kattegat != i) {
            this.f8383kattegat = i;
            walach();
            restrictive();
            oilcan(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f) {
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f8392seminary != f) {
            this.f8392seminary = f;
            oilcan(true);
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.f8390saran != i) {
            this.f8390saran = i;
            oilcan(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        if (seminary(str)) {
            String str2 = this.f8384merc;
            if (str2 == null || !str2.equals(str)) {
                this.f8384merc = str;
                oilcan(true);
                invalidate();
            }
        }
    }

    public void setRows(int i) {
        if (i <= 50 && this.f8398yemenite != i) {
            this.f8398yemenite = i;
            walach();
            restrictive();
            oilcan(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        if (polder(str)) {
            String str2 = this.f8389restrictive;
            if (str2 == null || !str2.equals(str)) {
                this.f8389restrictive = str;
                oilcan(true);
                invalidate();
            }
        }
    }

    public void setSpans(CharSequence charSequence) {
        if (polder(charSequence)) {
            String str = this.f8395supplicat;
            if (str == null || !str.contentEquals(charSequence)) {
                this.f8395supplicat = charSequence.toString();
                oilcan(true);
                invalidate();
            }
        }
    }

    public void setVerticalGaps(float f) {
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f8381grimness != f) {
            this.f8381grimness = f;
            oilcan(true);
            invalidate();
        }
    }

    public final void starveling() {
        int i;
        int id = getId();
        int iMax = Math.max(this.f8385oilcan, this.f8391sealless);
        float[] fArrCreditor = creditor(this.f8391sealless, this.f8387polder);
        int i2 = 0;
        ConstraintLayout.LayoutParams layoutParamsSaran = saran(this.f8394stratoscope[0]);
        if (this.f8391sealless == 1) {
            cuirassed(this.f8394stratoscope[0]);
            layoutParamsSaran.f8846marial = id;
            layoutParamsSaran.f8839impromptu = id;
            this.f8394stratoscope[0].setLayoutParams(layoutParamsSaran);
            return;
        }
        while (true) {
            i = this.f8391sealless;
            if (i2 >= i) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsSaran2 = saran(this.f8394stratoscope[i2]);
            cuirassed(this.f8394stratoscope[i2]);
            if (fArrCreditor != null) {
                layoutParamsSaran2.f8871seminary = fArrCreditor[i2];
            }
            if (i2 > 0) {
                layoutParamsSaran2.f8816beachfront = this.f8386peridotite[i2 - 1];
            } else {
                layoutParamsSaran2.f8846marial = id;
            }
            if (i2 < this.f8391sealless - 1) {
                layoutParamsSaran2.f8820competently = this.f8386peridotite[i2 + 1];
            } else {
                layoutParamsSaran2.f8839impromptu = id;
            }
            if (i2 > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParamsSaran2).leftMargin = (int) this.f8392seminary;
            }
            this.f8394stratoscope[i2].setLayoutParams(layoutParamsSaran2);
            i2++;
        }
        while (i < iMax) {
            ConstraintLayout.LayoutParams layoutParamsSaran3 = saran(this.f8394stratoscope[i]);
            cuirassed(this.f8394stratoscope[i]);
            layoutParamsSaran3.f8846marial = id;
            layoutParamsSaran3.f8839impromptu = id;
            this.f8394stratoscope[i].setLayoutParams(layoutParamsSaran3);
            i++;
        }
    }

    public final void stratoscope(View view) {
        ConstraintLayout.LayoutParams layoutParamsSaran = saran(view);
        layoutParamsSaran.f8834grimness = -1.0f;
        layoutParamsSaran.f8825cutely = -1;
        layoutParamsSaran.f8877taiyuan = -1;
        layoutParamsSaran.f8813apical = -1;
        layoutParamsSaran.f8831formularize = -1;
        ((ViewGroup.MarginLayoutParams) layoutParamsSaran).topMargin = -1;
        view.setLayoutParams(layoutParamsSaran);
    }

    public final boolean supplicat(int[] iArr, int[][] iArr2) {
        View[] viewArrTriweekly = triweekly(this.f8396trm);
        for (int i = 0; i < iArr2.length; i++) {
            int iSealless = sealless(iArr2[i][0]);
            int iYemenite = yemenite(iArr2[i][0]);
            int[] iArr3 = iArr2[i];
            if (!merc(iSealless, iYemenite, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = viewArrTriweekly[i];
            int[] iArr4 = iArr2[i];
            trm(view, iSealless, iYemenite, iArr4[1], iArr4[2]);
            this.f8397walach.add(Integer.valueOf(iArr[i]));
        }
        return true;
    }

    public final void trm(View view, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParamsSaran = saran(view);
        int[] iArr = this.f8386peridotite;
        layoutParamsSaran.f8846marial = iArr[i2];
        layoutParamsSaran.f8877taiyuan = iArr[i];
        layoutParamsSaran.f8839impromptu = iArr[(i2 + i4) - 1];
        layoutParamsSaran.f8831formularize = iArr[(i + i3) - 1];
        view.setLayoutParams(layoutParamsSaran);
    }

    public final void walach() {
        int i;
        int i2 = this.f8398yemenite;
        if (i2 != 0 && (i = this.f8383kattegat) != 0) {
            this.f8385oilcan = i2;
            this.f8391sealless = i;
            return;
        }
        int i3 = this.f8383kattegat;
        if (i3 > 0) {
            this.f8391sealless = i3;
            this.f8385oilcan = ((this.f8779arytenoidectomy + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.f8385oilcan = i2;
            this.f8391sealless = ((this.f8779arytenoidectomy + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f8779arytenoidectomy) + 1.5d);
            this.f8385oilcan = iSqrt;
            this.f8391sealless = ((this.f8779arytenoidectomy + iSqrt) - 1) / iSqrt;
        }
    }

    public final int yemenite(int i) {
        return this.f8390saran == 1 ? i / this.f8385oilcan : i % this.f8391sealless;
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8378cord = 50;
        this.f8380cuirassed = 50;
        this.f8388privatdozent = 0;
        this.f8397walach = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8378cord = 50;
        this.f8380cuirassed = 50;
        this.f8388privatdozent = 0;
        this.f8397walach = new HashSet();
    }
}
