package aesthesia;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselStrategy;

/* JADX INFO: compiled from: MultiBrowseCarouselStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan extends CarouselStrategy {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f3825dern = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f3824wireman = {1};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f3823marial = {1, 0};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public com.google.android.material.carousel.saneness competently(saneness sanenessVar, View view) {
        boolean z;
        int iSaneness = sanenessVar.saneness();
        if (sanenessVar.wireman()) {
            iSaneness = sanenessVar.attabal();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (sanenessVar.wireman()) {
            f = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fWireman = wireman() + f;
        float fMax = Math.max(dern() + f, fWireman);
        float f2 = iSaneness;
        float fMin = Math.min(measuredHeight + f, f2);
        float fAttabal = achondroplasia.attabal.attabal((measuredHeight / 3.0f) + f, fWireman + f, fMax + f);
        float f3 = (fMin + fAttabal) / 2.0f;
        int[] iArrAttabal = f3824wireman;
        float f4 = 2.0f * fWireman;
        if (f2 <= f4) {
            iArrAttabal = new int[]{0};
        }
        int[] iArrAttabal2 = f3823marial;
        if (sanenessVar.dern() == 1) {
            iArrAttabal = CarouselStrategy.attabal(iArrAttabal);
            iArrAttabal2 = CarouselStrategy.attabal(iArrAttabal2);
        }
        int[] iArr = iArrAttabal2;
        int[] iArr2 = iArrAttabal;
        float f5 = f;
        int iMax = (int) Math.max(1.0d, Math.floor(((f2 - (com.google.android.material.carousel.attabal.taiyuan(iArr) * f3)) - (com.google.android.material.carousel.attabal.taiyuan(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f2 / fMin);
        int i = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iCeil - i2;
        }
        attabal attabalVarDern = attabal.dern(f2, fAttabal, fWireman, fMax, iArr2, f3, iArr, fMin, iArr3);
        this.f3825dern = attabalVarDern.marial();
        boolean zTaiyuan = taiyuan(attabalVarDern, sanenessVar.getItemCount());
        int i3 = attabalVarDern.f3817wireman;
        if (i3 == 0 && attabalVarDern.f3813dern == 0 && f2 > f4) {
            attabalVarDern.f3813dern = 1;
            z = true;
        } else {
            z = zTaiyuan;
        }
        if (z) {
            attabalVarDern = attabal.dern(f2, fAttabal, fWireman, fMax, new int[]{attabalVarDern.f3813dern}, f3, new int[]{i3}, fMin, new int[]{attabalVarDern.f3812competently});
        }
        return com.google.android.material.carousel.attabal.wireman(view.getContext(), f5, iSaneness, attabalVarDern, sanenessVar.dern());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean impromptu(saneness sanenessVar, int i) {
        if (i >= this.f3825dern || sanenessVar.getItemCount() < this.f3825dern) {
            return i >= this.f3825dern && sanenessVar.getItemCount() < this.f3825dern;
        }
        return true;
    }

    public boolean taiyuan(attabal attabalVar, int i) {
        int iMarial = attabalVar.marial() - i;
        boolean z = iMarial > 0 && (attabalVar.f3813dern > 0 || attabalVar.f3817wireman > 1);
        while (iMarial > 0) {
            int i2 = attabalVar.f3813dern;
            if (i2 > 0) {
                attabalVar.f3813dern = i2 - 1;
            } else {
                int i3 = attabalVar.f3817wireman;
                if (i3 > 1) {
                    attabalVar.f3817wireman = i3 - 1;
                }
            }
            iMarial--;
        }
        return z;
    }
}
