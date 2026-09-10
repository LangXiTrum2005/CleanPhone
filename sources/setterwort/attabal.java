package setterwort;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ProtectionGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements wireman.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayList<androidx.core.view.insets.attabal> f37520attabal = new ArrayList<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f37521beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public monroe.wireman f37522dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f37523marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f37524saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public monroe.wireman f37525wireman;

    public attabal(wireman wiremanVar, List<androidx.core.view.insets.attabal> list) {
        monroe.wireman wiremanVar2 = monroe.wireman.f33603marial;
        this.f37522dern = wiremanVar2;
        this.f37525wireman = wiremanVar2;
        beachfront(list, false);
        beachfront(list, true);
        wiremanVar.competently(this);
        this.f37524saneness = wiremanVar;
    }

    @Override // setterwort.wireman.dern
    public void attabal() {
        int i = this.f37523marial;
        boolean z = i > 0;
        int i2 = i - 1;
        this.f37523marial = i2;
        if (z && i2 == 0) {
            cutely();
        }
    }

    public final void beachfront(List<androidx.core.view.insets.attabal> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.core.view.insets.attabal attabalVar = list.get(i);
            if (attabalVar.competently() == z) {
                Object objWireman = attabalVar.wireman();
                if (objWireman != null) {
                    throw new IllegalStateException(attabalVar + " is already controlled by " + objWireman);
                }
                attabalVar.impromptu(this);
                this.f37520attabal.add(attabalVar);
            }
        }
    }

    public void competently() {
        if (this.f37521beachfront) {
            return;
        }
        this.f37521beachfront = true;
        this.f37524saneness.formularize(this);
        for (int size = this.f37520attabal.size() - 1; size >= 0; size--) {
            this.f37520attabal.get(size).impromptu(null);
        }
        this.f37520attabal.clear();
    }

    public final void cutely() {
        monroe.wireman wiremanVarAttabal = monroe.wireman.f33603marial;
        for (int size = this.f37520attabal.size() - 1; size >= 0; size--) {
            wiremanVarAttabal = monroe.wireman.attabal(wiremanVarAttabal, this.f37520attabal.get(size).saneness(this.f37522dern, this.f37525wireman, wiremanVarAttabal));
        }
    }

    @Override // setterwort.wireman.dern
    public void dern(monroe.wireman wiremanVar, monroe.wireman wiremanVar2) {
        this.f37522dern = wiremanVar;
        this.f37525wireman = wiremanVar2;
        cutely();
    }

    public androidx.core.view.insets.attabal impromptu(int i) {
        return this.f37520attabal.get(i);
    }

    @Override // setterwort.wireman.dern
    public void marial(int i) {
        for (int size = this.f37520attabal.size() - 1; size >= 0; size--) {
            this.f37520attabal.get(size).attabal(i);
        }
    }

    @Override // setterwort.wireman.dern
    public void saneness() {
        this.f37523marial++;
    }

    public int taiyuan() {
        return this.f37520attabal.size();
    }

    @Override // setterwort.wireman.dern
    public void wireman(int i, monroe.wireman wiremanVar, RectF rectF) {
        monroe.wireman wiremanVar2 = this.f37525wireman;
        for (int size = this.f37520attabal.size() - 1; size >= 0; size--) {
            androidx.core.view.insets.attabal attabalVar = this.f37520attabal.get(size);
            int iMarial = attabalVar.marial();
            if ((iMarial & i) != 0) {
                attabalVar.apical(true);
                if (iMarial == 1) {
                    int i2 = wiremanVar2.f33604attabal;
                    if (i2 > 0) {
                        attabalVar.cutely(wiremanVar.f33604attabal / i2);
                    }
                    attabalVar.taiyuan(rectF.left);
                } else if (iMarial == 2) {
                    int i3 = wiremanVar2.f33606saneness;
                    if (i3 > 0) {
                        attabalVar.cutely(wiremanVar.f33606saneness / i3);
                    }
                    attabalVar.taiyuan(rectF.top);
                } else if (iMarial == 4) {
                    int i4 = wiremanVar2.f33605dern;
                    if (i4 > 0) {
                        attabalVar.cutely(wiremanVar.f33605dern / i4);
                    }
                    attabalVar.taiyuan(rectF.right);
                } else if (iMarial == 8) {
                    int i5 = wiremanVar2.f33607wireman;
                    if (i5 > 0) {
                        attabalVar.cutely(wiremanVar.f33607wireman / i5);
                    }
                    attabalVar.taiyuan(rectF.bottom);
                }
            }
        }
    }
}
