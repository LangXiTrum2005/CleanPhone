package umbriferous;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: CrashlyticsReportDataCapture.java */
/* JADX INFO: loaded from: classes3.dex */
public class preprohormone {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Map<String, Integer> f39182competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final String f39183impromptu;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f39184attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final gelandelaufer.cutely f39185beachfront = gelandelaufer.cutely.f26651attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f39186dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final reeve.impromptu f39187marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kattegat f39188saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final yod.wireman f39189wireman;

    static {
        HashMap map = new HashMap();
        f39182competently = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f39183impromptu = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.4.2");
    }

    public preprohormone(Context context, kattegat kattegatVar, attabal attabalVar, yod.wireman wiremanVar, reeve.impromptu impromptuVar) {
        this.f39184attabal = context;
        this.f39188saneness = kattegatVar;
        this.f39186dern = attabalVar;
        this.f39189wireman = wiremanVar;
        this.f39187marial = impromptuVar;
    }

    public static long beachfront(long j) {
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    public static int competently() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f39182competently.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final amount.sealless.marial.dern adultoid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iCompetently = competently();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jSaneness = CommonUtils.saneness(this.f39184attabal);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zRotuma = CommonUtils.rotuma();
        int iFormularize = CommonUtils.formularize();
        String str = Build.MANUFACTURER;
        return amount.sealless.marial.dern.attabal().saneness(iCompetently).beachfront(Build.MODEL).dern(iAvailableProcessors).impromptu(jSaneness).wireman(blockCount).taiyuan(zRotuma).cutely(iFormularize).marial(str).competently(Build.PRODUCT).attabal();
    }

    public final amount.sealless.marial.wireman.attabal apical(int i, yod.marial marialVar, Thread thread, int i2, int i3, boolean z) {
        Boolean boolValueOf;
        amount.sealless.marial.wireman.attabal.dern dernVarMarial = this.f39185beachfront.marial(this.f39184attabal);
        if (dernVarMarial.saneness() > 0) {
            boolValueOf = Boolean.valueOf(dernVarMarial.saneness() != 100);
        } else {
            boolValueOf = null;
        }
        return amount.sealless.marial.wireman.attabal.attabal().dern(boolValueOf).wireman(dernVarMarial).saneness(this.f39185beachfront.wireman(this.f39184attabal)).impromptu(i).beachfront(arytenoidectomy(marialVar, thread, i2, i3, z)).attabal();
    }

    public final amount.sealless.marial.wireman.attabal.saneness arytenoidectomy(yod.marial marialVar, Thread thread, int i, int i2, boolean z) {
        return amount.sealless.marial.wireman.attabal.saneness.attabal().beachfront(cord(marialVar, thread, i, z)).wireman(impassible(marialVar, i, i2)).marial(gintrap()).dern(taiyuan()).attabal();
    }

    public final amount.sealless.attabal attabal(amount.sealless.attabal attabalVar) {
        List<amount.sealless.attabal.AbstractC0007attabal> listUnmodifiableList;
        if (!this.f39187marial.saneness().f36185saneness.f36188dern || this.f39186dern.f39074dern.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (beachfront beachfrontVar : this.f39186dern.f39074dern) {
                arrayList.add(amount.sealless.attabal.AbstractC0007attabal.attabal().wireman(beachfrontVar.dern()).saneness(beachfrontVar.attabal()).dern(beachfrontVar.saneness()).attabal());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return amount.sealless.attabal.attabal().dern(attabalVar.dern()).marial(attabalVar.marial()).competently(attabalVar.competently()).taiyuan(attabalVar.taiyuan()).wireman(attabalVar.wireman()).beachfront(attabalVar.beachfront()).impromptu(attabalVar.impromptu()).cutely(attabalVar.cutely()).saneness(listUnmodifiableList).attabal();
    }

    public final List<amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial> cord(yod.marial marialVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(preprohormone(thread, marialVar.f39741dern, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(rotuma(key, this.f39189wireman.attabal(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final amount.sealless.marial.wireman.attabal.dern cuirassed(amount.sealless.attabal attabalVar) {
        return this.f39185beachfront.attabal(attabalVar.marial(), attabalVar.wireman(), attabalVar.dern());
    }

    public final amount.sealless.marial.wireman.attabal cutely(int i, amount.sealless.attabal attabalVar) {
        return amount.sealless.marial.wireman.attabal.attabal().dern(Boolean.valueOf(attabalVar.dern() != 100)).wireman(cuirassed(attabalVar)).impromptu(i).beachfront(kowloon(attabalVar)).attabal();
    }

    public amount.sealless.marial.wireman dern(amount.sealless.attabal attabalVar) {
        int i = this.f39184attabal.getResources().getConfiguration().orientation;
        return amount.sealless.marial.wireman.attabal().competently("anr").beachfront(attabalVar.taiyuan()).saneness(cutely(i, attabal(attabalVar))).dern(formularize(i)).attabal();
    }

    public final amount.sealless.marial.AbstractC0010marial dovishness() {
        return amount.sealless.marial.AbstractC0010marial.attabal().wireman(3).marial(Build.VERSION.RELEASE).saneness(Build.VERSION.CODENAME).dern(CommonUtils.preprohormone()).attabal();
    }

    public final amount.sealless.marial.wireman.dern formularize(int i) {
        marial marialVarAttabal = marial.attabal(this.f39184attabal);
        Float fSaneness = marialVarAttabal.saneness();
        Double dValueOf = fSaneness != null ? Double.valueOf(fSaneness.doubleValue()) : null;
        int iDern = marialVarAttabal.dern();
        boolean zTriweekly = CommonUtils.triweekly(this.f39184attabal);
        return amount.sealless.marial.wireman.dern.attabal().saneness(dValueOf).dern(iDern).beachfront(zTriweekly).marial(i).competently(beachfront(CommonUtils.saneness(this.f39184attabal) - CommonUtils.attabal(this.f39184attabal))).wireman(CommonUtils.dern(Environment.getDataDirectory().getPath())).attabal();
    }

    public final amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman gintrap() {
        return amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.attabal().wireman("0").dern("0").saneness(0L).attabal();
    }

    public final amount.sealless.marial graveside(String str, long j) {
        return amount.sealless.marial.attabal().impassible(j).cutely(str).impromptu(f39183impromptu).saneness(molybdenite()).formularize(dovishness()).marial(adultoid()).taiyuan(3).attabal();
    }

    public final amount.sealless.marial.wireman.attabal.saneness.dern impassible(yod.marial marialVar, int i, int i2) {
        return triweekly(marialVar, i, i2, 0);
    }

    public final amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal impromptu() {
        return amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.attabal().saneness(0L).wireman(0L).dern(this.f39186dern.f39076marial).marial(this.f39186dern.f39077saneness).attabal();
    }

    public final amount.sealless.marial.wireman.attabal.saneness kowloon(amount.sealless.attabal attabalVar) {
        return amount.sealless.marial.wireman.attabal.saneness.attabal().saneness(attabalVar).marial(gintrap()).dern(taiyuan()).attabal();
    }

    public amount.sealless marial(String str, long j) {
        return saneness().impassible(graveside(str, j)).attabal();
    }

    public final amount.sealless.marial.attabal molybdenite() {
        return amount.sealless.marial.attabal.attabal().marial(this.f39188saneness.beachfront()).competently(this.f39186dern.f39072beachfront).wireman(this.f39186dern.f39073competently).beachfront(this.f39188saneness.attabal().dern()).saneness(this.f39186dern.f39075impromptu.wireman()).dern(this.f39186dern.f39075impromptu.marial()).attabal();
    }

    public final amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness monoploid(StackTraceElement stackTraceElement, amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal abstractC0019attabal) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0019attabal.marial(jMax).beachfront(str).saneness(fileName).wireman(lineNumber).attabal();
    }

    public final List<amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> polloi(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(monoploid(stackTraceElement, amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.attabal().dern(i)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial preprohormone(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.attabal().wireman(thread.getName()).dern(i).saneness(polloi(stackTraceElementArr, i)).attabal();
    }

    public final amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial rotuma(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return preprohormone(thread, stackTraceElementArr, 0);
    }

    public final amount.sealless.saneness saneness() {
        return amount.sealless.saneness().formularize("19.4.2").impromptu(this.f39186dern.f39071attabal).taiyuan(this.f39188saneness.attabal().dern()).competently(this.f39188saneness.attabal().marial()).beachfront(this.f39188saneness.attabal().wireman()).wireman(this.f39186dern.f39072beachfront).marial(this.f39186dern.f39073competently).apical(4);
    }

    public final List<amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal> taiyuan() {
        return Collections.singletonList(impromptu());
    }

    public final amount.sealless.marial.wireman.attabal.saneness.dern triweekly(yod.marial marialVar, int i, int i2, int i3) {
        String str = marialVar.f39742saneness;
        String str2 = marialVar.f39740attabal;
        StackTraceElement[] stackTraceElementArr = marialVar.f39741dern;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        yod.marial marialVar2 = marialVar.f39743wireman;
        if (i3 >= i2) {
            yod.marial marialVar3 = marialVar2;
            while (marialVar3 != null) {
                marialVar3 = marialVar3.f39743wireman;
                i4++;
            }
        }
        amount.sealless.marial.wireman.attabal.saneness.dern.AbstractC0015attabal abstractC0015attabalWireman = amount.sealless.marial.wireman.attabal.saneness.dern.attabal().beachfront(str).marial(str2).dern(polloi(stackTraceElementArr, i)).wireman(i4);
        if (marialVar2 != null && i4 == 0) {
            abstractC0015attabalWireman.saneness(triweekly(marialVar2, i, i2, i3 + 1));
        }
        return abstractC0015attabalWireman.attabal();
    }

    public amount.sealless.marial.wireman wireman(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f39184attabal.getResources().getConfiguration().orientation;
        return amount.sealless.marial.wireman.attabal().competently(str).beachfront(j).saneness(apical(i3, yod.marial.attabal(th, this.f39189wireman), thread, i, i2, z)).dern(formularize(i3)).attabal();
    }
}
