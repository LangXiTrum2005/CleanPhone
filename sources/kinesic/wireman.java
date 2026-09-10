package kinesic;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ContentGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements marial, impassible, redevelopment.attabal.saneness, lamplit.marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public redevelopment.molybdenite f29277apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final OffscreenLayer.saneness f29278attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final RectF f29279beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f29280competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public List<impassible> f29281cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final OffscreenLayer f29282dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final List<dern> f29283impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Path f29284marial;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final RectF f29285saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final LottieDrawable f29286taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Matrix f29287wireman;

    public wireman(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, euhemerize.apical apicalVar, com.airbnb.lottie.impromptu impromptuVar) {
        this(lottieDrawable, attabalVar, apicalVar.dern(), apicalVar.wireman(), taiyuan(lottieDrawable, impromptuVar, attabalVar, apicalVar.saneness()), cutely(apicalVar.saneness()));
    }

    public static inswinger.triweekly cutely(List<euhemerize.dern> list) {
        for (int i = 0; i < list.size(); i++) {
            euhemerize.dern dernVar = list.get(i);
            if (dernVar instanceof inswinger.triweekly) {
                return (inswinger.triweekly) dernVar;
            }
        }
        return null;
    }

    public static List<dern> taiyuan(LottieDrawable lottieDrawable, com.airbnb.lottie.impromptu impromptuVar, com.airbnb.lottie.model.layer.attabal attabalVar, List<euhemerize.dern> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            dern dernVarAttabal = list.get(i).attabal(lottieDrawable, impromptuVar, attabalVar);
            if (dernVarAttabal != null) {
                arrayList.add(dernVarAttabal);
            }
        }
        return arrayList;
    }

    public List<dern> apical() {
        return this.f29283impromptu;
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        this.f29286taiyuan.invalidateSelf();
    }

    @Override // lamplit.marial
    public void competently(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        if (wiremanVar.competently(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                wiremanVar2 = wiremanVar2.attabal(getName());
                if (wiremanVar.dern(getName(), i)) {
                    list.add(wiremanVar2.taiyuan(this));
                }
            }
            if (wiremanVar.impromptu(getName(), i)) {
                int iMarial = i + wiremanVar.marial(getName(), i);
                for (int i2 = 0; i2 < this.f29283impromptu.size(); i2++) {
                    dern dernVar = this.f29283impromptu.get(i2);
                    if (dernVar instanceof lamplit.marial) {
                        ((lamplit.marial) dernVar).competently(wiremanVar, iMarial, list, wiremanVar2);
                    }
                }
            }
        }
    }

    public List<impassible> formularize() {
        if (this.f29281cutely == null) {
            this.f29281cutely = new ArrayList();
            for (int i = 0; i < this.f29283impromptu.size(); i++) {
                dern dernVar = this.f29283impromptu.get(i);
                if (dernVar instanceof impassible) {
                    this.f29281cutely.add((impassible) dernVar);
                }
            }
        }
        return this.f29281cutely;
    }

    @Override // kinesic.dern
    public String getName() {
        return this.name;
    }

    @Override // kinesic.impassible
    public Path getPath() {
        this.f29287wireman.reset();
        redevelopment.molybdenite molybdeniteVar = this.f29277apical;
        if (molybdeniteVar != null) {
            this.f29287wireman.set(molybdeniteVar.taiyuan());
        }
        this.f29284marial.reset();
        if (this.f29280competently) {
            return this.f29284marial;
        }
        for (int size = this.f29283impromptu.size() - 1; size >= 0; size--) {
            dern dernVar = this.f29283impromptu.get(size);
            if (dernVar instanceof impassible) {
                this.f29284marial.addPath(((impassible) dernVar).getPath(), this.f29287wireman);
            }
        }
        return this.f29284marial;
    }

    public Matrix impassible() {
        redevelopment.molybdenite molybdeniteVar = this.f29277apical;
        if (molybdeniteVar != null) {
            return molybdeniteVar.taiyuan();
        }
        this.f29287wireman.reset();
        return this.f29287wireman;
    }

    @Override // kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        this.f29287wireman.set(matrix);
        redevelopment.molybdenite molybdeniteVar = this.f29277apical;
        if (molybdeniteVar != null) {
            this.f29287wireman.preConcat(molybdeniteVar.taiyuan());
        }
        this.f29279beachfront.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int size = this.f29283impromptu.size() - 1; size >= 0; size--) {
            dern dernVar = this.f29283impromptu.get(size);
            if (dernVar instanceof marial) {
                ((marial) dernVar).impromptu(this.f29279beachfront, this.f29287wireman, z);
                rectF.union(this.f29279beachfront);
            }
        }
    }

    @Override // kinesic.marial
    public void marial(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        if (this.f29280competently) {
            return;
        }
        this.f29287wireman.set(matrix);
        redevelopment.molybdenite molybdeniteVar = this.f29277apical;
        if (molybdeniteVar != null) {
            this.f29287wireman.preConcat(molybdeniteVar.taiyuan());
            i = (int) (((((this.f29277apical.apical() == null ? 100 : this.f29277apical.apical().impromptu().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = (this.f29286taiyuan.coi() && triweekly() && i != 255) || (attabalVar != null && this.f29286taiyuan.czestochowa() && triweekly());
        int i2 = z ? 255 : i;
        if (z) {
            this.f29285saneness.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            impromptu(this.f29285saneness, matrix, true);
            OffscreenLayer.saneness sanenessVar = this.f29278attabal;
            sanenessVar.f16235attabal = i;
            if (attabalVar != null) {
                attabalVar.saneness(sanenessVar);
                attabalVar = null;
            } else {
                sanenessVar.f16238wireman = null;
            }
            canvas = this.f29282dern.cutely(canvas, this.f29285saneness, this.f29278attabal);
        } else if (attabalVar != null) {
            com.airbnb.lottie.utils.attabal attabalVar2 = new com.airbnb.lottie.utils.attabal(attabalVar);
            attabalVar2.taiyuan(i2);
            attabalVar = attabalVar2;
        }
        for (int size = this.f29283impromptu.size() - 1; size >= 0; size--) {
            dern dernVar = this.f29283impromptu.get(size);
            if (dernVar instanceof marial) {
                ((marial) dernVar).marial(canvas, this.f29287wireman, i2, attabalVar);
            }
        }
        if (z) {
            this.f29282dern.marial();
        }
    }

    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f29283impromptu.size());
        arrayList.addAll(list);
        for (int size = this.f29283impromptu.size() - 1; size >= 0; size--) {
            dern dernVar = this.f29283impromptu.get(size);
            dernVar.saneness(arrayList, this.f29283impromptu.subList(0, size));
            arrayList.add(dernVar);
        }
    }

    public final boolean triweekly() {
        int i = 0;
        for (int i2 = 0; i2 < this.f29283impromptu.size(); i2++) {
            if ((this.f29283impromptu.get(i2) instanceof marial) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        redevelopment.molybdenite molybdeniteVar = this.f29277apical;
        if (molybdeniteVar != null) {
            molybdeniteVar.beachfront(t, dernVar);
        }
    }

    public wireman(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.attabal attabalVar, String str, boolean z, List<dern> list, inswinger.triweekly triweeklyVar) {
        this.f29278attabal = new OffscreenLayer.saneness();
        this.f29285saneness = new RectF();
        this.f29282dern = new OffscreenLayer();
        this.f29287wireman = new Matrix();
        this.f29284marial = new Path();
        this.f29279beachfront = new RectF();
        this.name = str;
        this.f29286taiyuan = lottieDrawable;
        this.f29280competently = z;
        this.f29283impromptu = list;
        if (triweeklyVar != null) {
            redevelopment.molybdenite molybdeniteVarSaneness = triweeklyVar.saneness();
            this.f29277apical = molybdeniteVarSaneness;
            molybdeniteVarSaneness.wireman(attabalVar);
            this.f29277apical.marial(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            dern dernVar = list.get(size);
            if (dernVar instanceof cutely) {
                arrayList.add((cutely) dernVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((cutely) arrayList.get(size2)).taiyuan(list.listIterator(list.size()));
        }
    }
}
