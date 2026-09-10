package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import sensatory.wireman;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static int f8365merc;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static float f8366polder;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public ConstraintLayout f8367cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f8368cuirassed;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public String f8369kattegat;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f8370oilcan;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public Integer f8371restrictive;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public String f8372sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public float[] f8373stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public Float f8374supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public int[] f8375trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f8376yemenite;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f8376yemenite = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                preprohormone(str.substring(i).trim());
                return;
            } else {
                preprohormone(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f8370oilcan = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                cord(str.substring(i).trim());
                return;
            } else {
                cord(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    public final void cord(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f8785monoploid == null || (iArr = this.f8375trm) == null) {
            return;
        }
        if (this.f8370oilcan + 1 > iArr.length) {
            this.f8375trm = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f8375trm[this.f8370oilcan] = (int) (Integer.parseInt(str) * this.f8785monoploid.getResources().getDisplayMetrics().density);
        this.f8370oilcan++;
    }

    public final void cuirassed() {
        this.f8367cord = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f8779arytenoidectomy; i++) {
            View viewApical = this.f8367cord.apical(this.f8783kowloon[i]);
            if (viewApical != null) {
                int i2 = f8365merc;
                float f = f8366polder;
                int[] iArr = this.f8375trm;
                if (iArr == null || i >= iArr.length) {
                    Integer num = this.f8371restrictive;
                    if (num == null || num.intValue() == -1) {
                        this.f8781gintrap.get(Integer.valueOf(viewApical.getId()));
                    } else {
                        this.f8370oilcan++;
                        if (this.f8375trm == null) {
                            this.f8375trm = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f8375trm = radius;
                        radius[this.f8370oilcan - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f8373stratoscope;
                if (fArr == null || i >= fArr.length) {
                    Float f2 = this.f8374supplicat;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        this.f8781gintrap.get(Integer.valueOf(viewApical.getId()));
                    } else {
                        this.f8376yemenite++;
                        if (this.f8373stratoscope == null) {
                            this.f8373stratoscope = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f8373stratoscope = angles;
                        angles[this.f8376yemenite - 1] = f;
                    }
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewApical.getLayoutParams();
                layoutParams.f8860polloi = f;
                layoutParams.f8814arytenoidectomy = this.f8368cuirassed;
                layoutParams.f8851monoploid = i2;
                viewApical.setLayoutParams(layoutParams);
            }
        }
        impromptu();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f8373stratoscope, this.f8376yemenite);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f8375trm, this.f8370oilcan);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void kowloon(AttributeSet attributeSet) {
        super.kowloon(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wireman.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f8368cuirassed = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == wireman.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8372sealless = string;
                    setAngles(string);
                } else if (index == wireman.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f8369kattegat = string2;
                    setRadius(string2);
                } else if (index == wireman.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f8366polder));
                    this.f8374supplicat = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == wireman.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f8365merc));
                    this.f8371restrictive = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8372sealless;
        if (str != null) {
            this.f8373stratoscope = new float[1];
            setAngles(str);
        }
        String str2 = this.f8369kattegat;
        if (str2 != null) {
            this.f8375trm = new int[1];
            setRadius(str2);
        }
        Float f = this.f8374supplicat;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f8371restrictive;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        cuirassed();
    }

    public final void preprohormone(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f8785monoploid == null || (fArr = this.f8373stratoscope) == null) {
            return;
        }
        if (this.f8376yemenite + 1 > fArr.length) {
            this.f8373stratoscope = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f8373stratoscope[this.f8376yemenite] = Integer.parseInt(str);
        this.f8376yemenite++;
    }

    public void setDefaultAngle(float f) {
        f8366polder = f;
    }

    public void setDefaultRadius(int i) {
        f8365merc = i;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
