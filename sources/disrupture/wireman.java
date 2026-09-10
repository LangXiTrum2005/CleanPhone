package disrupture;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: NetworkConnectedController.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends dern<diakinesis.saneness> {
    public wireman(Context context, arugula.attabal attabalVar) {
        super(kabul.competently.dern(context, attabalVar).wireman());
    }

    @Override // disrupture.dern
    public boolean saneness(arytenoidectomy arytenoidectomyVar) {
        return arytenoidectomyVar.f34002cutely.saneness() == NetworkType.CONNECTED;
    }

    @Override // disrupture.dern
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public boolean dern(diakinesis.saneness sanenessVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (sanenessVar.attabal() && sanenessVar.wireman()) ? false : true;
        }
        return !sanenessVar.attabal();
    }
}
