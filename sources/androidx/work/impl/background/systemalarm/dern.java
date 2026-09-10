package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.apical;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Collections;
import java.util.List;
import ocellation.arytenoidectomy;
import talweg.kowloon;

/* JADX INFO: compiled from: DelayMetCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class dern implements diakinesis.dern, overassessment.saneness, kowloon.saneness {

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final String f14086rotuma = apical.beachfront("DelayMetCommandHandler");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f14088arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public PowerManager.WakeLock f14089dovishness;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f14092kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final diakinesis.wireman f14093molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final String f14094monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final wireman f14095polloi;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f14090gintrap = false;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f14087adultoid = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final Object f14091graveside = new Object();

    public dern(Context context, int i, String str, wireman wiremanVar) {
        this.f14092kowloon = context;
        this.f14088arytenoidectomy = i;
        this.f14095polloi = wiremanVar;
        this.f14094monoploid = str;
        this.f14093molybdenite = new diakinesis.wireman(context, wiremanVar.beachfront(), this);
    }

    @Override // talweg.kowloon.saneness
    public void attabal(String str) {
        apical.dern().attabal(f14086rotuma, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        competently();
    }

    public void beachfront() {
        this.f14089dovishness = talweg.apical.saneness(this.f14092kowloon, String.format("%s (%s)", this.f14094monoploid, Integer.valueOf(this.f14088arytenoidectomy)));
        apical apicalVarDern = apical.dern();
        String str = f14086rotuma;
        apicalVarDern.attabal(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f14089dovishness, this.f14094monoploid), new Throwable[0]);
        this.f14089dovishness.acquire();
        arytenoidectomy arytenoidectomyVarCompetently = this.f14095polloi.competently().kowloon().stratoscope().competently(this.f14094monoploid);
        if (arytenoidectomyVarCompetently == null) {
            competently();
            return;
        }
        boolean zSaneness = arytenoidectomyVarCompetently.saneness();
        this.f14090gintrap = zSaneness;
        if (zSaneness) {
            this.f14093molybdenite.wireman(Collections.singletonList(arytenoidectomyVarCompetently));
        } else {
            apical.dern().attabal(str, String.format("No constraints for %s", this.f14094monoploid), new Throwable[0]);
            marial(Collections.singletonList(this.f14094monoploid));
        }
    }

    public final void competently() {
        synchronized (this.f14091graveside) {
            try {
                if (this.f14087adultoid < 2) {
                    this.f14087adultoid = 2;
                    apical apicalVarDern = apical.dern();
                    String str = f14086rotuma;
                    apicalVarDern.attabal(str, String.format("Stopping work for WorkSpec %s", this.f14094monoploid), new Throwable[0]);
                    Intent intentBeachfront = attabal.beachfront(this.f14092kowloon, this.f14094monoploid);
                    wireman wiremanVar = this.f14095polloi;
                    wiremanVar.apical(new wireman.saneness(wiremanVar, intentBeachfront, this.f14088arytenoidectomy));
                    if (this.f14095polloi.marial().competently(this.f14094monoploid)) {
                        apical.dern().attabal(str, String.format("WorkSpec %s needs to be rescheduled", this.f14094monoploid), new Throwable[0]);
                        Intent intentMarial = attabal.marial(this.f14092kowloon, this.f14094monoploid);
                        wireman wiremanVar2 = this.f14095polloi;
                        wiremanVar2.apical(new wireman.saneness(wiremanVar2, intentMarial, this.f14088arytenoidectomy));
                    } else {
                        apical.dern().attabal(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f14094monoploid), new Throwable[0]);
                    }
                } else {
                    apical.dern().attabal(f14086rotuma, String.format("Already stopped work for %s", this.f14094monoploid), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dern() {
        synchronized (this.f14091graveside) {
            try {
                this.f14093molybdenite.marial();
                this.f14095polloi.impromptu().dern(this.f14094monoploid);
                PowerManager.WakeLock wakeLock = this.f14089dovishness;
                if (wakeLock != null && wakeLock.isHeld()) {
                    apical.dern().attabal(f14086rotuma, String.format("Releasing wakelock %s for WorkSpec %s", this.f14089dovishness, this.f14094monoploid), new Throwable[0]);
                    this.f14089dovishness.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // diakinesis.dern
    public void marial(List<String> list) {
        if (list.contains(this.f14094monoploid)) {
            synchronized (this.f14091graveside) {
                try {
                    if (this.f14087adultoid == 0) {
                        this.f14087adultoid = 1;
                        apical.dern().attabal(f14086rotuma, String.format("onAllConstraintsMet for %s", this.f14094monoploid), new Throwable[0]);
                        if (this.f14095polloi.marial().cutely(this.f14094monoploid)) {
                            this.f14095polloi.impromptu().saneness(this.f14094monoploid, TTAdConstant.AD_MAX_EVENT_TIME, this);
                        } else {
                            dern();
                        }
                    } else {
                        apical.dern().attabal(f14086rotuma, String.format("Already started work for %s", this.f14094monoploid), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // diakinesis.dern
    public void saneness(List<String> list) {
        competently();
    }

    @Override // overassessment.saneness
    public void wireman(String str, boolean z) {
        apical.dern().attabal(f14086rotuma, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        dern();
        if (z) {
            Intent intentMarial = attabal.marial(this.f14092kowloon, this.f14094monoploid);
            wireman wiremanVar = this.f14095polloi;
            wiremanVar.apical(new wireman.saneness(wiremanVar, intentMarial, this.f14088arytenoidectomy));
        }
        if (this.f14090gintrap) {
            Intent intentAttabal = attabal.attabal(this.f14092kowloon);
            wireman wiremanVar2 = this.f14095polloi;
            wiremanVar2.apical(new wireman.saneness(wiremanVar2, intentAttabal, this.f14088arytenoidectomy));
        }
    }
}
