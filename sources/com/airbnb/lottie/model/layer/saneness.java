package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.collection.gintrap;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.impromptu;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import redevelopment.dern;
import redevelopment.graveside;
import redevelopment.wireman;

/* JADX INFO: compiled from: CompositionLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends com.airbnb.lottie.model.layer.attabal {

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public dern f16129creditor;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public Boolean f16130grimness;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final RectF f16131kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public final OffscreenLayer f16132merc;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public final OffscreenLayer.saneness f16133polder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public boolean f16134privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final RectF f16135restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public float f16136saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final List<com.airbnb.lottie.model.layer.attabal> f16137sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public Boolean f16138seminary;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final RectF f16139supplicat;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public redevelopment.attabal<Float, Float> f16140yemenite;

    /* JADX INFO: compiled from: CompositionLayer.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f16141attabal;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f16141attabal = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16141attabal[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public saneness(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, impromptu impromptuVar) {
        int i;
        com.airbnb.lottie.model.layer.attabal attabalVar;
        super(lottieDrawable, layer);
        this.f16137sealless = new ArrayList();
        this.f16131kattegat = new RectF();
        this.f16139supplicat = new RectF();
        this.f16135restrictive = new RectF();
        this.f16132merc = new OffscreenLayer();
        this.f16133polder = new OffscreenLayer.saneness();
        this.f16134privatdozent = true;
        inswinger.saneness sanenessVarDovishness = layer.dovishness();
        if (sanenessVarDovishness != null) {
            wireman wiremanVarAttabal = sanenessVarDovishness.attabal();
            this.f16140yemenite = wiremanVarAttabal;
            cutely(wiremanVarAttabal);
            this.f16140yemenite.attabal(this);
        } else {
            this.f16140yemenite = null;
        }
        gintrap gintrapVar = new gintrap(impromptuVar.apical().size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.attabal attabalVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            com.airbnb.lottie.model.layer.attabal attabalVarDovishness = com.airbnb.lottie.model.layer.attabal.dovishness(this, layer2, lottieDrawable, impromptuVar);
            if (attabalVarDovishness != null) {
                gintrapVar.taiyuan(attabalVarDovishness.cuirassed().marial(), attabalVarDovishness);
                if (attabalVar2 != null) {
                    attabalVar2.merc(attabalVarDovishness);
                    attabalVar2 = null;
                } else {
                    this.f16137sealless.add(0, attabalVarDovishness);
                    int i2 = attabal.f16141attabal[layer2.taiyuan().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        attabalVar2 = attabalVarDovishness;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < gintrapVar.impassible(); i++) {
            com.airbnb.lottie.model.layer.attabal attabalVar3 = (com.airbnb.lottie.model.layer.attabal) gintrapVar.marial(gintrapVar.impromptu(i));
            if (attabalVar3 != null && (attabalVar = (com.airbnb.lottie.model.layer.attabal) gintrapVar.marial(attabalVar3.cuirassed().apical())) != null) {
                attabalVar3.seminary(attabalVar);
            }
        }
        if (cord() != null) {
            this.f16129creditor = new dern(this, this, cord());
        }
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void adultoid(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        Canvas canvasCutely;
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("CompositionLayer#draw");
        }
        boolean z = false;
        boolean z2 = (attabalVar == null && this.f16129creditor == null) ? false : true;
        if ((this.f16099arytenoidectomy.coi() && this.f16137sealless.size() > 1 && i != 255) || (z2 && this.f16099arytenoidectomy.czestochowa())) {
            z = true;
        }
        int i2 = z ? 255 : i;
        dern dernVar = this.f16129creditor;
        if (dernVar != null) {
            attabalVar = dernVar.saneness(matrix, i2);
        }
        if (this.f16134privatdozent || !"__container".equals(this.f16116monoploid.cutely())) {
            this.f16139supplicat.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f16116monoploid.impassible(), this.f16116monoploid.formularize());
            matrix.mapRect(this.f16139supplicat);
        } else {
            this.f16139supplicat.setEmpty();
            Iterator<com.airbnb.lottie.model.layer.attabal> it = this.f16137sealless.iterator();
            while (it.hasNext()) {
                it.next().impromptu(this.f16135restrictive, matrix, true);
                this.f16139supplicat.union(this.f16135restrictive);
            }
        }
        if (z) {
            this.f16133polder.beachfront();
            OffscreenLayer.saneness sanenessVar = this.f16133polder;
            sanenessVar.f16235attabal = i;
            if (attabalVar != null) {
                attabalVar.saneness(sanenessVar);
                attabalVar = null;
            }
            canvasCutely = this.f16132merc.cutely(canvas, this.f16139supplicat, this.f16133polder);
        } else {
            canvasCutely = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.f16139supplicat)) {
            for (int size = this.f16137sealless.size() - 1; size >= 0; size--) {
                this.f16137sealless.get(size).marial(canvasCutely, matrix, i2, attabalVar);
            }
        }
        if (z) {
            this.f16132merc.marial();
        }
        canvas.restore();
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("CompositionLayer#draw");
        }
    }

    public float creditor() {
        return this.f16136saran;
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void grimness(float f) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("CompositionLayer#setProgress");
        }
        this.f16136saran = f;
        super.grimness(f);
        if (this.f16140yemenite != null) {
            f = ((this.f16140yemenite.impromptu().floatValue() * this.f16116monoploid.dern().taiyuan()) - this.f16116monoploid.dern().arytenoidectomy()) / (this.f16099arytenoidectomy.privatdozent().marial() + 0.01f);
        }
        if (this.f16140yemenite == null) {
            f -= this.f16116monoploid.molybdenite();
        }
        if (this.f16116monoploid.gintrap() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !"__container".equals(this.f16116monoploid.cutely())) {
            f /= this.f16116monoploid.gintrap();
        }
        for (int size = this.f16137sealless.size() - 1; size >= 0; size--) {
            this.f16137sealless.get(size).grimness(f);
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("CompositionLayer#setProgress");
        }
    }

    public boolean hydrovane() {
        if (this.f16138seminary == null) {
            if (trm()) {
                this.f16138seminary = Boolean.TRUE;
                return true;
            }
            for (int size = this.f16137sealless.size() - 1; size >= 0; size--) {
                if (this.f16137sealless.get(size).trm()) {
                    this.f16138seminary = Boolean.TRUE;
                    return true;
                }
            }
            this.f16138seminary = Boolean.FALSE;
        }
        return this.f16138seminary.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.attabal, kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        super.impromptu(rectF, matrix, z);
        for (int size = this.f16137sealless.size() - 1; size >= 0; size--) {
            this.f16131kattegat.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f16137sealless.get(size).impromptu(this.f16131kattegat, this.f16113kowloon, true);
            rectF.union(this.f16131kattegat);
        }
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void polder(boolean z) {
        super.polder(z);
        Iterator<com.airbnb.lottie.model.layer.attabal> it = this.f16137sealless.iterator();
        while (it.hasNext()) {
            it.next().polder(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void restrictive(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        for (int i2 = 0; i2 < this.f16137sealless.size(); i2++) {
            this.f16137sealless.get(i2).competently(wiremanVar, i, list, wiremanVar2);
        }
    }

    public boolean starveling() {
        if (this.f16130grimness == null) {
            for (int size = this.f16137sealless.size() - 1; size >= 0; size--) {
                com.airbnb.lottie.model.layer.attabal attabalVar = this.f16137sealless.get(size);
                if (attabalVar instanceof pact.wireman) {
                    if (attabalVar.stratoscope()) {
                        this.f16130grimness = Boolean.TRUE;
                        return true;
                    }
                } else if ((attabalVar instanceof saneness) && ((saneness) attabalVar).starveling()) {
                    this.f16130grimness = Boolean.TRUE;
                    return true;
                }
            }
            this.f16130grimness = Boolean.FALSE;
        }
        return this.f16130grimness.booleanValue();
    }

    public void walach(boolean z) {
        this.f16134privatdozent = z;
    }

    @Override // com.airbnb.lottie.model.layer.attabal, lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        dern dernVar2;
        dern dernVar3;
        dern dernVar4;
        dern dernVar5;
        dern dernVar6;
        super.wireman(t, dernVar);
        if (t == creditor.f15949supplicat) {
            if (dernVar == null) {
                redevelopment.attabal<Float, Float> attabalVar = this.f16140yemenite;
                if (attabalVar != null) {
                    attabalVar.kowloon(null);
                    return;
                }
                return;
            }
            graveside gravesideVar = new graveside(dernVar);
            this.f16140yemenite = gravesideVar;
            gravesideVar.attabal(this);
            cutely(this.f16140yemenite);
            return;
        }
        if (t == creditor.f15932marial && (dernVar6 = this.f16129creditor) != null) {
            dernVar6.dern(dernVar);
            return;
        }
        if (t == creditor.f15933merc && (dernVar5 = this.f16129creditor) != null) {
            dernVar5.beachfront(dernVar);
            return;
        }
        if (t == creditor.f15937polder && (dernVar4 = this.f16129creditor) != null) {
            dernVar4.wireman(dernVar);
            return;
        }
        if (t == creditor.f15946seminary && (dernVar3 = this.f16129creditor) != null) {
            dernVar3.marial(dernVar);
        } else {
            if (t != creditor.f15926grimness || (dernVar2 = this.f16129creditor) == null) {
                return;
            }
            dernVar2.competently(dernVar);
        }
    }
}
