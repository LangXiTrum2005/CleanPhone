package rotissomat;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* JADX INFO: compiled from: CircleShapeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36834attabal = JsonReader.attabal.attabal("nm", TtmlNode.TAG_P, "s", "hd", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);

    public static euhemerize.saneness attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zArytenoidectomy = false;
        String strCuirassed = null;
        inswinger.kowloon<PointF, PointF> kowloonVarSaneness = null;
        inswinger.beachfront beachfrontVarTaiyuan = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36834attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                kowloonVarSaneness = attabal.saneness(jsonReader, impromptuVar);
            } else if (iPolder == 2) {
                beachfrontVarTaiyuan = wireman.taiyuan(jsonReader, impromptuVar);
            } else if (iPolder == 3) {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            } else if (iPolder != 4) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                z = jsonReader.dovishness() == 3;
            }
        }
        return new euhemerize.saneness(strCuirassed, kowloonVarSaneness, beachfrontVarTaiyuan, z, zArytenoidectomy);
    }
}
