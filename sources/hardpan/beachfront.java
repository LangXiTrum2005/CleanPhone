package hardpan;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.preprohormone;
import androidx.collection.splinterproof;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import monroe.cutely;
import monroe.taiyuan;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final preprohormone<String, Typeface> f27491attabal = new preprohormone<>(16);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ExecutorService f27493saneness = impromptu.attabal("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f27492dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final splinterproof<String, ArrayList<technofreak.saneness<marial>>> f27494wireman = new splinterproof<>();

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class attabal implements Callable<marial> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Context f27495arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ String f27496kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ hardpan.marial f27497monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ int f27498polloi;

        public attabal(String str, Context context, hardpan.marial marialVar, int i) {
            this.f27496kowloon = str;
            this.f27495arytenoidectomy = context;
            this.f27497monoploid = marialVar;
            this.f27498polloi = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public marial call() {
            return beachfront.dern(this.f27496kowloon, this.f27495arytenoidectomy, taiyuan.attabal(new Object[]{this.f27497monoploid}), this.f27498polloi);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class dern implements Callable<marial> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Context f27499arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ String f27500kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ List f27501monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ int f27502polloi;

        public dern(String str, Context context, List list, int i) {
            this.f27500kowloon = str;
            this.f27499arytenoidectomy = context;
            this.f27501monoploid = list;
            this.f27502polloi = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public marial call() {
            try {
                return beachfront.dern(this.f27500kowloon, this.f27499arytenoidectomy, this.f27501monoploid, this.f27502polloi);
            } catch (Throwable unused) {
                return new marial(-3);
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class saneness implements technofreak.saneness<marial> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ hardpan.attabal f27505attabal;

        public saneness(hardpan.attabal attabalVar) {
            this.f27505attabal = attabalVar;
        }

        @Override // technofreak.saneness
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public void accept(marial marialVar) {
            if (marialVar == null) {
                marialVar = new marial(-3);
            }
            this.f27505attabal.saneness(marialVar);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public class wireman implements technofreak.saneness<marial> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f27506attabal;

        public wireman(String str) {
            this.f27506attabal = str;
        }

        @Override // technofreak.saneness
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public void accept(marial marialVar) {
            synchronized (beachfront.f27492dern) {
                try {
                    splinterproof<String, ArrayList<technofreak.saneness<marial>>> splinterproofVar = beachfront.f27494wireman;
                    ArrayList<technofreak.saneness<marial>> arrayList = splinterproofVar.get(this.f27506attabal);
                    if (arrayList == null) {
                        return;
                    }
                    splinterproofVar.remove(this.f27506attabal);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(marialVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String attabal(List<hardpan.marial> list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).wireman());
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static marial dern(String str, Context context, List<hardpan.marial> list, int i) {
        ferrovanadium.attabal.attabal("getFontSync");
        try {
            preprohormone<String, Typeface> preprohormoneVar = f27491attabal;
            Typeface typeface = preprohormoneVar.get(str);
            if (typeface != null) {
                marial marialVar = new marial(typeface);
                ferrovanadium.attabal.saneness();
                return marialVar;
            }
            try {
                competently.attabal attabalVarMarial = hardpan.wireman.marial(context, list, null);
                int iSaneness = saneness(attabalVarMarial);
                if (iSaneness != 0) {
                    marial marialVar2 = new marial(iSaneness);
                    ferrovanadium.attabal.saneness();
                    return marialVar2;
                }
                Typeface typefaceSaneness = (!attabalVarMarial.beachfront() || Build.VERSION.SDK_INT < 29) ? cutely.saneness(context, null, attabalVarMarial.dern(), i) : cutely.dern(context, null, attabalVarMarial.wireman(), i);
                if (typefaceSaneness == null) {
                    marial marialVar3 = new marial(-3);
                    ferrovanadium.attabal.saneness();
                    return marialVar3;
                }
                preprohormoneVar.put(str, typefaceSaneness);
                marial marialVar4 = new marial(typefaceSaneness);
                ferrovanadium.attabal.saneness();
                return marialVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                marial marialVar5 = new marial(-1);
                ferrovanadium.attabal.saneness();
                return marialVar5;
            }
        } catch (Throwable th) {
            ferrovanadium.attabal.saneness();
            throw th;
        }
    }

    public static Typeface marial(Context context, hardpan.marial marialVar, hardpan.attabal attabalVar, int i, int i2) {
        String strAttabal = attabal(taiyuan.attabal(new Object[]{marialVar}), i);
        Typeface typeface = f27491attabal.get(strAttabal);
        if (typeface != null) {
            attabalVar.saneness(new marial(typeface));
            return typeface;
        }
        if (i2 == -1) {
            marial marialVarDern = dern(strAttabal, context, taiyuan.attabal(new Object[]{marialVar}), i);
            attabalVar.saneness(marialVarDern);
            return marialVarDern.f27503attabal;
        }
        try {
            marial marialVar2 = (marial) impromptu.wireman(f27493saneness, new attabal(strAttabal, context, marialVar, i), i2);
            attabalVar.saneness(marialVar2);
            return marialVar2.f27503attabal;
        } catch (InterruptedException unused) {
            attabalVar.saneness(new marial(-3));
            return null;
        }
    }

    public static int saneness(competently.attabal attabalVar) {
        int i = 1;
        if (attabalVar.marial() != 0) {
            return attabalVar.marial() != 1 ? -3 : -2;
        }
        competently.saneness[] sanenessVarArrDern = attabalVar.dern();
        if (sanenessVarArrDern != null && sanenessVarArrDern.length != 0) {
            i = 0;
            for (competently.saneness sanenessVar : sanenessVarArrDern) {
                int iSaneness = sanenessVar.saneness();
                if (iSaneness != 0) {
                    if (iSaneness < 0) {
                        return -3;
                    }
                    return iSaneness;
                }
            }
        }
        return i;
    }

    public static Typeface wireman(Context context, List<hardpan.marial> list, int i, Executor executor, hardpan.attabal attabalVar) {
        String strAttabal = attabal(list, i);
        Typeface typeface = f27491attabal.get(strAttabal);
        if (typeface != null) {
            attabalVar.saneness(new marial(typeface));
            return typeface;
        }
        saneness sanenessVar = new saneness(attabalVar);
        synchronized (f27492dern) {
            try {
                splinterproof<String, ArrayList<technofreak.saneness<marial>>> splinterproofVar = f27494wireman;
                ArrayList<technofreak.saneness<marial>> arrayList = splinterproofVar.get(strAttabal);
                if (arrayList != null) {
                    arrayList.add(sanenessVar);
                    return null;
                }
                ArrayList<technofreak.saneness<marial>> arrayList2 = new ArrayList<>();
                arrayList2.add(sanenessVar);
                splinterproofVar.put(strAttabal, arrayList2);
                dern dernVar = new dern(strAttabal, context, list, i);
                if (executor == null) {
                    executor = f27493saneness;
                }
                impromptu.dern(executor, dernVar, new wireman(strAttabal));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public static final class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Typeface f27503attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f27504saneness;

        public marial(int i) {
            this.f27503attabal = null;
            this.f27504saneness = i;
        }

        public boolean attabal() {
            return this.f27504saneness == 0;
        }

        public marial(Typeface typeface) {
            this.f27503attabal = typeface;
            this.f27504saneness = 0;
        }
    }
}
