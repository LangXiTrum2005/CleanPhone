package kinesic;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ShapeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class polloi implements impassible, redevelopment.attabal.saneness, apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Path f29242attabal = new Path();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final saneness f29243beachfront = new saneness();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LottieDrawable f29244dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f29245marial;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f29246saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final redevelopment.impassible f29247wireman;

    public polloi(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.formularize formularizeVar) {
        this.name = formularizeVar.saneness();
        this.f29246saneness = formularizeVar.wireman();
        this.f29244dern = lottieDrawable;
        redevelopment.impassible impassibleVarAttabal = formularizeVar.dern().attabal();
        this.f29247wireman = impassibleVarAttabal;
        attabalVar.cutely(impassibleVarAttabal);
        impassibleVarAttabal.attabal(this);
    }

    private void taiyuan() {
        this.f29245marial = false;
        this.f29244dern.invalidateSelf();
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        taiyuan();
    }

    @Override // lamplit.marial
    public void competently(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        utwa.apical.apical(wiremanVar, i, list, wiremanVar2, this);
    }

    @Override // kinesic.dern
    public String getName() {
        return this.name;
    }

    @Override // kinesic.impassible
    public Path getPath() {
        if (this.f29245marial && !this.f29247wireman.apical()) {
            return this.f29242attabal;
        }
        this.f29242attabal.reset();
        if (this.f29246saneness) {
            this.f29245marial = true;
            return this.f29242attabal;
        }
        Path pathImpromptu = this.f29247wireman.impromptu();
        if (pathImpromptu == null) {
            return this.f29242attabal;
        }
        this.f29242attabal.set(pathImpromptu);
        this.f29242attabal.setFillType(Path.FillType.EVEN_ODD);
        this.f29243beachfront.saneness(this.f29242attabal);
        this.f29245marial = true;
        return this.f29242attabal;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            dern dernVar = list.get(i);
            if (dernVar instanceof adultoid) {
                adultoid adultoidVar = (adultoid) dernVar;
                if (adultoidVar.apical() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f29243beachfront.attabal(adultoidVar);
                    adultoidVar.wireman(this);
                } else if (!(dernVar instanceof molybdenite)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    molybdenite molybdeniteVar = (molybdenite) dernVar;
                    molybdeniteVar.beachfront(this);
                    arrayList.add(molybdeniteVar);
                }
            } else if (!(dernVar instanceof molybdenite)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                molybdenite molybdeniteVar2 = (molybdenite) dernVar;
                molybdeniteVar2.beachfront(this);
                arrayList.add(molybdeniteVar2);
            }
        }
        this.f29247wireman.molybdenite(arrayList);
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        if (t == creditor.f15953walach) {
            this.f29247wireman.kowloon(dernVar);
        }
    }
}
