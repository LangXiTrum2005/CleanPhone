package pact;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.creditor;
import com.airbnb.lottie.impromptu;
import com.airbnb.lottie.model.layer.Layer;
import euhemerize.apical;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ShapeLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends com.airbnb.lottie.model.layer.attabal {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public redevelopment.dern f34986kattegat;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.saneness f34987sealless;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final kinesic.wireman f34988yemenite;

    public wireman(LottieDrawable lottieDrawable, Layer layer, com.airbnb.lottie.model.layer.saneness sanenessVar, impromptu impromptuVar) {
        super(lottieDrawable, layer);
        this.f34987sealless = sanenessVar;
        kinesic.wireman wiremanVar = new kinesic.wireman(lottieDrawable, this, new apical("__container", layer.kowloon(), false), impromptuVar);
        this.f34988yemenite = wiremanVar;
        List<kinesic.dern> list = Collections.EMPTY_LIST;
        wiremanVar.saneness(list, list);
        if (cord() != null) {
            this.f34986kattegat = new redevelopment.dern(this, this, cord());
        }
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void adultoid(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.attabal attabalVar) {
        redevelopment.dern dernVar = this.f34986kattegat;
        if (dernVar != null) {
            attabalVar = dernVar.saneness(matrix, i);
        }
        this.f34988yemenite.marial(canvas, matrix, i, attabalVar);
    }

    @Override // com.airbnb.lottie.model.layer.attabal, kinesic.marial
    public void impromptu(RectF rectF, Matrix matrix, boolean z) {
        super.impromptu(rectF, matrix, z);
        this.f34988yemenite.impromptu(rectF, this.f16113kowloon, z);
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public void restrictive(lamplit.wireman wiremanVar, int i, List<lamplit.wireman> list, lamplit.wireman wiremanVar2) {
        this.f34988yemenite.competently(wiremanVar, i, list, wiremanVar2);
    }

    @Override // com.airbnb.lottie.model.layer.attabal
    public euhemerize.attabal rotuma() {
        euhemerize.attabal attabalVarRotuma = super.rotuma();
        return attabalVarRotuma != null ? attabalVarRotuma : this.f34987sealless.rotuma();
    }

    @Override // com.airbnb.lottie.model.layer.attabal, lamplit.marial
    public <T> void wireman(T t, com.airbnb.lottie.value.dern<T> dernVar) {
        redevelopment.dern dernVar2;
        redevelopment.dern dernVar3;
        redevelopment.dern dernVar4;
        redevelopment.dern dernVar5;
        redevelopment.dern dernVar6;
        super.wireman(t, dernVar);
        if (t == creditor.f15932marial && (dernVar6 = this.f34986kattegat) != null) {
            dernVar6.dern(dernVar);
            return;
        }
        if (t == creditor.f15933merc && (dernVar5 = this.f34986kattegat) != null) {
            dernVar5.beachfront(dernVar);
            return;
        }
        if (t == creditor.f15937polder && (dernVar4 = this.f34986kattegat) != null) {
            dernVar4.wireman(dernVar);
            return;
        }
        if (t == creditor.f15946seminary && (dernVar3 = this.f34986kattegat) != null) {
            dernVar3.marial(dernVar);
        } else {
            if (t != creditor.f15926grimness || (dernVar2 = this.f34986kattegat) == null) {
                return;
            }
            dernVar2.competently(dernVar);
        }
    }
}
