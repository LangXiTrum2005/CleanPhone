package inswinger;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: AnimatableGradientColorValue.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends arytenoidectomy<euhemerize.wireman, euhemerize.wireman> {
    public dern(List<com.airbnb.lottie.value.attabal<euhemerize.wireman>> list) {
        super(wireman(list));
    }

    public static com.airbnb.lottie.value.attabal<euhemerize.wireman> dern(com.airbnb.lottie.value.attabal<euhemerize.wireman> attabalVar) {
        euhemerize.wireman wiremanVar = attabalVar.f16256saneness;
        euhemerize.wireman wiremanVar2 = attabalVar.f16250dern;
        if (wiremanVar == null || wiremanVar2 == null || wiremanVar.marial().length == wiremanVar2.marial().length) {
            return attabalVar;
        }
        float[] fArrMarial = marial(wiremanVar.marial(), wiremanVar2.marial());
        return attabalVar.saneness(wiremanVar.saneness(fArrMarial), wiremanVar2.saneness(fArrMarial));
    }

    public static float[] marial(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    public static List<com.airbnb.lottie.value.attabal<euhemerize.wireman>> wireman(List<com.airbnb.lottie.value.attabal<euhemerize.wireman>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, dern(list.get(i)));
        }
        return list;
    }

    @Override // inswinger.arytenoidectomy, inswinger.kowloon
    public /* bridge */ /* synthetic */ boolean apical() {
        return super.apical();
    }

    @Override // inswinger.kowloon
    public redevelopment.attabal<euhemerize.wireman, euhemerize.wireman> attabal() {
        return new redevelopment.marial(this.f28883attabal);
    }

    @Override // inswinger.arytenoidectomy, inswinger.kowloon
    public /* bridge */ /* synthetic */ List saneness() {
        return super.saneness();
    }

    @Override // inswinger.arytenoidectomy
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
