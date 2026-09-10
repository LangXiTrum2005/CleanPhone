package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: KeyframesParser.java */
/* JADX INFO: loaded from: classes.dex */
public class adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static JsonReader.attabal f36823attabal = JsonReader.attabal.attabal(CampaignEx.JSON_KEY_AD_K);

    public static <T> List<com.airbnb.lottie.value.attabal<T>> attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar, float f, saran<T> saranVar, boolean z) throws IOException {
        JsonReader jsonReader2;
        com.airbnb.lottie.impromptu impromptuVar2;
        float f2;
        saran<T> saranVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.restrictive() == JsonReader.Token.STRING) {
            impromptuVar.attabal("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.dern();
        while (jsonReader.formularize()) {
            if (jsonReader.polder(f36823attabal) != 0) {
                jsonReader.saran();
            } else if (jsonReader.restrictive() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.saneness();
                if (jsonReader.restrictive() == JsonReader.Token.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.airbnb.lottie.impromptu impromptuVar3 = impromptuVar;
                    float f3 = f;
                    saran<T> saranVar3 = saranVar;
                    boolean z3 = z;
                    com.airbnb.lottie.value.attabal attabalVarDern = graveside.dern(jsonReader3, impromptuVar3, f3, saranVar3, false, z3);
                    jsonReader2 = jsonReader3;
                    impromptuVar2 = impromptuVar3;
                    f2 = f3;
                    saranVar2 = saranVar3;
                    z2 = z3;
                    arrayList.add(attabalVarDern);
                } else {
                    jsonReader2 = jsonReader;
                    impromptuVar2 = impromptuVar;
                    f2 = f;
                    saranVar2 = saranVar;
                    z2 = z;
                    while (jsonReader2.formularize()) {
                        arrayList.add(graveside.dern(jsonReader2, impromptuVar2, f2, saranVar2, true, z2));
                    }
                }
                jsonReader2.marial();
                jsonReader = jsonReader2;
                impromptuVar = impromptuVar2;
                f = f2;
                saranVar = saranVar2;
                z = z2;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(graveside.dern(jsonReader4, impromptuVar, f, saranVar, false, z));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.cutely();
        saneness(arrayList);
        return arrayList;
    }

    public static <T> void saneness(List<? extends com.airbnb.lottie.value.attabal<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.airbnb.lottie.value.attabal<T> attabalVar = list.get(i2);
            i2++;
            com.airbnb.lottie.value.attabal<T> attabalVar2 = list.get(i2);
            attabalVar.f16253impromptu = Float.valueOf(attabalVar2.f16248competently);
            if (attabalVar.f16250dern == null && (t = attabalVar2.f16256saneness) != null) {
                attabalVar.f16250dern = t;
                if (attabalVar instanceof redevelopment.taiyuan) {
                    ((redevelopment.taiyuan) attabalVar).cutely();
                }
            }
        }
        com.airbnb.lottie.value.attabal<T> attabalVar3 = list.get(i);
        if ((attabalVar3.f16256saneness == null || attabalVar3.f16250dern == null) && list.size() > 1) {
            list.remove(attabalVar3);
        }
    }
}
