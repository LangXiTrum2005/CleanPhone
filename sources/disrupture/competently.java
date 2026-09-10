package disrupture;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: NetworkUnmeteredController.java */
/* JADX INFO: loaded from: classes.dex */
public class competently extends dern<diakinesis.saneness> {
    public competently(Context context, arugula.attabal attabalVar) {
        super(kabul.competently.dern(context, attabalVar).wireman());
    }

    @Override // disrupture.dern
    public boolean saneness(arytenoidectomy arytenoidectomyVar) {
        if (arytenoidectomyVar.f34002cutely.saneness() != NetworkType.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && arytenoidectomyVar.f34002cutely.saneness() == NetworkType.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // disrupture.dern
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public boolean dern(diakinesis.saneness sanenessVar) {
        return !sanenessVar.attabal() || sanenessVar.saneness();
    }
}
