package hypokinesis;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import decarock.cuirassed;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import nomenclative.dern;
import nomenclative.saneness;

/* JADX INFO: compiled from: AppInfoTableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends dern {
    public static Metadata dern(cuirassed cuirassedVar) {
        cuirassedVar.polloi(12);
        int iWireman = (cuirassedVar.wireman() + cuirassedVar.impromptu(12)) - 4;
        cuirassedVar.polloi(44);
        cuirassedVar.molybdenite(cuirassedVar.impromptu(12));
        cuirassedVar.polloi(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strFormularize = null;
            if (cuirassedVar.wireman() >= iWireman) {
                break;
            }
            cuirassedVar.polloi(48);
            int iImpromptu = cuirassedVar.impromptu(8);
            cuirassedVar.polloi(4);
            int iWireman2 = cuirassedVar.wireman() + cuirassedVar.impromptu(12);
            String strFormularize2 = null;
            while (cuirassedVar.wireman() < iWireman2) {
                int iImpromptu2 = cuirassedVar.impromptu(8);
                int iImpromptu3 = cuirassedVar.impromptu(8);
                int iWireman3 = cuirassedVar.wireman() + iImpromptu3;
                if (iImpromptu2 == 2) {
                    int iImpromptu4 = cuirassedVar.impromptu(16);
                    cuirassedVar.polloi(8);
                    if (iImpromptu4 == 3) {
                        while (cuirassedVar.wireman() < iWireman3) {
                            strFormularize = cuirassedVar.formularize(cuirassedVar.impromptu(8), com.google.common.base.dern.f21532attabal);
                            int iImpromptu5 = cuirassedVar.impromptu(8);
                            for (int i = 0; i < iImpromptu5; i++) {
                                cuirassedVar.molybdenite(cuirassedVar.impromptu(8));
                            }
                        }
                    }
                } else if (iImpromptu2 == 21) {
                    strFormularize2 = cuirassedVar.formularize(iImpromptu3, com.google.common.base.dern.f21532attabal);
                }
                cuirassedVar.arytenoidectomy(iWireman3 * 8);
            }
            cuirassedVar.arytenoidectomy(iWireman2 * 8);
            if (strFormularize != null && strFormularize2 != null) {
                arrayList.add(new AppInfoTable(iImpromptu, strFormularize + strFormularize2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // nomenclative.dern
    public Metadata saneness(saneness sanenessVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return dern(new cuirassed(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
