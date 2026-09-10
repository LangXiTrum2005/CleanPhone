package spissatus;

import amount.sealless;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import nidicolous.cutely;
import reeve.impromptu;
import rollout.kowloon;
import umbriferous.cord;
import umbriferous.formularize;

/* JADX INFO: compiled from: CrashlyticsReportPersistence.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AtomicInteger f38048attabal = new AtomicInteger(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impromptu f38049dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f38050saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final formularize f38051wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Charset f38046marial = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f38043beachfront = 15;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final cutely f38044competently = new cutely();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Comparator<? super File> f38045impromptu = new Comparator() { // from class: spissatus.attabal
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final FilenameFilter f38047taiyuan = new FilenameFilter() { // from class: spissatus.saneness
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(NotificationCompat.CATEGORY_EVENT);
        }
    };

    public marial(competently competentlyVar, impromptu impromptuVar, formularize formularizeVar) {
        this.f38050saneness = competentlyVar;
        this.f38049dern = impromptuVar;
        this.f38051wireman = formularizeVar;
    }

    public static int beachfront(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                break;
            }
            competently.adultoid(file);
            size--;
        }
        return size;
    }

    public static int dovishness(File file, File file2) {
        return kowloon(file.getName()).compareTo(kowloon(file2.getName()));
    }

    public static boolean graveside(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
    }

    public static String impassible(int i, boolean z) {
        return NotificationCompat.CATEGORY_EVENT + String.format(Locale.US, "%010d", Integer.valueOf(i)) + (z ? "_" : "");
    }

    public static long impromptu(long j) {
        return j * 1000;
    }

    public static String kowloon(String str) {
        return str.substring(0, f38043beachfront);
    }

    public static boolean molybdenite(String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && str.endsWith("_");
    }

    public static void oilcan(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f38046marial);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String preprohormone(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f38046marial);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void yemenite(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f38046marial);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(impromptu(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public List<cord> adultoid() {
        List<File> listTriweekly = triweekly();
        ArrayList arrayList = new ArrayList();
        for (File file : listTriweekly) {
            try {
                arrayList.add(cord.attabal(f38044competently.seminary(preprohormone(file)), file.getName(), file));
            } catch (IOException e) {
                gelandelaufer.competently.beachfront().formularize("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    public void apical(String str, long j) {
        for (String str2 : marial(str)) {
            gelandelaufer.competently.beachfront().taiyuan("Finalizing report for session " + str2);
            cuirassed(str2, j);
            this.f38050saneness.marial(str2);
        }
        competently();
    }

    public SortedSet<String> arytenoidectomy() {
        return new TreeSet(this.f38050saneness.beachfront()).descendingSet();
    }

    public final void competently() {
        int i = this.f38049dern.saneness().f36179attabal.f36191saneness;
        List<File> listTriweekly = triweekly();
        int size = listTriweekly.size();
        if (size <= i) {
            return;
        }
        Iterator<File> it = listTriweekly.subList(i, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public final void cord(File file, sealless.wireman wiremanVar, String str, sealless.attabal attabalVar) {
        String strWireman = this.f38051wireman.wireman(str);
        try {
            cutely cutelyVar = f38044competently;
            oilcan(this.f38050saneness.taiyuan(str), cutelyVar.grimness(cutelyVar.seminary(preprohormone(file)).adultoid(wiremanVar).monoploid(attabalVar).arytenoidectomy(strWireman)));
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().formularize("Could not synthesize final native report file for " + file, e);
        }
    }

    public final void cuirassed(String str, long j) {
        boolean z;
        List<File> listPolloi = this.f38050saneness.polloi(str, f38047taiyuan);
        if (listPolloi.isEmpty()) {
            gelandelaufer.competently.beachfront().taiyuan("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listPolloi);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = listPolloi.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f38044competently.cutely(preprohormone(next)));
                    if (z || molybdenite(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    gelandelaufer.competently.beachfront().formularize("Could not add event to report for " + next, e);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            stratoscope(this.f38050saneness.monoploid(str, "report"), arrayList, j, z, kowloon.apical(str, this.f38050saneness), this.f38051wireman.wireman(str));
        } else {
            gelandelaufer.competently.beachfront().apical("Could not parse event files for session " + str);
        }
    }

    public final void cutely(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void formularize(String str, sealless.wireman wiremanVar, sealless.attabal attabalVar) {
        File fileMonoploid = this.f38050saneness.monoploid(str, "report");
        gelandelaufer.competently.beachfront().saneness("Writing native session report for " + str + " to file: " + fileMonoploid);
        cord(fileMonoploid, wiremanVar, str, attabalVar);
    }

    public void gintrap(sealless.marial.wireman wiremanVar, String str, boolean z) {
        int i = this.f38049dern.saneness().f36179attabal.f36190attabal;
        try {
            oilcan(this.f38050saneness.monoploid(str, impassible(this.f38048attabal.getAndIncrement(), z)), f38044competently.apical(wiremanVar));
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().formularize("Could not persist event for session " + str, e);
        }
        trm(str, i);
    }

    public final SortedSet<String> marial(String str) {
        this.f38050saneness.wireman();
        SortedSet<String> sortedSetArytenoidectomy = arytenoidectomy();
        if (str != null) {
            sortedSetArytenoidectomy.remove(str);
        }
        if (sortedSetArytenoidectomy.size() > 8) {
            while (sortedSetArytenoidectomy.size() > 8) {
                String strLast = sortedSetArytenoidectomy.last();
                gelandelaufer.competently.beachfront().saneness("Removing session over cap: " + strLast);
                this.f38050saneness.marial(strLast);
                sortedSetArytenoidectomy.remove(strLast);
            }
        }
        return sortedSetArytenoidectomy;
    }

    public long monoploid(String str) {
        return this.f38050saneness.monoploid(str, "start-time").lastModified();
    }

    public boolean polloi() {
        return (this.f38050saneness.kowloon().isEmpty() && this.f38050saneness.impassible().isEmpty() && this.f38050saneness.cutely().isEmpty()) ? false : true;
    }

    public void rotuma(sealless seallessVar) {
        sealless.marial marialVarTriweekly = seallessVar.triweekly();
        if (marialVarTriweekly == null) {
            gelandelaufer.competently.beachfront().saneness("Could not get session for report");
            return;
        }
        String strTaiyuan = marialVarTriweekly.taiyuan();
        try {
            oilcan(this.f38050saneness.monoploid(strTaiyuan, "report"), f38044competently.grimness(seallessVar));
            yemenite(this.f38050saneness.monoploid(strTaiyuan, "start-time"), "", marialVarTriweekly.formularize());
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().dern("Could not persist report for session " + strTaiyuan, e);
        }
    }

    public final void stratoscope(File file, List<sealless.marial.wireman> list, long j, boolean z, String str, String str2) {
        try {
            cutely cutelyVar = f38044competently;
            sealless seallessVarPolloi = cutelyVar.seminary(preprohormone(file)).dovishness(j, z, str).arytenoidectomy(str2).polloi(list);
            sealless.marial marialVarTriweekly = seallessVarPolloi.triweekly();
            if (marialVarTriweekly == null) {
                return;
            }
            gelandelaufer.competently.beachfront().saneness("appQualitySessionId: " + str2);
            oilcan(z ? this.f38050saneness.formularize(marialVarTriweekly.taiyuan()) : this.f38050saneness.triweekly(marialVarTriweekly.taiyuan()), cutelyVar.grimness(seallessVarPolloi));
        } catch (IOException e) {
            gelandelaufer.competently.beachfront().formularize("Could not synthesize final report file for " + file, e);
        }
    }

    public void taiyuan() {
        cutely(this.f38050saneness.kowloon());
        cutely(this.f38050saneness.impassible());
        cutely(this.f38050saneness.cutely());
    }

    public final List<File> triweekly() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f38050saneness.impassible());
        arrayList.addAll(this.f38050saneness.cutely());
        Comparator<? super File> comparator = f38045impromptu;
        Collections.sort(arrayList, comparator);
        List<File> listKowloon = this.f38050saneness.kowloon();
        Collections.sort(listKowloon, comparator);
        arrayList.addAll(listKowloon);
        return arrayList;
    }

    public final int trm(String str, int i) {
        List<File> listPolloi = this.f38050saneness.polloi(str, new FilenameFilter() { // from class: spissatus.dern
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return marial.graveside(file, str2);
            }
        });
        Collections.sort(listPolloi, new Comparator() { // from class: spissatus.wireman
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return marial.dovishness((File) obj, (File) obj2);
            }
        });
        return beachfront(listPolloi, i);
    }
}
