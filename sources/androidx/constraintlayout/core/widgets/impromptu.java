package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Placeholder.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu extends taiyuan {
    @Override // androidx.constraintlayout.core.widgets.taiyuan
    public void alloy(int i, int i2, int i3, int i4) {
        int iHomophylic = homophylic() + genii();
        int iSaccharic = saccharic() + likeable();
        if (this.f37385licking > 0) {
            iHomophylic += this.f37386osteal[0].dent();
            iSaccharic += this.f37386osteal[0].cord();
        }
        int iMax = Math.max(polder(), iHomophylic);
        int iMax2 = Math.max(merc(), iSaccharic);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        murrine(i2, i4);
        hyalinization(i2);
        sakeen(i4);
        hypokinesis(this.f37385licking > 0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void competently(androidx.constraintlayout.core.dern dernVar, boolean z) {
        super.competently(dernVar, z);
        if (this.f37385licking > 0) {
            ConstraintWidget constraintWidget = this.f37386osteal[0];
            constraintWidget.lightstruck();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.cutely(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.cutely(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.cutely(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.cutely(type4, this, type4);
        }
    }
}
