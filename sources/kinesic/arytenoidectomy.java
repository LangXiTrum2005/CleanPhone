package kinesic;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: RepeaterContent.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy implements marial, impassible, cutely, redevelopment.attabal.saneness, apical {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final redevelopment.attabal<Float, Float> f29156beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final redevelopment.attabal<Float, Float> f29157competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LottieDrawable f29158dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final redevelopment.molybdenite f29159impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f29160marial;
    private final String name;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public wireman f29162taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.attabal f29163wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Matrix f29155attabal = new Matrix();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Path f29161saneness = new Path();

    public arytenoidectomy(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.competently competentlyVar) {
        this.f29158dern = lottieDrawable;
        this.f29163wireman = attabalVar;
        this.name = competentlyVar.dern();
        this.f29160marial = competentlyVar.beachfront();
        redevelopment.wireman wiremanVarAttabal = competentlyVar.saneness().attabal();
        this.f29156beachfront = wiremanVarAttabal;
        attabalVar.cutely(wiremanVarAttabal);
        wiremanVarAttabal.attabal(this);
        redevelopment.wireman wiremanVarAttabal2 = competentlyVar.wireman().attabal();
        this.f29157competently = wiremanVarAttabal2;
        attabalVar.cutely(wiremanVarAttabal2);
        wiremanVarAttabal2.attabal(this);
        redevelopment.molybdenite molybdeniteVarSaneness = competentlyVar.marial().saneness();
        this.f29159impromptu = molybdeniteVarSaneness;
        molybdeniteVarSaneness.wireman(attabalVar);
        molybdeniteVarSaneness.marial(this);
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        this.f29158dern.invalidateSelf();
    }

    @Override // lamplit.marial
    public void competently(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        utwa.apical.apical(wiremanVar, i, list, wiremanVar2, this);
        for (int i2 = 0; i2 < this.f29162taiyuan.apical().size(); i2++) {
            dern dernVar = this.f29162taiyuan.apical().get(i2);
            if (dernVar instanceof apical) {
                utwa.apical.apical(wiremanVar, i, list, wiremanVar2, (apical) dernVar);
            }
        }
    }

    @Override // kinesic.dern
    public String getName() {
        return this.name;
    }

    @Override // kinesic.impassible
    public Path getPath() {
        Path path = this.f29162taiyuan.getPath();
        this.f29161saneness.reset();
        float fFloatValue = this.f29156beachfront.impromptu().floatValue();
        float fFloatValue2 = this.f29157competently.impromptu().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.f29155attabal.set(this.f29159impromptu.cutely(i + fFloatValue2));
            this.f29161saneness.addPath(path, this.f29155attabal);
        }
        return this.f29161saneness;
    }

    @Override // kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        this.f29162taiyuan.impromptu(rectF, matrix, z);
    }

    @Override // kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        float fFloatValue = this.f29156beachfront.impromptu().floatValue();
        float fFloatValue2 = this.f29157competently.impromptu().floatValue();
        float fFloatValue3 = this.f29159impromptu.formularize().impromptu().floatValue() / 100.0f;
        float fFloatValue4 = this.f29159impromptu.impromptu().impromptu().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f29155attabal.set(matrix);
            float f = i2;
            this.f29155attabal.preConcat(this.f29159impromptu.cutely(f + fFloatValue2));
            this.f29162taiyuan.marial(canvas, this.f29155attabal, (int) (i * utwa.apical.taiyuan(fFloatValue3, fFloatValue4, f / fFloatValue)), attabalVar);
        }
    }

    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        this.f29162taiyuan.saneness(list, list2);
    }

    @Override // kinesic.cutely
    public void taiyuan(ListIterator<dern> listIterator) {
        if (this.f29162taiyuan != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f29162taiyuan = new wireman(this.f29158dern, this.f29163wireman, "Repeater", this.f29160marial, arrayList, null);
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        if (this.f29159impromptu.beachfront(t, dernVar)) {
            return;
        }
        if (t == creditor.f15942rotuma) {
            this.f29156beachfront.kowloon(dernVar);
        } else if (t == creditor.f15939preprohormone) {
            this.f29157competently.kowloon(dernVar);
        }
    }
}
