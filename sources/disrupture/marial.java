package disrupture;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.apical;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: NetworkMeteredController.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends dern<diakinesis.saneness> {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f25359marial = apical.beachfront("NetworkMeteredCtrlr");

    public marial(Context context, arugula.attabal attabalVar) {
        super(kabul.competently.dern(context, attabalVar).wireman());
    }

    @Override // disrupture.dern
    public boolean saneness(arytenoidectomy arytenoidectomyVar) {
        return arytenoidectomyVar.f34002cutely.saneness() == NetworkType.METERED;
    }

    @Override // disrupture.dern
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public boolean dern(diakinesis.saneness sanenessVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (sanenessVar.attabal() && sanenessVar.saneness()) ? false : true;
        }
        apical.dern().attabal(f25359marial, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !sanenessVar.attabal();
    }
}
