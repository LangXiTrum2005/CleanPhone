package kinesic;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.model.content.ShapeStroke;

/* JADX INFO: compiled from: StrokeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class graveside extends attabal {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public redevelopment.attabal<ColorFilter, ColorFilter> f29206graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final redevelopment.attabal<Integer, Integer> f29207molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.attabal f29208monoploid;
    private final String name;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f29209polloi;

    public graveside(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, attabalVar, shapeStroke.saneness().toPaintCap(), shapeStroke.marial().toPaintJoin(), shapeStroke.competently(), shapeStroke.taiyuan(), shapeStroke.cutely(), shapeStroke.beachfront(), shapeStroke.wireman());
        this.f29208monoploid = attabalVar;
        this.name = shapeStroke.impromptu();
        this.f29209polloi = shapeStroke.apical();
        redevelopment.attabal<Integer, Integer> attabalVarAttabal = shapeStroke.dern().attabal();
        this.f29207molybdenite = attabalVarAttabal;
        attabalVarAttabal.attabal(this);
        attabalVar.cutely(attabalVarAttabal);
    }

    @Override // kinesic.dern
    public String getName() {
        return this.name;
    }

    @Override // kinesic.attabal, kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        if (this.f29209polloi) {
            return;
        }
        this.f29177taiyuan.setColor(((redevelopment.saneness) this.f29207molybdenite).polloi());
        redevelopment.attabal<ColorFilter, ColorFilter> attabalVar2 = this.f29206graveside;
        if (attabalVar2 != null) {
            this.f29177taiyuan.setColorFilter(attabalVar2.impromptu());
        }
        super.marial(canvas, matrix, i, attabalVar);
    }

    @Override // kinesic.attabal, lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        super.wireman(t, dernVar);
        if (t == creditor.f15943saneness) {
            this.f29207molybdenite.kowloon(dernVar);
            return;
        }
        if (t == creditor.f15944saran) {
            redevelopment.attabal<ColorFilter, ColorFilter> attabalVar = this.f29206graveside;
            if (attabalVar != null) {
                this.f29208monoploid.supplicat(attabalVar);
            }
            if (dernVar == null) {
                this.f29206graveside = null;
                return;
            }
            redevelopment.graveside gravesideVar = new redevelopment.graveside(dernVar);
            this.f29206graveside = gravesideVar;
            gravesideVar.attabal(this);
            this.f29208monoploid.cutely(this.f29207molybdenite);
        }
    }
}
