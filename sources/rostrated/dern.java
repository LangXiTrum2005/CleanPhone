package rostrated;

import android.text.TextUtils;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class dern implements bohunk.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f36800attabal = "video_reward_full";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f36806saneness = "video_brand";

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f36803dern = "video_splash";

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String f36808wireman = "video_default";

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f36805marial = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public String f36801beachfront = null;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public String f36802competently = null;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public String f36804impromptu = null;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public String f36807taiyuan = null;

    public static class attabal implements Comparator<File> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file2.lastModified() - file.lastModified();
            if (jLastModified == 0) {
                return 0;
            }
            return jLastModified < 0 ? -1 : 1;
        }
    }

    public static void wireman(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new attabal());
                    while (i < listAsList.size()) {
                        File file = (File) listAsList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // bohunk.attabal
    public long attabal(ik ikVar) {
        if (TextUtils.isEmpty(ikVar.fi()) || TextUtils.isEmpty(ikVar.bu())) {
            return 0L;
        }
        return benzoyl.attabal.dern(ikVar.fi(), ikVar.bu());
    }

    public String dern() {
        if (this.f36802competently == null) {
            this.f36802competently = this.f36805marial + File.separator + this.f36806saneness;
            File file = new File(this.f36802competently);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f36802competently;
    }

    @Override // bohunk.attabal
    public String ik() {
        if (this.f36807taiyuan == null) {
            this.f36807taiyuan = this.f36805marial + File.separator + this.f36808wireman;
            File file = new File(this.f36807taiyuan);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f36807taiyuan;
    }

    @Override // bohunk.attabal
    public synchronized void ka() {
        try {
            Set<String> setMarial = null;
            for (bohunk.saneness sanenessVar : saneness()) {
                File[] fileArrSaneness = sanenessVar.saneness();
                if (fileArrSaneness != null && fileArrSaneness.length >= sanenessVar.attabal()) {
                    if (setMarial == null) {
                        setMarial = marial();
                    }
                    int iAttabal = sanenessVar.attabal() - 2;
                    if (iAttabal < 0) {
                        iAttabal = 0;
                    }
                    wireman(sanenessVar.saneness(), iAttabal, setMarial);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // bohunk.attabal
    public String lr() {
        if (this.f36804impromptu == null) {
            this.f36804impromptu = this.f36805marial + File.separator + this.f36803dern;
            File file = new File(this.f36804impromptu);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f36804impromptu;
    }

    public final Set<String> marial() {
        HashSet hashSet = new HashSet();
        for (beccafico.attabal attabalVar : beccafico.attabal.f15028molybdenite.values()) {
            if (attabalVar != null && attabalVar.saneness() != null) {
                ik ikVarSaneness = attabalVar.saneness();
                hashSet.add(benzoyl.attabal.saneness(ikVarSaneness.fi(), ikVarSaneness.bu()).getAbsolutePath());
                hashSet.add(benzoyl.attabal.attabal(ikVarSaneness.fi(), ikVarSaneness.bu()).getAbsolutePath());
            }
        }
        for (sanskrit.saneness sanenessVar : sanskrit.attabal.f37369attabal.values()) {
            if (sanenessVar != null && sanenessVar.apical() != null) {
                ik ikVarApical = sanenessVar.apical();
                hashSet.add(benzoyl.attabal.saneness(ikVarApical.fi(), ikVarApical.bu()).getAbsolutePath());
                hashSet.add(benzoyl.attabal.attabal(ikVarApical.fi(), ikVarApical.bu()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    @Override // bohunk.attabal
    public void ri(String str) {
        this.f36805marial = str;
    }

    public final List<bohunk.saneness> saneness() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bohunk.saneness(new File(ri()).listFiles(), phytopathogen.attabal.dern()));
        arrayList.add(new bohunk.saneness(new File(lr()).listFiles(), phytopathogen.attabal.marial()));
        arrayList.add(new bohunk.saneness(new File(dern()).listFiles(), phytopathogen.attabal.wireman()));
        arrayList.add(new bohunk.saneness(new File(ik()).listFiles(), phytopathogen.attabal.saneness()));
        return arrayList;
    }

    @Override // bohunk.attabal
    public String ri() {
        if (this.f36801beachfront == null) {
            this.f36801beachfront = this.f36805marial + File.separator + this.f36800attabal;
            File file = new File(this.f36801beachfront);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f36801beachfront;
    }

    @Override // bohunk.attabal
    public boolean ri(ik ikVar) {
        if (TextUtils.isEmpty(ikVar.fi()) || TextUtils.isEmpty(ikVar.bu())) {
            return false;
        }
        return new File(ikVar.fi(), ikVar.bu()).exists();
    }
}
