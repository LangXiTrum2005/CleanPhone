package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: compiled from: CardViewApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements dern {
    @Override // androidx.cardview.widget.dern
    public void apical(saneness sanenessVar) {
        if (!sanenessVar.dern()) {
            sanenessVar.attabal(0, 0, 0, 0);
            return;
        }
        float fWireman = wireman(sanenessVar);
        float fSaneness = saneness(sanenessVar);
        int iCeil = (int) Math.ceil(marial.attabal(fWireman, fSaneness, sanenessVar.marial()));
        int iCeil2 = (int) Math.ceil(marial.saneness(fWireman, fSaneness, sanenessVar.marial()));
        sanenessVar.attabal(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final wireman arytenoidectomy(saneness sanenessVar) {
        return (wireman) sanenessVar.wireman();
    }

    @Override // androidx.cardview.widget.dern
    public void attabal(saneness sanenessVar, float f) {
        arytenoidectomy(sanenessVar).impromptu(f);
    }

    @Override // androidx.cardview.widget.dern
    public float beachfront(saneness sanenessVar) {
        return saneness(sanenessVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.dern
    public void competently(saneness sanenessVar) {
        kowloon(sanenessVar, wireman(sanenessVar));
    }

    @Override // androidx.cardview.widget.dern
    public void cutely(saneness sanenessVar) {
        kowloon(sanenessVar, wireman(sanenessVar));
    }

    @Override // androidx.cardview.widget.dern
    public void dern(saneness sanenessVar, float f) {
        sanenessVar.beachfront().setElevation(f);
    }

    @Override // androidx.cardview.widget.dern
    public float impassible(saneness sanenessVar) {
        return saneness(sanenessVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.dern
    public void impromptu(saneness sanenessVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        sanenessVar.saneness(new wireman(colorStateList, f));
        View viewBeachfront = sanenessVar.beachfront();
        viewBeachfront.setClipToOutline(true);
        viewBeachfront.setElevation(f2);
        kowloon(sanenessVar, f3);
    }

    @Override // androidx.cardview.widget.dern
    public void kowloon(saneness sanenessVar, float f) {
        arytenoidectomy(sanenessVar).competently(f, sanenessVar.dern(), sanenessVar.marial());
        apical(sanenessVar);
    }

    @Override // androidx.cardview.widget.dern
    public ColorStateList marial(saneness sanenessVar) {
        return arytenoidectomy(sanenessVar).saneness();
    }

    @Override // androidx.cardview.widget.dern
    public float saneness(saneness sanenessVar) {
        return arytenoidectomy(sanenessVar).wireman();
    }

    @Override // androidx.cardview.widget.dern
    public float taiyuan(saneness sanenessVar) {
        return sanenessVar.beachfront().getElevation();
    }

    @Override // androidx.cardview.widget.dern
    public void triweekly(saneness sanenessVar, ColorStateList colorStateList) {
        arytenoidectomy(sanenessVar).beachfront(colorStateList);
    }

    @Override // androidx.cardview.widget.dern
    public float wireman(saneness sanenessVar) {
        return arytenoidectomy(sanenessVar).dern();
    }

    @Override // androidx.cardview.widget.dern
    public void formularize() {
    }
}
