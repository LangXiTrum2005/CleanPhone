package redevelopment;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class dern implements redevelopment.attabal.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.attabal f36105attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final wireman f36106beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final wireman f36107competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final redevelopment.attabal<Integer, Integer> f36108dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public Matrix f36109impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final wireman f36110marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final redevelopment.attabal.saneness f36111saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final wireman f36112wireman;

    /* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
    public class attabal extends com.airbnb.lottie.value.dern<Float> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.value.dern f36113dern;

        public attabal(com.airbnb.lottie.value.dern dernVar) {
            this.f36113dern = dernVar;
        }

        @Override // com.airbnb.lottie.value.dern
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public Float attabal(com.airbnb.lottie.value.saneness<Float> sanenessVar) {
            Float f = (Float) this.f36113dern.attabal(sanenessVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public dern(redevelopment.attabal.saneness sanenessVar, com.airbnb.lottie.model.layer.attabal attabalVar, rotissomat.cutely cutelyVar) {
        this.f36111saneness = sanenessVar;
        this.f36105attabal = attabalVar;
        redevelopment.attabal<Integer, Integer> attabalVarAttabal = cutelyVar.attabal().attabal();
        this.f36108dern = attabalVarAttabal;
        attabalVarAttabal.attabal(this);
        attabalVar.cutely(attabalVarAttabal);
        wireman wiremanVarAttabal = cutelyVar.wireman().attabal();
        this.f36112wireman = wiremanVarAttabal;
        wiremanVarAttabal.attabal(this);
        attabalVar.cutely(wiremanVarAttabal);
        wireman wiremanVarAttabal2 = cutelyVar.saneness().attabal();
        this.f36110marial = wiremanVarAttabal2;
        wiremanVarAttabal2.attabal(this);
        attabalVar.cutely(wiremanVarAttabal2);
        wireman wiremanVarAttabal3 = cutelyVar.dern().attabal();
        this.f36106beachfront = wiremanVarAttabal3;
        wiremanVarAttabal3.attabal(this);
        attabalVar.cutely(wiremanVarAttabal3);
        wireman wiremanVarAttabal4 = cutelyVar.marial().attabal();
        this.f36107competently = wiremanVarAttabal4;
        wiremanVarAttabal4.attabal(this);
        attabalVar.cutely(wiremanVarAttabal4);
    }

    @Override // redevelopment.attabal.saneness
    public void attabal() {
        this.f36111saneness.attabal();
    }

    public void beachfront(com.airbnb.lottie.value.dern<Float> dernVar) {
        if (dernVar == null) {
            this.f36112wireman.kowloon(null);
        } else {
            this.f36112wireman.kowloon(new attabal(dernVar));
        }
    }

    public void competently(com.airbnb.lottie.value.dern<Float> dernVar) {
        this.f36107competently.kowloon(dernVar);
    }

    public void dern(com.airbnb.lottie.value.dern<Integer> dernVar) {
        this.f36108dern.kowloon(dernVar);
    }

    public void marial(com.airbnb.lottie.value.dern<Float> dernVar) {
        this.f36106beachfront.kowloon(dernVar);
    }

    public com.airbnb.lottie.utils.attabal saneness(Matrix matrix, int i) {
        float fPolloi = this.f36110marial.polloi() * 0.017453292f;
        float fFloatValue = this.f36106beachfront.impromptu().floatValue();
        double d = fPolloi;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f36107competently.impromptu().floatValue();
        int iIntValue = this.f36108dern.impromptu().intValue();
        com.airbnb.lottie.utils.attabal attabalVar = new com.airbnb.lottie.utils.attabal(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f36112wireman.impromptu().floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        attabalVar.apical(matrix);
        if (this.f36109impromptu == null) {
            this.f36109impromptu = new Matrix();
        }
        this.f36105attabal.f16120rotuma.taiyuan().invert(this.f36109impromptu);
        attabalVar.apical(this.f36109impromptu);
        return attabalVar;
    }

    public void wireman(com.airbnb.lottie.value.dern<Float> dernVar) {
        this.f36110marial.kowloon(dernVar);
    }
}
