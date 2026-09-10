package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.apical;
import androidx.work.impl.WorkDatabase;
import androidx.work.marial;
import diakinesis.dern;
import diakinesis.wireman;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ocellation.arytenoidectomy;
import overassessment.taiyuan;

/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements dern, overassessment.saneness {

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final String f14136preprohormone = apical.beachfront("SystemFgDispatcher");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final Map<String, arytenoidectomy> f14137adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public taiyuan f14138arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final Set<arytenoidectomy> f14139dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final wireman f14140gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final Map<String, marial> f14141graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Context f14142kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public String f14143molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final arugula.attabal f14144monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final Object f14145polloi = new Object();

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public saneness f14146rotuma;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SystemForegroundDispatcher.java */
    public class RunnableC0113attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ String f14147arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ WorkDatabase f14148kowloon;

        public RunnableC0113attabal(WorkDatabase workDatabase, String str) {
            this.f14148kowloon = workDatabase;
            this.f14147arytenoidectomy = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            arytenoidectomy arytenoidectomyVarCompetently = this.f14148kowloon.stratoscope().competently(this.f14147arytenoidectomy);
            if (arytenoidectomyVarCompetently == null || !arytenoidectomyVarCompetently.saneness()) {
                return;
            }
            synchronized (attabal.this.f14145polloi) {
                attabal.this.f14137adultoid.put(this.f14147arytenoidectomy, arytenoidectomyVarCompetently);
                attabal.this.f14139dovishness.add(arytenoidectomyVarCompetently);
                attabal attabalVar = attabal.this;
                attabalVar.f14140gintrap.wireman(attabalVar.f14139dovishness);
            }
        }
    }

    /* JADX INFO: compiled from: SystemForegroundDispatcher.java */
    public interface saneness {
        void attabal(int i, Notification notification);

        void dern(int i, int i2, Notification notification);

        void stop();

        void wireman(int i);
    }

    public attabal(Context context) {
        this.f14142kowloon = context;
        taiyuan taiyuanVarApical = taiyuan.apical(context);
        this.f14138arytenoidectomy = taiyuanVarApical;
        arugula.attabal attabalVarArytenoidectomy = taiyuanVarApical.arytenoidectomy();
        this.f14144monoploid = attabalVarArytenoidectomy;
        this.f14143molybdenite = null;
        this.f14141graveside = new LinkedHashMap();
        this.f14139dovishness = new HashSet();
        this.f14137adultoid = new HashMap();
        this.f14140gintrap = new wireman(this.f14142kowloon, attabalVarArytenoidectomy, this);
        this.f14138arytenoidectomy.impassible().dern(this);
    }

    public static Intent attabal(Context context, String str, marial marialVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", marialVar.dern());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", marialVar.attabal());
        intent.putExtra("KEY_NOTIFICATION", marialVar.saneness());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent beachfront(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public static Intent dern(Context context, String str, marial marialVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", marialVar.dern());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", marialVar.attabal());
        intent.putExtra("KEY_NOTIFICATION", marialVar.saneness());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public void apical() {
        this.f14146rotuma = null;
        synchronized (this.f14145polloi) {
            this.f14140gintrap.marial();
        }
        this.f14138arytenoidectomy.impassible().taiyuan(this);
    }

    public final void competently(Intent intent) {
        apical.dern().wireman(f14136preprohormone, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f14138arytenoidectomy.beachfront(UUID.fromString(stringExtra));
    }

    public void cutely(Intent intent) {
        apical.dern().wireman(f14136preprohormone, "Stopping foreground service", new Throwable[0]);
        saneness sanenessVar = this.f14146rotuma;
        if (sanenessVar != null) {
            sanenessVar.stop();
        }
    }

    public void formularize(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            taiyuan(intent);
            impromptu(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            impromptu(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            competently(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            cutely(intent);
        }
    }

    public void impassible(saneness sanenessVar) {
        if (this.f14146rotuma != null) {
            apical.dern().saneness(f14136preprohormone, "A callback already exists.", new Throwable[0]);
        } else {
            this.f14146rotuma = sanenessVar;
        }
    }

    public final void impromptu(Intent intent) {
        int iAttabal = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        apical.dern().attabal(f14136preprohormone, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f14146rotuma == null) {
            return;
        }
        this.f14141graveside.put(stringExtra, new marial(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f14143molybdenite)) {
            this.f14143molybdenite = stringExtra;
            this.f14146rotuma.dern(intExtra, intExtra2, notification);
            return;
        }
        this.f14146rotuma.attabal(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, marial>> it = this.f14141graveside.entrySet().iterator();
        while (it.hasNext()) {
            iAttabal |= it.next().getValue().attabal();
        }
        marial marialVar = this.f14141graveside.get(this.f14143molybdenite);
        if (marialVar != null) {
            this.f14146rotuma.dern(marialVar.dern(), iAttabal, marialVar.saneness());
        }
    }

    @Override // diakinesis.dern
    public void saneness(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            apical.dern().attabal(f14136preprohormone, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f14138arytenoidectomy.gintrap(str);
        }
    }

    public final void taiyuan(Intent intent) {
        apical.dern().wireman(f14136preprohormone, String.format("Started foreground service %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f14144monoploid.saneness(new RunnableC0113attabal(this.f14138arytenoidectomy.kowloon(), stringExtra));
    }

    @Override // overassessment.saneness
    public void wireman(String str, boolean z) {
        Map.Entry<String, marial> entry;
        synchronized (this.f14145polloi) {
            try {
                arytenoidectomy arytenoidectomyVarRemove = this.f14137adultoid.remove(str);
                if (arytenoidectomyVarRemove != null ? this.f14139dovishness.remove(arytenoidectomyVarRemove) : false) {
                    this.f14140gintrap.wireman(this.f14139dovishness);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        marial marialVarRemove = this.f14141graveside.remove(str);
        if (str.equals(this.f14143molybdenite) && this.f14141graveside.size() > 0) {
            Iterator<Map.Entry<String, marial>> it = this.f14141graveside.entrySet().iterator();
            Map.Entry<String, marial> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f14143molybdenite = entry.getKey();
            if (this.f14146rotuma != null) {
                marial value = entry.getValue();
                this.f14146rotuma.dern(value.dern(), value.attabal(), value.saneness());
                this.f14146rotuma.wireman(value.dern());
            }
        }
        saneness sanenessVar = this.f14146rotuma;
        if (marialVarRemove == null || sanenessVar == null) {
            return;
        }
        apical.dern().attabal(f14136preprohormone, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(marialVarRemove.dern()), str, Integer.valueOf(marialVarRemove.attabal())), new Throwable[0]);
        sanenessVar.wireman(marialVarRemove.dern());
    }

    @Override // diakinesis.dern
    public void marial(List<String> list) {
    }
}
