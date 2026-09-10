package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.apical;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: ConstraintsCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f14096marial = apical.beachfront("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f14097attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f14098dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f14099saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final diakinesis.wireman f14100wireman;

    public saneness(Context context, int i, wireman wiremanVar) {
        this.f14097attabal = context;
        this.f14099saneness = i;
        this.f14098dern = wiremanVar;
        this.f14100wireman = new diakinesis.wireman(context, wiremanVar.beachfront(), null);
    }

    public void attabal() {
        List<arytenoidectomy> listWireman = this.f14098dern.competently().kowloon().stratoscope().wireman();
        ConstraintProxy.attabal(this.f14097attabal, listWireman);
        this.f14100wireman.wireman(listWireman);
        ArrayList arrayList = new ArrayList(listWireman.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (arytenoidectomy arytenoidectomyVar : listWireman) {
            String str = arytenoidectomyVar.f33999attabal;
            if (jCurrentTimeMillis >= arytenoidectomyVar.attabal() && (!arytenoidectomyVar.saneness() || this.f14100wireman.dern(str))) {
                arrayList.add(arytenoidectomyVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((arytenoidectomy) it.next()).f33999attabal;
            Intent intentSaneness = attabal.saneness(this.f14097attabal, str2);
            apical.dern().attabal(f14096marial, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            wireman wiremanVar = this.f14098dern;
            wiremanVar.apical(new wireman.saneness(wiremanVar, intentSaneness, this.f14099saneness));
        }
        this.f14100wireman.marial();
    }
}
